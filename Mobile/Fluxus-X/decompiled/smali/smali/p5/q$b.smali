.class public Lp5/q$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/q;->t0(Landroid/animation/Animator;Lw1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lw1/a;

.field public final synthetic b:Lp5/q;


# direct methods
.method public constructor <init>(Lp5/q;Lw1/a;)V
    .locals 0

    iput-object p1, p0, Lp5/q$b;->b:Lp5/q;

    iput-object p2, p0, Lp5/q$b;->a:Lw1/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lp5/q$b;->a:Lw1/a;

    invoke-virtual {v0, p1}, Lw1/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lp5/q$b;->b:Lp5/q;

    iget-object v0, v0, Lp5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lp5/q$b;->b:Lp5/q;

    iget-object v0, v0, Lp5/q;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
