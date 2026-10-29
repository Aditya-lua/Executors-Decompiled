.class public abstract Lo5/o0;
.super Lo5/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/o0$c;,
        Lo5/o0$b;,
        Lo5/o0$a;
    }
.end annotation


# static fields
.field public static final R:[Ljava/lang/String;


# instance fields
.field public Q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "android:visibility:visibility"

    const-string v1, "android:visibility:parent"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo5/o0;->R:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo5/q;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lo5/o0;->Q:I

    return-void
.end method

.method private B0(Lo5/d0;)V
    .locals 3

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lo5/d0;->a:Ljava/util/Map;

    iget-object v1, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final C0(Lo5/d0;Lo5/d0;)Lo5/o0$c;
    .locals 7

    new-instance v0, Lo5/o0$c;

    invoke-direct {v0}, Lo5/o0$c;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo5/o0$c;->a:Z

    iput-boolean v1, v0, Lo5/o0$c;->b:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    const-string v4, "android:visibility:parent"

    const-string v5, "android:visibility:visibility"

    if-eqz p1, :cond_0

    iget-object v6, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v0, Lo5/o0$c;->c:I

    iget-object v6, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Lo5/o0$c;->e:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v3, v0, Lo5/o0$c;->c:I

    iput-object v2, v0, Lo5/o0$c;->e:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p2, :cond_1

    iget-object v6, p2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v2, p2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v0, Lo5/o0$c;->d:I

    iget-object v2, p2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Lo5/o0$c;->f:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v3, v0, Lo5/o0$c;->d:I

    iput-object v2, v0, Lo5/o0$c;->f:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    iget p1, v0, Lo5/o0$c;->c:I

    iget p2, v0, Lo5/o0$c;->d:I

    if-ne p1, p2, :cond_2

    iget-object v3, v0, Lo5/o0$c;->e:Landroid/view/ViewGroup;

    iget-object v4, v0, Lo5/o0$c;->f:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    goto :goto_2

    :cond_2
    if-eq p1, p2, :cond_4

    if-nez p1, :cond_3

    iput-boolean v1, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    return-object v0

    :cond_3
    if-nez p2, :cond_8

    iput-boolean v2, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    return-object v0

    :cond_4
    iget-object p1, v0, Lo5/o0$c;->f:Landroid/view/ViewGroup;

    if-nez p1, :cond_5

    iput-boolean v1, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    return-object v0

    :cond_5
    iget-object p1, v0, Lo5/o0$c;->e:Landroid/view/ViewGroup;

    if-nez p1, :cond_8

    iput-boolean v2, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    return-object v0

    :cond_6
    if-nez p1, :cond_7

    iget p1, v0, Lo5/o0$c;->d:I

    if-nez p1, :cond_7

    iput-boolean v2, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    return-object v0

    :cond_7
    if-nez p2, :cond_8

    iget p1, v0, Lo5/o0$c;->c:I

    if-nez p1, :cond_8

    iput-boolean v1, v0, Lo5/o0$c;->b:Z

    iput-boolean v2, v0, Lo5/o0$c;->a:Z

    :cond_8
    :goto_2
    return-object v0
.end method

.method public abstract D0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public E0(Landroid/view/ViewGroup;Lo5/d0;ILo5/d0;I)Landroid/animation/Animator;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p3, p0, Lo5/o0;->Q:I

    const/4 p5, 0x1

    and-int/2addr p3, p5

    const/4 v0, 0x0

    if-ne p3, p5, :cond_2

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    iget-object p3, p4, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    const/4 p5, 0x0

    invoke-virtual {p0, p3, p5}, Lo5/q;->E(Landroid/view/View;Z)Lo5/d0;

    move-result-object v1

    invoke-virtual {p0, p3, p5}, Lo5/q;->W(Landroid/view/View;Z)Lo5/d0;

    move-result-object p3

    invoke-virtual {p0, v1, p3}, Lo5/o0;->C0(Lo5/d0;Lo5/d0;)Lo5/o0$c;

    move-result-object p3

    iget-boolean p3, p3, Lo5/o0$c;->a:Z

    if-eqz p3, :cond_1

    return-object v0

    :cond_1
    iget-object p3, p4, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, p1, p3, p2, p4}, Lo5/o0;->D0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public abstract F0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public G0(Landroid/view/ViewGroup;Lo5/d0;ILo5/d0;I)Landroid/animation/Animator;
    .locals 10
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget p3, p0, Lo5/o0;->Q:I

    const/4 v0, 0x2

    and-int/2addr p3, v0

    const/4 v1, 0x0

    if-eq p3, v0, :cond_0

    return-object v1

    :cond_0
    if-nez p2, :cond_1

    return-object v1

    :cond_1
    iget-object p3, p2, Lo5/d0;->b:Landroid/view/View;

    if-eqz p4, :cond_2

    iget-object v2, p4, Lo5/d0;->b:Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    sget v3, Lo5/l;->a:I

    invoke-virtual {p3, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    move-object v2, v1

    move v7, v6

    goto/16 :goto_5

    :cond_3
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x4

    if-ne p5, v4, :cond_5

    goto :goto_1

    :cond_5
    if-ne p3, v2, :cond_6

    :goto_1
    move-object v4, v2

    move v7, v5

    move-object v2, v1

    goto :goto_3

    :cond_6
    move-object v2, v1

    move-object v4, v2

    move v7, v6

    goto :goto_3

    :cond_7
    :goto_2
    if-eqz v2, :cond_6

    move-object v4, v1

    move v7, v5

    :goto_3
    if-eqz v7, :cond_9

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    if-nez v7, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    instance-of v7, v7, Landroid/view/View;

    if-eqz v7, :cond_9

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    invoke-virtual {p0, v7, v6}, Lo5/q;->W(Landroid/view/View;Z)Lo5/d0;

    move-result-object v8

    invoke-virtual {p0, v7, v6}, Lo5/q;->E(Landroid/view/View;Z)Lo5/d0;

    move-result-object v9

    invoke-virtual {p0, v8, v9}, Lo5/o0;->C0(Lo5/d0;Lo5/d0;)Lo5/o0$c;

    move-result-object v8

    iget-boolean v8, v8, Lo5/o0$c;->a:Z

    if-nez v8, :cond_a

    invoke-static {p1, p3, v7}, Lo5/c0;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    :cond_9
    move-object v7, v4

    move-object v4, v2

    move-object v2, v7

    move v7, v5

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    if-nez v7, :cond_9

    const/4 v7, -0x1

    if-eq v8, v7, :cond_9

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    if-eqz v7, :cond_9

    iget-boolean v7, p0, Lo5/q;->w:Z

    if-eqz v7, :cond_9

    :goto_4
    move-object v2, v4

    move v7, v5

    move-object v4, p3

    :goto_5
    if-eqz v4, :cond_e

    if-nez v7, :cond_b

    iget-object p5, p2, Lo5/d0;->a:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, [I

    aget v1, p5, v5

    aget p5, p5, v6

    new-array v0, v0, [I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v2, v0, v5

    sub-int/2addr v1, v2

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v4, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v0, v0, v6

    sub-int/2addr p5, v0

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v0

    sub-int/2addr p5, v0

    invoke-virtual {v4, p5}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p5

    invoke-virtual {p5, v4}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    :cond_b
    invoke-virtual {p0, p1, v4, p2, p4}, Lo5/o0;->F0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;

    move-result-object p2

    if-nez v7, :cond_d

    if-nez p2, :cond_c

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-object p2

    :cond_c
    invoke-virtual {p3, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance p4, Lo5/o0$b;

    invoke-direct {p4, p0, p1, v4, p3}, Lo5/o0$b;-><init>(Lo5/o0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p2, p4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p2, p4}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    invoke-virtual {p0}, Lo5/q;->N()Lo5/q;

    move-result-object p1

    invoke-virtual {p1, p4}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    :cond_d
    return-object p2

    :cond_e
    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result p3

    invoke-static {v2, v5}, Lo5/i0;->f(Landroid/view/View;I)V

    invoke-virtual {p0, p1, v2, p2, p4}, Lo5/o0;->F0(Landroid/view/ViewGroup;Landroid/view/View;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance p2, Lo5/o0$a;

    invoke-direct {p2, v2, p5, v6}, Lo5/o0$a;-><init>(Landroid/view/View;IZ)V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Lo5/q;->N()Lo5/q;

    move-result-object p3

    invoke-virtual {p3, p2}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    return-object p1

    :cond_f
    invoke-static {v2, p3}, Lo5/i0;->f(Landroid/view/View;I)V

    return-object p1

    :cond_10
    return-object v1
.end method

.method public H0(I)V
    .locals 1

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_0

    iput p1, p0, Lo5/o0;->Q:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public V()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lo5/o0;->R:[Ljava/lang/String;

    return-object v0
.end method

.method public Z(Lo5/d0;Lo5/d0;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p2, Lo5/d0;->a:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lo5/o0;->C0(Lo5/d0;Lo5/d0;)Lo5/o0$c;

    move-result-object p1

    iget-boolean p2, p1, Lo5/o0$c;->a:Z

    if-eqz p2, :cond_3

    iget p2, p1, Lo5/o0$c;->c:I

    if-eqz p2, :cond_2

    iget p1, p1, Lo5/o0$c;->d:I

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    return v0
.end method

.method public j(Lo5/d0;)V
    .locals 0
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lo5/o0;->B0(Lo5/d0;)V

    return-void
.end method

.method public o(Lo5/d0;)V
    .locals 0
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lo5/o0;->B0(Lo5/d0;)V

    return-void
.end method

.method public s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 8
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p2, p3}, Lo5/o0;->C0(Lo5/d0;Lo5/d0;)Lo5/o0$c;

    move-result-object v0

    iget-boolean v1, v0, Lo5/o0$c;->a:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Lo5/o0$c;->e:Landroid/view/ViewGroup;

    if-nez v1, :cond_0

    iget-object v1, v0, Lo5/o0$c;->f:Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    :cond_0
    iget-boolean v1, v0, Lo5/o0$c;->b:Z

    if-eqz v1, :cond_1

    iget v5, v0, Lo5/o0$c;->c:I

    iget v7, v0, Lo5/o0$c;->d:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-virtual/range {v2 .. v7}, Lo5/o0;->E0(Landroid/view/ViewGroup;Lo5/d0;ILo5/d0;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    iget v3, v0, Lo5/o0$c;->c:I

    iget v5, v0, Lo5/o0$c;->d:I

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lo5/o0;->G0(Landroid/view/ViewGroup;Lo5/d0;ILo5/d0;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
