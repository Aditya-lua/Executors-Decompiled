.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnt/b<",
        "-",
        "Ljv/x<",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ljv/x;",
        "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
        "<anonymous>",
        "()Ljv/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$result$1$1"
    f = "ApiController.kt"
    l = {
        0xb1
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
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->w:Ldp/h;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->x:Lokhttp3/RequestBody;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->w:Ldp/h;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->x:Lokhttp3/RequestBody;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Ldp/h;Lokhttp3/RequestBody;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->g()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    move-result-object v3

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->v:Ljava/lang/String;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->w:Ldp/h;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->d(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;)I

    move-result v6

    new-instance v7, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->x:Lokhttp3/RequestBody;

    invoke-virtual {p1}, Lokhttp3/RequestBody;->contentLength()J

    move-result-wide v8

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->x:Lokhttp3/RequestBody;

    invoke-virtual {p1}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lokhttp3/MediaType;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "application/json"

    :cond_3
    invoke-direct {v7, v8, v9, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;-><init>(JLjava/lang/String;)V

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->t:I

    move-object v8, p0

    invoke-interface/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;->c(Ljava/lang/String;Ldp/h;ILcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
