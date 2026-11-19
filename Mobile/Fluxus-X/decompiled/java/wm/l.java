package wm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f35919a = "l";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f35920a = new l();
    }

    public interface b {
        void onFailure(String str);

        void onSuccess();
    }

    public static /* synthetic */ void a(b bVar, Exception exc) {
        Log.i(f35919a, "SignInClient not available: " + exc.toString());
        bVar.onFailure("google_auth_api_not_available");
    }

    public static /* synthetic */ void b(g.d dVar, b bVar, PendingIntent pendingIntent) {
        try {
            dVar.b(new g.i.a(pendingIntent.getIntentSender()).a());
        } catch (Exception e10) {
            Log.e(f35919a, "Error occurred in launching Activity result", e10);
            bVar.onFailure("google_auth_api_error");
        }
    }

    public static /* synthetic */ void d(b bVar, Exception exc) {
        Log.e("Failure occurred", "Failure getting phone number");
        bVar.onFailure("google_auth_api_error");
    }

    public static l f() {
        return a.f35920a;
    }

    public String e(@NonNull Context context, @NonNull Intent intent) {
        try {
            return a9.f.b(context.getApplicationContext()).p(intent);
        } catch (Exception e10) {
            Log.e(f35919a, "Phone Number Hint failed", e10);
            return BuildConfig.FLAVOR;
        }
    }

    public void g(@NonNull Context context, b bVar) {
        h(context, k9.e.o(), bVar);
    }

    public void h(@NonNull Context context, k9.e eVar, final b bVar) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            Log.i(f35919a, "Telephony is not available!");
            bVar.onFailure("telephony_not_available");
            return;
        }
        if (eVar.g(context) != 0) {
            Log.i(f35919a, "GooglePlayServices is not available!");
            bVar.onFailure("google_play_services_not_available");
            return;
        }
        try {
            eVar.l(a9.f.b(context.getApplicationContext()), new l9.i[0]).g(new tb.g() { // from class: wm.j
                @Override // tb.g
                public final void onSuccess(Object obj) {
                    bVar.onSuccess();
                }
            }).e(new tb.f() { // from class: wm.k
                @Override // tb.f
                public final void onFailure(Exception exc) {
                    l.a(bVar, exc);
                }
            });
        } catch (Exception e10) {
            Log.i(f35919a, "Error checking api availability: " + e10.toString());
            bVar.onFailure("google_auth_api_error");
        }
    }

    public void i(@NonNull Context context, @NonNull final g.d<g.i> dVar, final b bVar) {
        Log.d(f35919a, "Requesting phone number hint");
        a9.f.b(context.getApplicationContext()).d(a9.d.A3().a()).g(new tb.g() { // from class: wm.h
            @Override // tb.g
            public final void onSuccess(Object obj) {
                l.b(dVar, bVar, (PendingIntent) obj);
            }
        }).e(new tb.f() { // from class: wm.i
            @Override // tb.f
            public final void onFailure(Exception exc) {
                l.d(bVar, exc);
            }
        });
    }
}
