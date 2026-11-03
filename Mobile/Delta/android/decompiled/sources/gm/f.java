package gm;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import e.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f18580a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<g.c<IntentSenderRequest>> f18581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f18582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f18583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f18584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Connection f18585g;

    public class a implements l.b {
        public a() {
        }

        @Override // gm.l.b
        public void onFailure(String str) {
            LoggingProtocol.g("supportsGetSMSOTP_" + str);
            f.this.v("supportsGetSMSOTP", "support", false);
        }

        @Override // gm.l.b
        public void onSuccess() {
            f.this.v("supportsGetSMSOTP", "support", true);
        }
    }

    public class b implements l.b {
        public b() {
        }

        @Override // gm.l.b
        public void onFailure(String str) {
            LoggingProtocol.g("getPhoneNumber_" + str);
            f.this.u("getPhoneNumber");
        }

        @Override // gm.l.b
        public void onSuccess() {
        }
    }

    public class c implements l.b {
        public c() {
        }

        @Override // gm.l.b
        public void onFailure(String str) {
            LoggingProtocol.g("supportsGetPhoneNumber_" + str);
            f.this.v("supportsGetPhoneNumber", "support", false);
        }

        @Override // gm.l.b
        public void onSuccess() {
            f.this.v("supportsGetPhoneNumber", "support", true);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static f f18589a = new f(MessageBus.f());
    }

    public static f z() {
        return d.f18589a;
    }

    public void h(Context context, ol.e eVar) {
        if (context == null) {
            this.f18580a.m("IdentityProtocol", "getSMSOTP", new JSONObject(), 13, new HashMap());
        } else {
            eVar.a(context, "IdentityProtocol");
        }
    }

    public final /* synthetic */ void m(p pVar, ActivityResult activityResult) {
        r(pVar, activityResult.getData());
    }

    public void n(final p pVar) {
        Log.i("IdentityProtocol", "Registering activity result for IdentityProtocol.");
        this.f18581c = new WeakReference<>(pVar.h(new h.j(), new g.a() { // from class: gm.a
            @Override // g.a
            public final void a(Object obj) {
                this.f18575a.m(pVar, (ActivityResult) obj);
            }
        }));
    }

    public void o(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", str);
            this.f18580a.m("IdentityProtocol", "getSMSOTP", jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("IdentityProtocol", "JSON exception while handling supports get sms otp: " + e10.toString());
            u("getSMSOTP");
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(JSONObject jSONObject) {
        WeakReference<g.c<IntentSenderRequest>> weakReference;
        Log.d("IdentityProtocol", "onGetPhoneNumber: " + jSONObject.toString());
        if (this.b != null && (weakReference = this.f18581c) != null && weakReference.get() != null) {
            l.f().i(this.b, this.f18581c.get(), new b());
        } else {
            Log.e("IdentityProtocol", "Context or launcher is null while getting phone number!");
            x("");
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void i(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onGetSMSOTP: " + jSONObject.toString());
        h(this.b, new ol.e());
    }

    public void r(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        x(l.f().e(context, intent));
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void l(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetPhoneNumber: " + jSONObject.toString());
        if (this.b == null) {
            v("supportsGetPhoneNumber", "support", false);
        } else {
            l.f().g(this.b, new c());
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void j(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetSMSOTP: " + jSONObject.toString());
        if (this.b == null) {
            v("supportsGetSMSOTP", "support", false);
        } else {
            l.f().g(this.b, new a());
        }
    }

    public final void u(String str) {
        this.f18580a.m("IdentityProtocol", str, new JSONObject(), 13, new HashMap());
    }

    public final void v(String str, String str2, boolean z10) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, z10);
            str3 = str;
            try {
                this.f18580a.m("IdentityProtocol", str3, jSONObject, 0, new HashMap());
            } catch (JSONException e10) {
                e = e10;
                Log.e("IdentityProtocol", "JSON exception in " + str3 + ": " + e.toString());
                this.f18580a.m("IdentityProtocol", str3, new JSONObject(), 13, new HashMap());
            }
        } catch (JSONException e11) {
            e = e11;
            str3 = str;
        }
    }

    public void w(Context context) {
        this.b = context;
    }

    public void x(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", str);
                    this.f18580a.m("IdentityProtocol", "getPhoneNumber", jSONObject, 0, new HashMap());
                    return;
                }
            } catch (JSONException e10) {
                Log.e("IdentityProtocol", "Exception while handling get phone number request", e10);
            }
        }
        u("getPhoneNumber");
    }

    @Deprecated
    public void y(g.c<IntentSenderRequest> cVar) {
        this.f18581c = new WeakReference<>(cVar);
    }

    public f(MessageBus messageBus) {
        this.f18580a = messageBus;
        this.f18582d = messageBus.w("IdentityProtocol", "getSMSOTP", new Callback() { // from class: gm.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f18576a.i(jSONObject);
            }
        });
        this.f18583e = messageBus.w("IdentityProtocol", "supportsGetSMSOTP", new Callback() { // from class: gm.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f18577a.j(jSONObject);
            }
        });
        this.f18584f = messageBus.w("IdentityProtocol", "getPhoneNumber", new Callback() { // from class: gm.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f18578a.k(jSONObject);
            }
        });
        this.f18585g = messageBus.w("IdentityProtocol", "supportsGetPhoneNumber", new Callback() { // from class: gm.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f18579a.l(jSONObject);
            }
        });
    }
}
