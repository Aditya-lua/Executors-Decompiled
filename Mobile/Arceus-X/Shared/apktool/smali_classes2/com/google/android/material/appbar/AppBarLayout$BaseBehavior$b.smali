.class public Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;
.super Landroidx/core/view/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->Y(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcom/google/android/material/appbar/AppBarLayout;

.field public final synthetic e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public final synthetic f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    iput-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    iput-object p3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Ly2/p;)V
    .locals 3
    .param p2    # Ly2/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;Ly2/p;)V

    const-class p1, Landroid/widget/ScrollView;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ly2/p;->l0(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-static {p1, v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->V(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-static {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->W(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Lcom/google/android/material/appbar/AppBarLayout;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    invoke-virtual {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->Q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {v1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    move-result v1

    neg-int v1, v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_3

    sget-object v0, Ly2/p$a;->q:Ly2/p$a;

    invoke-virtual {p2, v0}, Ly2/p;->b(Ly2/p$a;)V

    invoke-virtual {p2, v2}, Ly2/p;->G0(Z)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    invoke-virtual {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->Q()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I

    move-result p1

    neg-int p1, p1

    if-eqz p1, :cond_5

    sget-object p1, Ly2/p$a;->r:Ly2/p$a;

    invoke-virtual {p2, p1}, Ly2/p;->b(Ly2/p$a;)V

    invoke-virtual {p2, v2}, Ly2/p;->G0(Z)V

    return-void

    :cond_4
    sget-object p1, Ly2/p$a;->r:Ly2/p$a;

    invoke-virtual {p2, p1}, Ly2/p;->b(Ly2/p$a;)V

    invoke-virtual {p2, v2}, Ly2/p;->G0(Z)V

    :cond_5
    :goto_0
    return-void
.end method

.method public j(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 11

    const/16 v0, 0x1000

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p2, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1, v2}, Lcom/google/android/material/appbar/AppBarLayout;->setExpanded(Z)V

    return v1

    :cond_0
    const/16 v0, 0x2000

    if-ne p2, v0, :cond_3

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->Q()I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    iget-object p2, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-static {p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->V(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    move-result-object v6

    const/4 p1, -0x1

    invoke-virtual {v6, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I

    move-result p1

    neg-int v8, p1

    if-eqz v8, :cond_2

    iget-object v3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->f:Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    iget-object v4, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->e:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v5, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    filled-new-array {v2, v2}, [I

    move-result-object v9

    const/4 v10, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v10}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->q0(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;II[II)V

    return v1

    :cond_1
    iget-object p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->d:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->setExpanded(Z)V

    return v1

    :cond_2
    return v2

    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/a;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
