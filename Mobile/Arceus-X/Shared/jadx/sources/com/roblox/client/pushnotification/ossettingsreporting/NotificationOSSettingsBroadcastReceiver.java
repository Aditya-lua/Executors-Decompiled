package com.roblox.client.pushnotification.ossettingsreporting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.datastructures.NameValuePair;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7697o;
import kotlin.collections.C7700p0;
import kotlin.collections.C7701q;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p222jj.C7193r;
import p229jt.C7352s;
import p360pj.EnumC10285a;
import p360pj.EnumC10286b;
import sg.C11295a1;
import th.C11659h;
import vg.C12188r;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R(\u0010\u001a\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationOSSettingsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "", "a", "(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;", "", "Ljava/util/Set;", "expectedActions", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "b", "Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "getNotificationWorkerScheduler$NativeShell_googleProdRelease", "()Lcom/roblox/client/pushnotification/ossettingsreporting/b;", "setNotificationWorkerScheduler$NativeShell_googleProdRelease", "(Lcom/roblox/client/pushnotification/ossettingsreporting/b;)V", "getNotificationWorkerScheduler$NativeShell_googleProdRelease$annotations", "notificationWorkerScheduler", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NotificationOSSettingsBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<String> expectedActions = C7702q0.m31911g("android.app.action.APP_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public InterfaceC3239b notificationWorkerScheduler = new C3240c();

    /* JADX INFO: renamed from: a */
    public final List<String> m15438a(Context context, Intent intent) {
        String stringExtra;
        String stringExtra2;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 452039370) {
                if (iHashCode == 806551504) {
                    if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED") && (stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID")) != null) {
                        return C11659h.m43403a().mo43759y1() ? C12188r.f42958a.m45153c(context, stringExtra) : CollectionsKt.m31687M0(C12188r.f42958a.m45152b(context, stringExtra).keySet());
                    }
                    return null;
                }
                if (iHashCode == 1171977904 && action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED") && (stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID")) != null) {
                    return C11659h.m43403a().mo43759y1() ? C7697o.m31878d(stringExtra2) : CollectionsKt.m31687M0(C12188r.m45149d(context, stringExtra2).keySet());
                }
                return null;
            }
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                return C7697o.m31878d("notifications_enabled");
            }
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (CollectionsKt.m31699W(this.expectedActions, intent.getAction())) {
            C11295a1.m42451g0(context);
            List<String> listM15438a = m15438a(context, intent);
            if (listM15438a == null) {
                return;
            }
            List<NameValuePair> listM30070l = C7193r.m30070l();
            Intrinsics.checkNotNullExpressionValue(listM30070l, "getNotificationSettings(...)");
            List<NameValuePair> list = listM30070l;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(list, 10)), 16));
            for (NameValuePair nameValuePair : list) {
                Pair pairM30477a = C7352s.m30477a(nameValuePair.getName(), nameValuePair.getValue());
                linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
            }
            long jM45296g = C12217h.m45288e().m45296g();
            if (jM45296g == -1) {
                C6124q.m27057b("NotificationOSSettingsBroadcastReceiver", "No valid user ID found.");
                return;
            }
            if (C11659h.m43403a().mo43759y1()) {
                Set setM31903b = C7700p0.m31903b();
                Iterator<EnumC10285a> it = EnumC10285a.m39506b().iterator();
                while (it.hasNext()) {
                    setM31903b.add(it.next().getId());
                }
                Iterator<EnumC10286b> it2 = EnumC10286b.m39510c().iterator();
                while (it2.hasNext()) {
                    setM31903b.add(it2.next().getId());
                }
                setM31903b.add("notifications_enabled");
                setM31903b.add("post_notifications_permission_granted");
                setKeySet = C7700p0.m31902a(setM31903b);
            } else {
                setKeySet = linkedHashMap.keySet();
            }
            List<String> list2 = listM15438a;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (setKeySet.contains((String) it3.next())) {
                        InterfaceC3239b interfaceC3239b = this.notificationWorkerScheduler;
                        String mDeviceId = C11295a1.f39656t;
                        Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
                        interfaceC3239b.mo15445a(context, linkedHashMap, listM15438a, mDeviceId, jM45296g);
                        return;
                    }
                }
            }
            C6124q.m27057b("NotificationOSSettingsBroadcastReceiver", "No relevant channel changes detected.");
        }
    }
}
