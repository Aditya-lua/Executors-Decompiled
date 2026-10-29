package p221ji;

import android.os.Bundle;
import com.roblox.client.shortcuts.PinShortcutHandler;
import org.json.JSONObject;
import p151gk.C6124q;
import p517wh.C12442j0;
import tk.AbstractC11666a;
import tk.C11667b;
import vi.C12214e;

/* JADX INFO: renamed from: ji.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7162e extends C11667b {

    /* JADX INFO: renamed from: ji.e$a */
    public class a implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            JSONObject jSONObjectM43816f = abstractC11666a.m43816f();
            if (jSONObjectM43816f != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectM43816f.optJSONObject("request");
                if ("RequestGame".equals(jSONObjectOptJSONObject.optString("requestType"))) {
                    try {
                        C12442j0 c12442j0M46628a = C12442j0.m46628a(Long.valueOf(Long.parseLong(jSONObjectOptJSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", C12442j0.m46627O(c12442j0M46628a));
                        C12214e.m45220c().m45224f(101, bundle);
                        abstractC11666a.mo43811a(true, null);
                        return;
                    } catch (NumberFormatException unused) {
                        C6124q.m27066k("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            C6124q.m27066k("rbx.hybrid", "launchGame request failed");
            abstractC11666a.mo43811a(false, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    public C7162e() {
        super("Game");
        m43823d("launchGame", new a());
    }
}
