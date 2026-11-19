.class public final Lvd/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lvd/w;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Lvd/w;
    .locals 3

    const-class v0, Lvd/x;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lvd/x;->a:Lvd/w;

    if-nez v1, :cond_0

    new-instance v1, Lvd/n1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lvd/n1;-><init>(Lvd/m1;)V

    invoke-static {p0}, Lge/h;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v1, p0}, Lvd/n1;->a(Landroid/content/Context;)Lvd/n1;

    invoke-interface {v1}, Lvd/v;->b()Lvd/w;

    move-result-object p0

    sput-object p0, Lvd/x;->a:Lvd/w;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lvd/x;->a:Lvd/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
