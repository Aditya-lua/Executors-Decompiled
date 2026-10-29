.class public final Lcom/withpersona/sdk2/inquiry/document/network/e$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/e;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentLoadWorker$run$1"
    f = "DocumentLoadWorker.kt"
    l = {
        0x20,
        0x31,
        0x33,
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lcom/withpersona/sdk2/inquiry/document/network/e;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/e;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/network/e;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->A:Lcom/withpersona/sdk2/inquiry/document/network/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->A:Lcom/withpersona/sdk2/inquiry/document/network/e;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/e$c;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/e;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    check-cast v1, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->y:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->u:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->t:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->v:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    :cond_2
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->u:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/network/e$c$a;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->A:Lcom/withpersona/sdk2/inquiry/document/network/e;

    invoke-direct {v3, v10, v9}, Lcom/withpersona/sdk2/inquiry/document/network/e$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/e;Lnt/b;)V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    iput v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->y:I

    invoke-static {v3, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto/16 :goto_4

    :cond_5
    :goto_0
    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    instance-of v7, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v7, :cond_b

    move-object v7, v3

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentResponse;->b()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_8

    check-cast v5, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;->a()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;->a()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v14, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-direct {v14, v9, v12, v13, v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v14, v9

    :goto_2
    if-eqz v14, :cond_6

    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v10

    :cond_9
    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;

    invoke-direct {v5, v10}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;-><init>(Ljava/util/List;)V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->u:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->v:Ljava/lang/Object;

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->w:I

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->x:I

    iput v6, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->y:I

    invoke-interface {v1, v5, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_b

    goto :goto_4

    :cond_a
    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    new-instance v10, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    const/16 v15, 0x8

    const/16 v16, 0x0

    const/4 v11, 0x0

    const-string v12, "Expected body to be non-null"

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v10}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->u:Ljava/lang/Object;

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->w:I

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->x:I

    iput v5, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->y:I

    invoke-interface {v1, v6, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    instance-of v5, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v5, :cond_c

    move-object v5, v3

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v5

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    invoke-direct {v6, v5}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->t:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->u:Ljava/lang/Object;

    iput-object v9, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->v:Ljava/lang/Object;

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->w:I

    iput v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->x:I

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->y:I

    invoke-interface {v1, v6, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_c

    :goto_4
    return-object v2

    :cond_c
    :goto_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/e$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/e$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
