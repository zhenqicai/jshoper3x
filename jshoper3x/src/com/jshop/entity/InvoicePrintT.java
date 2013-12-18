package com.jshop.entity;

// Generated 2013-12-14 18:15:33 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InvoicePrintT generated by hbm2java
 */
@Entity
@Table(name = "invoice_print_t", catalog = "jshoper3")
public class InvoicePrintT implements java.io.Serializable {

	private String invoiceprintid;
	private Date invoiceprinttime;
	private String name;
	private String orderid;
	private String shippingaddressid;
	private String state;
	private String logisticsid;
	private String logisticsnumber;
	private String invoicenumber;
	private String operatorname;
	private String ordername;

	public InvoicePrintT() {
	}

	public InvoicePrintT(String invoiceprintid, Date invoiceprinttime,
			String name, String orderid, String shippingaddressid,
			String state, String logisticsid, String operatorname,
			String ordername) {
		this.invoiceprintid = invoiceprintid;
		this.invoiceprinttime = invoiceprinttime;
		this.name = name;
		this.orderid = orderid;
		this.shippingaddressid = shippingaddressid;
		this.state = state;
		this.logisticsid = logisticsid;
		this.operatorname = operatorname;
		this.ordername = ordername;
	}

	public InvoicePrintT(String invoiceprintid, Date invoiceprinttime,
			String name, String orderid, String shippingaddressid,
			String state, String logisticsid, String logisticsnumber,
			String invoicenumber, String operatorname, String ordername) {
		this.invoiceprintid = invoiceprintid;
		this.invoiceprinttime = invoiceprinttime;
		this.name = name;
		this.orderid = orderid;
		this.shippingaddressid = shippingaddressid;
		this.state = state;
		this.logisticsid = logisticsid;
		this.logisticsnumber = logisticsnumber;
		this.invoicenumber = invoicenumber;
		this.operatorname = operatorname;
		this.ordername = ordername;
	}

	@Id
	@Column(name = "INVOICEPRINTID", unique = true, nullable = false, length = 20)
	public String getInvoiceprintid() {
		return this.invoiceprintid;
	}

	public void setInvoiceprintid(String invoiceprintid) {
		this.invoiceprintid = invoiceprintid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INVOICEPRINTTIME", nullable = false, length = 0)
	public Date getInvoiceprinttime() {
		return this.invoiceprinttime;
	}

	public void setInvoiceprinttime(Date invoiceprinttime) {
		this.invoiceprinttime = invoiceprinttime;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ORDERID", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "SHIPPINGADDRESSID", nullable = false, length = 20)
	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "LOGISTICSID", nullable = false, length = 20)
	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	@Column(name = "LOGISTICSNUMBER", length = 45)
	public String getLogisticsnumber() {
		return this.logisticsnumber;
	}

	public void setLogisticsnumber(String logisticsnumber) {
		this.logisticsnumber = logisticsnumber;
	}

	@Column(name = "INVOICENUMBER", length = 45)
	public String getInvoicenumber() {
		return this.invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	@Column(name = "OPERATORNAME", nullable = false, length = 45)
	public String getOperatorname() {
		return this.operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	@Column(name = "ORDERNAME", nullable = false, length = 1000)
	public String getOrdername() {
		return this.ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

}
