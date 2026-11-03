package pl;

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
    public Optional<td.c> f28734a;
    public Optional<td.c.InterfaceC0578c> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f28735a = new j();
    }

    public static j j() {
        return a.f28735a;
    }

    public km.l e(JSONObject jSONObject) {
        String string;
        long j10;
        boolean z10;
        km.l lVar = new km.l();
        m mVar = m.TOKEN_PROVIDER_UNINITIALIZED;
        String strA = "";
        if (rh.h.a().d3()) {
            try {
                z10 = jSONObject.getBoolean("refreshTokenProvider");
            } catch (JSONException e10) {
                Log.d("DeviceIntegrityManager", "JSON exception on retrieving refreshTokenProvider key: " + e10.toString());
                z10 = false;
            }
            if (z10 && this.f28734a.isPresent()) {
                Log.d("DeviceIntegrityManager", "Refreshing token provider");
                this.f28734a.get().a(td.c.a.c().b(56711522248L).a()).g(new sb.g() { // from class: pl.h
                    @Override // sb.g
                    public final void onSuccess(Object obj) {
                        this.f28733a.g((td.c.InterfaceC0578c) obj);
                    }
                }).e(new sb.f() { // from class: pl.i
                    @Override // sb.f
                    public final void onFailure(Exception exc) {
                        Log.e("DeviceIntegrityManager", "Failed to re-set token provider " + exc.getMessage());
                    }
                });
                lVar.f22909a = l.a("", m.REFRESHED_TOKEN_PROVIDER);
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
            lVar.f22909a = l.a("", m.INVALID_NONCE);
            return lVar;
        }
        if (this.b.isPresent()) {
            try {
                strA = ((td.c.b) sb.m.b(this.b.get().a(td.c.d.a().b(string).a()), j10, TimeUnit.MILLISECONDS)).a();
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
        lVar.f22909a = l.a(strA, mVar);
        return lVar;
    }

    public boolean f() {
        return true;
    }

    public final /* synthetic */ void g(td.c.InterfaceC0578c interfaceC0578c) {
        Log.d("DeviceIntegrityManager", "Successfully re-set integrity token provider");
        this.b = Optional.of(interfaceC0578c);
    }

    public final /* synthetic */ void h(td.c.InterfaceC0578c interfaceC0578c) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.b = Optional.of(interfaceC0578c);
    }

    public synchronized void i(Context context) {
        td.c cVarA;
        if (this.b.isPresent()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
            return;
        }
        if (rh.h.a().d3()) {
            if (e.a(this.f28734a)) {
                this.f28734a = Optional.of(IntegrityManagerFactory.a(context.getApplicationContext()));
            }
            cVarA = this.f28734a.get();
        } else {
            cVarA = IntegrityManagerFactory.a(context.getApplicationContext());
        }
        cVarA.a(td.c.a.c().b(56711522248L).a()).g(new sb.g() { // from class: pl.f
            @Override // sb.g
            public final void onSuccess(Object obj) {
                this.f28732a.h((td.c.InterfaceC0578c) obj);
            }
        }).e(new sb.f() { // from class: pl.g
            @Override // sb.f
            public final void onFailure(Exception exc) {
                Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
            }
        });
    }

    public j() {
        this.f28734a = Optional.empty();
        this.b = Optional.empty();
    }
}
