.class public final Lhq/c;
.super Lcr/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhq/c$b;,
        Lhq/c$c;,
        Lhq/c$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcr/c<",
        "Lgq/b;",
        "Liq/l$f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%&\'B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006("
    }
    d2 = {
        "Lhq/c;",
        "Lcr/c;",
        "Lgq/b;",
        "Liq/l$f;",
        "<init>",
        "()V",
        "Landroid/view/View;",
        "view",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "e1",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "rendering",
        "o2",
        "(Liq/l$f;)V",
        "Lhq/c$c;",
        "j0",
        "Lyq/c;",
        "l2",
        "()Lhq/c$c;",
        "args",
        "Lhq/f$a;",
        "k0",
        "Lhq/f$a;",
        "n2",
        "()Lhq/f$a;",
        "setViewModelFactory",
        "(Lhq/f$a;)V",
        "viewModelFactory",
        "Lhq/f;",
        "l0",
        "Lzt/h;",
        "m2",
        "()Lhq/f;",
        "viewModel",
        "m0",
        "b",
        "c",
        "d",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final m0:Lhq/c$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final j0:Lyq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public k0:Lhq/f$a;

.field public final l0:Lzt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhq/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhq/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhq/c;->m0:Lhq/c$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget-object v0, Lhq/c$a;->a:Lhq/c$a;

    invoke-direct {p0, v0}, Lcr/c;-><init>(Lpu/n;)V

    new-instance v0, Lyq/c;

    const-class v1, Lhq/c$c;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    new-instance v2, Lhq/c$g;

    invoke-direct {v2, p0}, Lhq/c$g;-><init>(Lf4/q;)V

    invoke-direct {v0, v1, v2}, Lyq/c;-><init>(Lxu/c;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lhq/c;->j0:Lyq/c;

    new-instance v0, Lhq/a;

    invoke-direct {v0, p0}, Lhq/a;-><init>(Lhq/c;)V

    new-instance v1, Lhq/c$h;

    invoke-direct {v1, p0, v0}, Lhq/c$h;-><init>(Lf4/q;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lhq/c$i;

    invoke-direct {v0, p0}, Lhq/c$i;-><init>(Lf4/q;)V

    sget-object v2, Lzt/k;->c:Lzt/k;

    new-instance v3, Lhq/c$j;

    invoke-direct {v3, v0}, Lhq/c$j;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {v2, v3}, Lzt/i;->b(Lzt/k;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    const-class v2, Lhq/f;

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v2

    new-instance v3, Lhq/c$k;

    invoke-direct {v3, v0}, Lhq/c$k;-><init>(Lzt/h;)V

    new-instance v4, Lhq/c$l;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v0}, Lhq/c$l;-><init>(Lkotlin/jvm/functions/Function0;Lzt/h;)V

    invoke-static {p0, v2, v3, v4, v1}, Lf4/y0;->b(Lf4/q;Lxu/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lzt/h;

    move-result-object v0

    iput-object v0, p0, Lhq/c;->l0:Lzt/h;

    return-void
.end method

.method public static synthetic i2(Lhq/c;Landroidx/lifecycle/l0;)Lhq/f;
    .locals 0

    invoke-static {p0, p1}, Lhq/c;->q2(Lhq/c;Landroidx/lifecycle/l0;)Lhq/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j2(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lhq/c;->p2(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V

    return-void
.end method

.method public static final synthetic k2(Lhq/c;)Lhq/c$c;
    .locals 0

    invoke-virtual {p0}, Lhq/c;->l2()Lhq/c$c;

    move-result-object p0

    return-object p0
.end method

.method public static final p2(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lfq/i;->b()Lfq/n0;

    move-result-object p0

    sget-object v0, Lfq/n0;->b:Lfq/n0;

    if-ne p0, v0, :cond_1

    invoke-virtual {p1}, Lfq/i;->c()Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p1}, Lfq/i;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    invoke-virtual {p1}, Lfq/i;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-virtual {p1}, Lfq/i;->b()Lfq/n0;

    move-result-object p1

    invoke-static {p1}, Lfq/x1;->c(Lfq/n0;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lk2/b;->v(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final q2(Lhq/c;Landroidx/lifecycle/l0;)Lhq/f;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhq/c;->n2()Lhq/f$a;

    move-result-object p0

    invoke-interface {p0, p1}, Lhq/f$a;->a(Landroidx/lifecycle/l0;)Lhq/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e1(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcr/c;->e1(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lhq/c;->m2()Lhq/f;

    move-result-object p1

    invoke-virtual {p0}, Lhq/c;->l2()Lhq/c$c;

    move-result-object p2

    invoke-virtual {p2}, Lhq/c$c;->a()Lfq/n1$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lhq/f;->e(Lfq/n1$c;)Liq/l;

    move-result-object p1

    invoke-virtual {p0}, Lf4/q;->H1()Lf4/v;

    move-result-object p2

    invoke-virtual {p2}, Le/p;->P()Le/p0;

    move-result-object p2

    invoke-virtual {p0}, Lf4/q;->k0()Landroidx/lifecycle/s;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lhq/c$e;

    invoke-direct {v2, p1, p0}, Lhq/c$e;-><init>(Liq/l;Lhq/c;)V

    invoke-virtual {p2, v0, v2}, Le/p0;->d(Landroidx/lifecycle/s;Le/m0;)V

    invoke-virtual {p1}, Lls/d;->c()Ldv/c0;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcr/c;->g2(Ldv/p0;)V

    invoke-virtual {p0}, Lf4/q;->k0()Landroidx/lifecycle/s;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v2

    new-instance v5, Lhq/c$f;

    const/4 p2, 0x0

    invoke-direct {v5, p1, p0, p2}, Lhq/c$f;-><init>(Liq/l;Lhq/c;Leu/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    return-void
.end method

.method public bridge synthetic h2(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Liq/l$f;

    invoke-virtual {p0, p1}, Lhq/c;->o2(Liq/l$f;)V

    return-void
.end method

.method public final l2()Lhq/c$c;
    .locals 1

    iget-object v0, p0, Lhq/c;->j0:Lyq/c;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq/c$c;

    return-object v0
.end method

.method public final m2()Lhq/f;
    .locals 1

    iget-object v0, p0, Lhq/c;->l0:Lzt/h;

    invoke-interface {v0}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq/f;

    return-object v0
.end method

.method public final n2()Lhq/f$a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lhq/c;->k0:Lhq/f$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "viewModelFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public o2(Liq/l$f;)V
    .locals 3
    .param p1    # Liq/l$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lyq/a;->b2()Ls5/a;

    move-result-object v0

    check-cast v0, Lgq/b;

    iget-object v0, v0, Lgq/b;->b:Landroid/widget/FrameLayout;

    const-string v1, "content"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    instance-of v1, p1, Liq/l$f$a;

    if-eqz v1, :cond_0

    check-cast p1, Liq/l$f$a;

    invoke-virtual {p1}, Liq/l$f$a;->a()Lfq/h;

    invoke-virtual {p0}, Lyq/a;->v()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lgq/c;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgq/c;

    move-result-object v0

    const-string v1, "inflate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Liq/l$f$a;->a()Lfq/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lfq/h;->i(Lgq/c;)V

    invoke-virtual {p1}, Liq/l$f$a;->a()Lfq/h;

    move-result-object v1

    invoke-virtual {p1}, Liq/l$f$a;->a()Lfq/h;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lfq/h;->n(Lgq/c;Lfq/h;)V

    return-void

    :cond_0
    instance-of v1, p1, Liq/l$f$b;

    if-eqz v1, :cond_2

    check-cast p1, Liq/l$f$b;

    invoke-virtual {p1}, Liq/l$f$b;->a()Lfq/i;

    move-result-object p1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lxq/g;->h(Landroid/content/Context;)Lj/b;

    move-result-object v1

    invoke-virtual {p1}, Lfq/i;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, Lhq/b;

    invoke-direct {v2, v0, p1, v1}, Lhq/b;-><init>(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :cond_2
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1
.end method
