.class public final Lcom/withpersona/sdk2/inquiry/internal/x$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/x;->r()Ldv/h;
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
        "-",
        "Lcom/withpersona/sdk2/inquiry/internal/x$b;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1"
    f = "TransitionWorker.kt"
    l = {
        0x75,
        0x7a,
        0x7c
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Lcom/withpersona/sdk2/inquiry/internal/x$b;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lcom/withpersona/sdk2/inquiry/internal/x;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/x;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/x;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/x$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$e;-><init>(Lcom/withpersona/sdk2/inquiry/internal/x;Leu/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$e;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->x:Ljava/lang/Object;

    check-cast v1, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->w:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->v:Ljava/lang/Object;

    check-cast v1, Lsw/x;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->t:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->u:Ljava/lang/Object;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->t:Ljava/lang/Object;

    check-cast v6, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object/from16 v6, p1

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object v7, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;->c:Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->f()Lqr/x5;

    move-result-object v8

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->a()Ljava/util/Map;

    move-result-object v9

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->g()Ljava/lang/String;

    move-result-object v10

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->h(Lcom/withpersona/sdk2/inquiry/internal/x;)Ljava/lang/String;

    move-result-object v11

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->e(Lcom/withpersona/sdk2/inquiry/internal/x;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v3, v13}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/withpersona/sdk2/inquiry/FieldMapping;

    new-instance v14, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/FieldMapping;->getSourceFieldName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/FieldMapping;->getDestinationFieldName()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v14, v15, v13}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v12, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual/range {v7 .. v12}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;->a(Lqr/x5;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    move-result-object v3

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/internal/x;->l(Lcom/withpersona/sdk2/inquiry/internal/x;)Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/internal/x;->o()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/x;->a(Lcom/withpersona/sdk2/inquiry/internal/x;)Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;->c(Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;

    move-result-object v7

    goto :goto_2

    :cond_5
    move-object v7, v3

    :goto_2
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/x;->d(Lcom/withpersona/sdk2/inquiry/internal/x;)Lso/a;

    move-result-object v8

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->y:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/internal/x;->p()Ljava/lang/String;

    move-result-object v9

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->x:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->u:Ljava/lang/Object;

    iput v6, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->w:I

    invoke-interface {v8, v9, v7, v0}, Lso/a;->a(Ljava/lang/String;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_6

    goto :goto_4

    :cond_6
    move-object/from16 v16, v7

    move-object v7, v3

    move-object/from16 v3, v16

    :goto_3
    check-cast v6, Lsw/x;

    invoke-virtual {v6}, Lsw/x;->g()Z

    move-result v8

    if-nez v8, :cond_7

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/x$b$a;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Lsw/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v8

    invoke-direct {v4, v8}, Lcom/withpersona/sdk2/inquiry/internal/x$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->x:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->t:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->u:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->v:Ljava/lang/Object;

    iput v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->w:I

    invoke-interface {v1, v4, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    goto :goto_4

    :cond_7
    new-instance v5, Lcom/withpersona/sdk2/inquiry/internal/x$b$b;

    const/4 v8, 0x0

    invoke-direct {v5, v8}, Lcom/withpersona/sdk2/inquiry/internal/x$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/j;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->x:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->t:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->u:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->v:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/internal/x$e;->w:I

    invoke-interface {v1, v5, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/x$b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/x$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
