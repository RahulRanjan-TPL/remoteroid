/*
 * Remoteroid - A remote control solution for Android platform, including handy file transfer and notify-to-PC.
 * Copyright (C) 2012 Taeho Kim(jyte82@gmail.com), Hyomin Oh(ohmnia1112@gmail.com), Hongkyun Kim(godgjdgjd@nate.com), Yongwan Hwang(singerhwang@gmail.com)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/

package org.secmem.remoteroid.intent;

/**
 * A class represents action, category, extras related to Intent.
 * @author Taeho Kim
 *
 */
public final class RemoteroidIntent {
	/**
	 * An action used for PendingIntent to notify user about SMS has been sent successful or not.<div/>
	 * <strong>Extras:</strong><br/>
	 * {@link RemoteroidIntent#EXTRA_PHONE_NUMBER}
	 */
	public static final String ACTION_SMS_SENT = "org.secmem.remoteroid.intent.action.SMS_SENT";
	
	/**
	 * An action that successfully connected to server. (Broadcast)
	 */
	public static final String ACTION_CONNECTED = "org.secmem.remoteroid.intent.action.CONNECTED";
	
	/**
	 * An action that a client has disconnected from server.
	 */
	public static final String ACTION_DISCONNECTED = "org.secmem.remoteroid.intent.action.DISCONNECTED";
	
	/**
	 * An action that there connection was interrupted by some reason.
	 */
	public static final String ACTION_INTERRUPTED = "org.secmem.remoteroid.intent.action.INTERRUPTED";
	
	/**
	 * Key for extra data contains phone number.
	 * @see RemoteroidIntent#ACTION_SMS_SENT
	 */
	public static final String EXTRA_PHONE_NUMBER = "org.secmem.remoteroid.intent.extra.PHONE_NUMBER";
}
