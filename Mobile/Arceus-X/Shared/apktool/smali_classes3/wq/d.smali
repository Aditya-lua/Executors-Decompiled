.class public final Lwq/d;
.super Landroidx/recyclerview/widget/RecyclerView$p;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0011\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u001a\u001a\u0004\u0008 \u0010\u001c\"\u0004\u0008!\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lwq/d;",
        "Landroidx/recyclerview/widget/RecyclerView$p;",
        "",
        "space",
        "",
        "spaceAboveFirstAndBelowLastItem",
        "horizontalSpaceOnFirstAndLastItem",
        "hasSameSpans",
        "<init>",
        "(IZZZ)V",
        "Landroid/graphics/Rect;",
        "outRect",
        "Landroid/view/View;",
        "view",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "parent",
        "Landroidx/recyclerview/widget/RecyclerView$b0;",
        "state",
        "",
        "e",
        "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;)V",
        "a",
        "Z",
        "b",
        "c",
        "d",
        "I",
        "getVerticalSpace",
        "()I",
        "setVerticalSpace",
        "(I)V",
        "verticalSpace",
        "getHorizontalSpace",
        "setHorizontalSpace",
        "horizontalSpace",
        "shared_release"
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
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(IZZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>()V

    .line 3
    iput-boolean p2, p0, Lwq/d;->a:Z

    .line 4
    iput-boolean p3, p0, Lwq/d;->b:Z

    .line 5
    iput-boolean p4, p0, Lwq/d;->c:Z

    .line 6
    iput p1, p0, Lwq/d;->d:I

    .line 7
    iput p1, p0, Lwq/d;->e:I

    return-void
.end method

.method public synthetic constructor <init>(IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 1
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lwq/d;-><init>(IZZZ)V

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 4
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$q;

    move-result-object p4

    instance-of v0, p4, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz v0, :cond_0

    check-cast p4, Landroidx/recyclerview/widget/GridLayoutManager;

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    if-nez p4, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p4}, Landroidx/recyclerview/widget/GridLayoutManager;->l3()I

    move-result p4

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$r;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$r;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$r;->b()I

    move-result v0

    :cond_2
    if-ne v0, v1, :cond_3

    goto :goto_3

    :cond_3
    rem-int p2, v0, p4

    iget-boolean v1, p0, Lwq/d;->c:Z

    if-eqz v1, :cond_4

    iget v2, p0, Lwq/d;->d:I

    iput v2, p1, Landroid/graphics/Rect;->top:I

    :cond_4
    const/4 v2, 0x0

    iput v2, p1, Landroid/graphics/Rect;->bottom:I

    iget-boolean v3, p0, Lwq/d;->a:Z

    if-nez v3, :cond_5

    if-ge v0, p4, :cond_7

    iput v2, p1, Landroid/graphics/Rect;->top:I

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_7

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$h;->e()I

    move-result p3

    goto :goto_1

    :cond_6
    move p3, v2

    :goto_1
    add-int/lit8 p3, p3, -0x1

    div-int/2addr p3, p4

    div-int/2addr v0, p4

    if-ne p3, v0, :cond_7

    iget p3, p0, Lwq/d;->d:I

    iput p3, p1, Landroid/graphics/Rect;->bottom:I

    :cond_7
    :goto_2
    iget p3, p0, Lwq/d;->e:I

    div-int/lit8 v0, p3, 0x2

    iput v0, p1, Landroid/graphics/Rect;->left:I

    div-int/lit8 p3, p3, 0x2

    iput p3, p1, Landroid/graphics/Rect;->right:I

    if-nez p2, :cond_8

    iget-boolean p3, p0, Lwq/d;->b:Z

    if-nez p3, :cond_8

    iget-boolean p3, p0, Lwq/d;->c:Z

    if-eqz p3, :cond_8

    iput v2, p1, Landroid/graphics/Rect;->left:I

    :cond_8
    add-int/lit8 p4, p4, -0x1

    if-ne p2, p4, :cond_9

    iget-boolean p2, p0, Lwq/d;->b:Z

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lwq/d;->c:Z

    if-eqz p2, :cond_9

    iput v2, p1, Landroid/graphics/Rect;->right:I

    :cond_9
    :goto_3
    return-void
.end method
