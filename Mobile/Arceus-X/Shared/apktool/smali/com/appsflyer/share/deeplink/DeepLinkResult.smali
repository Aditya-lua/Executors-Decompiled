.class public Lcom/appsflyer/share/deeplink/DeepLinkResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;,
        Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;
    }
.end annotation


# instance fields
.field private final deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

.field private final error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

.field private final status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    iput-object p2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    if-eqz p2, :cond_0

    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->ERROR:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    return-void

    :cond_0
    if-eqz p1, :cond_1

    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    return-void

    :cond_1
    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->NOT_FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    return-void
.end method


# virtual methods
.method public getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    return-object v0
.end method

.method public getError()Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    return-object v0
.end method

.method public getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "deepLink"

    iget-object v2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "error"

    iget-object v2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "status"

    iget-object v2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v5, v0

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "Error while creating deeplink JSON"

    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
