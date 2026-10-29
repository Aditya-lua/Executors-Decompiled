.class public Lkc/c;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public a:Lkc/d;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lkc/c;->b:I

    .line 3
    iput v0, p0, Lkc/c;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lkc/c;->b:I

    .line 6
    iput p1, p0, Lkc/c;->c:I

    return-void
.end method


# virtual methods
.method public I()I
    .locals 1

    iget-object v0, p0, Lkc/c;->a:Lkc/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkc/d;->b()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public J(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0
    .param p1    # Landroidx/coordinatorlayout/widget/CoordinatorLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)V"
        }
    .end annotation

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->I(Landroid/view/View;I)V

    return-void
.end method

.method public K(I)Z
    .locals 1

    iget-object v0, p0, Lkc/c;->a:Lkc/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkc/d;->e(I)Z

    move-result p1

    return p1

    :cond_0
    iput p1, p0, Lkc/c;->b:I

    const/4 p1, 0x0

    return p1
.end method

.method public p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 0
    .param p1    # Landroidx/coordinatorlayout/widget/CoordinatorLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lkc/c;->J(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    iget-object p1, p0, Lkc/c;->a:Lkc/d;

    if-nez p1, :cond_0

    new-instance p1, Lkc/d;

    invoke-direct {p1, p2}, Lkc/d;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lkc/c;->a:Lkc/d;

    :cond_0
    iget-object p1, p0, Lkc/c;->a:Lkc/d;

    invoke-virtual {p1}, Lkc/d;->c()V

    iget-object p1, p0, Lkc/c;->a:Lkc/d;

    invoke-virtual {p1}, Lkc/d;->a()V

    iget p1, p0, Lkc/c;->b:I

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-object p3, p0, Lkc/c;->a:Lkc/d;

    invoke-virtual {p3, p1}, Lkc/d;->e(I)Z

    iput p2, p0, Lkc/c;->b:I

    :cond_1
    iget p1, p0, Lkc/c;->c:I

    if-eqz p1, :cond_2

    iget-object p3, p0, Lkc/c;->a:Lkc/d;

    invoke-virtual {p3, p1}, Lkc/d;->d(I)Z

    iput p2, p0, Lkc/c;->c:I

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
