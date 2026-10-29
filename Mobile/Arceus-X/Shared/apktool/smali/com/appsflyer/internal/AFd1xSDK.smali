.class public final Lcom/appsflyer/internal/AFd1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final AFLogger:Lcom/appsflyer/internal/AFd1mSDK;

.field final d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1mSDK;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFd1xSDK;->AFLogger:Lcom/appsflyer/internal/AFd1mSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFd1xSDK;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
