.class public final Lcom/appsflyer/internal/AFi1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Z

.field public final AFLogger:Lcom/appsflyer/internal/AFh1dSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLcom/appsflyer/internal/AFh1dSDK;)V
    .locals 0
    .param p2    # Lcom/appsflyer/internal/AFh1dSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFi1uSDK;->AFKeystoreWrapper:Z

    iput-object p2, p0, Lcom/appsflyer/internal/AFi1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    return-void
.end method
