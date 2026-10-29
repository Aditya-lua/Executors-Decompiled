package im;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f20537a = "l";

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f20538a = new l();
    }

    public interface b {
        void onFailure(String str);

        void onSuccess();
    }

    public static /* synthetic */ void a(b bVar, Exception exc) {
        Log.i(f20537a, "SignInClient not available: " + exc.toString());
        bVar.onFailure("google_auth_api_not_available");
    }

    public static /* synthetic */ void b(g.c cVar, b bVar, PendingIntent pendingIntent) {
        try {
            cVar.b(new IntentSenderRequest.a(pendingIntent.getIntentSender()).a());
        } catch (Exception e10) {
            Log.e(f20537a, "Error occurred in launching Activity result", e10);
            bVar.onFailure("google_auth_api_error");
        }
    }

    public static /* synthetic */ void d(b bVar, Exception exc) {
        Log.e("Failure occurred", "Failure getting phone number");
        bVar.onFailure("google_auth_api_error");
    }

    public static l f() {
        return a.f20538a;
    }

    public String e(@NonNull Context context, @NonNull Intent intent) {
        try {
            return z8.b.b(context.getApplicationContext()).o(intent);
        } catch (Exception e10) {
            Log.e(f20537a, "Phone Number Hint failed", e10);
            return "";
        }
    }

    public void g(@NonNull Context context, b bVar) {
        h(context, j9.c.o(), bVar);
    }

    public void h(@NonNull Context context, j9.c cVar, final b bVar) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            Log.i(f20537a, "Telephony is not available!");
            bVar.onFailure("telephony_not_available");
            return;
        }
        if (cVar.g(context) != 0) {
            Log.i(f20537a, "GooglePlayServices is not available!");
            bVar.onFailure("google_play_services_not_available");
            return;
        }
        try {
            cVar.l(z8.b.b(context.getApplicationContext()), new k9.g[0]).g(new sb.g() { // from class: im.j
                @Override // sb.g
                public final void onSuccess(Object obj) {
                    bVar.onSuccess();
                }
            }).e(new sb.f() { // from class: im.k
                @Override // sb.f
                public final void onFailure(Exception exc) {
                    l.a(bVar, exc);
                }
            });
        } catch (Exception e10) {
            Log.i(f20537a, "Error checking api availability: " + e10.toString());
            bVar.onFailure("google_auth_api_error");
        }
    }

    public void i(@NonNull Context context, @NonNull final g.c<IntentSenderRequest> cVar, final b bVar) {
        Log.d(f20537a, "Requesting phone number hint");
        z8.b.b(context.getApplicationContext()).q(GetPhoneNumberHintIntentRequest.v3().a()).g(new sb.g() { // from class: im.h
            @Override // sb.g
            public final void onSuccess(Object obj) {
                l.b(cVar, bVar, (PendingIntent) obj);
            }
        }).e(new sb.f() { // from class: im.i
            @Override // sb.f
            public final void onFailure(Exception exc) {
                l.d(bVar, exc);
            }
        });
    }
}
