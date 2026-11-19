.class public final Les/o1$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Les/o1;->run()Ldv/h;
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
        "Les/o1$b;",
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
    c = "com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker$run$1"
    f = "CreateReusablePersonaWorker.kt"
    l = {
        0x25,
        0x2a,
        0x2f,
        0x36,
        0x40,
        0x49,
        0x4b
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Les/o1$b;",
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

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Les/o1;


# direct methods
.method public constructor <init>(Les/o1;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les/o1;",
            "Leu/b<",
            "-",
            "Les/o1$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Les/o1$c;->x:Les/o1;

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

    new-instance v0, Les/o1$c;

    iget-object v1, p0, Les/o1$c;->x:Les/o1;

    invoke-direct {v0, v1, p2}, Les/o1$c;-><init>(Les/o1;Leu/b;)V

    iput-object p1, v0, Les/o1$c;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Les/o1$c;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Les/o1$c;->w:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Les/o1$c;->v:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Les/o1$c;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v0, Lsw/x;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    iget-object v2, p0, Les/o1$c;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v3, Lsw/x;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, p0, Les/o1$c;->u:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v5, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v5, Lsw/x;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object p1, v5

    goto/16 :goto_4

    :pswitch_3
    iget-object v0, p0, Les/o1$c;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v0, Lsw/x;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v0, Lsw/x;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v0, p0, Les/o1$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_6
    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :pswitch_7
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Les/o1$c;->x:Les/o1;

    invoke-static {p1}, Les/o1;->h(Les/o1;)Lgs/c;

    move-result-object p1

    iget-object v2, p0, Les/o1$c;->x:Les/o1;

    invoke-static {v2}, Les/o1;->f(Les/o1;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Les/o1$c;->x:Les/o1;

    invoke-static {v5}, Les/o1;->g(Les/o1;)Ljava/lang/String;

    move-result-object v5

    iput-object v0, p0, Les/o1$c;->w:Ljava/lang/Object;

    iput v3, p0, Les/o1$c;->v:I

    invoke-interface {p1, v2, v5, p0}, Lgs/c;->a(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_8

    :cond_0
    :goto_0
    check-cast p1, Lsw/x;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p1}, Lsw/x;->g()Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v2, Les/o1$b$b;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Lsw/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v3

    invoke-direct {v2, v3}, Les/o1$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Les/o1$c;->t:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Les/o1$c;->v:I

    invoke-interface {v0, v2, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lsw/x;->a()Ljava/lang/Object;

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

    new-instance v3, Les/o1$b$b;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v5, "Expected oneTimeLinkCode but got null."

    invoke-direct {v4, v5}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Les/o1$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Les/o1$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Les/o1$c;->u:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Les/o1$c;->v:I

    invoke-interface {v0, v3, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_8

    :cond_4
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object v5

    new-instance v6, Les/o1$c$a;

    iget-object v7, p0, Les/o1$c;->x:Les/o1;

    invoke-direct {v6, v7, v2, v4}, Les/o1$c$a;-><init>(Les/o1;Ljava/lang/String;Leu/b;)V

    iput-object v0, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Les/o1$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Les/o1$c;->u:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p0, Les/o1$c;->v:I

    invoke-static {v5, v6, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_6

    goto :goto_8

    :cond_6
    :goto_4
    new-instance v5, Laq/h;

    invoke-direct {v5}, Laq/h;-><init>()V

    invoke-static {v5, v3}, Ldv/j;->N(Ldv/h;I)Ldv/h;

    move-result-object v5

    iput-object v0, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Les/o1$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Les/o1$c;->u:Ljava/lang/Object;

    const/4 v6, 0x6

    iput v6, p0, Les/o1$c;->v:I

    invoke-static {v5, v4, p0, v3, v4}, Ldv/j;->S(Ldv/h;Ljava/util/List;Leu/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_7

    goto :goto_8

    :cond_7
    move-object v3, p1

    :goto_5
    sget-object p1, Les/o1$b$a;->a:Les/o1$b$a;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Les/o1$c;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Les/o1$c;->u:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Les/o1$c;->v:I

    invoke-interface {v0, p1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_8

    :cond_8
    :goto_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_7
    new-instance v2, Les/o1$b$b;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v4, "API response has unexpected shape."

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Les/o1$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Les/o1$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Les/o1$c;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Les/o1$c;->v:I

    invoke-interface {v0, v2, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

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

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Les/o1$b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Les/o1$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Les/o1$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Les/o1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
