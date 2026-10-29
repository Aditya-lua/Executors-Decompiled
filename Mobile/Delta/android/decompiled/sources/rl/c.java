package rl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f29870a;
    public p b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static c f29871a = new c(MessageBus.f());
    }

    public static /* synthetic */ mm.l a(JSONObject jSONObject) {
        mm.l lVar = new mm.l();
        try {
            lVar.f24430a.put(nm.a.q(), true);
            return lVar;
        } catch (JSONException e10) {
            Log.e("AccountProtocol", "Exception while handling DeviceIntegrityAvailable request: " + e10.toString());
            return lVar;
        }
    }

    public static c d() {
        return a.f29871a;
    }

    public void c(Context context) {
        if (th.h.a().x3()) {
            this.b.h((Application) context.getApplicationContext());
        }
    }

    public c(MessageBus messageBus) {
        this.f29870a = messageBus;
        messageBus.p(nm.a.o(), nm.a.e(), new mm.i() { // from class: rl.a
            @Override // mm.i
            public final mm.l a(JSONObject jSONObject) {
                return c.a(jSONObject);
            }
        });
        messageBus.p(nm.a.o(), nm.a.k(), new mm.i() { // from class: rl.b
            @Override // mm.i
            public final mm.l a(JSONObject jSONObject) {
                return j.j().e(jSONObject);
            }
        });
        if (th.h.a().x3()) {
            this.b = new p(messageBus);
        }
    }
}
