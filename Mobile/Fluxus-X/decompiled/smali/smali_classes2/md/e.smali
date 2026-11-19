.class public final synthetic Lmd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lmd/f;


# direct methods
.method public synthetic constructor <init>(Lmd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/e;->a:Lmd/f;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lmd/e;->a:Lmd/f;

    invoke-static {v0, p1}, Lmd/f;->y(Lmd/f;Landroid/animation/ValueAnimator;)V

    return-void
.end method
