.class public final Lkotlin/collections/s0$a;
.super Lpt/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/collections/s0;->b(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Liu/h<",
        "-",
        "Ljava/util/List<",
        "+TT;>;>;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "Liu/h;",
        "",
        "",
        "<anonymous>",
        "(Liu/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlin.collections.SlidingWindowKt$windowedIterator$1"
    f = "SlidingWindow.kt"
    l = {
        0x22,
        0x28,
        0x31,
        0x37,
        0x3a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:I

.field public final synthetic D:I

.field public final synthetic E:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(IILjava/util/Iterator;ZZLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Iterator<",
            "+TT;>;ZZ",
            "Lnt/b<",
            "-",
            "Lkotlin/collections/s0$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lkotlin/collections/s0$a;->C:I

    iput p2, p0, Lkotlin/collections/s0$a;->D:I

    iput-object p3, p0, Lkotlin/collections/s0$a;->E:Ljava/util/Iterator;

    iput-boolean p4, p0, Lkotlin/collections/s0$a;->F:Z

    iput-boolean p5, p0, Lkotlin/collections/s0$a;->G:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/k;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkotlin/collections/s0$a;

    iget v1, p0, Lkotlin/collections/s0$a;->C:I

    iget v2, p0, Lkotlin/collections/s0$a;->D:I

    iget-object v3, p0, Lkotlin/collections/s0$a;->E:Ljava/util/Iterator;

    iget-boolean v4, p0, Lkotlin/collections/s0$a;->F:Z

    iget-boolean v5, p0, Lkotlin/collections/s0$a;->G:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lkotlin/collections/s0$a;-><init>(IILjava/util/Iterator;ZZLnt/b;)V

    iput-object p1, v0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liu/h;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lkotlin/collections/s0$a;->q(Liu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    check-cast v0, Liu/h;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lkotlin/collections/s0$a;->A:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/collections/o0;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lkotlin/collections/s0$a;->y:I

    iget v5, p0, Lkotlin/collections/s0$a;->x:I

    iget-object v6, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    check-cast v6, Lkotlin/collections/o0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_2
    iget v2, p0, Lkotlin/collections/s0$a;->y:I

    iget v6, p0, Lkotlin/collections/s0$a;->x:I

    iget-object v7, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v9, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    check-cast v9, Lkotlin/collections/o0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget-object v0, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    :goto_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_4
    iget v2, p0, Lkotlin/collections/s0$a;->y:I

    iget v3, p0, Lkotlin/collections/s0$a;->x:I

    iget-object v4, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :cond_5
    move p1, v2

    goto :goto_2

    :cond_6
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget p1, p0, Lkotlin/collections/s0$a;->C:I

    const/16 v2, 0x400

    invoke-static {p1, v2}, Lkotlin/ranges/d;->f(II)I

    move-result p1

    iget v2, p0, Lkotlin/collections/s0$a;->D:I

    iget v9, p0, Lkotlin/collections/s0$a;->C:I

    sub-int/2addr v2, v9

    if-ltz v2, :cond_c

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, p0, Lkotlin/collections/s0$a;->E:Ljava/util/Iterator;

    const/4 v5, 0x0

    move-object v12, v3

    move v3, p1

    move p1, v5

    move-object v5, v12

    :cond_7
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-lez p1, :cond_8

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_8
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    iget v11, p0, Lkotlin/collections/s0$a;->C:I

    if-ne v10, v11, :cond_7

    iput-object v0, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    iput-object v5, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    iput-object v4, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lkotlin/collections/s0$a;->w:Ljava/lang/Object;

    iput v3, p0, Lkotlin/collections/s0$a;->x:I

    iput v2, p0, Lkotlin/collections/s0$a;->y:I

    iput p1, p0, Lkotlin/collections/s0$a;->z:I

    iput v7, p0, Lkotlin/collections/s0$a;->A:I

    invoke-virtual {v0, v5, p0}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_a

    :goto_2
    iget-boolean v2, p0, Lkotlin/collections/s0$a;->F:Z

    if-eqz v2, :cond_9

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_9
    new-instance v2, Ljava/util/ArrayList;

    iget v5, p0, Lkotlin/collections/s0$a;->C:I

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    move-object v5, v2

    :goto_3
    move v2, p1

    goto :goto_1

    :cond_a
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_15

    iget-boolean v4, p0, Lkotlin/collections/s0$a;->G:Z

    if-nez v4, :cond_b

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v7, p0, Lkotlin/collections/s0$a;->C:I

    if-ne v4, v7, :cond_15

    :cond_b
    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->w:Ljava/lang/Object;

    iput v3, p0, Lkotlin/collections/s0$a;->x:I

    iput v2, p0, Lkotlin/collections/s0$a;->y:I

    iput p1, p0, Lkotlin/collections/s0$a;->z:I

    iput v6, p0, Lkotlin/collections/s0$a;->A:I

    invoke-virtual {v0, v5, p0}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_15

    goto/16 :goto_a

    :cond_c
    new-instance v6, Lkotlin/collections/o0;

    invoke-direct {v6, p1}, Lkotlin/collections/o0;-><init>(I)V

    iget-object v7, p0, Lkotlin/collections/s0$a;->E:Ljava/util/Iterator;

    move-object v9, v6

    move v6, p1

    :cond_d
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v9, p1}, Lkotlin/collections/o0;->g(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lkotlin/collections/o0;->k()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-virtual {v9}, Lkotlin/collections/b;->size()I

    move-result v10

    iget v11, p0, Lkotlin/collections/s0$a;->C:I

    if-ge v10, v11, :cond_e

    invoke-virtual {v9, v11}, Lkotlin/collections/o0;->i(I)Lkotlin/collections/o0;

    move-result-object v9

    goto :goto_4

    :cond_e
    iget-boolean v10, p0, Lkotlin/collections/s0$a;->F:Z

    if-eqz v10, :cond_f

    move-object v10, v9

    goto :goto_5

    :cond_f
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_5
    iput-object v0, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    iput-object v9, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    iput-object v7, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkotlin/collections/s0$a;->w:Ljava/lang/Object;

    iput v6, p0, Lkotlin/collections/s0$a;->x:I

    iput v2, p0, Lkotlin/collections/s0$a;->y:I

    iput v5, p0, Lkotlin/collections/s0$a;->A:I

    invoke-virtual {v0, v10, p0}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_10

    goto :goto_a

    :cond_10
    :goto_6
    iget p1, p0, Lkotlin/collections/s0$a;->D:I

    invoke-virtual {v9, p1}, Lkotlin/collections/o0;->l(I)V

    goto :goto_4

    :cond_11
    iget-boolean p1, p0, Lkotlin/collections/s0$a;->G:Z

    if-eqz p1, :cond_15

    move v5, v6

    move-object v6, v9

    :goto_7
    invoke-virtual {v6}, Lkotlin/collections/b;->size()I

    move-result p1

    iget v7, p0, Lkotlin/collections/s0$a;->D:I

    if-le p1, v7, :cond_14

    iget-boolean p1, p0, Lkotlin/collections/s0$a;->F:Z

    if-eqz p1, :cond_12

    move-object p1, v6

    goto :goto_8

    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_8
    iput-object v0, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    iput-object v6, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->w:Ljava/lang/Object;

    iput v5, p0, Lkotlin/collections/s0$a;->x:I

    iput v2, p0, Lkotlin/collections/s0$a;->y:I

    iput v4, p0, Lkotlin/collections/s0$a;->A:I

    invoke-virtual {v0, p1, p0}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_13

    goto :goto_a

    :cond_13
    :goto_9
    iget p1, p0, Lkotlin/collections/s0$a;->D:I

    invoke-virtual {v6, p1}, Lkotlin/collections/o0;->l(I)V

    goto :goto_7

    :cond_14
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_15

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkotlin/collections/s0$a;->B:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lkotlin/collections/s0$a;->u:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->v:Ljava/lang/Object;

    iput-object v8, p0, Lkotlin/collections/s0$a;->w:Ljava/lang/Object;

    iput v5, p0, Lkotlin/collections/s0$a;->x:I

    iput v2, p0, Lkotlin/collections/s0$a;->y:I

    iput v3, p0, Lkotlin/collections/s0$a;->A:I

    invoke-virtual {v0, v6, p0}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_15

    :goto_a
    return-object v1

    :cond_15
    :goto_b
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Liu/h;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu/h<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lkotlin/collections/s0$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lkotlin/collections/s0$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lkotlin/collections/s0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
