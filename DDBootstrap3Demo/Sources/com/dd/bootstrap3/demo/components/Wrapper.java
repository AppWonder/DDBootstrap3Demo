package com.dd.bootstrap3.demo.components;

import com.dd.bootstrap.components.BSComponent;
import com.webobjects.appserver.WOContext;

public class Wrapper extends BSComponent {
    
	public Wrapper(WOContext context) {
        super(context);
    }
    
    @Override
    public boolean synchronizesVariablesWithBindings() {
    	return false;
    }
}