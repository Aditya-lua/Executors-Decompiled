package im;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p088e.ActivityC4722p;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p154h.C6257j;
import p386ql.C10599e;

/* JADX INFO: renamed from: im.f */
/* JADX INFO: loaded from: classes2.dex */
public class C6826f {

    /* JADX INFO: renamed from: a */
    public MessageBus f26794a;

    /* JADX INFO: renamed from: b */
    public Context f26795b;

    /* JADX INFO: renamed from: c */
    public WeakReference<AbstractC5854c<IntentSenderRequest>> f26796c;

    /* JADX INFO: renamed from: d */
    public Connection f26797d;

    /* JADX INFO: renamed from: e */
    public Connection f26798e;

    /* JADX INFO: renamed from: f */
    public Connection f26799f;

    /* JADX INFO: renamed from: g */
    public Connection f26800g;

    /* JADX INFO: renamed from: im.f$a */
    public class a implements C6832l.b {
        public a() {
        }

        @Override // im.C6832l.b
        public void onFailure(String str) {
            LoggingProtocol.m15994g("supportsGetSMSOTP_" + str);
            C6826f.this.m29220v("supportsGetSMSOTP", "support", false);
        }

        @Override // im.C6832l.b
        public void onSuccess() {
            C6826f.this.m29220v("supportsGetSMSOTP", "support", true);
        }
    }

    /* JADX INFO: renamed from: im.f$b */
    public class b implements C6832l.b {
        public b() {
        }

        @Override // im.C6832l.b
        public void onFailure(String str) {
            LoggingProtocol.m15994g("getPhoneNumber_" + str);
            C6826f.this.m29219u("getPhoneNumber");
        }

        @Override // im.C6832l.b
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: im.f$c */
    public class c implements C6832l.b {
        public c() {
        }

        @Override // im.C6832l.b
        public void onFailure(String str) {
            LoggingProtocol.m15994g("supportsGetPhoneNumber_" + str);
            C6826f.this.m29220v("supportsGetPhoneNumber", "support", false);
        }

        @Override // im.C6832l.b
        public void onSuccess() {
            C6826f.this.m29220v("supportsGetPhoneNumber", "support", true);
        }
    }

    /* JADX INFO: renamed from: im.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static C6826f f26804a = new C6826f(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: z */
    public static C6826f m29205z() {
        return d.f26804a;
    }

    /* JADX INFO: renamed from: h */
    public void m29206h(Context context, C10599e c10599e) {
        if (context == null) {
            this.f26794a.m16025m("IdentityProtocol", "getSMSOTP", new JSONObject(), 13, new HashMap());
        } else {
            c10599e.m40629a(context, "IdentityProtocol");
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m29211m(ActivityC4722p activityC4722p, ActivityResult activityResult) {
        m29216r(activityC4722p, activityResult.getData());
    }

    /* JADX INFO: renamed from: n */
    public void m29212n(final ActivityC4722p activityC4722p) {
        Log.i("IdentityProtocol", "Registering activity result for IdentityProtocol.");
        this.f26796c = new WeakReference<>(activityC4722p.mo4671h(new C6257j(), new InterfaceC5852a() { // from class: im.a
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f26788a.m29211m(activityC4722p, (ActivityResult) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public void m29213o(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", str);
            this.f26794a.m16025m("IdentityProtocol", "getSMSOTP", jSONObject, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("IdentityProtocol", "JSON exception while handling supports get sms otp: " + e10.toString());
            m29219u("getSMSOTP");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: k(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m29209k(JSONObject jSONObject) {
        WeakReference<AbstractC5854c<IntentSenderRequest>> weakReference;
        Log.d("IdentityProtocol", "onGetPhoneNumber: " + jSONObject.toString());
        if (this.f26795b != null && (weakReference = this.f26796c) != null && weakReference.get() != null) {
            C6832l.m29229f().m29233i(this.f26795b, this.f26796c.get(), new b());
        } else {
            Log.e("IdentityProtocol", "Context or launcher is null while getting phone number!");
            m29222x("");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m29207i(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onGetSMSOTP: " + jSONObject.toString());
        m29206h(this.f26795b, new C10599e());
    }

    /* JADX INFO: renamed from: r */
    public void m29216r(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        m29222x(C6832l.m29229f().m29230e(context, intent));
    }

    /* JADX DEBUG: Method merged with bridge method: l(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m29210l(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetPhoneNumber: " + jSONObject.toString());
        if (this.f26795b == null) {
            m29220v("supportsGetPhoneNumber", "support", false);
        } else {
            C6832l.m29229f().m29231g(this.f26795b, new c());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: j(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void m29208j(JSONObject jSONObject) {
        Log.d("IdentityProtocol", "onSupportsGetSMSOTP: " + jSONObject.toString());
        if (this.f26795b == null) {
            m29220v("supportsGetSMSOTP", "support", false);
        } else {
            C6832l.m29229f().m29231g(this.f26795b, new a());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m29219u(String str) {
        this.f26794a.m16025m("IdentityProtocol", str, new JSONObject(), 13, new HashMap());
    }

    /* JADX INFO: renamed from: v */
    public final void m29220v(String str, String str2, boolean z10) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, z10);
            str3 = str;
            try {
                this.f26794a.m16025m("IdentityProtocol", str3, jSONObject, 0, new HashMap());
            } catch (JSONException e10) {
                e = e10;
                Log.e("IdentityProtocol", "JSON exception in " + str3 + ": " + e.toString());
                this.f26794a.m16025m("IdentityProtocol", str3, new JSONObject(), 13, new HashMap());
            }
        } catch (JSONException e11) {
            e = e11;
            str3 = str;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m29221w(Context context) {
        this.f26795b = context;
    }

    /* JADX INFO: renamed from: x */
    public void m29222x(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", str);
                    this.f26794a.m16025m("IdentityProtocol", "getPhoneNumber", jSONObject, 0, new HashMap());
                    return;
                }
            } catch (JSONException e10) {
                Log.e("IdentityProtocol", "Exception while handling get phone number request", e10);
            }
        }
        m29219u("getPhoneNumber");
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public void m29223y(AbstractC5854c<IntentSenderRequest> abstractC5854c) {
        this.f26796c = new WeakReference<>(abstractC5854c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6826f(MessageBus messageBus) {
        this.f26794a = messageBus;
        this.f26797d = messageBus.m16033w("IdentityProtocol", "getSMSOTP", new Callback() { // from class: im.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f26790a.m29207i(jSONObject);
            }
        });
        this.f26798e = messageBus.m16033w("IdentityProtocol", "supportsGetSMSOTP", new Callback() { // from class: im.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f26791a.m29208j(jSONObject);
            }
        });
        this.f26799f = messageBus.m16033w("IdentityProtocol", "getPhoneNumber", new Callback() { // from class: im.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f26792a.m29209k(jSONObject);
            }
        });
        this.f26800g = messageBus.m16033w("IdentityProtocol", "supportsGetPhoneNumber", new Callback() { // from class: im.e
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f26793a.m29210l(jSONObject);
            }
        });
    }
}
