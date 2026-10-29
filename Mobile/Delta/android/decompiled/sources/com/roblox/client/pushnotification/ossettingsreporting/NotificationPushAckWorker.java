package com.roblox.client.pushnotification.ossettingsreporting;

import ak.l2;
import al.PushReceiveAckPostBody;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import gk.p;
import hu.l;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import jt.n;
import jt.o;
import jt.s;
import jv.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import vk.g;
import x5.d;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;
import zk.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0003\u0011\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "e", "b", "(Ljava/lang/Throwable;)Landroidx/work/c$a;", "a", "Landroidx/work/WorkerParameters;", "NotificationPushAckParams", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationPushAckWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters workerParams;

    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\t\u0010\nR#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011*\u0004\b\u000f\u0010\nR#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0014\u0010\u0011*\u0004\b\u0013\u0010\nR#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0017\u0010\u0011*\u0004\b\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001a\u0010\f*\u0004\b\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001d\u0010\f*\u0004\b\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b \u0010\f*\u0004\b\u001f\u0010\nR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;", "", "data", "", "", "<init>", "(Ljava/util/Map;)V", "delegate", "deviceId", "getDeviceId$delegate", "(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;", "getDeviceId", "()Ljava/lang/String;", "channelNames", "", "getChannelNames$delegate", "getChannelNames", "()[Ljava/lang/String;", "channelEnabledValues", "getChannelEnabledValues$delegate", "getChannelEnabledValues", "changedChannels", "getChangedChannels$delegate", "getChangedChannels", "notificationId", "getNotificationId$delegate", "getNotificationId", "metadata", "getMetadata$delegate", "getMetadata", "notificationType", "getNotificationType$delegate", "getNotificationType", "userId", "", "getUserId", "()Ljava/lang/Long;", "receivedTime", "getReceivedTime", "priority", "", "getPriority", "()Ljava/lang/Integer;", "originalPriority", "getOriginalPriority", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotificationPushAckParams {
        static final /* synthetic */ l<Object>[] $$delegatedProperties = {d0.g(new u(NotificationPushAckParams.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "channelNames", "getChannelNames()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "channelEnabledValues", "getChannelEnabledValues()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "changedChannels", "getChangedChannels()[Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "notificationId", "getNotificationId()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "metadata", "getMetadata()Ljava/lang/String;", 0)), d0.g(new u(NotificationPushAckParams.class, "notificationType", "getNotificationType()Ljava/lang/String;", 0))};

        @NotNull
        private final Map<String, Object> delegate;

        public NotificationPushAckParams(@NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.delegate = i0.b(data, new Function1() { // from class: com.roblox.client.pushnotification.ossettingsreporting.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NotificationPushAckWorker.NotificationPushAckParams.delegate$lambda$0((String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object delegate$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }

        @Nullable
        public final String[] getChangedChannels() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[3].getName());
        }

        @Nullable
        public final String[] getChannelEnabledValues() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[2].getName());
        }

        @Nullable
        public final String[] getChannelNames() {
            return (String[]) i0.a(this.delegate, $$delegatedProperties[1].getName());
        }

        @Nullable
        public final String getDeviceId() {
            return (String) i0.a(this.delegate, $$delegatedProperties[0].getName());
        }

        @Nullable
        public final String getMetadata() {
            return (String) i0.a(this.delegate, $$delegatedProperties[5].getName());
        }

        @Nullable
        public final String getNotificationId() {
            return (String) i0.a(this.delegate, $$delegatedProperties[4].getName());
        }

        @Nullable
        public final String getNotificationType() {
            return (String) i0.a(this.delegate, $$delegatedProperties[6].getName());
        }

        @Nullable
        public final Integer getOriginalPriority() {
            Object obj = this.delegate.get("originalPriority");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            return null;
        }

        @Nullable
        public final Integer getPriority() {
            Object obj = this.delegate.get("priority");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            return null;
        }

        @Nullable
        public final Long getReceivedTime() {
            Object obj = this.delegate.get("receivedTime");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }

        @Nullable
        public final Long getUserId() {
            Object obj = this.delegate.get("userId");
            Number number = obj instanceof Number ? (Number) obj : null;
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "input", "", "b", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "a", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V", "", "MAX_RETRY_COUNT", "I", "", "SETTINGS_CHANGE_WORK_NAME", "Ljava/lang/String;", "ACK_CALL_WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context appContext, @NotNull b.NotificationAckInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            p.h("NotificationOSSettingChangeReportingWorker", "Scheduling Push Ack Work");
            z zVarB = new z.a(NotificationPushAckWorker.class).k(new d.a().b(x.CONNECTED).a()).o(input.a()).b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("NotificationPushAckWorkUniqueWork", j.APPEND_OR_REPLACE, zVarB);
        }

        public final void b(@NotNull Context appContext, @NotNull b.SettingChangeInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            p.h("NotificationOSSettingChangeReportingWorker", "Scheduling OS Notification Setting Change Reporting Work");
            z zVarB = new z.a(NotificationPushAckWorker.class).k(new d.a().b(x.CONNECTED).a()).o(input.a()).b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("NotificationOSSettingChangeReportingWorkerUniqueWork", j.REPLACE, zVarB);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "<init>", "()V", "b", "a", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "receivedTime", "notificationId", "metadataString", "notificationType", "", "priority", "originalPriority", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/work/b;", "a", "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "b", "J", "getReceivedTime", "()J", "c", "getNotificationId", "d", "getMetadataString", "e", "getNotificationType", "f", "I", "getPriority", "g", "getOriginalPriority", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotificationAckInput extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public final long receivedTime;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String notificationId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String metadataString;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String notificationType;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            public final int priority;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            public final int originalPriority;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotificationAckInput(@NotNull String deviceId, long j10, @NotNull String notificationId, @Nullable String str, @Nullable String str2, int i10, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                Intrinsics.checkNotNullParameter(notificationId, "notificationId");
                this.deviceId = deviceId;
                this.receivedTime = j10;
                this.notificationId = notificationId;
                this.metadataString = str;
                this.notificationType = str2;
                this.priority = i10;
                this.originalPriority = i11;
            }

            @NotNull
            public androidx.work.b a() {
                Pair[] pairArr = {s.a("deviceId", this.deviceId), s.a("receivedTime", Long.valueOf(this.receivedTime)), s.a("notificationId", this.notificationId), s.a("metadata", this.metadataString), s.a("notificationType", this.notificationType), s.a("priority", Integer.valueOf(this.priority)), s.a("originalPriority", Integer.valueOf(this.originalPriority))};
                androidx.work.b.a aVar = new androidx.work.b.a();
                for (int i10 = 0; i10 < 7; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                return aVar.a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationAckInput)) {
                    return false;
                }
                NotificationAckInput notificationAckInput = (NotificationAckInput) other;
                return Intrinsics.c(this.deviceId, notificationAckInput.deviceId) && this.receivedTime == notificationAckInput.receivedTime && Intrinsics.c(this.notificationId, notificationAckInput.notificationId) && Intrinsics.c(this.metadataString, notificationAckInput.metadataString) && Intrinsics.c(this.notificationType, notificationAckInput.notificationType) && this.priority == notificationAckInput.priority && this.originalPriority == notificationAckInput.originalPriority;
            }

            public int hashCode() {
                int iHashCode = ((((this.deviceId.hashCode() * 31) + Long.hashCode(this.receivedTime)) * 31) + this.notificationId.hashCode()) * 31;
                String str = this.metadataString;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.notificationType;
                return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.priority)) * 31) + Integer.hashCode(this.originalPriority);
            }

            @NotNull
            public String toString() {
                return "NotificationAckInput(deviceId=" + this.deviceId + ", receivedTime=" + this.receivedTime + ", notificationId=" + this.notificationId + ", metadataString=" + this.metadataString + ", notificationType=" + this.notificationType + ", priority=" + this.priority + ", originalPriority=" + this.originalPriority + ")";
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "userId", "", "channels", "", "changedChannels", "<init>", "(Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V", "Landroidx/work/b;", "a", "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "b", "J", "getUserId", "()J", "c", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "d", "Ljava/util/List;", "getChangedChannels", "()Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SettingChangeInput extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public final long userId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> channels;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> changedChannels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SettingChangeInput(@NotNull String deviceId, long j10, @NotNull Map<String, String> channels, @NotNull List<String> changedChannels) {
                super(null);
                Intrinsics.checkNotNullParameter(deviceId, "deviceId");
                Intrinsics.checkNotNullParameter(channels, "channels");
                Intrinsics.checkNotNullParameter(changedChannels, "changedChannels");
                this.deviceId = deviceId;
                this.userId = j10;
                this.channels = channels;
                this.changedChannels = changedChannels;
            }

            @NotNull
            public androidx.work.b a() {
                Pair[] pairArr = {s.a("deviceId", this.deviceId), s.a("userId", Long.valueOf(this.userId)), s.a("channelNames", this.channels.keySet().toArray(new String[0])), s.a("channelEnabledValues", this.channels.values().toArray(new String[0])), s.a("changedChannels", this.changedChannels.toArray(new String[0]))};
                androidx.work.b.a aVar = new androidx.work.b.a();
                for (int i10 = 0; i10 < 5; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                return aVar.a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingChangeInput)) {
                    return false;
                }
                SettingChangeInput settingChangeInput = (SettingChangeInput) other;
                return Intrinsics.c(this.deviceId, settingChangeInput.deviceId) && this.userId == settingChangeInput.userId && Intrinsics.c(this.channels, settingChangeInput.channels) && Intrinsics.c(this.changedChannels, settingChangeInput.changedChannels);
            }

            public int hashCode() {
                return (((((this.deviceId.hashCode() * 31) + Long.hashCode(this.userId)) * 31) + this.channels.hashCode()) * 31) + this.changedChannels.hashCode();
            }

            @NotNull
            public String toString() {
                return "SettingChangeInput(deviceId=" + this.deviceId + ", userId=" + this.userId + ", channels=" + this.channels + ", changedChannels=" + this.changedChannels + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @f(c = "com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker", f = "NotificationPushAckWorker.kt", l = {74}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9308t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9309u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9310v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9311w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9312x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9313y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9314z;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return NotificationPushAckWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationPushAckWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.workerParams = workerParams;
    }

    public final androidx.work.c.a b(Throwable e10) {
        if (!(e10 instanceof m)) {
            if (e10 instanceof IOException) {
                androidx.work.c.a aVarC = androidx.work.c.a.c();
                Intrinsics.checkNotNullExpressionValue(aVarC, "retry(...)");
                return aVarC;
            }
            androidx.work.c.a aVarA = androidx.work.c.a.a();
            Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
            return aVarA;
        }
        int iA = ((m) e10).a();
        if ((500 > iA || iA >= 600) && iA != 429) {
            androidx.work.c.a aVarA2 = androidx.work.c.a.a();
            Intrinsics.checkNotNull(aVarA2);
            return aVarA2;
        }
        androidx.work.c.a aVarC2 = androidx.work.c.a.c();
        Intrinsics.checkNotNull(aVarC2);
        return aVarC2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull nt.b<? super androidx.work.c.a> bVar) {
        c cVar;
        Object objB;
        String str;
        Map mapT;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.C = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objA = cVar.A;
        Object objE = ot.c.e();
        int i11 = cVar.C;
        try {
            if (i11 == 0) {
                o.b(objA);
                if (this.workerParams.g() > 5) {
                    androidx.work.c.a aVarA = androidx.work.c.a.a();
                    Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                    return aVarA;
                }
                NotificationPushAckParams notificationPushAckParams = new NotificationPushAckParams(this.workerParams.d().e());
                String deviceId = notificationPushAckParams.getDeviceId();
                if (deviceId == null) {
                    p.e("NotificationOSSettingChangeReportingWorker", "Device ID is missing in input data");
                    androidx.work.c.a aVarA2 = androidx.work.c.a.a();
                    Intrinsics.checkNotNullExpressionValue(aVarA2, "failure(...)");
                    return aVarA2;
                }
                Long userId = notificationPushAckParams.getUserId();
                long jLongValue = userId != null ? userId.longValue() : -1L;
                String[] channelEnabledValues = notificationPushAckParams.getChannelEnabledValues();
                if (channelEnabledValues == null) {
                    mapT = null;
                } else {
                    String[] channelNames = notificationPushAckParams.getChannelNames();
                    List listN0 = channelNames != null ? kotlin.collections.m.n0(channelNames, channelEnabledValues) : null;
                    if (listN0 != null) {
                        mapT = k0.t(listN0);
                    } else {
                        mapT = null;
                    }
                }
                String[] changedChannels = notificationPushAckParams.getChangedChannels();
                PushReceiveAckPostBody pushReceiveAckPostBody = new PushReceiveAckPostBody(notificationPushAckParams.getNotificationId(), notificationPushAckParams.getMetadata(), notificationPushAckParams.getReceivedTime(), deviceId, "AndroidNative", jLongValue, notificationPushAckParams.getNotificationType(), notificationPushAckParams.getPriority(), notificationPushAckParams.getOriginalPriority(), mapT, changedChannels != null ? kotlin.collections.m.j0(changedChannels) : null);
                l2.b(getApplicationContext());
                vk.b bVarC = g.c();
                i iVarC = g.d().c(bVarC);
                n.Companion companion = n.INSTANCE;
                cVar.f9308t = pt.l.a(notificationPushAckParams);
                cVar.f9309u = pt.l.a(iVarC);
                cVar.f9310v = pt.l.a(notificationPushAckParams);
                cVar.f9311w = pt.l.a(bVarC);
                cVar.f9312x = pt.l.a(pushReceiveAckPostBody);
                cVar.f9313y = 0;
                cVar.f9314z = 0;
                cVar.C = 1;
                objA = iVarC.a(pushReceiveAckPostBody, cVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objA);
            }
            objB = n.b((ResponseBody) objA);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            if (thE instanceof m) {
                m mVar = (m) thE;
                str = "HTTP " + mVar.a() + ": " + mVar.c();
            } else if (thE instanceof IOException) {
                str = "Network error: " + thE.getMessage();
            } else {
                str = "Unexpected error: " + thE.getMessage();
            }
            p.f("NotificationOSSettingChangeReportingWorker", str, thE);
        }
        Throwable thE2 = n.e(objB);
        if (thE2 != null) {
            return b(thE2);
        }
        androidx.work.c.a aVarD = androidx.work.c.a.d();
        Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
        return aVarD;
    }
}
