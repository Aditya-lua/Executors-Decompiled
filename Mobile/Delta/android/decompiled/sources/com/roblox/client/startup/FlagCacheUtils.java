package com.roblox.client.startup;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.w;
import gt.h;
import gt.i;
import iu.g1;
import iu.k;
import iu.p0;
import iu.q0;
import iu.z2;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.x;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.a1;
import yj.FetchFlagResult;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001UB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001d\u0010\u0003J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u000eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020%H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020%2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010:R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010:R\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010:R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010:R\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/roblox/client/startup/FlagCacheUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileName", "Ljava/io/File;", "getFlagCacheFileByName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getLegacyCacheFile", "Lcom/roblox/client/startup/b$b;", "readAndBurnVersionBFlagCache", "(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;", Payload.RESPONSE, "", "storePendingVersionBWrite", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V", "flushPendingVersionBWrite", "(Landroid/content/Context;)V", "getLastCacheOutcomeValue", "()Ljava/lang/String;", "Lcom/roblox/client/startup/FlagCacheUtils$a;", "outcome", "recordVersionBCacheOutcome", "(Lcom/roblox/client/startup/FlagCacheUtils$a;)V", "flushPendingVersionBTelemetry", "recordRetryDialogShown", "flushRetryDialogTelemetry", "getVersionBCacheChannelMiss", "(Landroid/content/Context;)Lcom/roblox/client/startup/FlagCacheUtils$a;", "tryLoadVersionBCache", "writeVersionBCacheFromResponse", "errorMessage", "sendVersionBCacheWriteErrorEvent", "(Ljava/lang/String;)V", "", "writeUncompressedFlagCacheFile", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z", "readVersionBCachedChannel", "(Landroid/content/Context;)Ljava/lang/String;", "channel", "writeVersionBCachedChannel", "(Landroid/content/Context;Ljava/lang/String;)V", "wasVersionBCacheWrittenByWorker", "(Landroid/content/Context;)Z", "byWorker", "setVersionBCacheWrittenByWorker", "(Landroid/content/Context;Z)V", "cachedChannel", "currentChannel", "isChannelMismatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lyj/f0;", "scheduledFetchFlag", "(Landroid/content/Context;Llt/b;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME", "DEFAULT_FLAG_CACHE_VB_FILE_NAME", "FLAG_CACHE_PREFS_NAME", "Liu/p0;", "backgroundScope", "Liu/p0;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBWrite", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBTelemetryOutcome", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRetryDialogShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "homePageAlreadyLoaded", "", "standardFields", "Ljava/util/List;", "FLAG_CACHE_CHANNEL_KEY", "FLAG_CACHE_WRITTEN_BY_WORKER_KEY", "PRODUCTION_CHANNEL_NAME", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter$delegate", "Lgt/h;", "getRetryDialogCounter", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    private static final p0 backgroundScope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    @NotNull
    private static final AtomicReference<com.roblox.client.startup.b.C0152b> pendingVersionBWrite = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<a> pendingVersionBTelemetryOutcome = new AtomicReference<>(null);

    @NotNull
    private static final AtomicBoolean pendingRetryDialogShown = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean homePageAlreadyLoaded = new AtomicBoolean(false);

    @NotNull
    private static final List<String> standardFields = o.d(RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO);

    /* JADX INFO: renamed from: retryDialogCounter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h retryDialogCounter = i.b(new Function0() { // from class: yj.g0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlagCacheUtils.retryDialogCounter_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/startup/FlagCacheUtils$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        SUCCESS("success"),
        MISS_NO_CACHED_CHANNEL("miss_no_cached_channel"),
        MISS_CHANNEL_MISMATCH("miss_channel_mismatch"),
        MISS_NO_FILE("miss_no_file"),
        MISS_EXPIRED("miss_expired"),
        MISS_READ_ERROR("miss_read_error"),
        MISS_BURN_FAILED("miss_burn_failed"),
        MISS_NETWORK_WON("miss_network_won");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ ot.a f9486k = ot.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        a(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @f(c = "com.roblox.client.startup.FlagCacheUtils$flushPendingVersionBWrite$1", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9488t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.startup.b.C0152b f9489u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9490v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.startup.b.C0152b c0152b, Context context, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f9489u = c0152b;
            this.f9490v = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f9489u, this.f9490v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9488t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            FlagCacheUtils.writeVersionBCacheFromResponse(this.f9489u, this.f9490v);
            if (rh.h.a().x3()) {
                FlagCacheUtils.INSTANCE.setVersionBCacheWrittenByWorker(this.f9490v, false);
            }
            Log.i(FlagCacheUtils.TAG, "[VersionB] Pending write flushed.");
            return Unit.f22938a;
        }
    }

    @f(c = "com.roblox.client.startup.FlagCacheUtils$scheduledFetchFlag$2", f = "FlagCacheUtils.kt", l = {121}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lyj/f0;", "<anonymous>", "(Liu/p0;)Lyj/f0;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super FetchFlagResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9491t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9492u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f9493v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9494w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f9495x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f9495x = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f9495x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super FetchFlagResult> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
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
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.startup.FlagCacheUtils.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$1", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9496t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9497u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f9497u = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f9497u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9496t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f9497u);
            return Unit.f22938a;
        }
    }

    @f(c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$2", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9498t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9499u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, lt.b<? super e> bVar) {
            super(2, bVar);
            this.f9499u = context;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(this.f9499u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9498t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f9499u);
            return Unit.f22938a;
        }
    }

    private FlagCacheUtils() {
    }

    public static final void flushPendingVersionBTelemetry() {
        a andSet = pendingVersionBTelemetryOutcome.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending telemetry outcome to flush.");
            return;
        }
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(rh.h.a().J4()).setEventName("VersionBFlagCacheOutcome").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(o.d(Pair.create("cacheOutcome", andSet.getValue()))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.j(robloxTelemetryEventBuild);
        Log.i(TAG, "[VersionB] Telemetry flushed: outcome=" + andSet.getValue());
    }

    public static final void flushPendingVersionBWrite(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        homePageAlreadyLoaded.set(true);
        com.roblox.client.startup.b.C0152b andSet = pendingVersionBWrite.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending write to flush.");
        } else {
            k.d(backgroundScope, null, null, new b(andSet, context, null), 3, null);
        }
    }

    public static final void flushRetryDialogTelemetry() {
        if (rh.h.a().v1() && pendingRetryDialogShown.getAndSet(false)) {
            qm.c.f(INSTANCE.getRetryDialogCounter(), 0.0d, 2, null);
            Log.i(TAG, "Retry dialog telemetry flushed.");
        }
    }

    private final File getFlagCacheFileByName(Context context, String fileName) {
        File file = new File(rh.h.a().B1() ? context.getFilesDir() : context.getCacheDir(), DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, fileName);
    }

    @NotNull
    public static final String getLastCacheOutcomeValue() {
        String value;
        a aVar = pendingVersionBTelemetryOutcome.get();
        return (aVar == null || (value = aVar.getValue()) == null) ? "unknown" : value;
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
    public static final a getVersionBCacheChannelMiss(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FlagCacheUtils flagCacheUtils = INSTANCE;
        String versionBCachedChannel = flagCacheUtils.readVersionBCachedChannel(context);
        if (versionBCachedChannel == null) {
            return a.MISS_NO_CACHED_CHANNEL;
        }
        String strW = a1.W();
        Intrinsics.checkNotNullExpressionValue(strW, "getRobloxChannel(...)");
        if (flagCacheUtils.isChannelMismatch(versionBCachedChannel, strW)) {
            return a.MISS_CHANNEL_MISMATCH;
        }
        return null;
    }

    private final boolean isChannelMismatch(String cachedChannel, String currentChannel) {
        boolean z10 = cachedChannel.length() == 0 || x.E(cachedChannel, PRODUCTION_CHANNEL_NAME, true);
        boolean z11 = currentChannel.length() == 0 || x.E(currentChannel, PRODUCTION_CHANNEL_NAME, true);
        return (z10 == z11 && (z10 || z11 || x.E(cachedChannel, currentChannel, true))) ? false : true;
    }

    private final com.roblox.client.startup.b.C0152b readAndBurnVersionBFlagCache(Context context) {
        com.roblox.client.startup.b.C0152b c0152b;
        File legacyCacheFile;
        File flagCacheFileByName = getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME);
        if (rh.h.a().B1() && !flagCacheFileByName.exists() && (legacyCacheFile = getLegacyCacheFile(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME)) != null) {
            Log.i(TAG, "[VersionB] Migrating cache file from legacy cacheDir location.");
            flagCacheFileByName = legacyCacheFile;
        }
        if (!flagCacheFileByName.exists()) {
            Log.i(TAG, "[VersionB] No cache file found.");
            recordVersionBCacheOutcome(a.MISS_NO_FILE);
            return null;
        }
        long jLastModified = flagCacheFileByName.lastModified();
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        long jW = kotlin.time.a.w(kotlin.time.b.p(6, hu.b.HOURS));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLastModified > jW) {
            Log.i(TAG, "[VersionB] Flag cache expired. lastWrite=" + jLastModified + " current=" + jCurrentTimeMillis + " expiryMs=" + jW);
            flagCacheFileByName.delete();
            return new com.roblox.client.startup.b.C0152b("", "", jLastModified);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            c0152b = new com.roblox.client.startup.b.C0152b(st.i.h(flagCacheFileByName, Charsets.UTF_8), "", jLastModified);
        } catch (IOException e10) {
            Log.e(TAG, "[VersionB] Error reading cache file: " + e10.getMessage());
            recordVersionBCacheOutcome(a.MISS_READ_ERROR);
            c0152b = null;
        }
        Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " ms");
        if (flagCacheFileByName.delete()) {
            return c0152b;
        }
        recordVersionBCacheOutcome(a.MISS_BURN_FAILED);
        return null;
    }

    private final String readVersionBCachedChannel(Context context) {
        return context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0).getString(FLAG_CACHE_CHANNEL_KEY, null);
    }

    public static final void recordRetryDialogShown() {
        pendingRetryDialogShown.set(true);
    }

    public static final void recordVersionBCacheOutcome(@NotNull a outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        pendingVersionBTelemetryOutcome.set(outcome);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TelemetryConfig retryDialogCounter_delegate$lambda$0() {
        qm.c cVar = qm.c.f29983a;
        qm.c.a aVar = new qm.c.a("AndroidRetryDialogShown", kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Counts when the flag prefetch retry dialog is shown to the user");
        return aVar.d();
    }

    private final void sendVersionBCacheWriteErrorEvent(String errorMessage) {
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(rh.h.a().J4()).setEventName("VersionBFlagCacheWriteError").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(o.d(Pair.create("errorMessage", errorMessage))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.j(robloxTelemetryEventBuild);
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

    public static final void storePendingVersionBWrite(@NotNull com.roblox.client.startup.b.C0152b response, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        String strD = response.d();
        if (strD == null || strD.length() == 0) {
            Log.e(TAG, "[VersionB] Pending write skipped: empty response.");
            return;
        }
        pendingVersionBWrite.set(response);
        Log.i(TAG, "[VersionB] Network payload stored.");
        if (homePageAlreadyLoaded.get()) {
            Log.i(TAG, "[VersionB] LUA_HOME_PAGE_LOADED already fired; flushing immediately.");
            k.d(backgroundScope, null, null, new d(context, null), 3, null);
        } else {
            if (!rh.h.a().n0() || w.a(context).equals("foreground")) {
                return;
            }
            Log.i(TAG, "[VersionB] Background launch; flushing cache write immediately.");
            k.d(backgroundScope, null, null, new e(context, null), 3, null);
        }
    }

    @Nullable
    public static final com.roblox.client.startup.b.C0152b tryLoadVersionBCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strW = a1.W();
        FlagCacheUtils flagCacheUtils = INSTANCE;
        String versionBCachedChannel = flagCacheUtils.readVersionBCachedChannel(context);
        if (versionBCachedChannel == null) {
            Log.i(TAG, "[VersionB] No cached channel in SharedPreferences; treating as miss.");
            recordVersionBCacheOutcome(a.MISS_NO_CACHED_CHANNEL);
            return null;
        }
        Intrinsics.checkNotNull(strW);
        if (flagCacheUtils.isChannelMismatch(versionBCachedChannel, strW)) {
            Log.e(TAG, "[VersionB] Channel mismatch: cached='" + versionBCachedChannel + "' current='" + strW + "'");
            recordVersionBCacheOutcome(a.MISS_CHANNEL_MISMATCH);
            return null;
        }
        Log.i(TAG, "[VersionB] Channel match: cached='" + versionBCachedChannel + "' current='" + strW + "'");
        com.roblox.client.startup.b.C0152b andBurnVersionBFlagCache = flagCacheUtils.readAndBurnVersionBFlagCache(context);
        if (andBurnVersionBFlagCache == null) {
            return null;
        }
        String strD = andBurnVersionBFlagCache.d();
        if (strD != null) {
            if (strD.length() <= 0) {
                strD = null;
            }
            if (strD != null) {
                return new com.roblox.client.startup.b.C0152b(strD, andBurnVersionBFlagCache.e(), andBurnVersionBFlagCache.b());
            }
        }
        Log.i(TAG, "[VersionB] Flag cache body is empty (expired).");
        recordVersionBCacheOutcome(a.MISS_EXPIRED);
        return null;
    }

    public static final boolean wasVersionBCacheWrittenByWorker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (rh.h.a().x3()) {
            return context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0).getBoolean(FLAG_CACHE_WRITTEN_BY_WORKER_KEY, false);
        }
        return false;
    }

    private final boolean writeUncompressedFlagCacheFile(com.roblox.client.startup.b.C0152b response, Context context) {
        String strD = response.d();
        if (strD != null) {
            if (strD.length() <= 0) {
                strD = null;
            }
            if (strD != null) {
                File flagCacheFileByName = getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME);
                File parentFile = flagCacheFileByName.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                try {
                    if (rh.h.a().h6()) {
                        File fileCreateTempFile = File.createTempFile(DEFAULT_FLAG_CACHE_VB_FILE_NAME, ".tmp", flagCacheFileByName.getParentFile());
                        try {
                            Intrinsics.checkNotNull(fileCreateTempFile);
                            st.i.j(fileCreateTempFile, strD, Charsets.UTF_8);
                            if (!fileCreateTempFile.renameTo(flagCacheFileByName)) {
                                throw new IOException("Failed to rename " + fileCreateTempFile.getName() + " to " + flagCacheFileByName.getName());
                            }
                            fileCreateTempFile.delete();
                        } catch (Throwable th2) {
                            fileCreateTempFile.delete();
                            throw th2;
                        }
                    } else {
                        st.i.j(flagCacheFileByName, strD, Charsets.UTF_8);
                    }
                    Log.i(TAG, "[VersionB] Wrote uncompressed cache: " + strD.length() + " chars to " + flagCacheFileByName.getAbsolutePath());
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

    public static final void writeVersionBCacheFromResponse(@NotNull com.roblox.client.startup.b.C0152b response, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(context, "context");
        String strD = response.d();
        if (strD == null || strD.length() == 0) {
            Log.e(TAG, "[VersionB] Cache write skipped: empty response.");
            return;
        }
        LoggingProtocol.m("vb_cache_write_begin", null, 2, null);
        FlagCacheUtils flagCacheUtils = INSTANCE;
        if (!flagCacheUtils.writeUncompressedFlagCacheFile(response, context)) {
            Log.e(TAG, "[VersionB] Cache write failed.");
            return;
        }
        String strW = a1.W();
        Intrinsics.checkNotNullExpressionValue(strW, "getRobloxChannel(...)");
        flagCacheUtils.writeVersionBCachedChannel(context, strW);
        LoggingProtocol.m("vb_cache_write_end", null, 2, null);
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
    public final Object scheduledFetchFlag(@NotNull Context context, @NotNull lt.b<? super FetchFlagResult> bVar) {
        return iu.i.g(g1.b(), new c(context, null), bVar);
    }
}
