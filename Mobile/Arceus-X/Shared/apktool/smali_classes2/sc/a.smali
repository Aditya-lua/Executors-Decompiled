.class public final Lsc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lsc/d;FFF)Landroid/animation/Animator;
    .locals 3
    .param p0    # Lsc/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lsc/d$c;->a:Landroid/util/Property;

    sget-object v1, Lsc/d$b;->b:Landroid/animation/TypeEvaluator;

    new-instance v2, Lsc/d$e;

    invoke-direct {v2, p1, p2, p3}, Lsc/d$e;-><init>(FFF)V

    filled-new-array {v2}, [Lsc/d$e;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-interface {p0}, Lsc/d;->getRevealInfo()Lsc/d$e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, v1, Lsc/d$e;->c:F

    check-cast p0, Landroid/view/View;

    float-to-int p1, p1

    float-to-int p2, p2

    invoke-static {p0, p1, p2, v1, p3}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    move-result-object p0

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 p2, 0x2

    new-array p2, p2, [Landroid/animation/Animator;

    const/4 p3, 0x0

    aput-object v0, p2, p3

    const/4 p3, 0x1

    aput-object p0, p2, p3

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Caller must set a non-null RevealInfo before calling this."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(Lsc/d;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # Lsc/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lsc/a$a;

    invoke-direct {v0, p0}, Lsc/a$a;-><init>(Lsc/d;)V

    return-object v0
.end method
