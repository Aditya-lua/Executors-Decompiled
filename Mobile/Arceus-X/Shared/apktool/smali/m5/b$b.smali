.class public Lm5/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


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

    iput-object p1, p0, Lm5/b$b;->b:Lm5/b;

    iput-object p2, p0, Lm5/b$b;->a:Lm5/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 4

    iget-object v0, p0, Lm5/b$b;->b:Lm5/b;

    iget-object v1, p0, Lm5/b$b;->a:Lm5/b$c;

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3, v1, v2}, Lm5/b;->b(FLm5/b$c;Z)V

    iget-object v0, p0, Lm5/b$b;->a:Lm5/b$c;

    invoke-virtual {v0}, Lm5/b$c;->A()V

    iget-object v0, p0, Lm5/b$b;->a:Lm5/b$c;

    invoke-virtual {v0}, Lm5/b$c;->l()V

    iget-object v0, p0, Lm5/b$b;->b:Lm5/b;

    iget-boolean v1, v0, Lm5/b;->f:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lm5/b;->f:Z

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v2, 0x534

    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    iget-object p1, p0, Lm5/b$b;->a:Lm5/b$c;

    invoke-virtual {p1, v1}, Lm5/b$c;->x(Z)V

    return-void

    :cond_0
    iget p1, v0, Lm5/b;->e:F

    add-float/2addr p1, v3

    iput p1, v0, Lm5/b;->e:F

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lm5/b$b;->b:Lm5/b;

    const/4 v0, 0x0

    iput v0, p1, Lm5/b;->e:F

    return-void
.end method
