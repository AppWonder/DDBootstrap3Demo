package com.dd.bootstrap3.demo.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.components.ERXComponent;

public class ExampleComponents extends ERXComponent {
    
	public NSMutableDictionary<String, Object> exampleDict = new NSMutableDictionary<String, Object>();
	public boolean exampleSwitch;
	public NSArray<String> exampleSelections;
	public NSArray<String> exampleList = new NSArray<String>(new String[] {
			"First entry of many",
			"A second one",
			"Third entry is here",
			"Fourth one here",
			"I can write many more entries",
			"But I guess that enough",
			"For the very first time"
	});
	
	
	
	
	public ExampleComponents(WOContext context) {
        super(context);
    }
	
	public WOActionResults exampleAction() {
		return null;
	}
	
}