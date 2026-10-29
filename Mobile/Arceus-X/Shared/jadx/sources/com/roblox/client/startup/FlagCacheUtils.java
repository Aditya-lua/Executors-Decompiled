package com.roblox.client.startup;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.Charsets;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ak.FetchFlagResult;
import p151gk.C6130w;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p230ju.EnumC7361b;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p477ut.C11964i;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sg.C11295a1;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001UB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u000eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020%H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020%2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010:R\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010:R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010:R\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006V"}, m31665d2 = {"Lcom/roblox/client/startup/FlagCacheUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileName", "Ljava/io/File;", "getFlagCacheFileByName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getLegacyCacheFile", "Lcom/roblox/client/startup/b$b;", "readAndBurnVersionBFlagCache", "(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;", Payload.RESPONSE, "", "storePendingVersionBWrite", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V", "flushPendingVersionBWrite", "(Landroid/content/Context;)V", "getLastCacheOutcomeValue", "()Ljava/lang/String;", "Lcom/roblox/client/startup/FlagCacheUtils$a;", "outcome", "recordVersionBCacheOutcome", "(Lcom/roblox/client/startup/FlagCacheUtils$a;)V", "flushPendingVersionBTelemetry", "recordRetryDialogShown", "flushRetryDialogTelemetry", "getVersionBCacheChannelMiss", "(Landroid/content/Context;)Lcom/roblox/client/startup/FlagCacheUtils$a;", "tryLoadVersionBCache", "writeVersionBCacheFromResponse", "errorMessage", "sendVersionBCacheWriteErrorEvent", "(Ljava/lang/String;)V", "", "writeUncompressedFlagCacheFile", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z", "readVersionBCachedChannel", "(Landroid/content/Context;)Ljava/lang/String;", "channel", "writeVersionBCachedChannel", "(Landroid/content/Context;Ljava/lang/String;)V", "wasVersionBCacheWrittenByWorker", "(Landroid/content/Context;)Z", "byWorker", "setVersionBCacheWrittenByWorker", "(Landroid/content/Context;Z)V", "cachedChannel", "currentChannel", "isChannelMismatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lak/f0;", "scheduledFetchFlag", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME", "DEFAULT_FLAG_CACHE_VB_FILE_NAME", "FLAG_CACHE_PREFS_NAME", "Lku/p0;", "backgroundScope", "Lku/p0;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBWrite", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBTelemetryOutcome", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRetryDialogShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "homePageAlreadyLoaded", "", "standardFields", "Ljava/util/List;", "FLAG_CACHE_CHANNEL_KEY", "FLAG_CACHE_WRITTEN_BY_WORKER_KEY", "PRODUCTION_CHANNEL_NAME", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter$delegate", "Ljt/h;", "getRetryDialogCounter", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class FlagCacheUtils {

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME = "cache";

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_VB_FILE_NAME = "flag_cache_vb.dat";

    @NotNull
    private static final String FLAG_CACHE_CHANNEL_KEY = "versionBCachedChannelName";

    @NotNull
    private static final String FLAG_CACHE_PREFS_NAME = "cached_flag_prefs";

    @NotNull
    private static final String FLAG_CACHE_WRITTEN_BY_WORKER_KEY = "versionBCacheWrittenByWorker";

    @NotNull
    private static final String PRODUCTION_CHANNEL_NAME = "production";

    @NotNull
    private static final String TAG = "FlagCacheUtils";

    @NotNull
    public static final FlagCacheUtils INSTANCE = new FlagCacheUtils();

    @NotNull
    private static final InterfaceC7906p0 backgroundScope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32644b()));

    @NotNull
    private static final AtomicReference<C3273b.b> pendingVersionBWrite = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<EnumC3259a> pendingVersionBTelemetryOutcome = new AtomicReference<>(null);

    @NotNull
    private static final AtomicBoolean pendingRetryDialogShown = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean homePageAlreadyLoaded = new AtomicBoolean(false);

    @NotNull
    private static final List<String> standardFields = C7697o.m31878d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);

    /* JADX INFO: renamed from: retryDialogCounter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h retryDialogCounter = C7342i.m30456b(new Function0() { // from class: ak.g0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlagCacheUtils.retryDialogCounter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.roblox.client.startup.FlagCacheUtils$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/startup/FlagCacheUtils$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3259a {
        SUCCESS("success"),
        MISS_NO_CACHED_CHANNEL("miss_no_cached_channel"),
        MISS_CHANNEL_MISMATCH("miss_channel_mismatch"),
        MISS_NO_FILE("miss_no_file"),
        MISS_EXPIRED("miss_expired"),
        MISS_READ_ERROR("miss_read_error"),
        MISS_BURN_FAILED("miss_burn_failed"),
        MISS_NETWORK_WON("miss_network_won");


        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ InterfaceC10707a f12270k = C10708b.m40805a(m15544a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String value;

        EnumC3259a(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.FlagCacheUtils$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.FlagCacheUtils$flushPendingVersionBWrite$1", m39664f = "FlagCacheUtils.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3260b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12272t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3273b.b f12273u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f12274v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3260b(C3273b.b bVar, Context context, InterfaceC9557b<? super C3260b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12273u = bVar;
            this.f12274v = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3260b(this.f12273u, this.f12274v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12272t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            FlagCacheUtils.writeVersionBCacheFromResponse(this.f12273u, this.f12274v);
            if (C11659h.m43403a().mo43726t3()) {
                FlagCacheUtils.INSTANCE.setVersionBCacheWrittenByWorker(this.f12274v, false);
            }
            Log.i(FlagCacheUtils.TAG, "[VersionB] Pending write flushed.");
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3260b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.FlagCacheUtils$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lak/f0;", "<anonymous>", "(Lku/p0;)Lak/f0;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.FlagCacheUtils$scheduledFetchFlag$2", m39664f = "FlagCacheUtils.kt", m39665l = {121}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3261c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super FetchFlagResult>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12275t;

        /* JADX INFO: renamed from: u */
        public int f12276u;

        /* JADX INFO: renamed from: v */
        public long f12277v;

        /* JADX INFO: renamed from: w */
        public int f12278w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Context f12279x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3261c(Context context, InterfaceC9557b<? super C3261c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12279x = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3261c(this.f12279x, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0031  */
        /* JADX WARN: Code duplicated, block: B:12:0x0053  */
        /* JADX WARN: Code duplicated, block: B:19:0x0088 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:56:0x007a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:9:0x002f->B:60:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:20:0x0089). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r10.f12278w
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                long r4 = r10.f12277v
                int r1 = r10.f12276u
                java.lang.Object r6 = r10.f12275t
                com.roblox.client.startup.b$b r6 = (com.roblox.client.startup.C3273b.b) r6
                p229jt.C7348o.m30470b(r11)
                r11 = r1
                r1 = r6
                goto L89
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                p229jt.C7348o.m30470b(r11)
                kotlin.time.a$a r11 = kotlin.time.C7800a.INSTANCE
                ju.b r11 = p230ju.EnumC7361b.SECONDS
                long r4 = kotlin.time.C7801b.m32371p(r3, r11)
                r11 = 5
                r1 = r2
            L2f:
                if (r11 <= 0) goto L8f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "Attempting to fetch flags, retries left: "
                r1.append(r6)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                java.lang.String r6 = "FlagCacheUtils"
                android.util.Log.i(r6, r1)
                android.content.Context r1 = r10.f12279x
                com.roblox.client.startup.b$b r1 = com.roblox.client.startup.C3273b.m15723b(r1)
                java.lang.String r7 = r1.m15739d()
                if (r7 == 0) goto L76
                int r7 = r7.length()
                if (r7 <= 0) goto L76
                java.lang.String r11 = r1.m15739d()
                int r11 = r11.length()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "Successfully fetched flags. Response size: "
                r0.append(r4)
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                android.util.Log.i(r6, r11)
                goto L8f
            L76:
                int r11 = r11 + (-1)
                if (r11 <= 0) goto L2f
                r10.f12275t = r1
                r10.f12276u = r11
                r10.f12277v = r4
                r10.f12278w = r3
                java.lang.Object r6 = p256ku.C7946z0.m32939c(r4, r10)
                if (r6 != r0) goto L89
                return r0
            L89:
                r6 = 2
                long r4 = kotlin.time.C7800a.m32329O(r4, r6)
                goto L2f
            L8f:
                if (r1 == 0) goto L96
                java.lang.String r11 = r1.m15739d()
                goto L97
            L96:
                r11 = r2
            L97:
                r0 = 0
                if (r11 == 0) goto L148
                int r11 = r11.length()
                if (r11 != 0) goto La2
                goto L148
            La2:
                android.content.Context r11 = r10.f12279x
                com.roblox.client.startup.FlagCacheUtils.writeVersionBCacheFromResponse(r1, r11)
                com.roblox.client.startup.FlagCacheUtils r11 = com.roblox.client.startup.FlagCacheUtils.INSTANCE
                android.content.Context r4 = r10.f12279x
                com.roblox.client.startup.FlagCacheUtils.access$setVersionBCacheWrittenByWorker(r11, r4, r3)
                th.i r11 = th.C11659h.m43403a()
                boolean r11 = r11.mo43605c4()
                if (r11 == 0) goto L12d
                if (r1 == 0) goto Lbf
                org.json.JSONObject r11 = r1.m15738c()
                goto Lc0
            Lbf:
                r11 = r2
            Lc0:
                if (r11 == 0) goto L12d
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                th.f r5 = th.C11657f.f41211a
                th.i r6 = th.C11659h.m43403a()
                java.lang.String r7 = "get(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
                kotlin.sequences.Sequence r5 = r5.m43396m(r6)
                java.util.Iterator r5 = r5.iterator()
            Lda:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L117
                java.lang.Object r6 = r5.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r6 = r6.getValue()
                com.roblox.client.flags.a r6 = (com.roblox.client.flags.C3187a) r6
                boolean r8 = r11.has(r7)
                if (r8 == 0) goto Lda
                java.lang.String r8 = r6.mo15124b()
                java.lang.Object r6 = r6.m15126d()
                java.lang.String r9 = "initial(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                boolean r6 = r11.optBoolean(r7, r6)
                java.lang.Boolean r6 = pt.C10340b.m39658a(r6)
                r4.put(r8, r6)
                goto Lda
            L117:
                boolean r11 = r4.isEmpty()
                if (r11 != 0) goto L12d
                th.f r11 = th.C11657f.f41211a
                android.content.Context r5 = r10.f12279x
                android.content.SharedPreferences r5 = sg.C11295a1.m42422U(r5)
                java.lang.String r6 = "getKeyValues(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                r11.m43394j(r4, r5, r3)
            L12d:
                if (r1 == 0) goto L13a
                org.json.JSONObject r11 = r1.m15738c()
                if (r11 == 0) goto L13a
                android.content.Context r4 = r10.f12279x
                vg.C12177g.m45076b(r11, r4)
            L13a:
                ak.f0 r11 = new ak.f0
                if (r1 == 0) goto L143
                org.json.JSONObject r1 = r1.m15738c()
                goto L144
            L143:
                r1 = r2
            L144:
                r11.<init>(r1, r3, r0, r2)
                return r11
            L148:
                ak.f0 r11 = new ak.f0
                java.lang.String r1 = "Error fetching flags: response body is empty after retries"
                r11.<init>(r2, r0, r3, r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.startup.FlagCacheUtils.C3261c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super FetchFlagResult> interfaceC9557b) {
            return ((C3261c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.FlagCacheUtils$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$1", m39664f = "FlagCacheUtils.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3262d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12280t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f12281u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3262d(Context context, InterfaceC9557b<? super C3262d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12281u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3262d(this.f12281u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12280t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f12281u);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3262d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.FlagCacheUtils$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$2", m39664f = "FlagCacheUtils.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3263e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12282t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f12283u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3263e(Context context, InterfaceC9557b<? super C3263e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12283u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3263e(this.f12283u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12282t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f12283u);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3263e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    private FlagCacheUtils() {
    }

    public static final void flushPendingVersionBTelemetry() {
        EnumC3259a andSet = pendingVersionBTelemetryOutcome.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending telemetry outcome to flush.");
            return;
        }
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(C7697o.m31878d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(C11659h.m43403a().mo43423C4()).setEventName("VersionBFlagCacheOutcome").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(C7697o.m31878d(Pair.create("cacheOutcome", andSet.getValue()))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.m15997j(robloxTelemetryEventBuild);
        Log.i(TAG, "[VersionB] Telemetry flushed: outcome=" + andSet.getValue());
    }

    public static final void flushPendingVersionBWrite(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        homePageAlreadyLoaded.set(true);
        C3273b.b andSet = pendingVersionBWrite.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending write to flush.");
        } else {
            C7882k.m32780d(backgroundScope, null, null, new C3260b(andSet, context, null), 3, null);
        }
    }

    public static final void flushRetryDialogTelemetry() {
        if (C11659h.m43403a().mo43710r1() && pendingRetryDialogShown.getAndSet(false)) {
            C11416c.m42770f(INSTANCE.getRetryDialogCounter(), 0.0d, 2, null);
            Log.i(TAG, "Retry dialog telemetry flushed.");
        }
    }

    private final File getFlagCacheFileByName(Context context, String fileName) {
        File file = new File(C11659h.m43403a().mo43752x1() ? context.getFilesDir() : context.getCacheDir(), DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, fileName);
    }

    @NotNull
    public static final String getLastCacheOutcomeValue() {
        String value;
        EnumC3259a enumC3259a = pendingVersionBTelemetryOutcome.get();
        return (enumC3259a == null || (value = enumC3259a.getValue()) == null) ? EnvironmentCompat.MEDIA_UNKNOWN : value;
    }

    private final File getLegacyCacheFile(Context context, String fileName) {
        File file = new File(new File(context.getCacheDir(), DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME), fileName);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    private final TelemetryConfig getRetryDialogCounter() {
        return (TelemetryConfig) retryDialogCounter.getValue();
    }

    @Nullable
    public static final EnumC3259a getVersionBCacheChannelMiss(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FlagCacheUtils flagCacheUtils = INSTANCE;
        String versionBCachedChannel = flagCacheUtils.readVersionBCachedChannel(context);
        if (versionBCachedChannel == null) {
            return EnumC3259a.MISS_NO_CACHED_CHANNEL;
        }
        String strM42426W = C11295a1.m42426W();
        Intrinsics.checkNotNullExpressionValue(strM42426W, "getRobloxChannel(...)");
        if (flagCacheUtils.isChannelMismatch(versionBCachedChannel, strM42426W)) {
            return EnumC3259a.MISS_CHANNEL_MISMATCH;
        }
        return null;
    }

    private final boolean isChannelMismatch(String cachedChannel, String currentChannel) {
        boolean z10 = cachedChannel.length() == 0 || C7797x.m32294E(cachedChannel, PRODUCTION_CHANNEL_NAME, true);
        boolean z11 = currentChannel.length() == 0 || C7797x.m32294E(currentChannel, PRODUCTION_CHANNEL_NAME, true);
        return (z10 == z11 && (z10 || z11 || C7797x.m32294E(cachedChannel, currentChannel, true))) ? false : true;
    }

    private final C3273b.b readAndBurnVersionBFlagCache(Context context) {
        C3273b.b bVar;
        File legacyCacheFile;
        File flagCacheFileByName = getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME);
        if (C11659h.m43403a().mo43752x1() && !flagCacheFileByName.exists() && (legacyCacheFile = getLegacyCacheFile(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME)) != null) {
            Log.i(TAG, "[VersionB] Migrating cache file from legacy cacheDir location.");
            flagCacheFileByName = legacyCacheFile;
        }
        if (!flagCacheFileByName.exists()) {
            Log.i(TAG, "[VersionB] No cache file found.");
            recordVersionBCacheOutcome(EnumC3259a.MISS_NO_FILE);
            return null;
        }
        long jLastModified = flagCacheFileByName.lastModified();
        C7800a.Companion companion = C7800a.INSTANCE;
        long jM32348w = C7800a.m32348w(C7801b.m32371p(6, EnumC7361b.HOURS));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLastModified > jM32348w) {
            Log.i(TAG, "[VersionB] Flag cache expired. lastWrite=" + jLastModified + " current=" + jCurrentTimeMillis + " expiryMs=" + jM32348w);
            flagCacheFileByName.delete();
            return new C3273b.b("", "", jLastModified);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            bVar = new C3273b.b(C11964i.m44650h(flagCacheFileByName, Charsets.UTF_8), "", jLastModified);
        } catch (IOException e10) {
            Log.e(TAG, "[VersionB] Error reading cache file: " + e10.getMessage());
            recordVersionBCacheOutcome(EnumC3259a.MISS_READ_ERROR);
            bVar = null;
        }
        Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " ms");
        if (flagCacheFileByName.delete()) {
            return bVar;
        }
        recordVersionBCacheOutcome(EnumC3259a.MISS_BURN_FAILED);
        return null;
    }

    private final String readVersionBCachedChannel(Context context) {
        return context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0).getString(FLAG_CACHE_CHANNEL_KEY, null);
    }

    public static final void recordRetryDialogShown() {
        pendingRetryDialogShown.set(true);
    }

    public static final void recordVersionBCacheOutcome(@NotNull EnumC3259a outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        pendingVersionBTelemetryOutcome.set(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TelemetryConfig retryDialogCounter_delegate$lambda$0() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("AndroidRetryDialogShown", C7700p0.m31904c(TelemetryBackend.COUNTER));
        aVar.mo42755b(2026, 6, 10);
        aVar.mo42754a("Counts when the flag prefetch retry dialog is shown to the user");
        return aVar.m42774d();
    }

    private final void sendVersionBCacheWriteErrorEvent(String errorMessage) {
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(C7697o.m31878d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(C11659h.m43403a().mo43423C4()).setEventName("VersionBFlagCacheWriteError").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(C7697o.m31878d(Pair.create("errorMessage", errorMessage))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.m15997j(robloxTelemetryEventBuild);
        Log.i(TAG, "[VersionB] Write error telemetry sent: " + errorMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersionBCacheWrittenByWorker(Context context, boolean byWorker) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(FLAG_CACHE_WRITTEN_BY_WORKER_KEY, byWorker);
        editorEdit.apply();
    }

    public static final void storePendingVersionBWrite(@NotNull C3273b.b response, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        String strM15739d = response.m15739d();
        if (strM15739d == null || strM15739d.length() == 0) {
            Log.e(TAG, "[VersionB] Pending write skipped: empty response.");
            return;
        }
        pendingVersionBWrite.set(response);
        Log.i(TAG, "[VersionB] Network payload stored.");
        if (homePageAlreadyLoaded.get()) {
            Log.i(TAG, "[VersionB] LUA_HOME_PAGE_LOADED already fired; flushing immediately.");
            C7882k.m32780d(backgroundScope, null, null, new C3262d(context, null), 3, null);
        } else {
            if (!C11659h.m43403a().mo43674m0() || C6130w.m27099a(context).equals("foreground")) {
                return;
            }
            Log.i(TAG, "[VersionB] Background launch; flushing cache write immediately.");
            C7882k.m32780d(backgroundScope, null, null, new C3263e(context, null), 3, null);
        }
    }

    @Nullable
    public static final C3273b.b tryLoadVersionBCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM42426W = C11295a1.m42426W();
        FlagCacheUtils flagCacheUtils = INSTANCE;
        String versionBCachedChannel = flagCacheUtils.readVersionBCachedChannel(context);
        if (versionBCachedChannel == null) {
            Log.i(TAG, "[VersionB] No cached channel in SharedPreferences; treating as miss.");
            recordVersionBCacheOutcome(EnumC3259a.MISS_NO_CACHED_CHANNEL);
            return null;
        }
        Intrinsics.checkNotNull(strM42426W);
        if (flagCacheUtils.isChannelMismatch(versionBCachedChannel, strM42426W)) {
            Log.e(TAG, "[VersionB] Channel mismatch: cached='" + versionBCachedChannel + "' current='" + strM42426W + "'");
            recordVersionBCacheOutcome(EnumC3259a.MISS_CHANNEL_MISMATCH);
            return null;
        }
        Log.i(TAG, "[VersionB] Channel match: cached='" + versionBCachedChannel + "' current='" + strM42426W + "'");
        C3273b.b andBurnVersionBFlagCache = flagCacheUtils.readAndBurnVersionBFlagCache(context);
        if (andBurnVersionBFlagCache == null) {
            return null;
        }
        String strM15739d = andBurnVersionBFlagCache.m15739d();
        if (strM15739d != null) {
            if (strM15739d.length() <= 0) {
                strM15739d = null;
            }
            if (strM15739d != null) {
                return new C3273b.b(strM15739d, andBurnVersionBFlagCache.m15740e(), andBurnVersionBFlagCache.m15737b());
            }
        }
        Log.i(TAG, "[VersionB] Flag cache body is empty (expired).");
        recordVersionBCacheOutcome(EnumC3259a.MISS_EXPIRED);
        return null;
    }

    public static final boolean wasVersionBCacheWrittenByWorker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C11659h.m43403a().mo43726t3()) {
            return context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0).getBoolean(FLAG_CACHE_WRITTEN_BY_WORKER_KEY, false);
        }
        return false;
    }

    private final boolean writeUncompressedFlagCacheFile(C3273b.b response, Context context) {
        String strM15739d = response.m15739d();
        if (strM15739d != null) {
            if (strM15739d.length() <= 0) {
                strM15739d = null;
            }
            if (strM15739d != null) {
                File flagCacheFileByName = getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME);
                File parentFile = flagCacheFileByName.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    if (C11659h.m43403a().mo43623e6()) {
                        File fileCreateTempFile = File.createTempFile(DEFAULT_FLAG_CACHE_VB_FILE_NAME, ".tmp", flagCacheFileByName.getParentFile());
                        try {
                            Intrinsics.checkNotNull(fileCreateTempFile);
                            C11964i.m44652j(fileCreateTempFile, strM15739d, Charsets.UTF_8);
                            if (!fileCreateTempFile.renameTo(flagCacheFileByName)) {
                                throw new IOException("Failed to rename " + fileCreateTempFile.getName() + " to " + flagCacheFileByName.getName());
                            }
                            fileCreateTempFile.delete();
                        } catch (Throwable th2) {
                            fileCreateTempFile.delete();
                            throw th2;
                        }
                    } else {
                        C11964i.m44652j(flagCacheFileByName, strM15739d, Charsets.UTF_8);
                    }
                    Log.i(TAG, "[VersionB] Wrote uncompressed cache: " + strM15739d.length() + " chars to " + flagCacheFileByName.getAbsolutePath());
                    return true;
                } catch (IOException e10) {
                    Log.e(TAG, "[VersionB] Error writing uncompressed cache: " + e10.getMessage(), e10);
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "unknown IOException";
                    }
                    sendVersionBCacheWriteErrorEvent(message);
                }
            }
        }
        return false;
    }

    public static final void writeVersionBCacheFromResponse(@NotNull C3273b.b response, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        String strM15739d = response.m15739d();
        if (strM15739d == null || strM15739d.length() == 0) {
            Log.e(TAG, "[VersionB] Cache write skipped: empty response.");
            return;
        }
        LoggingProtocol.m16000m("vb_cache_write_begin", null, 2, null);
        FlagCacheUtils flagCacheUtils = INSTANCE;
        if (!flagCacheUtils.writeUncompressedFlagCacheFile(response, context)) {
            Log.e(TAG, "[VersionB] Cache write failed.");
            return;
        }
        String strM42426W = C11295a1.m42426W();
        Intrinsics.checkNotNullExpressionValue(strM42426W, "getRobloxChannel(...)");
        flagCacheUtils.writeVersionBCachedChannel(context, strM42426W);
        LoggingProtocol.m16000m("vb_cache_write_end", null, 2, null);
        Log.i(TAG, "[VersionB] Cache write complete.");
    }

    private final void writeVersionBCachedChannel(Context context, String channel) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(FLAG_CACHE_CHANNEL_KEY, channel);
        editorEdit.apply();
    }

    @Nullable
    public final Object scheduledFetchFlag(@NotNull Context context, @NotNull InterfaceC9557b<? super FetchFlagResult> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32644b(), new C3261c(context, null), interfaceC9557b);
    }
}
