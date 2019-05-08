package com.ruoyi.worktask.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 任务表 self_task
 * 
 * @author ruoyi
 * @date 2019-05-08
 */
public class SelfTask extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private String id;
	/** 任务标题 */
	private String taskTitle;
	/** 开始时间 */
	private Date startDate;
	/** 要求完成时间 */
	private Date requireTime;
	/** 任务类型 */
	private String selvalTaskType;
	/** 优先级0高1中2低 */
	private String priority;
	/** 任务描述 */
	private String taskContent;
	/** 任务执行人 */
	private String executorUser;
	/** 任务验收人 */
	private String acceptorUser;
	/** 任务进度 */
	private String taskProgress;
	/** 共享给 */
	private String isShare;
	/** 创建时间 */
	private Date createdTime;
	/** 修改人 */
	private String updateBy;
	/** 修改时间 */
	private Date updatedTime;
	/** 创建人 */
	private String createdBy;
	/** 备注 */
	private String remarks;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setTaskTitle(String taskTitle) 
	{
		this.taskTitle = taskTitle;
	}

	public String getTaskTitle() 
	{
		return taskTitle;
	}
	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}

	public Date getStartDate() 
	{
		return startDate;
	}
	public void setRequireTime(Date requireTime) 
	{
		this.requireTime = requireTime;
	}

	public Date getRequireTime() 
	{
		return requireTime;
	}
	public void setSelvalTaskType(String selvalTaskType) 
	{
		this.selvalTaskType = selvalTaskType;
	}

	public String getSelvalTaskType() 
	{
		return selvalTaskType;
	}
	public void setPriority(String priority) 
	{
		this.priority = priority;
	}

	public String getPriority() 
	{
		return priority;
	}
	public void setTaskContent(String taskContent) 
	{
		this.taskContent = taskContent;
	}

	public String getTaskContent() 
	{
		return taskContent;
	}
	public void setExecutorUser(String executorUser) 
	{
		this.executorUser = executorUser;
	}

	public String getExecutorUser() 
	{
		return executorUser;
	}
	public void setAcceptorUser(String acceptorUser) 
	{
		this.acceptorUser = acceptorUser;
	}

	public String getAcceptorUser() 
	{
		return acceptorUser;
	}
	public void setTaskProgress(String taskProgress) 
	{
		this.taskProgress = taskProgress;
	}

	public String getTaskProgress() 
	{
		return taskProgress;
	}
	public void setIsShare(String isShare) 
	{
		this.isShare = isShare;
	}

	public String getIsShare() 
	{
		return isShare;
	}
	public void setCreatedTime(Date createdTime) 
	{
		this.createdTime = createdTime;
	}

	public Date getCreatedTime() 
	{
		return createdTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdatedTime(Date updatedTime) 
	{
		this.updatedTime = updatedTime;
	}

	public Date getUpdatedTime() 
	{
		return updatedTime;
	}
	public void setCreatedBy(String createdBy) 
	{
		this.createdBy = createdBy;
	}

	public String getCreatedBy() 
	{
		return createdBy;
	}
	public void setRemarks(String remarks) 
	{
		this.remarks = remarks;
	}

	public String getRemarks() 
	{
		return remarks;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskTitle", getTaskTitle())
            .append("startDate", getStartDate())
            .append("requireTime", getRequireTime())
            .append("selvalTaskType", getSelvalTaskType())
            .append("priority", getPriority())
            .append("taskContent", getTaskContent())
            .append("executorUser", getExecutorUser())
            .append("acceptorUser", getAcceptorUser())
            .append("taskProgress", getTaskProgress())
            .append("isShare", getIsShare())
            .append("createdTime", getCreatedTime())
            .append("updateBy", getUpdateBy())
            .append("updatedTime", getUpdatedTime())
            .append("createdBy", getCreatedBy())
            .append("remarks", getRemarks())
            .toString();
    }
}