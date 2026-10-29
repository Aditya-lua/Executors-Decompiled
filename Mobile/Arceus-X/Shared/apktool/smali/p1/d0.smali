.class public final synthetic Lp1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lp1/f0;


# direct methods
.method public synthetic constructor <init>(Lp1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/d0;->a:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lp1/d0;->a:Lp1/f0;

    invoke-static {v0, p1}, Lp1/f0;->a(Lp1/f0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
