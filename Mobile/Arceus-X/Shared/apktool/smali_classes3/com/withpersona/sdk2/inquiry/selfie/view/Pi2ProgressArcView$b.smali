.class public final Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b",
        "Landroid/animation/ValueAnimator$AnimatorUpdateListener;",
        "Landroid/animation/ValueAnimator;",
        "animator",
        "",
        "onAnimationUpdate",
        "(Landroid/animation/ValueAnimator;)V",
        "",
        "a",
        "F",
        "getLastProgress",
        "()F",
        "setLastProgress",
        "(F)V",
        "lastProgress",
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
.field public a:F

.field public final synthetic b:Landroid/animation/ValueAnimator;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;


# direct methods
.method public constructor <init>(Landroid/animation/ValueAnimator;Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->b:Landroid/animation/ValueAnimator;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->b:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->a:F

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)F

    move-result v2

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)F

    move-result v4

    add-float/2addr v4, v1

    const/16 v1, 0x168

    int-to-float v1, v1

    rem-float/2addr v4, v1

    invoke-static {v3, v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->c(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;F)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)F

    move-result v1

    cmpl-float v1, v2, v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->c(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;F)V

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iput v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->a:F

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
