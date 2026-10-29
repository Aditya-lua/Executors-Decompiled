.class public Lo5/f0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Lo5/q$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Landroid/view/View;

.field public c:[I

.field public d:F

.field public e:F

.field public final f:F

.field public final g:F

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;FF)V
    .locals 0

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iput-object p2, p0, Lo5/f0$a;->a:Landroid/view/View;

    iput p3, p0, Lo5/f0$a;->f:F

    iput p4, p0, Lo5/f0$a;->g:F

    sget p1, Lo5/l;->f:I

    invoke-virtual {p2, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    iput-object p3, p0, Lo5/f0$a;->c:[I

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo5/f0$a;->h:Z

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->f:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->g:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public b(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->d:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->e:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lo5/f0$a;->c:[I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lo5/f0$a;->c:[I

    :cond_0
    iget-object v0, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget-object v1, p0, Lo5/f0$a;->c:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Lo5/f0$a;->a:Landroid/view/View;

    sget v1, Lo5/l;->f:I

    iget-object v2, p0, Lo5/f0$a;->c:[I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public d(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lo5/f0$a;->c()V

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result p1

    iput p1, p0, Lo5/f0$a;->d:F

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    iput p1, p0, Lo5/f0$a;->e:F

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->f:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->g:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public g(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public k(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo5/f0$a;->l(Lo5/q;Z)V

    return-void
.end method

.method public l(Lo5/q;Z)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean p1, p0, Lo5/f0$a;->h:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lo5/f0$a;->a:Landroid/view/View;

    sget p2, Lo5/l;->f:I

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo5/f0$a;->h:Z

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->f:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget v0, p0, Lo5/f0$a;->g:F

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Lo5/f0$a;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0
    .param p1    # Landroid/animation/Animator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p2, :cond_0

    .line 1
    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget p2, p0, Lo5/f0$a;->f:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 2
    iget-object p1, p0, Lo5/f0$a;->b:Landroid/view/View;

    iget p2, p0, Lo5/f0$a;->g:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    return-void
.end method
