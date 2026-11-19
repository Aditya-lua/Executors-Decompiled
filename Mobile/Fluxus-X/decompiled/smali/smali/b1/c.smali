.class public Lb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/c$a;
    }
.end annotation


# static fields
.field public static final h:D


# instance fields
.field public final a:Landroid/util/Size;

.field public final b:Landroid/util/Rational;

.field public final c:Landroid/util/Rational;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ls0/o;

.field public final f:Ln0/o0;

.field public final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ln0/i4<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4002f684bda12f68L    # 2.3703703703703702

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    sput-wide v0, Lb1/c;->h:D

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;Ln0/o0;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/o0;",
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;)V"
        }
    .end annotation

    .line 4
    new-instance v0, Ls0/o;

    invoke-direct {v0, p2, p1}, Ls0/o;-><init>(Ln0/o0;Landroid/util/Size;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lb1/c;-><init>(Landroid/util/Size;Ln0/o0;Ljava/util/Set;Ls0/o;)V

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;Ln0/o0;Ljava/util/Set;Ls0/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/o0;",
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;",
            "Ls0/o;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb1/c;->g:Ljava/util/Map;

    .line 7
    iput-object p1, p0, Lb1/c;->a:Landroid/util/Size;

    .line 8
    invoke-static {p1}, Lb1/c;->u(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p1

    iput-object p1, p0, Lb1/c;->b:Landroid/util/Rational;

    .line 9
    invoke-static {p1}, Lb1/c;->n(Landroid/util/Rational;)Landroid/util/Rational;

    move-result-object p1

    iput-object p1, p0, Lb1/c;->c:Landroid/util/Rational;

    .line 10
    iput-object p2, p0, Lb1/c;->f:Ln0/o0;

    .line 11
    iput-object p3, p0, Lb1/c;->d:Ljava/util/Set;

    .line 12
    iput-object p4, p0, Lb1/c;->e:Ls0/o;

    return-void
.end method

.method public constructor <init>(Ln0/p0;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->h()Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v0}, Lp0/a0;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1, p2}, Lb1/c;-><init>(Landroid/util/Size;Ln0/o0;Ljava/util/Set;)V

    return-void
.end method

.method public static A(Ljava/util/Collection;Landroid/util/Size;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Size;",
            ")Z"
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

    check-cast v0, Landroid/util/Size;

    invoke-static {v0, p1}, Lb1/c;->y(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static E(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static F(Landroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Landroid/graphics/Rect;->left:I

    iget v3, p0, Landroid/graphics/Rect;->bottom:I

    iget p0, p0, Landroid/graphics/Rect;->right:I

    invoke-direct {v0, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static M(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lp0/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp0/e;-><init>(Z)V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public static N(Landroid/util/Size;)Landroid/util/Rational;
    .locals 2

    new-instance v0, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/util/Rational;-><init>(II)V

    return-object v0
.end method

.method public static O(Landroid/util/Size;)Landroid/util/Rational;
    .locals 2

    sget-object v0, Lp0/a;->a:Landroid/util/Rational;

    invoke-static {p0, v0}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lp0/a;->c:Landroid/util/Rational;

    invoke-static {p0, v0}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-static {p0}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Landroid/util/Rational;Landroid/util/Rational;)F
    .locals 0

    invoke-static {p0, p1}, Lb1/c;->c(Landroid/util/Rational;Landroid/util/Rational;)F

    move-result p0

    return p0
.end method

.method public static c(Landroid/util/Rational;Landroid/util/Rational;)F
    .locals 1

    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result p0

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result p1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_0

    div-float/2addr p1, p0

    return p1

    :cond_0
    div-float/2addr p0, p1

    return p0
.end method

.method public static e(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Rational;

    invoke-static {v2, v4}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v6

    if-gt v5, v6, :cond_0

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v6

    if-gt v5, v6, :cond_0

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v6

    if-ne v5, v6, :cond_4

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    if-ne v5, v3, :cond_4

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object v4

    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public static f(Ljava/util/Collection;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/util/Size;",
            ">;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-static {p0, v1}, Lb1/c;->A(Ljava/util/Collection;Landroid/util/Size;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static g(Landroid/util/Rational;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-static {v1, p0}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static h(Landroid/util/Size;)Landroid/util/Rational;
    .locals 4

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-double v2, p0

    div-double/2addr v0, v2

    sget-wide v2, Lb1/c;->h:D

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    sget-object p0, Lp0/a;->c:Landroid/util/Rational;

    return-object p0

    :cond_0
    sget-object p0, Lp0/a;->a:Landroid/util/Rational;

    return-object p0
.end method

.method public static k(Landroid/util/Rational;Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 4

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v1

    invoke-static {p1}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p1

    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result v2

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result v3

    cmpl-float v2, v2, v3

    const/4 v3, 0x0

    if-nez v2, :cond_0

    new-instance p0, Landroid/graphics/RectF;

    int-to-float p1, v0

    int-to-float v0, v1

    invoke-direct {p0, v3, v3, p1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result v2

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result p1

    cmpl-float p1, v2, p1

    const/high16 v2, 0x40000000    # 2.0f

    if-lez p1, :cond_1

    int-to-float p1, v0

    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result p0

    div-float p0, p1, p0

    int-to-float v0, v1

    sub-float/2addr v0, p0

    div-float/2addr v0, v2

    new-instance v1, Landroid/graphics/RectF;

    add-float/2addr p0, v0

    invoke-direct {v1, v3, v0, p1, p0}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_0
    move-object p0, v1

    goto :goto_1

    :cond_1
    int-to-float p1, v1

    invoke-virtual {p0}, Landroid/util/Rational;->floatValue()F

    move-result p0

    mul-float/2addr p0, p1

    int-to-float v0, v0

    sub-float/2addr v0, p0

    div-float/2addr v0, v2

    new-instance v1, Landroid/graphics/RectF;

    add-float/2addr p0, v0

    invoke-direct {v1, v0, v3, p0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    goto :goto_0

    :goto_1
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p1}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    return-object p1
.end method

.method public static m(Landroid/util/Size;Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p1}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p1

    invoke-static {p1, p0}, Lb1/c;->k(Landroid/util/Rational;Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static n(Landroid/util/Rational;)Landroid/util/Rational;
    .locals 3

    sget-object v0, Lp0/a;->a:Landroid/util/Rational;

    invoke-virtual {p0, v0}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Lp0/a;->c:Landroid/util/Rational;

    return-object p0

    :cond_0
    sget-object v1, Lp0/a;->c:Landroid/util/Rational;

    invoke-virtual {p0, v1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid sensor aspect-ratio: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static p(Ljava/util/Collection;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/util/Size;",
            ">;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lb1/c;->E(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-static {p0, v1}, Lb1/c;->z(Ljava/util/Collection;Landroid/util/Size;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-interface {v0, p0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static u(Landroid/util/Size;)Landroid/util/Rational;
    .locals 3

    invoke-static {p0}, Lb1/c;->h(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The closer aspect ratio to the sensor size ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ") is "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ResolutionsMerger"

    invoke-static {v1, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static w(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
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

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, [Landroid/util/Size;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static y(Landroid/util/Size;Landroid/util/Size;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v1

    if-gt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result p0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    if-le p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static z(Ljava/util/Collection;Landroid/util/Size;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Size;",
            ")Z"
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

    check-cast v0, Landroid/util/Size;

    invoke-static {v0, p1}, Lb1/c;->y(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final B(Landroid/util/Rational;Landroid/util/Size;)Z
    .locals 1

    iget-object v0, p0, Lb1/c;->b:Landroid/util/Rational;

    invoke-virtual {v0, p1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p1}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb1/c;->b:Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Rational;->floatValue()F

    move-result v0

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result p1

    invoke-static {p2}, Lb1/c;->O(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Rational;->floatValue()F

    move-result p2

    invoke-virtual {p0, v0, p1, p2}, Lb1/c;->b(FFF)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final C(Landroid/util/Size;Landroid/util/Size;)Z
    .locals 0

    invoke-static {p1}, Lb1/c;->O(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb1/c;->B(Landroid/util/Rational;Landroid/util/Size;)Z

    move-result p1

    return p1
.end method

.method public final D()Z
    .locals 3

    invoke-virtual {p0}, Lb1/c;->l()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    iget-object v2, p0, Lb1/c;->c:Landroid/util/Rational;

    invoke-static {v1, v2}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final G(Ljava/util/List;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;Z)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lb1/c;->x(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lb1/c;->L(Ljava/util/List;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Landroid/util/Rational;

    sget-object v5, Lp0/a;->c:Landroid/util/Rational;

    invoke-virtual {v4, v5}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    sget-object v5, Lp0/a;->a:Landroid/util/Rational;

    invoke-virtual {v4, v5}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-virtual {p0, v4, v5, p2}, Lb1/c;->I(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final H(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lb1/c;->D()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb1/c;->b:Landroid/util/Rational;

    invoke-virtual {p0, v1, p1, v2}, Lb1/c;->I(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lb1/c;->K()Z

    move-result v3

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-object v3, p0, Lb1/c;->c:Landroid/util/Rational;

    invoke-virtual {p0, v3, p1, v2}, Lb1/c;->I(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {p0, p1, v2}, Lb1/c;->G(Ljava/util/List;Z)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, "ResolutionsMerger"

    if-eqz v1, :cond_2

    const-string v1, "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV."

    invoke-static {v2, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lb1/c;->G(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Parent resolutions: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final I(Landroid/util/Rational;Ljava/util/List;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;Z)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-static {p1, p2}, Lb1/c;->g(Landroid/util/Rational;Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lb1/c;->M(Ljava/util/List;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/i4;

    invoke-virtual {p0, v2}, Lb1/c;->v(Ln0/i4;)Ljava/util/List;

    move-result-object v2

    if-nez p3, :cond_0

    invoke-virtual {p0, p1, v2}, Lb1/c;->d(Landroid/util/Rational;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    :cond_1
    invoke-static {v2, p2}, Lb1/c;->f(Ljava/util/Collection;Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-static {v2, p2}, Lb1/c;->p(Ljava/util/Collection;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/util/Size;

    invoke-interface {v0, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object p1
.end method

.method public final J()Z
    .locals 3

    iget-object v0, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i4;

    invoke-interface {v1, v2}, Ln0/i4;->d0(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ln0/i2;

    if-eqz v2, :cond_0

    check-cast v1, Ln0/i2;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ln0/i2;->q(La1/c;)La1/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La1/c;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    :cond_2
    return v2
.end method

.method public final K()Z
    .locals 8

    iget-object v0, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/i4;

    invoke-virtual {p0, v2}, Lb1/c;->v(Ln0/i4;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v4, v1

    move v5, v4

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/util/Size;

    iget-object v7, p0, Lb1/c;->c:Landroid/util/Rational;

    invoke-static {v6, v7}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v4, v3

    :cond_3
    if-eqz v5, :cond_4

    if-eqz v6, :cond_4

    return v1

    :cond_4
    if-nez v6, :cond_2

    move v5, v3

    goto :goto_0

    :cond_5
    if-nez v4, :cond_1

    return v1

    :cond_6
    return v3
.end method

.method public final L(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Rational;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb1/c;->a:Landroid/util/Size;

    invoke-static {v0}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object v0

    new-instance v1, Lb1/c$a;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb1/c$a;-><init>(Landroid/util/Rational;Z)V

    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final b(FFF)Z
    .locals 3

    cmpl-float p1, p1, p2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    cmpl-float v1, p2, p3

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-lez p1, :cond_2

    cmpg-float p1, p2, p3

    if-gez p1, :cond_1

    return v2

    :cond_1
    return v0

    :cond_2
    if-lez v1, :cond_3

    return v2

    :cond_3
    :goto_0
    return v0
.end method

.method public final d(Landroid/util/Rational;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-virtual {p0, p1, v1}, Lb1/c;->B(Landroid/util/Rational;Landroid/util/Size;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final i()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/c;->f:Ln0/o0;

    const/16 v1, 0x22

    invoke-interface {v0, v1}, Ln0/o0;->j(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/c;->f:Ln0/o0;

    const/16 v1, 0x22

    invoke-interface {v0, v1}, Ln0/o0;->m(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/i4;

    invoke-virtual {p0, v2}, Lb1/c;->v(Ln0/i4;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public o(Ln0/w2;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/w2;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lb1/c;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lb1/c;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lb1/c;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v0, v1

    :cond_0
    sget-object v1, Ln0/i2;->t:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lb1/c;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Lb1/c;->H(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public q(Landroid/util/Size;Ln0/i4;)Landroid/util/Size;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/i4<",
            "*>;)",
            "Landroid/util/Size;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lb1/c;->v(Ln0/i4;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-virtual {p0, p1, v1}, Lb1/c;->C(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, p1}, Lb1/c;->y(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    invoke-static {v0, p1}, Lb1/c;->y(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_4
    return-object p1
.end method

.method public r(Ln0/i4;Landroid/graphics/Rect;IZ)Lb1/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;",
            "Landroid/graphics/Rect;",
            "IZ)",
            "Lb1/b;"
        }
    .end annotation

    invoke-static {p3}, Lp0/a0;->i(I)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {p2}, Lb1/c;->F(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p2

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p0, p2, p1, p4}, Lb1/c;->t(Landroid/graphics/Rect;Ln0/i4;Z)Lb1/b;

    move-result-object p1

    if-eqz p3, :cond_1

    new-instance p2, Lb1/b;

    invoke-virtual {p1}, Lb1/b;->b()Landroid/graphics/Rect;

    move-result-object p3

    invoke-static {p3}, Lb1/c;->F(Landroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {p1}, Lb1/b;->a()Landroid/util/Size;

    move-result-object p4

    invoke-static {p4}, Lp0/a0;->o(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p4

    invoke-virtual {p1}, Lb1/b;->c()Landroid/util/Size;

    move-result-object p1

    invoke-direct {p2, p3, p4, p1}, Lb1/b;-><init>(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V

    return-object p2

    :cond_1
    return-object p1
.end method

.method public s(Landroid/util/Size;Ln0/i4;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/i4<",
            "*>;)",
            "Landroid/util/Pair<",
            "Landroid/util/Size;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lb1/c;->v(Ln0/i4;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    invoke-static {v0, p1}, Lb1/c;->m(Landroid/util/Size;Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1}, Lp0/a0;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v1

    invoke-static {v1, p1}, Lb1/c;->y(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final t(Landroid/graphics/Rect;Ln0/i4;Z)Lb1/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "Ln0/i4<",
            "*>;Z)",
            "Lb1/b;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-static {p1}, Lp0/a0;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object p3

    invoke-virtual {p0, p3, p2}, Lb1/c;->s(Landroid/util/Size;Ln0/i4;)Landroid/util/Pair;

    move-result-object p2

    iget-object p3, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p3, Landroid/util/Size;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Landroid/util/Size;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lp0/a0;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lb1/c;->q(Landroid/util/Size;Ln0/i4;)Landroid/util/Size;

    move-result-object p3

    invoke-static {p1, p3}, Lb1/c;->m(Landroid/util/Size;Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object p1

    move-object p2, p3

    :goto_0
    new-instance v0, Lb1/b;

    invoke-direct {v0, p1, p2, p3}, Lb1/b;-><init>(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V

    return-object v0
.end method

.method public final v(Ln0/i4;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/c;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb1/c;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/c;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    iget-object v0, p0, Lb1/c;->e:Ls0/o;

    invoke-virtual {v0, p1}, Ls0/o;->m(Ln0/i4;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lb1/c;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lb1/c;->g:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid child config: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final x(Ljava/util/List;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/Map<",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lp0/a;->a:Landroid/util/Rational;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lp0/a;->c:Landroid/util/Rational;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v2

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :cond_1
    if-ge v4, v2, :cond_2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Landroid/util/Rational;

    invoke-static {v1, v5}, Lp0/a;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Lb1/c;->N(Landroid/util/Size;)Landroid/util/Rational;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v0
.end method
