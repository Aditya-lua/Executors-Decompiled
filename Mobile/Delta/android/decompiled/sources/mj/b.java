package mj;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import gt.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\u0010J\u001f\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lmj/b;", "", "<init>", "()V", "", "Landroid/app/NotificationChannel;", "channels", "", "logicalId", "g", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "descriptor", "d", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;", "Lk2/n;", "notificationManager", "e", "(Lk2/n;Ljava/lang/String;)Ljava/util/List;", "installed", "f", "(Ljava/lang/String;Ljava/util/List;)Landroid/app/NotificationChannel;", "", "keepVersion", "", "c", "(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V", "registeredChannelId", "importance", "b", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;Ljava/lang/String;I)V", "h", "channel", "a", "(Landroid/app/NotificationChannel;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f24846a = new b();

    @NotNull
    public static final String d(@NotNull Context context, @NotNull PayloadNotificationChannel descriptor) {
        Integer numC;
        int iIntValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String id2 = descriptor.getId();
        Integer version = descriptor.getVersion();
        if (id2 == null || id2.length() == 0 || version == null) {
            return id2 == null ? "" : id2;
        }
        k2.n nVarF = k2.n.f(context);
        Intrinsics.checkNotNullExpressionValue(nVarF, "from(...)");
        b bVar = f24846a;
        List<NotificationChannel> listE = bVar.e(nVarF, id2);
        NotificationChannel notificationChannelF = bVar.f(id2, listE);
        if (notificationChannelF != null) {
            PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
            String id3 = notificationChannelF.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
            numC = companion.c(id2, id3);
        } else {
            numC = null;
        }
        if (notificationChannelF != null && numC != null && numC.intValue() >= version.intValue()) {
            bVar.c(nVarF, id2, listE, numC.intValue());
            String id4 = notificationChannelF.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getId(...)");
            return id4;
        }
        if (notificationChannelF == null || notificationChannelF.getImportance() != 0) {
            Integer androidImportance = descriptor.getAndroidImportance();
            iIntValue = androidImportance != null ? androidImportance.intValue() : 3;
        } else {
            iIntValue = 0;
        }
        String strA = PayloadNotificationChannel.INSTANCE.a(id2, version.intValue());
        bVar.b(context, descriptor, strA, iIntValue);
        bVar.c(nVarF, id2, listE, version.intValue());
        return strA;
    }

    @Nullable
    public static final String g(@NotNull List<NotificationChannel> channels, @Nullable String logicalId) {
        Object next;
        Intrinsics.checkNotNullParameter(channels, "channels");
        if (logicalId != null && logicalId.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (NotificationChannel notificationChannel : channels) {
                PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
                String id2 = notificationChannel.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                Integer numC = companion.c(logicalId, id2);
                Pair pairA = (numC == null || numC.intValue() < 1) ? null : s.a(numC, notificationChannel.getId());
                if (pairA != null) {
                    arrayList.add(pairA);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).c()).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).c()).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Pair pair = (Pair) next;
            if (pair != null) {
                return (String) pair.d();
            }
        }
        return null;
    }

    public final void a(NotificationChannel channel, PayloadNotificationChannel descriptor) {
        String lowerCase;
        String sound = descriptor.getSound();
        if (sound != null) {
            lowerCase = sound.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.c(lowerCase, PayloadNotificationChannel.SOUND_NONE) || Intrinsics.c(lowerCase, "")) {
            channel.setSound(null, null);
        }
        Boolean vibration = descriptor.getVibration();
        if (vibration != null) {
            boolean zBooleanValue = vibration.booleanValue();
            channel.enableVibration(zBooleanValue);
            if (!zBooleanValue) {
                channel.setVibrationPattern(null);
            }
        }
        Boolean badge = descriptor.getBadge();
        if (badge != null) {
            channel.setShowBadge(badge.booleanValue());
        }
    }

    public final void b(Context context, PayloadNotificationChannel descriptor, String registeredChannelId, int importance) {
        NotificationChannel notificationChannel = new NotificationChannel(registeredChannelId, descriptor.getName(), importance);
        String description = descriptor.getDescription();
        if (description != null && description.length() != 0) {
            notificationChannel.setDescription(descriptor.getDescription());
        }
        String strH = h(context, descriptor);
        if (strH != null) {
            notificationChannel.setGroup(strH);
        }
        a(notificationChannel, descriptor);
        k2.n.f(context).c(notificationChannel);
    }

    public final void c(k2.n notificationManager, String logicalId, List<NotificationChannel> installed, int keepVersion) {
        for (NotificationChannel notificationChannel : installed) {
            PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
            String id2 = notificationChannel.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            Integer numC = companion.c(logicalId, id2);
            if (numC != null && numC.intValue() < keepVersion) {
                notificationManager.e(notificationChannel.getId());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public final List<NotificationChannel> e(k2.n notificationManager, String logicalId) {
        List<NotificationChannel> listK = notificationManager.k();
        Intrinsics.checkNotNullExpressionValue(listK, "getNotificationChannels(...)");
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : listK) {
            if (notificationChannel != null) {
                PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
                String id2 = notificationChannel.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                if (companion.c(logicalId, id2) == null) {
                    notificationChannel = null;
                }
            } else {
                notificationChannel = null;
            }
            if (notificationChannel != null) {
                arrayList.add(notificationChannel);
            }
        }
        return arrayList;
    }

    public final NotificationChannel f(String logicalId, List<NotificationChannel> installed) {
        Object obj;
        Iterator<T> it = installed.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                PayloadNotificationChannel.Companion companion = PayloadNotificationChannel.INSTANCE;
                String id2 = ((NotificationChannel) next).getId();
                Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                Integer numC = companion.c(logicalId, id2);
                int iIntValue = numC != null ? numC.intValue() : 0;
                do {
                    Object next2 = it.next();
                    PayloadNotificationChannel.Companion companion2 = PayloadNotificationChannel.INSTANCE;
                    String id3 = ((NotificationChannel) next2).getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                    Integer numC2 = companion2.c(logicalId, id3);
                    int iIntValue2 = numC2 != null ? numC2.intValue() : 0;
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (NotificationChannel) obj;
    }

    public final String h(Context context, PayloadNotificationChannel descriptor) {
        String groupId = descriptor.getGroupId();
        if (groupId != null && groupId.length() != 0) {
            k2.n nVarF = k2.n.f(context);
            Intrinsics.checkNotNullExpressionValue(nVarF, "from(...)");
            if (nVarF.i(groupId) != null) {
                return groupId;
            }
            String groupName = descriptor.getGroupName();
            if (groupName != null && groupName.length() != 0) {
                nVarF.d(new NotificationChannelGroup(groupId, groupName));
                return groupId;
            }
        }
        return null;
    }
}
