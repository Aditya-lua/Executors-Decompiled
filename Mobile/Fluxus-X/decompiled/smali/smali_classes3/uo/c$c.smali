.class public final Luo/c$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luo/c;->run()Ldv/h;
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
        "Luo/c$b;",
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
    c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1"
    f = "FeatureFlagWorker.kt"
    l = {
        0x16,
        0x1f,
        0x21
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Luo/c$b;",
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

.field public final synthetic z:Luo/c;


# direct methods
.method public constructor <init>(Luo/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luo/c;",
            "Leu/b<",
            "-",
            "Luo/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Luo/c$c;->z:Luo/c;

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

    new-instance v0, Luo/c$c;

    iget-object v1, p0, Luo/c$c;->z:Luo/c;

    invoke-direct {v0, v1, p2}, Luo/c$c;-><init>(Luo/c;Leu/b;)V

    iput-object p1, v0, Luo/c$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Luo/c$c;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Luo/c$c;->y:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Luo/c$c;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Luo/c$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, p0, Luo/c$c;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Luo/c$c;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;

    iget-object v2, p0, Luo/c$c;->t:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Luo/c$c$a;

    iget-object v2, p0, Luo/c$c;->z:Luo/c;

    const/4 v7, 0x0

    invoke-direct {p1, v2, v7}, Luo/c$c$a;-><init>(Luo/c;Leu/b;)V

    iput-object v0, p0, Luo/c$c;->y:Ljava/lang/Object;

    iput v5, p0, Luo/c$c;->x:I

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object p1, p0, Luo/c$c;->z:Luo/c;

    instance-of v5, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v5, :cond_5

    move-object v5, v2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;

    invoke-static {p1}, Luo/c;->d(Luo/c;)Lto/e;

    move-result-object p1

    invoke-virtual {p1, v5}, Lto/e;->e(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V

    new-instance p1, Luo/c$b$b;

    invoke-direct {p1, v5}, Luo/c$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;)V

    iput-object v0, p0, Luo/c$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Luo/c$c;->t:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Luo/c$c;->u:Ljava/lang/Object;

    iput v6, p0, Luo/c$c;->v:I

    iput v6, p0, Luo/c$c;->w:I

    iput v4, p0, Luo/c$c;->x:I

    invoke-interface {v0, p1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

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

    sget-object v4, Luo/c$b$a;->a:Luo/c$b$a;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Luo/c$c;->y:Ljava/lang/Object;

    iput-object v2, p0, Luo/c$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Luo/c$c;->u:Ljava/lang/Object;

    iput v6, p0, Luo/c$c;->v:I

    iput v6, p0, Luo/c$c;->w:I

    iput v3, p0, Luo/c$c;->x:I

    invoke-interface {v0, v4, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Luo/c$b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Luo/c$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Luo/c$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Luo/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
