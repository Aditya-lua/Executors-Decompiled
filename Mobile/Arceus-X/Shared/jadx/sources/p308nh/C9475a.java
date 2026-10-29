package p308nh;

import android.content.Context;
import com.roblox.client.flags.C3187a;
import gh.C6098c;
import gh.C6099d;
import org.json.JSONObject;

/* JADX INFO: renamed from: nh.a */
/* JADX INFO: loaded from: classes2.dex */
public class C9475a {

    /* JADX INFO: renamed from: a */
    public final String f34083a = "configure_dev_settings";

    /* JADX INFO: renamed from: b */
    public final String f34084b = "config_json";

    /* JADX INFO: renamed from: c */
    public C6099d f34085c;

    /* JADX INFO: renamed from: d */
    public JSONObject f34086d;

    /* JADX INFO: renamed from: e */
    public Context f34087e;

    public C9475a(Context context) {
        this.f34087e = context;
        C6099d c6099d = new C6099d(context);
        this.f34085c = c6099d;
        C6098c c6098cM26996a = c6099d.m26996a(context);
        this.f34086d = c6098cM26996a != null ? c6098cM26996a.m26985i() : new JSONObject();
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m37329b(Context context) {
        if (context != null) {
            return new C9475a(context).m37332a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m37330c(JSONObject jSONObject, String str, C3187a c3187a) {
        String strM37331d = m37331d(str, c3187a);
        if (jSONObject.has(strM37331d)) {
            return strM37331d;
        }
        if (jSONObject.has(str)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m37331d(String str, C3187a c3187a) {
        if (c3187a instanceof C3187a.d) {
            return "FFlag" + str;
        }
        if (c3187a instanceof C3187a.f) {
            return "FInt" + str;
        }
        if (!(c3187a instanceof C3187a.g)) {
            return str;
        }
        return "FString" + str;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m37332a() {
        return this.f34086d;
    }
}
