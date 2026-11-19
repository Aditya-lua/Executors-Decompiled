.class public final Lcom/appsflyer/internal/AFh1rSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final unregisterClient()Z
    .locals 1

    :try_start_0
    sget-object v0, Lcom/appsflyer/migration/internal/MigrationDataProvider;->INSTANCE:Lcom/appsflyer/migration/internal/MigrationDataProvider;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    const/4 v0, 0x0

    return v0
.end method
