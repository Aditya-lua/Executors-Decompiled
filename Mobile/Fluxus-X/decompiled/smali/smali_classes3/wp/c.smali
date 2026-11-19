.class public final Lwp/c;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwp/c$a;,
        Lwp/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 (2\u00020\u0001:\u0002\u001c\u001fB1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010#R\u0016\u0010\'\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006)"
    }
    d2 = {
        "Lwp/c;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "",
        "defStyle",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "Lwp/d;",
        "newRendering",
        "Lnn/z;",
        "newViewEnvironment",
        "",
        "d",
        "(Lwp/d;Lnn/z;)V",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "state",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "onAttachedToWindow",
        "()V",
        "onDetachedFromWindow",
        "Landroid/view/View;",
        "b",
        "(Lwp/d;Lnn/z;)Landroid/view/View;",
        "Lpp/b;",
        "a",
        "Lpp/b;",
        "binding",
        "Lpn/e;",
        "Lpn/e;",
        "viewStateCache",
        "getCurrentView",
        "()Landroid/view/View;",
        "currentView",
        "c",
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


# static fields
.field public static final c:Lwp/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lpp/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lpn/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwp/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwp/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwp/c;->c:Lwp/c$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lpp/b;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpp/b;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwp/c;->a:Lpp/b;

    .line 4
    new-instance p1, Lpn/e;

    invoke-direct {p1}, Lpn/e;-><init>()V

    iput-object p1, p0, Lwp/c;->b:Lpn/e;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 1
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lwp/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1}, Lwp/c;->c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lon/d;->Po:Lon/d$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Lon/d$a;->e(Lon/d$a;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final getCurrentView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lwp/c;->a:Lpp/b;

    iget-object v0, v0, Lpp/b;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lwp/c;->a:Lpp/b;

    iget-object v0, v0, Lpp/b;->c:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final b(Lwp/d;Lnn/z;)Landroid/view/View;
    .locals 6

    new-instance v1, Lnn/m;

    invoke-virtual {p1}, Lwp/d;->a()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "disableable_container"

    invoke-direct {v1, p1, v0}, Lnn/m;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwp/c;->getCurrentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1, v1}, Lnn/f0;->b(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lwp/c;->b:Lpn/e;

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {p1, v2}, Lpn/e;->d(Ljava/util/Collection;)V

    invoke-static {v0, v1, p2}, Lnn/f0;->g(Landroid/view/View;Ljava/lang/Object;Lnn/z;)V

    return-object v0

    :cond_1
    sget-object v0, Lnn/d0;->a:Lnn/d0$a;

    invoke-virtual {p2, v0}, Lnn/z;->a(Lnn/a0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnn/d0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v2, "getContext(...)"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lwp/a;

    invoke-direct {v5}, Lwp/a;-><init>()V

    move-object v4, p0

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lnn/e0;->c(Lnn/d0;Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;Lnn/g0;)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lnn/f0;->h(Landroid/view/View;)V

    iget-object v0, v4, Lwp/c;->b:Lpn/e;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1, p1, p2}, Lpn/e;->h(Ljava/util/Collection;Landroid/view/View;Landroid/view/View;)V

    iget-object v0, v4, Lwp/c;->a:Lpp/b;

    iget-object v0, v0, Lpp/b;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, v4, Lwp/c;->a:Lpp/b;

    iget-object v0, v0, Lpp/b;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    if-eqz p1, :cond_2

    sget-object v0, Lon/d;->Po:Lon/d$a;

    invoke-virtual {v0, p1}, Lon/d$a;->c(Landroid/view/View;)Lon/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lon/d;->K()V

    :cond_2
    return-object p2
.end method

.method public final d(Lwp/d;Lnn/z;)V
    .locals 1
    .param p1    # Lwp/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lwp/c;->b(Lwp/d;Lnn/z;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1}, Lwp/d;->b()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lwp/c;->a:Lpp/b;

    iget-object p1, p1, Lpp/b;->b:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lwp/c;->a:Lpp/b;

    iget-object p1, p1, Lpp/b;->b:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    sget-object v0, Lon/c;->a:Lon/c;

    invoke-virtual {v0, p0}, Lon/c;->c(Landroid/view/View;)Le5/i;

    move-result-object v0

    sget-object v1, Lnn/g;->a:Lnn/g$a;

    invoke-static {p0}, Lnn/j0;->d(Landroid/view/View;)Lnn/i0;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lnn/i0;->c()Ljava/lang/Object;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lnn/g$a;->b(Lnn/g$a;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lwp/c;->b:Lpn/e;

    invoke-virtual {v2, v1, v0}, Lpn/e;->a(Ljava/lang/String;Le5/i;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lwp/c;->b:Lpn/e;

    invoke-virtual {v0}, Lpn/e;->b()V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2
    .param p1    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwp/c$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwp/c$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lwp/c;->b:Lpn/e;

    invoke-virtual {v0}, Lwp/c$b;->a()Lpn/e$a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpn/e;->f(Lpn/e$a;)V

    check-cast p1, Lwp/c$b;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lwp/c$b;

    iget-object v2, p0, Lwp/c;->b:Lpn/e;

    invoke-virtual {v2}, Lpn/e;->g()Lpn/e$a;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lwp/c$b;-><init>(Landroid/os/Parcelable;Lpn/e$a;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
