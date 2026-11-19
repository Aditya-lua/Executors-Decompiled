package ri;

import android.os.Bundle;
import com.google.mlkit.common.MlKitException;
import com.roblox.client.shortcuts.PinShortcutHandler;
import ei.k0;
import ok.q;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e extends al.b {

    public class a implements al.b.a {
        @Override // al.b.a
        public void a(al.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                JSONObject jSONObjectOptJSONObject = jSONObjectF.optJSONObject("request");
                if ("RequestGame".equals(jSONObjectOptJSONObject.optString("requestType"))) {
                    try {
                        k0 k0VarA = k0.a(Long.valueOf(Long.parseLong(jSONObjectOptJSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID))), null, null, null, null, null, null, null, "WebView", null, null, null, null, null, null, null, null);
                        Bundle bundle = new Bundle();
                        bundle.putBundle("game_init_params", k0.O(k0VarA));
                        dj.e.c().f(MlKitException.NOT_ENOUGH_SPACE, bundle);
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
