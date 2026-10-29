.class public Lm0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm0/a1;


# instance fields
.field public final a:Lm0/l1;

.field public final b:Lm0/l1$a;

.field public final c:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Z

.field public i:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm0/l1;Lm0/l1$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm0/y0;->g:Z

    iput-boolean v0, p0, Lm0/y0;->h:Z

    iput-object p1, p0, Lm0/y0;->a:Lm0/l1;

    iput-object p2, p0, Lm0/y0;->b:Lm0/l1$a;

    new-instance p1, Lm0/w0;

    invoke-direct {p1, p0}, Lm0/w0;-><init>(Lm0/y0;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lm0/y0;->c:Lne/x;

    new-instance p1, Lm0/x0;

    invoke-direct {p1, p0}, Lm0/x0;-><init>(Lm0/y0;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lm0/y0;->d:Lne/x;

    return-void
.end method

.method public static synthetic j(Lm0/y0;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lm0/y0;->e:Ly1/c$a;

    const-string p0, "CaptureCompleteFuture"

    return-object p0
.end method

.method public static synthetic k(Lm0/y0;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lm0/y0;->f:Ly1/c$a;

    const-string p0, "RequestCompleteFuture"

    return-object p0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/l1;->w(I)V

    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/l1;->y(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lm0/y0;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm0/y0;->h:Z

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->j()Lg0/f1$f;

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->l()Lg0/f1$g;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lg0/f1$g;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Lg0/f1$i;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lm0/y0;->o()V

    invoke-virtual {p0}, Lm0/y0;->r()V

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/l1;->A(Lg0/f1$i;)V

    return-void
.end method

.method public e(Lg0/h1;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lm0/y0;->o()V

    invoke-virtual {p0}, Lm0/y0;->r()V

    invoke-virtual {p0, p1}, Lm0/y0;->s(Lg0/h1;)V

    return-void
.end method

.method public f(Lg0/h1;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lm0/y0;->s(Lg0/h1;)V

    :cond_1
    invoke-virtual {p0}, Lm0/y0;->r()V

    iget-object v1, p0, Lm0/y0;->e:Ly1/c$a;

    invoke-virtual {v1, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    if-eqz v0, :cond_2

    iget-object p1, p0, Lm0/y0;->b:Lm0/l1$a;

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-interface {p1, v0}, Lm0/l1$a;->f(Lm0/l1;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public g(Landroidx/camera/core/d;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lm0/y0;->o()V

    invoke-virtual {p0}, Lm0/y0;->r()V

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/l1;->z(Landroidx/camera/core/d;)V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lm0/y0;->g:Z

    return v0
.end method

.method public i()V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-boolean v0, p0, Lm0/y0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lm0/y0;->h:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lm0/y0;->c()V

    :cond_1
    iget-object v0, p0, Lm0/y0;->e:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public final l(Lg0/h1;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm0/y0;->g:Z

    iget-object v1, p0, Lm0/y0;->i:Lne/x;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lne/x;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iget-object v0, p0, Lm0/y0;->e:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    iget-object p1, p0, Lm0/y0;->f:Ly1/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public m(Lg0/h1;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->d:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lm0/y0;->l(Lg0/h1;)V

    invoke-virtual {p0, p1}, Lm0/y0;->s(Lg0/h1;)V

    return-void
.end method

.method public n()V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->d:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lg0/h1;

    const-string v1, "The request is aborted silently and retried."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lm0/y0;->l(Lg0/h1;)V

    iget-object v0, p0, Lm0/y0;->b:Lm0/l1$a;

    iget-object v1, p0, Lm0/y0;->a:Lm0/l1;

    invoke-interface {v0, v1}, Lm0/l1$a;->f(Lm0/l1;)V

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lm0/y0;->c:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "onImageCaptured() must be called before onFinalResult()"

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    return-void
.end method

.method public p()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->c:Lne/x;

    return-object v0
.end method

.method public q()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->d:Lne/x;

    return-object v0
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->s()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0}, Lm0/l1;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm0/y0;->d:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The callback can only complete once."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lm0/y0;->f:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public final s(Lg0/h1;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->a:Lm0/l1;

    invoke-virtual {v0, p1}, Lm0/l1;->x(Lg0/h1;)V

    return-void
.end method

.method public t(Lne/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/y0;->i:Lne/x;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "CaptureRequestFuture can only be set once."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lm0/y0;->i:Lne/x;

    return-void
.end method
