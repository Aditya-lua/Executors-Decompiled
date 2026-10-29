.class public final Lcom/withpersona/sdk2/inquiry/ui/h$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/ui/h;->run()Lnu/h;
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
        "Lcom/withpersona/sdk2/inquiry/ui/h$b;",
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
        "Lcom/withpersona/sdk2/inquiry/ui/h$b;",
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
    c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1"
    f = "UiStepFileSelectWorker.kt"
    l = {
        0x2a,
        0x2e,
        0x32,
        0x36,
        0x37
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/ui/h;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/ui/h;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/h;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/ui/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/h$c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/ui/h$c;-><init>(Lcom/withpersona/sdk2/inquiry/ui/h;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/h$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v8, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/ui/h$c$b;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-direct {p1, v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/h$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/ui/h;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    iput v8, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    const-wide/16 v8, 0x64

    invoke-static {v8, v9, p1, p0}, Lku/g3;->e(JLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_0
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_8

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    iput v7, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    invoke-static {v2, v0, p1, p0}, Lcom/withpersona/sdk2/inquiry/ui/h;->g(Lcom/withpersona/sdk2/inquiry/ui/h;Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_8
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v2

    new-instance v7, Lcom/withpersona/sdk2/inquiry/ui/h$c$a;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-direct {v7, v8, v3}, Lcom/withpersona/sdk2/inquiry/ui/h$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/ui/h;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    invoke-static {v2, v7, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    goto :goto_4

    :cond_9
    move-object v2, p1

    :goto_2
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/ui/h;->e(Lcom/withpersona/sdk2/inquiry/ui/h;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    check-cast p1, Ljava/util/List;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->x:Lcom/withpersona/sdk2/inquiry/ui/h;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->u:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/ui/h$c;->v:I

    invoke-static {v3, v0, p1, p0}, Lcom/withpersona/sdk2/inquiry/ui/h;->g(Lcom/withpersona/sdk2/inquiry/ui/h;Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_4
    return-object v1

    :cond_b
    :goto_5
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
            "Lcom/withpersona/sdk2/inquiry/ui/h$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/h$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/h$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
