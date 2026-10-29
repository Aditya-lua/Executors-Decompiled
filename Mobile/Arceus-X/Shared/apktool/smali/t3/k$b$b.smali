.class public final Lt3/k$b$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt3/k$b;->b(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnt/b<",
        "-",
        "Lt3/f<",
        "TT;>;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "T",
        "Lt3/f;",
        "<anonymous>",
        "()Lt3/f;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1"
    f = "DataStoreImpl.kt"
    l = {
        0x1b5,
        0x1ca,
        0x222,
        0x1d4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lt3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic B:Lt3/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt3/k<",
            "TT;>.b;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lt3/k;Lt3/k$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt3/k<",
            "TT;>;",
            "Lt3/k<",
            "TT;>.b;",
            "Lnt/b<",
            "-",
            "Lt3/k$b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt3/k$b$b;->A:Lt3/k;

    iput-object p2, p0, Lt3/k$b$b;->B:Lt3/k$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lt3/k$b$b;

    iget-object v1, p0, Lt3/k$b$b;->A:Lt3/k;

    iget-object v2, p0, Lt3/k$b$b;->B:Lt3/k$b;

    invoke-direct {v0, v1, v2, p1}, Lt3/k$b$b;-><init>(Lt3/k;Lt3/k$b;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lt3/k$b$b;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt3/k$b$b;->z:I

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget v0, p0, Lt3/k$b$b;->y:I

    iget-object v1, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    check-cast v1, Luu/a;

    iget-object v4, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/c0;

    iget-object v5, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/y;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v1, p0, Lt3/k$b$b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v8, p0, Lt3/k$b$b;->w:Ljava/lang/Object;

    check-cast v8, Lt3/k$b$b$a;

    iget-object v9, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/c0;

    iget-object v10, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/y;

    iget-object v11, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    check-cast v11, Luu/a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lt3/k$b$b;->w:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    iget-object v8, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/c0;

    iget-object v9, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/y;

    iget-object v10, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    check-cast v10, Luu/a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {v2, v6, v7}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v10

    new-instance v9, Lkotlin/jvm/internal/y;

    invoke-direct {v9}, Lkotlin/jvm/internal/y;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/c0;

    invoke-direct {v1}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object p1, p0, Lt3/k$b$b;->A:Lt3/k;

    iput-object v10, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    iput-object v9, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$b$b;->w:Ljava/lang/Object;

    iput v6, p0, Lt3/k$b$b;->z:I

    invoke-static {p1, v6, p0}, Lt3/k;->n(Lt3/k;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v8, v1

    :goto_0
    check-cast p1, Lt3/f;

    invoke-virtual {p1}, Lt3/f;->c()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance p1, Lt3/k$b$b$a;

    iget-object v1, p0, Lt3/k$b$b;->A:Lt3/k;

    invoke-direct {p1, v10, v9, v8, v1}, Lt3/k$b$b$a;-><init>(Luu/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/c0;Lt3/k;)V

    iget-object v1, p0, Lt3/k$b$b;->B:Lt3/k$b;

    invoke-static {v1}, Lt3/k$b;->d(Lt3/k$b;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, p1

    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    iput-object v11, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    iput-object v10, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    iput-object v9, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    iput-object v8, p0, Lt3/k$b$b;->w:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$b$b;->x:Ljava/lang/Object;

    iput v5, p0, Lt3/k$b$b;->z:I

    invoke-interface {p1, v8, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_7
    move-object v8, v9

    move-object v5, v10

    move-object v1, v11

    goto :goto_2

    :cond_8
    move-object v5, v9

    move-object v1, v10

    :goto_2
    iget-object p1, p0, Lt3/k$b$b;->B:Lt3/k$b;

    invoke-static {p1, v7}, Lt3/k$b;->e(Lt3/k$b;Ljava/util/List;)V

    iput-object v5, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    iput-object v8, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    iput-object v1, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    iput-object v7, p0, Lt3/k$b$b;->w:Ljava/lang/Object;

    iput-object v7, p0, Lt3/k$b$b;->x:Ljava/lang/Object;

    iput v4, p0, Lt3/k$b$b;->z:I

    invoke-interface {v1, v7, p0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_4

    :cond_9
    move-object v4, v8

    :goto_3
    :try_start_0
    iput-boolean v6, v5, Lkotlin/jvm/internal/y;->a:Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v7}, Luu/a;->e(Ljava/lang/Object;)V

    iget-object v1, v4, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_a
    iget-object p1, p0, Lt3/k$b$b;->A:Lt3/k;

    invoke-static {p1}, Lt3/k;->c(Lt3/k;)Lt3/t;

    move-result-object p1

    iput-object v1, p0, Lt3/k$b$b;->t:Ljava/lang/Object;

    iput-object v7, p0, Lt3/k$b$b;->u:Ljava/lang/Object;

    iput-object v7, p0, Lt3/k$b$b;->v:Ljava/lang/Object;

    iput v2, p0, Lt3/k$b$b;->y:I

    iput v3, p0, Lt3/k$b$b;->z:I

    invoke-interface {p1, p0}, Lt3/t;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_4
    return-object v0

    :cond_b
    move v0, v2

    :goto_5
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v2, Lt3/f;

    invoke-direct {v2, v1, v0, p1}, Lt3/f;-><init>(Ljava/lang/Object;II)V

    return-object v2

    :catchall_0
    move-exception p1

    invoke-interface {v1, v7}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lt3/f<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1}, Lt3/k$b$b;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lt3/k$b$b;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lt3/k$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
