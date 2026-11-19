.class public final Lcom/appsflyer/internal/AFh1fSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFh1pSDK;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
    .locals 2

    iget v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0

    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0
.end method

.method public final AFLogger()Z
    .locals 1

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->afErrorLog:Z

    return v0
.end method

.method public final registerClient()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
