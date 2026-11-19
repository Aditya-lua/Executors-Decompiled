.class public final Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->e()V
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
        "com/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d",
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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->b:Landroid/animation/ValueAnimator;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->b:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->a:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;)F

    move-result v2

    add-float/2addr v2, v0

    const/16 v0, 0x168

    int-to-float v0, v0

    rem-float/2addr v2, v0

    invoke-static {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->c(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;F)V

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->a:F

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView$d;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
