.class public Lb3/d;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lb3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb3/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lb3/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb3/d;->a:Ljava/util/List;

    invoke-virtual {p0, p2}, Lb3/d;->setProtections(Ljava/util/List;)V

    return-void
.end method

.method private getOrInstallSystemBarStateMonitor()Lb3/g;
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lj2/e;->R:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lb3/g;

    if-eqz v3, :cond_0

    check-cast v2, Lb3/g;

    return-object v2

    :cond_0
    new-instance v2, Lb3/g;

    invoke-direct {v2, v0}, Lb3/g;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object v2
.end method


# virtual methods
.method public final a(Landroid/content/Context;ILb3/b;)V
    .locals 6

    invoke-virtual {p3}, Lb3/b;->c()Lb3/b$a;

    move-result-object v0

    invoke-virtual {p3}, Lb3/b;->e()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, -0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    if-eq v1, v3, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lb3/b$a;->m()I

    move-result p3

    const/16 v1, 0x50

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unexpected side: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lb3/b;->e()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0}, Lb3/b$a;->q()I

    move-result p3

    const/4 v1, 0x5

    :goto_0
    move v5, v4

    move v4, p3

    move p3, v5

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lb3/b$a;->m()I

    move-result p3

    const/16 v1, 0x30

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lb3/b$a;->q()I

    move-result p3

    const/4 v1, 0x3

    goto :goto_0

    :goto_1
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, p3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0}, Lb3/b$a;->n()Landroidx/core/graphics/Insets;

    move-result-object p3

    iget v1, p3, Landroidx/core/graphics/Insets;->left:I

    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v1, p3, Landroidx/core/graphics/Insets;->top:I

    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget v1, p3, Landroidx/core/graphics/Insets;->right:I

    iput v1, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget p3, p3, Landroidx/core/graphics/Insets;->bottom:I

    iput p3, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    new-instance p3, Landroid/view/View;

    invoke-direct {p3, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object p1, Lb3/d;->c:Ljava/lang/Object;

    invoke-virtual {p3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lb3/b$a;->o()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {v0}, Lb3/b$a;->p()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setTranslationY(F)V

    invoke-virtual {v0}, Lb3/b$a;->k()F

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v0}, Lb3/b$a;->r()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 v3, 0x0

    :cond_4
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lb3/b$a;->l()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Lb3/d$a;

    invoke-direct {p1, p0, v2, p3}, Lb3/d$a;-><init>(Lb3/d;Landroid/widget/FrameLayout$LayoutParams;Landroid/view/View;)V

    invoke-virtual {v0, p1}, Lb3/b$a;->t(Lb3/b$a$a;)V

    invoke-virtual {p0, p3, p2, v2}, Lb3/d;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lb3/d;->c:Ljava/lang/Object;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lb3/d;->b:Lb3/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb3/c;->i()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int/2addr v1, v0

    if-gt p2, v1, :cond_1

    if-gez p2, :cond_2

    :cond_1
    move p2, v1

    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lb3/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lb3/d;->getOrInstallSystemBarStateMonitor()Lb3/g;

    move-result-object v0

    new-instance v1, Lb3/c;

    iget-object v2, p0, Lb3/d;->a:Ljava/util/List;

    invoke-direct {v1, v0, v2}, Lb3/c;-><init>(Lb3/g;Ljava/util/List;)V

    iput-object v1, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v1}, Lb3/c;->i()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v3, v2}, Lb3/c;->h(I)Lb3/b;

    move-result-object v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    add-int v5, v2, v0

    invoke-virtual {p0, v4, v5, v3}, Lb3/d;->a(Landroid/content/Context;ILb3/b;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lj2/e;->R:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lb3/g;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    check-cast v2, Lb3/g;

    invoke-virtual {v2}, Lb3/g;->k()Z

    move-result v3

    if-eqz v3, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {v2}, Lb3/g;->h()V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lb3/d;->b:Lb3/c;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v1}, Lb3/c;->i()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v1}, Lb3/c;->i()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->removeViews(II)V

    iget-object v0, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v0}, Lb3/c;->i()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v3, v1}, Lb3/c;->h(I)Lb3/b;

    move-result-object v3

    invoke-virtual {v3}, Lb3/b;->c()Lb3/b$a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lb3/b$a;->t(Lb3/b$a$a;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb3/d;->b:Lb3/c;

    invoke-virtual {v0}, Lb3/c;->g()V

    iput-object v2, p0, Lb3/d;->b:Lb3/c;

    :cond_1
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lb3/d;->b:Lb3/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb3/d;->d()V

    :cond_0
    invoke-virtual {p0}, Lb3/d;->b()V

    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lb3/d;->d()V

    invoke-virtual {p0}, Lb3/d;->c()V

    return-void
.end method

.method public setProtections(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb3/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb3/d;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lb3/d;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lb3/d;->d()V

    invoke-virtual {p0}, Lb3/d;->b()V

    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    :cond_0
    return-void
.end method
