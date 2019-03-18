package com.ruoyi.web.controller;

import java.util.Date;
import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Meetroom;
import com.ruoyi.system.service.IMeetroomService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 会议室 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-03-18
 */
@Controller
@RequestMapping("/system/meetroom")
public class MeetroomController extends BaseController
{
    private String prefix = "system/meetroom";
	
	@Autowired
	private IMeetroomService meetroomService;

	@RequiresPermissions("system:meetroom:view")
	@GetMapping()
	public String meetroom()
	{
	    return prefix + "/meetroom";
	}
	
	/**
	 * 查询会议室列表
	 */
	@RequiresPermissions("system:meetroom:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Meetroom meetroom)
	{
		startPage();
        List<Meetroom> list = meetroomService.selectMeetroomList(meetroom);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出会议室列表
	 */
	@RequiresPermissions("system:meetroom:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Meetroom meetroom)
    {
    	List<Meetroom> list = meetroomService.selectMeetroomList(meetroom);
        ExcelUtil<Meetroom> util = new ExcelUtil<Meetroom>(Meetroom.class);
        return util.exportExcel(list, "meetroom");
    }
	
	/**
	 * 新增会议室
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存会议室
	 */
	@RequiresPermissions("system:meetroom:add")
	@Log(title = "会议室", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Meetroom meetroom)
	{
		meetroom.setCreatedBy(ShiroUtils.getLoginName());
		meetroom.setCreatedTime(new Date());//new Date()当前时间
		meetroom.setUpdateBy(ShiroUtils.getLoginName());
		meetroom.setUpdatedTime(new Date());//
		return toAjax(meetroomService.insertMeetroom(meetroom));
	}

	/**
	 * 修改会议室
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Meetroom meetroom = meetroomService.selectMeetroomById(id);
		mmap.put("meetroom", meetroom);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存会议室
	 */
	@RequiresPermissions("system:meetroom:edit")
	@Log(title = "会议室", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Meetroom meetroom)
	{
		meetroom.setUpdateBy(ShiroUtils.getLoginName());
		meetroom.setUpdatedTime(new Date());//
		return toAjax(meetroomService.updateMeetroom(meetroom));
	}
	
	/**
	 * 删除会议室
	 */
	@RequiresPermissions("system:meetroom:remove")
	@Log(title = "会议室", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(meetroomService.deleteMeetroomByIds(ids));
	}
	
}
