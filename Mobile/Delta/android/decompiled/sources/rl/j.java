package rl;

import android.content.Context;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.roblox.universalapp.account.JNIAccountProtocol;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Optional<sd.c> f29874a;
    public Optional<sd.c.InterfaceC0543c> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f29875a = new j();
    }

    public static j j() {
        return a.f29875a;
    }

    public mm.l e(JSONObject jSONObject) {
        String string;
        long j10;
        boolean z10;
        mm.l lVar = new mm.l();
        m mVar = m.TOKEN_PROVIDER_UNINITIALIZED;
        String strA = "";
        if (th.h.a().S2()) {
            try {
                z10 = jSONObject.getBoolean("refreshTokenProvider");
            } catch (JSONException e10) {
                Log.d("DeviceIntegrityManager", "JSON exception on retrieving refreshTokenProvider key: " + e10.toString());
                z10 = false;
            }
            if (z10 && this.f29874a.isPresent()) {
                Log.d("DeviceIntegrityManager", "Refreshing token provider");
                this.f29874a.get().a(sd.c.a.c().b(56711522248L).a()).g(new sb.g() { // from class: rl.h
                    @Override // sb.g
                    public final void onSuccess(Object obj) {
                        this.f29873a.g((sd.c.InterfaceC0543c) obj);
                    }
                }).e(new sb.f() { // from class: rl.i
                    @Override // sb.f
                    public final void onFailure(Exception exc) {
                        Log.e("DeviceIntegrityManager", "Failed to re-set token provider " + exc.getMessage());
                    }
                });
                lVar.f24430a = l.a("", m.REFRESHED_TOKEN_PROVIDER);
                return lVar;
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
            lVar.f24430a = l.a("", m.INVALID_NONCE);
            return lVar;
        }
        if (this.b.isPresent()) {
            try {
                strA = ((sd.c.b) sb.m.b(this.b.get().a(sd.c.d.a().b(string).a()), j10, TimeUnit.MILLISECONDS)).a();
                mVar = m.RECEIVED;
            } catch (InterruptedException e13) {
                Log.e("DeviceIntegrityManager", "Integrity request interrupted: " + e13.toString());
                mVar = m.INTERRUPTED;
            } catch (ExecutionException e14) {
                Log.e("DeviceIntegrityManager", "Exception during integrity token retrieval: " + e14.toString());
                mVar = m.EXCEPTION;
            } catch (TimeoutException e15) {
                Log.e("DeviceIntegrityManager", "Integrity request timed out: " + e15.toString());
                mVar = m.REQUEST_TIMEOUT;
            }
        }
        lVar.f24430a = l.a(strA, mVar);
        return lVar;
    }

    public boolean f() {
        return true;
    }

    public final /* synthetic */ void g(sd.c.InterfaceC0543c interfaceC0543c) {
        Log.d("DeviceIntegrityManager", "Successfully re-set integrity token provider");
        this.b = Optional.of(interfaceC0543c);
    }

    public final /* synthetic */ void h(sd.c.InterfaceC0543c interfaceC0543c) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.b = Optional.of(interfaceC0543c);
    }

    public synchronized void i(Context context) {
        sd.c cVarA;
        if (this.b.isPresent()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
            return;
        }
        if (th.h.a().S2()) {
            if (e.a(this.f29874a)) {
                this.f29874a = Optional.of(IntegrityManagerFactory.a(context.getApplicationContext()));
            }
            cVarA = this.f29874a.get();
        } else {
            cVarA = IntegrityManagerFactory.a(context.getApplicationContext());
        }
        cVarA.a(sd.c.a.c().b(56711522248L).a()).g(new sb.g() { // from class: rl.f
            @Override // sb.g
            public final void onSuccess(Object obj) {
                this.f29872a.h((sd.c.InterfaceC0543c) obj);
            }
        }).e(new sb.f() { // from class: rl.g
            @Override // sb.f
            public final void onFailure(Exception exc) {
                Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
            }
        });
    }

    public j() {
        this.f29874a = Optional.empty();
        this.b = Optional.empty();
    }
}
