.class public final Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "",
        "listener",
        "Ljava/lang/Runnable;",
        "logger",
        "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "backgroundExecutor",
        "Ljava/util/concurrent/ExecutorService;",
        "<init>",
        "(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V",
        "getListener",
        "()Ljava/lang/Runnable;",
        "getLogger",
        "()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;",
        "getBackgroundExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final backgroundExecutor:Ljava/util/concurrent/ExecutorService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final listener:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/ExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->listener:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    iput-object p3, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->backgroundExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method


# virtual methods
.method public final getBackgroundExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->backgroundExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public final getListener()Ljava/lang/Runnable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->listener:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final getLogger()Lcom/appsflyer/sdk_base/logger/AFLoggerBase;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/referrer/ReferrerProp;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    return-object v0
.end method
