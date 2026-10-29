package jj;

import android.content.Context;
import mj.PushCategoryExpireMessageNotification;
import mj.PushNotificationMetadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public final long a(String str) {
        return gk.g.a(str);
    }

    public void b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        PushCategoryExpireMessageNotification pushCategoryExpireMessageNotificationC = c(pushNotificationMetadata);
        if (pushCategoryExpireMessageNotificationC != null) {
            String strG = g(pushCategoryExpireMessageNotificationC);
            String strF = f(pushCategoryExpireMessageNotificationC);
            if (strF == null || strG == null) {
                return;
            }
            long jA = a(strF);
            switch (strG) {
                case "FriendRequestAccepted":
                case "PrivateMessageReceived":
                case "FriendRequestReceived":
                    h(e(strG), context, jA);
                    break;
                case "ChatNewMessage":
                    h(d(pushCategoryExpireMessageNotificationC.getCategory()), context, jA);
                    break;
            }
        }
    }

    public PushCategoryExpireMessageNotification c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushCategoryExpireMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final j d(String str) {
        return u.c().b(str);
    }

    public final j e(String str) {
        return u.c().d(str);
    }

    public final String f(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedUpToDate();
        }
        return null;
    }

    public final String g(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedNotificationType();
        }
        return null;
    }

    public void h(j jVar, Context context, long j10) {
        if (jVar != null) {
            jVar.c(context, j10);
        }
    }
}
