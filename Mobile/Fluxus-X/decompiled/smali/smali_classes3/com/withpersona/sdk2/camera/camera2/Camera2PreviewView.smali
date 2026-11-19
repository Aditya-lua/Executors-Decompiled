.class public final Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J7\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001dR\"\u0010\'\u001a\u00020 8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\u0011\u0010+\u001a\u00020(8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;",
        "Landroid/view/ViewGroup;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "a",
        "()V",
        "",
        "w",
        "h",
        "orientationDegrees",
        "b",
        "(III)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "I",
        "previewW",
        "previewH",
        "Landroid/view/SurfaceView;",
        "c",
        "Landroid/view/SurfaceView;",
        "getSurfaceView",
        "()Landroid/view/SurfaceView;",
        "setSurfaceView",
        "(Landroid/view/SurfaceView;)V",
        "surfaceView",
        "Landroid/view/SurfaceHolder;",
        "getHolder",
        "()Landroid/view/SurfaceHolder;",
        "holder",
        "camera_release"
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
.field public a:I

.field public b:I

.field public c:Landroid/view/SurfaceView;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
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

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/view/SurfaceView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v0, Landroid/view/SurfaceView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final b(III)V
    .locals 1

    const/16 v0, 0x5a

    if-eq p3, v0, :cond_0

    const/16 v0, 0x10e

    if-eq p3, v0, :cond_0

    iput p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    iput p2, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    iput p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    :goto_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final getHolder()Landroid/view/SurfaceHolder;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const-string v1, "getHolder(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getSurfaceView()Landroid/view/SurfaceView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 4

    iget p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    int-to-double p3, p1

    iget p5, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    int-to-double v0, p5

    div-double/2addr p3, v0

    int-to-double v0, p2

    iget p5, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    int-to-double v2, p5

    div-double/2addr v0, v2

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Double;->max(DD)D

    move-result-wide p3

    iget p5, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    int-to-double v0, p5

    mul-double/2addr v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p5, v0

    iget v0, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    int-to-double v0, v0

    mul-double/2addr p3, v0

    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p3

    double-to-int p3, p3

    sub-int p1, p5, p1

    const/4 p4, 0x0

    invoke-static {p1, p4}, Lkotlin/ranges/d;->c(II)I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    mul-int/lit8 p1, p1, -0x1

    sub-int p2, p3, p2

    invoke-static {p2, p4}, Lkotlin/ranges/d;->c(II)I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    mul-int/lit8 p2, p2, -0x1

    iget-object p4, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    add-int/2addr p5, p1

    add-int/2addr p3, p2

    invoke-virtual {p4, p1, p2, p5, p3}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    const v0, 0x7fffffff

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    iget p2, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->a:I

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget v1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->b:I

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final setSurfaceView(Landroid/view/SurfaceView;)V
    .locals 1
    .param p1    # Landroid/view/SurfaceView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;->c:Landroid/view/SurfaceView;

    return-void
.end method
