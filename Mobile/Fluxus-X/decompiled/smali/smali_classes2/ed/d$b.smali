.class public Led/d$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Led/d;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Led/d;


# direct methods
.method public constructor <init>(Led/d;)V
    .locals 0

    iput-object p1, p0, Led/d$b;->a:Led/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Led/d$b;->a:Led/d;

    invoke-virtual {p1}, Led/d;->a()V

    iget-object p1, p0, Led/d$b;->a:Led/d;

    iget-object v0, p1, Led/d;->j:Lq5/b;

    if-eqz v0, :cond_0

    iget-object p1, p1, Led/i;->a:Led/j;

    invoke-virtual {v0, p1}, Lq5/b;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
