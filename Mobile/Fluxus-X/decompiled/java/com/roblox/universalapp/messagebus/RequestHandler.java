package com.roblox.universalapp.messagebus;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestHandler {
    Response run(JSONObject jSONObject);
}
