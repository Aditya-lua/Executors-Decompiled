.class public final Lou/l$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lou/l;->a(Lnu/i;[Lnu/h;Lkotlin/jvm/functions/Function0;Lzt/n;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2"
    f = "Combine.kt"
    l = {
        0x33,
        0x49,
        0x4c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "[TT;>;"
        }
    .end annotation
.end field

.field public final synthetic B:Lzt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/n<",
            "Lnu/i<",
            "-TR;>;[TT;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic C:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "TR;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:[Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Lnu/h;Lkotlin/jvm/functions/Function0;Lzt/n;Lnu/i;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lnu/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function0<",
            "[TT;>;",
            "Lzt/n<",
            "-",
            "Lnu/i<",
            "-TR;>;-[TT;-",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnu/i<",
            "-TR;>;",
            "Lnt/b<",
            "-",
            "Lou/l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lou/l$a;->z:[Lnu/h;

    iput-object p2, p0, Lou/l$a;->A:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lou/l$a;->B:Lzt/n;

    iput-object p4, p0, Lou/l$a;->C:Lnu/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lou/l$a;

    iget-object v1, p0, Lou/l$a;->z:[Lnu/h;

    iget-object v2, p0, Lou/l$a;->A:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lou/l$a;->B:Lzt/n;

    iget-object v4, p0, Lou/l$a;->C:Lnu/i;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lou/l$a;-><init>([Lnu/h;Lkotlin/jvm/functions/Function0;Lzt/n;Lnu/i;Lnt/b;)V

    iput-object p1, v0, Lou/l$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lou/l$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lou/l$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lou/l$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lou/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lou/l$a;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget v2, v0, Lou/l$a;->w:I

    iget v6, v0, Lou/l$a;->v:I

    iget-object v7, v0, Lou/l$a;->u:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, Lou/l$a;->t:Ljava/lang/Object;

    check-cast v8, Lmu/g;

    iget-object v9, v0, Lou/l$a;->y:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget v2, v0, Lou/l$a;->w:I

    iget v6, v0, Lou/l$a;->v:I

    iget-object v7, v0, Lou/l$a;->u:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v0, Lou/l$a;->t:Ljava/lang/Object;

    check-cast v8, Lmu/g;

    iget-object v9, v0, Lou/l$a;->y:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v10, p1

    check-cast v10, Lmu/k;

    invoke-virtual {v10}, Lmu/k;->k()Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lou/l$a;->y:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Lku/p0;

    iget-object v2, v0, Lou/l$a;->z:[Lnu/h;

    array-length v2, v2

    if-nez v2, :cond_4

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_4
    new-array v7, v2, [Ljava/lang/Object;

    sget-object v8, Lou/t;->b:Lqu/e0;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/collections/l;->t([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    move-object v12, v7

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static {v2, v8, v8, v7, v8}, Lmu/j;->b(ILmu/a;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lmu/g;

    move-result-object v17

    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    const/16 v19, 0x0

    move/from16 v15, v19

    :goto_1
    if-ge v15, v2, :cond_5

    new-instance v9, Lou/l$a$a;

    iget-object v14, v0, Lou/l$a;->z:[Lnu/h;

    const/16 v18, 0x0

    move-object/from16 v16, v7

    move-object v13, v9

    invoke-direct/range {v13 .. v18}, Lou/l$a$a;-><init>([Lnu/h;ILjava/util/concurrent/atomic/AtomicInteger;Lmu/g;Lnt/b;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, v16

    goto :goto_1

    :cond_5
    new-array v6, v2, [B

    move-object v7, v12

    move-object/from16 v8, v17

    :goto_2
    add-int/lit8 v9, v19, 0x1

    int-to-byte v9, v9

    iput-object v7, v0, Lou/l$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lou/l$a;->t:Ljava/lang/Object;

    iput-object v6, v0, Lou/l$a;->u:Ljava/lang/Object;

    iput v2, v0, Lou/l$a;->v:I

    iput v9, v0, Lou/l$a;->w:I

    iput v5, v0, Lou/l$a;->x:I

    invoke-interface {v8, v0}, Lmu/x;->E(Lnt/b;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object/from16 v20, v6

    move v6, v2

    move v2, v9

    move-object v9, v7

    move-object/from16 v7, v20

    :goto_3
    invoke-static {v10}, Lmu/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lkotlin/collections/IndexedValue;

    if-nez v10, :cond_7

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_7
    invoke-virtual {v10}, Lkotlin/collections/IndexedValue;->c()I

    move-result v11

    aget-object v12, v9, v11

    invoke-virtual {v10}, Lkotlin/collections/IndexedValue;->d()Ljava/lang/Object;

    move-result-object v10

    aput-object v10, v9, v11

    sget-object v10, Lou/t;->b:Lqu/e0;

    if-ne v12, v10, :cond_8

    add-int/lit8 v6, v6, -0x1

    :cond_8
    aget-byte v10, v7, v11

    if-eq v10, v2, :cond_9

    int-to-byte v10, v2

    aput-byte v10, v7, v11

    invoke-interface {v8}, Lmu/x;->C()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lmu/k;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lkotlin/collections/IndexedValue;

    if-nez v10, :cond_7

    :cond_9
    if-nez v6, :cond_b

    iget-object v10, v0, Lou/l$a;->A:Lkotlin/jvm/functions/Function0;

    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/Object;

    if-nez v10, :cond_a

    iget-object v10, v0, Lou/l$a;->B:Lzt/n;

    iget-object v11, v0, Lou/l$a;->C:Lnu/i;

    iput-object v9, v0, Lou/l$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lou/l$a;->t:Ljava/lang/Object;

    iput-object v7, v0, Lou/l$a;->u:Ljava/lang/Object;

    iput v6, v0, Lou/l$a;->v:I

    iput v2, v0, Lou/l$a;->w:I

    iput v4, v0, Lou/l$a;->x:I

    invoke-interface {v10, v11, v9, v0}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    goto :goto_4

    :cond_a
    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lkotlin/collections/l;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    iget-object v11, v0, Lou/l$a;->B:Lzt/n;

    iget-object v12, v0, Lou/l$a;->C:Lnu/i;

    iput-object v9, v0, Lou/l$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lou/l$a;->t:Ljava/lang/Object;

    iput-object v7, v0, Lou/l$a;->u:Ljava/lang/Object;

    iput v6, v0, Lou/l$a;->v:I

    iput v2, v0, Lou/l$a;->w:I

    iput v3, v0, Lou/l$a;->x:I

    invoke-interface {v11, v12, v10, v0}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
    move/from16 v19, v2

    move v2, v6

    move-object v6, v7

    move-object v7, v9

    goto/16 :goto_2
.end method
