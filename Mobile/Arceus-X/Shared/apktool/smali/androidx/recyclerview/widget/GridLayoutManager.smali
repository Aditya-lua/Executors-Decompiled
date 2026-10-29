.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/GridLayoutManager$b;,
        Landroidx/recyclerview/widget/GridLayoutManager$d;,
        Landroidx/recyclerview/widget/GridLayoutManager$c;,
        Landroidx/recyclerview/widget/GridLayoutManager$a;
    }
.end annotation


# static fields
.field public static final U:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public I:Z

.field public J:I

.field public K:[I

.field public L:[Landroid/view/View;

.field public final M:Landroid/util/SparseIntArray;

.field public final N:Landroid/util/SparseIntArray;

.field public O:Landroidx/recyclerview/widget/GridLayoutManager$d;

.field public final P:Landroid/graphics/Rect;

.field public Q:Z

.field public R:I

.field public S:I

.field public T:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x42

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x21

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x82

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->U:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 13
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    const/4 p1, -0x1

    .line 15
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    .line 16
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    .line 17
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    .line 18
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$b;

    invoke-direct {v0}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    .line 19
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Landroid/graphics/Rect;

    .line 20
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    .line 21
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    .line 22
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    .line 23
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->t3(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IIZ)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    const/4 p1, 0x0

    .line 25
    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    const/4 p1, -0x1

    .line 26
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    .line 27
    new-instance p3, Landroid/util/SparseIntArray;

    invoke-direct {p3}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    .line 28
    new-instance p3, Landroid/util/SparseIntArray;

    invoke-direct {p3}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    .line 29
    new-instance p3, Landroidx/recyclerview/widget/GridLayoutManager$b;

    invoke-direct {p3}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    iput-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    .line 30
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Landroid/graphics/Rect;

    .line 31
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    .line 32
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    .line 33
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    .line 34
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->t3(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    .line 4
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    .line 5
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    .line 6
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager$b;

    invoke-direct {v1}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    .line 7
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Landroid/graphics/Rect;

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    .line 9
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    .line 11
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$q;->m0(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$q$d;

    move-result-object p1

    .line 12
    iget p1, p1, Landroidx/recyclerview/widget/RecyclerView$q$d;->b:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->t3(I)V

    return-void
.end method

.method public static S2([III)[I
    .locals 5

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    array-length v1, p0

    add-int/lit8 v2, p1, 0x1

    if-ne v1, v2, :cond_0

    array-length v1, p0

    sub-int/2addr v1, v0

    aget v1, p0, v1

    if-eq v1, p2, :cond_1

    :cond_0
    add-int/lit8 p0, p1, 0x1

    new-array p0, p0, [I

    :cond_1
    const/4 v1, 0x0

    aput v1, p0, v1

    div-int v2, p2, p1

    rem-int/2addr p2, p1

    move v3, v1

    :goto_0
    if-gt v0, p1, :cond_3

    add-int/2addr v1, p2

    if-lez v1, :cond_2

    sub-int v4, p1, v1

    if-ge v4, p2, :cond_2

    add-int/lit8 v4, v2, 0x1

    sub-int/2addr v1, p1

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    add-int/2addr v3, v4

    aput v3, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method


# virtual methods
.method public A(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->V2(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->A(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method

.method public B1(ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->u3()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->X2()V

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->B1(ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method

.method public D1(ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->u3()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->X2()V

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->D1(ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method

.method public G2(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G2(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public H1(Landroid/graphics/Rect;II)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$q;->H1(Landroid/graphics/Rect;II)V

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->j0()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->k0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->h0()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->f0()I

    move-result v1

    invoke-static {p3, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$q;->s(III)I

    move-result p1

    iget-object p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    array-length v1, p3

    sub-int/2addr v1, v3

    aget p3, p3, v1

    add-int/2addr p3, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->g0()I

    move-result v0

    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->s(III)I

    move-result p2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->g0()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->s(III)I

    move-result p2

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    array-length v0, p1

    sub-int/2addr v0, v3

    aget p1, p1, v0

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->f0()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->s(III)I

    move-result p1

    :goto_0
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->G1(II)V

    return-void
.end method

.method public I()Landroidx/recyclerview/widget/RecyclerView$r;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/GridLayoutManager$c;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager$c;-><init>(II)V

    return-object v0
.end method

.method public J(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$r;
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public K(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$r;
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public O0(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)Landroid/view/View;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView$q;->G(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return-object v4

    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget v6, v5, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    iget v5, v5, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    add-int/2addr v5, v6

    invoke-super/range {p0 .. p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_1

    return-object v4

    :cond_1
    move/from16 v7, p2

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;->W1(I)I

    move-result v7

    const/4 v9, 0x1

    if-ne v7, v9, :cond_2

    move v7, v9

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:Z

    const/4 v11, -0x1

    if-eq v7, v10, :cond_3

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v7

    sub-int/2addr v7, v9

    move v10, v11

    move v12, v10

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v7

    move v10, v7

    move v12, v9

    const/4 v7, 0x0

    :goto_1
    iget v13, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v13, v9, :cond_4

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->r2()Z

    move-result v13

    if-eqz v13, :cond_4

    move v13, v9

    goto :goto_2

    :cond_4
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v0, v1, v2, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v14

    move v15, v11

    move/from16 v16, v15

    const/4 v8, 0x0

    const/16 v17, 0x0

    move v11, v7

    move-object v7, v4

    :goto_3
    if-eq v11, v10, :cond_5

    invoke-virtual {v0, v1, v2, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v9

    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, v3, :cond_6

    :cond_5
    :goto_4
    move-object/from16 v21, v4

    move-object/from16 v19, v7

    goto/16 :goto_d

    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v18

    if-eqz v18, :cond_a

    if-eq v9, v14, :cond_a

    if-eqz v4, :cond_7

    goto :goto_4

    :cond_7
    move-object/from16 v18, v3

    move-object/from16 v21, v4

    :cond_8
    move-object/from16 v19, v7

    move/from16 v20, v8

    :cond_9
    move/from16 v4, v16

    move/from16 v7, v17

    goto/16 :goto_b

    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget v2, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    move-object/from16 v18, v3

    iget v3, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    add-int/2addr v3, v2

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_b

    if-ne v2, v6, :cond_b

    if-ne v3, v5, :cond_b

    return-object v1

    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_c

    if-eqz v4, :cond_d

    :cond_c
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-nez v19, :cond_e

    if-nez v7, :cond_e

    :cond_d
    move-object/from16 v21, v4

    :goto_5
    move-object/from16 v19, v7

    move/from16 v20, v8

    move/from16 v4, v16

    move/from16 v7, v17

    goto :goto_9

    :cond_e
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v19

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v20

    move-object/from16 v21, v4

    sub-int v4, v20, v19

    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v19

    if-eqz v19, :cond_11

    if-le v4, v8, :cond_f

    :goto_6
    goto :goto_5

    :cond_f
    if-ne v4, v8, :cond_8

    if-le v2, v15, :cond_10

    const/4 v4, 0x1

    goto :goto_7

    :cond_10
    const/4 v4, 0x0

    :goto_7
    if-ne v13, v4, :cond_8

    goto :goto_6

    :cond_11
    if-nez v21, :cond_8

    move-object/from16 v19, v7

    move/from16 v20, v8

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-virtual {v0, v1, v7, v8}, Landroidx/recyclerview/widget/RecyclerView$q;->D0(Landroid/view/View;ZZ)Z

    move-result v22

    if-eqz v22, :cond_9

    move/from16 v7, v17

    if-le v4, v7, :cond_12

    move/from16 v4, v16

    goto :goto_9

    :cond_12
    if-ne v4, v7, :cond_15

    move/from16 v4, v16

    if-le v2, v4, :cond_13

    goto :goto_8

    :cond_13
    const/4 v8, 0x0

    :goto_8
    if-ne v13, v8, :cond_16

    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v8

    if-eqz v8, :cond_14

    iget v8, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v2, v3, v2

    move/from16 v16, v4

    move/from16 v17, v7

    move v15, v8

    move-object/from16 v7, v19

    move-object v4, v1

    move v8, v2

    goto :goto_c

    :cond_14
    iget v4, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v17, v3, v2

    move-object v7, v1

    move/from16 v16, v4

    :goto_a
    move/from16 v8, v20

    move-object/from16 v4, v21

    goto :goto_c

    :cond_15
    move/from16 v4, v16

    :cond_16
    :goto_b
    move/from16 v16, v4

    move/from16 v17, v7

    move-object/from16 v7, v19

    goto :goto_a

    :goto_c
    add-int/2addr v11, v12

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, v18

    const/4 v9, 0x1

    goto/16 :goto_3

    :goto_d
    if-eqz v21, :cond_17

    return-object v21

    :cond_17
    return-object v19
.end method

.method public final P2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;IZ)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    const/4 p4, 0x1

    move v1, p4

    move p4, p3

    move p3, v0

    goto :goto_0

    :cond_0
    add-int/lit8 p3, p3, -0x1

    const/4 p4, -0x1

    move v1, p4

    :goto_0
    if-eq p3, p4, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aget-object v2, v2, p3

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v2

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->o3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v2

    iput v2, v3, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    iput v0, v3, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    add-int/2addr v0, v2

    add-int/2addr p3, v1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public Q1()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:Landroidx/recyclerview/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q2()V
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$r;->b()I

    move-result v3

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->g()I

    move-result v5

    invoke-virtual {v4, v3, v5}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/GridLayoutManager$c;->f()I

    move-result v2

    invoke-virtual {v4, v3, v2}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public R0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Ly2/p;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ly2/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Ly2/p;)V

    const-class p1, Landroid/widget/GridView;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ly2/p;->l0(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$h;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->e()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_0

    sget-object p1, Ly2/p$a;->V:Ly2/p$a;

    invoke-virtual {p3, p1}, Ly2/p;->b(Ly2/p$a;)V

    :cond_0
    return-void
.end method

.method public final R2(I)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-static {v0, v1, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->S2([III)[I

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    return-void
.end method

.method public S(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public S1(Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/RecyclerView$q$c;)V
    .locals 5

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-ge v2, v3, :cond_0

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c(Landroidx/recyclerview/widget/RecyclerView$b0;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-lez v0, :cond_0

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->g:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-interface {p3, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$q$c;->a(II)V

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/GridLayoutManager$d;->f(I)I

    move-result v3

    sub-int/2addr v0, v3

    iget v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    iget v4, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v3, v4

    iput v3, p2, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final T2()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public U0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroid/view/View;Ly2/p;)V
    .locals 7

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    if-nez v1, :cond_0

    invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$q;->T0(Landroid/view/View;Ly2/p;)V

    return-void

    :cond_0
    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$r;->b()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v1

    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-nez p1, :cond_1

    move v3, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$c;->f()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$c;->g()I

    move-result v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Ly2/p$g;->b(IIIIZZ)Ly2/p$g;

    move-result-object p1

    invoke-virtual {p4, p1}, Ly2/p;->o0(Ljava/lang/Object;)V

    return-void

    :cond_1
    move v3, v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$c;->f()I

    move-result p1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager$c;->g()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    move v3, p1

    invoke-static/range {v1 .. v6}, Ly2/p$g;->b(IIIIZZ)Ly2/p$g;

    move-result-object p1

    invoke-virtual {p4, p1}, Ly2/p;->o0(Ljava/lang/Object;)V

    return-void
.end method

.method public final U2(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y1()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()Z

    move-result v0

    xor-int/lit8 v2, v0, 0x1

    const/4 v3, 0x1

    invoke-virtual {p0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->c2(ZZ)Landroid/view/View;

    move-result-object v2

    xor-int/lit8 v4, v0, 0x1

    invoke-virtual {p0, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b2(ZZ)Landroid/view/View;

    move-result-object v4

    if-eqz v2, :cond_4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v6

    iget v7, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v7

    iget v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v6, v7, v8}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result p1

    sub-int/2addr p1, v3

    iget v8, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v6, p1, v8}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result p1

    add-int/2addr p1, v3

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:Z

    if-eqz v6, :cond_2

    sub-int/2addr p1, v5

    sub-int/2addr p1, v3

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_0
    if-nez v0, :cond_3

    return p1

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/n;->d(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/n;->g(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v5

    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v1, v5, v6}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v1

    iget-object v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v4

    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v5, v4, v6}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v4

    sub-int/2addr v4, v1

    add-int/2addr v4, v3

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/n;->m()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/n;->g(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    add-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    :cond_4
    :goto_1
    return v1
.end method

.method public final V2(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y1()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    invoke-virtual {p0, v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->c2(ZZ)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()Z

    move-result v3

    xor-int/2addr v3, v2

    invoke-virtual {p0, v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->b2(ZZ)Landroid/view/View;

    move-result-object v3

    if-eqz v0, :cond_3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->s2()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result p1

    sub-int/2addr p1, v2

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result p1

    add-int/2addr p1, v2

    return p1

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/n;->d(Landroid/view/View;)I

    move-result v1

    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/n;->g(Landroid/view/View;)I

    move-result v4

    sub-int/2addr v1, v4

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v0

    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v4, v0, v5}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v0

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v3

    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v4, v3, v5}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result v3

    iget-object v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result p1

    sub-int/2addr p1, v2

    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v4, p1, v5}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result p1

    add-int/2addr p1, v2

    sub-int/2addr v3, v0

    add-int/2addr v3, v2

    int-to-float v0, v1

    int-to-float v1, v3

    div-float/2addr v0, v1

    int-to-float p1, p1

    mul-float/2addr v0, p1

    float-to-int p1, v0

    return p1

    :cond_3
    :goto_0
    return v1
.end method

.method public W0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->g()V

    return-void
.end method

.method public final W2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V
    .locals 4

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    iget v1, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v1

    if-eqz p4, :cond_2

    :goto_1
    if-lez v1, :cond_1

    iget p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    if-lez p4, :cond_1

    add-int/lit8 p4, p4, -0x1

    iput p4, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    invoke-virtual {p0, p1, p2, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result p4

    sub-int/2addr p4, v0

    iget v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    :goto_2
    if-ge v0, p4, :cond_3

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v3

    if-le v3, v1, :cond_3

    move v0, v2

    move v1, v3

    goto :goto_2

    :cond_3
    iput v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager$a;->b:I

    return-void
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->g()V

    return-void
.end method

.method public final X2()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    if-eqz v0, :cond_1

    array-length v0, v0

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    return-void
.end method

.method public Y0(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->g()V

    return-void
.end method

.method public final Y2()Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Landroidx/recyclerview/widget/GridLayoutManager$a;->a(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public Z0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->g()V

    return-void
.end method

.method public Z2(I)I
    .locals 7

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-gez v6, :cond_3

    return v0

    :cond_3
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, p1, :cond_6

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    iput v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p1

    :cond_7
    return v0
.end method

.method public a3(I)I
    .locals 6

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    new-instance v1, Ljava/util/TreeMap;

    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gez v5, :cond_2

    return v0

    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ge v4, p1, :cond_5

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p1

    :cond_6
    return v0
.end method

.method public b1(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->g()V

    return-void
.end method

.method public final b3(III)I
    .locals 4

    const/4 v0, 0x1

    sub-int/2addr p3, v0

    :goto_0
    const/4 v1, -0x1

    if-ltz p3, :cond_3

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v2

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v3

    if-ltz v2, :cond_3

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v1, v0, :cond_1

    if-ge v2, p1, :cond_2

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->g3(I)Ljava/util/Set;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iput v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    return p3

    :cond_1
    if-ge v2, p1, :cond_2

    if-ne v3, p2, :cond_2

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    return p3

    :cond_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public c1(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->Q2()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->T2()V

    return-void
.end method

.method public final c3(III)I
    .locals 4

    const/4 v0, 0x1

    add-int/2addr p3, v0

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result v1

    const/4 v2, -0x1

    if-ge p3, v1, :cond_4

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v1

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v3

    if-ltz v1, :cond_4

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v2, v0, :cond_2

    if-le v1, p1, :cond_3

    if-eq v3, p2, :cond_1

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->g3(I)Ljava/util/Set;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_1
    iput v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    return p3

    :cond_2
    if-le v1, p1, :cond_3

    if-ne v3, p2, :cond_3

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    return p3

    :cond_3
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v2
.end method

.method public d1(Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(Landroidx/recyclerview/widget/RecyclerView$b0;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->H(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    const/high16 v1, 0x4000000

    invoke-virtual {p1, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    :cond_0
    return-void
.end method

.method public final d3(III)I
    .locals 4

    const/4 v0, 0x1

    sub-int/2addr p3, v0

    :goto_0
    const/4 v1, -0x1

    if-ltz p3, :cond_5

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v2

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v3

    if-ltz v2, :cond_5

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v1, v0, :cond_3

    if-ne v2, p1, :cond_1

    if-lt v3, p2, :cond_2

    :cond_1
    if-ge v2, p1, :cond_4

    :cond_2
    iput v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    iput v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p3

    :cond_3
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-ge v3, p2, :cond_4

    iput v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p3

    :cond_4
    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v1
.end method

.method public final e3(III)I
    .locals 4

    const/4 v0, 0x1

    add-int/2addr p3, v0

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result v1

    const/4 v2, -0x1

    if-ge p3, v1, :cond_5

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v1

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v3

    if-ltz v1, :cond_5

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v2, v0, :cond_3

    if-ne v1, p1, :cond_1

    if-gt v3, p2, :cond_2

    :cond_1
    if-le v1, p1, :cond_4

    :cond_2
    iput v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    iput v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p3

    :cond_3
    if-le v3, p2, :cond_4

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iput v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    return p3

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v2
.end method

.method public final f3(I)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    return p1
.end method

.method public final g3(I)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v0

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j3(II)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final h3(I)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    return p1
.end method

.method public final i3(I)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v0

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->j3(II)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final j3(II)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v2, v1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->o3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p2

    move v1, p1

    :goto_0
    add-int v2, p1, p2

    if-ge v1, v2, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public k2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;ZZ)Landroid/view/View;
    .locals 9

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result p3

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result p3

    sub-int/2addr p3, v0

    const/4 p4, -0x1

    move v0, p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    move v8, p4

    move p4, p3

    move p3, v8

    :goto_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y1()V

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/n;->m()I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/n;->i()I

    move-result v3

    const/4 v4, 0x0

    move-object v5, v4

    :goto_1
    if-eq p3, p4, :cond_6

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$q;->l0(Landroid/view/View;)I

    move-result v7

    if-ltz v7, :cond_5

    if-ge v7, v1, :cond_5

    invoke-virtual {p0, p1, p2, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_3

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroidx/recyclerview/widget/RecyclerView$r;

    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$r;->d()Z

    move-result v7

    if-eqz v7, :cond_2

    if-nez v5, :cond_5

    move-object v5, v6

    goto :goto_3

    :cond_2
    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/n;->g(Landroid/view/View;)I

    move-result v7

    if-ge v7, v3, :cond_4

    iget-object v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v7, v6}, Landroidx/recyclerview/widget/n;->d(Landroid/view/View;)I

    move-result v7

    if-ge v7, v2, :cond_3

    goto :goto_2

    :cond_3
    return-object v6

    :cond_4
    :goto_2
    if-nez v4, :cond_5

    move-object v4, v6

    :cond_5
    :goto_3
    add-int/2addr p3, v0

    goto :goto_1

    :cond_6
    if-eqz v4, :cond_7

    return-object v4

    :cond_7
    return-object v5
.end method

.method public k3(II)I
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->r2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    sub-int v2, v1, p1

    aget v2, v0, v2

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    aget p1, v0, v1

    sub-int/2addr v2, p1

    return v2

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    add-int/2addr p2, p1

    aget p2, v0, p2

    aget p1, v0, p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public l1(ILandroid/os/Bundle;)Z
    .locals 9

    sget-object v0, Ly2/p$a;->V:Ly2/p$a;

    invoke-virtual {v0}, Ly2/p$a;->b()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne p1, v0, :cond_f

    if-eq p1, v3, :cond_f

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->Y2()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    if-nez p2, :cond_1

    return v2

    :cond_1
    const-string v0, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    sget-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->U:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->m0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$f0;

    move-result-object p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$f0;->j()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->h3(I)I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->f3(I)I

    move-result v4

    if-ltz v0, :cond_e

    if-gez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->q3(I)Z

    move-result v5

    if-eqz v5, :cond_5

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    iput v4, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    :cond_5
    iget v5, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    if-ne v5, v3, :cond_6

    move v5, v0

    :cond_6
    iget v6, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    if-ne v6, v3, :cond_7

    goto :goto_0

    :cond_7
    move v4, v6

    :goto_0
    const/16 v6, 0x42

    const/16 v7, 0x11

    if-eq p2, v7, :cond_b

    const/16 v8, 0x21

    if-eq p2, v8, :cond_a

    if-eq p2, v6, :cond_9

    const/16 v8, 0x82

    if-eq p2, v8, :cond_8

    return v2

    :cond_8
    invoke-virtual {p0, v5, v4, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->c3(III)I

    move-result p1

    goto :goto_1

    :cond_9
    invoke-virtual {p0, v5, v4, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->e3(III)I

    move-result p1

    goto :goto_1

    :cond_a
    invoke-virtual {p0, v5, v4, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->b3(III)I

    move-result p1

    goto :goto_1

    :cond_b
    invoke-virtual {p0, v5, v4, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->d3(III)I

    move-result p1

    :goto_1
    if-ne p1, v3, :cond_d

    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-nez v4, :cond_d

    if-ne p2, v7, :cond_c

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->a3(I)I

    move-result p1

    goto :goto_2

    :cond_c
    if-ne p2, v6, :cond_d

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->Z2(I)I

    move-result p1

    :cond_d
    :goto_2
    if-eq p1, v3, :cond_e

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C1(I)V

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->R:I

    return v1

    :cond_e
    :goto_3
    return v2

    :cond_f
    const v0, 0x1020037

    if-ne p1, v0, :cond_15

    if-eqz p2, :cond_15

    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    if-eq p1, v3, :cond_14

    if-ne p2, v3, :cond_10

    goto :goto_6

    :cond_10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->m:Landroidx/recyclerview/widget/RecyclerView$h;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->e()I

    move-result v0

    move v4, v2

    :goto_4
    if-ge v4, v0, :cond_13

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v6, v5, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$q;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->c:Landroidx/recyclerview/widget/RecyclerView$x;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->j0:Landroidx/recyclerview/widget/RecyclerView$b0;

    invoke-virtual {p0, v7, v6, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v6

    iget v7, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v7, v1, :cond_11

    if-ne v5, p2, :cond_12

    if-ne v6, p1, :cond_12

    goto :goto_5

    :cond_11
    if-ne v5, p1, :cond_12

    if-ne v6, p2, :cond_12

    goto :goto_5

    :cond_12
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_13
    move v4, v3

    :goto_5
    if-le v4, v3, :cond_14

    invoke-virtual {p0, v4, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->D2(II)V

    return v1

    :cond_14
    :goto_6
    return v2

    :cond_15
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->l1(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public l3()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    return v0
.end method

.method public final m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I
    .locals 0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->e()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$x;->f(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Cannot find span size for pre layout position. "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GridLayoutManager"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$d;->b(II)I

    move-result p1

    return p1
.end method

.method public final n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I
    .locals 1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->e()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/GridLayoutManager$d;->c(II)I

    move-result p1

    return p1

    :cond_0
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->N:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v0, :cond_1

    return p2

    :cond_1
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$x;->f(I)I

    move-result p1

    if-ne p1, v0, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GridLayoutManager"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_2
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    iget p3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p2, p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$d;->c(II)I

    move-result p1

    return p1
.end method

.method public o0(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->e()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->m3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final o3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I
    .locals 1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->e()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/GridLayoutManager$d;->f(I)I

    move-result p1

    return p1

    :cond_0
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->M:Landroid/util/SparseIntArray;

    const/4 v0, -0x1

    invoke-virtual {p2, p3, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result p2

    if-eq p2, v0, :cond_1

    return p2

    :cond_1
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView$x;->f(I)I

    move-result p1

    if-ne p1, v0, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GridLayoutManager"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_2
    iget-object p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->f(I)I

    move-result p1

    return p1
.end method

.method public final p3(FI)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->R2(I)V

    return-void
.end method

.method public final q3(I)Z
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->i3(I)Ljava/util/Set;

    move-result-object v0

    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->S:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->g3(I)Ljava/util/Set;

    move-result-object p1

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->T:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public r(Landroidx/recyclerview/widget/RecyclerView$r;)Z
    .locals 0

    instance-of p1, p1, Landroidx/recyclerview/widget/GridLayoutManager$c;

    return p1
.end method

.method public final r3(Landroid/view/View;IZ)V
    .locals 8

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$r;->b:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    iget v4, v0, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    invoke-virtual {p0, v1, v4}, Landroidx/recyclerview/widget/GridLayoutManager;->k3(II)I

    move-result v1

    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_0

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, p2, v3, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/n;->n()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->c0()I

    move-result v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v3, v2, v0, v6}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, p2, v2, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result p2

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/n;->n()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->t0()I

    move-result v2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v2, v3, v0, v6}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result v0

    move v7, v0

    move v0, p2

    move p2, v7

    :goto_0
    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/GridLayoutManager;->s3(Landroid/view/View;IIZ)V

    return-void
.end method

.method public final s3(Landroid/view/View;IIZ)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$r;

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->M1(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$r;)Z

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$q;->K1(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$r;)Z

    move-result p4

    :goto_0
    if-eqz p4, :cond_1

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_1
    return-void
.end method

.method public t2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$c;Landroidx/recyclerview/widget/LinearLayoutManager$b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v6, p4

    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/n;->l()I

    move-result v4

    const/4 v7, 0x1

    const/4 v5, 0x0

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v4, v8, :cond_0

    move v9, v7

    goto :goto_0

    :cond_0
    move v9, v5

    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->O()I

    move-result v10

    if-lez v10, :cond_1

    iget-object v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v11, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    aget v10, v10, v11

    goto :goto_1

    :cond_1
    move v10, v5

    :goto_1
    if-eqz v9, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/GridLayoutManager;->u3()V

    :cond_2
    iget v11, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->e:I

    if-ne v11, v7, :cond_3

    move v11, v7

    goto :goto_2

    :cond_3
    move v11, v5

    :goto_2
    iget v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-nez v11, :cond_4

    iget v12, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {v0, v1, v2, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->n3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v12

    iget v13, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {v0, v1, v2, v13}, Landroidx/recyclerview/widget/GridLayoutManager;->o3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v13

    add-int/2addr v12, v13

    :cond_4
    move v13, v5

    :goto_3
    iget v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-ge v13, v14, :cond_8

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->c(Landroidx/recyclerview/widget/RecyclerView$b0;)Z

    move-result v14

    if-eqz v14, :cond_8

    if-lez v12, :cond_8

    iget v14, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d:I

    invoke-virtual {v0, v1, v2, v14}, Landroidx/recyclerview/widget/GridLayoutManager;->o3(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;I)I

    move-result v15

    iget v8, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-gt v15, v8, :cond_7

    sub-int/2addr v12, v15

    if-gez v12, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager$c;->d(Landroidx/recyclerview/widget/RecyclerView$x;)Landroid/view/View;

    move-result-object v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aput-object v8, v14, v13

    add-int/lit8 v13, v13, 0x1

    const/high16 v8, 0x40000000    # 2.0f

    goto :goto_3

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Item at position "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " requires "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " spans but GridLayoutManager has only "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " spans."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_4
    if-nez v13, :cond_9

    iput-boolean v7, v6, Landroidx/recyclerview/widget/LinearLayoutManager$b;->b:Z

    return-void

    :cond_9
    invoke-virtual {v0, v1, v2, v13, v11}, Landroidx/recyclerview/widget/GridLayoutManager;->P2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;IZ)V

    const/4 v1, 0x0

    move v2, v5

    move v8, v2

    :goto_5
    if-ge v2, v13, :cond_f

    iget-object v12, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aget-object v12, v12, v2

    iget-object v14, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->l:Ljava/util/List;

    if-nez v14, :cond_b

    if-eqz v11, :cond_a

    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView$q;->i(Landroid/view/View;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0, v12, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->j(Landroid/view/View;I)V

    goto :goto_6

    :cond_b
    if-eqz v11, :cond_c

    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView$q;->g(Landroid/view/View;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v0, v12, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->h(Landroid/view/View;I)V

    :goto_6
    iget-object v14, v0, Landroidx/recyclerview/widget/GridLayoutManager;->P:Landroid/graphics/Rect;

    invoke-virtual {v0, v12, v14}, Landroidx/recyclerview/widget/RecyclerView$q;->o(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v0, v12, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;->r3(Landroid/view/View;IZ)V

    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v14, v12}, Landroidx/recyclerview/widget/n;->e(Landroid/view/View;)I

    move-result v14

    if-le v14, v8, :cond_d

    move v8, v14

    :cond_d
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    check-cast v14, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/n;->f(Landroid/view/View;)I

    move-result v12

    int-to-float v12, v12

    const/high16 v15, 0x3f800000    # 1.0f

    mul-float/2addr v12, v15

    iget v14, v14, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    int-to-float v14, v14

    div-float/2addr v12, v14

    cmpl-float v14, v12, v1

    if-lez v14, :cond_e

    move v1, v12

    :cond_e
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_f
    if-eqz v9, :cond_11

    invoke-virtual {v0, v1, v10}, Landroidx/recyclerview/widget/GridLayoutManager;->p3(FI)V

    move v1, v5

    move v8, v1

    :goto_7
    if-ge v1, v13, :cond_11

    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aget-object v2, v2, v1

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {v0, v2, v4, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->r3(Landroid/view/View;IZ)V

    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/n;->e(Landroid/view/View;)I

    move-result v2

    if-le v2, v8, :cond_10

    move v8, v2

    :cond_10
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_11
    move v1, v5

    :goto_8
    if-ge v1, v13, :cond_14

    iget-object v2, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aget-object v2, v2, v1

    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/n;->e(Landroid/view/View;)I

    move-result v4

    if-eq v4, v8, :cond_13

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget-object v9, v4, Landroidx/recyclerview/widget/RecyclerView$r;->b:Landroid/graphics/Rect;

    iget v10, v9, Landroid/graphics/Rect;->top:I

    iget v11, v9, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v10, v11

    iget v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v10, v11

    iget v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v10, v11

    iget v11, v9, Landroid/graphics/Rect;->left:I

    iget v9, v9, Landroid/graphics/Rect;->right:I

    add-int/2addr v11, v9

    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v11, v9

    iget v9, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v11, v9

    iget v9, v4, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    iget v12, v4, Landroidx/recyclerview/widget/GridLayoutManager$c;->f:I

    invoke-virtual {v0, v9, v12}, Landroidx/recyclerview/widget/GridLayoutManager;->k3(II)I

    move-result v9

    iget v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v12, v7, :cond_12

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v9, v12, v11, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result v4

    sub-int v9, v8, v10

    invoke-static {v9, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    goto :goto_9

    :cond_12
    const/high16 v12, 0x40000000    # 2.0f

    sub-int v11, v8, v11

    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v9, v12, v10, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$q;->P(IIIIZ)I

    move-result v9

    move v4, v11

    :goto_9
    invoke-virtual {v0, v2, v4, v9, v7}, Landroidx/recyclerview/widget/GridLayoutManager;->s3(Landroid/view/View;IIZ)V

    goto :goto_a

    :cond_13
    const/high16 v12, 0x40000000    # 2.0f

    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_14
    iput v8, v6, Landroidx/recyclerview/widget/LinearLayoutManager$b;->a:I

    iget v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    const/4 v2, -0x1

    if-ne v1, v7, :cond_16

    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    if-ne v1, v2, :cond_15

    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    sub-int v2, v1, v8

    :goto_b
    move v4, v2

    move v2, v5

    move v3, v2

    goto :goto_d

    :cond_15
    iget v2, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    add-int v1, v2, v8

    goto :goto_b

    :cond_16
    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->f:I

    if-ne v1, v2, :cond_17

    iget v1, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    sub-int v2, v1, v8

    :goto_c
    move v3, v2

    move v4, v5

    move v2, v1

    move v1, v4

    goto :goto_d

    :cond_17
    iget v2, v3, Landroidx/recyclerview/widget/LinearLayoutManager$c;->b:I

    add-int v1, v2, v8

    goto :goto_c

    :goto_d
    move v8, v5

    :goto_e
    if-ge v8, v13, :cond_1c

    iget-object v5, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    aget-object v5, v5, v8

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/GridLayoutManager$c;

    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:I

    if-ne v10, v7, :cond_19

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->r2()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v2

    iget-object v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v10, v0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    iget v11, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    sub-int/2addr v10, v11

    aget v3, v3, v10

    add-int/2addr v2, v3

    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/n;->f(Landroid/view/View;)I

    move-result v3

    sub-int v3, v2, v3

    :goto_f
    move-object/from16 v16, v5

    move v5, v1

    move-object/from16 v1, v16

    move/from16 v16, v4

    move v4, v2

    move v2, v3

    move/from16 v3, v16

    goto :goto_10

    :cond_18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v2

    iget-object v3, v0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v10, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    aget v3, v3, v10

    add-int/2addr v3, v2

    iget-object v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/n;->f(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v3

    goto :goto_f

    :cond_19
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->k0()I

    move-result v1

    iget-object v4, v0, Landroidx/recyclerview/widget/GridLayoutManager;->K:[I

    iget v10, v9, Landroidx/recyclerview/widget/GridLayoutManager$c;->e:I

    aget v4, v4, v10

    add-int/2addr v4, v1

    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Landroidx/recyclerview/widget/n;

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/n;->f(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v4

    goto :goto_f

    :goto_10
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$q;->E0(Landroid/view/View;IIII)V

    move/from16 v16, v5

    move-object v5, v1

    move/from16 v1, v16

    move/from16 v16, v3

    move v3, v2

    move v2, v4

    move/from16 v4, v16

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$r;->d()Z

    move-result v10

    if-nez v10, :cond_1a

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$r;->c()Z

    move-result v9

    if-eqz v9, :cond_1b

    :cond_1a
    iput-boolean v7, v6, Landroidx/recyclerview/widget/LinearLayoutManager$b;->c:Z

    :cond_1b
    iget-boolean v9, v6, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z

    invoke-virtual {v5}, Landroid/view/View;->hasFocusable()Z

    move-result v5

    or-int/2addr v5, v9

    iput-boolean v5, v6, Landroidx/recyclerview/widget/LinearLayoutManager$b;->d:Z

    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_e

    :cond_1c
    iget-object v1, v0, Landroidx/recyclerview/widget/GridLayoutManager;->L:[Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public t3(I)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->I:Z

    if-lt p1, v0, :cond_1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->J:I

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->O:Landroidx/recyclerview/widget/GridLayoutManager$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/GridLayoutManager$d;->h()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->y1()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Span count should be at least 1. Provided "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final u3()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q2()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->s0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->j0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->b0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->h0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->k0()I

    move-result v1

    goto :goto_0

    :goto_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->R2(I)V

    return-void
.end method

.method public v2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->v2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->u3()V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->b()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$b0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/GridLayoutManager;->W2(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/LinearLayoutManager$a;I)V

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->X2()V

    return-void
.end method

.method public w(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->U2(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->w(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method

.method public x(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->V2(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->x(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method

.method public z(Landroidx/recyclerview/widget/RecyclerView$b0;)I
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->U2(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->z(Landroidx/recyclerview/widget/RecyclerView$b0;)I

    move-result p1

    return p1
.end method
