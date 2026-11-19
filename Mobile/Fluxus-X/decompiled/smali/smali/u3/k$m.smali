.class public final Lu3/k$m;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/k;->w(ZLeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Boolean;",
        "Leu/b<",
        "-",
        "Lkotlin/Pair<",
        "+",
        "Lu3/d0<",
        "TT;>;+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4"
    f = "DataStoreImpl.kt"
    l = {
        0x132,
        0x135
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "",
        "locked",
        "Lkotlin/Pair;",
        "Lu3/d0;",
        "<anonymous>",
        "(Z)Lkotlin/Pair;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Z

.field public final synthetic w:Lu3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/k<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Lu3/k;ILeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/k<",
            "TT;>;I",
            "Leu/b<",
            "-",
            "Lu3/k$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/k$m;->w:Lu3/k;

    iput p2, p0, Lu3/k$m;->x:I

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

    new-instance v0, Lu3/k$m;

    iget-object v1, p0, Lu3/k$m;->w:Lu3/k;

    iget v2, p0, Lu3/k$m;->x:I

    invoke-direct {v0, v1, v2, p2}, Lu3/k$m;-><init>(Lu3/k;ILeu/b;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lu3/k$m;->v:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lu3/k$m;->m(ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu3/k$m;->u:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lu3/k$m;->v:Z

    iget-object v1, p0, Lu3/k$m;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v1, p0, Lu3/k$m;->v:Z

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lu3/k$m;->v:Z

    :try_start_1
    iget-object p1, p0, Lu3/k$m;->w:Lu3/k;

    iput-boolean v1, p0, Lu3/k$m;->v:Z

    iput v3, p0, Lu3/k$m;->u:I

    invoke-static {p1, v1, p0}, Lu3/k;->n(Lu3/k;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lu3/d0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_1
    if-eqz v1, :cond_5

    iget-object v3, p0, Lu3/k$m;->w:Lu3/k;

    invoke-static {v3}, Lu3/k;->c(Lu3/k;)Lu3/t;

    move-result-object v3

    iput-object p1, p0, Lu3/k$m;->t:Ljava/lang/Object;

    iput-boolean v1, p0, Lu3/k$m;->v:Z

    iput v2, p0, Lu3/k$m;->u:I

    invoke-interface {v3, p0}, Lu3/t;->a(Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_4

    :goto_2
    return-object v0

    :cond_4
    move v0, v1

    move-object v1, p1

    move-object p1, v2

    :goto_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_4

    :cond_5
    iget v0, p0, Lu3/k$m;->x:I

    move v4, v1

    move-object v1, p1

    move p1, v0

    move v0, v4

    :goto_4
    new-instance v2, Lu3/x;

    invoke-direct {v2, v1, p1}, Lu3/x;-><init>(Ljava/lang/Throwable;I)V

    move v1, v0

    move-object p1, v2

    :goto_5
    invoke-static {v1}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final m(ZLeu/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Leu/b<",
            "-",
            "Lkotlin/Pair<",
            "+",
            "Lu3/d0<",
            "TT;>;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lu3/k$m;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lu3/k$m;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lu3/k$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
