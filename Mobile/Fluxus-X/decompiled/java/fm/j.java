package fm;

import android.content.Context;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.roblox.universalapp.account.JNIAccountProtocol;
import com.roblox.universalapp.messagebus.Response;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Optional<vd.c> f16158a;
    public Optional<vd.c.InterfaceC0700c> b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f16159a = new j();
    }

    public static j j() {
        return a.f16159a;
    }

    public Response e(JSONObject jSONObject) {
        String string;
        long j10;
        boolean z10;
        Response response = new Response();
        m mVar = m.TOKEN_PROVIDER_UNINITIALIZED;
        boolean zF3 = bi.h.a().f3();
        String strA = BuildConfig.FLAVOR;
        if (zF3) {
            try {
                z10 = jSONObject.getBoolean("refreshTokenProvider");
            } catch (JSONException e10) {
                Log.d("DeviceIntegrityManager", "JSON exception on retrieving refreshTokenProvider key: " + e10.toString());
                z10 = false;
            }
            if (z10 && this.f16158a.isPresent()) {
                Log.d("DeviceIntegrityManager", "Refreshing token provider");
                this.f16158a.get().a(vd.c.a.c().b(56711522248L).a()).g(new tb.g() { // from class: fm.h
                    @Override // tb.g
                    public final void onSuccess(Object obj) {
                        this.f16157a.g((vd.c.InterfaceC0700c) obj);
                    }
                }).e(new tb.f() { // from class: fm.i
                    @Override // tb.f
                    public final void onFailure(Exception exc) {
                        Log.e("DeviceIntegrityManager", "Failed to re-set token provider " + exc.getMessage());
                    }
                });
                response.params = l.a(BuildConfig.FLAVOR, m.REFRESHED_TOKEN_PROVIDER);
                return response;
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
            string = BuildConfig.FLAVOR;
        }
        if (string.equals(BuildConfig.FLAVOR)) {
            response.params = l.a(BuildConfig.FLAVOR, m.INVALID_NONCE);
            return response;
        }
        if (this.b.isPresent()) {
            try {
                strA = ((vd.c.b) tb.m.b(this.b.get().a(vd.c.d.a().b(string).a()), j10, TimeUnit.MILLISECONDS)).a();
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
        response.params = l.a(strA, mVar);
        return response;
    }

    public boolean f() {
        return true;
    }

    public final /* synthetic */ void g(vd.c.InterfaceC0700c interfaceC0700c) {
        Log.d("DeviceIntegrityManager", "Successfully re-set integrity token provider");
        this.b = Optional.of(interfaceC0700c);
    }

    public final /* synthetic */ void h(vd.c.InterfaceC0700c interfaceC0700c) {
        Log.d("DeviceIntegrityManager", "Successfully set integrity token provider");
        this.b = Optional.of(interfaceC0700c);
    }

    public synchronized void i(Context context) {
        vd.c cVarA;
        if (this.b.isPresent()) {
            Log.d("DeviceIntegrityManager", "Token provider already initialized");
            return;
        }
        if (bi.h.a().f3()) {
            if (e.a(this.f16158a)) {
                this.f16158a = Optional.of(IntegrityManagerFactory.a(context.getApplicationContext()));
            }
            cVarA = this.f16158a.get();
        } else {
            cVarA = IntegrityManagerFactory.a(context.getApplicationContext());
        }
        cVarA.a(vd.c.a.c().b(56711522248L).a()).g(new tb.g() { // from class: fm.f
            @Override // tb.g
            public final void onSuccess(Object obj) {
                this.f16156a.h((vd.c.InterfaceC0700c) obj);
            }
        }).e(new tb.f() { // from class: fm.g
            @Override // tb.f
            public final void onFailure(Exception exc) {
                Log.e("DeviceIntegrityManager", "Failed to set token provider " + exc.getMessage());
            }
        });
    }

    public j() {
        this.f16158a = Optional.empty();
        this.b = Optional.empty();
    }
}
