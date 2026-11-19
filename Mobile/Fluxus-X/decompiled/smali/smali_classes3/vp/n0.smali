.class public final Lvp/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lvp/n0;",
        "",
        "Lkq/c;",
        "sandboxFlags",
        "<init>",
        "(Lkq/c;)V",
        "Lvp/s0;",
        "rendering",
        "Lpp/c;",
        "binding",
        "Lf4/k0;",
        "fragmentManager",
        "",
        "h",
        "(Lvp/s0;Lpp/c;Lf4/k0;)V",
        "i",
        "(Lpp/c;)V",
        "Landroid/content/Context;",
        "context",
        "m",
        "(Landroid/content/Context;)V",
        "",
        "containerViewId",
        "Lvp/z0;",
        "g",
        "(Lvp/s0;Lf4/k0;I)Lvp/z0;",
        "a",
        "Lkq/c;",
        "Landroid/app/Dialog;",
        "b",
        "Landroid/app/Dialog;",
        "optionsDialog",
        "c",
        "Lvp/z0;",
        "currentStepRendering",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lkq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Landroid/app/Dialog;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lvp/z0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkq/c;)V
    .locals 1
    .param p1    # Lkq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sandboxFlags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp/n0;->a:Lkq/c;

    return-void
.end method

.method public static synthetic a(Lvp/n0;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lvp/n0;->o(Lvp/n0;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic b(Lvp/n0;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lvp/n0;->p(Lvp/n0;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic c(Lvp/n0;Landroid/content/Context;Landroid/view/View;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lvp/n0;->k(Lvp/n0;Landroid/content/Context;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lvp/n0;->n(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lpp/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvp/n0;->l(Lpp/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvp/n0;Lpp/c;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lvp/n0;->j(Lvp/n0;Lpp/c;Landroid/view/View;)V

    return-void
.end method

.method public static final j(Lvp/n0;Lpp/c;Landroid/view/View;)V
    .locals 1

    iget-object p2, p0, Lvp/n0;->a:Lkq/c;

    invoke-virtual {p2}, Lkq/c;->g()V

    sget-object p2, Lkq/c;->e:Lkq/c$a;

    iget-object p0, p0, Lvp/n0;->a:Lkq/c;

    invoke-virtual {p0}, Lkq/c;->a()Lkq/c$b;

    move-result-object p0

    invoke-virtual {p2, p0}, Lkq/c$a;->a(Lkq/c$b;)Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting the debug flag to: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    iget-object p1, p1, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static final k(Lvp/n0;Landroid/content/Context;Landroid/view/View;)Z
    .locals 0

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lvp/n0;->m(Landroid/content/Context;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final l(Lpp/c;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 5

    const-string v0, "insets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    const-string v0, "getInsetsIgnoringVisibility(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const-string v0, "floatingActionButton"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    int-to-double v1, p1

    const-wide/high16 v3, 0x4030000000000000L    # 16.0

    invoke-static {v3, v4}, Lxq/j;->c(D)D

    move-result-wide v3

    add-double/2addr v1, v3

    double-to-int p1, v1

    iput p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final n(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public static final o(Lvp/n0;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lvp/n0;->a:Lkq/c;

    invoke-virtual {p0, p2}, Lkq/c;->f(Z)V

    return-void
.end method

.method public static final p(Lvp/n0;Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lvp/n0;->b:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final g(Lvp/s0;Lf4/k0;I)Lvp/z0;
    .locals 10

    instance-of v0, p1, Lvp/e1;

    const v1, 0x800003

    const-wide/16 v2, 0x1e

    const v4, 0x800005

    const/4 v5, 0x0

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Lvp/e1;

    invoke-interface {v0}, Lvp/s0;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0}, Lvp/s0;->b()Z

    move-result v7

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v8

    instance-of v9, v8, Lxp/b;

    if-eqz v9, :cond_0

    invoke-virtual {v8}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v9, v8

    goto :goto_0

    :cond_0
    sget-object v9, Lxp/b;->n0:Lxp/b$b;

    invoke-virtual {v9}, Lxp/b$b;->a()Lxp/b;

    move-result-object v9

    :goto_0
    if-eqz v7, :cond_2

    if-eqz v8, :cond_1

    new-instance v7, Lp5/p;

    invoke-direct {v7, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v7, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v7, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v7, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v7}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_1
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v9, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    if-eqz v8, :cond_3

    new-instance v7, Lp5/p;

    invoke-direct {v7, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v7, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v7, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v7, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v7}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_3
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v9, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v9, v6}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v9, Lxp/b;

    invoke-virtual {v9, v0}, Lxp/b;->k2(Lvp/e1;)V

    instance-of p2, v0, Lvp/d;

    if-eqz p2, :cond_4

    new-instance p2, Lvp/e;

    check-cast p1, Lvp/d;

    invoke-virtual {p1}, Lvp/d;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v9}, Lvp/e;-><init>(Ljava/lang/String;Lxp/b;)V

    return-object p2

    :cond_4
    instance-of p2, v0, Lvp/h;

    if-eqz p2, :cond_5

    new-instance p2, Lvp/i;

    check-cast p1, Lvp/h;

    invoke-virtual {p1}, Lvp/h;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v9}, Lvp/i;-><init>(Ljava/lang/String;Lxp/b;)V

    return-object p2

    :cond_5
    instance-of p2, v0, Lvp/q0;

    if-eqz p2, :cond_6

    new-instance p2, Lvp/r0;

    check-cast p1, Lvp/q0;

    invoke-virtual {p1}, Lvp/q0;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v9}, Lvp/r0;-><init>(Ljava/lang/String;Lxp/b;)V

    return-object p2

    :cond_6
    instance-of p2, v0, Lvp/x0;

    if-eqz p2, :cond_7

    new-instance p2, Lvp/y0;

    check-cast p1, Lvp/x0;

    invoke-virtual {p1}, Lvp/x0;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v9}, Lvp/y0;-><init>(Ljava/lang/String;Lxp/b;)V

    return-object p2

    :cond_7
    instance-of p2, v0, Lvp/c1;

    if-eqz p2, :cond_8

    new-instance p2, Lvp/d1;

    check-cast p1, Lvp/c1;

    invoke-virtual {p1}, Lvp/c1;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v9}, Lvp/d1;-><init>(Ljava/lang/String;Lxp/b;)V

    return-object p2

    :cond_8
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_9
    instance-of v0, p1, Lvp/u0;

    if-eqz v0, :cond_a

    sget-object v0, Ltp/f;->o0:Ltp/f$b;

    invoke-virtual {v0}, Ltp/f$b;->a()Ltp/f;

    move-result-object v0

    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v0}, Lf4/t0;->n(ILf4/q;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->h()I

    new-instance p2, Lvp/t0;

    check-cast p1, Lvp/u0;

    invoke-virtual {p1}, Lvp/u0;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v0}, Lvp/t0;-><init>(Ljava/lang/String;Ltp/f;)V

    return-object p2

    :cond_a
    instance-of v0, p1, Lvp/a1;

    if-eqz v0, :cond_f

    check-cast p1, Lvp/a1;

    invoke-virtual {p1}, Lvp/a1;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvp/a1;->b()Z

    move-result v6

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v7

    instance-of v8, v7, Lis/c;

    if-eqz v8, :cond_b

    invoke-virtual {v7}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    move-object v8, v7

    goto :goto_2

    :cond_b
    sget-object v8, Lis/c;->r0:Lis/c$b;

    invoke-virtual {p1}, Lvp/a1;->d()Les/s6$b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lis/c$b;->a(Les/s6$b;)Lis/c;

    move-result-object v8

    :goto_2
    if-eqz v6, :cond_d

    if-eqz v7, :cond_c

    new-instance v6, Lp5/p;

    invoke-direct {v6, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_c
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_3

    :cond_d
    if-eqz v7, :cond_e

    new-instance v6, Lp5/p;

    invoke-direct {v6, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_e
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v8, v0}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v8, Lis/c;

    new-instance p2, Lvp/b1;

    invoke-virtual {p1}, Lvp/a1;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v8}, Lvp/b1;-><init>(Ljava/lang/String;Lis/c;)V

    return-object p2

    :cond_f
    instance-of v0, p1, Lvp/o0;

    if-eqz v0, :cond_14

    check-cast p1, Lvp/o0;

    invoke-virtual {p1}, Lvp/o0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvp/o0;->b()Z

    move-result v6

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v7

    instance-of v8, v7, Lmp/c;

    if-eqz v8, :cond_10

    invoke-virtual {v7}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    move-object v8, v7

    goto :goto_4

    :cond_10
    sget-object v8, Lmp/c;->q0:Lmp/c$b;

    invoke-virtual {p1}, Lvp/o0;->d()Llp/v$b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lmp/c$b;->a(Llp/v$b;)Lmp/c;

    move-result-object v8

    :goto_4
    if-eqz v6, :cond_12

    if-eqz v7, :cond_11

    new-instance v6, Lp5/p;

    invoke-direct {v6, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_11
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_5

    :cond_12
    if-eqz v7, :cond_13

    new-instance v6, Lp5/p;

    invoke-direct {v6, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_13
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_5
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v8, v0}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v8, Lmp/c;

    new-instance p2, Lvp/p0;

    invoke-virtual {p1}, Lvp/o0;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v8}, Lvp/p0;-><init>(Ljava/lang/String;Lmp/c;)V

    return-object p2

    :cond_14
    instance-of v0, p1, Lvp/f;

    if-eqz v0, :cond_19

    check-cast p1, Lvp/f;

    invoke-virtual {p1}, Lvp/f;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvp/f;->b()Z

    move-result v6

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v7

    instance-of v8, v7, Lep/m;

    if-eqz v8, :cond_15

    invoke-virtual {v7}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    move-object v8, v7

    goto :goto_6

    :cond_15
    sget-object v8, Lep/m;->z0:Lep/m$b;

    invoke-virtual {p1}, Lvp/f;->d()Lvo/d2$a;

    move-result-object v9

    invoke-virtual {v8, v9}, Lep/m$b;->a(Lvo/d2$a;)Lep/m;

    move-result-object v8

    :goto_6
    if-eqz v6, :cond_17

    if-eqz v7, :cond_16

    new-instance v6, Lp5/p;

    invoke-direct {v6, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_16
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_7

    :cond_17
    if-eqz v7, :cond_18

    new-instance v6, Lp5/p;

    invoke-direct {v6, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_18
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_7
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v8, v0}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v8, Lep/m;

    new-instance p2, Lvp/g;

    invoke-virtual {p1}, Lvp/f;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v8}, Lvp/g;-><init>(Ljava/lang/String;Lep/m;)V

    return-object p2

    :cond_19
    instance-of v0, p1, Lvp/v0;

    if-eqz v0, :cond_1e

    check-cast p1, Lvp/v0;

    invoke-virtual {p1}, Lvp/v0;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvp/v0;->b()Z

    move-result v6

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v7

    instance-of v8, v7, Lsq/h;

    if-eqz v8, :cond_1a

    invoke-virtual {v7}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1a

    move-object v8, v7

    goto :goto_8

    :cond_1a
    sget-object v8, Lsq/h;->v0:Lsq/h$b;

    invoke-virtual {p1}, Lvp/v0;->d()Lmq/q5$b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lsq/h$b;->a(Lmq/q5$b;)Lsq/h;

    move-result-object v8

    :goto_8
    if-eqz v6, :cond_1c

    if-eqz v7, :cond_1b

    new-instance v6, Lp5/p;

    invoke-direct {v6, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_1b
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_9

    :cond_1c
    if-eqz v7, :cond_1d

    new-instance v6, Lp5/p;

    invoke-direct {v6, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_1d
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_9
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v8, v0}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v8, Lsq/h;

    new-instance p2, Lvp/w0;

    invoke-virtual {p1}, Lvp/v0;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v8}, Lvp/w0;-><init>(Ljava/lang/String;Lsq/h;)V

    return-object p2

    :cond_1e
    instance-of v0, p1, Lvp/b;

    if-eqz v0, :cond_23

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lvp/b;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvp/b;->b()Z

    move-result v6

    invoke-virtual {p2, p3}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v7

    instance-of v8, v7, Lqo/g;

    if-eqz v8, :cond_1f

    invoke-virtual {v7}, Lf4/q;->h0()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    move-object v8, v7

    goto :goto_a

    :cond_1f
    sget-object v8, Lqo/g;->r0:Lqo/g$b;

    invoke-virtual {p1}, Lvp/b;->d()Lno/u2$b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lqo/g$b;->a(Lno/u2$b;)Lqo/g;

    move-result-object v8

    :goto_a
    if-eqz v6, :cond_21

    if-eqz v7, :cond_20

    new-instance v6, Lp5/p;

    invoke-direct {v6, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_20
    new-instance v2, Lp5/p;

    invoke-direct {v2, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v2, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v2, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v2}, Lf4/q;->P1(Ljava/lang/Object;)V

    goto :goto_b

    :cond_21
    if-eqz v7, :cond_22

    new-instance v6, Lp5/p;

    invoke-direct {v6, v1}, Lp5/p;-><init>(I)V

    invoke-virtual {v6, v5}, Lp5/q;->B0(Lp5/z;)V

    invoke-virtual {v6, v2, v3}, Lp5/q;->C0(J)Lp5/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v6, v1}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v7, v6}, Lf4/q;->Q1(Ljava/lang/Object;)V

    :cond_22
    new-instance v1, Lp5/p;

    invoke-direct {v1, v4}, Lp5/p;-><init>(I)V

    invoke-virtual {v1, v5}, Lp5/q;->B0(Lp5/z;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Lp5/q;->z0(Landroid/animation/TimeInterpolator;)Lp5/q;

    invoke-virtual {v8, v1}, Lf4/q;->P1(Ljava/lang/Object;)V

    :goto_b
    invoke-virtual {p2}, Lf4/k0;->r()Lf4/t0;

    move-result-object p2

    invoke-virtual {p2, p3, v8, v0}, Lf4/t0;->o(ILf4/q;Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p2}, Lf4/t0;->j()V

    check-cast v8, Lqo/g;

    new-instance p2, Lvp/c;

    invoke-virtual {p1}, Lvp/b;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, v8}, Lvp/c;-><init>(Ljava/lang/String;Lqo/g;)V

    return-object p2

    :cond_23
    instance-of p2, p1, Lvp/a;

    if-eqz p2, :cond_24

    return-object v5

    :cond_24
    if-nez p1, :cond_25

    return-object v5

    :cond_25
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1
.end method

.method public final h(Lvp/s0;Lpp/c;Lf4/k0;)V
    .locals 2
    .param p1    # Lvp/s0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lpp/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lf4/k0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lvp/n0;->a:Lkq/c;

    invoke-virtual {v0}, Lkq/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lvp/n0;->i(Lpp/c;)V

    goto :goto_0

    :cond_1
    iget-object v0, p2, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lvp/n0;->c:Lvp/z0;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lvp/z0;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1}, Lvp/s0;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p2, p0, Lvp/n0;->c:Lvp/z0;

    goto :goto_2

    :cond_3
    iget-object p2, p2, Lpp/c;->c:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-virtual {p0, p1, p3, p2}, Lvp/n0;->g(Lvp/s0;Lf4/k0;I)Lvp/z0;

    move-result-object p2

    iput-object p2, p0, Lvp/n0;->c:Lvp/z0;

    :goto_2
    instance-of p3, p1, Lvp/c1;

    if-eqz p3, :cond_4

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepWorkflowRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/d1;

    invoke-virtual {p2}, Lvp/d1;->a()Lxp/b;

    move-result-object p2

    check-cast p1, Lvp/e1;

    invoke-virtual {p2, p1}, Lxp/b;->m2(Lvp/e1;)V

    return-void

    :cond_4
    instance-of p3, p1, Lvp/a1;

    if-eqz p3, :cond_5

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.UiStepRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/b1;

    invoke-virtual {p2}, Lvp/b1;->a()Lis/c;

    move-result-object p2

    check-cast p1, Lvp/a1;

    invoke-virtual {p1}, Lvp/a1;->d()Les/s6$b;

    move-result-object p3

    invoke-virtual {p1}, Lvp/a1;->getHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lis/c;->q2(Les/s6$b;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_5
    instance-of p3, p1, Lvp/u0;

    if-eqz p3, :cond_6

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.LoadingRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/t0;

    invoke-virtual {p2}, Lvp/t0;->a()Ltp/f;

    move-result-object p2

    check-cast p1, Lvp/u0;

    invoke-virtual {p2, p1}, Ltp/f;->s2(Lvp/u0;)V

    return-void

    :cond_6
    instance-of p3, p1, Lvp/a;

    if-nez p3, :cond_f

    instance-of p3, p1, Lvp/d;

    if-eqz p3, :cond_7

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentWorkflowRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/e;

    invoke-virtual {p2}, Lvp/e;->a()Lxp/b;

    move-result-object p2

    check-cast p1, Lvp/e1;

    invoke-virtual {p2, p1}, Lxp/b;->m2(Lvp/e1;)V

    return-void

    :cond_7
    instance-of p3, p1, Lvp/b;

    if-eqz p3, :cond_8

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.DocumentStepRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/c;

    invoke-virtual {p2}, Lvp/c;->a()Lqo/g;

    move-result-object p2

    check-cast p1, Lvp/b;

    invoke-virtual {p1}, Lvp/b;->d()Lno/u2$b;

    move-result-object p3

    invoke-virtual {p1}, Lvp/b;->getHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lqo/g;->w2(Lno/u2$b;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_8
    instance-of p3, p1, Lvp/h;

    if-eqz p3, :cond_9

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdWorkflowRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/i;

    invoke-virtual {p2}, Lvp/i;->a()Lxp/b;

    move-result-object p2

    check-cast p1, Lvp/e1;

    invoke-virtual {p2, p1}, Lxp/b;->m2(Lvp/e1;)V

    return-void

    :cond_9
    instance-of p3, p1, Lvp/f;

    if-eqz p3, :cond_a

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.GovernmentIdStepRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/g;

    invoke-virtual {p2}, Lvp/g;->a()Lep/m;

    move-result-object p2

    check-cast p1, Lvp/f;

    invoke-virtual {p1}, Lvp/f;->d()Lvo/d2$a;

    move-result-object p3

    invoke-virtual {p1}, Lvp/f;->getHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lep/m;->R2(Lvo/d2$a;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_a
    instance-of p3, p1, Lvp/o0;

    if-eqz p3, :cond_b

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationStepRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/p0;

    invoke-virtual {p2}, Lvp/p0;->a()Lmp/c;

    move-result-object p2

    check-cast p1, Lvp/o0;

    invoke-virtual {p1}, Lvp/o0;->d()Llp/v$b;

    move-result-object p3

    invoke-virtual {p1}, Lvp/o0;->getHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lmp/c;->r2(Llp/v$b;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_b
    instance-of p3, p1, Lvp/q0;

    if-eqz p3, :cond_c

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.IntegrationWorkflowRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/r0;

    invoke-virtual {p2}, Lvp/r0;->a()Lxp/b;

    move-result-object p2

    check-cast p1, Lvp/e1;

    invoke-virtual {p2, p1}, Lxp/b;->m2(Lvp/e1;)V

    return-void

    :cond_c
    instance-of p3, p1, Lvp/x0;

    if-eqz p3, :cond_d

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieWorkflowRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/y0;

    invoke-virtual {p2}, Lvp/y0;->a()Lxp/b;

    move-result-object p2

    check-cast p1, Lvp/e1;

    invoke-virtual {p2, p1}, Lxp/b;->m2(Lvp/e1;)V

    return-void

    :cond_d
    instance-of p3, p1, Lvp/v0;

    if-eqz p3, :cond_e

    const-string p3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.internal.state.SelfieStepRendering"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lvp/w0;

    invoke-virtual {p2}, Lvp/w0;->a()Lsq/h;

    move-result-object p2

    check-cast p1, Lvp/v0;

    invoke-virtual {p1}, Lvp/v0;->d()Lmq/q5$b;

    move-result-object p3

    invoke-virtual {p1}, Lvp/v0;->getHandler()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lsq/h;->J2(Lmq/q5$b;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_e
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_f
    return-void
.end method

.method public final i(Lpp/c;)V
    .locals 3

    invoke-virtual {p1}, Lpp/c;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p1, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    iget-object v1, p1, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v2, Lvp/h0;

    invoke-direct {v2, p0, p1}, Lvp/h0;-><init>(Lvp/n0;Lpp/c;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p1, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    new-instance v2, Lvp/i0;

    invoke-direct {v2, p0, v0}, Lvp/i0;-><init>(Lvp/n0;Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, p1, Lpp/c;->b:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    const-string v1, "floatingActionButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvp/j0;

    invoke-direct {v1, p1}, Lvp/j0;-><init>(Lpp/c;)V

    invoke-static {v0, v1}, Lkr/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final m(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lvp/n0;->b:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/app/Dialog;

    sget v1, Ljc/j;->d:I

    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Llq/a;->c(Landroid/view/LayoutInflater;)Llq/a;

    move-result-object p1

    const-string v1, "inflate(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llq/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    iget-object v1, p1, Llq/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    const-string v2, "Sandbox options"

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Llq/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    sget v2, Lxq/s;->u:I

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    iget-object v1, p1, Llq/a;->c:Lcom/google/android/material/appbar/MaterialToolbar;

    new-instance v2, Lvp/k0;

    invoke-direct {v2, v0}, Lvp/k0;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p1, Llq/a;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    iget-object v2, p0, Lvp/n0;->a:Lkq/c;

    invoke-virtual {v2}, Lkq/c;->b()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p1, p1, Llq/a;->b:Lcom/google/android/material/materialswitch/MaterialSwitch;

    new-instance v1, Lvp/l0;

    invoke-direct {v1, p0}, Lvp/l0;-><init>(Lvp/n0;)V

    invoke-virtual {p1, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    new-instance p1, Lvp/m0;

    invoke-direct {p1, p0}, Lvp/m0;-><init>(Lvp/n0;)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-object v0, p0, Lvp/n0;->b:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
