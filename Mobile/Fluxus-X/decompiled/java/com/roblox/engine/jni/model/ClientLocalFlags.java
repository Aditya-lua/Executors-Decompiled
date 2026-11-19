package com.roblox.engine.jni.model;

import androidx.annotation.Keep;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class ClientLocalFlags {
    private JSONObject flags = new JSONObject();

    public void add(String str, String str2) {
        try {
            this.flags.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public JSONObject getAll() {
        return this.flags;
    }

    public boolean isEmpty() {
        return this.flags.length() == 0;
    }

    public int size() {
        return this.flags.length();
    }
}
