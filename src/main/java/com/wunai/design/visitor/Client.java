package com.wunai.design.visitor;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Element> list = ObjectStruture.getList();
		for (Element e : list) {
			e.accept(new Visitor());
		}
	}
}
