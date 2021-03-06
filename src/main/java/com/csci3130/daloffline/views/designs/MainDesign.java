package com.csci3130.daloffline.views.designs;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import com.vaadin.v7.ui.Calendar;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class MainDesign extends VerticalLayout {
	protected Panel basePanel;
	protected VerticalLayout baseLayout;
	protected Label dalOffline;
	protected Panel navBarPanel;
	protected HorizontalLayout navBarLayout;
	protected HorizontalLayout leftNavBarButtons;
	protected Button courseListButton;
	protected Button profileButton;
	protected Button logoutButton;
	protected HorizontalSplitPanel contentSplitLayout;
	protected VerticalLayout contentSplitLeftLayout;
	protected Calendar schedule;
	protected VerticalLayout contentSplitRightLayout;
	protected Panel infoPanel;
	protected VerticalLayout infoLayout;
	protected TextArea infoArea;

	public MainDesign() {
		Design.read(this);
	}
}
