.class public final Lcom/appsflyer/AFLogger;
.super Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/AFLogger$LogLevel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J#\u0010\u0010\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0016\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0015\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJG\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\'\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008%\u0010\u001fJ\'\u0010&\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008&\u0010\u001fJ\'\u0010\'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008(\u0010)R\u001b\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00010*8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0015\u0010\u001e\u001a\u00020-8BX\u0083\u0084\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010,"
    }
    d2 = {
        "Lcom/appsflyer/AFLogger;",
        "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "<init>",
        "()V",
        "",
        "logMessage",
        "",
        "afInfoLog",
        "(Ljava/lang/String;)V",
        "debugLogMessage",
        "afDebugLog",
        "warningLogMessage",
        "afWarnLog",
        "errorLogMessage",
        "",
        "ex",
        "afErrorLog",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "",
        "printThrowable",
        "(Ljava/lang/String;Ljava/lang/Throwable;Z)V",
        "",
        "client",
        "registerClient",
        "([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V",
        "unregisterClient",
        "Lcom/appsflyer/sdk_base/logger/LogTag;",
        "tag",
        "msg",
        "shouldRemoteDebug",
        "d",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V",
        "throwable",
        "printMsg",
        "shouldReportToExManager",
        "e",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V",
        "i",
        "w",
        "v",
        "force",
        "(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V",
        "",
        "AFLogger",
        "Ljt/h;",
        "Ljava/util/concurrent/ExecutorService;",
        "LogLevel"
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
.field private static final AFLogger:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/appsflyer/AFLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final registerClient:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appsflyer/AFLogger;

    invoke-direct {v0}, Lcom/appsflyer/AFLogger;-><init>()V

    sput-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    new-instance v0, Lcom/appsflyer/k;

    invoke-direct {v0}, Lcom/appsflyer/k;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/AFLogger;->AFLogger:Ljt/h;

    new-instance v0, Lcom/appsflyer/b;

    invoke-direct {v0}, Lcom/appsflyer/b;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;-><init>()V

    return-void
.end method

.method private static final AFKeystoreWrapper()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFc1jSDK;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AFKeystoreWrapper([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    .line 3
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 4
    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p0}, Lkotlin/collections/u;->A(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method private static final AFLogger(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final AFLogger([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 3
    invoke-static {p0}, Lkotlin/collections/m;->m0([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {v0, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static synthetic a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    invoke-static {}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static final afDebugLog(Ljava/lang/String;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 2
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    if-eqz p0, :cond_1

    .line 3
    invoke-static {p0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, p0

    goto :goto_2

    :cond_1
    :goto_1
    const-string p0, "null"

    goto :goto_0

    :goto_2
    if-nez p1, :cond_2

    .line 4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p0, "Invoked with null Throwable"

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    :cond_2
    move-object v3, p1

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 5
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static final afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 6
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 7
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    if-eqz p0, :cond_1

    .line 8
    invoke-static {p0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v2, p0

    goto :goto_2

    :cond_1
    :goto_1
    const-string p0, "null"

    goto :goto_0

    :goto_2
    if-nez p1, :cond_2

    .line 9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p0, "Invoked with null Throwable"

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    :cond_2
    move-object v3, p1

    const/16 v8, 0x68

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p2

    .line 10
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method public static final afInfoLog(Ljava/lang/String;)V
    .locals 3
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final afWarnLog(Ljava/lang/String;)V
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->OTHER:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method private static final d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic f()Ljava/util/Set;
    .locals 1

    invoke-static {}, Lcom/appsflyer/AFLogger;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/AFLogger;->AFLogger(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/appsflyer/AFLogger;->registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/AFLogger;->AFLogger([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public static synthetic m([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/AFLogger;->AFKeystoreWrapper([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/appsflyer/AFLogger;->unregisterClient(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p2, p0, p1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 2

    const-string v0, ""

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-object p1, p0

    move-object p0, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, v1

    .line 4
    invoke-virtual/range {p0 .. p7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    .line 5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final registerClient(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;
    .locals 1

    const-string v0, ""

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p3, p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private static final unregisterClient(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 3
    sget-object v0, Lcom/appsflyer/AFLogger;->AFLogger:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    .line 4
    check-cast v0, Ljava/lang/Iterable;

    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 6
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/appsflyer/h;

    invoke-direct {v0, p1, p2, p3}, Lcom/appsflyer/h;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 3
    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v0}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    .locals 9
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/appsflyer/d;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/appsflyer/d;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v1}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final force(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/appsflyer/f;

    invoke-direct {v0, p1, p2}, Lcom/appsflyer/f;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v0}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/appsflyer/a;

    invoke-direct {v0, p1, p2, p3}, Lcom/appsflyer/a;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v0}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final varargs registerClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1
    .param p1    # [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/appsflyer/e;

    invoke-direct {v0, p1}, Lcom/appsflyer/e;-><init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 2
    sget-object p1, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p1}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final varargs unregisterClient([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 1
    .param p1    # [Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/appsflyer/g;

    invoke-direct {v0, p1}, Lcom/appsflyer/g;-><init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    .line 2
    sget-object p1, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p1}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/appsflyer/i;

    invoke-direct {v0, p1, p2, p3}, Lcom/appsflyer/i;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v0}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Lcom/appsflyer/sdk_base/logger/LogTag;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/appsflyer/j;

    invoke-direct {v0, p1, p2, p3}, Lcom/appsflyer/j;-><init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    new-instance p1, Lcom/appsflyer/c;

    invoke-direct {p1, v0}, Lcom/appsflyer/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object p2, Lcom/appsflyer/AFLogger;->registerClient:Ljt/h;

    invoke-interface {p2}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
