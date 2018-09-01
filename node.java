# Posist
package com.domain;

import java.util.Date;

public class Node {
	
	private Date timestamp;
	private String data;
	private Integer nodeNumber;
	private String nodeId;
	private String referenceNodeId;
	private String childReferenceNodeId;
	private String genesisReferenceNodeId;
	private String hash;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Integer getNodeNumber() {
		return nodeNumber;
	}
	public void setNodeNumber(Integer nodeNumber) {
		this.nodeNumber = nodeNumber;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getReferenceNodeId() {
		return referenceNodeId;
	}
	public void setReferenceNodeId(String referenceNodeId) {
		this.referenceNodeId = referenceNodeId;
	}
	public String getChildReferenceNodeId() {
		return childReferenceNodeId;
	}
	public void setChildReferenceNodeId(String childReferenceNodeId) {
		this.childReferenceNodeId = childReferenceNodeId;
	}
	public String getGenesisReferenceNodeId() {
		return genesisReferenceNodeId;
	}
	public void setGenesisReferenceNodeId(String genesisReferenceNodeId) {
		this.genesisReferenceNodeId = genesisReferenceNodeId;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	


}
