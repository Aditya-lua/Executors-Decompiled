package p222jj;

import android.content.Context;
import p151gk.C6124q;
import p294mj.C8530a;
import p294mj.C8553m;
import p294mj.FriendRequestAcceptedNotification;
import p294mj.FriendRequestReceivedNotification;
import p294mj.InterfaceC8549j0;
import p294mj.PrivateMessageNotification;
import p294mj.PushNotificationMetadata;

/* JADX INFO: renamed from: jj.i */
/* JADX INFO: loaded from: classes2.dex */
public class C7184i {
    /* JADX INFO: renamed from: a */
    public final C8553m m30039a(PushNotificationMetadata pushNotificationMetadata) {
        try {
            return new C8553m(pushNotificationMetadata);
        } catch (C7183h e10) {
            C6124q.m27059d(e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC7185j m30040b(PushNotificationMetadata pushNotificationMetadata, InterfaceC8549j0 interfaceC8549j0) {
        String notificationType;
        if (pushNotificationMetadata == null || (notificationType = pushNotificationMetadata.getNotificationType()) == null) {
            return null;
        }
        if ("FriendRequestAccepted".equals(notificationType) || "FriendRequestReceived".equals(notificationType) || "PrivateMessageReceived".equals(notificationType)) {
            return C7196u.m30108c().m30111d(notificationType);
        }
        if (interfaceC8549j0 == null || !"ChatNewMessage".equals(notificationType)) {
            return null;
        }
        return m30042d((C8553m) interfaceC8549j0);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC8549j0 m30041c(PushNotificationMetadata pushNotificationMetadata) {
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
                return m30039a(pushNotificationMetadata);
            }
            return null;
        } catch (C7183h e10) {
            C6124q.m27059d(e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7185j m30042d(C8553m c8553m) {
        return C7196u.m30108c().m30112e(c8553m.getCategory(), c8553m.getConversationId());
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m30043e(Context context, String str, long j10, String str2, boolean z10) {
        C8530a c8530a = new C8530a(str, j10, str2, z10);
        m30046h(c8530a, context, m30042d(c8530a));
    }

    /* JADX INFO: renamed from: f */
    public void m30044f(Context context, String str, String str2, String str3, boolean z10) {
        C8530a c8530a = new C8530a(str, str2, str3, z10);
        m30046h(c8530a, context, m30042d(c8530a));
    }

    /* JADX INFO: renamed from: g */
    public void m30045g(PushNotificationMetadata pushNotificationMetadata, Context context) {
        InterfaceC8549j0 interfaceC8549j0M30041c = m30041c(pushNotificationMetadata);
        m30046h(interfaceC8549j0M30041c, context, m30040b(pushNotificationMetadata, interfaceC8549j0M30041c));
    }

    /* JADX INFO: renamed from: h */
    public void m30046h(InterfaceC8549j0 interfaceC8549j0, Context context, InterfaceC7185j interfaceC7185j) {
        if (interfaceC8549j0 == null || interfaceC7185j == null) {
            return;
        }
        interfaceC7185j.mo29981d(context, interfaceC8549j0);
    }
}
