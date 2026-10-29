.class public final synthetic Lpc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lpc/b;


# direct methods
.method public synthetic constructor <init>(Lpc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/a;->a:Lpc/b;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lpc/a;->a:Lpc/b;

    invoke-static {v0, p1}, Lpc/b;->a(Lpc/b;Landroid/animation/ValueAnimator;)V

    return-void
.end method
