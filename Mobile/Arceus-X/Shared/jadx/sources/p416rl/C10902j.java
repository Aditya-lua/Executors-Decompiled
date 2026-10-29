package p416rl;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.roblox.universalapp.account.JNIAccountProtocol;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mm.C8595l;
import org.json.JSONException;
import org.json.JSONObject;
import sb.C11268m;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;
import td.InterfaceC11571c;
import th.C11659h;

/* JADX INFO: renamed from: rl.j */
/* JADX INFO: loaded from: classes2.dex */
public class C10902j {

    /* JADX INFO: renamed from: a */
    public Optional<InterfaceC11571c> f38657a;

    /* JADX INFO: renamed from: b */
    public Optional<InterfaceC11571c.c> f38658b;

    /* JADX INFO: renamed from: rl.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C10902j f38659a = new C10902j();
    }

    /* JADX INFO: renamed from: j */
    public static C10902j m41464j() {
        return a.f38659a;
    }

    /* JADX INFO: renamed from: e */
    public C8595l m41465e(JSONObject jSONObject) {
        String string;
        long j10;
        boolean z10;
        C8595l c8595l = new C8595l();
        EnumC10905m enumC10905m = EnumC10905m.TOKEN_PROVIDER_UNINITIALIZED;
        String strMo43248a = "";
        if (C11659h.m43403a().mo43573Y2()) {
            try {
                z10 = jSONObject.getBoolean("refreshTokenProvider");
            } catch (JSONException e10) {
                Log.d("DeviceIntegrityManager", "JSON exception on retrieving refreshTokenProvider key: " + e10.toString());
                z10 = false;
            }
            if (z10 && this.f38657a.isPresent()) {
                Log.d("DeviceIntegrityManager", "Refreshing token provider");
                this.f38657a.get().mo43242a(InterfaceC11571c.a.m43243c().mo43247b(56711522248L).mo43246a()).mo11893g(new InterfaceC11256g() { // from class: rl.h
                    @Override // sb.InterfaceC11256g
                    public final void onSuccess(Object obj) {
                        this.f38656a.m41467g((InterfaceC11571c.c) obj);
                    }
                }).mo11891e(new InterfaceC11254f() { // from class: rl.i
                    @Override // sb.InterfaceC11254f
                    public final void onFailure(Exception exc) {
                        Log.e("DeviceIntegrityManager", "Failed to re-set token provider " + exc.getMessage());
                    }
                });
                c8595l.f31556a = C10904l.m41471a("", EnumC10905m.REFRESHED_TOKEN_PROVIDER);
                return c8595l;
            }
        }
        try {
            string = jSONObject.getString(JNIAccountProtocol.getRequestHashKey());
            try {
                j10 = jSONObject.getLong(JNIAccountProtocol.getTimeoutKey());
            } catch (JSONException e11) {
                e = e11;
                Log.e("DeviceIntegrityManager", "JSON exception on retrieving integrity token: " + e.toString());
                j10 = 300;
            }
        } catch (JSONException e12) {
            e = e12;
            string = "";
        }
        if (string.equals("")) {
            c8595l.f31556a = C10904l.m41471a("", EnumC10905m.INVALID_NONCE);
            return c8595l;
        }
        if (this.f38658b.isPresent()) {
            try {
                strMo43248a = ((InterfaceC11571c.b) C11268m.m42332b(this.f38658b.get().mo43249a(InterfaceC11571c.d.m43250a().mo43252b(string).mo43251a()), j10, TimeUnit.MILLISECONDS)).mo43248a();
                enumC10905m = EnumC10905m.RECEIVED;
            } catch (InterruptedException e13) {
                Log.e("DeviceIntegrityManager", "Integrity request interrupted: " + e13.toString());
                enumC10905m = EnumC10905m.INTERRUPTED;
            } catch (ExecutionException e14) {
                Log.e("DeviceIntegrityManager", "Exception during integrity token retrieval: " + e14.toString());
                enumC10905m = EnumC10905m.EXCEPTION;
            } catch (TimeoutException e15) {
                Log.e("DeviceIntegrityManager", "Integrity request timed out: " + e15.toString());
                enumC10905m = EnumC10905m.REQUEST_TIMEOUT;
            }
        }
        c8595l.f31556a = C10904l.m41471a(strMo43248a, enumC10905m);
        return c8595l;
    }

    /* JADX INFO: renamed from: f */
    public boolean m41466f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m41467g(InterfaceC11571c.c cVar) {
        Log.d("DeviceIntegrityManager", "Successfully re-set integrity token provider");
        this.f38658b = Optional.of(cVar);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41468h(InterfaceC11571c.c cVar) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.f38658b = Optional.of(cVar);
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m41469i(Context context) {
        InterfaceC11571c interfaceC11571cM13346a;
        if (this.f38658b.isPresent()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
            return;
        }
        if (C11659h.m43403a().mo43573Y2()) {
            if (C10897e.m41459a(this.f38657a)) {
                this.f38657a = Optional.of(IntegrityManagerFactory.m13346a(context.getApplicationContext()));
            }
            interfaceC11571cM13346a = this.f38657a.get();
        } else {
            interfaceC11571cM13346a = IntegrityManagerFactory.m13346a(context.getApplicationContext());
        }
        interfaceC11571cM13346a.mo43242a(InterfaceC11571c.a.m43243c().mo43247b(56711522248L).mo43246a()).mo11893g(new InterfaceC11256g() { // from class: rl.f
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                this.f38655a.m41468h((InterfaceC11571c.c) obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: rl.g
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10902j() {
        this.f38657a = Optional.empty();
        this.f38658b = Optional.empty();
    }
}
