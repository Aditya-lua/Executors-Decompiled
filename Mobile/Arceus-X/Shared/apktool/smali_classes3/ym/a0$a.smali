.class public final Lym/a0$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lym/a0;->d(Lym/o;Ljava/lang/String;Lym/h;Lnt/b;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "OutputT",
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2"
    f = "WorkerWorkflow.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lym/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/o<",
            "TOutputT;>;"
        }
    .end annotation
.end field

.field public final synthetic v:Lym/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/h<",
            "Lym/r<",
            "-",
            "Lym/o<",
            "+TOutputT;>;",
            "Ljava/lang/Integer;",
            "+TOutputT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lym/o;Lym/h;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "+TOutputT;>;",
            "Lym/h<",
            "-",
            "Lym/r<",
            "-",
            "Lym/o<",
            "+TOutputT;>;",
            "Ljava/lang/Integer;",
            "+TOutputT;>;>;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lym/a0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lym/a0$a;->u:Lym/o;

    iput-object p2, p0, Lym/a0$a;->v:Lym/h;

    iput-object p3, p0, Lym/a0$a;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lym/a0$a;

    iget-object v0, p0, Lym/a0$a;->u:Lym/o;

    iget-object v1, p0, Lym/a0$a;->v:Lym/h;

    iget-object v2, p0, Lym/a0$a;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lym/a0$a;-><init>(Lym/o;Lym/h;Ljava/lang/String;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lym/a0$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lym/a0$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lym/a0$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lym/a0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lym/a0$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lym/a0$a;->u:Lym/o;

    invoke-static {p1}, Lym/a0;->a(Lym/o;)Lnu/h;

    move-result-object p1

    iget-object v1, p0, Lym/a0$a;->v:Lym/h;

    new-instance v3, Lym/a0$a$a;

    iget-object v4, p0, Lym/a0$a;->u:Lym/o;

    iget-object v5, p0, Lym/a0$a;->w:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lym/a0$a$a;-><init>(Lym/o;Ljava/lang/String;)V

    iput v2, p0, Lym/a0$a;->t:I

    invoke-static {p1, v1, v3, p0}, Lym/w;->i(Lnu/h;Lym/h;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
