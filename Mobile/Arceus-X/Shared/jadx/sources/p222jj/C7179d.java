package p222jj;

import android.content.Context;
import org.json.JSONException;
import p151gk.C6114g;
import p294mj.PushCategoryExpireMessageNotification;
import p294mj.PushNotificationMetadata;

/* JADX INFO: renamed from: jj.d */
/* JADX INFO: loaded from: classes2.dex */
public class C7179d {
    /* JADX INFO: renamed from: a */
    public final long m30016a(String str) {
        return C6114g.m27033a(str);
    }

    /* JADX INFO: renamed from: b */
    public void m30017b(PushNotificationMetadata pushNotificationMetadata, Context context) {
        PushCategoryExpireMessageNotification pushCategoryExpireMessageNotificationM30018c = m30018c(pushNotificationMetadata);
        if (pushCategoryExpireMessageNotificationM30018c != null) {
            String strM30022g = m30022g(pushCategoryExpireMessageNotificationM30018c);
            String strM30021f = m30021f(pushCategoryExpireMessageNotificationM30018c);
            if (strM30021f == null || strM30022g == null) {
                return;
            }
            long jM30016a = m30016a(strM30021f);
            switch (strM30022g) {
                case "FriendRequestAccepted":
                case "PrivateMessageReceived":
                case "FriendRequestReceived":
                    m30023h(m30020e(strM30022g), context, jM30016a);
                    break;
                case "ChatNewMessage":
                    m30023h(m30019d(pushCategoryExpireMessageNotificationM30018c.getCategory()), context, jM30016a);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public PushCategoryExpireMessageNotification m30018c(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new PushCategoryExpireMessageNotification(pushNotificationMetadata);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7185j m30019d(String str) {
        return C7196u.m30108c().m30110b(str);
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC7185j m30020e(String str) {
        return C7196u.m30108c().m30111d(str);
    }

    /* JADX INFO: renamed from: f */
    public final String m30021f(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedUpToDate();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m30022g(PushCategoryExpireMessageNotification pushCategoryExpireMessageNotification) {
        if (pushCategoryExpireMessageNotification != null) {
            return pushCategoryExpireMessageNotification.getRevokedNotificationType();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m30023h(InterfaceC7185j interfaceC7185j, Context context, long j10) {
        if (interfaceC7185j != null) {
            interfaceC7185j.mo29980c(context, j10);
        }
    }
}
