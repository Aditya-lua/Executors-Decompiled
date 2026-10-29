.class public final Lcom/appsflyer/internal/AFf1kSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u00020\u00138FX\u0087\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u0015\u0010\u0015\u001a\u00020\u00138FX\u0087\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFf1kSDK;",
        "",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "p0",
        "Lcom/appsflyer/internal/AFf1jSDK;",
        "p1",
        "Lcom/appsflyer/internal/AFc1eSDK;",
        "p2",
        "<init>",
        "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V",
        "",
        "AFKeystoreWrapper",
        "()J",
        "AFLogger",
        "Lcom/appsflyer/internal/AFc1iSDK;",
        "unregisterClient",
        "Lcom/appsflyer/internal/AFf1jSDK;",
        "d",
        "Lcom/appsflyer/internal/AFc1eSDK;",
        "",
        "Ljt/h;",
        "registerClient",
        "AFa1uSDK"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AFa1uSDK:Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final force:J


# instance fields
.field public final AFKeystoreWrapper:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/internal/AFc1iSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final registerClient:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/internal/AFf1kSDK;->AFa1uSDK:Lcom/appsflyer/internal/AFf1kSDK$AFa1uSDK;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x18

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    return-void
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFc1iSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFf1jSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/appsflyer/internal/AFc1eSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1kSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/AFf1kSDK;->d:Lcom/appsflyer/internal/AFc1eSDK;

    new-instance p1, Lcom/appsflyer/internal/m0;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/m0;-><init>(Lcom/appsflyer/internal/AFf1kSDK;)V

    invoke-static {p1}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFKeystoreWrapper:Ljt/h;

    new-instance p1, Lcom/appsflyer/internal/n0;

    invoke-direct {p1, p0}, Lcom/appsflyer/internal/n0;-><init>(Lcom/appsflyer/internal/AFf1kSDK;)V

    invoke-static {p1}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1kSDK;->registerClient:Ljt/h;

    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 1

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v0, "com.appsflyer.rc.staging"

    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger(Lcom/appsflyer/internal/AFf1kSDK;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFf1kSDK;->d(Lcom/appsflyer/internal/AFf1kSDK;)Z

    move-result p0

    return p0
.end method

.method private static final d(Lcom/appsflyer/internal/AFf1kSDK;)Z
    .locals 1

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v0, "com.appsflyer.rc.sandbox"

    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()J
    .locals 11

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1kSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v1, "com.appsflyer.rc.cache.max-age-fallback"

    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :try_start_0
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->REMOTE_CONTROL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "unknown error"

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Can\'t read maxAgeFallback from Manifest: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    sget-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_2
    sget-wide v0, Lcom/appsflyer/internal/AFf1kSDK;->force:J

    return-wide v0
.end method
