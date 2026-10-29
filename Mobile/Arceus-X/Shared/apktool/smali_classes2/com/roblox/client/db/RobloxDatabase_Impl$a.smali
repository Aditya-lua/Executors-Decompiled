.class public final Lcom/roblox/client/db/RobloxDatabase_Impl$a;
.super Lx4/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/db/RobloxDatabase_Impl;->e0()Lx4/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "com/roblox/client/db/RobloxDatabase_Impl$a",
        "Lx4/a0;",
        "Lf5/b;",
        "connection",
        "",
        "a",
        "(Lf5/b;)V",
        "b",
        "f",
        "g",
        "i",
        "h",
        "Lx4/a0$a;",
        "j",
        "(Lf5/b;)Lx4/a0$a;",
        "database_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic d:Lcom/roblox/client/db/RobloxDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/roblox/client/db/RobloxDatabase_Impl;)V
    .locals 2

    iput-object p1, p0, Lcom/roblox/client/db/RobloxDatabase_Impl$a;->d:Lcom/roblox/client/db/RobloxDatabase_Impl;

    const-string p1, "88309002ec78233a9a3477c82fbe69af"

    const-string v0, "9db1597f250c1e8481d7591a61408d45"

    const/4 v1, 0x5

    invoke-direct {p0, v1, p1, v0}, Lx4/a0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `analytic_event` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serialized_event` TEXT NOT NULL, `event_name` TEXT, `event_context` TEXT, `serialized_params` TEXT, `retry_attempt_count` INTEGER)"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `notification_id` (`notification_id` TEXT NOT NULL, `last_received_timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`notification_id`))"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'88309002ec78233a9a3477c82fbe69af\')"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `analytic_event`"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `notification_id`"

    invoke-static {p1, v0}, Lf5/a;->a(Lf5/b;Ljava/lang/String;)V

    return-void
.end method

.method public f(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public g(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/db/RobloxDatabase_Impl$a;->d:Lcom/roblox/client/db/RobloxDatabase_Impl;

    invoke-static {v0, p1}, Lcom/roblox/client/db/RobloxDatabase_Impl;->d0(Lcom/roblox/client/db/RobloxDatabase_Impl;Lf5/b;)V

    return-void
.end method

.method public h(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public i(Lf5/b;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lc5/a;->a(Lf5/b;)V

    return-void
.end method

.method public j(Lf5/b;)Lx4/a0$a;
    .locals 14

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Lc5/o$a;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-string v2, "id"

    const-string v3, "INTEGER"

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-direct/range {v1 .. v7}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lc5/o$a;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const-string v4, "serialized_event"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v1, "serialized_event"

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc5/o$a;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const-string v5, "event_name"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v1, "event_name"

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lc5/o$a;

    const/4 v10, 0x0

    const/4 v11, 0x1

    const-string v6, "event_context"

    const-string v7, "TEXT"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v1, "event_context"

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lc5/o$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-string v7, "serialized_params"

    const-string v8, "TEXT"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v1, "serialized_params"

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lc5/o$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const-string v8, "retry_attempt_count"

    const-string v9, "INTEGER"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v1, "retry_attempt_count"

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v3, Lc5/o;

    const-string v4, "analytic_event"

    invoke-direct {v3, v4, v0, v1, v2}, Lc5/o;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    sget-object v0, Lc5/o;->e:Lc5/o$b;

    invoke-virtual {v0, p1, v4}, Lc5/o$b;->a(Lf5/b;Ljava/lang/String;)Lc5/o;

    move-result-object v1

    invoke-virtual {v3, v1}, Lc5/o;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "\n Found:\n"

    const/4 v5, 0x0

    if-nez v2, :cond_0

    new-instance p1, Lx4/a0$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "analytic_event(com.roblox.client.db.entities.AnalyticEvent).\n Expected:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v5, v0}, Lx4/a0$a;-><init>(ZLjava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Lc5/o$a;

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-string v7, "notification_id"

    const-string v8, "TEXT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    invoke-direct/range {v6 .. v12}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "notification_id"

    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lc5/o$a;

    const/4 v12, 0x0

    const/4 v13, 0x1

    const-string v8, "last_received_timestamp_ms"

    const-string v9, "INTEGER"

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lc5/o$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "last_received_timestamp_ms"

    invoke-interface {v1, v3, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v7, Lc5/o;

    invoke-direct {v7, v2, v1, v3, v6}, Lc5/o;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-virtual {v0, p1, v2}, Lc5/o$b;->a(Lf5/b;Ljava/lang/String;)Lc5/o;

    move-result-object p1

    invoke-virtual {v7, p1}, Lc5/o;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lx4/a0$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notification_id(com.roblox.client.db.entities.NotificationId).\n Expected:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v5, p1}, Lx4/a0$a;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, Lx4/a0$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lx4/a0$a;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
