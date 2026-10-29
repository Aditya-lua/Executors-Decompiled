.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/lang/Object;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ljv/x;",
        "",
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
    c = "com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController$transition$uploadResult$1$1"
    f = "ApiController.kt"
    l = {
        0xd4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lokhttp3/RequestBody;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;",
            "Ljava/lang/String;",
            "Lokhttp3/RequestBody;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->w:Lokhttp3/RequestBody;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->w:Lokhttp3/RequestBody;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->u:Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;->g()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->w:Lokhttp3/RequestBody;

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService;->a(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
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
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
