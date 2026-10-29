.class public Lm0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Lm0/l1;

.field public final c:Lg0/f1$h;

.field public final d:Lg0/f1$h;

.field public final e:Landroid/graphics/Rect;

.field public final f:I

.field public final g:I

.field public final h:Landroid/graphics/Matrix;

.field public final i:Lm0/a1;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public m:I


# direct methods
.method public constructor <init>(Ln0/k1;Lm0/l1;Lm0/a1;Lne/x;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/k1;",
            "Lm0/l1;",
            "Lm0/a1;",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm0/v0;->m:I

    iput p5, p0, Lm0/v0;->a:I

    iput-object p2, p0, Lm0/v0;->b:Lm0/l1;

    invoke-virtual {p2}, Lm0/l1;->m()Lg0/f1$h;

    move-result-object p5

    iput-object p5, p0, Lm0/v0;->c:Lg0/f1$h;

    invoke-virtual {p2}, Lm0/l1;->o()Lg0/f1$h;

    move-result-object p5

    iput-object p5, p0, Lm0/v0;->d:Lg0/f1$h;

    invoke-virtual {p2}, Lm0/l1;->k()I

    move-result p5

    iput p5, p0, Lm0/v0;->g:I

    invoke-virtual {p2}, Lm0/l1;->n()I

    move-result p5

    iput p5, p0, Lm0/v0;->f:I

    invoke-virtual {p2}, Lm0/l1;->i()Landroid/graphics/Rect;

    move-result-object p5

    iput-object p5, p0, Lm0/v0;->e:Landroid/graphics/Rect;

    invoke-virtual {p2}, Lm0/l1;->p()Landroid/graphics/Matrix;

    move-result-object p2

    iput-object p2, p0, Lm0/v0;->h:Landroid/graphics/Matrix;

    iput-object p3, p0, Lm0/v0;->i:Lm0/a1;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lm0/v0;->j:Ljava/lang/String;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lm0/v0;->k:Ljava/util/List;

    invoke-interface {p1}, Ln0/k1;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/m1;

    iget-object p3, p0, Lm0/v0;->k:Ljava/util/List;

    invoke-interface {p2}, Ln0/m1;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object p4, p0, Lm0/v0;->l:Lne/x;

    return-void
.end method


# virtual methods
.method public a()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/v0;->l:Lne/x;

    return-object v0
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lm0/v0;->e:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lm0/v0;->g:I

    return v0
.end method

.method public d()Lg0/f1$h;
    .locals 1

    iget-object v0, p0, Lm0/v0;->c:Lg0/f1$h;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lm0/v0;->a:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lm0/v0;->f:I

    return v0
.end method

.method public g()Lg0/f1$h;
    .locals 1

    iget-object v0, p0, Lm0/v0;->d:Lg0/f1$h;

    return-object v0
.end method

.method public h()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lm0/v0;->h:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/v0;->k:Ljava/util/List;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm0/v0;->j:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lm0/l1;
    .locals 1

    iget-object v0, p0, Lm0/v0;->b:Lm0/l1;

    return-object v0
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0}, Lm0/a1;->h()Z

    move-result v0

    return v0
.end method

.method public m()Z
    .locals 1

    invoke-virtual {p0}, Lm0/v0;->d()Lg0/f1$h;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lm0/v0;->g()Lg0/f1$h;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public n(Lg0/h1;)V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->f(Lg0/h1;)V

    return-void
.end method

.method public o(I)V
    .locals 1

    iget v0, p0, Lm0/v0;->m:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lm0/v0;->m:I

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->a(I)V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0}, Lm0/a1;->c()V

    return-void
.end method

.method public q(Landroidx/camera/core/d;)V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->g(Landroidx/camera/core/d;)V

    return-void
.end method

.method public r(Lg0/f1$i;)V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->d(Lg0/f1$i;)V

    return-void
.end method

.method public s()V
    .locals 2

    iget v0, p0, Lm0/v0;->m:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lm0/v0;->o(I)V

    :cond_0
    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0}, Lm0/a1;->i()V

    return-void
.end method

.method public t(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public u(Lg0/h1;)V
    .locals 1

    iget-object v0, p0, Lm0/v0;->i:Lm0/a1;

    invoke-interface {v0, p1}, Lm0/a1;->e(Lg0/h1;)V

    return-void
.end method
