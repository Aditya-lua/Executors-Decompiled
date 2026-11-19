.class public Lmd/p$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmd/p;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public constructor <init>(Lmd/p;)V
    .locals 0

    iput-object p1, p0, Lmd/p$a;->a:Lmd/p;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lmd/p$a;->a:Lmd/p;

    invoke-virtual {p1}, Lmd/r;->r()V

    iget-object p1, p0, Lmd/p$a;->a:Lmd/p;

    invoke-static {p1}, Lmd/p;->C(Lmd/p;)Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
