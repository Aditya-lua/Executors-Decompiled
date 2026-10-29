.class public final enum Lcom/appsflyer/internal/AFa1mSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFa1mSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\r\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B%\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000fj\u0002\u0008\u000ej\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFa1mSDK;",
        "",
        "",
        "p0",
        "Lkotlin/Function1;",
        "",
        "",
        "p1",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "registerClient",
        "Ljava/lang/String;",
        "AFLogger",
        "Lkotlin/jvm/functions/Function1;",
        "unregisterClient",
        "d",
        "AFKeystoreWrapper",
        "w",
        "e",
        "v"
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
.field private static enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum d:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum e:Lcom/appsflyer/internal/AFa1mSDK;

.field private static final synthetic force:[Lcom/appsflyer/internal/AFa1mSDK;

.field private static final synthetic i:Lqt/a;

.field private static enum unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum v:Lcom/appsflyer/internal/AFa1mSDK;

.field private static enum w:Lcom/appsflyer/internal/AFa1mSDK;


# instance fields
.field public AFLogger:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final registerClient:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v1, Lcom/appsflyer/internal/a;

    invoke-direct {v1}, Lcom/appsflyer/internal/a;-><init>()V

    const-string v2, "DebugLog"

    const/4 v3, 0x0

    const-string v4, "debug_mode"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->d:Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v1, Lcom/appsflyer/internal/b;

    invoke-direct {v1}, Lcom/appsflyer/internal/b;-><init>()V

    const-string v2, "DisableAdvertisingIdentifiers"

    const/4 v3, 0x1

    const-string v4, "disable_advertising_identifiers"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v1, Lcom/appsflyer/internal/c;

    invoke-direct {v1}, Lcom/appsflyer/internal/c;-><init>()V

    const-string v2, "MinTimeBetweenSessions"

    const/4 v3, 0x2

    const-string v4, "min_time_between_sessions"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v1, Lcom/appsflyer/internal/d;

    invoke-direct {v1}, Lcom/appsflyer/internal/d;-><init>()V

    const-string v2, "CurrencyCode"

    const/4 v3, 0x3

    const-string v4, "currency_code"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->w:Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v0, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v1, Lcom/appsflyer/internal/e;

    invoke-direct {v1}, Lcom/appsflyer/internal/e;-><init>()V

    const-string v2, "Host"

    const/4 v3, 0x4

    const-string v4, "host"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->e:Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v10, Lcom/appsflyer/internal/AFa1mSDK;

    new-instance v0, Lcom/appsflyer/internal/f;

    invoke-direct {v0}, Lcom/appsflyer/internal/f;-><init>()V

    const-string v1, "DdlTimeout"

    const/4 v2, 0x5

    const-string v3, "ddlTimeout"

    invoke-direct {v10, v1, v2, v3, v0}, Lcom/appsflyer/internal/AFa1mSDK;-><init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    sput-object v10, Lcom/appsflyer/internal/AFa1mSDK;->v:Lcom/appsflyer/internal/AFa1mSDK;

    sget-object v5, Lcom/appsflyer/internal/AFa1mSDK;->d:Lcom/appsflyer/internal/AFa1mSDK;

    sget-object v6, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient:Lcom/appsflyer/internal/AFa1mSDK;

    sget-object v7, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFa1mSDK;

    sget-object v8, Lcom/appsflyer/internal/AFa1mSDK;->w:Lcom/appsflyer/internal/AFa1mSDK;

    sget-object v9, Lcom/appsflyer/internal/AFa1mSDK;->e:Lcom/appsflyer/internal/AFa1mSDK;

    filled-new-array/range {v5 .. v10}, [Lcom/appsflyer/internal/AFa1mSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->force:[Lcom/appsflyer/internal/AFa1mSDK;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFa1mSDK;->i:Lqt/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFa1mSDK;->registerClient:Ljava/lang/String;

    iput-object p4, p0, Lcom/appsflyer/internal/AFa1mSDK;->AFLogger:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private static final AFKeystoreWrapper(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->setMinTimeBetweenSessions(I)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AFLogger(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->setCurrencyCode(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->AFKeystoreWrapper(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->d(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->registerClient(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->setDisableAdvertisingIdentifiers(Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->AFLogger(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->unregisterClient(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 3

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    int-to-long v1, p0

    invoke-virtual {v0, v1, v2}, Lcom/appsflyer/AppsFlyerLib;->setDeepLinkTimeout(J)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/internal/AFa1mSDK;->i(Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final registerClient(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->setDebugLog(Z)V

    .line 3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static registerClient()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/internal/AFa1mSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFa1mSDK;->i:Lqt/a;

    return-object v0
.end method

.method private static final unregisterClient(Ljava/lang/Object;)Lkotlin/Unit;
    .locals 8

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/HashMap;

    const-string v0, "host"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "prefix"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/appsflyer/AppsFlyerLib;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lcom/appsflyer/AppsFlyerLib;->setHost(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->INIT_BY_CONFIG:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "Unsupported/Missing values - host value is mandatory for setHost method"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFa1mSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFa1mSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFa1mSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFa1mSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFa1mSDK;->force:[Lcom/appsflyer/internal/AFa1mSDK;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFa1mSDK;

    return-object v0
.end method
