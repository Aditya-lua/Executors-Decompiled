.class public abstract Lo7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/e;
.implements Li7/a$b;
.implements Ll7/f;


# instance fields
.field public A:Landroid/graphics/Paint;

.field public B:F

.field public C:Landroid/graphics/BlurMaskFilter;

.field public D:Lg7/a;

.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public final g:Landroid/graphics/Paint;

.field public final h:Landroid/graphics/Paint;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/RectF;

.field public final m:Landroid/graphics/RectF;

.field public final n:Ljava/lang/String;

.field public final o:Landroid/graphics/Matrix;

.field public final p:Lf7/h0;

.field public final q:Lo7/e;

.field public r:Li7/h;

.field public s:Li7/d;

.field public t:Lo7/b;

.field public u:Lo7/b;

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/b;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li7/a<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final x:Li7/p;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/e;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo7/b;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lo7/b;->c:Landroid/graphics/Matrix;

    new-instance v0, Lg7/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg7/a;-><init>(I)V

    iput-object v0, p0, Lo7/b;->d:Landroid/graphics/Paint;

    new-instance v0, Lg7/a;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Lg7/a;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lo7/b;->e:Landroid/graphics/Paint;

    new-instance v0, Lg7/a;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v3}, Lg7/a;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, Lo7/b;->f:Landroid/graphics/Paint;

    new-instance v0, Lg7/a;

    invoke-direct {v0, v1}, Lg7/a;-><init>(I)V

    iput-object v0, p0, Lo7/b;->g:Landroid/graphics/Paint;

    new-instance v4, Lg7/a;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Lg7/a;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v4, p0, Lo7/b;->h:Landroid/graphics/Paint;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lo7/b;->i:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lo7/b;->j:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lo7/b;->k:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lo7/b;->l:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lo7/b;->m:Landroid/graphics/RectF;

    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    iput-object v4, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lo7/b;->w:Ljava/util/List;

    iput-boolean v1, p0, Lo7/b;->y:Z

    const/4 v1, 0x0

    iput v1, p0, Lo7/b;->B:F

    iput-object p1, p0, Lo7/b;->p:Lf7/h0;

    iput-object p2, p0, Lo7/b;->q:Lo7/e;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lo7/e;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#draw"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lo7/b;->n:Ljava/lang/String;

    invoke-virtual {p2}, Lo7/e;->i()Lo7/e$b;

    move-result-object p1

    sget-object v1, Lo7/e$b;->c:Lo7/e$b;

    if-ne p1, v1, :cond_0

    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {p1, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {p1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :goto_0
    invoke-virtual {p2}, Lo7/e;->x()Lm7/n;

    move-result-object p1

    invoke-virtual {p1}, Lm7/n;->b()Li7/p;

    move-result-object p1

    iput-object p1, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {p1, p0}, Li7/p;->b(Li7/a$b;)V

    invoke-virtual {p2}, Lo7/e;->h()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lo7/e;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, Li7/h;

    invoke-virtual {p2}, Lo7/e;->h()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Li7/h;-><init>(Ljava/util/List;)V

    iput-object p1, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {p1}, Li7/h;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li7/a;

    invoke-virtual {p2, p0}, Li7/a;->a(Li7/a$b;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {p1}, Li7/h;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li7/a;

    invoke-virtual {p0, p2}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p2, p0}, Li7/a;->a(Li7/a$b;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lo7/b;->O()V

    return-void
.end method

.method public static synthetic f(Lo7/b;)V
    .locals 2

    iget-object v0, p0, Lo7/b;->s:Li7/d;

    invoke-virtual {v0}, Li7/d;->r()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lo7/b;->N(Z)V

    return-void
.end method

.method public static v(Lo7/c;Lo7/e;Lf7/h0;Lf7/i;)Lo7/b;
    .locals 2

    sget-object v0, Lo7/b$a;->a:[I

    invoke-virtual {p1}, Lo7/e;->g()Lo7/e$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unknown layer type "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lo7/e;->g()Lo7/e$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ls7/e;->c(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p0, Lo7/i;

    invoke-direct {p0, p2, p1}, Lo7/i;-><init>(Lf7/h0;Lo7/e;)V

    return-object p0

    :pswitch_1
    new-instance p0, Lo7/f;

    invoke-direct {p0, p2, p1}, Lo7/f;-><init>(Lf7/h0;Lo7/e;)V

    return-object p0

    :pswitch_2
    new-instance p0, Lo7/d;

    invoke-direct {p0, p2, p1}, Lo7/d;-><init>(Lf7/h0;Lo7/e;)V

    return-object p0

    :pswitch_3
    new-instance p0, Lo7/h;

    invoke-direct {p0, p2, p1}, Lo7/h;-><init>(Lf7/h0;Lo7/e;)V

    return-object p0

    :pswitch_4
    new-instance p0, Lo7/c;

    invoke-virtual {p1}, Lo7/e;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lf7/i;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0, p3}, Lo7/c;-><init>(Lf7/h0;Lo7/e;Ljava/util/List;Lf7/i;)V

    return-object p0

    :pswitch_5
    new-instance v0, Lo7/g;

    invoke-direct {v0, p2, p1, p0, p3}, Lo7/g;-><init>(Lf7/h0;Lo7/e;Lo7/c;Lf7/i;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public A()Lo7/e;
    .locals 1

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    return-object v0
.end method

.method public B()Z
    .locals 1

    iget-object v0, p0, Lo7/b;->r:Li7/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/h;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public C()Z
    .locals 1

    iget-object v0, p0, Lo7/b;->t:Lo7/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 10

    iget-object v0, p0, Lo7/b;->k:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lo7/b;->B()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v0}, Li7/h;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_5

    iget-object v4, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v4}, Li7/h;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln7/i;

    iget-object v5, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v5}, Li7/h;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li7/a;

    invoke-virtual {v5}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Path;

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    iget-object v6, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v6, v5}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object v5, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v5, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    sget-object v5, Lo7/b$a;->b:[I

    invoke-virtual {v4}, Ln7/i;->a()Ln7/i$a;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/4 v6, 0x1

    if-eq v5, v6, :cond_6

    const/4 v6, 0x2

    if-eq v5, v6, :cond_6

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    const/4 v6, 0x4

    if-eq v5, v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ln7/i;->d()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    :goto_1
    iget-object v4, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object v5, p0, Lo7/b;->m:Landroid/graphics/RectF;

    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    if-nez v3, :cond_4

    iget-object v4, p0, Lo7/b;->k:Landroid/graphics/RectF;

    iget-object v5, p0, Lo7/b;->m:Landroid/graphics/RectF;

    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    goto :goto_2

    :cond_4
    iget-object v4, p0, Lo7/b;->k:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget-object v6, p0, Lo7/b;->m:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->left:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iget-object v6, p0, Lo7/b;->k:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    iget-object v7, p0, Lo7/b;->m:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->top:F

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    iget-object v7, p0, Lo7/b;->k:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->right:F

    iget-object v8, p0, Lo7/b;->m:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->right:F

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iget-object v8, p0, Lo7/b;->k:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    iget-object v9, p0, Lo7/b;->m:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    iget-object p2, p0, Lo7/b;->k:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final E(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 4

    invoke-virtual {p0}, Lo7/b;->C()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->i()Lo7/e$b;

    move-result-object v0

    sget-object v1, Lo7/e$b;->c:Lo7/e$b;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo7/b;->l:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lo7/b;->t:Lo7/b;

    iget-object v2, p0, Lo7/b;->l:Landroid/graphics/RectF;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, p2, v3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lo7/b;->l:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final F()V
    .locals 1

    iget-object v0, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public final G(F)V
    .locals 2

    iget-object v0, p0, Lo7/b;->p:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->J()Lf7/i;

    move-result-object v0

    invoke-virtual {v0}, Lf7/i;->n()Lf7/u0;

    move-result-object v0

    iget-object v1, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v1}, Lo7/e;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lf7/u0;->a(Ljava/lang/String;F)V

    return-void
.end method

.method public H(Li7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/a<",
            "**>;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public I(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            "I",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;",
            "Ll7/e;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public J(Lo7/b;)V
    .locals 0

    iput-object p1, p0, Lo7/b;->t:Lo7/b;

    return-void
.end method

.method public K(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lo7/b;->A:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Lg7/a;

    invoke-direct {v0}, Lg7/a;-><init>()V

    iput-object v0, p0, Lo7/b;->A:Landroid/graphics/Paint;

    :cond_0
    iput-boolean p1, p0, Lo7/b;->z:Z

    return-void
.end method

.method public L(Lo7/b;)V
    .locals 0

    iput-object p1, p0, Lo7/b;->u:Lo7/b;

    return-void
.end method

.method public M(F)V
    .locals 5

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "BaseLayer#setProgress.transform"

    const-string v2, "BaseLayer#setProgress"

    if-eqz v0, :cond_0

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v0, p1}, Li7/p;->j(F)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_1
    iget-object v0, p0, Lo7/b;->r:Li7/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v3, "BaseLayer#setProgress.mask"

    if-eqz v0, :cond_2

    invoke-static {v3}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_2
    move v0, v1

    :goto_0
    iget-object v4, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v4}, Li7/h;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_3

    iget-object v4, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v4}, Li7/h;->a()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/a;

    invoke-virtual {v4, p1}, Li7/a;->n(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v3}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_4
    iget-object v0, p0, Lo7/b;->s:Li7/d;

    if-eqz v0, :cond_6

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v3, "BaseLayer#setProgress.inout"

    if-eqz v0, :cond_5

    invoke-static {v3}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lo7/b;->s:Li7/d;

    invoke-virtual {v0, p1}, Li7/a;->n(F)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v3}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_6
    iget-object v0, p0, Lo7/b;->t:Lo7/b;

    if-eqz v0, :cond_8

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v3, "BaseLayer#setProgress.matte"

    if-eqz v0, :cond_7

    invoke-static {v3}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->M(F)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {v3}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_8
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v3, "BaseLayer#setProgress.animations."

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_9
    :goto_1
    iget-object v0, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_a

    iget-object v0, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/a;

    invoke-virtual {v0, p1}, Li7/a;->n(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_a
    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf7/e;->c(Ljava/lang/String;)F

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_b
    return-void
.end method

.method public final N(Z)V
    .locals 1

    iget-boolean v0, p0, Lo7/b;->y:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lo7/b;->y:Z

    invoke-virtual {p0}, Lo7/b;->F()V

    :cond_0
    return-void
.end method

.method public final O()V
    .locals 3

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    new-instance v0, Li7/d;

    iget-object v2, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v2}, Lo7/e;->f()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Li7/d;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lo7/b;->s:Li7/d;

    invoke-virtual {v0}, Li7/a;->m()V

    iget-object v0, p0, Lo7/b;->s:Li7/d;

    new-instance v2, Lo7/a;

    invoke-direct {v2, p0}, Lo7/a;-><init>(Lo7/b;)V

    invoke-virtual {v0, v2}, Li7/a;->a(Li7/a$b;)V

    iget-object v0, p0, Lo7/b;->s:Li7/d;

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1}, Lo7/b;->N(Z)V

    iget-object v0, p0, Lo7/b;->s:Li7/d;

    invoke-virtual {p0, v0}, Lo7/b;->j(Li7/a;)V

    return-void

    :cond_1
    invoke-virtual {p0, v1}, Lo7/b;->N(Z)V

    return-void
.end method

.method public a()V
    .locals 0

    invoke-virtual {p0}, Lo7/b;->F()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v0, p1, p2}, Li7/p;->c(Ljava/lang/Object;Lt7/c;)Z

    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    iget-object p1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, Lo7/b;->s()V

    iget-object p1, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    if-eqz p3, :cond_1

    iget-object p1, p0, Lo7/b;->v:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    iget-object p2, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    iget-object p3, p0, Lo7/b;->v:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lo7/b;

    iget-object p3, p3, Lo7/b;->x:Li7/p;

    invoke-virtual {p3}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo7/b;->u:Lo7/b;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    iget-object p1, p1, Lo7/b;->x:Li7/p;

    invoke-virtual {p1}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_1
    iget-object p1, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    iget-object p2, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {p2}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            "I",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;",
            "Ll7/e;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->t:Lo7/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ll7/e;->a(Ljava/lang/String;)Ll7/e;

    move-result-object v0

    iget-object v1, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Ll7/e;->c(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v0, v1}, Ll7/e;->i(Ll7/f;)Ll7/e;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Ll7/e;->g(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Ll7/e;->h(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v1}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Ll7/e;->e(Ljava/lang/String;I)I

    move-result v1

    add-int/2addr v1, p2

    iget-object v2, p0, Lo7/b;->t:Lo7/b;

    invoke-virtual {v2, p1, v1, p3, v0}, Lo7/b;->I(Ll7/e;ILjava/util/List;Ll7/e;)V

    :cond_1
    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ll7/e;->g(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "__container"

    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ll7/e;->a(Ljava/lang/String;)Ll7/e;

    move-result-object p4

    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ll7/e;->c(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p4, p0}, Ll7/e;->i(Ll7/f;)Ll7/e;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ll7/e;->h(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lo7/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ll7/e;->e(Ljava/lang/String;I)I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3, p4}, Lo7/b;->I(Ll7/e;ILjava/util/List;Ll7/e;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 11

    move v6, p3

    move-object v7, p4

    iget-object v1, p0, Lo7/b;->n:Ljava/lang/String;

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    iget-boolean v1, p0, Lo7/b;->y:Z

    if-eqz v1, :cond_1a

    iget-object v1, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v1}, Lo7/e;->y()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lo7/b;->s()V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    const-string v2, "Layer#parentMatrix"

    if-eqz v1, :cond_1

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lo7/b;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    iget-object v3, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    iget-object v4, p0, Lo7/b;->v:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo7/b;

    iget-object v4, v4, Lo7/b;->x:Li7/p;

    invoke-virtual {v4}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_3
    iget-object v1, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v1}, Li7/p;->h()Li7/a;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_4
    const/16 v1, 0x64

    :goto_1
    int-to-float v2, v6

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr v2, v3

    int-to-float v1, v1

    mul-float/2addr v2, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v2, v1

    mul-float/2addr v2, v3

    float-to-int v8, v2

    invoke-virtual {p0}, Lo7/b;->C()Z

    move-result v1

    const-string v9, "Layer#drawLayer"

    if-nez v1, :cond_7

    invoke-virtual {p0}, Lo7/b;->B()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0}, Lo7/b;->w()Ln7/h;

    move-result-object v1

    sget-object v2, Ln7/h;->a:Ln7/h;

    if-ne v1, v2, :cond_7

    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    iget-object v2, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v2}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v9}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v1, v8, p4}, Lo7/b;->u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v9}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_6
    iget-object v0, p0, Lo7/b;->n:Ljava/lang/String;

    invoke-static {v0}, Lf7/e;->c(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0, v0}, Lo7/b;->G(F)V

    return-void

    :cond_7
    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    const-string v2, "Layer#computeBounds"

    if-eqz v1, :cond_8

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_8
    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v3, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v4}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    invoke-virtual {p0, v1, p2}, Lo7/b;->E(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    iget-object v3, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v3}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v3, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, v1, v3}, Lo7/b;->D(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lo7/b;->j:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, p0, Lo7/b;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lo7/b;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-nez v1, :cond_9

    iget-object v1, p0, Lo7/b;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, v1}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v1, p0, Lo7/b;->c:Landroid/graphics/Matrix;

    iget-object v3, p0, Lo7/b;->j:Landroid/graphics/RectF;

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_9
    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v3, p0, Lo7/b;->j:Landroid/graphics/RectF;

    invoke-virtual {v1, v3}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    invoke-virtual {v1, v5, v5, v5, v5}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_a
    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_b
    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_18

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_18

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    const-string v10, "Layer#saveLayer"

    if-eqz v1, :cond_c

    invoke-static {v10}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_c
    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    const/16 v3, 0xff

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo7/b;->w()Ln7/h;

    move-result-object v3

    invoke-virtual {v3}, Ln7/h;->b()Landroidx/core/graphics/a;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/core/graphics/d;->b(Landroid/graphics/Paint;Landroidx/core/graphics/a;)Z

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v3, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-static {p1, v1, v3}, Ls7/m;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v10}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_d
    invoke-virtual {p0}, Lo7/b;->w()Ln7/h;

    move-result-object v1

    sget-object v3, Ln7/h;->b:Ln7/h;

    if-eq v1, v3, :cond_e

    invoke-virtual/range {p0 .. p1}, Lo7/b;->t(Landroid/graphics/Canvas;)V

    goto :goto_2

    :cond_e
    iget-object v1, p0, Lo7/b;->D:Lg7/a;

    if-nez v1, :cond_f

    new-instance v1, Lg7/a;

    invoke-direct {v1}, Lg7/a;-><init>()V

    iput-object v1, p0, Lo7/b;->D:Lg7/a;

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    :cond_f
    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget v3, v1, Landroid/graphics/RectF;->left:F

    sub-float/2addr v3, v2

    iget v4, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v4, v2

    iget v5, v1, Landroid/graphics/RectF;->right:F

    add-float/2addr v5, v2

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v1, v2

    move v2, v4

    move v4, v1

    move v1, v3

    move v3, v5

    iget-object v5, p0, Lo7/b;->D:Lg7/a;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_2
    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {v9}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_10
    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v1, v8, p4}, Lo7/b;->u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {v9}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_11
    invoke-virtual {p0}, Lo7/b;->B()Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lo7/b;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v1}, Lo7/b;->p(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    :cond_12
    invoke-virtual {p0}, Lo7/b;->C()Z

    move-result v1

    const-string v2, "Layer#restoreLayer"

    if-eqz v1, :cond_16

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    const-string v3, "Layer#drawMatte"

    if-eqz v1, :cond_13

    invoke-static {v3}, Lf7/e;->b(Ljava/lang/String;)V

    invoke-static {v10}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_13
    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v4, p0, Lo7/b;->g:Landroid/graphics/Paint;

    const/16 v5, 0x13

    invoke-static {p1, v1, v4, v5}, Ls7/m;->o(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;I)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {v10}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_14
    invoke-virtual/range {p0 .. p1}, Lo7/b;->t(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lo7/b;->t:Lo7/b;

    const/4 v4, 0x0

    invoke-virtual {v1, p1, p2, p3, v4}, Lo7/b;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_15
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    invoke-static {v3}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_16
    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {v2}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {}, Lf7/e;->h()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-static {v2}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_18
    iget-boolean v1, p0, Lo7/b;->z:Z

    if-eqz v1, :cond_19

    iget-object v1, p0, Lo7/b;->A:Landroid/graphics/Paint;

    if-eqz v1, :cond_19

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lo7/b;->A:Landroid/graphics/Paint;

    const v2, -0x3d7fd

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lo7/b;->A:Landroid/graphics/Paint;

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v2, p0, Lo7/b;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v1, p0, Lo7/b;->A:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v1, p0, Lo7/b;->A:Landroid/graphics/Paint;

    const v2, 0x50ebebeb

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v2, p0, Lo7/b;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_19
    iget-object v0, p0, Lo7/b;->n:Ljava/lang/String;

    invoke-static {v0}, Lf7/e;->c(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0, v0}, Lo7/b;->G(F)V

    return-void

    :cond_1a
    :goto_3
    iget-object v0, p0, Lo7/b;->n:Ljava/lang/String;

    invoke-static {v0}, Lf7/e;->c(Ljava/lang/String;)F

    return-void
.end method

.method public j(Li7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/a<",
            "**>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo7/b;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;",
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final l(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;",
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->e:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, Ls7/m;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;",
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, Ls7/m;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final n(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;",
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->e:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, Ls7/m;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    int-to-float p4, p4

    const v1, 0x40233333    # 2.55f

    mul-float/2addr p4, v1

    float-to-int p4, p4

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object p4, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p4, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final o(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;",
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, Ls7/m;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    int-to-float p4, p4

    const v1, 0x40233333    # 2.55f

    mul-float/2addr p4, v1

    float-to-int p4, p4

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object p4, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p4, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final p(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 7

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "Layer#saveLayer"

    if-eqz v0, :cond_0

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v2, p0, Lo7/b;->e:Landroid/graphics/Paint;

    const/16 v3, 0x13

    invoke-static {p1, v0, v2, v3}, Ls7/m;->o(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v0, v2, :cond_1

    invoke-virtual {p0, p1}, Lo7/b;->t(Landroid/graphics/Canvas;)V

    :cond_1
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v1}, Li7/h;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_c

    iget-object v1, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v1}, Li7/h;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/i;

    iget-object v2, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v2}, Li7/h;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/a;

    iget-object v3, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v3}, Li7/h;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li7/a;

    sget-object v4, Lo7/b$a;->b:[I

    invoke-virtual {v1}, Ln7/i;->a()Ln7/i$a;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/16 v5, 0xff

    const/4 v6, 0x1

    if-eq v4, v6, :cond_a

    const/4 v6, 0x2

    if-eq v4, v6, :cond_7

    const/4 v5, 0x3

    if-eq v4, v5, :cond_5

    const/4 v5, 0x4

    if-eq v4, v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ln7/i;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, p1, p2, v2, v3}, Lo7/b;->m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1, p2, v2, v3}, Lo7/b;->k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v1}, Ln7/i;->d()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p0, p1, p2, v2, v3}, Lo7/b;->n(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p1, p2, v2, v3}, Lo7/b;->l(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V

    goto :goto_1

    :cond_7
    if-nez v0, :cond_8

    iget-object v4, p0, Lo7/b;->d:Landroid/graphics/Paint;

    const/high16 v6, -0x1000000

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v4, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v5, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_8
    invoke-virtual {v1}, Ln7/i;->d()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0, p1, p2, v2, v3}, Lo7/b;->o(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;Li7/a;)V

    goto :goto_1

    :cond_9
    invoke-virtual {p0, p1, p2, v2}, Lo7/b;->q(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;)V

    goto :goto_1

    :cond_a
    invoke-virtual {p0}, Lo7/b;->r()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget-object v2, p0, Lo7/b;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_b
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {}, Lf7/e;->h()Z

    move-result p2

    const-string v0, "Layer#restoreLayer"

    if-eqz p2, :cond_d

    invoke-static {v0}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-static {v0}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_e
    return-void
.end method

.method public final q(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Li7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "Li7/a<",
            "Ln7/o;",
            "Landroid/graphics/Path;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, Lo7/b;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, Lo7/b;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/b;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final r()Z
    .locals 4

    iget-object v0, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v0}, Li7/h;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v2}, Li7/h;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lo7/b;->r:Li7/h;

    invoke-virtual {v2}, Li7/h;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln7/i;

    invoke-virtual {v2}, Ln7/i;->a()Ln7/i$a;

    move-result-object v2

    sget-object v3, Ln7/i$a;->d:Ln7/i$a;

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final s()V
    .locals 2

    iget-object v0, p0, Lo7/b;->v:Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lo7/b;->u:Lo7/b;

    if-nez v0, :cond_1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lo7/b;->v:Ljava/util/List;

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo7/b;->v:Ljava/util/List;

    iget-object v0, p0, Lo7/b;->u:Lo7/b;

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Lo7/b;->v:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, Lo7/b;->u:Lo7/b;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final t(Landroid/graphics/Canvas;)V
    .locals 10

    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "Layer#clearLayer"

    if-eqz v0, :cond_0

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lo7/b;->i:Landroid/graphics/RectF;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v5, v2, v3

    iget v2, v0, Landroid/graphics/RectF;->top:F

    sub-float v6, v2, v3

    iget v2, v0, Landroid/graphics/RectF;->right:F

    add-float v7, v2, v3

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float v8, v0, v3

    iget-object v9, p0, Lo7/b;->h:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_1
    return-void
.end method

.method public abstract u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
.end method

.method public w()Ln7/h;
    .locals 1

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->a()Ln7/h;

    move-result-object v0

    return-object v0
.end method

.method public x()Ln7/a;
    .locals 1

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->b()Ln7/a;

    move-result-object v0

    return-object v0
.end method

.method public y(F)Landroid/graphics/BlurMaskFilter;
    .locals 3

    iget v0, p0, Lo7/b;->B:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    iget-object p1, p0, Lo7/b;->C:Landroid/graphics/BlurMaskFilter;

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/BlurMaskFilter;

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p1, v1

    sget-object v2, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v0, v1, v2}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    iput-object v0, p0, Lo7/b;->C:Landroid/graphics/BlurMaskFilter;

    iput p1, p0, Lo7/b;->B:F

    return-object v0
.end method

.method public z()Lq7/j;
    .locals 1

    iget-object v0, p0, Lo7/b;->q:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->d()Lq7/j;

    move-result-object v0

    return-object v0
.end method
