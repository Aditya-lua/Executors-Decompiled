.class public Lp1/f0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/f1$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp1/f0;->f(Landroid/view/Window;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:F

.field public b:Landroid/animation/ValueAnimator;

.field public final synthetic c:Lp1/f0;


# direct methods
.method public constructor <init>(Lp1/f0;)V
    .locals 0

    iput-object p1, p0, Lp1/f0$a;->c:Lp1/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLg0/f1$k;)V
    .locals 0

    const-string p1, "ScreenFlashView"

    const-string p2, "ScreenFlash#apply"

    invoke-static {p1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lp1/f0$a;->c:Lp1/f0;

    invoke-static {p1}, Lp1/f0;->b(Lp1/f0;)F

    move-result p1

    iput p1, p0, Lp1/f0$a;->a:F

    iget-object p1, p0, Lp1/f0$a;->c:Lp1/f0;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lp1/f0;->c(Lp1/f0;F)V

    iget-object p1, p0, Lp1/f0$a;->b:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object p1, p0, Lp1/f0$a;->c:Lp1/f0;

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lp1/e0;

    invoke-direct {p2, p3}, Lp1/e0;-><init>(Lg0/f1$k;)V

    invoke-static {p1, p2}, Lp1/f0;->d(Lp1/f0;Ljava/lang/Runnable;)Landroid/animation/ValueAnimator;

    move-result-object p1

    iput-object p1, p0, Lp1/f0$a;->b:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public clear()V
    .locals 2

    const-string v0, "ScreenFlashView"

    const-string v1, "ScreenFlash#clear"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lp1/f0$a;->b:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/f0$a;->b:Landroid/animation/ValueAnimator;

    :cond_0
    iget-object v0, p0, Lp1/f0$a;->c:Lp1/f0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lp1/f0$a;->c:Lp1/f0;

    iget v1, p0, Lp1/f0$a;->a:F

    invoke-static {v0, v1}, Lp1/f0;->c(Lp1/f0;F)V

    return-void
.end method
