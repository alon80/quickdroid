package vu.de.urpool.quickdroid;

/*
 * Copyright (C) 2009 Daniel Himmelein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.graphics.drawable.Drawable;

public class Launchable {
	private Launcher mLauncher;
	private int mId;
	private String mLabel;
	private String mInfoText;
	
	public Launchable(Launcher launcher, int id, String label) {
		mLauncher = launcher;
		mId = id;
		mLabel = label;
	}
	
	public Launchable(Launcher launcher, int id, String label, String infoText) {
		mLauncher = launcher;
		mId = id;
		mLabel = label;
		mInfoText = infoText;
	}
	
	public Launcher getLauncher() {
		return mLauncher;
	}
	
	public int getId() {
		return mId;
	}
	
	public String getLabel() {
		return mLabel;
	}
	
	public String getInfoText() {
		return mInfoText;
	}
	
	public Drawable getThumbnail() {
		return null;
	}
	
	public boolean activate() {
		return mLauncher.activate(this);
	}
	
	public void deactivate() {
		mLauncher.deactivate(this);
	}
}