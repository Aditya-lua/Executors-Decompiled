.class public Lad/j$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lad/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lad/j;


# direct methods
.method public constructor <init>(Lad/j;)V
    .locals 0

    iput-object p1, p0, Lad/j$a;->a:Lad/j;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lad/j$a;->a:Lad/j;

    iget-object v1, v0, Lad/j;->c:Landroid/animation/ValueAnimator;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, v0, Lad/j;->c:Landroid/animation/ValueAnimator;

    :cond_0
    return-void
.end method
