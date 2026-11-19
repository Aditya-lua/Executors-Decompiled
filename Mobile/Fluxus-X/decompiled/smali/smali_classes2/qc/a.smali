.class public final synthetic Lqc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lqc/b;


# direct methods
.method public synthetic constructor <init>(Lqc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/a;->a:Lqc/b;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lqc/a;->a:Lqc/b;

    invoke-static {v0, p1}, Lqc/b;->a(Lqc/b;Landroid/animation/ValueAnimator;)V

    return-void
.end method
