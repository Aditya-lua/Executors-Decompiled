.class public Ln5/d$h;
.super Landroid/view/animation/Animation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln5/d;->A(ILandroid/view/animation/Animation$AnimationListener;)V
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

    iput-object p1, p0, Ln5/d$h;->a:Ln5/d;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    iget-object p2, p0, Ln5/d$h;->a:Ln5/d;

    iget v0, p2, Ln5/d;->y:F

    neg-float v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    invoke-virtual {p2, v0}, Ln5/d;->setAnimationProgress(F)V

    iget-object p2, p0, Ln5/d$h;->a:Ln5/d;

    invoke-virtual {p2, p1}, Ln5/d;->q(F)V

    return-void
.end method
