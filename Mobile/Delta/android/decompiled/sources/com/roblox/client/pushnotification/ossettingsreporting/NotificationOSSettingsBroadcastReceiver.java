package com.roblox.client.pushnotification.ossettingsreporting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.datastructures.NameValuePair;
import gk.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.o;
import kotlin.collections.p0;
import kotlin.collections.q;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import org.jetbrains.annotations.NotNull;
import sg.a1;
import th.h;
import vg.r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R(\u0010\u001a\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationOSSettingsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", "a", "(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;", "", "Ljava/util/Set;", "expectedActions", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "b", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "getNotificationWorkerScheduler$NativeShell_googleProdRelease", "()Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "setNotificationWorkerScheduler$NativeShell_googleProdRelease", "(Lcom/roblox/client/pushnotification/ossettingsreporting/b;)V", "getNotificationWorkerScheduler$NativeShell_googleProdRelease$annotations", "notificationWorkerScheduler", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationOSSettingsBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<String> expectedActions = q0.g("android.app.action.APP_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public b notificationWorkerScheduler = new c();

    public final List<String> a(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 452039370) {
                if (iHashCode == 806551504) {
                    if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED") && (stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID")) != null) {
                        return h.a().t1() ? r.f33181a.c(context, stringExtra) : CollectionsKt.M0(r.f33181a.b(context, stringExtra).keySet());
                    }
                    return null;
                }
                if (iHashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED") && (stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID")) != null) {
                    return h.a().t1() ? o.d(stringExtra2) : CollectionsKt.M0(r.d(context, stringExtra2).keySet());
                }
                return null;
            }
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                return o.d("notifications_enabled");
            }
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (CollectionsKt.W(this.expectedActions, intent.getAction())) {
            a1.g0(context);
            List<String> listA = a(context, intent);
            if (listA == null) {
                return;
            }
            List<NameValuePair> listL = jj.r.l();
            Intrinsics.checkNotNullExpressionValue(listL, "getNotificationSettings(...)");
            List<NameValuePair> list = listL;
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.c(j0.f(q.u(list, 10)), 16));
            for (NameValuePair nameValuePair : list) {
                Pair pairA = s.a(nameValuePair.getName(), nameValuePair.getValue());
                linkedHashMap.put(pairA.c(), pairA.d());
            }
            long jG = vi.h.e().g();
            if (jG == -1) {
                p.b("NotificationOSSettingsBroadcastReceiver", "No valid user ID found.");
                return;
            }
            if (h.a().t1()) {
                Set setB = p0.b();
                Iterator<pj.a> it = pj.a.b().iterator();
                while (it.hasNext()) {
                    setB.add(it.next().getId());
                }
                Iterator<pj.b> it2 = pj.b.c().iterator();
                while (it2.hasNext()) {
                    setB.add(it2.next().getId());
                }
                setB.add("notifications_enabled");
                setB.add("post_notifications_permission_granted");
                setKeySet = p0.a(setB);
            } else {
                setKeySet = linkedHashMap.keySet();
            }
            List<String> list2 = listA;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (setKeySet.contains((String) it3.next())) {
                        b bVar = this.notificationWorkerScheduler;
                        String mDeviceId = a1.f30732t;
                        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
                        bVar.a(context, linkedHashMap, listA, mDeviceId, jG);
                        return;
                    }
                }
            }
            p.b("NotificationOSSettingsBroadcastReceiver", "No relevant channel changes detected.");
        }
    }
}
