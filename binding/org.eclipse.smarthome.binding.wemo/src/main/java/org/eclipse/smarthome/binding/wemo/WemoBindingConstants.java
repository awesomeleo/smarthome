/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.wemo;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link WemoBinding} class defines common constants, which are 
 * used across the whole binding.
 * 
 * @author Hans-Jörg Merk - Initial contribution
 */
public class WemoBindingConstants {

    public static final String BINDING_ID = "wemo";
    
    // List of all Thing Type UIDs
    public final static ThingTypeUID WEMO_SOCKET_TYPE_UID = new ThingTypeUID(BINDING_ID, "socket");
    public final static ThingTypeUID WEMO_INSIGHT_TYPE_UID = new ThingTypeUID(BINDING_ID, "insight");
    public final static ThingTypeUID WEMO_LIGHTSWITCH_TYPE_UID = new ThingTypeUID(BINDING_ID, "lightswitch");

    // List of all Channel ids
    public final static String CHANNEL_STATE = "state";

    // List of thing configuration properties
	public static final String UDN = "udn";

}
