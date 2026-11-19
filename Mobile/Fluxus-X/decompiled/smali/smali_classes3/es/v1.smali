.class public final Les/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Les/v1;",
        "",
        "Landroid/view/ViewGroup;",
        "contentView",
        "<init>",
        "(Landroid/view/ViewGroup;)V",
        "Lqr/g5;",
        "sheetComponent",
        "Lnn/z;",
        "viewEnvironment",
        "",
        "g",
        "(Lqr/g5;Lnn/z;)V",
        "f",
        "()V",
        "a",
        "Landroid/view/ViewGroup;",
        "Lor/s;",
        "b",
        "Lor/s;",
        "currentBottomSheet",
        "c",
        "Lqr/g5;",
        "d",
        "()Lqr/g5;",
        "setCurrentSheetComponent",
        "(Lqr/g5;)V",
        "currentSheetComponent",
        "Lor/j;",
        "e",
        "()Lor/j;",
        "uiScreenGenerationResult",
        "ui_release"
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
.field public final a:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lor/s;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lqr/g5;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/v1;->a:Landroid/view/ViewGroup;

    return-void
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Les/v1;->h()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lkotlin/jvm/internal/c0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Les/v1;->i(Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqr/g5;Les/v1;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Les/v1;->j(Lqr/g5;Les/v1;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final i(Lkotlin/jvm/internal/c0;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lqr/g5;Les/v1;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lqr/g5;->e1(Z)V

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lqr/g5;->s2(Z)V

    iget-object p0, p1, Les/v1;->a:Landroid/view/ViewGroup;

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 p0, 0x0

    iput-object p0, p1, Les/v1;->c:Lqr/g5;

    iput-object p0, p1, Les/v1;->b:Lor/s;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final d()Lqr/g5;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Les/v1;->c:Lqr/g5;

    return-object v0
.end method

.method public final e()Lor/j;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Les/v1;->b:Lor/s;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lor/s;->i()Lor/j;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Les/v1;->b:Lor/s;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lor/s;->h()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X0(I)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Les/v1;->c:Lqr/g5;

    return-void
.end method

.method public final g(Lqr/g5;Lnn/z;)V
    .locals 8
    .param p1    # Lqr/g5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sheetComponent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Les/v1;->c:Lqr/g5;

    new-instance v0, Lkotlin/jvm/internal/c0;

    invoke-direct {v0}, Lkotlin/jvm/internal/c0;-><init>()V

    new-instance v1, Les/s1;

    invoke-direct {v1}, Les/s1;-><init>()V

    iput-object v1, v0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance v2, Lor/s;

    invoke-interface {p1}, Lqr/g5;->a1()Lor/i;

    move-result-object v3

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    new-instance v5, Les/t1;

    invoke-direct {v5, v0}, Les/t1;-><init>(Lkotlin/jvm/internal/c0;)V

    const/4 v6, 0x0

    invoke-interface {p1}, Lqr/g5;->k1()Z

    move-result v7

    invoke-direct/range {v2 .. v7}, Lor/s;-><init>(Lor/i;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Z)V

    iput-object v2, p0, Les/v1;->b:Lor/s;

    invoke-virtual {v2}, Lor/s;->a()Lnn/b0;

    move-result-object v1

    iget-object v3, p0, Les/v1;->a:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Les/v1;->a:Landroid/view/ViewGroup;

    invoke-interface {v1, v2, p2, v3, v4}, Lnn/b0;->a(Ljava/lang/Object;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    iget-object v1, p0, Les/v1;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {p2}, Lnn/f0;->h(Landroid/view/View;)V

    new-instance v1, Les/u1;

    invoke-direct {v1, p1, p0, p2}, Les/u1;-><init>(Lqr/g5;Les/v1;Landroid/view/View;)V

    iput-object v1, v0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    return-void
.end method
