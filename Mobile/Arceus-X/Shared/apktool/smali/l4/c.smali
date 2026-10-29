.class public final Ll4/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll4/b;",
        "a",
        "()Ll4/b;",
        "lifecycle-viewmodel"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a()Ll4/b;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    :try_start_0
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v0

    invoke-virtual {v0}, Lku/n2;->X()Lku/n2;

    move-result-object v0
    :try_end_0
    .catch Ljt/m; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    goto :goto_0

    :catch_1
    sget-object v0, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    :goto_0
    new-instance v1, Ll4/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v2, v3}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-direct {v1, v0}, Ll4/b;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    return-object v1
.end method
