.class public final Lz/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/l3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/z4$c;,
        Lz/z4$d;,
        Lz/z4$b;
    }
.end annotation


# static fields
.field public static p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public static q:I


# instance fields
.field public final a:Ln0/q3;

.field public final b:Lz/z0;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lz/k3;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ln0/o3;

.field public h:Lz/r2;

.field public i:Ln0/o3;

.field public j:Lz/z4$c;

.field public volatile k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lz/z4$d;

.field public m:Lf0/l;

.field public n:Lf0/l;

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lz/z4;->p:Ljava/util/List;

    const/4 v0, 0x0

    sput v0, Lz/z4;->q:I

    return-void
.end method

.method public constructor <init>(Ln0/q3;Lz/z0;Lb0/e;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lf0/i;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/z4;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lz/z4;->k:Ljava/util/List;

    new-instance v0, Lf0/l$a;

    invoke-direct {v0}, Lf0/l$a;-><init>()V

    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    iput-object v0, p0, Lz/z4;->m:Lf0/l;

    new-instance v0, Lf0/l$a;

    invoke-direct {v0}, Lf0/l$a;-><init>()V

    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    iput-object v0, p0, Lz/z4;->n:Lf0/l;

    const/4 v0, 0x0

    iput v0, p0, Lz/z4;->o:I

    new-instance v1, Lz/k3;

    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionShouldUseMrirQuirk;

    invoke-static {v2}, Lc0/e;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-direct {v1, p3, v0, p6}, Lz/k3;-><init>(Lb0/e;ZLf0/i;)V

    iput-object v1, p0, Lz/z4;->e:Lz/k3;

    iput-object p1, p0, Lz/z4;->a:Ln0/q3;

    iput-object p2, p0, Lz/z4;->b:Lz/z0;

    iput-object p4, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lz/z4;->d:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object p1, Lz/z4$c;->a:Lz/z4$c;

    iput-object p1, p0, Lz/z4;->j:Lz/z4$c;

    new-instance p1, Lz/z4$d;

    invoke-direct {p1}, Lz/z4$d;-><init>()V

    iput-object p1, p0, Lz/z4;->l:Lz/z4$d;

    sget p1, Lz/z4;->q:I

    add-int/lit8 p2, p1, 0x1

    sput p2, Lz/z4;->q:I

    iput p1, p0, Lz/z4;->o:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "New ProcessingCaptureSession (id="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lz/z4;->o:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ProcessingCaptureSession"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(Lz/z4;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, Lz/z4;->e:Lz/k3;

    invoke-virtual {p0, p1}, Lz/z4;->y(Lz/k3;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic k(Ln0/u1;)V
    .locals 1

    sget-object v0, Lz/z4;->p:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic l(Lz/z4;Ln0/u1;)V
    .locals 0

    iget-object p0, p0, Lz/z4;->f:Ljava/util/List;

    invoke-static {p0}, Ln0/x1;->c(Ljava/util/List;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ln0/u1;->e()V

    :cond_0
    return-void
.end method

.method public static synthetic m(Lz/z4;Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;Ljava/util/List;)Lne/x;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-- getSurfaces done, start init (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ProcessingCaptureSession"

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    sget-object v3, Lz/z4$c;->e:Lz/z4$c;

    if-ne v0, v3, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "SessionProcessorCaptureSession is closed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object p0

    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u1;

    new-instance p1, Ln0/u1$a;

    const-string p2, "Surface closed"

    invoke-direct {p1, p2, p0}, Ln0/u1$a;-><init>(Ljava/lang/String;Ln0/u1;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p4, 0x0

    move v3, p4

    move-object v4, v0

    move-object v5, v4

    move-object v6, v5

    :goto_0
    invoke-virtual {p1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v3, v7, :cond_6

    invoke-virtual {p1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/u1;

    invoke-static {v7}, Lz/z4;->t(Ln0/u1;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lz/z4;->u(Ln0/u1;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v7}, Lz/z4;->s(Ln0/u1;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Ln0/u1;->j()Lne/x;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/Surface;

    invoke-virtual {v7}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v7}, Ln0/u1;->i()I

    move-result v7

    invoke-static {v5, v8, v7}, Ln0/d3;->a(Landroid/view/Surface;Landroid/util/Size;I)Ln0/d3;

    move-result-object v5

    goto :goto_2

    :cond_3
    invoke-static {v7}, Lz/z4;->r(Ln0/u1;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v7}, Ln0/u1;->j()Lne/x;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/Surface;

    invoke-virtual {v7}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v7}, Ln0/u1;->i()I

    move-result v7

    invoke-static {v6, v8, v7}, Ln0/d3;->a(Landroid/view/Surface;Landroid/util/Size;I)Ln0/d3;

    move-result-object v6

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v7}, Ln0/u1;->j()Lne/x;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/Surface;

    invoke-virtual {v7}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v7}, Ln0/u1;->i()I

    move-result v7

    invoke-static {v4, v8, v7}, Ln0/d3;->a(Landroid/view/Surface;Landroid/util/Size;I)Ln0/d3;

    move-result-object v4

    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Ln0/o3;->j()Ln0/o3$f;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {p1}, Ln0/o3;->j()Ln0/o3$f;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$f;->f()Ln0/u1;

    move-result-object v0

    invoke-virtual {v0}, Ln0/u1;->j()Lne/x;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    invoke-virtual {v0}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v7

    invoke-virtual {v0}, Ln0/u1;->i()I

    move-result v8

    invoke-static {v3, v7, v8}, Ln0/d3;->a(Landroid/view/Surface;Landroid/util/Size;I)Ln0/d3;

    move-result-object v3

    goto :goto_3

    :cond_7
    move-object v3, v0

    :goto_3
    sget-object v7, Lz/z4$c;->b:Lz/z4$c;

    iput-object v7, p0, Lz/z4;->j:Lz/z4$c;

    :try_start_0
    new-instance v7, Ljava/util/ArrayList;

    iget-object v8, p0, Lz/z4;->f:Ljava/util/List;

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz v0, :cond_8

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-static {v7}, Ln0/x1;->d(Ljava/util/List;)V
    :try_end_0
    .catch Ln0/u1$a; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "== initSession (id="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, p0, Lz/z4;->o:I

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    iget-object v1, p0, Lz/z4;->a:Ln0/q3;

    iget-object v7, p0, Lz/z4;->b:Lz/z0;

    invoke-static {v4, v5, v6, v3}, Ln0/e3;->a(Ln0/d3;Ln0/d3;Ln0/d3;Ln0/d3;)Ln0/e3;

    move-result-object v3

    invoke-interface {v1, v7, v3}, Ln0/q3;->i(Lg0/t;Ln0/e3;)Ln0/o3;

    move-result-object v1

    iput-object v1, p0, Lz/z4;->i:Ln0/o3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ln0/u1;

    invoke-virtual {p4}, Ln0/u1;->k()Lne/x;

    move-result-object p4

    new-instance v1, Lz/u4;

    invoke-direct {v1, p0, v0}, Lz/u4;-><init>(Lz/z4;Ln0/u1;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {p4, v1, v0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p4, p0, Lz/z4;->i:Ln0/o3;

    invoke-virtual {p4}, Ln0/o3;->p()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u1;

    sget-object v1, Lz/z4;->p:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ln0/u1;->k()Lne/x;

    move-result-object v1

    new-instance v2, Lz/v4;

    invoke-direct {v2, v0}, Lz/v4;-><init>(Ln0/u1;)V

    iget-object v0, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, v0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_4

    :cond_9
    new-instance p4, Ln0/o3$h;

    invoke-direct {p4}, Ln0/o3$h;-><init>()V

    invoke-virtual {p4, p1}, Ln0/o3$h;->b(Ln0/o3;)V

    invoke-virtual {p4}, Ln0/o3$h;->d()V

    iget-object p1, p0, Lz/z4;->i:Ln0/o3;

    invoke-virtual {p4, p1}, Ln0/o3$h;->b(Ln0/o3;)V

    invoke-virtual {p4}, Ln0/o3$h;->g()Z

    move-result p1

    const-string v0, "Cannot transform the SessionConfig"

    invoke-static {p1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p4}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object p1

    iget-object p4, p0, Lz/z4;->e:Lz/k3;

    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p4, p1, p2, p3}, Lz/k3;->a(Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)Lne/x;

    move-result-object p1

    new-instance p2, Lz/z4$a;

    invoke-direct {p2, p0}, Lz/z4$a;-><init>(Lz/z4;)V

    iget-object p0, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-object p1

    :catchall_0
    move-exception p1

    const-string p2, "initSession failed"

    invoke-static {v2, p2, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lz/z4;->f:Ljava/util/List;

    invoke-static {p0}, Ln0/x1;->c(Ljava/util/List;)V

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ln0/u1;->e()V

    :cond_a
    throw p1

    :catch_0
    move-exception p0

    invoke-static {p0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lz/z4;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "== deInitSession (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lz/z4;->a:Ln0/q3;

    invoke-interface {p0}, Ln0/q3;->d()V

    return-void
.end method

.method public static o(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/l1;

    invoke-virtual {v0}, Ln0/l1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/u;

    invoke-virtual {v0}, Ln0/l1;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Ln0/u;->a(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static p(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;)",
            "Ljava/util/List<",
            "Ln0/r3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u1;

    instance-of v2, v1, Ln0/r3;

    const-string v3, "Surface must be SessionProcessorSurface"

    invoke-static {v2, v3}, Lx2/g;->b(ZLjava/lang/Object;)V

    check-cast v1, Ln0/r3;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static q(Ln0/l1;)Z
    .locals 2

    invoke-virtual {p0}, Ln0/l1;->i()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u1;

    invoke-static {v0}, Lz/z4;->t(Ln0/u1;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lz/z4;->u(Ln0/u1;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static r(Ln0/u1;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lg0/u0;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static s(Ln0/u1;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lg0/f1;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static t(Ln0/u1;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lg0/a2;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static u(Ln0/u1;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Lb1/g;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)Lne/x;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o3;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Lz/h5$a;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    sget-object v1, Lz/z4$c;->a:Lz/z4$c;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state state:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "SessionConfig contains no surfaces"

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lz/z4;->f:Ljava/util/List;

    iget-object v6, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Lz/z4;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v3, 0x0

    const-wide/16 v4, 0x1388

    invoke-static/range {v2 .. v7}, Ln0/x1;->e(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v0

    new-instance v1, Lz/x4;

    invoke-direct {v1, p0, p1, p2, p3}, Lz/x4;-><init>(Lz/z4;Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)V

    iget-object p1, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance p2, Lz/y4;

    invoke-direct {p2, p0}, Lz/y4;-><init>(Lz/z4;)V

    iget-object p3, p0, Lz/z4;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, p3}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "issueCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") + state ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Run issueCaptureRequests in wrong state, state = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lz/z4;->o(Ljava/util/List;)V

    return-void

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/l1;

    invoke-virtual {v0}, Ln0/l1;->k()I

    move-result v1

    invoke-virtual {p0, v1}, Lz/z4;->v(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lz/z4;->w(Ln0/l1;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lz/z4;->x(Ln0/l1;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void

    :cond_5
    iget-object v0, p0, Lz/z4;->k:Ljava/util/List;

    if-eqz v0, :cond_6

    invoke-static {p1}, Lz/z4;->o(Ljava/util/List;)V

    const-string p1, "cancel the request because are pending un-submitted request"

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6
    iput-object p1, p0, Lz/z4;->k:Ljava/util/List;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lz/z4;->e:Lz/k3;

    invoke-virtual {v0}, Lz/k3;->c()Z

    move-result v0

    return v0
.end method

.method public close()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    sget-object v2, Lz/z4$c;->c:Lz/z4$c;

    if-ne v0, v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "== onCaptureSessionEnd (id = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lz/z4;->o:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->a:Ln0/q3;

    invoke-interface {v0}, Ln0/q3;->c()V

    iget-object v0, p0, Lz/z4;->h:Lz/r2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz/r2;->a()V

    :cond_0
    sget-object v0, Lz/z4$c;->d:Lz/z4$c;

    iput-object v0, p0, Lz/z4;->j:Lz/z4$c;

    :cond_1
    iget-object v0, p0, Lz/z4;->e:Lz/k3;

    invoke-virtual {v0}, Lz/k3;->close()V

    return-void
.end method

.method public d(Ln0/o3;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSessionConfig (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lz/z4;->g:Ln0/o3;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz/z4;->h:Lz/r2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lz/r2;->b(Ln0/o3;)V

    :cond_1
    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    sget-object v1, Lz/z4$c;->c:Lz/z4$c;

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Ln0/o3;->g()Ln0/n1;

    move-result-object v0

    invoke-static {v0}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object v0

    invoke-virtual {p1}, Ln0/o3;->l()Ln0/l1;

    move-result-object v1

    invoke-static {v1}, Lz/k2;->h(Ln0/l1;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v2, v1}, Lf0/l$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lf0/l$a;

    :cond_2
    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    iput-object v0, p0, Lz/z4;->m:Lf0/l;

    iget-object v1, p0, Lz/z4;->n:Lf0/l;

    invoke-virtual {p0, v0, v1}, Lz/z4;->z(Lf0/l;Lf0/l;)V

    invoke-virtual {p1}, Ln0/o3;->l()Ln0/l1;

    move-result-object v0

    invoke-static {v0}, Lz/z4;->q(Ln0/l1;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p1, p0, Lz/z4;->a:Ln0/q3;

    invoke-interface {p1}, Ln0/q3;->a()V

    return-void

    :cond_3
    iget-object v0, p0, Lz/z4;->a:Ln0/q3;

    invoke-virtual {p1}, Ln0/o3;->l()Ln0/l1;

    move-result-object p1

    invoke-virtual {p1}, Ln0/l1;->j()Ln0/z3;

    move-result-object p1

    iget-object v1, p0, Lz/z4;->l:Lz/z4$d;

    invoke-interface {v0, p1, v1}, Ln0/q3;->l(Ln0/z3;Ln0/q3$a;)I

    :cond_4
    :goto_0
    return-void
.end method

.method public e()V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cancelIssuedCaptureRequests (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->k:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lz/z4;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/l1;

    invoke-virtual {v1}, Ln0/l1;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/u;

    invoke-virtual {v1}, Ln0/l1;->f()I

    move-result v4

    invoke-virtual {v3, v4}, Ln0/u;->a(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lz/z4;->k:Ljava/util/List;

    :cond_2
    return-void
.end method

.method public f(Z)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "release (id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/z4;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") mProcessorState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessingCaptureSession"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/z4;->e:Lz/k3;

    invoke-virtual {v0, p1}, Lz/k3;->f(Z)Lne/x;

    move-result-object p1

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lz/w4;

    invoke-direct {v0, p0}, Lz/w4;-><init>(Lz/z4;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :goto_0
    sget-object v0, Lz/z4$c;->e:Lz/z4$c;

    iput-object v0, p0, Lz/z4;->j:Lz/z4$c;

    return-object p1
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z4;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/z4;->k:Ljava/util/List;

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public h()Ln0/o3;
    .locals 1

    iget-object v0, p0, Lz/z4;->g:Ln0/o3;

    return-object v0
.end method

.method public i(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ln0/u1;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final v(I)Z
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public w(Ln0/l1;)V
    .locals 6

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v0

    invoke-static {v0}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object v0

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v1

    sget-object v2, Ln0/l1;->i:Ln0/n1$a;

    invoke-interface {v1, v2}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v3

    invoke-interface {v3, v2}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lf0/l$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lf0/l$a;

    :cond_0
    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v1

    sget-object v2, Ln0/l1;->j:Ln0/n1$a;

    invoke-interface {v1, v2}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v3

    invoke-interface {v3, v2}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->byteValue()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lf0/l$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lf0/l$a;

    :cond_1
    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    iput-object v0, p0, Lz/z4;->n:Lf0/l;

    iget-object v1, p0, Lz/z4;->m:Lf0/l;

    invoke-virtual {p0, v1, v0}, Lz/z4;->z(Lf0/l;Lf0/l;)V

    iget-object v0, p0, Lz/z4;->a:Ln0/q3;

    invoke-virtual {p1}, Ln0/l1;->m()Z

    move-result v1

    invoke-virtual {p1}, Ln0/l1;->j()Ln0/z3;

    move-result-object v2

    new-instance v3, Lz/z4$b;

    invoke-virtual {p1}, Ln0/l1;->f()I

    move-result v4

    invoke-virtual {p1}, Ln0/l1;->c()Ljava/util/List;

    move-result-object p1

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lz/z4$b;-><init>(ILjava/util/List;Lz/z4$a;)V

    invoke-interface {v0, v1, v2, v3}, Ln0/q3;->b(ZLn0/z3;Ln0/q3$a;)I

    return-void
.end method

.method public x(Ln0/l1;)V
    .locals 6

    const-string v0, "ProcessingCaptureSession"

    const-string v1, "issueTriggerRequest"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln0/l1;->g()Ln0/n1;

    move-result-object v0

    invoke-static {v0}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object v0

    invoke-virtual {v0}, Lf0/l$a;->c()Lf0/l;

    move-result-object v0

    invoke-interface {v0}, Ln0/l3;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/n1$a;

    invoke-virtual {v2}, Ln0/n1$a;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    iget-object v1, p0, Lz/z4;->a:Ln0/q3;

    invoke-virtual {p1}, Ln0/l1;->j()Ln0/z3;

    move-result-object v2

    new-instance v3, Lz/z4$b;

    invoke-virtual {p1}, Ln0/l1;->f()I

    move-result v4

    invoke-virtual {p1}, Ln0/l1;->c()Ljava/util/List;

    move-result-object p1

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lz/z4$b;-><init>(ILjava/util/List;Lz/z4$a;)V

    invoke-interface {v1, v0, v2, v3}, Ln0/q3;->n(Ln0/n1;Ln0/z3;Ln0/q3$a;)I

    return-void

    :cond_2
    filled-new-array {p1}, [Ln0/l1;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lz/z4;->o(Ljava/util/List;)V

    return-void
.end method

.method public y(Lz/k3;)V
    .locals 2

    iget-object v0, p0, Lz/z4;->j:Lz/z4$c;

    sget-object v1, Lz/z4$c;->b:Lz/z4$c;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lz/r2;

    iget-object v1, p0, Lz/z4;->i:Ln0/o3;

    invoke-virtual {v1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lz/z4;->p(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lz/r2;-><init>(Lz/k3;Ljava/util/List;)V

    iput-object v0, p0, Lz/z4;->h:Lz/r2;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "== onCaptureSessinStarted (id = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lz/z4;->o:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ProcessingCaptureSession"

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/z4;->a:Ln0/q3;

    iget-object v0, p0, Lz/z4;->h:Lz/r2;

    invoke-interface {p1, v0}, Ln0/q3;->k(Ln0/m3;)V

    sget-object p1, Lz/z4$c;->c:Lz/z4$c;

    iput-object p1, p0, Lz/z4;->j:Lz/z4$c;

    iget-object p1, p0, Lz/z4;->g:Ln0/o3;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lz/z4;->d(Ln0/o3;)V

    :cond_1
    iget-object p1, p0, Lz/z4;->k:Ljava/util/List;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz/z4;->k:Ljava/util/List;

    invoke-virtual {p0, p1}, Lz/z4;->b(Ljava/util/List;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lz/z4;->k:Ljava/util/List;

    :cond_2
    :goto_0
    return-void
.end method

.method public final z(Lf0/l;Lf0/l;)V
    .locals 1

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    invoke-virtual {v0, p1}, Ly/a$a;->c(Ln0/n1;)Ly/a$a;

    invoke-virtual {v0, p2}, Ly/a$a;->c(Ln0/n1;)Ly/a$a;

    iget-object p1, p0, Lz/z4;->a:Ln0/q3;

    invoke-virtual {v0}, Ly/a$a;->b()Ly/a;

    move-result-object p2

    invoke-interface {p1, p2}, Ln0/q3;->g(Ln0/n1;)V

    return-void
.end method
