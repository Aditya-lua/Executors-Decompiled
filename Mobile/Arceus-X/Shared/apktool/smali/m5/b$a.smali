.class public Lm5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/b;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lm5/b$c;

.field public final synthetic b:Lm5/b;


# direct methods
.method public constructor <init>(Lm5/b;Lm5/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lm5/b$a;->b:Lm5/b;

    iput-object p2, p0, Lm5/b$a;->a:Lm5/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lm5/b$a;->b:Lm5/b;

    iget-object v1, p0, Lm5/b$a;->a:Lm5/b$c;

    invoke-virtual {v0, p1, v1}, Lm5/b;->n(FLm5/b$c;)V

    iget-object v0, p0, Lm5/b$a;->b:Lm5/b;

    iget-object v1, p0, Lm5/b$a;->a:Lm5/b$c;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lm5/b;->b(FLm5/b$c;Z)V

    iget-object p1, p0, Lm5/b$a;->b:Lm5/b;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
