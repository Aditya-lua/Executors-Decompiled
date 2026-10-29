.class public Lm0/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/b1;
.implements Landroidx/camera/core/b$a;
.implements Lm0/l1$a;


# instance fields
.field public final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lm0/l1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lm0/c0;

.field public c:Lm0/d0;

.field public d:Lm0/y0;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm0/y0;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Lm0/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lm0/f1;->a:Ljava/util/Deque;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm0/f1;->f:Z

    invoke-static {}, Lp0/z;->b()V

    iput-object p1, p0, Lm0/f1;->b:Lm0/c0;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm0/f1;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic g(Lm0/f1;Lm0/y0;)V
    .locals 0

    iget-object p0, p0, Lm0/f1;->e:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic h(Lm0/f1;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lm0/f1;->d:Lm0/y0;

    invoke-virtual {p0}, Lm0/f1;->j()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/d;)V
    .locals 1

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Lm0/e1;

    invoke-direct {v0, p0}, Lm0/e1;-><init>(Lm0/f1;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lm0/l1;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/f1;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lm0/f1;->j()V

    return-void
.end method

.method public c()V
    .locals 5

    invoke-static {}, Lp0/z;->b()V

    new-instance v0, Lg0/h1;

    const-string v1, "Camera is closed."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Lm0/f1;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/l1;

    invoke-virtual {v2, v0}, Lm0/l1;->x(Lg0/h1;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lm0/f1;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lm0/f1;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lm0/y0;

    invoke-virtual {v4, v0}, Lm0/y0;->m(Lg0/h1;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public d(Lm0/d0;)V
    .locals 0

    invoke-static {}, Lp0/z;->b()V

    iput-object p1, p0, Lm0/f1;->c:Lm0/d0;

    invoke-virtual {p1, p0}, Lm0/d0;->k(Landroidx/camera/core/b$a;)V

    return-void
.end method

.method public e()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm0/f1;->f:Z

    invoke-virtual {p0}, Lm0/f1;->j()V

    return-void
.end method

.method public f(Lm0/l1;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    const-string v0, "TakePictureManagerImpl"

    const-string v1, "Add a new request for retrying."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm0/f1;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm0/f1;->j()V

    return-void
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lm0/f1;->d:Lm0/y0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j()V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    const-string v0, "Issue the next TakePictureRequest."

    const-string v1, "TakePictureManagerImpl"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lm0/f1;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "There is already a request in-flight."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-boolean v0, p0, Lm0/f1;->f:Z

    if-eqz v0, :cond_1

    const-string v0, "The class is paused."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lm0/f1;->c:Lm0/d0;

    invoke-virtual {v0}, Lm0/d0;->h()I

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Too many acquire images. Close image to be able to process next."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object v0, p0, Lm0/f1;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/l1;

    if-nez v0, :cond_3

    const-string v0, "No new request."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    new-instance v1, Lm0/y0;

    invoke-direct {v1, v0, p0}, Lm0/y0;-><init>(Lm0/l1;Lm0/l1$a;)V

    invoke-virtual {p0, v1}, Lm0/f1;->l(Lm0/y0;)V

    iget-object v2, p0, Lm0/f1;->c:Lm0/d0;

    invoke-virtual {v1}, Lm0/y0;->p()Lne/x;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Lm0/d0;->e(Lm0/l1;Lm0/a1;Lne/x;)Lx2/c;

    move-result-object v0

    iget-object v2, v0, Lx2/c;->a:Ljava/lang/Object;

    check-cast v2, Lm0/n;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lx2/c;->b:Ljava/lang/Object;

    check-cast v0, Lm0/v0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lm0/f1;->c:Lm0/d0;

    invoke-virtual {v3, v0}, Lm0/d0;->m(Lm0/v0;)V

    invoke-virtual {p0, v2}, Lm0/f1;->k(Lm0/n;)Lne/x;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm0/y0;->t(Lne/x;)V

    return-void
.end method

.method public final k(Lm0/n;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/n;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/f1;->b:Lm0/c0;

    invoke-interface {v0}, Lm0/c0;->b()V

    iget-object v0, p0, Lm0/f1;->b:Lm0/c0;

    invoke-virtual {p1}, Lm0/n;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lm0/c0;->a(Ljava/util/List;)Lne/x;

    move-result-object v0

    new-instance v1, Lm0/f1$a;

    invoke-direct {v1, p0, p1}, Lm0/f1$a;-><init>(Lm0/f1;Lm0/n;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final l(Lm0/y0;)V
    .locals 3

    invoke-virtual {p0}, Lm0/f1;->i()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lx2/g;->i(Z)V

    iput-object p1, p0, Lm0/f1;->d:Lm0/y0;

    invoke-virtual {p1}, Lm0/y0;->p()Lne/x;

    move-result-object v0

    new-instance v1, Lm0/c1;

    invoke-direct {v1, p0}, Lm0/c1;-><init>(Lm0/f1;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lm0/f1;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lm0/y0;->q()Lne/x;

    move-result-object v0

    new-instance v1, Lm0/d1;

    invoke-direct {v1, p0, p1}, Lm0/d1;-><init>(Lm0/f1;Lm0/y0;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public pause()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm0/f1;->f:Z

    iget-object v0, p0, Lm0/f1;->d:Lm0/y0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm0/y0;->n()V

    :cond_0
    return-void
.end method
