.class public final Ljq/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljq/i0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Landroid/view/ViewGroup;",
        "Landroid/view/View;",
        "oldViewMaybe",
        "newView",
        "Lwq/l;",
        "transition",
        "",
        "a",
        "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Lwq/l;)V",
        "shared_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Lwq/l;)V
    .locals 4
    .param p0    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lwq/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transition"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    sget-object v0, Ljq/i0$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    const/4 v0, 0x2

    const-string v1, "setInterpolator(...)"

    const v2, 0x800003

    const v3, 0x800005

    if-eq p3, v0, :cond_1

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    new-instance p3, Lo5/b0;

    invoke-direct {p3}, Lo5/b0;-><init>()V

    new-instance v0, Lo5/p;

    invoke-direct {v0, v3}, Lo5/p;-><init>(I)V

    invoke-virtual {v0, p1}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p1

    invoke-virtual {p3, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance p3, Lo5/p;

    invoke-direct {p3, v2}, Lo5/p;-><init>(I)V

    invoke-virtual {p3, p2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p3

    invoke-virtual {p1, p3}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance p3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, p3}, Lo5/b0;->L0(Landroid/animation/TimeInterpolator;)Lo5/b0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo5/y;->d(Landroid/view/ViewGroup;)V

    new-instance p3, Lo5/n;

    invoke-direct {p3, p0, p2}, Lo5/n;-><init>(Landroid/view/ViewGroup;Landroid/view/View;)V

    invoke-static {p3, p1}, Lo5/y;->f(Lo5/n;Lo5/q;)V

    return-void

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    new-instance p3, Lo5/b0;

    invoke-direct {p3}, Lo5/b0;-><init>()V

    new-instance v0, Lo5/p;

    invoke-direct {v0, v2}, Lo5/p;-><init>(I)V

    invoke-virtual {v0, p1}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p1

    invoke-virtual {p3, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance p3, Lo5/p;

    invoke-direct {p3, v3}, Lo5/p;-><init>(I)V

    invoke-virtual {p3, p2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p3

    invoke-virtual {p1, p3}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance p3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, p3}, Lo5/b0;->L0(Landroid/animation/TimeInterpolator;)Lo5/b0;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo5/y;->d(Landroid/view/ViewGroup;)V

    new-instance p3, Lo5/n;

    invoke-direct {p3, p0, p2}, Lo5/n;-><init>(Landroid/view/ViewGroup;Landroid/view/View;)V

    invoke-static {p3, p1}, Lo5/y;->f(Lo5/n;Lo5/q;)V

    return-void

    :cond_2
    new-instance p1, Lo5/n;

    invoke-direct {p1, p0, p2}, Lo5/n;-><init>(Landroid/view/ViewGroup;Landroid/view/View;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lo5/y;->f(Lo5/n;Lo5/q;)V

    :cond_3
    return-void
.end method
