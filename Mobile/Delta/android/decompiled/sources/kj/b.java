package kj;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import k2.k;
import k2.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkj/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "groupId", "dismissedTag", "", "dismissedId", "Lk2/n;", "notificationManager", "", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILk2/n;)V", "Landroid/service/notification/StatusBarNotification;", "sbn", "", "a", "(Landroid/service/notification/StatusBarNotification;Ljava/lang/String;Ljava/lang/String;I)Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f22320a = new b();

    public static final void b(@NotNull Context context, @NotNull String groupId, @NotNull String dismissedTag, int dismissedId, @NotNull n notificationManager) {
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
                b bVar = f22320a;
                Intrinsics.checkNotNull(statusBarNotification);
                if (bVar.a(statusBarNotification, groupId, dismissedTag, dismissedId)) {
                    return;
                }
            }
        }
        notificationManager.b("summary_" + groupId, 0);
    }

    public final boolean a(StatusBarNotification sbn, String groupId, String dismissedTag, int dismissedId) {
        Notification notification = sbn.getNotification();
        if (notification == null) {
            return false;
        }
        return ((Intrinsics.c(sbn.getTag(), dismissedTag) && sbn.getId() == dismissedId) || !Intrinsics.c(k.b(notification), groupId) || k.c(notification)) ? false : true;
    }
}
