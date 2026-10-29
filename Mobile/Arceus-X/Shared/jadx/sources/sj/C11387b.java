package sj;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: sj.b */
/* JADX INFO: loaded from: classes2.dex */
public class C11387b {

    /* JADX INFO: renamed from: a */
    public final boolean f40270a;

    /* JADX INFO: renamed from: b */
    public Map<String, Long> f40271b;

    /* JADX INFO: renamed from: sj.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C11387b f40272a = new C11387b();
    }

    /* JADX INFO: renamed from: a */
    public static C11387b m42707a() {
        return a.f40272a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized JSONObject m42708b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (String str : this.f40271b.keySet()) {
            try {
                jSONObject.put(str, this.f40271b.get(str));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11387b() {
        this.f40270a = false;
        this.f40271b = new HashMap();
    }
}
