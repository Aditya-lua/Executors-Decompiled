.class public final Landroidx/camera/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/a3$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/a3$a<",
        "Ln0/p0$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ln0/o0;

.field public final b:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Landroidx/camera/view/PreviewView$e;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/camera/view/PreviewView$e;

.field public final d:Landroidx/camera/view/c;

.field public e:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(Ln0/o0;Landroidx/lifecycle/d0;Landroidx/camera/view/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Landroidx/lifecycle/d0<",
            "Landroidx/camera/view/PreviewView$e;",
            ">;",
            "Landroidx/camera/view/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/view/a;->f:Z

    iput-object p1, p0, Landroidx/camera/view/a;->a:Ln0/o0;

    iput-object p2, p0, Landroidx/camera/view/a;->b:Landroidx/lifecycle/d0;

    iput-object p3, p0, Landroidx/camera/view/a;->d:Landroidx/camera/view/c;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/view/PreviewView$e;

    iput-object p1, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$e;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic b(Landroidx/camera/view/a;Lg0/t;Ljava/util/List;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/camera/view/a$b;

    invoke-direct {v0, p0, p3, p1}, Landroidx/camera/view/a$b;-><init>(Landroidx/camera/view/a;Ly1/c$a;Lg0/t;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    check-cast p1, Ln0/o0;

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-interface {p1, p0, v0}, Ln0/o0;->f(Ljava/util/concurrent/Executor;Ln0/u;)V

    const-string p0, "waitForCaptureResult"

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/view/a;Ljava/lang/Void;)Lne/x;
    .locals 0

    iget-object p0, p0, Landroidx/camera/view/a;->d:Landroidx/camera/view/c;

    invoke-virtual {p0}, Landroidx/camera/view/c;->i()Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/view/a;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Landroidx/camera/view/PreviewView$e;->b:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->i(Landroidx/camera/view/PreviewView$e;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ln0/p0$a;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->g(Ln0/p0$a;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/a;->e:Lne/x;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/a;->e:Lne/x;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/view/a;->e()V

    return-void
.end method

.method public g(Ln0/p0$a;)V
    .locals 1

    sget-object v0, Ln0/p0$a;->f:Ln0/p0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, Ln0/p0$a;->d:Ln0/p0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, Ln0/p0$a;->c:Ln0/p0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, Ln0/p0$a;->b:Ln0/p0$a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ln0/p0$a;->g:Ln0/p0$a;

    if-eq p1, v0, :cond_1

    sget-object v0, Ln0/p0$a;->h:Ln0/p0$a;

    if-eq p1, v0, :cond_1

    sget-object v0, Ln0/p0$a;->e:Ln0/p0$a;

    if-ne p1, v0, :cond_3

    :cond_1
    iget-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/camera/view/a;->a:Ln0/o0;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->h(Lg0/t;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    return-void

    :cond_2
    :goto_0
    sget-object p1, Landroidx/camera/view/PreviewView$e;->a:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->i(Landroidx/camera/view/PreviewView$e;)V

    iget-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    invoke-virtual {p0}, Landroidx/camera/view/a;->e()V

    :cond_3
    return-void
.end method

.method public final h(Lg0/t;)V
    .locals 4

    sget-object v0, Landroidx/camera/view/PreviewView$e;->a:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p0, v0}, Landroidx/camera/view/a;->i(Landroidx/camera/view/PreviewView$e;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v0}, Landroidx/camera/view/a;->j(Lg0/t;Ljava/util/List;)Lne/x;

    move-result-object v1

    invoke-static {v1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v1

    new-instance v2, Lp1/o;

    invoke-direct {v2, p0}, Lp1/o;-><init>(Landroidx/camera/view/a;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object v1

    new-instance v2, Lp1/p;

    invoke-direct {v2, p0}, Lp1/p;-><init>(Landroidx/camera/view/a;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/view/a;->e:Lne/x;

    new-instance v2, Landroidx/camera/view/a$a;

    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/view/a$a;-><init>(Landroidx/camera/view/a;Ljava/util/List;Lg0/t;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public i(Landroidx/camera/view/PreviewView$e;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$e;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "StreamStateObserver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update Preview stream state to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/view/a;->b:Landroidx/lifecycle/d0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Lg0/t;Ljava/util/List;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/t;",
            "Ljava/util/List<",
            "Ln0/u;",
            ">;)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp1/q;

    invoke-direct {v0, p0, p1, p2}, Lp1/q;-><init>(Landroidx/camera/view/a;Lg0/t;Ljava/util/List;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/view/a;->f()V

    sget-object p1, Landroidx/camera/view/PreviewView$e;->a:Landroidx/camera/view/PreviewView$e;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->i(Landroidx/camera/view/PreviewView$e;)V

    return-void
.end method
