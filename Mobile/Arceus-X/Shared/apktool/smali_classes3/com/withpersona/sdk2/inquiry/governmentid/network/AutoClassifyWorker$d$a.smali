.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;",
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
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;",
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
    c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1$2"
    f = "AutoClassifyWorker.kt"
    l = {
        0x8d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

.field public final synthetic v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/MultipartBody$Part;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;",
            "Ljava/util/List<",
            "Lokhttp3/MultipartBody$Part;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->v:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->v:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->l(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    move-result-object v3

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->m(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->k(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->v:Ljava/util/List;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->u:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->n(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;

    move-result-object v7

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->t:I

    move-object v8, p0

    invoke-interface/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$SupplementaryData;Lnt/b;)Ljava/lang/Object;

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
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
