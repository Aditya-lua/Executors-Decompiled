.class public final Lf1/p1;
.super Lg0/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/p1$d;,
        Lf1/p1$e;,
        Lf1/p1$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lf1/a2;",
        ">",
        "Lg0/w2;"
    }
.end annotation


# static fields
.field public static final H:Lf1/p1$e;


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:I

.field public C:Z

.field public D:Lf1/p1$f;

.field public E:Ln0/o3$c;

.field public F:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lf1/x;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation
.end field

.field public final G:Ln0/a3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/a3$a<",
            "Lf1/g1;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ln0/u1;

.field public t:Lx0/n0;

.field public u:Lf1/g1;

.field public v:Ln0/o3$b;

.field public w:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public x:Lg0/v2;

.field public y:Lf1/a2$a;

.field public z:Lx0/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf1/p1$e;

    invoke-direct {v0}, Lf1/p1$e;-><init>()V

    sput-object v0, Lf1/p1;->H:Lf1/p1$e;

    return-void
.end method

.method public constructor <init>(Lg1/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/a<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lg0/w2;-><init>(Ln0/i4;)V

    sget-object p1, Lf1/g1;->a:Lf1/g1;

    iput-object p1, p0, Lf1/p1;->u:Lf1/g1;

    new-instance p1, Ln0/o3$b;

    invoke-direct {p1}, Ln0/o3$b;-><init>()V

    iput-object p1, p0, Lf1/p1;->v:Ln0/o3$b;

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/p1;->w:Lne/x;

    sget-object p1, Lf1/a2$a;->c:Lf1/a2$a;

    iput-object p1, p0, Lf1/p1;->y:Lf1/a2$a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf1/p1;->C:Z

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Lf1/p1;->F:Ljava/util/Map;

    new-instance p1, Lf1/p1$a;

    invoke-direct {p1, p0}, Lf1/p1$a;-><init>(Lf1/p1;)V

    iput-object p1, p0, Lf1/p1;->G:Ln0/a3$a;

    return-void
.end method

.method private B0()V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lf1/p1;->E:Ln0/o3$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    iput-object v1, p0, Lf1/p1;->E:Ln0/o3$c;

    :cond_0
    iget-object v0, p0, Lf1/p1;->s:Ln0/u1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/u1;->d()V

    iput-object v1, p0, Lf1/p1;->s:Ln0/u1;

    :cond_1
    iget-object v0, p0, Lf1/p1;->z:Lx0/v0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lx0/v0;->f()V

    iput-object v1, p0, Lf1/p1;->z:Lx0/v0;

    :cond_2
    iget-object v0, p0, Lf1/p1;->t:Lx0/n0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lf1/p1;->t:Lx0/n0;

    :cond_3
    iput-object v1, p0, Lf1/p1;->A:Landroid/graphics/Rect;

    iput-object v1, p0, Lf1/p1;->x:Lg0/v2;

    sget-object v0, Lf1/g1;->a:Lf1/g1;

    iput-object v0, p0, Lf1/p1;->u:Lf1/g1;

    const/4 v0, 0x0

    iput v0, p0, Lf1/p1;->B:I

    iput-boolean v0, p0, Lf1/p1;->C:Z

    return-void
.end method

.method public static F0(Ln0/a3;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/a3<",
            "TT;>;TT;)TT;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/a3;->b()Lne/x;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static G0(Lm1/r1$a;Lf1/s;Lg0/k0;Lf1/h1;Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/r1$a;",
            "Lf1/s;",
            "Lg0/k0;",
            "Lf1/h1;",
            "Ljava/util/LinkedHashMap<",
            "Lf1/x;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;",
            "Ljava/util/Map<",
            "Lf1/x;",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lf1/x;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p4}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p0, Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Size;

    invoke-interface {p5, v4}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p3, v4, p2}, Lf1/h1;->b(Landroid/util/Size;Lg0/k0;)Lh1/i;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {p0, v5, p2, p1}, Lf1/p1;->H0(Lm1/r1$a;Lh1/i;Lg0/k0;Lf1/s;)Lm1/r1;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v6

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-interface {v5, v6, v4}, Lm1/r1;->e(II)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/x;

    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static H0(Lm1/r1$a;Lh1/i;Lg0/k0;Lf1/s;)Lm1/r1;
    .locals 6

    invoke-virtual {p2}, Lg0/k0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p3, p2}, Lf1/p1;->Y0(Lm1/r1$a;Lh1/i;Lf1/s;Lg0/k0;)Lm1/r1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1}, Ln0/a2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/a2$c;

    invoke-static {v3, p2}, Ln1/b;->f(Ln0/a2$c;Lg0/k0;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Lg0/k0;

    invoke-virtual {v3}, Ln0/a2$c;->g()I

    move-result v5

    invoke-static {v5}, Ln1/b;->h(I)I

    move-result v5

    invoke-virtual {v3}, Ln0/a2$c;->b()I

    move-result v3

    invoke-static {v3}, Ln1/b;->g(I)I

    move-result v3

    invoke-direct {v4, v5, v3}, Lg0/k0;-><init>(II)V

    invoke-static {p0, p1, p3, v4}, Lf1/p1;->Y0(Lm1/r1$a;Lh1/i;Lf1/s;Lg0/k0;)Lm1/r1;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v4, v5}, Lw0/d;->b(II)I

    move-result v4

    if-le v4, v2, :cond_1

    move-object v1, v3

    move v2, v4

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static W0(Ln0/t3;)Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/t3;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object v0

    sget-object v1, Ln0/t3;->a:Landroid/util/Range;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ln0/t3;->g()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    sget-object p0, Lf1/p1$e;->f:Landroid/util/Range;

    return-object p0

    :cond_0
    sget-object p0, Lf1/p1$e;->e:Landroid/util/Range;

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static X0(Ln0/p0;Lx0/v0;)Ln0/a4;
    .locals 0

    if-nez p1, :cond_1

    invoke-interface {p0}, Ln0/p0;->q()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Ln0/a4;->a:Ln0/a4;

    return-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ln0/p0;->k()Ln0/o0;

    move-result-object p0

    invoke-interface {p0}, Ln0/o0;->t()Ln0/a4;

    move-result-object p0

    return-object p0
.end method

.method public static Y0(Lm1/r1$a;Lh1/i;Lf1/s;Lg0/k0;)Lm1/r1;
    .locals 0

    invoke-static {p2, p3, p1}, Ll1/m;->e(Lf1/s;Lg0/k0;Lh1/i;)Ll1/p;

    move-result-object p2

    invoke-virtual {p2}, Ll1/l;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Lm1/r1$a;->a(Ljava/lang/String;)Lm1/r1;

    move-result-object p0

    const/4 p2, 0x0

    if-nez p0, :cond_0

    const-string p0, "VideoCapture"

    const-string p1, "Can\'t find videoEncoderInfo"

    invoke-static {p0, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lh1/i;->k()Ln0/a2$c;

    move-result-object p1

    invoke-virtual {p1}, Ln0/a2$c;->k()Landroid/util/Size;

    move-result-object p2

    :cond_1
    invoke-static {p0, p2}, Lo1/g;->l(Lm1/r1;Landroid/util/Size;)Lm1/r1;

    move-result-object p0

    return-object p0
.end method

.method private Z0()V
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    iget-object v1, p0, Lf1/p1;->t:Lx0/n0;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lf1/p1;->I0(Ln0/p0;)I

    move-result v0

    iput v0, p0, Lf1/p1;->B:I

    invoke-virtual {p0}, Lg0/w2;->f()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lx0/n0;->z(II)V

    :cond_0
    return-void
.end method

.method public static f1(Landroid/graphics/Rect;Landroid/util/Size;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    if-eq p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic g0(Lf1/p1;Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lf1/p1;->U0(Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V

    return-void
.end method

.method public static g1(Ln0/p0;Lg0/k0;)Z
    .locals 1

    const-class v0, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;

    invoke-interface {p0}, Ln0/p0;->q()Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;->i(Lg0/k0;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic h0(Lf1/p1;Ln0/o3;Ln0/o3$g;)V
    .locals 0

    invoke-virtual {p0}, Lf1/p1;->V0()V

    return-void
.end method

.method public static h1(Ln0/p0;Lg1/a;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lf1/a2;",
            ">(",
            "Ln0/p0;",
            "Lg1/a<",
            "TT;>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ln0/p0;->q()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lg1/a;->j0()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic i0(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)I
    .locals 2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    sub-int/2addr p2, p0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p0

    add-int/2addr p1, p0

    sub-int/2addr v0, p1

    return v0
.end method

.method public static i1(Ln0/p0;)Z
    .locals 1

    invoke-interface {p0}, Ln0/p0;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lk1/c;->c()Ln0/k3;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;->e(Ln0/k3;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Ln0/p0;->k()Ln0/o0;

    move-result-object p0

    invoke-interface {p0}, Ln0/o0;->l()Ln0/k3;

    move-result-object p0

    invoke-static {p0}, Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;->e(Ln0/k3;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic j0(Lf1/p1;Ln0/u1;)V
    .locals 1

    iget-object v0, p0, Lf1/p1;->s:Ln0/u1;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lf1/p1;->B0()V

    :cond_0
    return-void
.end method

.method private j1(Ln0/p0;)Z
    .locals 1

    invoke-interface {p1}, Ln0/p0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lg0/w2;->H(Ln0/p0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic k0(Lf1/p1;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->L()V

    return-void
.end method

.method public static synthetic l0(Ljava/util/concurrent/atomic/AtomicBoolean;Ln0/o3$b;Ln0/u;)V
    .locals 2

    invoke-static {}, Lp0/z;->d()Z

    move-result v0

    const-string v1, "Surface update cancellation should only occur on main thread."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1, p2}, Ln0/o3$b;->t(Ln0/u;)Z

    return-void
.end method

.method public static synthetic m0(Lf1/p1;Ln0/o3$b;Ly1/c$a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "androidx.camera.video.VideoCapture.streamUpdate"

    invoke-virtual {p1, v1, v0}, Ln0/o3$b;->o(Ljava/lang/String;Ljava/lang/Object;)Ln0/o3$b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v2, Lf1/p1$b;

    invoke-direct {v2, p0, v0, p2, p1}, Lf1/p1$b;-><init>(Lf1/p1;Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Ln0/o3$b;)V

    new-instance p0, Lf1/n1;

    invoke-direct {p0, v0, p1, v2}, Lf1/n1;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ln0/o3$b;Ln0/u;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v2}, Ln0/o3$b;->j(Ln0/u;)Ln0/o3$b;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s[0x%x]"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m1(Lf1/a2;)Lf1/p1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lf1/a2;",
            ">(TT;)",
            "Lf1/p1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lf1/p1$d;

    invoke-static {p0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf1/a2;

    invoke-direct {v0, p0}, Lf1/p1$d;-><init>(Lf1/a2;)V

    invoke-virtual {v0}, Lf1/p1$d;->f()Lf1/p1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lf1/p1;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic o0(Lf1/p1;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->L()V

    return-void
.end method

.method public static synthetic p0(Lf1/p1;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic q0(Lf1/p1;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->N()V

    return-void
.end method

.method public static r0(Ljava/util/Set;IILandroid/util/Size;Lm1/r1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroid/util/Size;",
            ">;II",
            "Landroid/util/Size;",
            "Lm1/r1;",
            ")V"
        }
    .end annotation

    const-string v0, "VideoCapture"

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v1

    if-gt p1, v1, :cond_1

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p3

    if-le p2, p3, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-interface {p4, p1}, Lm1/r1;->h(I)Landroid/util/Range;

    move-result-object p3

    new-instance v1, Landroid/util/Size;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {v1, p1, p3}, Landroid/util/Size;-><init>(II)V

    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No supportedHeights for width: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p3}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-interface {p4, p2}, Lm1/r1;->b(I)Landroid/util/Range;

    move-result-object p3

    new-instance p4, Landroid/util/Size;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p4, p1, p2}, Landroid/util/Size;-><init>(II)V

    invoke-interface {p0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No supportedWidths for height: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p0}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public static s0(Landroid/graphics/Rect;IZLm1/r1;)Landroid/graphics/Rect;
    .locals 1

    const-class v0, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p0, p1, p3}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->g(Landroid/graphics/Rect;ILm1/r1;)Landroid/graphics/Rect;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static t0(Landroid/graphics/Rect;Landroid/util/Size;Lm1/r1;)Landroid/graphics/Rect;
    .locals 7

    invoke-static {p0}, Lp0/a0;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Lm1/r1;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2}, Lm1/r1;->c()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v3

    invoke-interface {p2}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoCapture"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lm1/r1;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lm1/m1;

    invoke-direct {v0, p2}, Lm1/m1;-><init>(Lm1/r1;)V

    move-object p2, v0

    :cond_1
    :goto_0
    invoke-interface {p2}, Lm1/r1;->f()I

    move-result v0

    invoke-interface {p2}, Lm1/r1;->c()I

    move-result v2

    invoke-interface {p2}, Lm1/r1;->i()Landroid/util/Range;

    move-result-object v3

    invoke-interface {p2}, Lm1/r1;->j()Landroid/util/Range;

    move-result-object v4

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-static {v5, v0, v3}, Lf1/p1;->x0(IILandroid/util/Range;)I

    move-result v5

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-static {v6, v0, v3}, Lf1/p1;->y0(IILandroid/util/Range;)I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v3

    invoke-static {v3, v2, v4}, Lf1/p1;->x0(IILandroid/util/Range;)I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-static {v6, v2, v4}, Lf1/p1;->y0(IILandroid/util/Range;)I

    move-result v2

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-static {v4, v5, v3, p1, p2}, Lf1/p1;->r0(Ljava/util/Set;IILandroid/util/Size;Lm1/r1;)V

    invoke-static {v4, v5, v2, p1, p2}, Lf1/p1;->r0(Ljava/util/Set;IILandroid/util/Size;Lm1/r1;)V

    invoke-static {v4, v0, v3, p1, p2}, Lf1/p1;->r0(Ljava/util/Set;IILandroid/util/Size;Lm1/r1;)V

    invoke-static {v4, v0, v2, p1, p2}, Lf1/p1;->r0(Ljava/util/Set;IILandroid/util/Size;Lm1/r1;)V

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p1, "Can\'t find valid cropped size"

    invoke-static {v1, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "candidatesList = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lf1/o1;

    invoke-direct {v0, p0}, Lf1/o1;-><init>(Landroid/graphics/Rect;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sorted candidatesList = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-ne v2, v3, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-ne p2, v3, :cond_3

    const-string p1, "No need to adjust cropRect because crop size is valid."

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_3
    rem-int/lit8 v3, v2, 0x2

    if-nez v3, :cond_4

    rem-int/lit8 v3, p2, 0x2

    if-nez v3, :cond_4

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v3

    if-gt v2, v3, :cond_4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v3

    if-gt p2, v3, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    move v3, v0

    :goto_1
    invoke-static {v3}, Lx2/g;->i(Z)V

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, p0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v4

    if-eq v2, v4, :cond_5

    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    move-result v4

    div-int/lit8 v5, v2, 0x2

    sub-int/2addr v4, v5

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v2

    iput v4, v3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v5

    if-le v4, v5, :cond_5

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v4

    iput v4, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v4, v2

    iput v4, v3, Landroid/graphics/Rect;->left:I

    :cond_5
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v2

    if-eq p2, v2, :cond_6

    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    div-int/lit8 v4, p2, 0x2

    sub-int/2addr v2, v4

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, p2

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    if-le v0, v2, :cond_6

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, p2

    iput p1, v3, Landroid/graphics/Rect;->top:I

    :cond_6
    invoke-static {p0}, Lp0/a0;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3}, Lp0/a0;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Adjust cropRect from %s to %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method public static w0(ZIILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    rem-int v0, p1, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    sub-int/2addr p2, v0

    add-int/2addr p1, p2

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static x0(IILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0, p0, p1, p2}, Lf1/p1;->w0(ZIILandroid/util/Range;)I

    move-result p0

    return p0
.end method

.method public static y0(IILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0, p1, p2}, Lf1/p1;->w0(ZIILandroid/util/Range;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public A(Ln0/o0;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            ")",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lf1/p1;->R0(Lg0/t;I)Lf1/h1;

    move-result-object p1

    invoke-interface {p1}, Lf1/h1;->c()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final A0(Landroid/util/Size;Lm1/r1;)Landroid/graphics/Rect;
    .locals 4

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-interface {p2, v1, v2}, Lm1/r1;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0, p1, p2}, Lf1/p1;->t0(Landroid/graphics/Rect;Landroid/util/Size;Lm1/r1;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public B()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final C0(Ln0/p0;Lg1/a;ILandroid/graphics/Rect;Landroid/util/Size;Lg0/k0;)Lx0/v0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Lg1/a<",
            "TT;>;I",
            "Landroid/graphics/Rect;",
            "Landroid/util/Size;",
            "Lg0/k0;",
            ")",
            "Lx0/v0;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p6}, Lf1/p1;->S0(Ln0/p0;Lg1/a;ILandroid/graphics/Rect;Landroid/util/Size;Lg0/k0;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "VideoCapture"

    const-string p2, "Surface processing is enabled."

    invoke-static {p1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lx0/v0;

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ln0/p0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p3

    invoke-virtual {p3}, Lg0/n;->a()Lx0/r0;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-static {p6}, Lx0/t$a;->a(Lg0/k0;)Lx0/r0;

    move-result-object p3

    :goto_0
    invoke-direct {p1, p2, p3}, Lx0/v0;-><init>(Ln0/p0;Lx0/r0;)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public D(Ln0/n1;)Ln0/i4$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1;",
            ")",
            "Ln0/i4$b<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Lf1/p1$d;->h(Ln0/n1;)Lf1/p1$d;

    move-result-object p1

    return-object p1
.end method

.method public final D0(Ln0/o0;Lf1/s;Lg0/k0;Lf1/h1;ILandroid/util/Range;Lm1/r1$a;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Lf1/s;",
            "Lg0/k0;",
            "Lf1/h1;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Lm1/r1$a;",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;)",
            "Ljava/util/LinkedHashMap<",
            "Lf1/x;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lf1/s;->d()Lf1/c2;

    move-result-object v0

    invoke-virtual {v0}, Lf1/c2;->b()I

    move-result v0

    move-object v1, p6

    invoke-static {p4, p3}, Lf1/a0;->h(Lf1/h1;Lg0/k0;)Ljava/util/Map;

    move-result-object p6

    invoke-virtual {p0, p1, p5, v1}, Lf1/p1;->P0(Ln0/o0;ILandroid/util/Range;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lf1/z;

    invoke-direct {v1, p1, p6}, Lf1/z;-><init>(Ljava/util/List;Ljava/util/Map;)V

    new-instance p5, Ljava/util/LinkedHashMap;

    invoke-direct {p5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p8

    :goto_0
    invoke-interface {p8}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/x;

    invoke-virtual {v1, p1, v0}, Lf1/z;->g(Lf1/x;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p5, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, p7

    invoke-static/range {p1 .. p6}, Lf1/p1;->G0(Lm1/r1$a;Lf1/s;Lg0/k0;Lf1/h1;Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1
.end method

.method public final E0(Lg1/a;Ln0/t3;)Ln0/o3$b;
    .locals 23
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/a<",
            "TT;>;",
            "Ln0/t3;",
            ")",
            "Ln0/o3$b;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {v0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v1

    invoke-static {v1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/p0;

    invoke-virtual/range {p2 .. p2}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v5

    new-instance v7, Lf1/j1;

    invoke-direct {v7, v0}, Lf1/j1;-><init>(Lf1/p1;)V

    invoke-static/range {p2 .. p2}, Lf1/p1;->W0(Ln0/t3;)Landroid/util/Range;

    move-result-object v8

    invoke-virtual {v0}, Lf1/p1;->J0()Lf1/s;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Ln0/t3;->g()I

    move-result v3

    invoke-interface {v1}, Ln0/p0;->d()Lg0/t;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Lf1/p1;->R0(Lg0/t;I)Lf1/h1;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Ln0/t3;->b()Lg0/k0;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lf1/h1;->b(Landroid/util/Size;Lg0/k0;)Lh1/i;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lg1/a;->h0()Lm1/r1$a;

    move-result-object v9

    invoke-static {v9, v4, v2, v6}, Lf1/p1;->Y0(Lm1/r1$a;Lh1/i;Lf1/s;Lg0/k0;)Lm1/r1;

    move-result-object v9

    invoke-virtual {v0, v1}, Lf1/p1;->I0(Ln0/p0;)I

    move-result v2

    iput v2, v0, Lf1/p1;->B:I

    invoke-virtual {v0, v5, v9}, Lf1/p1;->A0(Landroid/util/Size;Lm1/r1;)Landroid/graphics/Rect;

    move-result-object v2

    iget v4, v0, Lf1/p1;->B:I

    invoke-virtual {v0, v2, v4}, Lf1/p1;->u0(Landroid/graphics/Rect;I)Landroid/graphics/Rect;

    move-result-object v4

    iput-object v4, v0, Lf1/p1;->A:Landroid/graphics/Rect;

    invoke-virtual {v0, v5, v2, v4}, Lf1/p1;->v0(Landroid/util/Size;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v10

    invoke-virtual {v0}, Lf1/p1;->e1()Z

    move-result v2

    const/4 v11, 0x1

    if-eqz v2, :cond_0

    iput-boolean v11, v0, Lf1/p1;->C:Z

    :cond_0
    iget-object v4, v0, Lf1/p1;->A:Landroid/graphics/Rect;

    iget v12, v0, Lf1/p1;->B:I

    move-object/from16 v2, p1

    invoke-virtual/range {v0 .. v6}, Lf1/p1;->S0(Ln0/p0;Lg1/a;ILandroid/graphics/Rect;Landroid/util/Size;Lg0/k0;)Z

    move-result v13

    invoke-static {v4, v12, v13, v9}, Lf1/p1;->s0(Landroid/graphics/Rect;IZLm1/r1;)Landroid/graphics/Rect;

    move-result-object v4

    iput-object v4, v0, Lf1/p1;->A:Landroid/graphics/Rect;

    invoke-virtual/range {v0 .. v6}, Lf1/p1;->C0(Ln0/p0;Lg1/a;ILandroid/graphics/Rect;Landroid/util/Size;Lg0/k0;)Lx0/v0;

    move-result-object v4

    move v9, v3

    iput-object v4, v0, Lf1/p1;->z:Lx0/v0;

    invoke-interface {v1}, Ln0/p0;->q()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object v2, v0, Lf1/p1;->z:Lx0/v0;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v6, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v6, v11

    :goto_1
    iget-object v2, v0, Lf1/p1;->z:Lx0/v0;

    invoke-static {v1, v2}, Lf1/p1;->X0(Ln0/p0;Lx0/v0;)Ln0/a4;

    move-result-object v5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "camera timebase = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ln0/p0;->k()Ln0/o0;

    move-result-object v4

    invoke-interface {v4}, Ln0/o0;->t()Ln0/a4;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", processing timebase = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "VideoCapture"

    invoke-static {v4, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object v2

    invoke-virtual {v2, v10}, Ln0/t3$a;->f(Landroid/util/Size;)Ln0/t3$a;

    move-result-object v2

    invoke-virtual {v2, v8}, Ln0/t3$a;->c(Landroid/util/Range;)Ln0/t3$a;

    move-result-object v2

    invoke-virtual {v2}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object v15

    iget-object v2, v0, Lf1/p1;->t:Lx0/n0;

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    move v11, v3

    :goto_2
    invoke-static {v11}, Lx2/g;->i(Z)V

    new-instance v12, Lx0/n0;

    invoke-virtual {v0}, Lg0/w2;->y()Landroid/graphics/Matrix;

    move-result-object v16

    invoke-interface {v1}, Ln0/p0;->q()Z

    move-result v17

    iget-object v2, v0, Lf1/p1;->A:Landroid/graphics/Rect;

    iget v3, v0, Lf1/p1;->B:I

    invoke-virtual {v0}, Lg0/w2;->f()I

    move-result v20

    invoke-direct {v0, v1}, Lf1/p1;->j1(Ln0/p0;)Z

    move-result v21

    const/4 v13, 0x2

    const/16 v14, 0x22

    move-object/from16 v18, v2

    move/from16 v19, v3

    invoke-direct/range {v12 .. v21}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v12, v0, Lf1/p1;->t:Lx0/n0;

    invoke-virtual {v12, v7}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    iget-object v2, v0, Lf1/p1;->z:Lx0/v0;

    if-eqz v2, :cond_4

    iget-object v2, v0, Lf1/p1;->t:Lx0/n0;

    invoke-static {v2}, Lz0/f;->j(Lx0/n0;)Lz0/f;

    move-result-object v2

    iget-object v3, v0, Lf1/p1;->t:Lx0/n0;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lx0/v0$b;->c(Lx0/n0;Ljava/util/List;)Lx0/v0$b;

    move-result-object v3

    iget-object v4, v0, Lf1/p1;->z:Lx0/v0;

    invoke-virtual {v4, v3}, Lx0/v0;->j(Lx0/v0$b;)Lx0/v0$c;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/n0;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lf1/k1;

    move-object/from16 v4, p1

    move-object v3, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lf1/k1;-><init>(Lf1/p1;Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V

    move-object/from16 v22, v3

    move-object v3, v0

    move-object v0, v1

    move-object/from16 v1, v22

    invoke-virtual {v2, v3}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    invoke-virtual {v2, v1}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object v1

    iput-object v1, v0, Lf1/p1;->x:Lg0/v2;

    iget-object v1, v0, Lf1/p1;->t:Lx0/n0;

    invoke-virtual {v1}, Lx0/n0;->o()Ln0/u1;

    move-result-object v1

    iput-object v1, v0, Lf1/p1;->s:Ln0/u1;

    invoke-virtual {v1}, Ln0/u1;->k()Lne/x;

    move-result-object v2

    new-instance v3, Lf1/l1;

    invoke-direct {v3, v0, v1}, Lf1/l1;-><init>(Lf1/p1;Ln0/u1;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lf1/p1;->t:Lx0/n0;

    invoke-virtual {v2, v1}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object v1

    iput-object v1, v0, Lf1/p1;->x:Lg0/v2;

    invoke-virtual {v1}, Lg0/v2;->n()Ln0/u1;

    move-result-object v1

    iput-object v1, v0, Lf1/p1;->s:Ln0/u1;

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lg1/a;->i0()Lf1/a2;

    move-result-object v1

    iget-object v2, v0, Lf1/p1;->x:Lg0/v2;

    invoke-interface {v1, v2, v5, v6}, Lf1/a2;->b(Lg0/v2;Ln0/a4;Z)V

    invoke-direct {v0}, Lf1/p1;->Z0()V

    iget-object v1, v0, Lf1/p1;->s:Ln0/u1;

    const-class v2, Landroid/media/MediaCodec;

    invoke-virtual {v1, v2}, Ln0/u1;->p(Ljava/lang/Class;)V

    invoke-virtual/range {p2 .. p2}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object v1

    invoke-virtual {v1, v9}, Ln0/o3$b;->A(I)Ln0/o3$b;

    move-object/from16 v3, p2

    invoke-virtual {v0, v1, v3}, Lg0/w2;->b(Ln0/o3$b;Ln0/t3;)V

    invoke-interface {v2}, Ln0/i4;->x()I

    move-result v2

    invoke-virtual {v1, v2}, Ln0/o3$b;->C(I)Ln0/o3$b;

    iget-object v2, v0, Lf1/p1;->E:Ln0/o3$c;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ln0/o3$c;->b()V

    :cond_5
    new-instance v2, Ln0/o3$c;

    new-instance v4, Lf1/m1;

    invoke-direct {v4, v0}, Lf1/m1;-><init>(Lf1/p1;)V

    invoke-direct {v2, v4}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object v2, v0, Lf1/p1;->E:Ln0/o3$c;

    invoke-virtual {v1, v2}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    invoke-virtual {v3}, Ln0/t3;->d()Ln0/n1;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v3}, Ln0/t3;->d()Ln0/n1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    :cond_6
    return-object v1
.end method

.method public final I0(Ln0/p0;)I
    .locals 3

    invoke-virtual {p0, p1}, Lg0/w2;->H(Ln0/p0;)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lg0/w2;->u(Ln0/p0;Z)I

    move-result p1

    invoke-virtual {p0}, Lf1/p1;->e1()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {v1}, Lf1/g1;->b()Lg0/v2$h;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lg0/v2$h;->b()I

    move-result v2

    invoke-virtual {v1}, Lg0/v2$h;->f()Z

    move-result v1

    if-eq v0, v1, :cond_0

    neg-int v2, v2

    :cond_0
    sub-int/2addr p1, v2

    invoke-static {p1}, Lp0/a0;->w(I)I

    move-result p1

    :cond_1
    return p1
.end method

.method public final J0()Lf1/s;
    .locals 2

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0}, Lf1/a2;->c()Ln0/a3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lf1/p1;->F0(Ln0/a3;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/s;

    return-object v0
.end method

.method public final K0()Lf1/s;
    .locals 2

    invoke-virtual {p0}, Lf1/p1;->J0()Lf1/s;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MediaSpec can\'t be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public L0()Lf1/a2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Lg1/a;

    invoke-virtual {v0}, Lg1/a;->i0()Lf1/a2;

    move-result-object v0

    return-object v0
.end method

.method public final M0(Ljava/util/List;Lf1/a0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;",
            "Lf1/a0;",
            ")",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lf1/a0;->f(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Found selectedQualities "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " by "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "VideoCapture"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to find selected quality"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N0(Lg1/a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/a<",
            "TT;>;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ln0/i4;->o(I)I

    move-result p1

    return p1
.end method

.method public final O0(Lg0/k0;Lf1/h1;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            "Lf1/h1;",
            "I)",
            "Ljava/util/List<",
            "Lf1/x;",
            ">;"
        }
    .end annotation

    invoke-interface {p2, p1}, Lf1/h1;->e(Lg0/k0;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "supportedQualities = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "VideoCapture"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    if-eq p3, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No supported quality on the device for high-speed capture."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public final P0(Ln0/o0;ILandroid/util/Range;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    sget-object p2, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {p2, p3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ln0/o0;->y()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1, p3}, Ln0/o0;->r(Landroid/util/Range;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result p2

    invoke-interface {p1, p2}, Ln0/o0;->m(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Ln0/i4$b<",
            "***>;)",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lf1/p1;->l1(Ln0/o0;Ln0/i4$b;)V

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final Q0(Lg1/a;)Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/a<",
            "TT;>;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    invoke-interface {p1, v0}, Ln0/i4;->z(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public R()V
    .locals 3

    invoke-super {p0}, Lg0/w2;->R()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoCapture#onStateAttached: cameraID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoCapture"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf1/p1;->x:Lg0/v2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/t3;

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v1

    invoke-interface {v1}, Lf1/a2;->e()Ln0/a3;

    move-result-object v1

    sget-object v2, Lf1/g1;->a:Lf1/g1;

    invoke-static {v1, v2}, Lf1/p1;->F0(Ln0/a3;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/g1;

    iput-object v1, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    check-cast v1, Lg1/a;

    invoke-virtual {p0, v1, v0}, Lf1/p1;->E0(Lg1/a;Ln0/t3;)Ln0/o3$b;

    move-result-object v1

    iput-object v1, p0, Lf1/p1;->v:Ln0/o3$b;

    iget-object v2, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {p0, v1, v2, v0}, Lf1/p1;->z0(Ln0/o3$b;Lf1/g1;Ln0/t3;)V

    iget-object v0, p0, Lf1/p1;->v:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    invoke-static {v0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->J()V

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0}, Lf1/a2;->e()Ln0/a3;

    move-result-object v0

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, Lf1/p1;->G:Ln0/a3$a;

    invoke-interface {v0, v1, v2}, Ln0/a3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    iget-object v0, p0, Lf1/p1;->D:Lf1/p1$f;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf1/p1$f;->b()V

    :cond_1
    new-instance v0, Lf1/p1$f;

    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object v1

    invoke-direct {v0, v1}, Lf1/p1$f;-><init>(Ln0/l0;)V

    iput-object v0, p0, Lf1/p1;->D:Lf1/p1$f;

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0}, Lf1/a2;->g()Ln0/a3;

    move-result-object v0

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, Lf1/p1;->D:Lf1/p1$f;

    invoke-interface {v0, v1, v2}, Ln0/a3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    sget-object v0, Lf1/a2$a;->b:Lf1/a2$a;

    invoke-virtual {p0, v0}, Lf1/p1;->b1(Lf1/a2$a;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final R0(Lg0/t;I)Lf1/h1;
    .locals 1

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lf1/a2;->f(Lg0/t;I)Lf1/h1;

    move-result-object p1

    return-object p1
.end method

.method public S()V
    .locals 3

    const-string v0, "VideoCapture#onStateDetached"

    const-string v1, "VideoCapture"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lp0/z;->d()Z

    move-result v0

    const-string v2, "VideoCapture can only be detached on the main thread."

    invoke-static {v0, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lf1/p1;->D:Lf1/p1$f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0}, Lf1/a2;->g()Ln0/a3;

    move-result-object v0

    iget-object v2, p0, Lf1/p1;->D:Lf1/p1$f;

    invoke-interface {v0, v2}, Ln0/a3;->d(Ln0/a3$a;)V

    iget-object v0, p0, Lf1/p1;->D:Lf1/p1$f;

    invoke-virtual {v0}, Lf1/p1$f;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/p1;->D:Lf1/p1$f;

    :cond_0
    sget-object v0, Lf1/a2$a;->c:Lf1/a2$a;

    invoke-virtual {p0, v0}, Lf1/p1;->b1(Lf1/a2$a;)V

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0}, Lf1/a2;->e()Ln0/a3;

    move-result-object v0

    iget-object v2, p0, Lf1/p1;->G:Ln0/a3$a;

    invoke-interface {v0, v2}, Ln0/a3;->d(Ln0/a3$a;)V

    iget-object v0, p0, Lf1/p1;->w:Lne/x;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "VideoCapture is detached from the camera. Surface update cancelled."

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0}, Lf1/p1;->B0()V

    return-void
.end method

.method public final S0(Ln0/p0;Lg1/a;ILandroid/graphics/Rect;Landroid/util/Size;Lg0/k0;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Lg1/a<",
            "*>;I",
            "Landroid/graphics/Rect;",
            "Landroid/util/Size;",
            "Lg0/k0;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p3, v1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p3

    if-nez p3, :cond_2

    invoke-static {p1, p2}, Lf1/p1;->h1(Ln0/p0;Lg1/a;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1}, Lf1/p1;->i1(Ln0/p0;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p1, p6}, Lf1/p1;->g1(Ln0/p0;Lg0/k0;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p4, p5}, Lf1/p1;->f1(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-direct {p0, p1}, Lf1/p1;->j1(Ln0/p0;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lf1/p1;->e1()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lf1/p1;->v:Ln0/o3$b;

    invoke-virtual {v0, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lf1/p1;->v:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    invoke-static {v0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/t3$a;->d(Ln0/n1;)Ln0/t3$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object p1

    return-object p1
.end method

.method public T0(II)Z
    .locals 2

    sget-object v0, Lf1/g1;->b:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eq p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public U(Ln0/t3;Ln0/t3;)Ln0/t3;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryStreamSpec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "VideoCapture"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    check-cast p2, Lg1/a;

    const/4 v1, 0x0

    invoke-interface {p2, v1}, Ln0/i2;->N(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "suggested resolution "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is not in custom ordered resolutions "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method public final U0(Lx0/n0;Ln0/p0;Lg1/a;Ln0/a4;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ln0/p0;",
            "Lg1/a<",
            "TT;>;",
            "Ln0/a4;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1, p2}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object p1

    iput-object p1, p0, Lf1/p1;->x:Lg0/v2;

    invoke-virtual {p3}, Lg1/a;->i0()Lf1/a2;

    move-result-object p1

    iget-object p2, p0, Lf1/p1;->x:Lg0/v2;

    invoke-interface {p1, p2, p4, p5}, Lf1/a2;->b(Lg0/v2;Ln0/a4;Z)V

    invoke-direct {p0}, Lf1/p1;->Z0()V

    :cond_0
    return-void
.end method

.method public V0()V
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lf1/p1;->B0()V

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Lg1/a;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v1

    invoke-static {v1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/t3;

    invoke-virtual {p0, v0, v1}, Lf1/p1;->E0(Lg1/a;Ln0/t3;)Ln0/o3$b;

    move-result-object v0

    iput-object v0, p0, Lf1/p1;->v:Ln0/o3$b;

    iget-object v1, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lf1/p1;->z0(Ln0/o3$b;Lf1/g1;Ln0/t3;)V

    iget-object v0, p0, Lf1/p1;->v:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    invoke-static {v0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    return-void
.end method

.method public final a1(Ln0/i4$b;Ljava/util/LinkedHashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4$b<",
            "***>;",
            "Ljava/util/LinkedHashMap<",
            "Lf1/x;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Set custom ordered resolutions = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "VideoCapture"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v1, Ln0/i2;->v:Ln0/n1$a;

    invoke-interface {p1, v1, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    iput-object p2, p0, Lf1/p1;->F:Ljava/util/Map;

    return-void
.end method

.method public b0(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Lg0/w2;->b0(Landroid/graphics/Rect;)V

    invoke-direct {p0}, Lf1/p1;->Z0()V

    return-void
.end method

.method public b1(Lf1/a2$a;)V
    .locals 1

    iget-object v0, p0, Lf1/p1;->y:Lf1/a2$a;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lf1/p1;->y:Lf1/a2$a;

    invoke-virtual {p0}, Lf1/p1;->L0()Lf1/a2;

    move-result-object v0

    invoke-interface {v0, p1}, Lf1/a2;->d(Lf1/a2$a;)V

    :cond_0
    return-void
.end method

.method public c1(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lg0/w2;->a0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lf1/p1;->Z0()V

    :cond_0
    return-void
.end method

.method public final d1(Ln0/o3$b;Z)V
    .locals 2

    iget-object v0, p0, Lf1/p1;->w:Lne/x;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "VideoCapture"

    const-string v1, "A newer surface update is requested. Previous surface update cancelled."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lf1/i1;

    invoke-direct {v0, p0, p1}, Lf1/i1;-><init>(Lf1/p1;Ln0/o3$b;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lf1/p1;->w:Lne/x;

    new-instance v0, Lf1/p1$c;

    invoke-direct {v0, p0, p1, p2}, Lf1/p1$c;-><init>(Lf1/p1;Lne/x;Z)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final e1()Z
    .locals 1

    iget-object v0, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {v0}, Lf1/g1;->b()Lg0/v2$h;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k1(Lf1/g1;Lf1/g1;)Z
    .locals 1

    iget-boolean v0, p0, Lf1/p1;->C:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lf1/g1;->b()Lg0/v2$h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lf1/g1;->b()Lg0/v2$h;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final l1(Ln0/o0;Ln0/i4$b;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Ln0/i4$b<",
            "***>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lf1/p1;->K0()Lf1/s;

    move-result-object v2

    invoke-virtual {v2}, Lf1/s;->d()Lf1/c2;

    move-result-object v0

    invoke-virtual {v0}, Lf1/c2;->e()Lf1/a0;

    move-result-object v0

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object v1

    check-cast v1, Lg1/a;

    sget-object v3, Ln0/i2;->v:Ln0/n1$a;

    invoke-interface {v1, v3}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object p1, Lf1/c2;->b:Lf1/a0;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "Custom ordered resolutions and QualitySelector can\'t both be set"

    invoke-static {p1, p2}, Lx2/g;->b(ZLjava/lang/Object;)V

    return-void

    :cond_1
    invoke-interface {v1}, Ln0/h2;->M()Lg0/k0;

    move-result-object v3

    invoke-virtual {p0, v1}, Lf1/p1;->N0(Lg1/a;)I

    move-result v5

    invoke-virtual {p0, v1}, Lf1/p1;->Q0(Lg1/a;)Landroid/util/Range;

    move-result-object v6

    invoke-virtual {p0, p1, v5}, Lf1/p1;->R0(Lg0/t;I)Lf1/h1;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Update custom order resolutions: requestedDynamicRange = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ", sessionType = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", targetFrameRate = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "VideoCapture"

    invoke-static {v8, v7}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3, v4, v5}, Lf1/p1;->O0(Lg0/k0;Lf1/h1;I)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    const-string p1, "Can\'t find any supported quality on the device."

    invoke-static {v8, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p0, v7, v0}, Lf1/p1;->M0(Ljava/util/List;Lf1/a0;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lg1/a;->h0()Lm1/r1$a;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v8}, Lf1/p1;->D0(Ln0/o0;Lf1/s;Lg0/k0;Lf1/h1;ILandroid/util/Range;Lm1/r1$a;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lf1/p1;->a1(Ln0/i4$b;Ljava/util/LinkedHashMap;)V

    return-void
.end method

.method public m(ZLn0/j4;)Ln0/i4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ln0/j4;",
            ")",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lf1/p1;->H:Lf1/p1$e;

    invoke-virtual {v0}, Lf1/p1$e;->a()Lg1/a;

    move-result-object v1

    invoke-interface {v1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Ln0/j4;->a(Ln0/j4$b;I)Ln0/n1;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lf1/p1$e;->a()Lg1/a;

    move-result-object p1

    invoke-static {p2, p1}, Ln0/n1;->L(Ln0/n1;Ln0/n1;)Ln0/n1;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lf1/p1;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/w2;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Landroid/graphics/Rect;I)Landroid/graphics/Rect;
    .locals 1

    invoke-virtual {p0}, Lf1/p1;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lf1/p1;->u:Lf1/g1;

    invoke-virtual {p1}, Lf1/g1;->b()Lg0/v2$h;

    move-result-object p1

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/v2$h;

    invoke-virtual {p1}, Lg0/v2$h;->a()Landroid/graphics/Rect;

    move-result-object p1

    invoke-static {p1, p2}, Lp0/a0;->f(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Lp0/a0;->r(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final v0(Landroid/util/Size;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/util/Size;
    .locals 3

    invoke-virtual {p0}, Lf1/p1;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3, p2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p3, p2

    new-instance p2, Landroid/util/Size;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p3

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, p3

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p1, v1

    invoke-direct {p2, v0, p1}, Landroid/util/Size;-><init>(II)V

    return-object p2

    :cond_0
    return-object p1
.end method

.method public z0(Ln0/o3$b;Lf1/g1;Ln0/t3;)V
    .locals 5

    invoke-virtual {p2}, Lf1/g1;->a()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p2}, Lf1/g1;->c()Lf1/g1$a;

    move-result-object p2

    sget-object v4, Lf1/g1$a;->a:Lf1/g1$a;

    if-ne p2, v4, :cond_1

    move v1, v2

    :cond_1
    if-eqz v0, :cond_3

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected stream state, stream is error but active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {p1}, Ln0/o3$b;->q()Ln0/o3$b;

    invoke-virtual {p3}, Ln0/t3;->b()Lg0/k0;

    move-result-object p2

    if-nez v0, :cond_5

    iget-object p3, p0, Lf1/p1;->s:Ln0/u1;

    if-eqz p3, :cond_5

    if-eqz v1, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0, v3}, Ln0/o3$b;->n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;

    goto :goto_2

    :cond_4
    invoke-virtual {p1, p3, p2}, Ln0/o3$b;->i(Ln0/u1;Lg0/k0;)Ln0/o3$b;

    :cond_5
    :goto_2
    invoke-virtual {p0, p1, v1}, Lf1/p1;->d1(Ln0/o3$b;Z)V

    return-void
.end method
