package nh;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26277a = "configure_dev_settings";
    public final String b = "config_json";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gh.d f26278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f26279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f26280e;

    public a(Context context) {
        this.f26280e = context;
        gh.d dVar = new gh.d(context);
        this.f26278c = dVar;
        gh.c cVarA = dVar.a(context);
        this.f26279d = cVarA != null ? cVarA.i() : new JSONObject();
    }

    public static JSONObject b(Context context) {
        if (context != null) {
            return new a(context).a();
        }
        return null;
    }

    public static String c(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        String strD = d(str, aVar);
        if (jSONObject.has(strD)) {
            return strD;
        }
        if (jSONObject.has(str)) {
            return str;
        }
        return null;
    }

    public static String d(String str, com.roblox.client.flags.a aVar) {
        if (aVar instanceof com.roblox.client.flags.a.d) {
            return "FFlag" + str;
        }
        if (aVar instanceof com.roblox.client.flags.a.f) {
            return "FInt" + str;
        }
        if (!(aVar instanceof com.roblox.client.flags.a.g)) {
            return str;
        }
        return "FString" + str;
    }

    public JSONObject a() {
        return this.f26279d;
    }
}
