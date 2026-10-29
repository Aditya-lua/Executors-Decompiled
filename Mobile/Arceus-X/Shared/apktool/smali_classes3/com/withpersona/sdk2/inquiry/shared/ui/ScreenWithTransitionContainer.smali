.class public Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;,
        Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;,
        Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0017\u0018\u0000 \u00102\u00020\u0001:\u0002,#B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u000f2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0014\u00a2\u0006\u0004\u0008!\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001c\u0010(\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\'R\u0016\u0010+\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;",
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
        "Lwq/m;",
        "newRendering",
        "Lan/y;",
        "newViewEnvironment",
        "",
        "c",
        "(Lwq/m;Lan/y;)V",
        "Landroid/view/View;",
        "oldViewMaybe",
        "newView",
        "Lwq/l;",
        "transition",
        "b",
        "(Landroid/view/View;Landroid/view/View;Lwq/l;)V",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "state",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "onAttachedToWindow",
        "()V",
        "onDetachedFromWindow",
        "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;",
        "a",
        "Lcom/squareup/workflow1/ui/backstack/ViewStateCache;",
        "viewStateCache",
        "Lan/m;",
        "Lan/m;",
        "currentRendering",
        "getCurrentView",
        "()Landroid/view/View;",
        "currentView",
        "SavedState",
        "shared_release"
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
.field public static final c:Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lan/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan/m<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->c:Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$a;

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
    new-instance p1, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-direct {p1}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->d(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final d(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 3

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "doStart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbn/d;->yo:Lbn/d$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2, v1}, Lbn/d$a;->e(Lbn/d$a;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final getCurrentView()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public b(Landroid/view/View;Landroid/view/View;Lwq/l;)V
    .locals 4
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

    const v0, 0x800003

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x800005

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "newView"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "transition"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    sget v2, Ldn/a;->a:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    move-object p1, v3

    goto :goto_0

    :cond_0
    move-object v2, p2

    :goto_0
    sget-object v3, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v3, p3

    const/4 v3, 0x1

    if-eq p3, v3, :cond_3

    const/4 v3, 0x2

    if-eq p3, v3, :cond_2

    const/4 p1, 0x3

    if-ne p3, p1, :cond_1

    new-instance p1, Lo5/n;

    invoke-direct {p1, p0, p2}, Lo5/n;-><init>(Landroid/view/ViewGroup;Landroid/view/View;)V

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lo5/y;->f(Lo5/n;Lo5/q;)V

    return-void

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_2
    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    goto :goto_1

    :cond_3
    invoke-static {v0, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    :goto_1
    invoke-virtual {p3}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p3}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    new-instance v1, Lo5/b0;

    invoke-direct {v1}, Lo5/b0;-><init>()V

    new-instance v3, Lo5/p;

    invoke-direct {v3, v0}, Lo5/p;-><init>(I)V

    invoke-virtual {v3, p1}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance v0, Lo5/p;

    invoke-direct {v0, p3}, Lo5/p;-><init>(I)V

    invoke-virtual {v0, v2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p3

    invoke-virtual {p1, p3}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    new-instance p3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, p3}, Lo5/b0;->L0(Landroid/animation/TimeInterpolator;)Lo5/b0;

    move-result-object p1

    const-string p3, "setInterpolator(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lo5/y;->d(Landroid/view/ViewGroup;)V

    new-instance p3, Lo5/n;

    invoke-direct {p3, p0, p2}, Lo5/n;-><init>(Landroid/view/ViewGroup;Landroid/view/View;)V

    invoke-static {p3, p1}, Lo5/y;->f(Lo5/n;Lo5/q;)V

    return-void

    :cond_4
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final c(Lwq/m;Lan/y;)V
    .locals 7
    .param p1    # Lwq/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "newRendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newViewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcn/a;->d:Lcn/a;

    sget-object v1, Lcn/a;->a:Lcn/a$a;

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {p2, v0}, Lan/y;->c(Lkotlin/Pair;)Lan/y;

    move-result-object v3

    new-instance v2, Lan/m;

    invoke-virtual {p1}, Lwq/m;->a()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "screen_with_transition"

    invoke-direct {v2, p2, v0}, Lan/m;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->getCurrentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2, v2}, Lan/e0;->b(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;->d(Ljava/util/Collection;)V

    invoke-static {v0, v2, v3}, Lan/e0;->g(Landroid/view/View;Ljava/lang/Object;Lan/y;)V

    return-void

    :cond_1
    sget-object v0, Lan/c0;->a:Lan/c0$a;

    invoke-virtual {v3, v0}, Lan/y;->a(Lan/z;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lan/c0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v0, "getContext(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lwq/n;

    invoke-direct {v6}, Lwq/n;-><init>()V

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Lan/d0;->c(Lan/c0;Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;Lan/f0;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lan/e0;->h(Landroid/view/View;)V

    invoke-virtual {p1}, Lwq/m;->b()Lwq/l;

    move-result-object p1

    invoke-virtual {p0, p2, v0, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->b(Landroid/view/View;Landroid/view/View;Lwq/l;)V

    if-eqz p2, :cond_2

    sget-object p1, Lbn/d;->yo:Lbn/d$a;

    invoke-virtual {p1, p2}, Lbn/d$a;->c(Landroid/view/View;)Lbn/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lbn/d;->L()V

    :cond_2
    iput-object v2, v5, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->b:Lan/m;

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    sget-object v0, Lbn/c;->a:Lbn/c;

    invoke-virtual {v0, p0}, Lbn/c;->c(Landroid/view/View;)Ld5/i;

    move-result-object v0

    sget-object v1, Lan/g;->a:Lan/g$a;

    invoke-static {p0}, Lan/h0;->d(Landroid/view/View;)Lan/g0;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lan/g0;->c()Ljava/lang/Object;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lan/g$a;->b(Lan/g$a;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-virtual {v2, v1, v0}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;->a(Ljava/lang/String;Ld5/i;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-virtual {v0}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;->b()V

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

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;->a()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;->f(Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;

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

    new-instance v1, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer;->a:Lcom/squareup/workflow1/ui/backstack/ViewStateCache;

    invoke-virtual {v2}, Lcom/squareup/workflow1/ui/backstack/ViewStateCache;->g()Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransitionContainer$SavedState;-><init>(Landroid/os/Parcelable;Lcom/squareup/workflow1/ui/backstack/ViewStateCache$Saved;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
