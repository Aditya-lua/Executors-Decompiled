.class public Lkd/p$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/p;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkd/p;


# direct methods
.method public constructor <init>(Lkd/p;)V
    .locals 0

    iput-object p1, p0, Lkd/p$a;->a:Lkd/p;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lkd/p$a;->a:Lkd/p;

    invoke-virtual {p1}, Lkd/r;->r()V

    iget-object p1, p0, Lkd/p$a;->a:Lkd/p;

    invoke-static {p1}, Lkd/p;->C(Lkd/p;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
