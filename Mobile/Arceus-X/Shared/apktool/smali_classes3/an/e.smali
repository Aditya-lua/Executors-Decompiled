.class public final Lan/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\u0010\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"J\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007*\u00020\u00042\u0014\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000c\" \u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0083\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0011\u0010\u0012*\u0018\u0008\u0007\u0010\u0015\"\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroid/content/Context;",
        "Le/r0;",
        "b",
        "(Landroid/content/Context;)Le/r0;",
        "Landroid/view/View;",
        "Lkotlin/Function0;",
        "",
        "Lcom/squareup/workflow1/ui/BackPressHandler;",
        "value",
        "getBackPressedHandler",
        "(Landroid/view/View;)Lkotlin/jvm/functions/Function0;",
        "c",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V",
        "getBackPressedHandler$annotations",
        "(Landroid/view/View;)V",
        "backPressedHandler",
        "Lan/j;",
        "a",
        "(Landroid/view/View;)Lan/j;",
        "getHandlerWrapperOrNull$annotations",
        "handlerWrapperOrNull",
        "BackPressHandler",
        "wf1-core-android"
    }
    k = 0x2
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/view/View;)Lan/j;
    .locals 1

    sget v0, Lan/o;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lan/j;

    return-object p0
.end method

.method public static final b(Landroid/content/Context;)Le/r0;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    instance-of v0, p0, Le/r0;

    if-eqz v0, :cond_1

    check-cast p0, Le/r0;

    return-object p0

    :cond_1
    instance-of v0, p0, Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Landroid/content/ContextWrapper;

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v1
.end method

.method public static final c(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V
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

    invoke-static {p0}, Lan/e;->a(Landroid/view/View;)Lan/j;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lan/j;->c()V

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    new-instance v0, Lan/j;

    invoke-direct {v0, p0, p1}, Lan/j;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lan/j;->b()V

    move-object p1, v0

    :goto_1
    sget v0, Lan/o;->c:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
