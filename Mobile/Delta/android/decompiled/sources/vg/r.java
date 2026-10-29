package vg;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvg/r;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "a", "(Landroid/content/Context;)Ljava/util/Map;", "channelId", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", "f", "(Landroid/content/Context;)Ljava/lang/String;", "e", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "groupId", "b", "", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f33181a = new r();

    @NotNull
    public static final Map<String, String> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map mapD = j0.d();
        mapD.put("notifications_enabled", String.valueOf(k2.n.e(context).a()));
        if (Build.VERSION.SDK_INT >= 33) {
            mapD.put("post_notifications_permission_granted", String.valueOf(l2.b.a(context, "android.permission.POST_NOTIFICATIONS") == 0));
        }
        return j0.c(mapD);
    }

    @NotNull
    public static final Map<String, String> d(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapD = j0.d();
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
        if (notificationChannel != null) {
            mapD.put("channel_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() > 0));
            mapD.put("popup_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() >= 4));
            mapD.put("lock_screen_visible_" + channelId, String.valueOf(notificationChannel.getLockscreenVisibility() != -1));
            mapD.put("badge_enabled_" + channelId, String.valueOf(notificationChannel.canShowBadge()));
            mapD.put("sound_enabled_" + channelId, String.valueOf(notificationChannel.getSound() != null));
            mapD.put("vibration_enabled_" + channelId, String.valueOf(notificationChannel.shouldVibrate()));
        }
        return j0.c(mapD);
    }

    @NotNull
    public static final String e(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapD = j0.d();
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
        return gk.m.c(j0.c(mapD));
    }

    @NotNull
    public static final String f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        Set setB = p0.b();
        Iterator<pj.a> it = pj.a.b().iterator();
        while (it.hasNext()) {
            setB.add(it.next().getId());
        }
        Iterator<pj.b> it2 = pj.b.c().iterator();
        while (it2.hasNext()) {
            setB.add(it2.next().getId());
        }
        Set setA = p0.a(setB);
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationChannels) {
            if (setA.contains(((NotificationChannel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(kotlin.collections.q.u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            NotificationChannel notificationChannel = (NotificationChannel) obj2;
            String id2 = notificationChannel.getId();
            String id3 = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            Pair pairA = jt.s.a(id2, e(context, id3));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return gk.m.c(linkedHashMap);
    }

    @NotNull
    public final Map<String, String> b(@NotNull Context context, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Map mapD = j0.d();
        Iterator<T> it = f33181a.c(context, groupId).iterator();
        while (it.hasNext()) {
            mapD.putAll(d(context, (String) it.next()));
        }
        return j0.c(mapD);
    }

    @NotNull
    public final List<String> c(@NotNull Context context, @NotNull String groupId) {
        ArrayList arrayList;
        List<NotificationChannel> channels;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        if (Build.VERSION.SDK_INT < 28) {
            return kotlin.collections.p.k();
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannelGroup notificationChannelGroup = ((NotificationManager) systemService).getNotificationChannelGroup(groupId);
        if (notificationChannelGroup == null || (channels = notificationChannelGroup.getChannels()) == null) {
            arrayList = null;
        } else {
            List<NotificationChannel> list = channels;
            arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NotificationChannel) it.next()).getId());
            }
        }
        return arrayList == null ? kotlin.collections.p.k() : arrayList;
    }
}
