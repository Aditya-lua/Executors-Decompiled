.class public final Ljs/b$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljs/b;->run()Ldv/h;
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
        "Ljs/b$b;",
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
    c = "com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1"
    f = "WebRtcWorker.kt"
    l = {
        0x25,
        0x29,
        0x2b,
        0x36
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Ljs/b$b;",
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

.field public v:I

.field public w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljs/b;


# direct methods
.method public constructor <init>(Ljs/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljs/b;",
            "Leu/b<",
            "-",
            "Ljs/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljs/b$c;->z:Ljs/b;

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

    new-instance v0, Ljs/b$c;

    iget-object v1, p0, Ljs/b$c;->z:Ljs/b;

    invoke-direct {v0, v1, p2}, Ljs/b$c;-><init>(Ljs/b;Leu/b;)V

    iput-object p1, v0, Ljs/b$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ljs/b$c;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Ljs/b$c;->y:Ljava/lang/Object;

    check-cast v1, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Ljs/b$c;->x:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Ljs/b$c;->u:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v1, v0, Ljs/b$c;->t:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Ljs/b$c;->u:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;

    iget-object v3, v0, Ljs/b$c;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Ljs/b$c$a;

    iget-object v9, v0, Ljs/b$c;->z:Ljs/b;

    const/4 v10, 0x0

    invoke-direct {v3, v9, v10}, Ljs/b$c$a;-><init>(Ljs/b;Leu/b;)V

    iput-object v1, v0, Ljs/b$c;->y:Ljava/lang/Object;

    iput v7, v0, Ljs/b$c;->x:I

    invoke-static {v3, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_0
    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    instance-of v7, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v7, :cond_6

    move-object v7, v3

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;

    if-eqz v7, :cond_5

    new-instance v5, Ljs/b$b$b;

    invoke-direct {v5, v7}, Ljs/b$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;)V

    iput-object v1, v0, Ljs/b$c;->y:Ljava/lang/Object;

    iput-object v3, v0, Ljs/b$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Ljs/b$c;->u:Ljava/lang/Object;

    iput v8, v0, Ljs/b$c;->v:I

    iput v8, v0, Ljs/b$c;->w:I

    iput v6, v0, Ljs/b$c;->x:I

    invoke-interface {v1, v5, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_6

    goto :goto_2

    :cond_5
    new-instance v6, Ljs/b$b$a;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v10, 0x0

    const-string v11, "Expected body to be non-null."

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v9}, Ljs/b$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Ljs/b$c;->y:Ljava/lang/Object;

    iput-object v3, v0, Ljs/b$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Ljs/b$c;->u:Ljava/lang/Object;

    iput v8, v0, Ljs/b$c;->v:I

    iput v8, v0, Ljs/b$c;->w:I

    iput v5, v0, Ljs/b$c;->x:I

    invoke-interface {v1, v6, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    instance-of v5, v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v5, :cond_7

    move-object v5, v3

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v5

    new-instance v6, Ljs/b$b$a;

    invoke-direct {v6, v5}, Ljs/b$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Ljs/b$c;->y:Ljava/lang/Object;

    iput-object v3, v0, Ljs/b$c;->t:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Ljs/b$c;->u:Ljava/lang/Object;

    iput v8, v0, Ljs/b$c;->v:I

    iput v8, v0, Ljs/b$c;->w:I

    iput v4, v0, Ljs/b$c;->x:I

    invoke-interface {v1, v6, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    :goto_3
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
            "Ljs/b$b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ljs/b$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ljs/b$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ljs/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
