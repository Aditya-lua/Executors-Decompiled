.class public Ld0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln0/k3;


# direct methods
.method public constructor <init>(Ln0/k3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/l;->a:Ln0/k3;

    return-void
.end method


# virtual methods
.method public a(Lg0/u1;I)Landroid/graphics/PointF;
    .locals 2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Ld0/l;->a:Ln0/k3;

    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/AfRegionFlipHorizontallyQuirk;

    invoke-virtual {p2, v0}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Landroid/graphics/PointF;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1}, Lg0/u1;->c()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p1}, Lg0/u1;->d()F

    move-result p1

    invoke-direct {p2, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p2

    :cond_0
    new-instance p2, Landroid/graphics/PointF;

    invoke-virtual {p1}, Lg0/u1;->c()F

    move-result v0

    invoke-virtual {p1}, Lg0/u1;->d()F

    move-result p1

    invoke-direct {p2, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p2
.end method
