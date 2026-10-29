package com.roblox.client.startup;

import ak.FetchFlagResult;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.ZstdOutputStream;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.universalapp.logging.LoggingProtocol;
import gk.v;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jt.h;
import jt.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.x;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001jB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020!H\u0007¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020!H\u0007¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020!H\u0007¢\u0006\u0004\b0\u0010\u0003J\u0019\u00101\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b1\u0010\u0016J\u001f\u00102\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b2\u0010%J\u0017\u00104\u001a\u00020!2\u0006\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u0010\u0010J\u0019\u00107\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010DJ\u0018\u0010F\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@¢\u0006\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010IR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010IR\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010IR\u0014\u0010O\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010IR\u0014\u0010P\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020\u001f8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010IR\u0014\u0010b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010IR\u0014\u0010c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010IR\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010h¨\u0006k"}, d2 = {"Lcom/roblox/client/startup/FlagCacheUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "fileName", "Ljava/io/File;", "getFlagCacheFileByName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getLegacyCacheFile", "Lcom/roblox/client/startup/b$b;", Payload.RESPONSE, "", "writeToFlagCacheFile", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z", "", "input", "compressZstd", "([B)[B", "readAndBurnFlagCache", "(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;", "readAndBurnVersionBFlagCache", "cacheFile", "burnFlagCache", "(Landroid/content/Context;Ljava/io/File;)Z", "", "lastWriteTime", "checkCacheExpiry", "(Landroid/content/Context;Ljava/io/File;J)Z", "", "expiryTimeMinutes", "", "setFlagCacheExpiry", "(Landroid/content/Context;I)V", "storePendingVersionBWrite", "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V", "flushPendingVersionBWrite", "(Landroid/content/Context;)V", "getLastCacheOutcomeValue", "()Ljava/lang/String;", "Lcom/roblox/client/startup/FlagCacheUtils$a;", "outcome", "recordVersionBCacheOutcome", "(Lcom/roblox/client/startup/FlagCacheUtils$a;)V", "flushPendingVersionBTelemetry", "recordRetryDialogShown", "flushRetryDialogTelemetry", "tryLoadVersionBCache", "writeVersionBCacheFromResponse", "errorMessage", "sendVersionBCacheWriteErrorEvent", "(Ljava/lang/String;)V", "writeUncompressedFlagCacheFile", "readVersionBCachedChannel", "(Landroid/content/Context;)Ljava/lang/String;", "channel", "writeVersionBCachedChannel", "(Landroid/content/Context;Ljava/lang/String;)V", "wasVersionBCacheWrittenByWorker", "(Landroid/content/Context;)Z", "byWorker", "setVersionBCacheWrittenByWorker", "(Landroid/content/Context;Z)V", "cachedChannel", "currentChannel", "isChannelMismatch", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lak/f0;", "scheduledFetchFlag", "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME", "DEFAULT_FLAG_CACHE_FILE_NAME", "DEFAULT_FLAG_CACHE_VB_FILE_NAME", "DEFAULT_FLAG_CACHE_BACKUP_FILE_NAME", "FLAG_CACHE_EXPIRY_MINUTES_KEY", "FLAG_CACHE_PREFS_NAME", "FLAG_CACHE_COMPRESSION_TYPE_NONE", "I", "FLAG_CACHE_COMPRESSION_TYPE_ZSTD_WITHOUT_DICTIONARY", "Lku/p0;", "backgroundScope", "Lku/p0;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBWrite", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingVersionBTelemetryOutcome", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRetryDialogShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "homePageAlreadyLoaded", "", "standardFields", "Ljava/util/List;", "FLAG_CACHE_CHANNEL_KEY", "FLAG_CACHE_WRITTEN_BY_WORKER_KEY", "PRODUCTION_CHANNEL_NAME", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter$delegate", "Ljt/h;", "getRetryDialogCounter", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "retryDialogCounter", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FlagCacheUtils {

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_BACKUP_FILE_NAME = "flag_cache_backup.dat";

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_FILE_NAME = "flag_cache.dat";

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME = "cache";

    @NotNull
    private static final String DEFAULT_FLAG_CACHE_VB_FILE_NAME = "flag_cache_vb.dat";

    @NotNull
    private static final String FLAG_CACHE_CHANNEL_KEY = "versionBCachedChannelName";
    private static final int FLAG_CACHE_COMPRESSION_TYPE_NONE = 0;
    private static final int FLAG_CACHE_COMPRESSION_TYPE_ZSTD_WITHOUT_DICTIONARY = 1;

    @NotNull
    private static final String FLAG_CACHE_EXPIRY_MINUTES_KEY = "FlagCacheExpiryTimeMinutes";

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
    private static final AtomicReference<com.roblox.client.startup.b.C0149b> pendingVersionBWrite = new AtomicReference<>(null);

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
    private static final h retryDialogCounter = i.b(new Function0() { // from class: ak.g0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlagCacheUtils.retryDialogCounter_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/roblox/client/startup/FlagCacheUtils$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "h", "i", "j", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        SUCCESS("success"),
        MISS_NO_CACHED_CHANNEL("miss_no_cached_channel"),
        MISS_CHANNEL_MISMATCH("miss_channel_mismatch"),
        MISS_NO_FILE("miss_no_file"),
        MISS_EXPIRED("miss_expired"),
        MISS_LEGACY_FORMAT("miss_legacy_format"),
        MISS_READ_ERROR("miss_read_error"),
        MISS_BURN_FAILED("miss_burn_failed"),
        MISS_NETWORK_WON("miss_network_won");


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ qt.a f9407l = qt.b.a(a());

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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.startup.FlagCacheUtils$flushPendingVersionBWrite$1", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9409t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.roblox.client.startup.b.C0149b f9410u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9411v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.roblox.client.startup.b.C0149b c0149b, Context context, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f9410u = c0149b;
            this.f9411v = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f9410u, this.f9411v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9409t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            FlagCacheUtils.writeVersionBCacheFromResponse(this.f9410u, this.f9411v);
            if (th.h.a().n3()) {
                FlagCacheUtils.INSTANCE.setVersionBCacheWrittenByWorker(this.f9411v, false);
            }
            Log.i(FlagCacheUtils.TAG, "[VersionB] Pending write flushed.");
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lak/f0;", "<anonymous>", "(Lku/p0;)Lak/f0;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.startup.FlagCacheUtils$scheduledFetchFlag$2", f = "FlagCacheUtils.kt", l = {137}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super FetchFlagResult>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9412t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9413u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f9414v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9415w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f9416x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f9416x = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f9416x, bVar);
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.startup.FlagCacheUtils.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super FetchFlagResult> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$1", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9417t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9418u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f9418u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f9418u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9417t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f9418u);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.startup.FlagCacheUtils$storePendingVersionBWrite$2", f = "FlagCacheUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9419t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9420u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, nt.b<? super e> bVar) {
            super(2, bVar);
            this.f9420u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new e(this.f9420u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9419t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            FlagCacheUtils.flushPendingVersionBWrite(this.f9420u);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    private FlagCacheUtils() {
    }

    public static final boolean burnFlagCache(@NotNull Context context, @NotNull File cacheFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        File flagCacheFileByName = INSTANCE.getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_BACKUP_FILE_NAME);
        flagCacheFileByName.delete();
        if (!cacheFile.renameTo(flagCacheFileByName)) {
            Log.e(TAG, "Error burning flag cache file: rename failed");
            return false;
        }
        if (!cacheFile.exists()) {
            return true;
        }
        Log.e(TAG, "Error burning flag cache file: original file still exists after rename");
        return false;
    }

    public static final boolean checkCacheExpiry(@NotNull Context context, @NotNull File cacheFile, long lastWriteTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        SharedPreferences sharedPreferences = context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0);
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        long jP = kotlin.time.b.p(sharedPreferences.getInt(FLAG_CACHE_EXPIRY_MINUTES_KEY, -1), ju.b.MINUTES);
        if (kotlin.time.a.w(jP) < 0) {
            Log.i(TAG, "Flag cache expiry time not set, skipping expiry check.");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - lastWriteTime <= kotlin.time.a.w(jP)) {
            Log.d(TAG, "Flag cache file is still valid. Continuing to use cached flags.");
            return true;
        }
        Log.i(TAG, "Flag cache file has expired. Last write time: " + lastWriteTime + ", Current time: " + jCurrentTimeMillis + ", Expiry time (ms): " + kotlin.time.a.w(jP));
        return false;
    }

    private final byte[] compressZstd(byte[] input) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ZstdOutputStream zstdOutputStream = new ZstdOutputStream(byteArrayOutputStream, 5);
            try {
                zstdOutputStream.write(input);
                Unit unit = Unit.f22483a;
                ut.c.a(zstdOutputStream, null);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ut.c.a(zstdOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            Log.e(TAG, "Zstd compression error: " + e10.getMessage(), e10);
            return null;
        }
    }

    public static final void flushPendingVersionBTelemetry() {
        a andSet = pendingVersionBTelemetryOutcome.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending telemetry outcome to flush.");
            return;
        }
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(th.h.a().x4()).setEventName("VersionBFlagCacheOutcome").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(o.d(Pair.create("cacheOutcome", andSet.getValue()))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.j(robloxTelemetryEventBuild);
        Log.i(TAG, "[VersionB] Telemetry flushed: outcome=" + andSet.getValue());
    }

    public static final void flushPendingVersionBWrite(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        homePageAlreadyLoaded.set(true);
        com.roblox.client.startup.b.C0149b andSet = pendingVersionBWrite.getAndSet(null);
        if (andSet == null) {
            Log.i(TAG, "[VersionB] No pending write to flush.");
        } else {
            k.d(backgroundScope, null, null, new b(andSet, context, null), 3, null);
        }
    }

    public static final void flushRetryDialogTelemetry() {
        if (th.h.a().m1() && pendingRetryDialogShown.getAndSet(false)) {
            sm.c.f(INSTANCE.getRetryDialogCounter(), 0.0d, 2, null);
            Log.i(TAG, "Retry dialog telemetry flushed.");
        }
    }

    private final File getFlagCacheFileByName(Context context, String fileName) {
        File file = new File(th.h.a().s1() ? context.getFilesDir() : context.getCacheDir(), DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME);
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

    private final boolean isChannelMismatch(String cachedChannel, String currentChannel) {
        boolean z10 = cachedChannel.length() == 0 || x.E(cachedChannel, PRODUCTION_CHANNEL_NAME, true);
        boolean z11 = currentChannel.length() == 0 || x.E(currentChannel, PRODUCTION_CHANNEL_NAME, true);
        return (z10 == z11 && (z10 || z11 || x.E(cachedChannel, currentChannel, true))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0137 A[RETURN] */
    @Nullable
    public static final com.roblox.client.startup.b.C0149b readAndBurnFlagCache(@NotNull Context context) {
        com.roblox.client.startup.b.C0149b c0149b;
        com.roblox.client.startup.b.C0149b c0149b2;
        Intrinsics.checkNotNullParameter(context, "context");
        File flagCacheFileByName = INSTANCE.getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_FILE_NAME);
        long jLastModified = flagCacheFileByName.lastModified();
        if (th.h.a().W5() && !checkCacheExpiry(context, flagCacheFileByName, jLastModified)) {
            burnFlagCache(context, flagCacheFileByName);
            return new com.roblox.client.startup.b.C0149b("", "", jLastModified);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream(flagCacheFileByName);
            try {
                FileLock fileLockLock = fileInputStream.getChannel().lock(0L, Long.MAX_VALUE, true);
                try {
                    byte[] bArr = new byte[4];
                    if (fileInputStream.read(bArr) != 4) {
                        Log.e(TAG, "Error reading flag cache file: insufficient data for signature length");
                    } else {
                        int i10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        byte[] bArr2 = new byte[i10];
                        if (fileInputStream.read(bArr2) == i10) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            String str = new String(bArr2, UTF_8);
                            if (th.h.a().i2()) {
                                int i11 = fileInputStream.read();
                                if (i11 != -1) {
                                    byte[] bArrC = ut.b.c(fileInputStream);
                                    if (i11 == 0) {
                                        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                        c0149b2 = new com.roblox.client.startup.b.C0149b(new String(bArrC, UTF_8), str, jLastModified);
                                    } else if (i11 != 1) {
                                        Log.e(TAG, "Error reading flag cache file: unknown compression type " + i11);
                                    } else {
                                        c0149b = new com.roblox.client.startup.b.C0149b(bArrC, str, jLastModified);
                                    }
                                    xt.a.a(fileLockLock, null);
                                    ut.c.a(fileInputStream, null);
                                    Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                                    if (burnFlagCache(context, flagCacheFileByName)) {
                                        return c0149b;
                                    }
                                    return null;
                                }
                                Log.e(TAG, "Error reading flag cache file: insufficient data for compression type");
                            } else {
                                byte[] bArrC2 = ut.b.c(fileInputStream);
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                c0149b2 = new com.roblox.client.startup.b.C0149b(new String(bArrC2, UTF_8), str, jLastModified);
                            }
                            c0149b = c0149b2;
                            xt.a.a(fileLockLock, null);
                            ut.c.a(fileInputStream, null);
                            Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                            if (burnFlagCache(context, flagCacheFileByName)) {
                                return null;
                            }
                            return c0149b;
                        }
                        Log.e(TAG, "Error reading flag cache file: insufficient data for signature");
                    }
                    c0149b = null;
                    xt.a.a(fileLockLock, null);
                    ut.c.a(fileInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        xt.a.a(fileLockLock, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ut.c.a(fileInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            Log.e(TAG, "Error reading flag cache file: " + e10.getMessage());
            c0149b = null;
        }
        Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        if (burnFlagCache(context, flagCacheFileByName)) {
            return null;
        }
        return c0149b;
    }

    private final com.roblox.client.startup.b.C0149b readAndBurnVersionBFlagCache(Context context) {
        com.roblox.client.startup.b.C0149b c0149b;
        File legacyCacheFile;
        File flagCacheFileByName = getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME);
        if (th.h.a().s1() && !flagCacheFileByName.exists() && (legacyCacheFile = getLegacyCacheFile(context, DEFAULT_FLAG_CACHE_VB_FILE_NAME)) != null) {
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
        long jW = kotlin.time.a.w(kotlin.time.b.p(6, ju.b.HOURS));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jLastModified > jW) {
            Log.i(TAG, "[VersionB] Flag cache expired. lastWrite=" + jLastModified + " current=" + jCurrentTimeMillis + " expiryMs=" + jW);
            flagCacheFileByName.delete();
            return new com.roblox.client.startup.b.C0149b("", "", jLastModified);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        try {
            c0149b = new com.roblox.client.startup.b.C0149b(ut.i.h(flagCacheFileByName, Charsets.UTF_8), "", jLastModified);
        } catch (IOException e10) {
            Log.e(TAG, "[VersionB] Error reading cache file: " + e10.getMessage());
            recordVersionBCacheOutcome(a.MISS_READ_ERROR);
            c0149b = null;
        }
        Log.i(TAG, "[FlagCache] Flag cache file read took " + (System.currentTimeMillis() - jCurrentTimeMillis2) + " ms");
        if (flagCacheFileByName.delete()) {
            return c0149b;
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
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("AndroidRetryDialogShown", kotlin.collections.p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Counts when the flag prefetch retry dialog is shown to the user");
        return aVar.d();
    }

    private final void sendVersionBCacheWriteErrorEvent(String errorMessage) {
        RobloxTelemetryEvent robloxTelemetryEventBuild = RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(o.d(RobloxTelemetryEventConfig.POINTS_BACKEND)).setThrottlingHundredthPercentage(th.h.a().x4()).setEventName("VersionBFlagCacheWriteError").build()).setData(RobloxTelemetryEventData.builder().setCustomStringFields(o.d(Pair.create("errorMessage", errorMessage))).build()).build();
        Intrinsics.checkNotNull(robloxTelemetryEventBuild);
        LoggingProtocol.j(robloxTelemetryEventBuild);
        Log.i(TAG, "[VersionB] Write error telemetry sent: " + errorMessage);
    }

    public static final void setFlagCacheExpiry(@NotNull Context context, int expiryTimeMinutes) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(FLAG_CACHE_EXPIRY_MINUTES_KEY, expiryTimeMinutes);
        editorEdit.apply();
        Log.i(TAG, "Set flag cache expiry time to " + expiryTimeMinutes + " minutes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersionBCacheWrittenByWorker(Context context, boolean byWorker) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(FLAG_CACHE_WRITTEN_BY_WORKER_KEY, byWorker);
        editorEdit.apply();
    }

    public static final void storePendingVersionBWrite(@NotNull com.roblox.client.startup.b.C0149b response, @NotNull Context context) {
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
            if (!th.h.a().i0() || v.a(context).equals("foreground")) {
                return;
            }
            Log.i(TAG, "[VersionB] Background launch; flushing cache write immediately.");
            k.d(backgroundScope, null, null, new e(context, null), 3, null);
        }
    }

    @Nullable
    public static final com.roblox.client.startup.b.C0149b tryLoadVersionBCache(@NotNull Context context) {
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
        com.roblox.client.startup.b.C0149b andBurnVersionBFlagCache = flagCacheUtils.readAndBurnVersionBFlagCache(context);
        if (andBurnVersionBFlagCache == null) {
            return null;
        }
        if (andBurnVersionBFlagCache.f()) {
            Log.i(TAG, "[VersionB] Skipping legacy compressed cache; will refresh from CDN.");
            recordVersionBCacheOutcome(a.MISS_LEGACY_FORMAT);
            return null;
        }
        String strD = andBurnVersionBFlagCache.d();
        if (strD != null) {
            if (strD.length() <= 0) {
                strD = null;
            }
            if (strD != null) {
                return new com.roblox.client.startup.b.C0149b(strD, andBurnVersionBFlagCache.e(), andBurnVersionBFlagCache.b());
            }
        }
        Log.i(TAG, "[VersionB] Flag cache body is empty (expired).");
        recordVersionBCacheOutcome(a.MISS_EXPIRED);
        return null;
    }

    public static final boolean wasVersionBCacheWrittenByWorker(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (th.h.a().n3()) {
            return context.getSharedPreferences(FLAG_CACHE_PREFS_NAME, 0).getBoolean(FLAG_CACHE_WRITTEN_BY_WORKER_KEY, false);
        }
        return false;
    }

    public static final boolean writeToFlagCacheFile(@Nullable com.roblox.client.startup.b.C0149b response, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Log.i(TAG, "Writing flag cache files");
        String strD = response != null ? response.d() : null;
        if (strD == null || strD.length() == 0) {
            Log.e(TAG, "Error writing flag cache file: response body is null or empty");
            return false;
        }
        FlagCacheUtils flagCacheUtils = INSTANCE;
        File flagCacheFileByName = flagCacheUtils.getFlagCacheFileByName(context, DEFAULT_FLAG_CACHE_FILE_NAME);
        String strE = response.e();
        Intrinsics.checkNotNull(strE);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = strE.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(bytes.length).array();
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes2 = strD.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        boolean zZ0 = th.h.a().z0();
        File parentFile = flagCacheFileByName.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(flagCacheFileByName);
            try {
                FileLock fileLockLock = fileOutputStream.getChannel().lock();
                try {
                    fileOutputStream.getChannel().truncate(0L);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    bufferedOutputStream.write(bArrArray);
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.write(zZ0 ? 1 : 0);
                    if (th.h.a().z0()) {
                        byte[] bArrCompressZstd = flagCacheUtils.compressZstd(bytes2);
                        if (bArrCompressZstd == null) {
                            Log.e(TAG, "Error writing flag cache file: zstd compression failed");
                            xt.a.a(fileLockLock, null);
                            ut.c.a(fileOutputStream, null);
                            return false;
                        }
                        Log.i(TAG, "Compressed flag cache payload: " + bytes2.length + " -> " + bArrCompressZstd.length + " bytes");
                        bufferedOutputStream.write(bArrCompressZstd);
                    } else {
                        bufferedOutputStream.write(bytes2);
                    }
                    bufferedOutputStream.flush();
                    Unit unit = Unit.f22483a;
                    xt.a.a(fileLockLock, null);
                    ut.c.a(fileOutputStream, null);
                    Log.i(TAG, "Wrote flag cache successfully to " + flagCacheFileByName.getAbsolutePath());
                    return true;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        xt.a.a(fileLockLock, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ut.c.a(fileOutputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e10) {
            Log.e(TAG, "Error writing flag cache file: " + e10.getMessage(), e10);
            return false;
        }
    }

    private final boolean writeUncompressedFlagCacheFile(com.roblox.client.startup.b.C0149b response, Context context) {
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
                    ut.i.j(flagCacheFileByName, strD, Charsets.UTF_8);
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

    public static final void writeVersionBCacheFromResponse(@NotNull com.roblox.client.startup.b.C0149b response, @NotNull Context context) {
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
    public final Object scheduledFetchFlag(@NotNull Context context, @NotNull nt.b<? super FetchFlagResult> bVar) {
        return ku.i.g(g1.b(), new c(context, null), bVar);
    }
}
