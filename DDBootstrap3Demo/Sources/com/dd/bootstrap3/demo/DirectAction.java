package com.dd.bootstrap3.demo;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

import er.extensions.appserver.ERXDirectAction;

import com.dd.bootstrap3.demo.components.Main;

public class DirectAction extends ERXDirectAction {
	public DirectAction(WORequest request) {
		super(request);
	}

	@Override
	public WOActionResults defaultAction() {
		return pageWithName(Main.class.getName());
	}
}
