.class public Landroidx/recyclerview/widget/RecyclerView$q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/t$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView$q;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$q;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->N(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$r;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->V(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr p1, v0

    return p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->i0()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$q;->s0()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$q;->j0()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public e(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$r;

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$q$a;->a:Landroidx/recyclerview/widget/RecyclerView$q;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$q;->Y(Landroid/view/View;)I

    move-result p1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method
