.class public Lfu/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aW\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a%\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\u0008\u0000\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a)\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\u0008\u0000\u0010\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "R",
        "T",
        "Lkotlin/Function2;",
        "Leu/b;",
        "",
        "receiver",
        "completion",
        "d",
        "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;",
        "",
        "a",
        "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Leu/b;",
        "c",
        "(Leu/b;)Leu/b;",
        "b",
        "kotlin-stdlib"
    }
    k = 0x5
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x31
    xs = "kotlin/coroutines/intrinsics/IntrinsicsKt"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .param p0    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Leu/b<",
            "-TT;>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lgu/h;->a(Leu/b;)Leu/b;

    move-result-object p2

    instance-of v0, p0, Lgu/a;

    if-eqz v0, :cond_0

    check-cast p0, Lgu/a;

    invoke-virtual {p0, p1, p2}, Lgu/a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p2}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    if-ne v0, v1, :cond_1

    new-instance v0, Lfu/b$a;

    invoke-direct {v0, p2, p0, p1}, Lfu/b$a;-><init>(Leu/b;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v1, Lfu/b$b;

    invoke-direct {v1, p2, v0, p0, p1}, Lfu/b$b;-><init>(Leu/b;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V

    return-object v1
.end method

.method public static final b(Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Leu/b<",
            "-TT;>;)",
            "Leu/b<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    sget-object v1, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    if-ne v0, v1, :cond_0

    new-instance v0, Lfu/b$c;

    invoke-direct {v0, p0}, Lfu/b$c;-><init>(Leu/b;)V

    return-object v0

    :cond_0
    new-instance v1, Lfu/b$d;

    invoke-direct {v1, p0, v0}, Lfu/b$d;-><init>(Leu/b;Lkotlin/coroutines/CoroutineContext;)V

    return-object v1
.end method

.method public static c(Leu/b;)Leu/b;
    .locals 1
    .param p0    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Leu/b<",
            "-TT;>;)",
            "Leu/b<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lgu/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lgu/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lgu/d;->intercepted()Leu/b;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-TR;-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Leu/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lgu/h;->a(Leu/b;)Leu/b;

    move-result-object p2

    invoke-static {p2}, Lfu/b;->b(Leu/b;)Leu/b;

    move-result-object p2

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function2;

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
