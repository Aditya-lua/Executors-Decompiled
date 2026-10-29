.class public final Landroidx/camera/view/PreviewView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/PreviewView$c;,
        Landroidx/camera/view/PreviewView$e;,
        Landroidx/camera/view/PreviewView$b;,
        Landroidx/camera/view/PreviewView$d;
    }
.end annotation


# static fields
.field public static final p:Landroidx/camera/view/PreviewView$c;


# instance fields
.field public a:Landroidx/camera/view/PreviewView$c;

.field public b:Landroidx/camera/view/c;

.field public final c:Lp1/f0;

.field public final d:Landroidx/camera/view/b;

.field public e:Z

.field public final f:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Landroidx/camera/view/PreviewView$e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/camera/view/a;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lp1/i;

.field public i:Lp1/x;

.field public final j:Lq1/a;

.field public k:Ln0/o0;

.field public l:Landroid/view/MotionEvent;

.field public final m:Landroidx/camera/view/PreviewView$b;

.field public final n:Landroid/view/View$OnLayoutChangeListener;

.field public final o:Lg0/a2$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$c;->b:Landroidx/camera/view/PreviewView$c;

    sput-object v0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/PreviewView$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 10

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    sget-object v0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/PreviewView$c;

    iput-object v0, p0, Landroidx/camera/view/PreviewView;->a:Landroidx/camera/view/PreviewView$c;

    .line 5
    new-instance v1, Landroidx/camera/view/b;

    invoke-direct {v1}, Landroidx/camera/view/b;-><init>()V

    iput-object v1, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    const/4 v2, 0x1

    .line 6
    iput-boolean v2, p0, Landroidx/camera/view/PreviewView;->e:Z

    .line 7
    new-instance v2, Landroidx/lifecycle/d0;

    sget-object v3, Landroidx/camera/view/PreviewView$e;->a:Landroidx/camera/view/PreviewView$e;

    invoke-direct {v2, v3}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->f:Landroidx/lifecycle/d0;

    .line 8
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    new-instance v2, Lp1/x;

    invoke-direct {v2, v1}, Lp1/x;-><init>(Landroidx/camera/view/b;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->i:Lp1/x;

    .line 10
    new-instance v2, Landroidx/camera/view/PreviewView$b;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$b;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->m:Landroidx/camera/view/PreviewView$b;

    .line 11
    new-instance v2, Lp1/r;

    invoke-direct {v2, p0}, Lp1/r;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->n:Landroid/view/View$OnLayoutChangeListener;

    .line 12
    new-instance v2, Landroidx/camera/view/PreviewView$a;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$a;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->o:Lg0/a2$c;

    .line 13
    invoke-static {}, Lp0/z;->b()V

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v5, Lp1/a0;->a:[I

    invoke-virtual {v2, p2, v5, p3, p4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v7

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move v8, p3

    move v9, p4

    .line 15
    invoke-static/range {v3 .. v9}, Landroidx/core/view/o0;->k0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 16
    :try_start_0
    sget p1, Lp1/a0;->c:I

    .line 17
    invoke-virtual {v1}, Landroidx/camera/view/b;->g()Landroidx/camera/view/PreviewView$d;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/camera/view/PreviewView$d;->c()I

    move-result p2

    .line 18
    invoke-virtual {v7, p1, p2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    .line 19
    invoke-static {p1}, Landroidx/camera/view/PreviewView$d;->b(I)Landroidx/camera/view/PreviewView$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->setScaleType(Landroidx/camera/view/PreviewView$d;)V

    .line 20
    sget p1, Lp1/a0;->b:I

    .line 21
    invoke-virtual {v0}, Landroidx/camera/view/PreviewView$c;->c()I

    move-result p2

    .line 22
    invoke-virtual {v7, p1, p2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    .line 23
    invoke-static {p1}, Landroidx/camera/view/PreviewView$c;->b(I)Landroidx/camera/view/PreviewView$c;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->setImplementationMode(Landroidx/camera/view/PreviewView$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    new-instance p1, Lq1/a;

    new-instance p2, Lp1/s;

    invoke-direct {p2, p0}, Lp1/s;-><init>(Landroidx/camera/view/PreviewView;)V

    invoke-direct {p1, v4, p2}, Lq1/a;-><init>(Landroid/content/Context;Lq1/a$b;)V

    iput-object p1, v3, Landroidx/camera/view/PreviewView;->j:Lq1/a;

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x106000c

    invoke-static {p1, p2}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 28
    :cond_0
    new-instance p1, Lp1/f0;

    invoke-direct {p1, v4}, Lp1/f0;-><init>(Landroid/content/Context;)V

    iput-object p1, v3, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    .line 29
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p3, -0x1

    invoke-direct {p2, p3, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 30
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    throw p1
.end method

.method public static synthetic a(Landroidx/camera/view/PreviewView;Lq1/a$c;)Z
    .locals 1

    instance-of v0, p1, Lq1/a$c$c;

    if-eqz v0, :cond_0

    iget-object p0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz p0, :cond_1

    check-cast p1, Lq1/a$c$c;

    invoke-virtual {p1}, Lq1/a$c$c;->a()F

    move-result p1

    invoke-virtual {p0, p1}, Lp1/i;->A(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic b(Landroidx/camera/view/PreviewView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sub-int/2addr p4, p2

    sub-int/2addr p8, p6

    if-ne p4, p8, :cond_1

    sub-int/2addr p5, p3

    sub-int/2addr p9, p7

    if-eq p5, p9, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->c(Z)V

    return-void
.end method

.method public static f(Landroidx/camera/view/c;Lg0/v2;Landroidx/camera/view/PreviewView$c;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/view/d;

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Landroidx/camera/view/PreviewView;->g(Lg0/v2;Landroidx/camera/view/PreviewView$c;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Lg0/v2;Landroidx/camera/view/PreviewView$c;)Z
    .locals 3

    invoke-virtual {p0}, Lg0/v2;->m()Ln0/p0;

    move-result-object p0

    invoke-interface {p0}, Ln0/p0;->k()Ln0/o0;

    move-result-object p0

    invoke-interface {p0}, Lg0/t;->u()Ljava/lang/String;

    move-result-object p0

    const-string v0, "androidx.camera.camera2.legacy"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const-class v0, Landroidx/camera/view/internal/compat/quirk/SurfaceViewStretchedQuirk;

    invoke-static {v0}, Ls1/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const-class v0, Landroidx/camera/view/internal/compat/quirk/SurfaceViewNotCroppedByParentQuirk;

    invoke-static {v0}, Ls1/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    if-nez p0, :cond_5

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_4

    if-ne p0, v2, :cond_3

    return v2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid implementation mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return v1

    :cond_5
    :goto_2
    return v2
.end method

.method private getDisplayManager()Landroid/hardware/display/DisplayManager;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    return-object v0
.end method

.method private getScreenFlashInternal()Lg0/f1$j;
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getScreenFlash()Lg0/f1$j;

    move-result-object v0

    return-object v0
.end method

.method private getViewPortScaleType()I
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getScaleType()Landroidx/camera/view/PreviewView$d;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected scale type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getScaleType()Landroidx/camera/view/PreviewView$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private setScreenFlashUiInfo(Lg0/f1$j;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-nez v0, :cond_0

    const-string p1, "PreviewView"

    const-string v0, "setScreenFlashUiInfo: mCameraController is null!"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v1, Lr1/a;

    sget-object v2, Lr1/a$a;->a:Lr1/a$a;

    invoke-direct {v1, v2, p1}, Lr1/a;-><init>(Lr1/a$a;Lg0/f1$j;)V

    invoke-virtual {v0, v1}, Lp1/i;->H(Lr1/a;)V

    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 3

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getViewPort()Lg0/y2;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Lg0/a2$c;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lp1/i;->c(Lg0/a2$c;Lg0/y2;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    if-eqz p1, :cond_0

    const-string p1, "PreviewView"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public d(I)Lg0/y2;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lg0/y2$a;

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    invoke-direct {v0, v1, p1}, Lg0/y2$a;-><init>(Landroid/util/Rational;I)V

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getViewPortScaleType()I

    move-result p1

    invoke-virtual {v0, p1}, Lg0/y2$a;->c(I)Lg0/y2$a;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Lg0/y2$a;->b(I)Lg0/y2$a;

    move-result-object p1

    invoke-virtual {p1}, Lg0/y2$a;->a()Lg0/y2;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public e()V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->j()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    invoke-virtual {v0}, Landroidx/camera/view/c;->h()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->i:Lp1/x;

    new-instance v1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lp1/x;->f(Landroid/util/Size;I)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getSensorToViewTransform()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/i;->V(Landroid/graphics/Matrix;)V

    :cond_1
    return-void
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/view/c;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public getController()Lp1/i;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    return-object v0
.end method

.method public getDefaultDisplay()Landroid/view/Display;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getDisplayManager()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    return-object v0
.end method

.method public getImplementationMode()Landroidx/camera/view/PreviewView$c;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->a:Landroidx/camera/view/PreviewView$c;

    return-object v0
.end method

.method public getMeteringPointFactory()Lg0/v1;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->i:Lp1/x;

    return-object v0
.end method

.method public getOutputTransform()Lt1/b;
    .locals 5

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    new-instance v2, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroidx/camera/view/b;->j(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v2}, Landroidx/camera/view/b;->i()Landroid/graphics/Rect;

    move-result-object v2

    const-string v3, "PreviewView"

    if-eqz v1, :cond_3

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v2}, Lp0/a0;->b(Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    instance-of v0, v0, Landroidx/camera/view/e;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly."

    invoke-static {v3, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    new-instance v0, Lt1/b;

    new-instance v3, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {v3, v4, v2}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v0, v1, v3}, Lt1/b;-><init>(Landroid/graphics/Matrix;Landroid/util/Size;)V

    return-object v0

    :cond_3
    :goto_2
    const-string v1, "Transform info is not ready"

    invoke-static {v3, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getPreviewStreamState()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Landroidx/camera/view/PreviewView$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->f:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public getScaleType()Landroidx/camera/view/PreviewView$d;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0}, Landroidx/camera/view/b;->g()Landroidx/camera/view/PreviewView$d;

    move-result-object v0

    return-object v0
.end method

.method public getScreenFlash()Lg0/f1$j;
    .locals 1

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getScreenFlashInternal()Lg0/f1$j;

    move-result-object v0

    return-object v0
.end method

.method public getSensorToViewTransform()Landroid/graphics/Matrix;
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    new-instance v1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/camera/view/b;->h(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSurfaceProvider()Lg0/a2$c;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Lg0/a2$c;

    return-object v0
.end method

.method public getViewPort()Lg0/y2;
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/camera/view/PreviewView;->d(I)Lg0/y2;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 4

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getDisplayManager()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->m:Landroidx/camera/view/PreviewView$b;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v1, v2}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    return-void
.end method

.method public i()V
    .locals 2

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getDisplayManager()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->m:Landroidx/camera/view/PreviewView$b;

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    return-void
.end method

.method public j()V
    .locals 4

    iget-boolean v0, p0, Landroidx/camera/view/PreviewView;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/camera/view/PreviewView;->k:Ln0/o0;

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v3

    invoke-interface {v1, v3}, Lg0/t;->w(I)I

    move-result v1

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {v2, v1, v0}, Landroidx/camera/view/b;->o(II)V

    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->h()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->n:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/camera/view/c;->d()V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/camera/view/PreviewView;->c(Z)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->n:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->b:Landroidx/camera/view/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/view/c;->e()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lp1/i;->d()V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->i()V

    :cond_2
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-ne v3, v2, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v6

    int-to-long v6, v6

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_2
    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    iput-object p1, p0, Landroidx/camera/view/PreviewView;->l:Landroid/view/MotionEvent;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->performClick()Z

    return v2

    :cond_4
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->j:Lq1/a;

    invoke-virtual {v0, p1}, Lq1/a;->f(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    return v1

    :cond_6
    :goto_3
    return v2
.end method

.method public performClick()Z
    .locals 4

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->l:Landroid/view/MotionEvent;

    const/high16 v1, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->l:Landroid/view/MotionEvent;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v1, v2, v1

    :goto_1
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    iget-object v3, p0, Landroidx/camera/view/PreviewView;->i:Lp1/x;

    invoke-virtual {v2, v3, v0, v1}, Lp1/i;->B(Lg0/v1;FF)V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/PreviewView;->l:Landroid/view/MotionEvent;

    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public setController(Lp1/i;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    invoke-virtual {v0}, Lp1/i;->d()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroidx/camera/view/PreviewView;->setScreenFlashUiInfo(Lg0/f1$j;)V

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/PreviewView;->h:Lp1/i;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->c(Z)V

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getScreenFlashInternal()Lg0/f1$j;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView;->setScreenFlashUiInfo(Lg0/f1$j;)V

    return-void
.end method

.method public setImplementationMode(Landroidx/camera/view/PreviewView$c;)V
    .locals 0

    invoke-static {}, Lp0/z;->b()V

    iput-object p1, p0, Landroidx/camera/view/PreviewView;->a:Landroidx/camera/view/PreviewView$c;

    sget-object p1, Landroidx/camera/view/PreviewView$c;->b:Landroidx/camera/view/PreviewView$c;

    return-void
.end method

.method public setScaleType(Landroidx/camera/view/PreviewView$d;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->d:Landroidx/camera/view/b;

    invoke-virtual {v0, p1}, Landroidx/camera/view/b;->q(Landroidx/camera/view/PreviewView$d;)V

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/camera/view/PreviewView;->c(Z)V

    return-void
.end method

.method public setScreenFlashOverlayColor(I)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public setScreenFlashWindow(Landroid/view/Window;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->c:Lp1/f0;

    invoke-virtual {v0, p1}, Lp1/f0;->setScreenFlashWindow(Landroid/view/Window;)V

    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getScreenFlashInternal()Lg0/f1$j;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView;->setScreenFlashUiInfo(Lg0/f1$j;)V

    return-void
.end method
