package ak;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f493a;
    public Map<String, Long> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f494a = new b();
    }

    public static b a() {
        return a.f494a;
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
        this.f493a = false;
        this.b = new HashMap();
    }
}
