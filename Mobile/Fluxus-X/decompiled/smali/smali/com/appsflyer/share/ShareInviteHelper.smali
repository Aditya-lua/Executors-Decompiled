.class public Lcom/appsflyer/share/ShareInviteHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static generateInviteUrl(Landroid/content/Context;)Lcom/appsflyer/share/LinkGenerator;
    .locals 6

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v2

    iget-object v2, v2, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v2}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v2

    iget-object v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->AppsFlyerLib:Ljava/lang/String;

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v3

    iget-object v3, v3, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v3

    const-string v4, "onelinkDomain"

    invoke-interface {v3, v4}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    check-cast v0, Lcom/appsflyer/internal/AFa1tSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->valueOf:Ljava/lang/String;

    new-instance v4, Lcom/appsflyer/share/LinkGenerator;

    const-string v5, "af_app_invites"

    invoke-direct {v4, v5}, Lcom/appsflyer/share/LinkGenerator;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v3, v5}, Lcom/appsflyer/share/LinkGenerator;->setBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/appsflyer/share/LinkGenerator;->setReferrerUID(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/appsflyer/share/LinkGenerator;->setReferrerCustomerId(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v0

    const-string v1, "af_siteid"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lcom/appsflyer/share/LinkGenerator;->addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object p0

    invoke-static {}, Lcom/appsflyer/internal/AFa1tSDK;->d()Lcom/appsflyer/internal/AFa1tSDK;

    move-result-object v0

    iget-object v0, v0, Lcom/appsflyer/internal/AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const-string v1, "onelinkScheme"

    invoke-interface {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/appsflyer/share/LinkGenerator;->setBaseDeeplink(Ljava/lang/String;)Lcom/appsflyer/share/LinkGenerator;

    :cond_0
    return-object p0
.end method

.method public static logInvite(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p2, "[Invite] Cannot report App-Invite with null/empty channel"

    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/share/ShareInviteHelper;->generateInviteUrl(Landroid/content/Context;)Lcom/appsflyer/share/LinkGenerator;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/appsflyer/share/LinkGenerator;->addParameters(Ljava/util/Map;)Lcom/appsflyer/share/LinkGenerator;

    sget-object p2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "[Invite] Reporting App-Invite via channel: "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[Invite] Generated URL: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/appsflyer/share/LinkGenerator;->generateLink()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/appsflyer/share/LinkGenerator;->getMediaSource()Ljava/lang/String;

    move-result-object p2

    const-string v1, "af_app_invites"

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p2, "af_invite"

    goto :goto_0

    :cond_1
    const-string v1, "af_user_share"

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p2, "af_share"

    :cond_2
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Lcom/appsflyer/share/LinkGenerator;->getUserParams()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/appsflyer/share/LinkGenerator;->getUserParams()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_3
    const-string v0, "af_channel"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object p1

    invoke-virtual {p1, p0, p2, v1}, Lcom/appsflyer/AppsFlyerLib;->logEvent(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
