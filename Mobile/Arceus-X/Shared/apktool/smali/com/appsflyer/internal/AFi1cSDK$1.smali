.class final Lcom/appsflyer/internal/AFi1cSDK$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFi1cSDK;->start(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private synthetic d:Lcom/appsflyer/internal/AFi1cSDK;

.field private synthetic registerClient:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFi1cSDK;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "content://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v1, v1, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/transaction_id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/appsflyer/internal/AFi1cSDK;->N_(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "app_id="

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v5, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v5, v0

    goto :goto_3

    :goto_0
    :try_start_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Error to get data from providerClient "

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :goto_2
    :try_start_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Failed to query unstable content providerClient"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    goto :goto_1

    :goto_3
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Failed to acquire unstable content providerClient"

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :goto_4
    invoke-virtual {v1}, Landroid/content/ContentProviderClient;->close()V

    throw v0

    :cond_0
    :goto_5
    const/4 v0, 0x0

    :goto_6
    const-string v1, "response"

    if-eqz v0, :cond_3

    const-string v2, "transaction_id"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v4, "Wrong column name"

    invoke-virtual {v2, v3, v4}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v2, v2, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v3, "FEATURE_NOT_SUPPORTED"

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v3, v3, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v4, "OK"

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v2, v2, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v3, "referrer"

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_7
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_8

    :cond_3
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PREINSTALL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "ContentProvider query failed, got null Cursor"

    invoke-virtual {v0, v2, v3}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v0, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    const-string v2, "SERVICE_UNAVAILABLE"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v1, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    iget-object v0, v0, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1qSDK;->unregisterClient(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v2, "api_ver"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    iget-object v1, v0, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    iget-object v2, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->registerClient:Landroid/content/Context;

    iget-object v0, v0, Lcom/appsflyer/internal/AFi1cSDK;->registerClient:Landroid/content/pm/ProviderInfo;

    iget-object v0, v0, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/appsflyer/internal/AFj1qSDK;->AFKeystoreWrapper(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "api_ver_name"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1cSDK$1;->d:Lcom/appsflyer/internal/AFi1cSDK;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    return-void
.end method
