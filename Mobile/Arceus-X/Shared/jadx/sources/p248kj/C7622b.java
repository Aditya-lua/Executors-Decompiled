package p248kj;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p235k2.C7419k;
import p235k2.C7422n;

/* JADX INFO: renamed from: kj.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lkj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "groupId", "dismissedTag", "", "dismissedId", "Lk2/n;", "notificationManager", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILk2/n;)V", "Landroid/service/notification/StatusBarNotification;", "sbn", "", "a", "(Landroid/service/notification/StatusBarNotification;Ljava/lang/String;Ljava/lang/String;I)Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7622b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7622b f29138a = new C7622b();

    /* JADX INFO: renamed from: b */
    public static final void m31501b(@NotNull Context context, @NotNull String groupId, @NotNull String dismissedTag, int dismissedId, @NotNull C7422n notificationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(dismissedTag, "dismissedTag");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        if (groupId.length() == 0) {
            return;
        }
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager2 = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager2 == null) {
            return;
        }
        StatusBarNotification[] activeNotifications = notificationManager2.getActiveNotifications();
        if (activeNotifications != null) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                C7622b c7622b = f29138a;
                Intrinsics.checkNotNull(statusBarNotification);
                if (c7622b.m31502a(statusBarNotification, groupId, dismissedTag, dismissedId)) {
                    return;
                }
            }
        }
        notificationManager.m30887b("summary_" + groupId, 0);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31502a(StatusBarNotification sbn, String groupId, String dismissedTag, int dismissedId) {
        Notification notification = sbn.getNotification();
        if (notification == null) {
            return false;
        }
        return ((Intrinsics.m31980c(sbn.getTag(), dismissedTag) && sbn.getId() == dismissedId) || !Intrinsics.m31980c(C7419k.m30739b(notification), groupId) || C7419k.m30740c(notification)) ? false : true;
    }
}
