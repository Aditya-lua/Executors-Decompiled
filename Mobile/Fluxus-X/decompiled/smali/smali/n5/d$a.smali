.class public Ln5/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


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

    iput-object p1, p0, Ln5/d$a;->a:Ln5/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, Ln5/d$a;->a:Ln5/d;

    iget-boolean v0, p1, Ln5/d;->c:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Ln5/d;->C:Ln5/b;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Ln5/b;->setAlpha(I)V

    iget-object p1, p0, Ln5/d$a;->a:Ln5/d;

    iget-object p1, p1, Ln5/d;->C:Ln5/b;

    invoke-virtual {p1}, Ln5/b;->start()V

    iget-object p1, p0, Ln5/d$a;->a:Ln5/d;

    iget-boolean v0, p1, Ln5/d;->I:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Ln5/d;->b:Ln5/d$j;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ln5/d$j;->e()V

    :cond_0
    iget-object p1, p0, Ln5/d$a;->a:Ln5/d;

    iget-object v0, p1, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p1, Ln5/d;->n:I

    return-void

    :cond_1
    invoke-virtual {p1}, Ln5/d;->s()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
