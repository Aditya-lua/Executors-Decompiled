package hi;

import android.os.Bundle;
import com.roblox.client.shortcuts.PinShortcutHandler;
import ek.q;
import org.json.JSONObject;
import uh.k0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends rk.b {

    public class a implements rk.b.a {
        @Override // rk.b.a
        public void a(rk.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("request");
                if ("RequestGame".equals(jSONObjectOptJSONObject.optString("requestType"))) {
                    try {
                        k0 k0VarA = k0.a(Long.valueOf(Long.parseLong(jSONObjectOptJSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", k0.O(k0VarA));
                        ti.e.c().f(101, bundle);
                        aVar.a(true, null);
                        return;
                    } catch (NumberFormatException unused) {
                        q.k("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            q.k("rbx.hybrid", "launchGame request failed");
            aVar.a(false, null);
        }

        public a() {
        }
    }

    public e() {
        super("Game");
        d("launchGame", new a());
    }
}
