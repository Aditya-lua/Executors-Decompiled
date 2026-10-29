package p222jj;

import android.content.Context;
import org.json.JSONException;
import p294mj.PushExpiryMessageNotification;
import p294mj.PushNotificationMetadata;

/* JADX INFO: renamed from: jj.e */
/* JADX INFO: loaded from: classes2.dex */
public class C7180e {
    /* JADX INFO: renamed from: a */
    public void m30024a(Context context, InterfaceC7185j interfaceC7185j, String str) {
        if (interfaceC7185j != null) {
            interfaceC7185j.mo29979a(context, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m30025b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        PushExpiryMessageNotification pushExpiryMessageNotificationM30026c = m30026c(pushNotificationMetadata);
        if (pushExpiryMessageNotificationM30026c != null) {
            String strM30029f = m30029f(pushExpiryMessageNotificationM30026c);
            String strM30028e = m30028e(pushExpiryMessageNotificationM30026c);
            if (strM30029f == null || strM30028e == null) {
                return;
            }
            m30024a(context, m30027d(strM30029f), strM30028e);
        }
    }

    /* JADX INFO: renamed from: c */
    public PushExpiryMessageNotification m30026c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushExpiryMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7185j m30027d(String str) {
        return C7196u.m30108c().m30111d(str);
    }

    /* JADX INFO: renamed from: e */
    public final String m30028e(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationId();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final String m30029f(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationType();
        }
        return null;
    }
}
