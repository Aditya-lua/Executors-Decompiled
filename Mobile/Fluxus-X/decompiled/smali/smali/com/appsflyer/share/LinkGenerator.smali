.class public Lcom/appsflyer/share/LinkGenerator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/share/LinkGenerator$ResponseListener;
    }
.end annotation


# instance fields
.field AFKeystoreWrapper:Ljava/lang/String;

.field private AFLogger:Ljava/lang/String;

.field private final afDebugLog:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private afErrorLog:Ljava/lang/String;

.field private afInfoLog:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private force:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private registerClient:Ljava/lang/String;

.field unregisterClient:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->afDebugLog:Ljava/util/Map;

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->d:Ljava/lang/String;

    return-void
.end method

.method private AFLogger()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "pid"

    iget-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->d:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->force:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "af_referrer_uid"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->registerClient:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v2, "af_channel"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->v:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "af_referrer_customer_id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->AFLogger:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v2, "c"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->w:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, "af_referrer_name"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->i:Ljava/lang/String;

    if-eqz v1, :cond_5

    const-string v2, "af_referrer_image_url"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->afErrorLog:Ljava/lang/String;

    if-eqz v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->afErrorLog:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->e:Ljava/lang/String;

    if-eqz v2, :cond_7

    const-string v3, "^[/]"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->afErrorLog:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_6

    move-object v4, v3

    :cond_6
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/appsflyer/share/LinkGenerator;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "af_dp"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->afDebugLog:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_9
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1lSDK;->AFKeystoreWrapper(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->afDebugLog:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public addParameters(Ljava/util/Map;)Lcom/appsflyer/share/LinkGenerator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/appsflyer/share/LinkGenerator;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->afDebugLog:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-object p0
.end method

.method public generateLink()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->AFKeystoreWrapper:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 4
    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFj1fSDK;->d:Ljava/lang/String;

    .line 5
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v3

    invoke-virtual {v3}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v4

    invoke-virtual {v4}, Lcom/appsflyer/AppsFlyerLib;->getHostName()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->unregisterClient:Ljava/lang/String;

    if-eqz v1, :cond_1

    const/16 v1, 0x2f

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->unregisterClient:Ljava/lang/String;

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    :cond_1
    invoke-direct {p0}, Lcom/appsflyer/share/LinkGenerator;->AFLogger()Ljava/util/Map;

    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 13
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-nez v4, :cond_2

    const/16 v4, 0x3f

    .line 14
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const/16 v4, 0x26

    .line 15
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    :goto_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 17
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public generateLink(Landroid/content/Context;Lcom/appsflyer/share/LinkGenerator$ResponseListener;)V
    .locals 9

    .line 20
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    .line 21
    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 22
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    .line 23
    iget-object v4, v0, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    if-nez v4, :cond_1

    .line 24
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->PUBLIC_API:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v1, "generateLink: OneLink ID not set. Call setAppInviteOneLink(...) first. Falling back to long link."

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    .line 25
    invoke-virtual {p0}, Lcom/appsflyer/share/LinkGenerator;->generateLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/appsflyer/share/LinkGenerator$ResponseListener;->onResponseError(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 26
    :cond_1
    iget-object v6, p0, Lcom/appsflyer/share/LinkGenerator;->afInfoLog:Ljava/lang/String;

    invoke-direct {p0}, Lcom/appsflyer/share/LinkGenerator;->AFLogger()Ljava/util/Map;

    move-result-object v5

    .line 27
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    .line 28
    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    if-eqz p1, :cond_2

    .line 29
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1aSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 31
    :cond_2
    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object p1

    .line 32
    iget-object v2, p1, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    .line 33
    new-instance v1, Lcom/appsflyer/internal/AFe1pSDK;

    .line 34
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    move-object v8, p0

    move-object v7, p2

    invoke-direct/range {v1 .. v8}, Lcom/appsflyer/internal/AFe1pSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Ljava/util/UUID;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/appsflyer/share/LinkGenerator$ResponseListener;Lcom/appsflyer/share/LinkGenerator;)V

    .line 35
    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->afWarnLog()Lcom/appsflyer/internal/AFe1wSDK;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method

.method public getBrandDomain()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->afInfoLog:Ljava/lang/String;

    return-object v0
.end method

.method public getCampaign()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->AFLogger:Ljava/lang/String;

    return-object v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->registerClient:Ljava/lang/String;

    return-object v0
.end method

.method public getMediaSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/LinkGenerator;->d:Ljava/lang/String;

    return-object v0
.end method

.method public getUserParams()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/appsflyer/share/LinkGenerator;->afDebugLog:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public setBaseDeeplink(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->afErrorLog:Ljava/lang/String;

    return-object p0
.end method

.method public setBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 2

    const-string v0, "https://%s/%s"

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const/4 v1, 0x5

    if-ge p3, v1, :cond_2

    :cond_1
    const-string p2, "go.onelink.me"

    :cond_2
    sget-object p3, Ljava/util/Locale;->US:Ljava/util/Locale;

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->AFKeystoreWrapper:Ljava/lang/String;

    return-object p0

    :cond_3
    :goto_0
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p2

    invoke-virtual {p2}, Lcom/appsflyer/AppsFlyerLib;->getHostPrefix()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v1

    invoke-virtual {v1}, Lcom/appsflyer/AppsFlyerLib;->getHostName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "%sapp.%s"

    invoke-static {p1, v1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->AFKeystoreWrapper:Ljava/lang/String;

    return-object p0
.end method

.method public setBrandDomain(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->afInfoLog:Ljava/lang/String;

    return-object p0
.end method

.method public setCampaign(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->AFLogger:Ljava/lang/String;

    return-object p0
.end method

.method public setChannel(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->registerClient:Ljava/lang/String;

    return-object p0
.end method

.method public setDeeplinkPath(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->e:Ljava/lang/String;

    return-object p0
.end method

.method public setReferrerCustomerId(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->v:Ljava/lang/String;

    return-object p0
.end method

.method public setReferrerImageURL(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->i:Ljava/lang/String;

    return-object p0
.end method

.method public setReferrerName(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->w:Ljava/lang/String;

    return-object p0
.end method

.method public setReferrerUID(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/share/LinkGenerator;->force:Ljava/lang/String;

    return-object p0
.end method
