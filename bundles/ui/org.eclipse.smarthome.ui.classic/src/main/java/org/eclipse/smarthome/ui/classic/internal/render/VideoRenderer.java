/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.ui.classic.internal.render;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.smarthome.ui.classic.render.RenderException;
import org.eclipse.smarthome.ui.classic.render.WidgetRenderer;
import org.eclipse.smarthome.model.sitemap.Video;
import org.eclipse.smarthome.model.sitemap.Widget;

/**
 * This is an implementation of the {@link WidgetRenderer} interface, which
 * can produce HTML code for Video widgets.
 * 
 * @author Kai Kreuzer - Initial contribution and API
 *
 */
public class VideoRenderer extends AbstractWidgetRenderer {
	
	/**
	 * {@inheritDoc}
	 */
	public boolean canRender(Widget w) {
		return w instanceof Video;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public EList<Widget> renderWidget(Widget w, StringBuilder sb) throws RenderException {
		String snippet = getSnippet("video");			

		String widgetId = itemUIRegistry.getWidgetId(w);		
		String sitemap = w.eResource().getURI().path();
		
		String url = "proxy?sitemap=" + sitemap + "&widgetId=" + widgetId;
		snippet = StringUtils.replace(snippet, "%url%", url);
		
		sb.append(snippet);
		return null;
	}
}
