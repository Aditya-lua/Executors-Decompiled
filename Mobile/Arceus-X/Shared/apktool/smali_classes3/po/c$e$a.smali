.class public final Lpo/c$e$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpo/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "+",
        "Ljava/lang/Object;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
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
    c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1$2"
    f = "SubmitVerificationWorker.kt"
    l = {
        0x57,
        0x5c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lpo/c;

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
.method public constructor <init>(Lpo/c;Ljava/util/List;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpo/c;",
            "Ljava/util/List<",
            "Lokhttp3/MultipartBody$Part;",
            ">;",
            "Lnt/b<",
            "-",
            "Lpo/c$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpo/c$e$a;->u:Lpo/c;

    iput-object p2, p0, Lpo/c$e$a;->v:Ljava/util/List;

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

    new-instance v0, Lpo/c$e$a;

    iget-object v1, p0, Lpo/c$e$a;->u:Lpo/c;

    iget-object v2, p0, Lpo/c$e$a;->v:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lpo/c$e$a;-><init>(Lpo/c;Ljava/util/List;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lpo/c$e$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lpo/c$e$a;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {p1}, Lpo/c;->g(Lpo/c;)Lfo/a;

    move-result-object p1

    invoke-interface {p1}, Lfo/a;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {p1}, Lpo/c;->g(Lpo/c;)Lfo/a;

    move-result-object p1

    iget-object v1, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {v1}, Lpo/c;->m(Lpo/c;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lpo/c$e$a;->v:Ljava/util/List;

    iput v3, p0, Lpo/c$e$a;->t:I

    invoke-interface {p1, v1, v2, p0}, Lfo/a;->a(Ljava/lang/String;Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljv/x;

    return-object p1

    :cond_4
    iget-object p1, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {p1}, Lpo/c;->l(Lpo/c;)Lcom/withpersona/sdk2/inquiry/governmentid/network/b;

    move-result-object p1

    iget-object v1, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {v1}, Lpo/c;->m(Lpo/c;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lpo/c$e$a;->u:Lpo/c;

    invoke-static {v3}, Lpo/c;->k(Lpo/c;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lpo/c$e$a;->v:Ljava/util/List;

    iput v2, p0, Lpo/c$e$a;->t:I

    invoke-interface {p1, v1, v3, v4, p0}, Lcom/withpersona/sdk2/inquiry/governmentid/network/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Ljv/x;

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
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lpo/c$e$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lpo/c$e$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lpo/c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
