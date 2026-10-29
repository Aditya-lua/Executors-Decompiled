.class public Landroidx/core/view/y0$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/y0;->h(Landroid/view/View;Landroidx/core/view/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/core/view/z0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroidx/core/view/y0;


# direct methods
.method public constructor <init>(Landroidx/core/view/y0;Landroidx/core/view/z0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/view/y0$a;->c:Landroidx/core/view/y0;

    iput-object p2, p0, Landroidx/core/view/y0$a;->a:Landroidx/core/view/z0;

    iput-object p3, p0, Landroidx/core/view/y0$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/y0$a;->a:Landroidx/core/view/z0;

    iget-object v0, p0, Landroidx/core/view/y0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/z0;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/y0$a;->a:Landroidx/core/view/z0;

    iget-object v0, p0, Landroidx/core/view/y0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/z0;->b(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Landroidx/core/view/y0$a;->a:Landroidx/core/view/z0;

    iget-object v0, p0, Landroidx/core/view/y0$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Landroidx/core/view/z0;->c(Landroid/view/View;)V

    return-void
.end method
