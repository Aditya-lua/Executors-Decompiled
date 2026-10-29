.class public final Lcom/withpersona/sdk2/inquiry/ui/k$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/k;->run()Lnu/h;
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
        "Lcom/withpersona/sdk2/inquiry/ui/k$b;",
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
        "Lcom/withpersona/sdk2/inquiry/ui/k$b;",
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
    c = "com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker$run$1"
    f = "VerifyReusablePersonaWorker.kt"
    l = {
        0x2d,
        0x33,
        0x38,
        0x3f,
        0x49,
        0x52,
        0x54
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/ui/k;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/k;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/k;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/k$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/k$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/ui/k$c;-><init>(Lcom/withpersona/sdk2/inquiry/ui/k;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/k$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v3, Ljv/x;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v5, Ljv/x;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object p1, v5

    goto/16 :goto_4

    :pswitch_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_6
    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :pswitch_7
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/k;->i(Lcom/withpersona/sdk2/inquiry/ui/k;)Lqr/c;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/ui/k;->g(Lcom/withpersona/sdk2/inquiry/ui/k;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/ui/k;->h(Lcom/withpersona/sdk2/inquiry/ui/k;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;->b:Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$a;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/ui/k;->e(Lcom/withpersona/sdk2/inquiry/ui/k;)Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest$a;->a(Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;

    move-result-object v6

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-interface {p1, v2, v5, v6, p0}, Lqr/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeForPersonasRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_8

    :cond_0
    :goto_0
    check-cast p1, Ljv/x;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p1}, Ljv/x;->g()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-interface {v0, v2, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/network/OneTimeLinkCodeResponse;->a()Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/network/Metadata;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v4

    :goto_2
    if-nez v2, :cond_5

    new-instance v3, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v5, "Expected oneTimeLinkCode but got null."

    invoke-direct {v4, v5}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-interface {v0, v3, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v5

    new-instance v6, Lcom/withpersona/sdk2/inquiry/ui/k$c$a;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->x:Lcom/withpersona/sdk2/inquiry/ui/k;

    invoke-direct {v6, v7, v2, v4}, Lcom/withpersona/sdk2/inquiry/ui/k$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/ui/k;Ljava/lang/String;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-static {v5, v6, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto :goto_8

    :cond_6
    :goto_4
    new-instance v5, Lmp/h;

    invoke-direct {v5}, Lmp/h;-><init>()V

    invoke-static {v5, v3}, Lnu/j;->M(Lnu/h;I)Lnu/h;

    move-result-object v5

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-static {v5, v4, p0, v3, v4}, Lnu/j;->R(Lnu/h;Ljava/util/List;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_7

    goto :goto_8

    :cond_7
    move-object v3, p1

    :goto_5
    sget-object p1, Lcom/withpersona/sdk2/inquiry/ui/k$b$a;->a:Lcom/withpersona/sdk2/inquiry/ui/k$b$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->u:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_8

    :cond_8
    :goto_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_7
    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v4, "API response has unexpected shape."

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/k$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/ui/k$c;->v:I

    invoke-interface {v0, v2, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_8
    return-object v1

    :cond_9
    :goto_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/k$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/k$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/k$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/k$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
