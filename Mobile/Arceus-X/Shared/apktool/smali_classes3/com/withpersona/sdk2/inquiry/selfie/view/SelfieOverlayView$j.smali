.class public final Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006\u00a8\u0006\u000b\u00b8\u0006\n"
    }
    d2 = {
        "androidx/core/animation/AnimatorKt$addListener$listener$1",
        "Landroid/animation/Animator$AnimatorListener;",
        "Landroid/animation/Animator;",
        "animator",
        "",
        "onAnimationRepeat",
        "(Landroid/animation/Animator;)V",
        "onAnimationEnd",
        "onAnimationCancel",
        "onAnimationStart",
        "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$1",
        "core-ktx_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->b()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->k(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->b()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "animator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
