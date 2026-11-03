package pl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f28730a;
    public p b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f28731a = new c(MessageBus.f());
    }

    public static /* synthetic */ km.l a(JSONObject jSONObject) {
        km.l lVar = new km.l();
        try {
            lVar.f22909a.put(lm.a.q(), true);
            return lVar;
        } catch (JSONException e10) {
            Log.e("AccountProtocol", "Exception while handling DeviceIntegrityAvailable request: " + e10.toString());
            return lVar;
        }
    }

    public static c d() {
        return a.f28731a;
    }

    public void c(Context context) {
        if (rh.h.a().K3()) {
            this.b.h((Application) context.getApplicationContext());
        }
    }

    public c(MessageBus messageBus) {
        this.f28730a = messageBus;
        messageBus.p(lm.a.o(), lm.a.e(), new km.i() { // from class: pl.a
            @Override // km.i
            public final km.l a(JSONObject jSONObject) {
                return c.a(jSONObject);
            }
        });
        messageBus.p(lm.a.o(), lm.a.k(), new km.i() { // from class: pl.b
            @Override // km.i
            public final km.l a(JSONObject jSONObject) {
                return j.j().e(jSONObject);
            }
        });
        if (rh.h.a().K3()) {
            this.b = new p(messageBus);
        }
    }
}
