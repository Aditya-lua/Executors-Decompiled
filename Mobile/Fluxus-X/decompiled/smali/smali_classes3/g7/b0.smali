.class public final synthetic Lg7/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lg7/h0;


# direct methods
.method public synthetic constructor <init>(Lg7/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/b0;->a:Lg7/h0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lg7/b0;->a:Lg7/h0;

    invoke-static {v0, p1}, Lg7/h0;->g(Lg7/h0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
