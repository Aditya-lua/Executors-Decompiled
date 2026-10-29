.class public final Lcom/roblox/client/startup/FlagCacheUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/FlagCacheUtils$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001UB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0010H\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008 \u0010\u000eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008!\u0010\u0012J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0019\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u001f\u0010+\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u0010-\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008-\u0010.J\u001f\u00100\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020%H\u0002\u00a2\u0006\u0004\u00080\u00101J\u001f\u00104\u001a\u00020%2\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u00084\u00105J\u0018\u00107\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@\u00a2\u0006\u0004\u00087\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008;\u0010:R\u0014\u0010<\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008<\u0010:R\u0014\u0010=\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008=\u0010:R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170A8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010GR\u001a\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008L\u0010:R\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008M\u0010:R\u0014\u0010N\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008N\u0010:R\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010S\u00a8\u0006V"
    }
    d2 = {
        "Lcom/roblox/client/startup/FlagCacheUtils;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "fileName",
        "Ljava/io/File;",
        "getFlagCacheFileByName",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;",
        "getLegacyCacheFile",
        "Lcom/roblox/client/startup/b$b;",
        "readAndBurnVersionBFlagCache",
        "(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;",
        "response",
        "",
        "storePendingVersionBWrite",
        "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V",
        "flushPendingVersionBWrite",
        "(Landroid/content/Context;)V",
        "getLastCacheOutcomeValue",
        "()Ljava/lang/String;",
        "Lcom/roblox/client/startup/FlagCacheUtils$a;",
        "outcome",
        "recordVersionBCacheOutcome",
        "(Lcom/roblox/client/startup/FlagCacheUtils$a;)V",
        "flushPendingVersionBTelemetry",
        "recordRetryDialogShown",
        "flushRetryDialogTelemetry",
        "getVersionBCacheChannelMiss",
        "(Landroid/content/Context;)Lcom/roblox/client/startup/FlagCacheUtils$a;",
        "tryLoadVersionBCache",
        "writeVersionBCacheFromResponse",
        "errorMessage",
        "sendVersionBCacheWriteErrorEvent",
        "(Ljava/lang/String;)V",
        "",
        "writeUncompressedFlagCacheFile",
        "(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z",
        "readVersionBCachedChannel",
        "(Landroid/content/Context;)Ljava/lang/String;",
        "channel",
        "writeVersionBCachedChannel",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "wasVersionBCacheWrittenByWorker",
        "(Landroid/content/Context;)Z",
        "byWorker",
        "setVersionBCacheWrittenByWorker",
        "(Landroid/content/Context;Z)V",
        "cachedChannel",
        "currentChannel",
        "isChannelMismatch",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "Lak/f0;",
        "scheduledFetchFlag",
        "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;",
        "TAG",
        "Ljava/lang/String;",
        "DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME",
        "DEFAULT_FLAG_CACHE_VB_FILE_NAME",
        "FLAG_CACHE_PREFS_NAME",
        "Lku/p0;",
        "backgroundScope",
        "Lku/p0;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "pendingVersionBWrite",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "pendingVersionBTelemetryOutcome",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "pendingRetryDialogShown",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "homePageAlreadyLoaded",
        "",
        "standardFields",
        "Ljava/util/List;",
        "FLAG_CACHE_CHANNEL_KEY",
        "FLAG_CACHE_WRITTEN_BY_WORKER_KEY",
        "PRODUCTION_CHANNEL_NAME",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "retryDialogCounter$delegate",
        "Ljt/h;",
        "getRetryDialogCounter",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "retryDialogCounter",
        "a",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final DEFAULT_FLAG_CACHE_SUBDIRECTORY_NAME:Ljava/lang/String; = "cache"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEFAULT_FLAG_CACHE_VB_FILE_NAME:Ljava/lang/String; = "flag_cache_vb.dat"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FLAG_CACHE_CHANNEL_KEY:Ljava/lang/String; = "versionBCachedChannelName"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FLAG_CACHE_PREFS_NAME:Ljava/lang/String; = "cached_flag_prefs"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final FLAG_CACHE_WRITTEN_BY_WORKER_KEY:Ljava/lang/String; = "versionBCacheWrittenByWorker"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final PRODUCTION_CHANNEL_NAME:Ljava/lang/String; = "production"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "FlagCacheUtils"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final backgroundScope:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final homePageAlreadyLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final pendingRetryDialogShown:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final pendingVersionBTelemetryOutcome:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/roblox/client/startup/FlagCacheUtils$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final pendingVersionBWrite:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/roblox/client/startup/b$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final retryDialogCounter$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final standardFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/startup/FlagCacheUtils;

    invoke-direct {v0}, Lcom/roblox/client/startup/FlagCacheUtils;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v0

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->backgroundScope:Lku/p0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBWrite:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBTelemetryOutcome:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingRetryDialogShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->homePageAlreadyLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, "addOSInfo"

    invoke-static {v0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->standardFields:Ljava/util/List;

    new-instance v0, Lak/g0;

    invoke-direct {v0}, Lak/g0;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->retryDialogCounter$delegate:Ljt/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->retryDialogCounter_delegate$lambda$0()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$setVersionBCacheWrittenByWorker(Lcom/roblox/client/startup/FlagCacheUtils;Landroid/content/Context;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/client/startup/FlagCacheUtils;->setVersionBCacheWrittenByWorker(Landroid/content/Context;Z)V

    return-void
.end method

.method public static final flushPendingVersionBTelemetry()V
    .locals 6

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBTelemetryOutcome:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    const-string v1, "FlagCacheUtils"

    if-nez v0, :cond_0

    const-string v0, "[VersionB] No pending telemetry outcome to flush."

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v2, "Points"

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "cacheOutcome"

    invoke-virtual {v0}, Lcom/roblox/client/startup/FlagCacheUtils$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v4

    const-string v5, "RobloxTelemetry"

    invoke-virtual {v4, v5}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v4

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->C4()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v2

    const-string v5, "VersionBFlagCacheOutcome"

    invoke-virtual {v2, v5}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    invoke-virtual {v0}, Lcom/roblox/client/startup/FlagCacheUtils$a;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[VersionB] Telemetry flushed: outcome="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final flushPendingVersionBWrite(Landroid/content/Context;)V
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->homePageAlreadyLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBWrite:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/startup/b$b;

    if-nez v0, :cond_0

    const-string p0, "FlagCacheUtils"

    const-string v0, "[VersionB] No pending write to flush."

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    move-object v2, v1

    sget-object v1, Lcom/roblox/client/startup/FlagCacheUtils;->backgroundScope:Lku/p0;

    new-instance v4, Lcom/roblox/client/startup/FlagCacheUtils$b;

    invoke-direct {v4, v0, p0, v2}, Lcom/roblox/client/startup/FlagCacheUtils$b;-><init>(Lcom/roblox/client/startup/b$b;Landroid/content/Context;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public static final flushRetryDialogTelemetry()V
    .locals 5

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->r1()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingRetryDialogShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    invoke-direct {v0}, Lcom/roblox/client/startup/FlagCacheUtils;->getRetryDialogCounter()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lsm/c;->f(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;DILjava/lang/Object;)Z

    const-string v0, "FlagCacheUtils"

    const-string v1, "Retry dialog telemetry flushed."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final getFlagCacheFileByName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->x1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    :goto_0
    new-instance v0, Ljava/io/File;

    const-string v1, "cache"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_1
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object p1
.end method

.method public static final getLastCacheOutcomeValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBTelemetryOutcome:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/startup/FlagCacheUtils$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roblox/client/startup/FlagCacheUtils$a;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    const-string v0, "unknown"

    return-object v0
.end method

.method private final getLegacyCacheFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v2, "cache"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final getRetryDialogCounter()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->retryDialogCounter$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method public static final getVersionBCacheChannelMiss(Landroid/content/Context;)Lcom/roblox/client/startup/FlagCacheUtils$a;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    invoke-direct {v0, p0}, Lcom/roblox/client/startup/FlagCacheUtils;->readVersionBCachedChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->c:Lcom/roblox/client/startup/FlagCacheUtils$a;

    return-object p0

    :cond_0
    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getRobloxChannel(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/startup/FlagCacheUtils;->isChannelMismatch(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->d:Lcom/roblox/client/startup/FlagCacheUtils$a;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private final isChannelMismatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, "production"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, v1, v3}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p2, v1, v3}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v1, v3

    goto :goto_3

    :cond_3
    move v1, v2

    :goto_3
    if-ne v0, v1, :cond_5

    if-nez v0, :cond_4

    if-nez v1, :cond_4

    invoke-static {p1, p2, v3}, Lkotlin/text/x;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    return v2

    :cond_5
    :goto_4
    return v3
.end method

.method private final readAndBurnVersionBFlagCache(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;
    .locals 12

    const-string v0, "flag_cache_vb.dat"

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/startup/FlagCacheUtils;->getFlagCacheFileByName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->x1()Z

    move-result v2

    const-string v3, "FlagCacheUtils"

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0, p1, v0}, Lcom/roblox/client/startup/FlagCacheUtils;->getLegacyCacheFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "[VersionB] Migrating cache file from legacy cacheDir location."

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, p1

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    const-string p1, "[VersionB] No cache file found."

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils$a;->e:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p1}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 p1, 0x6

    sget-object v2, Lju/b;->g:Lju/b;

    invoke-static {p1, v2}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v6

    invoke-static {v6, v7}, Lkotlin/time/a;->w(J)J

    move-result-wide v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v10, v8, v4

    cmp-long p1, v10, v6

    const-string v2, ""

    if-lez p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "[VersionB] Flag cache expired. lastWrite="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " current="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " expiryMs="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    new-instance p1, Lcom/roblox/client/startup/b$b;

    invoke-direct {p1, v2, v2, v4, v5}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object p1

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    :try_start_0
    new-instance p1, Lcom/roblox/client/startup/b$b;

    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v8}, Lut/i;->h(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {p1, v8, v2, v4, v5}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "[VersionB] Error reading cache file: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils$a;->g:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p1}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    move-object p1, v0

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "[FlagCache] Flag cache file read took "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " ms"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils$a;->h:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p1}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    return-object v0

    :cond_3
    return-object p1
.end method

.method private final readVersionBCachedChannel(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, "cached_flag_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "versionBCachedChannelName"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static final recordRetryDialogShown()V
    .locals 2

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingRetryDialogShown:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public static final recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V
    .locals 1
    .param p0    # Lcom/roblox/client/startup/FlagCacheUtils$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outcome"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBTelemetryOutcome:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final retryDialogCounter_delegate$lambda$0()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "AndroidRetryDialogShown"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/4 v0, 0x6

    const/16 v2, 0xa

    const/16 v3, 0x7ea

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Counts when the flag prefetch retry dialog is shown to the user"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method private final sendVersionBCacheWriteErrorEvent(Ljava/lang/String;)V
    .locals 4

    const-string v0, "Points"

    invoke-static {v0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "errorMessage"

    invoke-static {v1, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    const-string v3, "RobloxTelemetry"

    invoke-virtual {v2, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v2

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->C4()I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    const-string v3, "VersionBFlagCacheWriteError"

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;->build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->j(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[VersionB] Write error telemetry sent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FlagCacheUtils"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final setVersionBCacheWrittenByWorker(Landroid/content/Context;Z)V
    .locals 2

    const-string v0, "cached_flag_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getSharedPreferences(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "versionBCacheWrittenByWorker"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static final storePendingVersionBWrite(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V
    .locals 8
    .param p0    # Lcom/roblox/client/startup/b$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlagCacheUtils"

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->pendingVersionBWrite:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "[VersionB] Network payload stored."

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils;->homePageAlreadyLoaded:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const-string p0, "[VersionB] LUA_HOME_PAGE_LOADED already fired; flushing immediately."

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Lcom/roblox/client/startup/FlagCacheUtils;->backgroundScope:Lku/p0;

    new-instance v5, Lcom/roblox/client/startup/FlagCacheUtils$d;

    invoke-direct {v5, p1, v0}, Lcom/roblox/client/startup/FlagCacheUtils$d;-><init>(Landroid/content/Context;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->m0()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {p1}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "foreground"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    const-string p0, "[VersionB] Background launch; flushing cache write immediately."

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Lcom/roblox/client/startup/FlagCacheUtils;->backgroundScope:Lku/p0;

    new-instance v5, Lcom/roblox/client/startup/FlagCacheUtils$e;

    invoke-direct {v5, p1, v0}, Lcom/roblox/client/startup/FlagCacheUtils$e;-><init>(Landroid/content/Context;Lnt/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_2
    return-void

    :cond_3
    :goto_0
    const-string p0, "[VersionB] Pending write skipped: empty response."

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final tryLoadVersionBCache(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;
    .locals 9
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/FlagCacheUtils;->readVersionBCachedChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "FlagCacheUtils"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    const-string p0, "[VersionB] No cached channel in SharedPreferences; treating as miss."

    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->c:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    return-object v4

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, v2, v0}, Lcom/roblox/client/startup/FlagCacheUtils;->isChannelMismatch(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    const-string v6, "\'"

    const-string v7, "\' current=\'"

    if-eqz v5, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[VersionB] Channel mismatch: cached=\'"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->d:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    return-object v4

    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[VersionB] Channel match: cached=\'"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/FlagCacheUtils;->readAndBurnVersionBFlagCache(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v4

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_0

    :cond_3
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance v1, Lcom/roblox/client/startup/b$b;

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->b()J

    move-result-wide v3

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object v1

    :cond_5
    :goto_1
    const-string p0, "[VersionB] Flag cache body is empty (expired)."

    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->f:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    return-object v4
.end method

.method public static final wasVersionBCacheWrittenByWorker(Landroid/content/Context;)Z
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->t3()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "cached_flag_prefs"

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "versionBCacheWrittenByWorker"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private final writeUncompressedFlagCacheFile(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z
    .locals 6

    const-string v0, "FlagCacheUtils"

    invoke-virtual {p1}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v2, "flag_cache_vb.dat"

    invoke-direct {p0, p2, v2}, Lcom/roblox/client/startup/FlagCacheUtils;->getFlagCacheFileByName(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_2
    :try_start_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->e6()Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, ".tmp"

    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    invoke-static {v2, v3, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v2, p1, v3}, Lut/i;->j(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    invoke-virtual {v2, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_3

    :try_start_2
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to rename "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    throw p1

    :cond_4
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p2, p1, v2}, Lut/i;->j(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[VersionB] Wrote uncompressed cache: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " chars to "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    const/4 p1, 0x1

    return p1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[VersionB] Error writing uncompressed cache: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, "unknown IOException"

    :cond_5
    invoke-direct {p0, p1}, Lcom/roblox/client/startup/FlagCacheUtils;->sendVersionBCacheWriteErrorEvent(Ljava/lang/String;)V

    :cond_6
    :goto_3
    return v1
.end method

.method public static final writeVersionBCacheFromResponse(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V
    .locals 5
    .param p0    # Lcom/roblox/client/startup/b$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FlagCacheUtils"

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "vb_cache_write_begin"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v2, v3, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    sget-object v0, Lcom/roblox/client/startup/FlagCacheUtils;->INSTANCE:Lcom/roblox/client/startup/FlagCacheUtils;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/startup/FlagCacheUtils;->writeUncompressedFlagCacheFile(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_1

    const-string p0, "[VersionB] Cache write failed."

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    invoke-static {}, Lsg/a1;->W()Ljava/lang/String;

    move-result-object p0

    const-string v4, "getRobloxChannel(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1, p0}, Lcom/roblox/client/startup/FlagCacheUtils;->writeVersionBCachedChannel(Landroid/content/Context;Ljava/lang/String;)V

    const-string p0, "vb_cache_write_end"

    invoke-static {p0, v2, v3, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->m(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Object;)V

    const-string p0, "[VersionB] Cache write complete."

    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    :goto_0
    const-string p0, "[VersionB] Cache write skipped: empty response."

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final writeVersionBCachedChannel(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, "cached_flag_prefs"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "getSharedPreferences(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "versionBCachedChannelName"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public final scheduledFetchFlag(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lak/f0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/startup/FlagCacheUtils$c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/roblox/client/startup/FlagCacheUtils$c;-><init>(Landroid/content/Context;Lnt/b;)V

    invoke-static {v0, v1, p2}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
