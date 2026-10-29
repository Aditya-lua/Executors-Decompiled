.class public final Ljq/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a)\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a.\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u000e*\u00020\r*\u00020\u000f2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0082\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\",\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00002\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Landroid/view/View;",
        "Le/r0;",
        "c",
        "(Landroid/view/View;)Le/r0;",
        "",
        "enabled",
        "Lkotlin/Function0;",
        "",
        "onBack",
        "f",
        "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V",
        "e",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V",
        "",
        "T",
        "Landroid/content/Context;",
        "Lhu/c;",
        "ownerClass",
        "d",
        "(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;",
        "Ljq/p;",
        "value",
        "b",
        "(Landroid/view/View;)Ljq/p;",
        "h",
        "(Landroid/view/View;Ljq/p;)V",
        "onBackPressedCallbackOrNull",
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
.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Ljq/m0;->g()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Landroid/view/View;)Ljq/p;
    .locals 1

    sget v0, Ljq/t;->u:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljq/p;

    return-object p0
.end method

.method public static final c(Landroid/view/View;)Le/r0;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Le/w0;->a(Landroid/view/View;)Le/r0;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "getContext(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Le/r0;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v0

    invoke-static {p0, v0}, Ljq/m0;->d(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/r0;

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final d(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Lhu/c<",
            "TT;>;)TT;"
        }
    .end annotation

    :goto_0
    invoke-interface {p1, p0}, Lhu/c;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p0}, Lhu/d;->a(Lhu/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public static final e(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Ljq/m0;->f(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V

    return-void

    :cond_0
    new-instance p1, Ljq/l0;

    invoke-direct {p1}, Ljq/l0;-><init>()V

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Ljq/m0;->f(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final f(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V
    .locals 4
    .param p0    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljq/m0;->b(Landroid/view/View;)Ljq/p;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljq/p;

    invoke-direct {v0}, Ljq/p;-><init>()V

    invoke-static {p0, v0}, Ljq/m0;->h(Landroid/view/View;Ljq/p;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-static {p0}, Ljq/m0;->c(Landroid/view/View;)Le/r0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Le/r0;->Q()Le/p0;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "."

    if-eqz v1, :cond_2

    invoke-static {p0}, Landroidx/lifecycle/d1;->a(Landroid/view/View;)Landroidx/lifecycle/s;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v3, v0}, Le/p0;->d(Landroidx/lifecycle/s;Le/m0;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unable to find a ViewTreeLifecycleOwner for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unable to find a onBackPressedDispatcherOwner for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {v0, p1}, Le/m0;->setEnabled(Z)V

    invoke-virtual {v0, p2}, Ljq/p;->s(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final g()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final h(Landroid/view/View;Ljq/p;)V
    .locals 1

    sget v0, Ljq/t;->u:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
