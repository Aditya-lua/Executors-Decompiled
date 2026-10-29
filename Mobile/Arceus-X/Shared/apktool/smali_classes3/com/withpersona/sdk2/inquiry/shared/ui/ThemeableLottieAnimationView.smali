.class public final Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;
.super Lcom/airbnb/lottie/LottieAnimationView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001d\u0008\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;",
        "Lcom/airbnb/lottie/LottieAnimationView;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "srcColor",
        "destColor",
        "",
        "F",
        "(II)V",
        "",
        "url",
        "Lku/d2;",
        "G",
        "(Ljava/lang/String;)Lku/d2;",
        "onDetachedFromWindow",
        "()V",
        "",
        "s",
        "Ljava/util/Map;",
        "srcColorToDestColor",
        "Lku/p0;",
        "t",
        "Lku/p0;",
        "scope",
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


# instance fields
.field public final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Lcom/airbnb/lottie/LottieAnimationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->s:Ljava/util/Map;

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->t:Lku/p0;

    new-instance p1, Lwq/u;

    invoke-direct {p1, p0}, Lwq/u;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;)V

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->j(Lf7/n0;)Z

    return-void
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lf7/i;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->D(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lf7/i;)V

    return-void
.end method

.method public static final D(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lf7/i;)V
    .locals 3

    new-instance p1, Ll7/e;

    const-string v0, "**"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ll7/e;-><init>([Ljava/lang/String;)V

    sget-object v1, Lf7/o0;->a:Ljava/lang/Integer;

    new-instance v2, Lwq/v;

    invoke-direct {v2, p0}, Lwq/v;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;)V

    invoke-virtual {p0, p1, v1, v2}, Lcom/airbnb/lottie/LottieAnimationView;->k(Ll7/e;Ljava/lang/Object;Lt7/c;)V

    new-instance p1, Ll7/e;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll7/e;-><init>([Ljava/lang/String;)V

    sget-object v0, Lf7/o0;->b:Ljava/lang/Integer;

    new-instance v1, Lwq/w;

    invoke-direct {v1, p0}, Lwq/w;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->k(Ll7/e;Ljava/lang/Object;Lt7/c;)V

    return-void
.end method

.method public static final synthetic E(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->s:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final F(II)V
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final G(Ljava/lang/String;)Lku/d2;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->t:Lku/p0;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    return-object p1
.end method

.method public onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;->t:Lku/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method
