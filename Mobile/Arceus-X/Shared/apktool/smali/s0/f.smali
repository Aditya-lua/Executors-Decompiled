.class public final Ls0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/f$a;,
        Ls0/f$b;
    }
.end annotation


# instance fields
.field public final a:Ln0/f;

.field public final b:Ln0/f;

.field public final c:Ln0/j4;

.field public final d:Lg0/s;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lh0/a;

.field public h:Lg0/y2;

.field public i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/n;",
            ">;"
        }
    .end annotation
.end field

.field public j:I

.field public k:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ln0/h0;

.field public final m:Ljava/lang/Object;

.field public n:Z

.field public o:Ln0/n1;

.field public p:Lg0/w2;

.field public q:Lb1/g;

.field public final r:Lg0/i0;

.field public final s:Lg0/i0;

.field public final t:Lv0/e;

.field public final u:Ls0/m;


# direct methods
.method public constructor <init>(Ln0/p0;Ln0/p0;Ln0/e;Ln0/e;Lg0/i0;Lg0/i0;Lh0/a;Ls0/m;Ln0/j4;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls0/f;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls0/f;->f:Ljava/util/List;

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ls0/f;->i:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Ls0/f;->j:I

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    iput-object v0, p0, Ls0/f;->k:Landroid/util/Range;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls0/f;->n:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ls0/f;->o:Ln0/n1;

    new-instance v1, Lv0/e;

    invoke-direct {v1}, Lv0/e;-><init>()V

    iput-object v1, p0, Ls0/f;->t:Lv0/e;

    invoke-virtual {p3}, Ln0/e;->C()Ln0/h0;

    move-result-object v1

    iput-object v1, p0, Ls0/f;->l:Ln0/h0;

    new-instance v1, Ln0/f;

    invoke-direct {v1, p1, p3}, Ln0/f;-><init>(Ln0/p0;Ln0/e;)V

    iput-object v1, p0, Ls0/f;->a:Ln0/f;

    if-eqz p2, :cond_0

    if-eqz p4, :cond_0

    new-instance p1, Ln0/f;

    invoke-direct {p1, p2, p4}, Ln0/f;-><init>(Ln0/p0;Ln0/e;)V

    iput-object p1, p0, Ls0/f;->b:Ln0/f;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Ls0/f;->b:Ln0/f;

    :goto_0
    iput-object p5, p0, Ls0/f;->r:Lg0/i0;

    iput-object p6, p0, Ls0/f;->s:Lg0/i0;

    iput-object p7, p0, Ls0/f;->g:Lh0/a;

    iput-object p9, p0, Ls0/f;->c:Ln0/j4;

    invoke-static {p3, p4}, Lg0/s;->b(Ln0/e;Ln0/e;)Lg0/s;

    move-result-object p1

    iput-object p1, p0, Ls0/f;->d:Lg0/s;

    iput-object p8, p0, Ls0/f;->u:Ls0/m;

    return-void
.end method

.method public static B(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    new-instance p0, Landroid/graphics/Matrix;

    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    return-object p0
.end method

.method public static D(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg0/w2;->Y(Ljava/util/Set;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static I(Ln0/j4;Lb1/g;)Ln0/i4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/j4;",
            "Lb1/g;",
            ")",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lg0/a2$a;

    invoke-direct {v0}, Lg0/a2$a;-><init>()V

    invoke-virtual {v0}, Lg0/a2$a;->f()Lg0/a2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Lg0/a2;->m(ZLn0/j4;)Ln0/i4;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p0

    sget-object v0, Ls0/q;->N:Ln0/n1$a;

    invoke-virtual {p0, v0}, Ln0/x2;->m0(Ln0/n1$a;)Ljava/lang/Object;

    invoke-virtual {p1, p0}, Lb1/g;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p0

    invoke-interface {p0}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p0

    return-object p0
.end method

.method private K()I
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->g:Lh0/a;

    invoke-interface {v1}, Lh0/a;->e()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static L(Ljava/util/Collection;Ln0/j4;Ln0/j4;ILandroid/util/Range;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Ln0/j4;",
            "Ln0/j4;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ls0/f$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-static {v1}, Lb1/g;->A0(Lg0/w2;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lb1/g;

    invoke-static {p1, v2}, Ls0/f;->I(Ln0/j4;Lb1/g;)Ln0/i4;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Lg0/w2;->m(ZLn0/j4;)Ln0/i4;

    move-result-object v2

    :goto_1
    const/4 v3, 0x1

    invoke-virtual {v1, v3, p2}, Lg0/w2;->m(ZLn0/j4;)Ln0/i4;

    move-result-object v3

    invoke-static {v1, v3, p3, p4}, Ls0/f;->v(Lg0/w2;Ln0/i4;ILandroid/util/Range;)Ln0/i4;

    move-result-object v3

    new-instance v4, Ls0/f$b;

    invoke-direct {v4, v2, v3}, Ls0/f$b;-><init>(Ln0/i4;Ln0/i4;)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static Q(Ln0/t3;Ln0/o3;)Z
    .locals 4

    invoke-virtual {p0}, Ln0/t3;->d()Ln0/n1;

    move-result-object p0

    invoke-virtual {p1}, Ln0/o3;->g()Ln0/n1;

    move-result-object v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, p0

    check-cast v1, Ln0/n1;

    invoke-interface {v1}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {p1}, Ln0/o3;->g()Ln0/n1;

    move-result-object p1

    invoke-interface {p1}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v2, 0x1

    if-eq v1, p1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v1}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p0, v1}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_2
    return v2

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static R(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-virtual {v0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    invoke-interface {v0}, Ln0/h2;->M()Lg0/k0;

    move-result-object v0

    invoke-static {v0}, Ls0/f;->a0(Lg0/k0;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static S(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-static {v0}, Ls0/f;->Z(Lg0/w2;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    sget-object v1, Ln0/g2;->U:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static T(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-static {v0}, Ls0/f;->Z(Lg0/w2;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    sget-object v1, Ln0/g2;->U:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static U(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-static {v0}, Ls0/f;->e0(Lg0/w2;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static W(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/w2;

    invoke-static {v3}, Ls0/f;->b0(Lg0/w2;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v3}, Lb1/g;->A0(Lg0/w2;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ls0/f;->Z(Lg0/w2;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_2
    :goto_1
    move v1, v4

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    if-nez v2, :cond_4

    return v4

    :cond_4
    return v0
.end method

.method public static X(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/w2;

    invoke-static {v3}, Ls0/f;->b0(Lg0/w2;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v3}, Lb1/g;->A0(Lg0/w2;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ls0/f;->Z(Lg0/w2;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    move v2, v4

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    if-nez v2, :cond_4

    return v4

    :cond_4
    return v0
.end method

.method public static varargs Y([Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v3, p0, v1

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg0/w2;

    invoke-virtual {v4}, Lg0/w2;->o()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_0

    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_2

    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public static Z(Lg0/w2;)Z
    .locals 0

    instance-of p0, p0, Lg0/f1;

    return p0
.end method

.method public static a0(Lg0/k0;)Z
    .locals 4

    invoke-virtual {p0}, Lg0/k0;->a()I

    move-result v0

    const/16 v1, 0xa

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Lg0/k0;->b()I

    move-result v1

    if-eq v1, v3, :cond_1

    invoke-virtual {p0}, Lg0/k0;->b()I

    move-result p0

    if-eqz p0, :cond_1

    move p0, v3

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_1
    if-nez v0, :cond_3

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v3
.end method

.method public static b0(Lg0/w2;)Z
    .locals 0

    instance-of p0, p0, Lg0/a2;

    return p0
.end method

.method public static d0(Ljava/util/Collection;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x2

    const/4 v1, 0x4

    const/4 v2, 0x1

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/w2;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x3

    if-ge v5, v6, :cond_0

    aget v6, v0, v5

    invoke-virtual {v3, v6}, Lg0/w2;->F(I)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    return v4

    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    return v2
.end method

.method public static e0(Lg0/w2;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    sget-object v2, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v1, v2}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p0

    invoke-interface {p0}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object p0

    sget-object v1, Ln0/j4$b;->d:Ln0/j4$b;

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " UseCase does not have capture type."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "CameraUseCaseAdapter"

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return v0
.end method

.method public static synthetic g(Lg0/v2;)V
    .locals 4

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p0}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Ls0/d;

    invoke-direct {v3, v1, v0}, Ls0/d;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v1, v2, v3}, Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V

    return-void
.end method

.method public static g0(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ljava/util/Set<",
            "Li0/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-virtual {v1, v0}, Lg0/w2;->Y(Ljava/util/Set;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lg0/w2;->X(Lg0/n;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/n;

    invoke-virtual {v3}, Lg0/n;->g()I

    move-result v4

    invoke-virtual {v1, v4}, Lg0/w2;->F(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Lg0/w2;->n()Lg0/n;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " already has effect"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lg0/w2;->n()Lg0/n;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {v1, v3}, Lg0/w2;->X(Lg0/n;)V

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static synthetic m(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Lg0/v2$g;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method public static p0(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Ls0/f;->j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-static {p0, v0}, Ls0/f;->j0(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unused effects: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "CameraUseCaseAdapter"

    invoke-static {p1, p0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static u(Ljava/util/Collection;Lj0/b;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Lj0/b;",
            ")",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ljava/util/Set<",
            "Li0/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->o()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj0/b;->a()Ljava/util/Set;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v1, v2}, Lg0/w2;->Y(Ljava/util/Set;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static v(Lg0/w2;Ln0/i4;ILandroid/util/Range;)Ln0/i4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/w2;",
            "Ln0/i4<",
            "*>;I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object p1

    :goto_0
    sget-object v0, Ln0/i4;->B:Ln0/n1$a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p2, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {p2, p3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p2, Ln0/i4;->C:Ln0/n1$a;

    sget-object v0, Ln0/n1$c;->b:Ln0/n1$c;

    invoke-virtual {p1, p2, v0, p3}, Ln0/x2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    sget-object p2, Ln0/i4;->D:Ln0/n1$a;

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, p3}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, p1}, Lg0/w2;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p0

    invoke-interface {p0}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p0

    return-object p0
.end method

.method public static z(Ljava/util/Collection;Lg0/w2;Lb1/g;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Lg0/w2;",
            "Lb1/g;",
            ")",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/Collection;Lb1/g;)Lg0/w2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Lb1/g;",
            ")",
            "Lg0/w2;"
        }
    .end annotation

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p2, :cond_0

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ls0/f;->V()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {v1}, Ls0/f;->X(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ls0/f;->p:Lg0/w2;

    invoke-static {p1}, Ls0/f;->b0(Lg0/w2;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ls0/f;->p:Lg0/w2;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ls0/f;->F()Lg0/a2;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {v1}, Ls0/f;->W(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ls0/f;->p:Lg0/w2;

    invoke-static {p1}, Ls0/f;->Z(Lg0/w2;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ls0/f;->p:Lg0/w2;

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ls0/f;->E()Lg0/f1;

    move-result-object p1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    monitor-exit v0

    return-object p1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final C(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ls0/f;->P()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Ls0/f;->R(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ls0/f;->S(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Extensions are not supported for use with Raw image capture."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Extensions are only supported for use with standard dynamic range."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {p1}, Ls0/f;->T(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Ls0/f;->S(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Ultra HDR image and Raw capture does not support for use with CameraEffect."

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final E()Lg0/f1;
    .locals 2

    new-instance v0, Lg0/f1$b;

    invoke-direct {v0}, Lg0/f1$b;-><init>()V

    const-string v1, "ImageCapture-Extra"

    invoke-virtual {v0, v1}, Lg0/f1$b;->s(Ljava/lang/String;)Lg0/f1$b;

    move-result-object v0

    invoke-virtual {v0}, Lg0/f1$b;->f()Lg0/f1;

    move-result-object v0

    return-object v0
.end method

.method public final F()Lg0/a2;
    .locals 2

    new-instance v0, Lg0/a2$a;

    invoke-direct {v0}, Lg0/a2$a;-><init>()V

    const-string v1, "Preview-Extra"

    invoke-virtual {v0, v1}, Lg0/a2$a;->p(Ljava/lang/String;)Lg0/a2$a;

    move-result-object v0

    invoke-virtual {v0}, Lg0/a2$a;->f()Lg0/a2;

    move-result-object v0

    new-instance v1, Ls0/e;

    invoke-direct {v1}, Ls0/e;-><init>()V

    invoke-virtual {v0, v1}, Lg0/a2;->q0(Lg0/a2$c;)V

    return-object v0
.end method

.method public final G(Ljava/util/Collection;Z)Lb1/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;Z)",
            "Lb1/g;"
        }
    .end annotation

    iget-object v1, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ls0/f;->N(Ljava/util/Collection;Z)Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->size()I

    move-result p1

    const/4 p2, 0x2

    const/4 v0, 0x0

    if-ge p1, p2, :cond_1

    invoke-virtual {p0}, Ls0/f;->P()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v7}, Ls0/f;->U(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-object v0

    :cond_1
    iget-object p1, p0, Ls0/f;->q:Lb1/g;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v7}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ls0/f;->q:Lb1/g;

    invoke-virtual {p1, v7}, Lb1/g;->F0(Ljava/util/Set;)V

    iget-object p1, p0, Ls0/f;->q:Lb1/g;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1

    return-object p1

    :cond_2
    invoke-static {v7}, Ls0/f;->d0(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_3

    monitor-exit v1

    return-object v0

    :cond_3
    new-instance v2, Lb1/g;

    iget-object v3, p0, Ls0/f;->a:Ln0/f;

    iget-object v4, p0, Ls0/f;->b:Ln0/f;

    iget-object v5, p0, Ls0/f;->r:Lg0/i0;

    iget-object v6, p0, Ls0/f;->s:Lg0/i0;

    iget-object v8, p0, Ls0/f;->c:Ln0/j4;

    invoke-direct/range {v2 .. v8}, Lb1/g;-><init>(Ln0/p0;Ln0/p0;Lg0/i0;Lg0/i0;Ljava/util/Set;Ln0/j4;)V

    monitor-exit v1

    return-object v2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public H()V
    .locals 4

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ls0/f;->n:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ls0/f;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Ln0/f;->j(Ljava/util/Collection;)V

    iget-object v1, p0, Ls0/f;->b:Ln0/f;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ls0/f;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Ln0/f;->j(Ljava/util/Collection;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ls0/f;->x()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Ls0/f;->n:Z

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public J()Lg0/s;
    .locals 1

    iget-object v0, p0, Ls0/f;->d:Lg0/s;

    return-object v0
.end method

.method public final M(Z)I
    .locals 7

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/n;

    invoke-virtual {v3}, Lg0/n;->g()I

    move-result v5

    invoke-static {v5}, Lx0/z0;->d(I)I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_0

    if-nez v2, :cond_1

    move v4, v6

    :cond_1
    const-string v2, "Can only have one sharing effect."

    invoke-static {v4, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    move-object v2, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lg0/n;->g()I

    move-result v4

    :goto_1
    if-eqz p1, :cond_4

    or-int/lit8 v4, v4, 0x3

    :cond_4
    monitor-exit v0

    return v4

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final N(Ljava/util/Collection;Z)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;Z)",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0, p2}, Ls0/f;->M(Z)I

    move-result p2

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-static {v1}, Lb1/g;->A0(Lg0/w2;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "Only support one level of sharing for now."

    invoke-static {v2, v3}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {v1, p2}, Lg0/w2;->F(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public O()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ls0/f;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final P()Z
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->l:Ln0/h0;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ln0/h0;->w(Ln0/q3;)Ln0/q3;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final V()Z
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->l:Ln0/h0;

    invoke-interface {v1}, Ln0/h0;->v()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c()Lg0/m;
    .locals 1

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->c()Lg0/m;

    move-result-object v0

    return-object v0
.end method

.method public final c0()Z
    .locals 2

    invoke-virtual {p0}, Ls0/f;->P()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ls0/f;->b:Ln0/f;

    if-nez v0, :cond_0

    iget v0, p0, Ls0/f;->j:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Lg0/t;
    .locals 1

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->d()Lg0/t;

    move-result-object v0

    return-object v0
.end method

.method public f0(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Ls0/f;->D(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Ls0/f;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Ls0/f;->b:Ln0/f;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    invoke-virtual {p0, v1, p1, v2}, Ls0/f;->y(Ljava/util/Collection;ZZ)Ls0/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ls0/f;->s(Ls0/b;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Z)V
    .locals 1

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0, p1}, Ln0/f;->h(Z)V

    return-void
.end method

.method public final h0()V
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->o:Ln0/n1;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v1}, Ln0/f;->e()Ln0/l0;

    move-result-object v1

    iget-object v2, p0, Ls0/f;->o:Ln0/n1;

    invoke-interface {v1, v2}, Ln0/l0;->l(Ln0/n1;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public i0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/n;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Ls0/f;->i:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public k0(Landroid/util/Range;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Ls0/f;->k:Landroid/util/Range;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public l0(I)V
    .locals 1

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Ls0/f;->j:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public m0(Lg0/y2;)V
    .locals 1

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Ls0/f;->h:Lg0/y2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public n(Ljava/util/Collection;Lj0/b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Lj0/b;",
            ")V"
        }
    .end annotation

    const-string v0, "CameraUseCaseAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addUseCases: appUseCasesToAdd = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", featureGroup = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ls0/f;->t()V

    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Ls0/f;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1, p2}, Ls0/f;->u(Ljava/util/Collection;Lj0/b;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p2, p0, Ls0/f;->b:Ln0/f;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    invoke-virtual {p0, v1, p2, v2}, Ls0/f;->y(Ljava/util/Collection;ZZ)Ls0/b;

    move-result-object p2

    invoke-virtual {p0, p2}, Ls0/f;->s(Ls0/b;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p2

    invoke-static {p1}, Ls0/f;->g0(Ljava/util/Map;)V

    new-instance p1, Ls0/f$a;

    invoke-direct {p1, p2}, Ls0/f$a;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final n0(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ls0/f;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ls0/f;->U(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Ls0/f;->t:Lv0/e;

    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v1}, Ln0/f;->k()Ln0/o0;

    move-result-object v1

    invoke-interface {v1}, Ln0/o0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lv0/e;->a(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public o0(Ljava/util/Collection;Lj0/b;Z)Ls0/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;",
            "Lj0/b;",
            "Z)",
            "Ls0/b;"
        }
    .end annotation

    const-string v0, "CameraUseCaseAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "simulateAddUseCases: appUseCasesToAdd = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", featureGroup = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ls0/f;->t()V

    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Ls0/f;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1, p2}, Ls0/f;->u(Ljava/util/Collection;Lj0/b;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p2, p0, Ls0/f;->b:Ln0/f;

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0, v1, p2, p3}, Ls0/f;->y(Ljava/util/Collection;ZZ)Ls0/b;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {p1}, Ls0/f;->g0(Ljava/util/Map;)V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p2

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p2

    goto :goto_1

    :catch_0
    move-exception p2

    :try_start_3
    new-instance p3, Ls0/f$a;

    invoke-direct {p3, p2}, Ls0/f$a;-><init>(Ljava/lang/Throwable;)V

    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    :try_start_4
    invoke-static {p1}, Ls0/f;->g0(Ljava/util/Map;)V

    throw p2

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final q0(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ln0/t3;",
            ">;",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    iget-object v1, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Ls0/f;->h:Lg0/y2;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Lg0/t;->i()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->h()Landroid/graphics/Rect;

    move-result-object v2

    iget-object v0, p0, Ls0/f;->h:Lg0/y2;

    invoke-virtual {v0}, Lg0/y2;->a()Landroid/util/Rational;

    move-result-object v4

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->k()Ln0/o0;

    move-result-object v0

    iget-object v5, p0, Ls0/f;->h:Lg0/y2;

    invoke-virtual {v5}, Lg0/y2;->c()I

    move-result v5

    invoke-interface {v0, v5}, Lg0/t;->w(I)I

    move-result v5

    iget-object v0, p0, Ls0/f;->h:Lg0/y2;

    invoke-virtual {v0}, Lg0/y2;->d()I

    move-result v6

    iget-object v0, p0, Ls0/f;->h:Lg0/y2;

    invoke-virtual {v0}, Lg0/y2;->b()I

    move-result v7

    move-object v8, p1

    invoke-static/range {v2 .. v8}, Ls0/s;->a(Landroid/graphics/Rect;ZLandroid/util/Rational;IIILjava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/w2;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Rect;

    invoke-virtual {v2, v3}, Lg0/w2;->b0(Landroid/graphics/Rect;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    move-object v8, p1

    :cond_2
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg0/w2;

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v0}, Ln0/f;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->h()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {v8, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-virtual {v2}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v2

    invoke-static {v0, v2}, Ls0/f;->B(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p2, v0}, Lg0/w2;->Z(Landroid/graphics/Matrix;)V

    goto :goto_3

    :cond_3
    monitor-exit v1

    return-void

    :goto_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final s(Ls0/b;)V
    .locals 6

    invoke-virtual {p1}, Ls0/b;->g()Ls0/l;

    move-result-object v0

    invoke-virtual {v0}, Ls0/l;->b()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Ls0/b;->b()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ls0/f;->q0(Ljava/util/Map;Ljava/util/Collection;)V

    iget-object v0, p0, Ls0/f;->i:Ljava/util/List;

    invoke-virtual {p1}, Ls0/b;->b()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p1}, Ls0/b;->a()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ls0/f;->p0(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V

    invoke-virtual {p1}, Ls0/b;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-object v2, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v1, v2}, Lg0/w2;->c0(Ln0/p0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {p1}, Ls0/b;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/f;->j(Ljava/util/Collection;)V

    iget-object v0, p0, Ls0/f;->b:Ln0/f;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ls0/b;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-object v2, p0, Ls0/f;->b:Ln0/f;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {v1, v2}, Lg0/w2;->c0(Ln0/p0;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ls0/f;->b:Ln0/f;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ls0/b;->d()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/f;->j(Ljava/util/Collection;)V

    :cond_2
    invoke-virtual {p1}, Ls0/b;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ls0/b;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {p1}, Ls0/b;->g()Ls0/l;

    move-result-object v2

    invoke-virtual {v2}, Ls0/l;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ln0/t3;->d()Ln0/n1;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lg0/w2;->z()Ln0/o3;

    move-result-object v4

    invoke-static {v2, v4}, Ls0/f;->Q(Ln0/t3;Ln0/o3;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1, v3}, Lg0/w2;->f0(Ln0/n1;)V

    iget-boolean v2, p0, Ls0/f;->n:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v2, v1}, Ln0/f;->g(Lg0/w2;)V

    iget-object v2, p0, Ls0/f;->b:Ln0/f;

    if-eqz v2, :cond_3

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ln0/f;->g(Lg0/w2;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ls0/b;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {p1}, Ls0/b;->j()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls0/f$b;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Ls0/f;->b:Ln0/f;

    if-eqz v3, :cond_5

    iget-object v4, p0, Ls0/f;->a:Ln0/f;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ln0/p0;

    iget-object v5, v2, Ls0/f$b;->a:Ln0/i4;

    iget-object v2, v2, Ls0/f$b;->b:Ln0/i4;

    invoke-virtual {v1, v4, v3, v5, v2}, Lg0/w2;->d(Ln0/p0;Ln0/p0;Ln0/i4;Ln0/i4;)V

    invoke-virtual {p1}, Ls0/b;->g()Ls0/l;

    move-result-object v2

    invoke-virtual {v2}, Ls0/l;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-virtual {p1}, Ls0/b;->h()Ls0/l;

    move-result-object v3

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls0/l;

    invoke-virtual {v3}, Ls0/l;->b()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/t3;

    invoke-virtual {v1, v2, v3}, Lg0/w2;->e0(Ln0/t3;Ln0/t3;)V

    goto :goto_3

    :cond_5
    iget-object v3, p0, Ls0/f;->a:Ln0/f;

    iget-object v4, v2, Ls0/f$b;->a:Ln0/i4;

    iget-object v2, v2, Ls0/f$b;->b:Ln0/i4;

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v5, v4, v2}, Lg0/w2;->d(Ln0/p0;Ln0/p0;Ln0/i4;Ln0/i4;)V

    invoke-virtual {p1}, Ls0/b;->g()Ls0/l;

    move-result-object v2

    invoke-virtual {v2}, Ls0/l;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/t3;

    invoke-virtual {v1, v2, v5}, Lg0/w2;->e0(Ln0/t3;Ln0/t3;)V

    goto :goto_3

    :cond_6
    iget-boolean v0, p0, Ls0/f;->n:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {p1}, Ls0/b;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/f;->i(Ljava/util/Collection;)V

    iget-object v0, p0, Ls0/f;->b:Ln0/f;

    if-eqz v0, :cond_7

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ls0/b;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/f;->i(Ljava/util/Collection;)V

    :cond_7
    invoke-virtual {p1}, Ls0/b;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->M()V

    goto :goto_4

    :cond_8
    iget-object v0, p0, Ls0/f;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Ls0/f;->e:Ljava/util/List;

    invoke-virtual {p1}, Ls0/b;->a()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Ls0/f;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Ls0/f;->f:Ljava/util/List;

    invoke-virtual {p1}, Ls0/b;->b()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Ls0/b;->f()Lg0/w2;

    move-result-object v0

    iput-object v0, p0, Ls0/f;->p:Lg0/w2;

    invoke-virtual {p1}, Ls0/b;->i()Lb1/g;

    move-result-object p1

    iput-object p1, p0, Ls0/f;->q:Lb1/g;

    return-void
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Ls0/f;->a:Ln0/f;

    iget-object v1, p0, Ls0/f;->l:Ln0/h0;

    invoke-virtual {v0, v1}, Ln0/f;->o(Ln0/h0;)V

    iget-object v0, p0, Ls0/f;->b:Ln0/f;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls0/f;->l:Ln0/h0;

    invoke-virtual {v0, v1}, Ln0/f;->o(Ln0/h0;)V

    :cond_0
    return-void
.end method

.method public w()V
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ls0/f;->n:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ls0/f;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    iget-object v2, p0, Ls0/f;->l:Ln0/h0;

    invoke-virtual {v1, v2}, Ln0/f;->o(Ln0/h0;)V

    iget-object v1, p0, Ls0/f;->b:Ln0/f;

    if-eqz v1, :cond_0

    iget-object v2, p0, Ls0/f;->l:Ln0/h0;

    invoke-virtual {v1, v2}, Ln0/f;->o(Ln0/h0;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    iget-object v2, p0, Ls0/f;->f:Ljava/util/List;

    invoke-virtual {v1, v2}, Ln0/f;->i(Ljava/util/Collection;)V

    iget-object v1, p0, Ls0/f;->b:Ln0/f;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ls0/f;->f:Ljava/util/List;

    invoke-virtual {v1, v2}, Ln0/f;->i(Ljava/util/Collection;)V

    :cond_1
    invoke-virtual {p0}, Ls0/f;->h0()V

    iget-object v1, p0, Ls0/f;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/w2;

    invoke-virtual {v2}, Lg0/w2;->M()V

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Ls0/f;->n:Z

    :cond_3
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final x()V
    .locals 3

    iget-object v0, p0, Ls0/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls0/f;->a:Ln0/f;

    invoke-virtual {v1}, Ln0/f;->e()Ln0/l0;

    move-result-object v1

    invoke-interface {v1}, Ln0/l0;->j()Ln0/n1;

    move-result-object v2

    iput-object v2, p0, Ls0/f;->o:Ln0/n1;

    invoke-interface {v1}, Ln0/l0;->n()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final y(Ljava/util/Collection;ZZ)Ls0/b;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;ZZ)",
            "Ls0/b;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v13, p3

    invoke-virtual/range {p0 .. p1}, Ls0/f;->C(Ljava/util/Collection;)V

    const/4 v2, 0x1

    if-nez p2, :cond_0

    invoke-virtual/range {p0 .. p1}, Ls0/f;->n0(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v3, v2, v13}, Ls0/f;->y(Ljava/util/Collection;ZZ)Ls0/b;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual/range {p0 .. p2}, Ls0/f;->G(Ljava/util/Collection;Z)Lb1/g;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Ls0/f;->A(Ljava/util/Collection;Lb1/g;)Lg0/w2;

    move-result-object v14

    invoke-static {v3, v14, v0}, Ls0/f;->z(Ljava/util/Collection;Lg0/w2;Lb1/g;)Ljava/util/Collection;

    move-result-object v15

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v4, v1, Ls0/f;->f:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v4, v1, Ls0/f;->f:Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, v1, Ls0/f;->f:Ljava/util/List;

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, v15}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iget-object v5, v1, Ls0/f;->l:Ln0/h0;

    invoke-interface {v5}, Ln0/h0;->k()Ln0/j4;

    move-result-object v5

    iget-object v6, v1, Ls0/f;->c:Ln0/j4;

    iget v9, v1, Ls0/f;->j:I

    iget-object v10, v1, Ls0/f;->k:Landroid/util/Range;

    invoke-static {v7, v5, v6, v9, v10}, Ls0/f;->L(Ljava/util/Collection;Ln0/j4;Ln0/j4;ILandroid/util/Range;)Ljava/util/Map;

    move-result-object v16

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/util/List;

    const/4 v6, 0x0

    aput-object v7, v5, v6

    aput-object v8, v5, v2

    invoke-static {v5}, Ls0/f;->Y([Ljava/util/List;)Z

    move-result v12

    move-object v5, v4

    :try_start_0
    iget-object v4, v1, Ls0/f;->u:Ls0/m;

    move-object v6, v5

    invoke-direct {v1}, Ls0/f;->K()I

    move-result v5

    iget-object v9, v1, Ls0/f;->a:Ln0/f;

    invoke-virtual {v9}, Ln0/f;->k()Ln0/o0;

    move-result-object v9

    move-object v10, v6

    move-object v6, v9

    iget-object v9, v1, Ls0/f;->l:Ln0/h0;

    move-object v11, v10

    iget v10, v1, Ls0/f;->j:I

    move-object/from16 v17, v11

    iget-object v11, v1, Ls0/f;->k:Landroid/util/Range;

    invoke-interface/range {v4 .. v13}, Ls0/m;->a(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;

    move-result-object v18
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v4, v1, Ls0/f;->b:Ln0/f;

    if-eqz v4, :cond_1

    iget-object v4, v1, Ls0/f;->u:Ls0/m;

    invoke-direct {v1}, Ls0/f;->K()I

    move-result v5

    iget-object v6, v1, Ls0/f;->b:Ln0/f;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6}, Ln0/f;->k()Ln0/o0;

    move-result-object v6

    iget-object v9, v1, Ls0/f;->l:Ln0/h0;

    iget v10, v1, Ls0/f;->j:I

    iget-object v11, v1, Ls0/f;->k:Landroid/util/Range;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    move/from16 v13, p3

    :try_start_2
    invoke-interface/range {v4 .. v13}, Ls0/m;->a(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    move-object v12, v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move/from16 v13, p3

    goto :goto_2

    :cond_1
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    new-instance v2, Ls0/b;

    move-object v5, v7

    move-object v6, v8

    move-object v9, v14

    move-object v4, v15

    move-object/from16 v10, v16

    move-object/from16 v7, v17

    move-object/from16 v11, v18

    move-object v8, v0

    invoke-direct/range {v2 .. v12}, Ls0/b;-><init>(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lb1/g;Lg0/w2;Ljava/util/Map;Ls0/l;Ls0/l;)V

    return-object v2

    :goto_2
    if-nez p2, :cond_2

    invoke-virtual {v1}, Ls0/f;->c0()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v1, v3, v2, v13}, Ls0/f;->y(Ljava/util/Collection;ZZ)Ls0/b;

    move-result-object v0

    return-object v0

    :cond_2
    throw v0
.end method
