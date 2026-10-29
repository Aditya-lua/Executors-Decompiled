.class public final synthetic Liq/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/r;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Liq/r;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V

    return-void
.end method
