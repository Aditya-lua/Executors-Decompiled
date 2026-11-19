.class public Lm1/i0$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/l$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Landroid/view/Surface;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lm1/l$c$a;

.field public e:Ljava/util/concurrent/Executor;

.field public final synthetic f:Lm1/i0;


# direct methods
.method public constructor <init>(Lm1/i0;)V
    .locals 0

    iput-object p1, p0, Lm1/i0$h;->f:Lm1/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/i0$h;->a:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lm1/i0$h;->c:Ljava/util/Set;

    return-void
.end method

.method public static synthetic b(Lm1/l$c$a;Landroid/view/Surface;)V
    .locals 0

    invoke-interface {p0, p1}, Lm1/l$c$a;->a(Landroid/view/Surface;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Lm1/l$c$a;)V
    .locals 2

    iget-object v0, p0, Lm1/i0$h;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/l$c$a;

    iput-object v1, p0, Lm1/i0$h;->d:Lm1/l$c$a;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iput-object v1, p0, Lm1/i0$h;->e:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, p2, v1}, Lm1/i0$h;->c(Ljava/util/concurrent/Executor;Lm1/l$c$a;Landroid/view/Surface;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c(Ljava/util/concurrent/Executor;Lm1/l$c$a;Landroid/view/Surface;)V
    .locals 1

    :try_start_0
    new-instance v0, Lm1/e1;

    invoke-direct {v0, p2, p3}, Lm1/e1;-><init>(Lm1/l$c$a;Landroid/view/Surface;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lm1/i0$h;->f:Lm1/i0;

    iget-object p2, p2, Lm1/i0;->a:Ljava/lang/String;

    const-string p3, "Unable to post to the supplied executor."

    invoke-static {p2, p3, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, Lm1/i0$h;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    const/4 v2, 0x0

    iput-object v2, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    new-instance v2, Ljava/util/HashSet;

    iget-object v3, p0, Lm1/i0$h;->c:Ljava/util/Set;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Lm1/i0$h;->c:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_0
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public e()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-class v0, Landroidx/camera/video/internal/compat/quirk/EncoderNotUsePersistentInputSurfaceQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/video/internal/compat/quirk/EncoderNotUsePersistentInputSurfaceQuirk;

    iget-object v1, p0, Lm1/i0$h;->a:Ljava/lang/Object;

    monitor-enter v1

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    if-nez v0, :cond_0

    invoke-static {}, Lm1/i0$d;->a()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lm1/i0$h;->f:Lm1/i0;

    iget-object v2, v2, Lm1/i0;->f:Landroid/media/MediaCodec;

    iget-object v3, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    invoke-static {v2, v3}, Lm1/i0$d;->b(Landroid/media/MediaCodec;Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lm1/i0$h;->c:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lm1/i0$h;->f:Lm1/i0;

    iget-object v0, v0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lm1/i0$h;->b:Landroid/view/Surface;

    :goto_1
    iget-object v2, p0, Lm1/i0$h;->d:Lm1/l$c$a;

    iget-object v3, p0, Lm1/i0$h;->e:Ljava/util/concurrent/Executor;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v3, v2, v0}, Lm1/i0$h;->c(Ljava/util/concurrent/Executor;Lm1/l$c$a;Landroid/view/Surface;)V

    :cond_3
    return-void

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
