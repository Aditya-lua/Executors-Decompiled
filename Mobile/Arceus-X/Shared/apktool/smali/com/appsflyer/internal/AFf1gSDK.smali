.class public final Lcom/appsflyer/internal/AFf1gSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1eSDK;


# instance fields
.field private final AFLogger:Lcom/appsflyer/internal/AFc1eSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFg1xSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFg1xSDK;Lcom/appsflyer/internal/AFc1eSDK;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFg1xSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFc1eSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1gSDK;->d:Lcom/appsflyer/internal/AFg1xSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    return-void
.end method


# virtual methods
.method public final d(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V
    .locals 8
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFe1zSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            ")V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1gSDK;->d:Lcom/appsflyer/internal/AFg1xSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFg1xSDK;->registerClient()Lcom/appsflyer/internal/AFg1ySDK;

    move-result-object v1

    iget-object v2, p0, Lcom/appsflyer/internal/AFf1gSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    iget-object v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->setImeiData:Lcom/appsflyer/share/AppsFlyerConsent;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v4, "gdpr_applies"

    if-eqz v2, :cond_4

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Lcom/appsflyer/share/AppsFlyerConsent;->isUserSubjectToGDPR()Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-interface {v5, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v2}, Lcom/appsflyer/share/AppsFlyerConsent;->getHasConsentForDataUsage()Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_1

    const-string v7, "ad_user_data_enabled"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v2}, Lcom/appsflyer/share/AppsFlyerConsent;->getHasConsentForAdsPersonalization()Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_2

    const-string v7, "ad_personalization_enabled"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v2}, Lcom/appsflyer/share/AppsFlyerConsent;->getHasConsentForAdStorage()Ljava/lang/Boolean;

    move-result-object v6

    if-eqz v6, :cond_3

    const-string v7, "ad_storage_enabled"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v6, "manual"

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    if-eqz v1, :cond_7

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    iget v6, v1, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "policy_version"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v6, v1, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "cmp_sdk_id"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v6, v1, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "cmp_sdk_version"

    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "tcstring"

    if-eqz v2, :cond_6

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    iget v0, v1, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-interface {v5, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const-string v0, "tcf"

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "consent_data"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    if-ne p2, v0, :cond_9

    iget-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    iget-object p2, p2, Lcom/appsflyer/internal/AFc1eSDK;->afDebugLog:Ljava/lang/Boolean;

    if-eqz p2, :cond_9

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFf1gSDK;->AFLogger:Lcom/appsflyer/internal/AFc1eSDK;

    iget-object p2, p2, Lcom/appsflyer/internal/AFc1eSDK;->afDebugLog:Ljava/lang/Boolean;

    const-string v0, "enableTCFDataCollection"

    invoke-static {v0, p2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "api"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-void
.end method
