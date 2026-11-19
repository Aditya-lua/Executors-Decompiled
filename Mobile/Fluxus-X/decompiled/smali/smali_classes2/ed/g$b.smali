.class public Led/g$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/g;->o(Landroid/animation/ValueAnimator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Led/g;


# direct methods
.method public constructor <init>(Led/g;)V
    .locals 0

    iput-object p1, p0, Led/g$b;->a:Led/g;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Led/g$b;->a:Led/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Led/g;->b(Led/g;ZZ)Z

    iget-object p1, p0, Led/g$b;->a:Led/g;

    invoke-static {p1}, Led/g;->c(Led/g;)V

    return-void
.end method
