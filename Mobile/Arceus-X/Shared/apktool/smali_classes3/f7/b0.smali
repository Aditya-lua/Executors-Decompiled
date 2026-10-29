.class public final synthetic Lf7/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lf7/h0;


# direct methods
.method public synthetic constructor <init>(Lf7/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/b0;->a:Lf7/h0;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lf7/b0;->a:Lf7/h0;

    invoke-static {v0, p1}, Lf7/h0;->g(Lf7/h0;Landroid/animation/ValueAnimator;)V

    return-void
.end method
