.class public final Lcom/withpersona/sdk2/inquiry/internal/x$f;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/x;->s()Ldv/h;
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
    c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1"
    f = "TransitionWorker.kt"
    l = {
        0x40,
        0x46,
        0x4d,
        0x50,
        0x60
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
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Lcom/withpersona/sdk2/inquiry/internal/x;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/x;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/x;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/x$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$f;-><init>(Lcom/withpersona/sdk2/inquiry/internal/x;Leu/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$f;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    check-cast v1, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->y:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/internal/j;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->x:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->w:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->v:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->u:Ljava/lang/Object;

    check-cast v3, Lsw/x;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    check-cast v5, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    :goto_0
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->u:Ljava/lang/Object;

    check-cast v1, Lsw/x;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_3
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_4

    :cond_4
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto/16 :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object v9, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;->c:Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->f()Lqr/x5;

    move-result-object v10

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->a()Ljava/util/Map;

    move-result-object v11

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->j(Lcom/withpersona/sdk2/inquiry/internal/x;)Lcom/withpersona/sdk2/inquiry/internal/x$c;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/x$c;->g()Ljava/lang/String;

    move-result-object v12

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->h(Lcom/withpersona/sdk2/inquiry/internal/x;)Ljava/lang/String;

    move-result-object v13

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/x;->e(Lcom/withpersona/sdk2/inquiry/internal/x;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v3, v15}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/withpersona/sdk2/inquiry/FieldMapping;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/FieldMapping;->getSourceFieldName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/FieldMapping;->getDestinationFieldName()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v4, v5, v15}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$FieldMapping;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v14, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x5

    const/4 v5, 0x4

    goto :goto_1

    :cond_6
    invoke-virtual/range {v9 .. v14}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest$a;->a(Lqr/x5;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;

    move-result-object v3

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/internal/x;->l(Lcom/withpersona/sdk2/inquiry/internal/x;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/internal/x;->g(Lcom/withpersona/sdk2/inquiry/internal/x;)Lup/w;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/internal/x;->p()Ljava/lang/String;

    move-result-object v5

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/internal/x;->o()Ljava/lang/String;

    move-result-object v7

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/internal/x;->o()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/internal/x;->a(Lcom/withpersona/sdk2/inquiry/internal/x;)Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;->c(Ljava/lang/String;Landroid/content/ContentResolver;)Ljava/util/List;

    move-result-object v9

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    invoke-interface {v4, v5, v7, v9, v0}, Lup/w;->g(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Leu/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_7

    goto/16 :goto_8

    :cond_7
    :goto_2
    check-cast v4, Lsw/x;

    :goto_3
    move-object v5, v3

    move-object v3, v4

    goto :goto_5

    :cond_8
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/internal/x;->g(Lcom/withpersona/sdk2/inquiry/internal/x;)Lup/w;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/internal/x;->p()Ljava/lang/String;

    move-result-object v5

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/internal/x;->o()Ljava/lang/String;

    move-result-object v8

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    iput v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    invoke-interface {v4, v5, v8, v3, v0}, Lup/w;->i(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/TransitionInquiryRequest;Leu/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_9

    goto/16 :goto_8

    :cond_9
    :goto_4
    check-cast v4, Lsw/x;

    goto :goto_3

    :goto_5
    invoke-virtual {v3}, Lsw/x;->g()Z

    move-result v4

    if-nez v4, :cond_a

    new-instance v4, Lcom/withpersona/sdk2/inquiry/internal/x$b$a;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Lsw/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v7

    invoke-direct {v4, v7}, Lcom/withpersona/sdk2/inquiry/internal/x$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->u:Ljava/lang/Object;

    iput v6, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    invoke-interface {v1, v4, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_d

    goto/16 :goto_8

    :cond_a
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/internal/x;->k(Lcom/withpersona/sdk2/inquiry/internal/x;)Lnp/q0;

    move-result-object v4

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->u:Ljava/lang/Object;

    const/4 v6, 0x4

    iput v6, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    invoke-virtual {v4, v0}, Lnp/q0;->c(Leu/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_b

    goto :goto_8

    :cond_b
    :goto_6
    invoke-virtual {v3}, Lsw/x;->a()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_e

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;->getWaitForTransitionConfig()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;->getPollingMode()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;

    move-result-object v7

    sget-object v8, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;->None:Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;

    if-ne v7, v8, :cond_c

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/internal/x;->p()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v9}, Lcom/withpersona/sdk2/inquiry/internal/x;->f(Lcom/withpersona/sdk2/inquiry/internal/x;)Lhr/g;

    move-result-object v9

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->B:Lcom/withpersona/sdk2/inquiry/internal/x;

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/internal/x;->i(Lcom/withpersona/sdk2/inquiry/internal/x;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v8, v9, v10}, Lup/a;->w(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lhr/g;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/j;

    move-result-object v8

    goto :goto_7

    :cond_c
    const/4 v8, 0x0

    :goto_7
    new-instance v9, Lcom/withpersona/sdk2/inquiry/internal/x$b$b;

    invoke-direct {v9, v8}, Lcom/withpersona/sdk2/inquiry/internal/x$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/j;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->A:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->t:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->u:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->v:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->w:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->x:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->y:Ljava/lang/Object;

    const/4 v3, 0x5

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/internal/x$f;->z:I

    invoke-interface {v1, v9, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_d

    :goto_8
    return-object v2

    :cond_d
    :goto_9
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
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

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$f;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/x$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/x$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
