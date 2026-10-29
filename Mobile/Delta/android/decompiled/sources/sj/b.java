package sj;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31145a;
    public Map<String, Long> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31146a = new b();
    }

    public static b a() {
        return a.f31146a;
    }

    public synchronized JSONObject b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (String str : this.b.keySet()) {
            try {
                jSONObject.put(str, this.b.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public b() {
        this.f31145a = false;
        this.b = new HashMap();
    }
}
