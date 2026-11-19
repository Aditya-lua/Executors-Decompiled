.class public final Lu3/k$t;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/k;->a(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-TT;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.DataStoreImpl$updateData$2"
    f = "DataStoreImpl.kt"
    l = {
        0xa9
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@"
    }
    d2 = {
        "T",
        "Lav/p0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "TT;",
            "Leu/b<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu3/k;Lkotlin/jvm/functions/Function2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/k<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-TT;-",
            "Leu/b<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Lu3/k$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/k$t;->v:Lu3/k;

    iput-object p2, p0, Lu3/k$t;->w:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lu3/k$t;

    iget-object v1, p0, Lu3/k$t;->v:Lu3/k;

    iget-object v2, p0, Lu3/k$t;->w:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, p2}, Lu3/k$t;-><init>(Lu3/k;Lkotlin/jvm/functions/Function2;Leu/b;)V

    iput-object p1, v0, Lu3/k$t;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lu3/k$t;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lu3/k$t;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lu3/k$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lu3/k$t;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu3/k$t;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu3/k$t;->u:Ljava/lang/Object;

    check-cast p1, Lav/p0;

    const/4 v1, 0x0

    invoke-static {v1, v2, v1}, Lav/z;->c(Lav/d2;ILjava/lang/Object;)Lav/x;

    move-result-object v1

    iget-object v3, p0, Lu3/k$t;->v:Lu3/k;

    invoke-static {v3}, Lu3/k;->d(Lu3/k;)Lu3/l;

    move-result-object v3

    invoke-virtual {v3}, Lu3/l;->a()Lu3/d0;

    move-result-object v3

    new-instance v4, Lu3/w$a;

    iget-object v5, p0, Lu3/k$t;->w:Lkotlin/jvm/functions/Function2;

    invoke-interface {p1}, Lav/p0;->I()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-direct {v4, v5, v1, v3, p1}, Lu3/w$a;-><init>(Lkotlin/jvm/functions/Function2;Lav/x;Lu3/d0;Lkotlin/coroutines/CoroutineContext;)V

    iget-object p1, p0, Lu3/k$t;->v:Lu3/k;

    invoke-static {p1}, Lu3/k;->h(Lu3/k;)Lu3/b0;

    move-result-object p1

    invoke-virtual {p1, v4}, Lu3/b0;->e(Ljava/lang/Object;)V

    iput v2, p0, Lu3/k$t;->t:I

    invoke-interface {v1, p0}, Lav/w0;->y(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
