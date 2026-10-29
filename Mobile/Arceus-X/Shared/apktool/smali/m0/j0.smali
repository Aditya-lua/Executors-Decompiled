.class public Lm0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/j2;


# instance fields
.field public final a:Ln0/j2;

.field public b:Lm0/v0;


# direct methods
.method public constructor <init>(Ln0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/j0;->a:Ln0/j2;

    return-void
.end method

.method public static synthetic a(Lm0/j0;Ln0/j2$a;Ln0/j2;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Ln0/j2$a;->a(Ln0/j2;)V

    return-void
.end method


# virtual methods
.method public b()Landroidx/camera/core/d;
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm0/j0;->j(Landroidx/camera/core/d;)Landroidx/camera/core/d;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->c()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->close()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->d()V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->e()I

    move-result v0

    return v0
.end method

.method public f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V
    .locals 2

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    new-instance v1, Lm0/i0;

    invoke-direct {v1, p0, p1}, Lm0/i0;-><init>(Lm0/j0;Ln0/j2$a;)V

    invoke-interface {v0, v1, p2}, Ln0/j2;->f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public g()Landroidx/camera/core/d;
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->g()Landroidx/camera/core/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm0/j0;->j(Landroidx/camera/core/d;)Landroidx/camera/core/d;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->getHeight()I

    move-result v0

    return v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Lm0/j0;->a:Ln0/j2;

    invoke-interface {v0}, Ln0/j2;->getWidth()I

    move-result v0

    return v0
.end method

.method public h(Lm0/v0;)V
    .locals 2

    iget-object v0, p0, Lm0/j0;->b:Lm0/v0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Pending request should be null"

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lm0/j0;->b:Lm0/v0;

    return-void
.end method

.method public i()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lm0/j0;->b:Lm0/v0;

    return-void
.end method

.method public final j(Landroidx/camera/core/d;)Landroidx/camera/core/d;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lm0/j0;->b:Lm0/v0;

    if-nez v1, :cond_1

    invoke-static {}, Ln0/z3;->b()Ln0/z3;

    move-result-object v1

    goto :goto_0

    :cond_1
    new-instance v1, Landroid/util/Pair;

    iget-object v2, p0, Lm0/j0;->b:Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->j()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lm0/j0;->b:Lm0/v0;

    invoke-virtual {v3}, Lm0/v0;->i()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ln0/z3;->a(Landroid/util/Pair;)Ln0/z3;

    move-result-object v1

    :goto_0
    iput-object v0, p0, Lm0/j0;->b:Lm0/v0;

    new-instance v0, Lg0/h2;

    new-instance v2, Landroid/util/Size;

    invoke-interface {p1}, Landroidx/camera/core/d;->getWidth()I

    move-result v3

    invoke-interface {p1}, Landroidx/camera/core/d;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    new-instance v3, Ls0/c;

    new-instance v4, Lb1/l;

    invoke-interface {p1}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v5

    invoke-interface {v5}, Lg0/i1;->getTimestamp()J

    move-result-wide v5

    invoke-direct {v4, v1, v5, v6}, Lb1/l;-><init>(Ln0/z3;J)V

    invoke-direct {v3, v4}, Ls0/c;-><init>(Ln0/e0;)V

    invoke-direct {v0, p1, v2, v3}, Lg0/h2;-><init>(Landroidx/camera/core/d;Landroid/util/Size;Lg0/i1;)V

    return-object v0
.end method
