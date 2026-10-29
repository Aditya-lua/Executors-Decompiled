.class public final Lzi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a,\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;",
        "Landroid/graphics/Bitmap;",
        "thumbnail",
        "Landroid/content/Context;",
        "context",
        "Lm2/c;",
        "d",
        "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;",
        "Landroidx/core/graphics/drawable/IconCompat;",
        "b",
        "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;",
        "Lcom/roblox/client/ossearch/c;",
        "cache",
        "Lku/l0;",
        "ioDispatcher",
        "Lzi/e;",
        "c",
        "(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;",
        "",
        "a",
        "(Landroid/content/Context;)I",
        "NativeShell_googleProdRelease"
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
.method public static final a(Landroid/content/Context;)I
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm2/e;->b(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lm2/e;->f(Landroid/content/Context;I)Ljava/util/List;

    move-result-object p0

    const-string v1, "getShortcuts(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method public static final b(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->K0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/p0;->a:I

    invoke-static {p0, v0}, Landroidx/core/graphics/drawable/IconCompat;->d(Landroid/content/Context;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lcom/roblox/client/ossearch/c;Lku/l0;Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 10
    .param p0    # Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/roblox/client/ossearch/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;",
            "Lcom/roblox/client/ossearch/c;",
            "Lku/l0;",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lzi/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p4, Lzi/a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lzi/a$a;

    iget v1, v0, Lzi/a$a;->C:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzi/a$a;->C:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzi/a$a;

    invoke-direct {v0, p4}, Lzi/a$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p4, v0, Lzi/a$a;->B:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lzi/a$a;->C:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lzi/a$a;->z:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    iget-object p0, v0, Lzi/a$a;->y:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    iget-object p1, v0, Lzi/a$a;->x:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p1, v0, Lzi/a$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object p1, v0, Lzi/a$a;->v:Ljava/lang/Object;

    check-cast p1, Lku/l0;

    iget-object p1, v0, Lzi/a$a;->u:Ljava/lang/Object;

    check-cast p1, Lcom/roblox/client/ossearch/c;

    iget-object p1, v0, Lzi/a$a;->t:Ljava/lang/Object;

    check-cast p1, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v6, p0

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lzi/a$a;->x:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    iget-object p1, v0, Lzi/a$a;->w:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object p2, v0, Lzi/a$a;->v:Ljava/lang/Object;

    check-cast p2, Lku/l0;

    iget-object p3, v0, Lzi/a$a;->u:Ljava/lang/Object;

    check-cast p3, Lcom/roblox/client/ossearch/c;

    iget-object v2, v0, Lzi/a$a;->t:Ljava/lang/Object;

    check-cast v2, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p0, v0, Lzi/a$a;->w:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Landroid/content/Context;

    iget-object p0, v0, Lzi/a$a;->v:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lku/l0;

    iget-object p0, v0, Lzi/a$a;->u:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lcom/roblox/client/ossearch/c;

    iget-object p0, v0, Lzi/a$a;->t:Ljava/lang/Object;

    check-cast p0, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;

    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p4, Lzi/a$b;

    invoke-direct {p4, p1, p0, v6}, Lzi/a$b;-><init>(Lcom/roblox/client/ossearch/c;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Lnt/b;)V

    iput-object p0, v0, Lzi/a$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lzi/a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lzi/a$a;->v:Ljava/lang/Object;

    iput-object p3, v0, Lzi/a$a;->w:Ljava/lang/Object;

    iput v7, v0, Lzi/a$a;->C:I

    invoke-static {p2, p4, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    check-cast p4, Landroid/graphics/Bitmap;

    if-eqz p4, :cond_6

    new-instance p0, Lzi/e;

    invoke-direct {p0, p4, v7}, Lzi/e;-><init>(Landroid/graphics/Bitmap;Z)V

    return-object p0

    :cond_6
    sget-object v2, Ljj/b0;->a:Ljj/b0;

    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getThumbnailUrl()Ljava/lang/String;

    move-result-object v7

    iput-object p0, v0, Lzi/a$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lzi/a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lzi/a$a;->v:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lzi/a$a;->w:Ljava/lang/Object;

    invoke-static {p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lzi/a$a;->x:Ljava/lang/Object;

    iput v5, v0, Lzi/a$a;->C:I

    invoke-virtual {v2, p3, v7, v0}, Ljj/b0;->a(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v9, v2

    move-object v2, p0

    move-object p0, p4

    move-object p4, v9

    move-object v9, p3

    move-object p3, p1

    move-object p1, v9

    :goto_2
    check-cast p4, Landroid/graphics/Bitmap;

    if-eqz p4, :cond_9

    new-instance v5, Lzi/a$c;

    invoke-direct {v5, p3, v2, p4, v6}, Lzi/a$c;-><init>(Lcom/roblox/client/ossearch/c;Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Lnt/b;)V

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lzi/a$a;->t:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lzi/a$a;->u:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iput-object p3, v0, Lzi/a$a;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lzi/a$a;->w:Ljava/lang/Object;

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lzi/a$a;->x:Ljava/lang/Object;

    iput-object p4, v0, Lzi/a$a;->y:Ljava/lang/Object;

    invoke-static {p4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lzi/a$a;->z:Ljava/lang/Object;

    iput v3, v0, Lzi/a$a;->A:I

    iput v4, v0, Lzi/a$a;->C:I

    invoke-static {p2, v5, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object v6, p4

    :cond_9
    :goto_4
    new-instance p0, Lzi/e;

    invoke-direct {p0, v6, v3}, Lzi/e;-><init>(Landroid/graphics/Bitmap;Z)V

    return-object p0
.end method

.method public static final d(Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;Landroid/graphics/Bitmap;Landroid/content/Context;)Lm2/c;
    .locals 4
    .param p0    # Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getDeeplinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "joinAttemptOrigin"

    const-string v2, "AndroidSearch"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    new-instance v1, Lm2/c$b;

    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p2, v2}, Lm2/c$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getRankingHint()I

    move-result v2

    invoke-virtual {v1, v2}, Lm2/c$b;->g(I)Lm2/c$b;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/graphics/Bitmap;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to fetch thumbnail for experience "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Falling back to launcher icon."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "OSSearch"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p2}, Lzi/a;->b(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lm2/c$b;->c(Landroidx/core/graphics/drawable/IconCompat;)Lm2/c$b;

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lm2/c$b;->h(Ljava/lang/CharSequence;)Lm2/c$b;

    move-result-object p0

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    invoke-direct {p1, p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, p1}, Lm2/c$b;->d(Landroid/content/Intent;)Lm2/c$b;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lm2/c$b;->f(Z)Lm2/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lm2/c$b;->a()Lm2/c;

    move-result-object p0

    const-string p1, "build(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
