package jj;

import android.content.Context;
import mj.PushExpiryMessageNotification;
import mj.PushNotificationMetadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    public void a(Context context, j jVar, String str) {
        if (jVar != null) {
            jVar.a(context, str);
        }
    }

    public void b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        PushExpiryMessageNotification pushExpiryMessageNotificationC = c(pushNotificationMetadata);
        if (pushExpiryMessageNotificationC != null) {
            String strF = f(pushExpiryMessageNotificationC);
            String strE = e(pushExpiryMessageNotificationC);
            if (strF == null || strE == null) {
                return;
            }
            a(context, d(strF), strE);
        }
    }

    public PushExpiryMessageNotification c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushExpiryMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final j d(String str) {
        return u.c().d(str);
    }

    public final String e(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationId();
        }
        return null;
    }

    public final String f(PushExpiryMessageNotification pushExpiryMessageNotification) {
        if (pushExpiryMessageNotification != null) {
            return pushExpiryMessageNotification.getRevokedNotificationType();
        }
        return null;
    }
}
