.class public final Lu3/k$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu3/k;-><init>(Lu3/e0;Ljava/util/List;Lu3/e;Lav/p0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-TT;>;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.datastore.core.DataStoreImpl$data$1"
    f = "DataStoreImpl.kt"
    l = {
        0x48,
        0x4a,
        0x64
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "T",
        "Ldv/i;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
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

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lu3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/k<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu3/k;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/k<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Lu3/k$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu3/k$d;->w:Lu3/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lu3/k$d;

    iget-object v1, p0, Lu3/k$d;->w:Lu3/k;

    invoke-direct {v0, v1, p2}, Lu3/k$d;-><init>(Lu3/k;Leu/b;)V

    iput-object p1, v0, Lu3/k$d;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lu3/k$d;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu3/k$d;->u:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lu3/k$d;->t:Ljava/lang/Object;

    check-cast v1, Lu3/d0;

    iget-object v3, p0, Lu3/k$d;->v:Ljava/lang/Object;

    check-cast v3, Ldv/i;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lu3/k$d;->v:Ljava/lang/Object;

    check-cast v1, Ldv/i;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu3/k$d;->v:Ljava/lang/Object;

    check-cast p1, Ldv/i;

    iget-object v1, p0, Lu3/k$d;->w:Lu3/k;

    iput-object p1, p0, Lu3/k$d;->v:Ljava/lang/Object;

    iput v4, p0, Lu3/k$d;->u:I

    const/4 v4, 0x0

    invoke-static {v1, v4, p0}, Lu3/k;->o(Lu3/k;ZLeu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto/16 :goto_3

    :cond_4
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_0
    check-cast p1, Lu3/d0;

    instance-of v4, p1, Lu3/f;

    if-eqz v4, :cond_6

    move-object v4, p1

    check-cast v4, Lu3/f;

    invoke-virtual {v4}, Lu3/f;->c()Ljava/lang/Object;

    move-result-object v4

    iput-object v1, p0, Lu3/k$d;->v:Ljava/lang/Object;

    iput-object p1, p0, Lu3/k$d;->t:Ljava/lang/Object;

    iput v3, p0, Lu3/k$d;->u:I

    invoke-interface {v1, v4, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, v1

    move-object v1, p1

    :goto_1
    move-object p1, v1

    move-object v1, v3

    goto :goto_2

    :cond_6
    instance-of v3, p1, Lu3/h0;

    if-nez v3, :cond_a

    instance-of v3, p1, Lu3/x;

    if-nez v3, :cond_9

    instance-of v3, p1, Lu3/r;

    if-eqz v3, :cond_7

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_7
    :goto_2
    iget-object v3, p0, Lu3/k$d;->w:Lu3/k;

    invoke-static {v3}, Lu3/k;->d(Lu3/k;)Lu3/l;

    move-result-object v3

    invoke-virtual {v3}, Lu3/l;->b()Ldv/h;

    move-result-object v3

    new-instance v4, Lu3/k$d$a;

    iget-object v5, p0, Lu3/k$d;->w:Lu3/k;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Lu3/k$d$a;-><init>(Lu3/k;Leu/b;)V

    invoke-static {v3, v4}, Ldv/j;->F(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v3

    new-instance v4, Lu3/k$d$b;

    invoke-direct {v4, v6}, Lu3/k$d$b;-><init>(Leu/b;)V

    invoke-static {v3, v4}, Ldv/j;->O(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v3

    new-instance v4, Lu3/k$d$c;

    invoke-direct {v4, p1, v6}, Lu3/k$d$c;-><init>(Lu3/d0;Leu/b;)V

    invoke-static {v3, v4}, Ldv/j;->o(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    new-instance v3, Lu3/k$d$e;

    invoke-direct {v3, p1}, Lu3/k$d$e;-><init>(Ldv/h;)V

    new-instance p1, Lu3/k$d$d;

    iget-object v4, p0, Lu3/k$d;->w:Lu3/k;

    invoke-direct {p1, v4, v6}, Lu3/k$d$d;-><init>(Lu3/k;Leu/b;)V

    invoke-static {v3, p1}, Ldv/j;->D(Ldv/h;Lpu/n;)Ldv/h;

    move-result-object p1

    iput-object v6, p0, Lu3/k$d;->v:Ljava/lang/Object;

    iput-object v6, p0, Lu3/k$d;->t:Ljava/lang/Object;

    iput v2, p0, Lu3/k$d;->u:I

    invoke-static {v1, p1, p0}, Ldv/j;->q(Ldv/i;Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_9
    check-cast p1, Lu3/x;

    invoke-virtual {p1}, Lu3/x;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ldv/i;
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
            "Ldv/i<",
            "-TT;>;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lu3/k$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lu3/k$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lu3/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
