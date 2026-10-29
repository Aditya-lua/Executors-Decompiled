package jj;

import android.content.Context;
import mj.FriendRequestAcceptedNotification;
import mj.FriendRequestReceivedNotification;
import mj.PrivateMessageNotification;
import mj.PushNotificationMetadata;
import mj.j0;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    public final mj.m a(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new mj.m(pushNotificationMetadata);
        } catch (h e10) {
            gk.p.d(e10.getMessage());
            return null;
        }
    }

    public final j b(PushNotificationMetadata pushNotificationMetadata, j0 j0Var) {
        String notificationType;
        if (pushNotificationMetadata == null || (notificationType = pushNotificationMetadata.getNotificationType()) == null) {
            return null;
        }
        if ("FriendRequestAccepted".equals(notificationType) || "FriendRequestReceived".equals(notificationType) || "PrivateMessageReceived".equals(notificationType)) {
            return u.c().d(notificationType);
        }
        if (j0Var == null || !"ChatNewMessage".equals(notificationType)) {
            return null;
        }
        return d((mj.m) j0Var);
    }

    public j0 c(PushNotificationMetadata pushNotificationMetadata) {
        String notificationType;
        if (pushNotificationMetadata == null || (notificationType = pushNotificationMetadata.getNotificationType()) == null) {
            return null;
        }
        try {
            if ("FriendRequestAccepted".equals(notificationType)) {
                return new FriendRequestAcceptedNotification(pushNotificationMetadata);
            }
            if ("FriendRequestReceived".equals(notificationType)) {
                return new FriendRequestReceivedNotification(pushNotificationMetadata);
            }
            if ("PrivateMessageReceived".equals(notificationType)) {
                return new PrivateMessageNotification(pushNotificationMetadata);
            }
            if ("ChatNewMessage".equals(notificationType)) {
                return a(pushNotificationMetadata);
            }
            return null;
        } catch (h e10) {
            gk.p.d(e10.getMessage());
            return null;
        }
    }

    public final j d(mj.m mVar) {
        return u.c().e(mVar.getCategory(), mVar.getConversationId());
    }

    @Deprecated
    public void e(Context context, String str, long j10, String str2, boolean z10) {
        mj.a aVar = new mj.a(str, j10, str2, z10);
        h(aVar, context, d(aVar));
    }

    public void f(Context context, String str, String str2, String str3, boolean z10) {
        mj.a aVar = new mj.a(str, str2, str3, z10);
        h(aVar, context, d(aVar));
    }

    public void g(PushNotificationMetadata pushNotificationMetadata, Context context) {
        j0 j0VarC = c(pushNotificationMetadata);
        h(j0VarC, context, b(pushNotificationMetadata, j0VarC));
    }

    public void h(j0 j0Var, Context context, j jVar) {
        if (j0Var == null || jVar == null) {
            return;
        }
        jVar.d(context, j0Var);
    }
}
