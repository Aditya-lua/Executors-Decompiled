package ji;

import android.os.Bundle;
import com.roblox.client.shortcuts.PinShortcutHandler;
import org.json.JSONObject;
import wh.j0;

/* JADX INFO: loaded from: classes2.dex */
public class e extends tk.b {

    public class a implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("request");
                if ("RequestGame".equals(jSONObjectOptJSONObject.optString("requestType"))) {
                    try {
                        j0 j0VarA = j0.a(Long.valueOf(Long.parseLong(jSONObjectOptJSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", j0.O(j0VarA));
                        vi.e.c().f(101, bundle);
                        aVar.a(true, null);
                        return;
                    } catch (NumberFormatException unused) {
                        gk.p.k("rbx.hybrid", "Unsupported launchGame request");
                    }
                }
            }
            gk.p.k("rbx.hybrid", "launchGame request failed");
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
