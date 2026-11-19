.class public Ln5/d$f;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ln5/d;


# direct methods
.method public constructor <init>(Ln5/d;)V
    .locals 0

    iput-object p1, p0, Ln5/d$f;->a:Ln5/d;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Ln5/d$f;->a:Ln5/d;

    iget-boolean v0, p2, Ln5/d;->K:Z

    if-nez v0, :cond_0

    iget v0, p2, Ln5/d;->A:I

    iget p2, p2, Ln5/d;->z:I

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr v0, p2

    goto :goto_0

    :cond_0
    iget v0, p2, Ln5/d;->A:I

    :goto_0
    iget-object p2, p0, Ln5/d$f;->a:Ln5/d;

    iget v1, p2, Ln5/d;->x:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    add-int/2addr v1, v0

    iget-object p2, p2, Ln5/d;->v:Ln5/a;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr v1, p2

    iget-object p2, p0, Ln5/d$f;->a:Ln5/d;

    invoke-virtual {p2, v1}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    iget-object p2, p0, Ln5/d$f;->a:Ln5/d;

    iget-object p2, p2, Ln5/d;->C:Ln5/b;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-virtual {p2, v0}, Ln5/b;->e(F)V

    return-void
.end method
