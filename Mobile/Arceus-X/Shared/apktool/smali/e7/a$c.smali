.class public final Le7/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Le7/a$c;",
        "Landroid/content/ComponentCallbacks2;",
        "<init>",
        "(Le7/a;)V",
        "",
        "level",
        "",
        "onTrimMemory",
        "(I)V",
        "onLowMemory",
        "()V",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "(Landroid/content/res/Configuration;)V",
        "coil-core_release"
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
.field public final synthetic a:Le7/a;


# direct methods
.method public constructor <init>(Le7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Le7/a$c;->a:Le7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1    # Landroid/content/res/Configuration;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object p1, p0, Le7/a$c;->a:Le7/a;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Le7/a;->c()Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/w;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le7/a;->shutdown()V

    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public onLowMemory()V
    .locals 1

    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Le7/a$c;->onTrimMemory(I)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 7

    iget-object v0, p0, Le7/a$c;->a:Le7/a;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Le7/a;->c()Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/w;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lk6/w;->h()Lk6/w$a;

    move-result-object v2

    invoke-virtual {v2}, Lk6/w$a;->f()Le7/u;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "AndroidSystemCallbacks"

    sget-object v4, Le7/u$a;->a:Le7/u$a;

    invoke-interface {v2}, Le7/u;->a()Le7/u$a;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-gtz v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "trimMemory, level="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {v2, v3, v4, v5, v6}, Le7/u;->b(Ljava/lang/String;Le7/u$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const/16 v2, 0x28

    if-lt p1, v2, :cond_1

    invoke-virtual {v1}, Lk6/w;->e()Ls6/d;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ls6/d;->clear()V

    goto :goto_1

    :cond_1
    const/16 v2, 0x14

    if-lt p1, v2, :cond_2

    invoke-virtual {v0}, Le7/a;->b()Le7/a$a;

    move-result-object p1

    invoke-virtual {v1}, Lk6/w;->h()Lk6/w$a;

    move-result-object v1

    invoke-virtual {v1}, Lk6/w$a;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Le7/a$a;->a(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    const/16 v2, 0xa

    if-lt p1, v2, :cond_4

    invoke-virtual {v1}, Lk6/w;->e()Ls6/d;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ls6/d;->i()J

    move-result-wide v1

    const/4 v3, 0x2

    int-to-long v3, v3

    div-long/2addr v1, v3

    invoke-interface {p1, v1, v2}, Ls6/d;->g(J)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Le7/a;->shutdown()V

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method
