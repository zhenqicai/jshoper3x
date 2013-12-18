package com.jshop.entity;

// Generated 2013-12-14 18:15:33 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActRuEventSubscr generated by hbm2java
 */
@Entity
@Table(name = "act_ru_event_subscr", catalog = "jshoper3")
public class ActRuEventSubscr implements java.io.Serializable {

	private String id;
	private ActRuExecution actRuExecution;
	private Integer rev;
	private String eventType;
	private String eventName;
	private String procInstId;
	private String activityId;
	private String configuration;
	private Date created;

	public ActRuEventSubscr() {
	}

	public ActRuEventSubscr(String id, String eventType, Date created) {
		this.id = id;
		this.eventType = eventType;
		this.created = created;
	}

	public ActRuEventSubscr(String id, ActRuExecution actRuExecution,
			Integer rev, String eventType, String eventName, String procInstId,
			String activityId, String configuration, Date created) {
		this.id = id;
		this.actRuExecution = actRuExecution;
		this.rev = rev;
		this.eventType = eventType;
		this.eventName = eventName;
		this.procInstId = procInstId;
		this.activityId = activityId;
		this.configuration = configuration;
		this.created = created;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXECUTION_ID_")
	public ActRuExecution getActRuExecution() {
		return this.actRuExecution;
	}

	public void setActRuExecution(ActRuExecution actRuExecution) {
		this.actRuExecution = actRuExecution;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "EVENT_TYPE_", nullable = false)
	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Column(name = "EVENT_NAME_")
	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "ACTIVITY_ID_", length = 64)
	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	@Column(name = "CONFIGURATION_")
	public String getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_", nullable = false, length = 0)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
