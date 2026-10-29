.class public final synthetic Liq/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq/p;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    iput-object p2, p0, Liq/p;->b:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    iput-object p3, p0, Liq/p;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, Liq/p;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;

    iget-object v1, p0, Liq/p;->b:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    iget-object v2, p0, Liq/p;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-static {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V

    return-void
.end method
