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
import kotlin.collections.C7688j0;
import kotlin.collections.C7699p;
import kotlin.collections.C7700p0;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p151gk.C6121n;
import p229jt.C7352s;
import p235k2.C7422n;
import p261l2.C7975b;
import p360pj.EnumC10285a;
import p360pj.EnumC10286b;

/* JADX INFO: renamed from: vg.r */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\fJ#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lvg/r;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "a", "(Landroid/content/Context;)Ljava/util/Map;", "channelId", "d", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;", "f", "(Landroid/content/Context;)Ljava/lang/String;", "e", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "groupId", "b", "", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12188r {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12188r f42958a = new C12188r();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<String, String> m45148a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map mapM31788d = C7688j0.m31788d();
        mapM31788d.put("notifications_enabled", String.valueOf(C7422n.m30883e(context).m30886a()));
        if (Build.VERSION.SDK_INT >= 33) {
            mapM31788d.put("post_notifications_permission_granted", String.valueOf(C7975b.m33003a(context, "android.permission.POST_NOTIFICATIONS") == 0));
        }
        return C7688j0.m31787c(mapM31788d);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Map<String, String> m45149d(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapM31788d = C7688j0.m31788d();
        Object systemService = context.getSystemService("notification");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
        if (notificationChannel != null) {
            mapM31788d.put("channel_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() > 0));
            mapM31788d.put("popup_enabled_" + channelId, String.valueOf(notificationChannel.getImportance() >= 4));
            mapM31788d.put("lock_screen_visible_" + channelId, String.valueOf(notificationChannel.getLockscreenVisibility() != -1));
            mapM31788d.put("badge_enabled_" + channelId, String.valueOf(notificationChannel.canShowBadge()));
            mapM31788d.put("sound_enabled_" + channelId, String.valueOf(notificationChannel.getSound() != null));
            mapM31788d.put("vibration_enabled_" + channelId, String.valueOf(notificationChannel.shouldVibrate()));
        }
        return C7688j0.m31787c(mapM31788d);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m45150e(@NotNull Context context, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Map mapM31788d = C7688j0.m31788d();
        Object systemService = context.getSystemService("notification");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
        if (notificationChannel != null) {
            mapM31788d.put("enabled", Boolean.valueOf(notificationChannel.getImportance() > 0));
            mapM31788d.put("popup", Boolean.valueOf(notificationChannel.getImportance() >= 4));
            mapM31788d.put("lock_screen", Boolean.valueOf(notificationChannel.getLockscreenVisibility() != -1));
            mapM31788d.put("badge", Boolean.valueOf(notificationChannel.canShowBadge()));
            mapM31788d.put("sound", Boolean.valueOf(notificationChannel.getSound() != null));
            mapM31788d.put("vibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
        }
        return C6121n.m27046c(C7688j0.m31787c(mapM31788d));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m45151f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        Set setM31903b = C7700p0.m31903b();
        Iterator<EnumC10285a> it = EnumC10285a.m39506b().iterator();
        while (it.hasNext()) {
            setM31903b.add(it.next().getId());
        }
        Iterator<EnumC10286b> it2 = EnumC10286b.m39510c().iterator();
        while (it2.hasNext()) {
            setM31903b.add(it2.next().getId());
        }
        Set setM31902a = C7700p0.m31902a(setM31903b);
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Intrinsics.checkNotNullExpressionValue(notificationChannels, "getNotificationChannels(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : notificationChannels) {
            if (setM31902a.contains(((NotificationChannel) obj).getId())) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(arrayList, 10)), 16));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            NotificationChannel notificationChannel = (NotificationChannel) obj2;
            String id2 = notificationChannel.getId();
            String id3 = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            Pair pairM30477a = C7352s.m30477a(id2, m45150e(context, id3));
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        return C6121n.m27046c(linkedHashMap);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<String, String> m45152b(@NotNull Context context, @NotNull String groupId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Map mapM31788d = C7688j0.m31788d();
        Iterator<T> it = f42958a.m45153c(context, groupId).iterator();
        while (it.hasNext()) {
            mapM31788d.putAll(m45149d(context, (String) it.next()));
        }
        return C7688j0.m31787c(mapM31788d);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m45153c(@NotNull Context context, @NotNull String groupId) {
        ArrayList arrayList;
        List<NotificationChannel> channels;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        if (Build.VERSION.SDK_INT < 28) {
            return C7699p.m31892k();
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannelGroup notificationChannelGroup = ((NotificationManager) systemService).getNotificationChannelGroup(groupId);
        if (notificationChannelGroup == null || (channels = notificationChannelGroup.getChannels()) == null) {
            arrayList = null;
        } else {
            List<NotificationChannel> list = channels;
            arrayList = new ArrayList(C7701q.m31905u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((NotificationChannel) it.next()).getId());
            }
        }
        return arrayList == null ? C7699p.m31892k() : arrayList;
    }
}
