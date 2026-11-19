.class public Lp5/d$d;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Lp5/q$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V
    .locals 1

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp5/d$d;->d:Z

    iput-object p1, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    iput-object p2, p0, Lp5/d$d;->b:Landroid/graphics/Matrix;

    iput-object p3, p0, Lp5/d$d;->c:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    sget v1, Lp5/l;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    invoke-static {v1, v0}, Lp5/h;->a(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    sget v1, Lp5/l;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public c(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public final d(Landroid/graphics/Matrix;)V
    .locals 2

    iget-object v0, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    sget v1, Lp5/l;->d:I

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lp5/d$d;->a:Landroid/widget/ImageView;

    iget-object v0, p0, Lp5/d$d;->c:Landroid/graphics/Matrix;

    invoke-static {p1, v0}, Lp5/h;->a(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public f(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean p1, p0, Lp5/d$d;->d:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lp5/d$d;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, Lp5/d$d;->d(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public h(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lp5/d$d;->a()V

    return-void
.end method

.method public k(Lp5/q;)V
    .locals 0
    .param p1    # Lp5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lp5/d$d;->d:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-boolean p2, p0, Lp5/d$d;->d:Z

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 0

    check-cast p1, Landroid/animation/ObjectAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Matrix;

    invoke-virtual {p0, p1}, Lp5/d$d;->d(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 0

    invoke-virtual {p0}, Lp5/d$d;->a()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lp5/d$d;->d:Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lp5/d$d;->d:Z

    return-void
.end method
