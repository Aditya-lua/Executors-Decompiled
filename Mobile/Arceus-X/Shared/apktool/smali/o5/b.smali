.class public Lo5/b;
.super Lo5/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/b$i;,
        Lo5/b$g;,
        Lo5/b$h;
    }
.end annotation


# static fields
.field public static final R:[Ljava/lang/String;

.field public static final S:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lo5/b$i;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final T:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lo5/b$i;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final U:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final V:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final W:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/view/View;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public static final X:Lo5/m;


# instance fields
.field public Q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "android:changeBounds:windowX"

    const-string v1, "android:changeBounds:windowY"

    const-string v2, "android:changeBounds:bounds"

    const-string v3, "android:changeBounds:clip"

    const-string v4, "android:changeBounds:parent"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo5/b;->R:[Ljava/lang/String;

    new-instance v0, Lo5/b$a;

    const-class v1, Landroid/graphics/PointF;

    const-string v2, "topLeft"

    invoke-direct {v0, v1, v2}, Lo5/b$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/b;->S:Landroid/util/Property;

    new-instance v0, Lo5/b$b;

    const-string v3, "bottomRight"

    invoke-direct {v0, v1, v3}, Lo5/b$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/b;->T:Landroid/util/Property;

    new-instance v0, Lo5/b$c;

    invoke-direct {v0, v1, v3}, Lo5/b$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/b;->U:Landroid/util/Property;

    new-instance v0, Lo5/b$d;

    invoke-direct {v0, v1, v2}, Lo5/b$d;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/b;->V:Landroid/util/Property;

    new-instance v0, Lo5/b$e;

    const-string v2, "position"

    invoke-direct {v0, v1, v2}, Lo5/b$e;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lo5/b;->W:Landroid/util/Property;

    new-instance v0, Lo5/m;

    invoke-direct {v0}, Lo5/m;-><init>()V

    sput-object v0, Lo5/b;->X:Lo5/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo5/q;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo5/b;->Q:Z

    return-void
.end method


# virtual methods
.method public final B0(Lo5/d0;)V
    .locals 7

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p1, Lo5/d0;->a:Ljava/util/Map;

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v6

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v3, "android:changeBounds:bounds"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lo5/d0;->a:Ljava/util/Map;

    iget-object v2, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "android:changeBounds:parent"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lo5/b;->Q:Z

    if-eqz v1, :cond_1

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v1, "android:changeBounds:clip"

    invoke-virtual {v0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public V()[Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lo5/b;->R:[Ljava/lang/String;

    return-object v0
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Lo5/d0;)V
    .locals 0
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lo5/b;->B0(Lo5/d0;)V

    return-void
.end method

.method public o(Lo5/d0;)V
    .locals 2
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lo5/b;->B0(Lo5/d0;)V

    iget-boolean v0, p0, Lo5/b;->Q:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    sget v1, Lo5/l;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lo5/d0;->a:Ljava/util/Map;

    const-string v1, "android:changeBounds:clip"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public s(Landroid/view/ViewGroup;Lo5/d0;Lo5/d0;)Landroid/animation/Animator;
    .locals 21
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    if-eqz v1, :cond_0

    if-nez v2, :cond_1

    :cond_0
    const/16 p1, 0x0

    goto/16 :goto_c

    :cond_1
    iget-object v4, v1, Lo5/d0;->a:Ljava/util/Map;

    iget-object v5, v2, Lo5/d0;->a:Ljava/util/Map;

    const-string v6, "android:changeBounds:parent"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    if-eqz v4, :cond_2

    if-nez v5, :cond_3

    :cond_2
    const/16 p1, 0x0

    goto/16 :goto_c

    :cond_3
    iget-object v7, v2, Lo5/d0;->b:Landroid/view/View;

    iget-object v4, v1, Lo5/d0;->a:Ljava/util/Map;

    const-string v5, "android:changeBounds:bounds"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Rect;

    iget-object v6, v2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    iget v12, v4, Landroid/graphics/Rect;->left:I

    iget v6, v5, Landroid/graphics/Rect;->left:I

    iget v13, v4, Landroid/graphics/Rect;->top:I

    iget v8, v5, Landroid/graphics/Rect;->top:I

    iget v14, v4, Landroid/graphics/Rect;->right:I

    iget v9, v5, Landroid/graphics/Rect;->right:I

    iget v15, v4, Landroid/graphics/Rect;->bottom:I

    iget v4, v5, Landroid/graphics/Rect;->bottom:I

    sub-int v5, v14, v12

    sub-int v10, v15, v13

    sub-int v11, v9, v6

    const/16 p1, 0x0

    sub-int v3, v4, v8

    iget-object v1, v1, Lo5/d0;->a:Ljava/util/Map;

    move/from16 v16, v3

    const-string v3, "android:changeBounds:clip"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    iget-object v2, v2, Lo5/d0;->a:Ljava/util/Map;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Rect;

    const/16 p2, 0x1

    if-eqz v5, :cond_4

    if-nez v10, :cond_5

    :cond_4
    if-eqz v11, :cond_9

    if-eqz v16, :cond_9

    :cond_5
    if-ne v12, v6, :cond_7

    if-eq v13, v8, :cond_6

    goto :goto_0

    :cond_6
    const/16 v17, 0x0

    goto :goto_1

    :cond_7
    :goto_0
    move/from16 v17, p2

    :goto_1
    if-ne v14, v9, :cond_8

    if-eq v15, v4, :cond_a

    :cond_8
    add-int/lit8 v17, v17, 0x1

    goto :goto_2

    :cond_9
    const/16 v17, 0x0

    :cond_a
    :goto_2
    if-eqz v1, :cond_b

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_c

    :cond_b
    if-nez v1, :cond_d

    if-eqz v2, :cond_d

    :cond_c
    add-int/lit8 v17, v17, 0x1

    :cond_d
    move/from16 v3, v17

    const/16 p3, 0x0

    if-lez v3, :cond_1b

    move-object/from16 v17, v1

    iget-boolean v1, v0, Lo5/b;->Q:Z

    if-nez v1, :cond_12

    invoke-static {v7, v12, v13, v14, v15}, Lo5/i0;->d(Landroid/view/View;IIII)V

    const/4 v1, 0x2

    if-ne v3, v1, :cond_f

    if-ne v5, v11, :cond_e

    move/from16 v3, v16

    if-ne v10, v3, :cond_e

    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v1

    int-to-float v2, v12

    int-to-float v3, v13

    int-to-float v4, v6

    int-to-float v5, v8

    invoke-virtual {v1, v2, v3, v4, v5}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v2, Lo5/b;->W:Landroid/util/Property;

    invoke-static {v7, v2, v1}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    goto/16 :goto_b

    :cond_e
    new-instance v2, Lo5/b$i;

    invoke-direct {v2, v7}, Lo5/b$i;-><init>(Landroid/view/View;)V

    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v3

    int-to-float v5, v12

    int-to-float v10, v13

    int-to-float v6, v6

    int-to-float v8, v8

    invoke-virtual {v3, v5, v10, v6, v8}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v3

    sget-object v5, Lo5/b;->S:Landroid/util/Property;

    invoke-static {v2, v5, v3}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v5

    int-to-float v6, v14

    int-to-float v8, v15

    int-to-float v9, v9

    int-to-float v4, v4

    invoke-virtual {v5, v6, v8, v9, v4}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v4

    sget-object v5, Lo5/b;->T:Landroid/util/Property;

    invoke-static {v2, v5, v4}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v1, v1, [Landroid/animation/Animator;

    aput-object v3, v1, p3

    aput-object v4, v1, p2

    invoke-virtual {v5, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v1, Lo5/b$f;

    invoke-direct {v1, v0, v2}, Lo5/b$f;-><init>(Lo5/b;Lo5/b$i;)V

    invoke-virtual {v5, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object v1, v5

    goto/16 :goto_b

    :cond_f
    if-ne v12, v6, :cond_11

    if-eq v13, v8, :cond_10

    goto :goto_3

    :cond_10
    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v1

    int-to-float v2, v14

    int-to-float v3, v15

    int-to-float v5, v9

    int-to-float v4, v4

    invoke-virtual {v1, v2, v3, v5, v4}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v2, Lo5/b;->U:Landroid/util/Property;

    invoke-static {v7, v2, v1}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    goto/16 :goto_b

    :cond_11
    :goto_3
    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v1

    int-to-float v2, v12

    int-to-float v3, v13

    int-to-float v4, v6

    int-to-float v5, v8

    invoke-virtual {v1, v2, v3, v4, v5}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v2, Lo5/b;->V:Landroid/util/Property;

    invoke-static {v7, v2, v1}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    goto/16 :goto_b

    :cond_12
    move/from16 v3, v16

    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v16

    add-int/2addr v1, v12

    move-object/from16 v18, v2

    add-int v2, v13, v16

    invoke-static {v7, v12, v13, v1, v2}, Lo5/i0;->d(Landroid/view/View;IIII)V

    if-ne v12, v6, :cond_14

    if-eq v13, v8, :cond_13

    goto :goto_4

    :cond_13
    move-object/from16 v1, p1

    move/from16 v19, v4

    move/from16 v20, v6

    move/from16 v16, v9

    goto :goto_5

    :cond_14
    :goto_4
    invoke-virtual {v0}, Lo5/q;->J()Lo5/k;

    move-result-object v1

    int-to-float v2, v12

    move/from16 v19, v4

    int-to-float v4, v13

    move/from16 v16, v9

    int-to-float v9, v6

    move/from16 v20, v6

    int-to-float v6, v8

    invoke-virtual {v1, v2, v4, v9, v6}, Lo5/k;->a(FFFF)Landroid/graphics/Path;

    move-result-object v1

    sget-object v2, Lo5/b;->W:Landroid/util/Property;

    invoke-static {v7, v2, v1}, Lo5/j;->a(Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    :goto_5
    if-nez v17, :cond_15

    move/from16 v9, p2

    goto :goto_6

    :cond_15
    move/from16 v9, p3

    :goto_6
    if-eqz v9, :cond_16

    new-instance v2, Landroid/graphics/Rect;

    move/from16 v4, p3

    invoke-direct {v2, v4, v4, v5, v10}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_7

    :cond_16
    move/from16 v4, p3

    move-object/from16 v2, v17

    :goto_7
    if-nez v18, :cond_17

    move/from16 v5, p2

    goto :goto_8

    :cond_17
    move v5, v4

    :goto_8
    if-eqz v5, :cond_18

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v4, v4, v11, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v10, v6

    goto :goto_9

    :cond_18
    move-object/from16 v10, v18

    :goto_9
    invoke-virtual {v2, v10}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual {v7, v2}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    sget-object v3, Lo5/b;->X:Lo5/m;

    filled-new-array {v2, v10}, [Ljava/lang/Object;

    move-result-object v4

    const-string v6, "clipBounds"

    invoke-static {v7, v6, v3, v4}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v3

    new-instance v6, Lo5/b$g;

    move v11, v5

    move/from16 v17, v8

    move/from16 v18, v16

    move/from16 v16, v20

    move-object v8, v2

    invoke-direct/range {v6 .. v19}, Lo5/b$g;-><init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V

    invoke-virtual {v3, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0, v6}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    goto :goto_a

    :cond_19
    move-object/from16 v3, p1

    :goto_a
    invoke-static {v1, v3}, Lo5/c0;->c(Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;

    move-result-object v1

    :goto_b
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_1a

    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    move/from16 v3, p2

    invoke-static {v2, v3}, Lo5/h0;->b(Landroid/view/ViewGroup;Z)V

    invoke-virtual {v0}, Lo5/q;->N()Lo5/q;

    move-result-object v3

    new-instance v4, Lo5/b$h;

    invoke-direct {v4, v2}, Lo5/b$h;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3, v4}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    :cond_1a
    return-object v1

    :cond_1b
    :goto_c
    return-object p1
.end method
