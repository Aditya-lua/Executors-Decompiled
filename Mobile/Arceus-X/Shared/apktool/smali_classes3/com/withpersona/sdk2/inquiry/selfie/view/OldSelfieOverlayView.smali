.class public final Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010!\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001:\u0001_B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0010\u0008\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00152\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u000c2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0017\u00a2\u0006\u0004\u0008\"\u0010#J-\u0010&\u001a\u00020\u000c*\u00020$2\u0008\u0008\u0001\u0010%\u001a\u00020\u00062\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J#\u0010(\u001a\u00020\u000c*\u00020$2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u001d\u0010-\u001a\u00020,*\u00020\n2\u0008\u0008\u0002\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u001d\u0010/\u001a\u00020,*\u00020\n2\u0008\u0008\u0002\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008/\u0010.J\u001d\u00103\u001a\u00020\u000c*\u0002002\u0008\u00102\u001a\u0004\u0018\u000101H\u0002\u00a2\u0006\u0004\u00083\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u00085\u00106R\u0014\u00109\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001d\u0010>\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u001d\u0010A\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010;\u001a\u0004\u0008@\u0010=R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010F\u001a\u00020\u00068\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010CR$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u0010I\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR$\u0010R\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008O\u0010I\u001a\u0004\u0008P\u0010K\"\u0004\u0008Q\u0010MR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR \u0010X\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00170U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR \u0010Y\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u00170U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010TR\u0018\u0010^\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]\u00a8\u0006`"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroid/view/View;",
        "previewView",
        "",
        "setPreviewView",
        "(Landroid/view/View;)V",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;",
        "styles",
        "W",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;",
        "viewState",
        "",
        "showProgress",
        "Lkotlin/Function0;",
        "onAnimationEnd",
        "e0",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "a0",
        "()Z",
        "onComplete",
        "X",
        "(Lkotlin/jvm/functions/Function0;)V",
        "Laq/b;",
        "rawRes",
        "i0",
        "(Laq/b;ILkotlin/jvm/functions/Function0;)V",
        "b0",
        "(Laq/b;Lkotlin/jvm/functions/Function0;)V",
        "",
        "duration",
        "Landroid/view/ViewPropertyAnimator;",
        "R",
        "(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;",
        "U",
        "Landroid/widget/ImageView;",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "n0",
        "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V",
        "p0",
        "(Landroid/content/Context;)Z",
        "z",
        "Laq/b;",
        "binding",
        "A",
        "Ljt/h;",
        "getDrawableLeft",
        "()Landroid/graphics/drawable/Drawable;",
        "drawableLeft",
        "B",
        "getDrawableRight",
        "drawableRight",
        "C",
        "I",
        "leftPoseAnimation",
        "D",
        "rightPoseAnimation",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "E",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "getLeftPoseImage",
        "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;",
        "setLeftPoseImage",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V",
        "leftPoseImage",
        "F",
        "getRightPoseImage",
        "setRightPoseImage",
        "rightPoseImage",
        "G",
        "Landroid/view/View;",
        "",
        "H",
        "Ljava/util/List;",
        "oneShotOnCompositionLoadedListeners",
        "oneShotOnAnimationCompleteListeners",
        "J",
        "remoteImageView",
        "K",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;",
        "currentViewState",
        "b",
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
.field public final A:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final B:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final C:I

.field public final D:I

.field public E:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public F:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public G:Landroid/view/View;

.field public final H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final I:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public J:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public K:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final z:Laq/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Laq/b;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Laq/b;

    move-result-object p2

    const-string p3, "inflate(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    .line 5
    new-instance p3, Liq/a;

    invoke-direct {p3, p1}, Liq/a;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->A:Ljt/h;

    .line 6
    new-instance p3, Liq/e;

    invoke-direct {p3, p1}, Liq/e;-><init>(Landroid/content/Context;)V

    invoke-static {p3}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->B:Ljt/h;

    .line 7
    sget v1, Lvp/a;->r:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    .line 8
    :cond_0
    sget p1, Lyp/t;->e:I

    .line 9
    :goto_0
    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->C:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    .line 11
    :cond_1
    sget p1, Lyp/t;->g:I

    .line 12
    :goto_1
    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->D:I

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->H:Ljava/util/List;

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->I:Ljava/util/List;

    .line 15
    iget-object p1, p2, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    .line 16
    new-instance p3, Liq/f;

    invoke-direct {p3, p0}, Liq/f;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;)V

    invoke-virtual {p1, p3}, Lcom/airbnb/lottie/LottieAnimationView;->j(Lf7/n0;)Z

    .line 17
    new-instance p3, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$a;

    invoke-direct {p3, p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;)V

    invoke-virtual {p1, p3}, Lcom/airbnb/lottie/LottieAnimationView;->i(Landroid/animation/Animator$AnimatorListener;)V

    .line 18
    const-string p3, "#022050"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 19
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "getContext(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget v2, Lic/b;->m:I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 21
    invoke-static/range {v1 .. v6}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result v1

    .line 22
    invoke-virtual {p1, p3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    .line 23
    const-string p3, "#AA85FF"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 24
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, Lic/b;->n:I

    const/4 v7, 0x6

    const/4 v8, 0x0

    move v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result v1

    move v8, v4

    .line 25
    invoke-virtual {p1, p3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    .line 26
    const-string p3, "#280087"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 27
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v3, v2

    move-object v2, v1

    invoke-static/range {v2 .. v7}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result v1

    .line 28
    invoke-virtual {p1, p3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    .line 29
    const-string p3, "#8552FF"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 30
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move v5, v8

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result v1

    .line 31
    invoke-virtual {p1, p3, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    .line 32
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v4 .. v9}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result p3

    .line 33
    invoke-virtual {p2}, Laq/b;->getRoot()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lic/b;->o:I

    const/4 v5, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result p2

    const v0, 0x3f28f5c3    # 0.66f

    .line 34
    invoke-static {p3, p2, v0}, Landroidx/core/graphics/c;->c(IIF)I

    move-result p2

    .line 35
    const-string p3, "#DBCCFF"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    .line 36
    invoke-virtual {p1, p3, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic D(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->T(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic E(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->Y(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->h0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->c0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->k0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static I(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lf7/i;)V
    .locals 0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->H:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->M0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->H:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic J(Landroid/widget/ImageView;)V
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->o0(Landroid/widget/ImageView;)V

    return-void
.end method

.method public static synthetic K(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->m0(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->l0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->d0(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic N(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->Z(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->g0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Laq/b;Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->j0(Laq/b;Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->I:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic S(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const-wide/16 p2, 0xc8

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->R(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static final T(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic V(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const-wide/16 p2, 0xc8

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->U(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static final Y(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 6

    sget v1, Lvp/a;->q:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v0, p0}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    sget p0, Lyp/q;->c:I

    invoke-static {v0, p0}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final Z(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 6

    sget v1, Lvp/a;->s:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v0, p0}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    sget p0, Lyp/q;->d:I

    invoke-static {v0, p0}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static final c0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    iget-object p1, p1, Laq/b;->b:Landroid/view/View;

    const-string v0, "blindsView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x50

    invoke-virtual {p0, p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->R(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    new-instance p1, Liq/l;

    invoke-direct {p1, p2}, Liq/l;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public static final d0(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic f0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->e0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final g0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    sget v1, Lyp/t;->d:I

    invoke-virtual {p0, v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->i0(Laq/b;ILkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method private final getDrawableLeft()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->A:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private final getDrawableRight()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->B:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static final h0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    sget v1, Lyp/t;->d:I

    invoke-virtual {p0, v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->i0(Laq/b;ILkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j0(Laq/b;Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 8

    iget-object v0, p0, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setFrame(I)V

    iget-object v3, p0, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v0, "hintAnimation"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->V(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    move-object v0, v2

    new-instance v1, Liq/b;

    invoke-direct {v1, v0, p0, p2}, Liq/b;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p0, Laq/b;->f:Landroid/view/View;

    const-string p0, "hintOverlayView"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->V(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->I:Ljava/util/List;

    new-instance v1, Liq/c;

    invoke-direct {v1, p0, p1, p2}, Liq/c;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->v()V

    return-void
.end method

.method public static final l0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 6

    iget-object v1, p1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v0, "hintAnimation"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->S(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    new-instance v1, Liq/d;

    invoke-direct {v1, p2}, Liq/d;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    iget-object v1, p1, Laq/b;->f:Landroid/view/View;

    const-string p0, "hintOverlayView"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->S(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m0(Lkotlin/jvm/functions/Function0;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final o0(Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final R(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p2

    new-instance p3, Liq/m;

    invoke-direct {p3, p1}, Liq/m;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, p3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-string p2, "withEndAction(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final U(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-string p2, "setDuration(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final W(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;)V
    .locals 3
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "styles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieCaptureFeedBoxBorderColorValue()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->setStrokeColor(I)V

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieCaptureFeedBoxBorderWidthValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v2, v2, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->setStrokeWidth(F)V

    :cond_1
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieCaptureIconStrokeColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v2, "#022050"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v2, "#280087"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getCaptureCompleteIconStrokeColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v2, "#3BC170"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieCaptureIconFillColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v2, "#AA85FF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v1, v1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v2, "#8552FF"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_4
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;->getSelfieCaptureIconBackgroundFillColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v0, v0, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    const-string v1, "#DBCCFF"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->F(II)V

    :cond_5
    return-void
.end method

.method public final X(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onComplete"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v0, v0, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final a0()Z
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget-object v0, v0, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->g()Z

    move-result v0

    return v0
.end method

.method public final b0(Laq/b;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/b;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, Laq/b;->b:Landroid/view/View;

    const-string v1, "blindsView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0x50

    invoke-virtual {p0, v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->U(Landroid/view/View;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Liq/k;

    invoke-direct {v1, p0, p1, p2}, Liq/k;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Laq/b;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public final e0(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;ZLkotlin/jvm/functions/Function0;)V
    .locals 10
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->K:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;

    if-ne v0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->K:Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->J:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->p0(Landroid/content/Context;)Z

    move-result v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iget-object p2, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object p2, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    const/16 v3, 0x8

    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    sget-object p2, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const-string p2, "hintImage"

    const/4 v3, 0x1

    const/high16 v4, 0x42480000    # 50.0f

    const/high16 v5, 0x42c80000    # 100.0f

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x3

    const/4 v9, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Up or down pose is not supported in legacy Selfie flow."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    new-instance p2, Liq/h;

    invoke-direct {p2, p0, p3}, Liq/h;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1, v5, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->f(FLkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_2
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v5, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    new-instance p2, Liq/g;

    invoke-direct {p2, p0, p3}, Liq/g;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->b0(Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_3
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->e()V

    return-void

    :pswitch_4
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v5, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    invoke-virtual {p0, p1, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->b0(Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_5
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1, v4, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->f(FLkotlin/jvm/functions/Function0;)V

    if-nez v0, :cond_6

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->F:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    if-eqz p1, :cond_2

    invoke-static {p1, p0, v3}, Llr/c;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->J:Landroid/view/View;

    return-void

    :cond_2
    iget-object p1, v1, Laq/b;->g:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v1, Laq/b;->e:Landroid/widget/ImageView;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->getDrawableRight()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->n0(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void

    :pswitch_6
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v4, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->D:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->i0(Laq/b;ILkotlin/jvm/functions/Function0;)V

    return-void

    :cond_3
    if-eqz p3, :cond_6

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_7
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v4, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    invoke-virtual {p0, p1, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->b0(Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_8
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1, v6, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->f(FLkotlin/jvm/functions/Function0;)V

    if-nez v0, :cond_6

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->E:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    if-eqz p1, :cond_4

    invoke-static {p1, p0, v3}, Llr/c;->e(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Landroidx/constraintlayout/widget/ConstraintLayout;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->J:Landroid/view/View;

    return-void

    :cond_4
    iget-object p1, v1, Laq/b;->g:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v1, Laq/b;->e:Landroid/widget/ImageView;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->getDrawableLeft()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->n0(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void

    :pswitch_9
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v6, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    iget p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->C:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->i0(Laq/b;ILkotlin/jvm/functions/Function0;)V

    return-void

    :cond_5
    if-eqz p3, :cond_6

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_6
    :goto_1
    return-void

    :pswitch_a
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-static {p1, v6, v9, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->g(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;FLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->z:Laq/b;

    invoke-virtual {p0, p1, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->b0(Laq/b;Lkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_b
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-static {p1, v2, v9, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->e(Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1, v6, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->f(FLkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_c
    iget-object p1, v1, Laq/b;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2CircleMaskView;->h()V

    iget-object p1, v1, Laq/b;->h:Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;

    invoke-virtual {p1, v6, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/Pi2ProgressArcView;->f(FLkotlin/jvm/functions/Function0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLeftPoseImage()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->E:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    return-object v0
.end method

.method public final getRightPoseImage()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->F:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    return-object v0
.end method

.method public final i0(Laq/b;ILkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq/b;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->H:Ljava/util/List;

    new-instance v1, Liq/i;

    invoke-direct {v1, p1, p0, p3}, Liq/i;-><init>(Laq/b;Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Laq/b;->d:Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;

    invoke-virtual {p1, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    return-void
.end method

.method public final n0(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 7

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->S(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    move-object v1, v2

    new-instance p2, Liq/j;

    invoke-direct {p2, v1}, Liq/j;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void

    :cond_1
    move-object v1, p1

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->V(Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;Landroid/view/View;JILjava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public final p0(Landroid/content/Context;)Z
    .locals 6

    sget v1, Lvp/a;->q:I

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    sget v1, Lvp/a;->s:I

    invoke-static/range {v0 .. v5}, Ljq/z;->f(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz p1, :cond_0

    if-nez v0, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->E:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->F:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final setLeftPoseImage(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->E:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    return-void
.end method

.method public final setPreviewView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "previewView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->G:Landroid/view/View;

    return-void
.end method

.method public final setRightPoseImage(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView;->F:Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    return-void
.end method
