package im;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import p139g.AbstractC5854c;
import p213j9.C7089c;
import p242k9.InterfaceC7497g;
import p598z8.C13738b;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;

/* JADX INFO: renamed from: im.l */
/* JADX INFO: loaded from: classes2.dex */
public class C6832l {

    /* JADX INFO: renamed from: a */
    public static String f26810a = "l";

    /* JADX INFO: renamed from: im.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C6832l f26811a = new C6832l();
    }

    /* JADX INFO: renamed from: im.l$b */
    public interface b {
        void onFailure(String str);

        void onSuccess();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m29225a(b bVar, Exception exc) {
        Log.i(f26810a, "SignInClient not available: " + exc.toString());
        bVar.onFailure("google_auth_api_not_available");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m29226b(AbstractC5854c abstractC5854c, b bVar, PendingIntent pendingIntent) {
        try {
            abstractC5854c.m26240b(new IntentSenderRequest.C0401a(pendingIntent.getIntentSender()).m1474a());
        } catch (Exception e10) {
            Log.e(f26810a, "Error occurred in launching Activity result", e10);
            bVar.onFailure("google_auth_api_error");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m29228d(b bVar, Exception exc) {
        Log.e("Failure occurred", "Failure getting phone number");
        bVar.onFailure("google_auth_api_error");
    }

    /* JADX INFO: renamed from: f */
    public static C6832l m29229f() {
        return a.f26811a;
    }

    /* JADX INFO: renamed from: e */
    public String m29230e(@NonNull Context context, @NonNull Intent intent) {
        try {
            return C13738b.m50157b(context.getApplicationContext()).mo48760o(intent);
        } catch (Exception e10) {
            Log.e(f26810a, "Phone Number Hint failed", e10);
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public void m29231g(@NonNull Context context, b bVar) {
        m29232h(context, C7089c.m29849o(), bVar);
    }

    /* JADX INFO: renamed from: h */
    public void m29232h(@NonNull Context context, C7089c c7089c, final b bVar) {
        if (!context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            Log.i(f26810a, "Telephony is not available!");
            bVar.onFailure("telephony_not_available");
            return;
        }
        if (c7089c.mo29854g(context) != 0) {
            Log.i(f26810a, "GooglePlayServices is not available!");
            bVar.onFailure("google_play_services_not_available");
            return;
        }
        try {
            c7089c.m29857l(C13738b.m50157b(context.getApplicationContext()), new InterfaceC7497g[0]).mo11893g(new InterfaceC11256g() { // from class: im.j
                @Override // sb.InterfaceC11256g
                public final void onSuccess(Object obj) {
                    bVar.onSuccess();
                }
            }).mo11891e(new InterfaceC11254f() { // from class: im.k
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    C6832l.m29225a(bVar, exc);
                }
            });
        } catch (Exception e10) {
            Log.i(f26810a, "Error checking api availability: " + e10.toString());
            bVar.onFailure("google_auth_api_error");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m29233i(@NonNull Context context, @NonNull final AbstractC5854c<IntentSenderRequest> abstractC5854c, final b bVar) {
        Log.d(f26810a, "Requesting phone number hint");
        C13738b.m50157b(context.getApplicationContext()).mo48761q(GetPhoneNumberHintIntentRequest.m9029v3().m9030a()).mo11893g(new InterfaceC11256g() { // from class: im.h
            @Override // sb.InterfaceC11256g
            public final void onSuccess(Object obj) {
                C6832l.m29226b(abstractC5854c, bVar, (PendingIntent) obj);
            }
        }).mo11891e(new InterfaceC11254f() { // from class: im.i
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                C6832l.m29228d(bVar, exc);
            }
        });
    }
}
