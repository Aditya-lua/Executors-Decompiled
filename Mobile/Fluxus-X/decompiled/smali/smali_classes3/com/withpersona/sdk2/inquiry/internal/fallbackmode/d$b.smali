.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->b(Lup/e;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$createSession$response$1"
    f = "ApiController.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;",
        "<anonymous>",
        "(Lav/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lup/e;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;


# direct methods
.method public constructor <init>(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lup/e;",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->u:Lup/e;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->v:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->u:Lup/e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->v:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;-><init>(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$StatusResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->u:Lup/e;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->v:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    const/4 v4, 0x0

    invoke-direct {p1, v1, v3, v4}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b$a;-><init>(Lup/e;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Leu/b;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$b;->t:I

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
