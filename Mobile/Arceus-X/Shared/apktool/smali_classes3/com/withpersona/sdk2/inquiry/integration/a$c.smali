.class public final Lcom/withpersona/sdk2/inquiry/integration/a$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/integration/a;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/integration/a$c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/integration/a$b;",
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
        "Lcom/withpersona/sdk2/inquiry/integration/a$b;",
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
    c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1"
    f = "IntegrationBrowserWorker.kt"
    l = {
        0x3d,
        0x44,
        0x47,
        0x5a,
        0x5c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/integration/a;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/integration/a;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->v:Lcom/withpersona/sdk2/inquiry/integration/a;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/a$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->v:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c;-><init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v8, :cond_4

    if-eq v2, v6, :cond_0

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :cond_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->v:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/a;->g(Lcom/withpersona/sdk2/inquiry/integration/a;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;

    move-result-object p1

    sget-object v2, Lcom/withpersona/sdk2/inquiry/integration/a$c$c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v8, :cond_9

    if-ne p1, v6, :cond_8

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->v:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-direct {v2, v6, v7}, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    invoke-static {p1, v2, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_0
    new-instance p1, Lmp/h;

    invoke-direct {p1}, Lmp/h;-><init>()V

    invoke-static {p1, v8}, Lnu/j;->M(Lnu/h;I)Lnu/h;

    move-result-object p1

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    invoke-static {p1, v7, p0, v8, v7}, Lnu/j;->R(Lnu/h;Ljava/util/List;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    sget-object p1, Lcom/withpersona/sdk2/inquiry/integration/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/integration/a$b$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_3

    :cond_8
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_9
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/integration/a$c$a;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->v:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-direct {v2, v3, v7}, Lcom/withpersona/sdk2/inquiry/integration/a$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    iput v8, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    invoke-static {p1, v2, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    sget-object p1, Lcom/withpersona/sdk2/inquiry/integration/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/integration/a$b$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->u:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c;->t:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_3
    return-object v1

    :cond_b
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/a$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/a$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
