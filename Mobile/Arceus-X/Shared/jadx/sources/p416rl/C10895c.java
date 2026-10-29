package p416rl;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.roblox.universalapp.messagebus.MessageBus;
import mm.C8595l;
import mm.InterfaceC8592i;
import org.json.JSONException;
import org.json.JSONObject;
import p311nm.C9494a;
import th.C11659h;

/* JADX INFO: renamed from: rl.c */
/* JADX INFO: loaded from: classes2.dex */
public class C10895c {

    /* JADX INFO: renamed from: a */
    public MessageBus f38652a;

    /* JADX INFO: renamed from: b */
    public C10908p f38653b;

    /* JADX INFO: renamed from: rl.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C10895c f38654a = new C10895c(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C8595l m41454a(JSONObject jSONObject) {
        C8595l c8595l = new C8595l();
        try {
            c8595l.f31556a.put(C9494a.m37404q(), true);
            return c8595l;
        } catch (JSONException e10) {
            Log.e("AccountProtocol", "Exception while handling DeviceIntegrityAvailable request: " + e10.toString());
            return c8595l;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C10895c m41456d() {
        return a.f38654a;
    }

    /* JADX INFO: renamed from: c */
    public void m41457c(Context context) {
        if (C11659h.m43403a().mo43429D3()) {
            this.f38653b.m41480h((Application) context.getApplicationContext());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10895c(MessageBus messageBus) {
        this.f38652a = messageBus;
        messageBus.m16026p(C9494a.m37402o(), C9494a.m37392e(), new InterfaceC8592i() { // from class: rl.a
            @Override // mm.InterfaceC8592i
            /* JADX INFO: renamed from: a */
            public final C8595l mo15880a(JSONObject jSONObject) {
                return C10895c.m41454a(jSONObject);
            }
        });
        messageBus.m16026p(C9494a.m37402o(), C9494a.m37398k(), new InterfaceC8592i() { // from class: rl.b
            @Override // mm.InterfaceC8592i
            /* JADX INFO: renamed from: a */
            public final C8595l mo15880a(JSONObject jSONObject) {
                return C10902j.m41464j().m41465e(jSONObject);
            }
        });
        if (C11659h.m43403a().mo43429D3()) {
            this.f38653b = new C10908p(messageBus);
        }
    }
}
