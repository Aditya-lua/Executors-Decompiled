.class public final Lcom/withpersona/sdk2/inquiry/document/network/g$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/g;->run()Lnu/h;
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
        "Lcom/withpersona/sdk2/inquiry/document/network/g$b;",
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
        "Lcom/withpersona/sdk2/inquiry/document/network/g$b;",
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
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentSubmitWorker$run$1"
    f = "DocumentSubmitWorker.kt"
    l = {
        0x2b,
        0x40,
        0x42
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lcom/withpersona/sdk2/inquiry/document/network/g;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/g;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/network/g;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$c;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/g;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->y:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->t:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/g;->d(Lcom/withpersona/sdk2/inquiry/document/network/g;)Lmq/a;

    move-result-object p1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/document/network/g;->h(Lcom/withpersona/sdk2/inquiry/document/network/g;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/document/network/g;->e(Lcom/withpersona/sdk2/inquiry/document/network/g;)Ljava/util/List;

    move-result-object v8

    invoke-direct {v2, v7, v8}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentStepData;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p1, v2}, Lmq/a;->a(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/network/g$c$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->z:Lcom/withpersona/sdk2/inquiry/document/network/g;

    const/4 v7, 0x0

    invoke-direct {p1, v2, v7}, Lcom/withpersona/sdk2/inquiry/document/network/g$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/g;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->y:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->x:I

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    instance-of p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz p1, :cond_5

    move-object p1, v2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object p1

    sget-object v5, Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;->a:Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->u:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->v:I

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->x:I

    invoke-interface {v0, v5, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    instance-of p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz p1, :cond_6

    move-object p1, v2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    new-instance v4, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;

    invoke-direct {v4, p1}, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->u:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->v:I

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->w:I

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->x:I

    invoke-interface {v0, v4, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/g$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/g$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
