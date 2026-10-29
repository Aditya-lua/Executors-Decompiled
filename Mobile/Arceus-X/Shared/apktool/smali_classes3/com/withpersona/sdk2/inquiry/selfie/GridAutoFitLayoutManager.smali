.class public final Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u000c\u0010\n\u001a\u0008\u0018\u00010\u0008R\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "Landroid/content/Context;",
        "context",
        "",
        "columnWidth",
        "<init>",
        "(Landroid/content/Context;I)V",
        "Landroidx/recyclerview/widget/RecyclerView$x;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recycler",
        "Landroidx/recyclerview/widget/RecyclerView$b0;",
        "state",
        "",
        "c1",
        "(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V",
        "v3",
        "(Landroid/content/Context;I)I",
        "newColumnWidth",
        "w3",
        "(I)V",
        "V",
        "I",
        "",
        "W",
        "Z",
        "columnWidthChanged",
        "X",
        "lastTotalSpace",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public V:I

.field public W:Z

.field public X:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    iput-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->W:Z

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->v3(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->w3(I)V

    return-void
.end method


# virtual methods
.method public c1(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$x;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/RecyclerView$b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->q2()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->s0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->j0()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v2

    :goto_0
    sub-int/2addr v0, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->b0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->k0()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$q;->h0()I

    move-result v2

    goto :goto_0

    :goto_1
    iget-boolean v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->W:Z

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->V:I

    if-gtz v2, :cond_2

    :cond_1
    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->X:I

    if-eq v0, v2, :cond_3

    :cond_2
    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->V:I

    div-int v2, v0, v2

    invoke-static {v1, v2}, Lkotlin/ranges/d;->c(II)I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;->t3(I)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->W:Z

    iput v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->X:I

    :cond_3
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->c1(Landroidx/recyclerview/widget/RecyclerView$x;Landroidx/recyclerview/widget/RecyclerView$b0;)V

    return-void
.end method

.method public final v3(Landroid/content/Context;I)I
    .locals 1

    if-gtz p2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/4 p2, 0x1

    const/high16 v0, 0x42400000    # 48.0f

    invoke-static {p2, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1

    :cond_0
    return p2
.end method

.method public final w3(I)V
    .locals 1

    if-lez p1, :cond_0

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->V:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->V:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;->W:Z

    :cond_0
    return-void
.end method
