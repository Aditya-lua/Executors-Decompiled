.class public Lo7/d;
.super Lo7/b;
.source "SourceFile"


# instance fields
.field public final E:Landroid/graphics/Paint;

.field public final F:Landroid/graphics/Rect;

.field public final G:Landroid/graphics/Rect;

.field public final H:Landroid/graphics/RectF;

.field public final I:Lf7/k0;

.field public J:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public K:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public L:Li7/c;

.field public M:Ls7/l;

.field public N:Ls7/l$a;


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/e;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lo7/b;-><init>(Lf7/h0;Lo7/e;)V

    new-instance v0, Lg7/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lg7/a;-><init>(I)V

    iput-object v0, p0, Lo7/d;->E:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo7/d;->F:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lo7/d;->G:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lo7/d;->H:Landroid/graphics/RectF;

    invoke-virtual {p2}, Lo7/e;->n()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lf7/h0;->P(Ljava/lang/String;)Lf7/k0;

    move-result-object p1

    iput-object p1, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, Li7/c;

    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p2

    invoke-direct {p1, p0, p0, p2}, Li7/c;-><init>(Li7/a$b;Lo7/b;Lq7/j;)V

    iput-object p1, p0, Lo7/d;->L:Li7/c;

    :cond_0
    return-void
.end method


# virtual methods
.method public final P()Landroid/graphics/Bitmap;
    .locals 2

    iget-object v0, p0, Lo7/d;->K:Li7/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->n()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v1, v0}, Lf7/h0;->G(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lo7/d;->I:Lf7/k0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lf7/k0;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo7/b;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->K:Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iput-object v1, p0, Lo7/d;->J:Li7/a;

    return-void

    :cond_0
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lo7/d;->J:Li7/a;

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->N:Landroid/graphics/Bitmap;

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_2

    iput-object v1, p0, Lo7/d;->K:Li7/a;

    return-void

    :cond_2
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lo7/d;->K:Li7/a;

    return-void

    :cond_3
    sget-object v0, Lf7/o0;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_4

    iget-object v0, p0, Lo7/d;->L:Li7/c;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p2}, Li7/c;->c(Lt7/c;)V

    return-void

    :cond_4
    sget-object v0, Lf7/o0;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lo7/d;->L:Li7/c;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p2}, Li7/c;->f(Lt7/c;)V

    return-void

    :cond_5
    sget-object v0, Lf7/o0;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object v0, p0, Lo7/d;->L:Li7/c;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p2}, Li7/c;->d(Lt7/c;)V

    return-void

    :cond_6
    sget-object v0, Lf7/o0;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_7

    iget-object v0, p0, Lo7/d;->L:Li7/c;

    if-eqz v0, :cond_7

    invoke-virtual {v0, p2}, Li7/c;->e(Lt7/c;)V

    return-void

    :cond_7
    sget-object v0, Lf7/o0;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Lo7/d;->L:Li7/c;

    if-eqz p1, :cond_8

    invoke-virtual {p1, p2}, Li7/c;->g(Lt7/c;)V

    :cond_8
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lo7/d;->I:Lf7/k0;

    if-eqz p2, :cond_2

    invoke-static {}, Ls7/m;->e()F

    move-result p2

    iget-object p3, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {p3}, Lf7/h0;->Q()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    iget-object p3, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {p3}, Lf7/k0;->f()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, p2

    iget-object v1, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {v1}, Lf7/k0;->d()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-virtual {p1, v0, v0, p3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo7/d;->P()Landroid/graphics/Bitmap;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, p2

    invoke-virtual {p1, v0, v0, v1, p3}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_1
    iget-object p3, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {p3}, Lf7/k0;->f()I

    move-result p3

    int-to-float p3, p3

    mul-float/2addr p3, p2

    iget-object v1, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {v1}, Lf7/k0;->d()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-virtual {p1, v0, v0, p3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_0
    iget-object p2, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_2
    return-void
.end method

.method public u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lo7/d;->P()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lo7/d;->I:Lf7/k0;

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {}, Ls7/m;->e()F

    move-result v1

    iget-object v2, p0, Lo7/d;->E:Landroid/graphics/Paint;

    invoke-virtual {v2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, p0, Lo7/d;->J:Li7/a;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lo7/d;->E:Landroid/graphics/Paint;

    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/ColorFilter;

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    iget-object v2, p0, Lo7/d;->L:Li7/c;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p2, p3}, Li7/c;->b(Landroid/graphics/Matrix;I)Ls7/b;

    move-result-object p4

    :cond_2
    iget-object v2, p0, Lo7/d;->F:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v5, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v2}, Lf7/h0;->Q()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lo7/d;->G:Landroid/graphics/Rect;

    iget-object v3, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {v3}, Lf7/k0;->f()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v1

    float-to-int v3, v3

    iget-object v4, p0, Lo7/d;->I:Lf7/k0;

    invoke-virtual {v4}, Lf7/k0;->d()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v1

    float-to-int v1, v4

    invoke-virtual {v2, v5, v5, v3, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lo7/d;->G:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v1

    float-to-int v3, v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v1

    float-to-int v1, v4

    invoke-virtual {v2, v5, v5, v3, v1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    if-eqz p4, :cond_4

    const/4 v5, 0x1

    :cond_4
    if-eqz v5, :cond_7

    iget-object v1, p0, Lo7/d;->M:Ls7/l;

    if-nez v1, :cond_5

    new-instance v1, Ls7/l;

    invoke-direct {v1}, Ls7/l;-><init>()V

    iput-object v1, p0, Lo7/d;->M:Ls7/l;

    :cond_5
    iget-object v1, p0, Lo7/d;->N:Ls7/l$a;

    if-nez v1, :cond_6

    new-instance v1, Ls7/l$a;

    invoke-direct {v1}, Ls7/l$a;-><init>()V

    iput-object v1, p0, Lo7/d;->N:Ls7/l$a;

    :cond_6
    iget-object v1, p0, Lo7/d;->N:Ls7/l$a;

    invoke-virtual {v1}, Ls7/l$a;->f()V

    iget-object v1, p0, Lo7/d;->N:Ls7/l$a;

    invoke-virtual {p4, p3, v1}, Ls7/b;->d(ILs7/l$a;)V

    iget-object p3, p0, Lo7/d;->H:Landroid/graphics/RectF;

    iget-object p4, p0, Lo7/d;->G:Landroid/graphics/Rect;

    iget v1, p4, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p4, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iget v3, p4, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget p4, p4, Landroid/graphics/Rect;->bottom:I

    int-to-float p4, p4

    invoke-virtual {p3, v1, v2, v3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p3, p0, Lo7/d;->H:Landroid/graphics/RectF;

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object p3, p0, Lo7/d;->M:Ls7/l;

    iget-object p4, p0, Lo7/d;->H:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/d;->N:Ls7/l$a;

    invoke-virtual {p3, p1, p4, v1}, Ls7/l;->j(Landroid/graphics/Canvas;Landroid/graphics/RectF;Ls7/l$a;)Landroid/graphics/Canvas;

    move-result-object p1

    :cond_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/d;->F:Landroid/graphics/Rect;

    iget-object p3, p0, Lo7/d;->G:Landroid/graphics/Rect;

    iget-object p4, p0, Lo7/d;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, p2, p3, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    if-eqz v5, :cond_8

    iget-object p2, p0, Lo7/d;->M:Ls7/l;

    invoke-virtual {p2}, Ls7/l;->e()V

    iget-object p2, p0, Lo7/d;->M:Ls7/l;

    invoke-virtual {p2}, Ls7/l;->f()Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_9
    :goto_1
    return-void
.end method
