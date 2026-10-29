.class public Lx0/n0$a;
.super Ln0/u1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final o:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public q:Ln0/u1;

.field public r:Lx0/q0;


# direct methods
.method public constructor <init>(Landroid/util/Size;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ln0/u1;-><init>(Landroid/util/Size;I)V

    new-instance p1, Lx0/l0;

    invoke-direct {p1, p0}, Lx0/l0;-><init>(Lx0/n0$a;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lx0/n0$a;->o:Lne/x;

    return-void
.end method

.method public static synthetic q(Lx0/n0$a;)V
    .locals 1

    iget-object v0, p0, Lx0/n0$a;->r:Lx0/q0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx0/q0;->f()V

    :cond_0
    iget-object v0, p0, Lx0/n0$a;->q:Ln0/u1;

    if-nez v0, :cond_1

    iget-object v0, p0, Lx0/n0$a;->p:Ly1/c$a;

    invoke-virtual {v0}, Ly1/c$a;->d()Z

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lx0/n0$a;->q:Ln0/u1;

    return-void
.end method

.method public static synthetic r(Lx0/n0$a;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx0/n0$a;->p:Ly1/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SettableFuture hashCode: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()V
    .locals 1

    invoke-super {p0}, Ln0/u1;->d()V

    new-instance v0, Lx0/k0;

    invoke-direct {v0, p0}, Lx0/k0;-><init>(Lx0/n0$a;)V

    invoke-static {v0}, Lp0/z;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method public o()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx0/n0$a;->o:Lne/x;

    return-object v0
.end method

.method public s()Z
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lx0/n0$a;->q:Ln0/u1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/u1;->m()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public t(Lx0/q0;)V
    .locals 2

    iget-object v0, p0, Lx0/n0$a;->r:Lx0/q0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Consumer can only be linked once."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lx0/n0$a;->r:Lx0/q0;

    return-void
.end method

.method public u(Ln0/u1;Ljava/lang/Runnable;)Z
    .locals 5

    invoke-static {}, Lp0/z;->b()V

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx0/n0$a;->q:Ln0/u1;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    const-string v3, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"

    invoke-static {v0, v3}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {p1}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "The provider\'s size(%s) must match the parent(%s)"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Ln0/u1;->i()I

    move-result v0

    invoke-virtual {p1}, Ln0/u1;->i()I

    move-result v3

    if-ne v0, v3, :cond_2

    move v1, v2

    :cond_2
    invoke-virtual {p0}, Ln0/u1;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Ln0/u1;->i()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "The provider\'s format(%s) must match the parent(%s)"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Ln0/u1;->m()Z

    move-result v0

    xor-int/2addr v0, v2

    const-string v1, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lx0/n0$a;->q:Ln0/u1;

    invoke-virtual {p1}, Ln0/u1;->j()Lne/x;

    move-result-object v0

    iget-object v1, p0, Lx0/n0$a;->p:Ly1/c$a;

    invoke-static {v0, v1}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    invoke-virtual {p1}, Ln0/u1;->l()V

    invoke-virtual {p0}, Ln0/u1;->k()Lne/x;

    move-result-object v0

    new-instance v1, Lx0/m0;

    invoke-direct {v1, p1}, Lx0/m0;-><init>(Ln0/u1;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Ln0/u1;->f()Lne/x;

    move-result-object p1

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return v2
.end method
