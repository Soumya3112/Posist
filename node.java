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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childReferenceNodeId == null) ? 0 : childReferenceNodeId.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((genesisReferenceNodeId == null) ? 0 : genesisReferenceNodeId.hashCode());
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		result = prime * result + ((nodeNumber == null) ? 0 : nodeNumber.hashCode());
		result = prime * result + ((referenceNodeId == null) ? 0 : referenceNodeId.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (childReferenceNodeId == null) {
			if (other.childReferenceNodeId != null)
				return false;
		} else if (!childReferenceNodeId.equals(other.childReferenceNodeId))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (genesisReferenceNodeId == null) {
			if (other.genesisReferenceNodeId != null)
				return false;
		} else if (!genesisReferenceNodeId.equals(other.genesisReferenceNodeId))
			return false;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		if (nodeNumber == null) {
			if (other.nodeNumber != null)
				return false;
		} else if (!nodeNumber.equals(other.nodeNumber))
			return false;
		if (referenceNodeId == null) {
			if (other.referenceNodeId != null)
				return false;
		} else if (!referenceNodeId.equals(other.referenceNodeId))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}
	public Node(Date timestamp, String data, Integer nodeNumber, String nodeId, String referenceNodeId,
			String childReferenceNodeId, String genesisReferenceNodeId) {
		super();
		this.timestamp = timestamp;
		this.data = data;
		this.nodeNumber = nodeNumber;
		this.nodeId = nodeId;
		this.referenceNodeId = referenceNodeId;
		this.childReferenceNodeId = childReferenceNodeId;
		this.genesisReferenceNodeId = genesisReferenceNodeId;
		this.hash = String.valueOf(hashCode());
	}
}
