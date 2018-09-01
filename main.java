public Node createGenesisNode(Integer nodeNumber, String data) {
		String uuid = UUID.randomUUID().toString();
		Node genesisNode = new Node(new Date(), data, nodeNumber, uuid, null, null, uuid);
		return genesisNode;
	}
