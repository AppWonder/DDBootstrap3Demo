package com.dd.bootstrap3.demo.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;

import er.extensions.components.ERXComponent;

/**
 * Base component for examples. 
 * Serves as a data access container.
 * 
 * @author robin
 */
public class ExampleComponent extends ERXComponent {

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
	
	public ExampleComponent(WOContext context) {
		super(context);
	}

	public WOActionResults exampleAction() {
		return null;
	}
	
}
