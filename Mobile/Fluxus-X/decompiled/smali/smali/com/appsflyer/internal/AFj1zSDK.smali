.class public final Lcom/appsflyer/internal/AFj1zSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1uSDK;


# instance fields
.field public volatile AFLogger:Z

.field private final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "DeeplinkProcessedCondition"

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final registerClient()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    return-void
.end method

.method public final unregisterClient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFj1zSDK;->AFLogger:Z

    return v0
.end method
