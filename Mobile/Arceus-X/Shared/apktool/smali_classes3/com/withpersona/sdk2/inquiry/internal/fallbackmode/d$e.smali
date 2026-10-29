.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->h(Ljava/lang/String;Lokhttp3/RequestBody;Ldp/h;Lnt/b;)Ljava/lang/Object;
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
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
        "<anonymous>",
        "(Lku/p0;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1"
    f = "ApiController.kt"
    l = {
        0xb0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ldp/h;

.field public final synthetic x:Lokhttp3/RequestBody;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Ldp/h;Lokhttp3/RequestBody;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            "Ljava/lang/String;",
            "Ldp/h;",
            "Lokhttp3/RequestBody;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->w:Ldp/h;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->x:Lokhttp3/RequestBody;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->w:Ldp/h;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->x:Lokhttp3/RequestBody;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Ldp/h;Lokhttp3/RequestBody;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->v:Ljava/lang/String;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->w:Ldp/h;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->x:Lokhttp3/RequestBody;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Ldp/h;Lokhttp3/RequestBody;Lnt/b;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->t:I

    invoke-static {v3, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
