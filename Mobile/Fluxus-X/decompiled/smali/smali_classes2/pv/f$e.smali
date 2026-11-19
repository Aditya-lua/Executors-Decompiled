.class public final Lpv/f$e;
.super Lqv/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpv/f;-><init>(Lew/k;Lew/b0;IIJLqv/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "pv/f$e",
        "Lqv/a;",
        "",
        "f",
        "()J",
        "okhttp"
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
.field public final synthetic e:Lpv/f;


# direct methods
.method public constructor <init>(Lpv/f;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lpv/f$e;->e:Lpv/f;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, Lqv/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 5

    iget-object v0, p0, Lpv/f$e;->e:Lpv/f;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, Lpv/f;->c(Lpv/f;)Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lpv/f;->u()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    invoke-virtual {v0}, Lpv/f;->c0()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {v0, v1}, Lpv/f;->h(Lpv/f;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    invoke-static {v0}, Lpv/f;->e(Lpv/f;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0}, Lpv/f;->Q()V

    const/4 v4, 0x0

    invoke-static {v0, v4}, Lpv/f;->k(Lpv/f;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    invoke-static {v0, v1}, Lpv/f;->g(Lpv/f;Z)V

    invoke-static {v0}, Lpv/f;->d(Lpv/f;)Lew/f;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lnv/n;->f(Ljava/io/Closeable;)V

    :cond_1
    invoke-static {}, Lew/v;->a()Lew/j0;

    move-result-object v1

    invoke-static {v1}, Lew/v;->b(Lew/j0;)Lew/f;

    move-result-object v1

    invoke-static {v0, v1}, Lpv/f;->f(Lpv/f;Lew/f;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    :goto_1
    monitor-exit v0

    return-wide v2

    :cond_3
    :goto_2
    monitor-exit v0

    return-wide v2

    :goto_3
    monitor-exit v0

    throw v1
.end method
