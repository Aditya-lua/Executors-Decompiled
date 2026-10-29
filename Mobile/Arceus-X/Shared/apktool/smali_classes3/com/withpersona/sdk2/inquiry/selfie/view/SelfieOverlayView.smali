.class public final Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;,
        Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008S\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u00ac\u00012\u00020\u0001:\u0006MUPWSJB\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0014\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008(\u0010)J\'\u0010/\u001a\n .*\u0004\u0018\u00010-0-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u00081\u0010\u0011JS\u0010;\u001a\u00020\r*\u0002022\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u00082\u0006\u0010:\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008=\u0010\u0011J\u000f\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u000f\u0010A\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008A\u0010@J\u000f\u0010\t\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008\t\u0010@J+\u0010E\u001a\u00020\r*\u00020*2\u0006\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008E\u0010FJ\u001b\u0010G\u001a\u00020**\u00020*2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008G\u0010HJ\u000f\u0010I\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008I\u0010\u0011R\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0016\u0010O\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010R\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010T\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008S\u0010QR\u0014\u0010V\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008U\u0010QR\u0014\u0010X\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010QR\u0014\u0010Z\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010QR\u0014\u0010[\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010NR\u0014\u0010]\u001a\u00020\u001f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\\\u0010NR\u0014\u0010_\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010NR\u0014\u0010a\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010NR\u0014\u0010c\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010NR\u0014\u0010e\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010dR\u0014\u0010f\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008=\u0010dR\u0014\u0010g\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010dR\u0014\u0010i\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010dR\u0014\u0010j\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010dR\u0014\u0010l\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010dR\u0014\u0010m\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010dR\u0014\u0010n\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010dR\u0014\u0010o\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010dR\u0014\u0010q\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010dR\u0014\u0010r\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010dR\u0014\u0010s\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010dR\u0014\u0010v\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010x\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010uR\u0014\u0010z\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010uR\u0014\u0010|\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010uR\u0014\u0010~\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010uR\u0014\u0010\u007f\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010uR\u0016\u0010\u0081\u0001\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010uR\u0015\u0010\u0082\u0001\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010uR\u0015\u0010\u0083\u0001\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010uR\u0015\u0010\u0084\u0001\u001a\u00020>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010uR\u0017\u0010\u0085\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010NR\u0018\u0010\u0087\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010NR\u0018\u0010\u0089\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010NR\u0018\u0010\u008b\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008a\u0001\u0010NR\u0017\u0010\u008e\u0001\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u0091\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0001\u0010\u0090\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009c\u0001\u0010\u0090\u0001R\u0018\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u0019\u0010\u00a2\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u001a\u0010,\u001a\u00030\u00a3\u0001*\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008h\u0010\u00a4\u0001R\u001a\u0010\u00a6\u0001\u001a\u00020\u0012*\u00020*8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008k\u0010\u00a5\u0001R-\u0010\u00ab\u0001\u001a\u00020\u0008*\u00020>2\u0007\u0010\u00a7\u0001\u001a\u00020\u00088B@BX\u0082\u000e\u00a2\u0006\u000f\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\"\u0005\u0008}\u0010\u00aa\u0001\u00a8\u0006\u00ad\u0001"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "w",
        "h",
        "oldw",
        "oldh",
        "",
        "onSizeChanged",
        "(IIII)V",
        "onDetachedFromWindow",
        "()V",
        "",
        "mirrored",
        "setIsPreviewMirrored",
        "(Z)V",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;",
        "newState",
        "animate",
        "D",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V",
        "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;",
        "brightnessInfo",
        "setCameraStreamBrightnessInfo",
        "(Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V",
        "",
        "intensity",
        "setIntensity",
        "(F)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "oldState",
        "x",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;",
        "startState",
        "endState",
        "Landroid/animation/ValueAnimator;",
        "kotlin.jvm.PlatformType",
        "u",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;",
        "H",
        "Landroid/graphics/Path;",
        "left",
        "top",
        "right",
        "bottom",
        "startAngle",
        "sweepAngle",
        "numTicks",
        "tickLength",
        "m",
        "(Landroid/graphics/Path;FFFFFFIF)V",
        "n",
        "Landroid/graphics/Paint;",
        "t",
        "()Landroid/graphics/Paint;",
        "s",
        "start",
        "end",
        "percent",
        "q",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V",
        "o",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;",
        "G",
        "a",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;",
        "state",
        "b",
        "F",
        "currentIntensity",
        "c",
        "I",
        "colorOnSurface",
        "d",
        "shadowColor",
        "e",
        "accentColor",
        "f",
        "arcBaseColor",
        "g",
        "arcHighlightColor",
        "arcInset",
        "i",
        "arcGapDegrees",
        "j",
        "arcStrokeWidth",
        "k",
        "arcDialStrokeWidth",
        "l",
        "arcTickLength",
        "Landroid/graphics/Path;",
        "arcTop",
        "arcBottom",
        "arcLeft",
        "p",
        "arcRight",
        "arcDialLeft",
        "r",
        "arcDialRight",
        "arcDialTop",
        "arcDialBottom",
        "arcDialHighlightClipPathRight",
        "v",
        "arcDialHighlightClipPathLeft",
        "arcDialHighlightClipPathTop",
        "arcDialHighlightClipPathBottom",
        "y",
        "Landroid/graphics/Paint;",
        "arcTopPaint",
        "z",
        "arcBottomPaint",
        "A",
        "arcLeftPaint",
        "B",
        "arcRightPaint",
        "C",
        "shadowPaint",
        "arcDialLeftPaint",
        "E",
        "arcDialRightPaint",
        "arcDialTopPaint",
        "arcDialBottomPaint",
        "filledArcDialPaint",
        "arcDialLeftIntensity",
        "J",
        "arcDialRightIntensity",
        "K",
        "arcDialTopIntensity",
        "L",
        "arcDialBottomIntensity",
        "M",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;",
        "arcHoverState",
        "N",
        "Landroid/animation/ValueAnimator;",
        "stateAnimator",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;",
        "O",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;",
        "stateAnimationState",
        "P",
        "intensityAnimator",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;",
        "Q",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;",
        "intensityAnimationState",
        "R",
        "directionHintAnimator",
        "S",
        "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;",
        "T",
        "Z",
        "isPreviewMirrored",
        "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;",
        "(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Z",
        "isIdentity",
        "value",
        "getShadowAlpha",
        "(Landroid/graphics/Paint;)I",
        "(Landroid/graphics/Paint;I)V",
        "shadowAlpha",
        "U",
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


# static fields
.field public static final U:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final A:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final B:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final C:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final D:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final E:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final F:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final G:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final H:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public I:F

.field public J:F

.field public K:F

.field public L:F

.field public final M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public N:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public P:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public R:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public T:Z

.field public a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:F

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:F

.field public final i:F

.field public final j:F

.field public final k:F

.field public final l:F

.field public final m:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final x:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final y:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final z:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->U:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13
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

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    const/4 p1, -0x1

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->c:I

    const/high16 p2, -0x1000000

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->d:I

    const p2, -0xd4437a

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->e:I

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f:I

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g:I

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    const/high16 p1, 0x41a00000    # 20.0f

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->k:F

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    invoke-static {v0, v1}, Ljq/j;->a(D)D

    move-result-wide v0

    double-to-float p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l:F

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->v:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->w:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->x:Landroid/graphics/Path;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->w()Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s()Landroid/graphics/Paint;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H:Landroid/graphics/Paint;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v11, 0x1ff

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    invoke-virtual {p0, v1, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    new-instance p1, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    const/4 p2, 0x0

    const/4 v1, 0x1

    invoke-direct {p1, p2, v1, p2}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;-><init>([Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public static final A(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v1

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->d(F)V

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n()V

    return-void
.end method

.method public static final B(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->d(F)V

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n()V

    return-void
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V

    return-void
.end method

.method public static final F(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->n(F)V

    :cond_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n()V

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic d(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->v(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    return-object p0
.end method

.method public static final synthetic h(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->x(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V

    return-void
.end method

.method public static final synthetic i(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    return-void
.end method

.method public static final synthetic j(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    return-void
.end method

.method public static final synthetic k(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    return-void
.end method

.method public static final synthetic l(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    return-void
.end method

.method public static final v(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p3

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n()V

    return-void
.end method

.method public static final y(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p3

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static final z(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V
    .locals 14

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$g;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :pswitch_0
    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object p0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-direct/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, Ljq/j;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->m(F)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    iput-object p0, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    return-void

    :pswitch_1
    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object p0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-direct/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, Ljq/j;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    neg-float v0, v0

    invoke-virtual {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->t(F)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    iput-object p0, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    return-void

    :pswitch_2
    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object p0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-direct/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, Ljq/j;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->p(F)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    iput-object p0, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    return-void

    :pswitch_3
    iget-object v2, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v12, 0x1ff

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object p0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-direct/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v1}, Ljq/j;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    neg-float v0, v0

    invoke-virtual {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->n(F)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    iput-object p0, p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final C(Landroid/graphics/Paint;I)V
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-ne v0, p2, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->d:I

    invoke-static {v0, p2}, Landroidx/core/graphics/c;->l(II)I

    move-result v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v2, v0}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final D(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Z)V
    .locals 14
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object v3, p1

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->a()Z

    move-result v0

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->b()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->a()Z

    move-result v0

    if-ne v0, v2, :cond_2

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v0, v3, :cond_3

    :goto_1
    return-void

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->N:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_4
    if-eqz p2, :cond_5

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    iget v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    const/high16 v5, 0x437f0000    # 255.0f

    div-float v6, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v7, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v8, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v9, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v10, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v11, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v12, v1, v5

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    int-to-float v1, v1

    div-float v13, v1, v5

    const/4 v1, 0x1

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;-><init>(ZLcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FFFFFFFFFF)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Liq/r;

    invoke-direct {v1, p0}, Liq/r;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;

    invoke-direct {v1, p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$j;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->N:Landroid/animation/ValueAnimator;

    return-void

    :cond_5
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n()V

    invoke-virtual {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->x(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final G()V
    .locals 12

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v5, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float v9, v4, v0

    div-float v10, v5, v0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->v:Landroid/graphics/Path;

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->I:F

    const/high16 v11, 0x42340000    # 45.0f

    mul-float/2addr v2, v11

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v1, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v3, 0x43340000    # 180.0f

    sub-float v6, v3, v2

    mul-float v7, v2, v0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u:Landroid/graphics/Path;

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->J:F

    mul-float/2addr v2, v11

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v1, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    neg-float v6, v2

    mul-float v7, v2, v0

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->w:Landroid/graphics/Path;

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->K:F

    mul-float/2addr v2, v11

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v1, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v3, 0x43870000    # 270.0f

    sub-float v6, v3, v2

    mul-float v7, v2, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->x:Landroid/graphics/Path;

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->L:F

    mul-float/2addr v2, v11

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual {v1, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v3, 0x42b40000    # 90.0f

    sub-float v6, v3, v2

    mul-float v7, v2, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method public final H()V
    .locals 28

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m:Landroid/graphics/Path;

    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m:Landroid/graphics/Path;

    iget v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    int-to-float v12, v1

    sub-float v8, v12, v6

    int-to-float v13, v2

    sub-float v9, v13, v6

    const/high16 v1, 0x43610000    # 225.0f

    add-float v10, v3, v1

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    const/high16 v14, 0x42b40000    # 90.0f

    sub-float v11, v14, v1

    move v7, v6

    invoke-virtual/range {v5 .. v11}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n:Landroid/graphics/Path;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v18, v12, v1

    sub-float v19, v13, v1

    const/high16 v2, 0x42340000    # 45.0f

    add-float v20, v3, v2

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v21, v14, v2

    move/from16 v17, v1

    move/from16 v16, v1

    invoke-virtual/range {v15 .. v21}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v24, v12, v2

    sub-float v25, v13, v2

    const/high16 v4, 0x43070000    # 135.0f

    add-float v6, v3, v4

    iget v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v27, v14, v4

    move/from16 v23, v2

    move-object/from16 v21, v1

    move/from16 v22, v2

    move/from16 v26, v6

    invoke-virtual/range {v21 .. v27}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v24, v12, v2

    sub-float v25, v13, v2

    const v4, 0x439d8000    # 315.0f

    add-float v26, v3, v4

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v27, v14, v3

    move/from16 v23, v2

    move-object/from16 v21, v1

    move/from16 v22, v2

    invoke-virtual/range {v21 .. v27}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v4, v12, v2

    sub-float v5, v13, v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v7, v14, v3

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l:F

    const/16 v8, 0x1e

    move v3, v2

    invoke-virtual/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m(Landroid/graphics/Path;FFFFFFIF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v4, v12, v2

    sub-float v5, v13, v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v7, v14, v3

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l:F

    move v3, v2

    move/from16 v6, v26

    invoke-virtual/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m(Landroid/graphics/Path;FFFFFFIF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v4, v12, v2

    sub-float v5, v13, v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v7, v14, v3

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l:F

    move v3, v2

    move v6, v10

    invoke-virtual/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m(Landroid/graphics/Path;FFFFFFIF)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->h:F

    sub-float v4, v12, v2

    sub-float v5, v13, v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->i:F

    sub-float v7, v14, v3

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->l:F

    move v3, v2

    move/from16 v6, v20

    invoke-virtual/range {v0 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m(Landroid/graphics/Path;FFFFFFIF)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final m(Landroid/graphics/Path;FFFFFFIF)V
    .locals 17

    move-object/from16 v0, p1

    move/from16 v1, p8

    sub-float v2, p4, p2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float v3, v2, p2

    add-float v4, v2, p3

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float v5, p9, v5

    move/from16 v6, p6

    float-to-double v6, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    move/from16 v8, p7

    float-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    add-int/lit8 v10, v1, -0x1

    int-to-double v10, v10

    div-double/2addr v8, v10

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v1, :cond_0

    sub-float v11, v2, v5

    add-float v12, v2, v5

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    move/from16 p4, v2

    float-to-double v1, v11

    move-wide/from16 p2, v1

    mul-double v1, p2, v13

    move/from16 p5, v3

    move v11, v4

    mul-double v3, p2, v15

    move/from16 p2, v5

    move-wide/from16 p6, v6

    float-to-double v5, v12

    mul-double/2addr v13, v5

    mul-double/2addr v5, v15

    double-to-float v1, v1

    add-float v1, v1, p5

    double-to-float v2, v3

    add-float/2addr v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    double-to-float v1, v13

    add-float v1, v1, p5

    double-to-float v2, v5

    add-float/2addr v2, v11

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-double v6, p6, v8

    add-int/lit8 v10, v10, 0x1

    move/from16 v5, p2

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v1, p8

    move v4, v11

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final n()V
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->O:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->c()F

    move-result v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->b()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->k()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->n()F

    move-result v6

    sub-float/2addr v6, v5

    mul-float/2addr v6, v3

    add-float/2addr v6, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->d()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->b()F

    move-result v7

    sub-float/2addr v7, v5

    mul-float/2addr v7, v3

    add-float/2addr v7, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->i()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->j()F

    move-result v8

    sub-float/2addr v8, v5

    mul-float/2addr v8, v3

    add-float/2addr v8, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->j()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->l()F

    move-result v9

    sub-float/2addr v9, v5

    mul-float/2addr v9, v3

    add-float/2addr v9, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->f()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->d()F

    move-result v10

    sub-float/2addr v10, v5

    mul-float/2addr v10, v3

    add-float/2addr v10, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->g()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->e()F

    move-result v11

    sub-float/2addr v11, v5

    mul-float/2addr v11, v3

    add-float/2addr v11, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->h()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->h()F

    move-result v12

    sub-float/2addr v12, v5

    mul-float/2addr v12, v3

    add-float/2addr v12, v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->e()F

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->c()F

    move-result v4

    sub-float/2addr v4, v5

    mul-float/2addr v4, v3

    add-float/2addr v4, v5

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->n()F

    move-result v6

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->b()F

    move-result v7

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->j()F

    move-result v8

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->l()F

    move-result v9

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->d()F

    move-result v10

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->e()F

    move-result v11

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->h()F

    move-result v12

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->c()F

    move-result v4

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->m()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->b()Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    move-result-object v5

    if-nez v5, :cond_3

    :cond_2
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->a()F

    move-result v13

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->c()F

    move-result v14

    sub-float/2addr v13, v14

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->b()F

    move-result v14

    mul-float/2addr v13, v14

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;->c()F

    move-result v2

    add-float/2addr v13, v2

    goto :goto_2

    :cond_4
    iget v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    :goto_2
    iput v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    sget-object v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v5, v2, :cond_5

    move v2, v13

    goto :goto_3

    :cond_5
    if-ne v3, v2, :cond_6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->l()F

    move-result v2

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    sget-object v15, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->b:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v5, v15, :cond_7

    move/from16 v16, v13

    goto :goto_4

    :cond_7
    const/16 v16, 0x0

    :goto_4
    sget-object v14, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->c:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v5, v14, :cond_8

    move/from16 v18, v13

    :goto_5
    move-object/from16 v19, v1

    goto :goto_6

    :cond_8
    const/16 v18, 0x0

    goto :goto_5

    :goto_6
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->d:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v5, v1, :cond_9

    move/from16 v20, v13

    :goto_7
    move/from16 v21, v2

    goto :goto_8

    :cond_9
    const/16 v20, 0x0

    goto :goto_7

    :goto_8
    sget-object v2, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->e:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v5, v2, :cond_a

    goto :goto_9

    :cond_a
    const/4 v13, 0x0

    :goto_9
    const v5, 0x3dcccccd    # 0.1f

    sub-float v17, v6, v5

    const/high16 v22, 0x3f800000    # 1.0f

    div-float v17, v17, v22

    move/from16 v23, v5

    mul-float v5, v17, v21

    sub-float v17, v7, v23

    div-float v17, v17, v22

    move/from16 v24, v4

    mul-float v4, v17, v21

    sub-float v17, v8, v23

    div-float v17, v17, v22

    move/from16 v25, v6

    mul-float v6, v17, v21

    sub-float v17, v9, v23

    div-float v17, v17, v22

    move/from16 v26, v7

    mul-float v7, v17, v21

    sub-float v17, v10, v23

    div-float v17, v17, v22

    mul-float v17, v17, v16

    sub-float v16, v11, v23

    div-float v16, v16, v22

    mul-float v16, v16, v18

    sub-float v18, v12, v23

    div-float v18, v18, v22

    mul-float v18, v18, v20

    sub-float v20, v24, v23

    div-float v20, v20, v22

    mul-float v20, v20, v13

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    move/from16 v21, v8

    iget v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f:I

    move/from16 v22, v9

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g:I

    invoke-static {v8, v9, v5}, Landroidx/core/graphics/c;->c(IIF)I

    move-result v5

    invoke-virtual {v13, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    iget v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f:I

    iget v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g:I

    invoke-static {v8, v9, v4}, Landroidx/core/graphics/c;->c(IIF)I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f:I

    iget v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g:I

    invoke-static {v5, v8, v6}, Landroidx/core/graphics/c;->c(IIF)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->f:I

    iget v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->g:I

    invoke-static {v5, v6, v7}, Landroidx/core/graphics/c;->c(IIF)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    if-ne v3, v1, :cond_c

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->l()F

    move-result v18

    :cond_b
    :goto_a
    move/from16 v1, v16

    move/from16 v2, v17

    move/from16 v3, v18

    move/from16 v4, v20

    goto :goto_b

    :cond_c
    if-ne v3, v2, :cond_d

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->l()F

    move-result v20

    goto :goto_a

    :cond_d
    if-ne v3, v15, :cond_e

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->l()F

    move-result v17

    goto :goto_a

    :cond_e
    if-ne v3, v14, :cond_b

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$f;->l()F

    move-result v16

    goto :goto_a

    :goto_b
    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->I:F

    cmpg-float v5, v5, v2

    if-nez v5, :cond_f

    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->J:F

    cmpg-float v5, v5, v1

    if-nez v5, :cond_f

    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->K:F

    cmpg-float v5, v5, v3

    if-nez v5, :cond_f

    iget v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->L:F

    cmpg-float v5, v5, v4

    if-nez v5, :cond_f

    const/4 v5, 0x0

    goto :goto_c

    :cond_f
    const/4 v5, 0x1

    :goto_c
    iput v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->I:F

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->J:F

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->K:F

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->L:F

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    const/16 v2, 0xff

    int-to-float v2, v2

    mul-float v6, v25, v2

    float-to-int v3, v6

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    mul-float v7, v26, v2

    float-to-int v3, v7

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    mul-float v8, v21, v2

    float-to-int v3, v8

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    mul-float v9, v22, v2

    float-to-int v3, v9

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    mul-float/2addr v10, v2

    float-to-int v3, v10

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    mul-float/2addr v11, v2

    float-to-int v3, v11

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    mul-float/2addr v12, v2

    float-to-int v3, v12

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    mul-float v4, v24, v2

    float-to-int v2, v4

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    if-eqz v5, :cond_10

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G()V

    :cond_10
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final o(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;
    .locals 3

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    invoke-static {v0, v1}, Ljq/j;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->s(F)V

    mul-float v2, v0, p2

    invoke-virtual {p1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->t(F)V

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->l(F)V

    neg-float v0, v0

    mul-float/2addr v0, p2

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->m(F)V

    invoke-virtual {p1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->n(F)V

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->o(F)V

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->p(F)V

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->q(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->r(F)V

    return-object p1
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->N:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->P:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 9
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    const v1, 0x3f28f5c3    # 0.66f

    const/4 v2, 0x0

    const/high16 v3, 0x3f000000    # 0.5f

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    :try_start_0
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->j()F

    move-result v4

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->k()F

    move-result v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->i()F

    move-result v4

    cmpl-float v4, v4, v3

    if-lez v4, :cond_0

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->i()F

    move-result v4

    sub-float/2addr v4, v3

    mul-float/2addr v4, v1

    add-float/2addr v4, v2

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v4

    float-to-int v4, v6

    invoke-virtual {p0, v5, v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->w:Landroid/graphics/Path;

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->s:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_2

    :goto_1
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v1

    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->j()F

    move-result v0

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->k()F

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->translate(FF)V

    :try_start_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->i()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->i()F

    move-result v0

    sub-float/2addr v0, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v0

    float-to-int v0, v6

    invoke-virtual {p0, v4, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->m:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_5

    :goto_4
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_3
    :goto_5
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    :try_start_2
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->c()F

    move-result v4

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->d()F

    move-result v5

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->a()F

    move-result v4

    cmpl-float v4, v4, v3

    if-lez v4, :cond_4

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->a()F

    move-result v4

    sub-float/2addr v4, v3

    mul-float/2addr v4, v1

    add-float/2addr v4, v2

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v4

    float-to-int v4, v6

    invoke-virtual {p0, v5, v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_6

    :catchall_2
    move-exception v1

    goto :goto_7

    :cond_4
    :goto_6
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->G:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->x:Landroid/graphics/Path;

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_8

    :goto_7
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v1

    :cond_5
    :goto_8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->c()F

    move-result v0

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->d()F

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->translate(FF)V

    :try_start_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->a()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->a()F

    move-result v0

    sub-float/2addr v0, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v0

    float-to-int v0, v6

    invoke-virtual {p0, v4, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_9

    :catchall_3
    move-exception v0

    goto :goto_a

    :cond_6
    :goto_9
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->n:Landroid/graphics/Path;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_b

    :goto_a
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_7
    :goto_b
    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->T:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->g()F

    move-result v0

    goto :goto_c

    :cond_8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->f()F

    move-result v0

    :goto_c
    iget-boolean v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->T:Z

    if-eqz v4, :cond_9

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->f()F

    move-result v4

    goto :goto_d

    :cond_9
    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;->g()F

    move-result v4

    :goto_d
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getAlpha()I

    move-result v5

    if-lez v5, :cond_b

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    :try_start_4
    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->e()F

    move-result v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->f()F

    move-result v7

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    cmpl-float v6, v0, v3

    if-lez v6, :cond_a

    sub-float v6, v0, v3

    mul-float/2addr v6, v1

    add-float/2addr v6, v2

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    invoke-virtual {v8}, Landroid/graphics/Paint;->getAlpha()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v8, v6

    float-to-int v6, v8

    invoke-virtual {p0, v7, v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_e

    :catchall_4
    move-exception v0

    goto :goto_f

    :cond_a
    :goto_e
    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->D:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->v:Landroid/graphics/Path;

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->q:Landroid/graphics/Path;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_10

    :goto_f
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_b
    :goto_10
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getAlpha()I

    move-result v5

    if-lez v5, :cond_d

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->e()F

    move-result v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->f()F

    move-result v6

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v7

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    cmpl-float v5, v0, v3

    if-lez v5, :cond_c

    sub-float/2addr v0, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v2

    :try_start_5
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getAlpha()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v0

    float-to-int v0, v6

    invoke-virtual {p0, v5, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_11

    :catchall_5
    move-exception v0

    goto :goto_12

    :cond_c
    :goto_11
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o:Landroid/graphics/Path;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_13

    :goto_12
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_d
    :goto_13
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-lez v0, :cond_f

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    :try_start_6
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->g()F

    move-result v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->h()F

    move-result v6

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    cmpl-float v5, v4, v3

    if-lez v5, :cond_e

    sub-float v5, v4, v3

    mul-float/2addr v5, v1

    add-float/2addr v5, v2

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->getAlpha()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v5

    float-to-int v5, v7

    invoke-virtual {p0, v6, v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_14

    :catchall_6
    move-exception v1

    goto :goto_15

    :cond_e
    :goto_14
    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->E:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->u:Landroid/graphics/Path;

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r:Landroid/graphics/Path;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    goto :goto_16

    :goto_15
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v1

    :cond_f
    :goto_16
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    if-lez v0, :cond_11

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->g()F

    move-result v0

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->h()F

    move-result v5

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v6

    invoke-virtual {p1, v0, v5}, Landroid/graphics/Canvas;->translate(FF)V

    cmpl-float v0, v4, v3

    if-lez v0, :cond_10

    sub-float/2addr v4, v3

    mul-float/2addr v1, v4

    add-float/2addr v1, v2

    :try_start_7
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getAlpha()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v1

    float-to-int v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C(Landroid/graphics/Paint;I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_17

    :catchall_7
    move-exception v0

    goto :goto_18

    :cond_10
    :goto_17
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->p:Landroid/graphics/Path;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :goto_18
    invoke-virtual {p1, v6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw v0

    :cond_11
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->H()V

    return-void
.end method

.method public final p(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$g;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->o:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->n:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->m:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_3
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->l:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_4
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->k:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_5
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->j:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_6
    sget-object p1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;->i:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$c;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)V
    .locals 2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->j()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->j()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->s(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->k()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->k()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->t(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->c()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->c()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->l(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->d()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->d()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->m(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->e()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->e()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->n(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->f()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->f()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->o(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->g()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->g()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->p(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->h()F

    move-result v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->h()F

    move-result v1

    sub-float/2addr v1, v0

    mul-float/2addr v1, p4

    add-float/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->q(F)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result p2

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result p3

    sub-float/2addr p3, p2

    mul-float/2addr p3, p4

    add-float/2addr p3, p2

    invoke-virtual {p1, p3}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->r(F)V

    return-void
.end method

.method public final r(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->j()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->k()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->c()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->d()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->e()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->f()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->g()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->h()F

    move-result v0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->i()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final s()Landroid/graphics/Paint;
    .locals 2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->k:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-object v0
.end method

.method public final setCameraStreamBrightnessInfo(Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;)V
    .locals 2
    .param p1    # Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    new-instance p1, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0, v1}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;-><init>([Ljava/lang/Float;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->S:Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setIntensity(F)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    cmpg-float v2, v2, v1

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v1, v2, v3}, Lkotlin/ranges/d;->i(FFF)F

    move-result v1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->P:Landroid/animation/ValueAnimator;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1
    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    iget v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->b:F

    invoke-direct {v3, v2, v4, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;-><init>(FFF)V

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->Q:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$d;

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-wide/16 v3, 0xc8

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;->a:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;

    if-ne v3, v4, :cond_2

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object v3

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v4, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->o(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;F)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object v1

    new-instance v4, Liq/p;

    invoke-direct {v4, v0, v3, v1}, Liq/p;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)V

    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    goto :goto_0

    :cond_2
    new-instance v1, Liq/q;

    invoke-direct {v1, v0}, Liq/q;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    invoke-virtual {v2, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$i;

    invoke-direct {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$i;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->P:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final setIsPreviewMirrored(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->T:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->T:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final t()Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->c:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    return-object v0
.end method

.method public final u(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Landroid/animation/ValueAnimator;
    .locals 4

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-wide/16 v2, 0x2bc

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v0, Liq/t;

    invoke-direct {v0, p0, p1, p2}, Liq/t;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)V

    invoke-virtual {v1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object v1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final w()Landroid/graphics/Paint;
    .locals 4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->t()Landroid/graphics/Paint;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->d:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->j:F

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    iget v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->d:I

    invoke-virtual {v0, v1, v2, v2, v3}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-object v0
.end method

.method public final x(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->r(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->z(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;)V

    return-void

    :cond_2
    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-wide/16 v3, 0xfa

    invoke-virtual {v1, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->M:Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v15, 0x1ff

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;->b(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;FFFFFFFFFILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    move-result-object v3

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;

    const/16 v14, 0x1ff

    const/4 v15, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;-><init>(FFFFFFFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lkotlin/jvm/internal/y;

    invoke-direct {v5}, Lkotlin/jvm/internal/y;-><init>()V

    new-instance v6, Liq/s;

    invoke-direct {v6, v0, v3, v4}, Liq/s;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$a;)V

    invoke-virtual {v1, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$h;

    invoke-direct {v3, v5, v2, v0, v5}, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$h;-><init>(Lkotlin/jvm/internal/y;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;Lkotlin/jvm/internal/y;)V

    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView;->R:Landroid/animation/ValueAnimator;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
