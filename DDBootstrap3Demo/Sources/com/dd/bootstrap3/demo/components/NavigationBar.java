package com.dd.bootstrap3.demo.components;

import com.dd.bootstrap.components.BSComponent;
import com.dd.bootstrap.components.BSNavigationBar;
import com.dd.bootstrap.components.BSNavigationBar.Item;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORedirect;
import com.webobjects.foundation.NSArray;

public class NavigationBar extends BSComponent implements BSNavigationBar.Delegate {
	
	public BSNavigationBar.Delegate navigationBarDelegate;
	public BSNavigationBar.Item selectedNavigationItem;
	public BSNavigationBar.Item currentNavigationItem;
	public BSNavigationBar.Item defaultItem;
	
	private NSArray<BSNavigationBar.Item> navigationItems;
	
	public NavigationBar(WOContext context) {
        super(context);
        
        navigationBarDelegate = this;
        defaultItem = new BSNavigationBar.Item("DDBootstrap3 Demo") {
        	@Override
        	public WOActionResults action(WOContext context) {
        		selectedNavigationItem = null;
        		WORedirect r = new WORedirect(context());
        		r.setUrl(context.directActionURLForActionNamed("default", null));
        		return r;
        		
        		//return EditorPortal.this;
        	}
        };
    }
	
	public NSArray<BSNavigationBar.Item> navigationItems() {
		if (navigationItems != null) return navigationItems;
		
		BSNavigationBar.Item navExamples = new BSNavigationBar.Item("Examples");
		BSNavigationBar.Item navComponents = new BSNavigationBar.Item("Components") {
			@Override
			public WOActionResults action(WOContext context) {
				return pageWithName(ExampleComponents.class, context);
			}
		};
		navComponents.tag = ExampleComponents.class;
		navExamples.childItems.add(navComponents);
		
		navigationItems = new NSArray<BSNavigationBar.Item>(new BSNavigationBar.Item[] {
				navExamples
		});
		
		return navigationItems;
	}
	
	@Override
	public boolean navigationBarItemIsSelected(BSNavigationBar navigationBar, Item item) {
		WOComponent parent = parent().parent(); // depends on implementation where BSNavigationBar is embedded
		if (item.hasChildItems()) {
			for (Item childItem : item.childItems) {
				if (childItem.tag == parent.getClass()) {
					return true;
				}
			}
		}
		return item.tag == parent.getClass();
	}
	
	@Override
	public WOActionResults navigationBarItemOnSelect(BSNavigationBar navigationBar, Item item) {
		return null;
	}
}