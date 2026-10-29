package com.roblox.client.pushnotification.ossettingsreporting;

import al.PushReceiveAckPostBody;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import hu.InterfaceC6576l;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7686i0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7754u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ak.C0311l2;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p231jv.C7385m;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12220b;
import p493vk.C12225g;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import p607zk.InterfaceC13829i;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0003\u0011\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "e", "b", "(Ljava/lang/Throwable;)Landroidx/work/c$a;", "a", "Landroidx/work/WorkerParameters;", "NotificationPushAckParams", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NotificationPushAckWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters workerParams;

    @Keep
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u000b\u0010\f*\u0004\b\t\u0010\nR#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011*\u0004\b\u000f\u0010\nR#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0014\u0010\u0011*\u0004\b\u0013\u0010\nR#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0017\u0010\u0011*\u0004\b\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001a\u0010\f*\u0004\b\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u001d\u0010\f*\u0004\b\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b \u0010\f*\u0004\b\u001f\u0010\nR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006-"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;", "", "data", "", "", "<init>", "(Ljava/util/Map;)V", "delegate", "deviceId", "getDeviceId$delegate", "(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;", "getDeviceId", "()Ljava/lang/String;", "channelNames", "", "getChannelNames$delegate", "getChannelNames", "()[Ljava/lang/String;", "channelEnabledValues", "getChannelEnabledValues$delegate", "getChannelEnabledValues", "changedChannels", "getChangedChannels$delegate", "getChangedChannels", "notificationId", "getNotificationId$delegate", "getNotificationId", "metadata", "getMetadata$delegate", "getMetadata", "notificationType", "getNotificationType$delegate", "getNotificationType", "userId", "", "getUserId", "()Ljava/lang/Long;", "receivedTime", "getReceivedTime", "priority", "", "getPriority", "()Ljava/lang/Integer;", "originalPriority", "getOriginalPriority", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class NotificationPushAckParams {
        static final /* synthetic */ InterfaceC6576l<Object>[] $$delegatedProperties = {C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "deviceId", "getDeviceId()Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "channelNames", "getChannelNames()[Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "channelEnabledValues", "getChannelEnabledValues()[Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "changedChannels", "getChangedChannels()[Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "notificationId", "getNotificationId()Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "metadata", "getMetadata()Ljava/lang/String;", 0)), C7731d0.m32007g(new C7754u(NotificationPushAckParams.class, "notificationType", "getNotificationType()Ljava/lang/String;", 0))};

        @NotNull
        private final Map<String, Object> delegate;

        public NotificationPushAckParams(@NotNull Map<String, ? extends Object> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.delegate = C7686i0.m31783b(data, new Function1() { // from class: com.roblox.client.pushnotification.ossettingsreporting.a
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
            return (String[]) C7686i0.m31782a(this.delegate, $$delegatedProperties[3].getName());
        }

        @Nullable
        public final String[] getChannelEnabledValues() {
            return (String[]) C7686i0.m31782a(this.delegate, $$delegatedProperties[2].getName());
        }

        @Nullable
        public final String[] getChannelNames() {
            return (String[]) C7686i0.m31782a(this.delegate, $$delegatedProperties[1].getName());
        }

        @Nullable
        public final String getDeviceId() {
            return (String) C7686i0.m31782a(this.delegate, $$delegatedProperties[0].getName());
        }

        @Nullable
        public final String getMetadata() {
            return (String) C7686i0.m31782a(this.delegate, $$delegatedProperties[5].getName());
        }

        @Nullable
        public final String getNotificationId() {
            return (String) C7686i0.m31782a(this.delegate, $$delegatedProperties[4].getName());
        }

        @Nullable
        public final String getNotificationType() {
            return (String) C7686i0.m31782a(this.delegate, $$delegatedProperties[6].getName());
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
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "input", "", "b", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "a", "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V", "", "MAX_RETRY_COUNT", "I", "", "SETTINGS_CHANGE_WORK_NAME", "Ljava/lang/String;", "ACK_CALL_WORK_NAME", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15441a(@NotNull Context appContext, @NotNull AbstractC3236b.NotificationAckInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            C6124q.m27063h("NotificationOSSettingChangeReportingWorker", "Scheduling Push Ack Work");
            C12738z c12738zM47409b = new C12738z.a(NotificationPushAckWorker.class).m47416k(new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47345a()).m47420o(input.m15443a()).m47409b();
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("NotificationPushAckWorkUniqueWork", EnumC12706j.APPEND_OR_REPLACE, c12738zM47409b);
        }

        /* JADX INFO: renamed from: b */
        public final void m15442b(@NotNull Context appContext, @NotNull AbstractC3236b.SettingChangeInput input) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(input, "input");
            C6124q.m27063h("NotificationOSSettingChangeReportingWorker", "Scheduling OS Notification Setting Change Reporting Work");
            C12738z c12738zM47409b = new C12738z.a(NotificationPushAckWorker.class).m47416k(new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47345a()).m47420o(input.m15444a()).m47409b();
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("NotificationOSSettingChangeReportingWorkerUniqueWork", EnumC12706j.REPLACE, c12738zM47409b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "<init>", "()V", "b", "a", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3236b {

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0014¨\u0006+"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "receivedTime", "notificationId", "metadataString", "notificationType", "", "priority", "originalPriority", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/work/b;", "a", "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "b", "J", "getReceivedTime", "()J", "c", "getNotificationId", "d", "getMetadataString", "e", "getNotificationType", "f", "I", "getPriority", "g", "getOriginalPriority", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class NotificationAckInput extends AbstractC3236b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public final long receivedTime;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final String notificationId;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @Nullable
            public final String metadataString;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @Nullable
            public final String notificationType;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            public final int priority;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
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
            /* JADX INFO: renamed from: a */
            public C1116b m15443a() {
                Pair[] pairArr = {C7352s.m30477a("deviceId", this.deviceId), C7352s.m30477a("receivedTime", Long.valueOf(this.receivedTime)), C7352s.m30477a("notificationId", this.notificationId), C7352s.m30477a("metadata", this.metadataString), C7352s.m30477a("notificationType", this.notificationType), C7352s.m30477a("priority", Integer.valueOf(this.priority)), C7352s.m30477a("originalPriority", Integer.valueOf(this.originalPriority))};
                C1116b.a aVar = new C1116b.a();
                for (int i10 = 0; i10 < 7; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.m6323b((String) pair.m31673c(), pair.m31674d());
                }
                return aVar.m6322a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotificationAckInput)) {
                    return false;
                }
                NotificationAckInput notificationAckInput = (NotificationAckInput) other;
                return Intrinsics.m31980c(this.deviceId, notificationAckInput.deviceId) && this.receivedTime == notificationAckInput.receivedTime && Intrinsics.m31980c(this.notificationId, notificationAckInput.notificationId) && Intrinsics.m31980c(this.metadataString, notificationAckInput.metadataString) && Intrinsics.m31980c(this.notificationType, notificationAckInput.notificationType) && this.priority == notificationAckInput.priority && this.originalPriority == notificationAckInput.originalPriority;
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

        /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$b$b, reason: from toString */
        @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m31665d2 = {"Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;", "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b;", "", "deviceId", "", "userId", "", "channels", "", "changedChannels", "<init>", "(Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V", "Landroidx/work/b;", "a", "()Landroidx/work/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "b", "J", "getUserId", "()J", "c", "Ljava/util/Map;", "getChannels", "()Ljava/util/Map;", "d", "Ljava/util/List;", "getChangedChannels", "()Ljava/util/List;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class SettingChangeInput extends AbstractC3236b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String deviceId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            public final long userId;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final Map<String, String> channels;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
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
            /* JADX INFO: renamed from: a */
            public C1116b m15444a() {
                Pair[] pairArr = {C7352s.m30477a("deviceId", this.deviceId), C7352s.m30477a("userId", Long.valueOf(this.userId)), C7352s.m30477a("channelNames", this.channels.keySet().toArray(new String[0])), C7352s.m30477a("channelEnabledValues", this.channels.values().toArray(new String[0])), C7352s.m30477a("changedChannels", this.changedChannels.toArray(new String[0]))};
                C1116b.a aVar = new C1116b.a();
                for (int i10 = 0; i10 < 5; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.m6323b((String) pair.m31673c(), pair.m31674d());
                }
                return aVar.m6322a();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SettingChangeInput)) {
                    return false;
                }
                SettingChangeInput settingChangeInput = (SettingChangeInput) other;
                return Intrinsics.m31980c(this.deviceId, settingChangeInput.deviceId) && this.userId == settingChangeInput.userId && Intrinsics.m31980c(this.channels, settingChangeInput.channels) && Intrinsics.m31980c(this.changedChannels, settingChangeInput.changedChannels);
            }

            public int hashCode() {
                return (((((this.deviceId.hashCode() * 31) + Long.hashCode(this.userId)) * 31) + this.channels.hashCode()) * 31) + this.changedChannels.hashCode();
            }

            @NotNull
            public String toString() {
                return "SettingChangeInput(deviceId=" + this.deviceId + ", userId=" + this.userId + ", channels=" + this.channels + ", changedChannels=" + this.changedChannels + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3236b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3236b() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker", m39664f = "NotificationPushAckWorker.kt", m39665l = {74}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3237c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f12124A;

        /* JADX INFO: renamed from: C */
        public int f12126C;

        /* JADX INFO: renamed from: t */
        public Object f12127t;

        /* JADX INFO: renamed from: u */
        public Object f12128u;

        /* JADX INFO: renamed from: v */
        public Object f12129v;

        /* JADX INFO: renamed from: w */
        public Object f12130w;

        /* JADX INFO: renamed from: x */
        public Object f12131x;

        /* JADX INFO: renamed from: y */
        public int f12132y;

        /* JADX INFO: renamed from: z */
        public int f12133z;

        public C3237c(InterfaceC9557b<? super C3237c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12124A = obj;
            this.f12126C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
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

    /* JADX INFO: renamed from: b */
    public final AbstractC1117c.a m15439b(Throwable e10) {
        if (!(e10 instanceof C7385m)) {
            if (e10 instanceof IOException) {
                AbstractC1117c.a aVarM6341c = AbstractC1117c.a.m6341c();
                Intrinsics.checkNotNullExpressionValue(aVarM6341c, "retry(...)");
                return aVarM6341c;
            }
            AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
            Intrinsics.checkNotNullExpressionValue(aVarM6339a, "failure(...)");
            return aVarM6339a;
        }
        int iM30587a = ((C7385m) e10).m30587a();
        if ((500 > iM30587a || iM30587a >= 600) && iM30587a != 429) {
            AbstractC1117c.a aVarM6339a2 = AbstractC1117c.a.m6339a();
            Intrinsics.checkNotNull(aVarM6339a2);
            return aVarM6339a2;
        }
        AbstractC1117c.a aVarM6341c2 = AbstractC1117c.a.m6341c();
        Intrinsics.checkNotNull(aVarM6341c2);
        return aVarM6341c2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3237c c3237c;
        Object objM30460b;
        String str;
        Map mapM31805t;
        if (interfaceC9557b instanceof C3237c) {
            c3237c = (C3237c) interfaceC9557b;
            int i10 = c3237c.f12126C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3237c.f12126C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3237c = new C3237c(interfaceC9557b);
            }
        } else {
            c3237c = new C3237c(interfaceC9557b);
        }
        Object objM50309a = c3237c.f12124A;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3237c.f12126C;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objM50309a);
                if (this.workerParams.m6261g() > 5) {
                    AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
                    Intrinsics.checkNotNullExpressionValue(aVarM6339a, "failure(...)");
                    return aVarM6339a;
                }
                NotificationPushAckParams notificationPushAckParams = new NotificationPushAckParams(this.workerParams.m6258d().m6316e());
                String deviceId = notificationPushAckParams.getDeviceId();
                if (deviceId == null) {
                    C6124q.m27060e("NotificationOSSettingChangeReportingWorker", "Device ID is missing in input data");
                    AbstractC1117c.a aVarM6339a2 = AbstractC1117c.a.m6339a();
                    Intrinsics.checkNotNullExpressionValue(aVarM6339a2, "failure(...)");
                    return aVarM6339a2;
                }
                Long userId = notificationPushAckParams.getUserId();
                long jLongValue = userId != null ? userId.longValue() : -1L;
                String[] channelEnabledValues = notificationPushAckParams.getChannelEnabledValues();
                if (channelEnabledValues == null) {
                    mapM31805t = null;
                } else {
                    String[] channelNames = notificationPushAckParams.getChannelNames();
                    List listM31871n0 = channelNames != null ? C7693m.m31871n0(channelNames, channelEnabledValues) : null;
                    if (listM31871n0 != null) {
                        mapM31805t = C7690k0.m31805t(listM31871n0);
                    } else {
                        mapM31805t = null;
                    }
                }
                String[] changedChannels = notificationPushAckParams.getChangedChannels();
                PushReceiveAckPostBody pushReceiveAckPostBody = new PushReceiveAckPostBody(notificationPushAckParams.getNotificationId(), notificationPushAckParams.getMetadata(), notificationPushAckParams.getReceivedTime(), deviceId, "AndroidNative", jLongValue, notificationPushAckParams.getNotificationType(), notificationPushAckParams.getPriority(), notificationPushAckParams.getOriginalPriority(), mapM31805t, changedChannels != null ? C7693m.m31867j0(changedChannels) : null);
                C0311l2.m1315b(getApplicationContext());
                C12220b c12220bM45325c = C12225g.m45325c();
                InterfaceC13829i interfaceC13829iMo45317c = C12225g.m45326d().mo45317c(c12220bM45325c);
                C7347n.Companion companion = C7347n.INSTANCE;
                c3237c.f12127t = C10350l.m39676a(notificationPushAckParams);
                c3237c.f12128u = C10350l.m39676a(interfaceC13829iMo45317c);
                c3237c.f12129v = C10350l.m39676a(notificationPushAckParams);
                c3237c.f12130w = C10350l.m39676a(c12220bM45325c);
                c3237c.f12131x = C10350l.m39676a(pushReceiveAckPostBody);
                c3237c.f12132y = 0;
                c3237c.f12133z = 0;
                c3237c.f12126C = 1;
                objM50309a = interfaceC13829iMo45317c.m50309a(pushReceiveAckPostBody, c3237c);
                if (objM50309a == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM50309a);
            }
            objM30460b = C7347n.m30460b((ResponseBody) objM50309a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            if (thM30463e instanceof C7385m) {
                C7385m c7385m = (C7385m) thM30463e;
                str = "HTTP " + c7385m.m30587a() + ": " + c7385m.m30588c();
            } else if (thM30463e instanceof IOException) {
                str = "Network error: " + thM30463e.getMessage();
            } else {
                str = "Unexpected error: " + thM30463e.getMessage();
            }
            C6124q.m27061f("NotificationOSSettingChangeReportingWorker", str, thM30463e);
        }
        Throwable thM30463e2 = C7347n.m30463e(objM30460b);
        if (thM30463e2 != null) {
            return m15439b(thM30463e2);
        }
        AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
        Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
        return aVarM6342d;
    }
}
