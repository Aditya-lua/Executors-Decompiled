package eh;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Leh/j0;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)Ljava/util/Map;", "d", "(Landroid/content/Context;)Ljava/lang/String;", "channelId", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "groupId", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f13548a = new j0();

    @NotNull
    public static final Map<String, String> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map mapD = p001kotlin.collections.j0.d();
        mapD.put("notifications_enabled", String.valueOf(k2.n.g(context).a()));
        if (Build.VERSION.SDK_INT >= 33) {
            mapD.put("post_notifications_permission_granted", String.valueOf(l2.b.a(context, "android.permission.POST_NOTIFICATIONS") == 0));
        }
        return p001kotlin.collections.j0.c(mapD);
    }

    @NotNull
    public static final String c(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapD = p001kotlin.collections.j0.d();
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
        if (notificationChannel != null) {
            mapD.put("enabled", Boolean.valueOf(notificationChannel.getImportance() > 0));
            mapD.put("popup", Boolean.valueOf(notificationChannel.getImportance() >= 4));
            mapD.put("lock_screen", Boolean.valueOf(notificationChannel.getLockscreenVisibility() != -1));
            mapD.put("badge", Boolean.valueOf(notificationChannel.canShowBadge()));
            mapD.put("sound", Boolean.valueOf(notificationChannel.getSound() != null));
            mapD.put("vibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
        }
        return ok.n.c(p001kotlin.collections.j0.c(mapD));
    }

    @NotNull
    public static final String d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        Set setB = p001kotlin.collections.p0.b();
        Iterator<xj.a> it = xj.a.b().iterator();
        while (it.hasNext()) {
            setB.add(it.next().getId());
        }
        Iterator<xj.b> it2 = xj.b.c().iterator();
        while (it2.hasNext()) {
            setB.add(it2.next().getId());
        }
        Set setA = p001kotlin.collections.p0.a(setB);
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationChannels) {
            if (setA.contains(((NotificationChannel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            NotificationChannel notificationChannel = (NotificationChannel) obj2;
            String id2 = notificationChannel.getId();
            String id3 = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            Pair pairA = zt.s.a(id2, c(context, id3));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return ok.n.c(linkedHashMap);
    }

    @NotNull
    public final List<String> b(@NotNull Context context, @NotNull String groupId) {
        ArrayList arrayList;
        List<NotificationChannel> channels;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        if (Build.VERSION.SDK_INT < 28) {
            return p001kotlin.collections.p.k();
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannelGroup notificationChannelGroup = ((NotificationManager) systemService).getNotificationChannelGroup(groupId);
        if (notificationChannelGroup == null || (channels = notificationChannelGroup.getChannels()) == null) {
            arrayList = null;
        } else {
            List<NotificationChannel> list = channels;
            arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NotificationChannel) it.next()).getId());
            }
        }
        return arrayList == null ? p001kotlin.collections.p.k() : arrayList;
    }
}
