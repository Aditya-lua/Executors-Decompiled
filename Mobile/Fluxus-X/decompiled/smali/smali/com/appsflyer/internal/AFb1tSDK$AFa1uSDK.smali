.class public final Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFb1tSDK;->unregisterClient()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic d:Lcom/appsflyer/internal/AFb1tSDK;

.field private synthetic unregisterClient:J


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFb1tSDK;J)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iput-wide p2, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->unregisterClient:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iget-object v0, v0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "error"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final AFLogger(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const-string v0, "link"

    if-eqz p1, :cond_2

    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Facebook Deferred AppLink data received: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz p1, :cond_1

    const-string v0, "target_url"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p3, :cond_3

    iget-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "promo_code"

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "deeplink_context"

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz p1, :cond_3

    const-string p3, "extras"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iget-object p1, p1, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz p1, :cond_3

    const-string p2, ""

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide v0, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->unregisterClient:J

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;->d:Lcom/appsflyer/internal/AFb1tSDK;

    iget-object p2, p2, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    if-eqz p2, :cond_4

    const-string p3, "ttr"

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method
