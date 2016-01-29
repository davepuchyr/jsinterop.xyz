package xyz.jsinterop.client.dom;

import jsinterop.annotations.JsPackage;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLLIElement extends HTMLElement {
	@JsProperty
	public abstract String getType();

	@JsProperty
	public abstract void setType(final String value);

	/**
	 * Sets or retrieves the value of a list item.
	 */
	@JsProperty
	public abstract double getValue();

	/**
	 * Sets or retrieves the value of a list item.
	 */
	@JsProperty
	public abstract void setValue(final double value);
}
