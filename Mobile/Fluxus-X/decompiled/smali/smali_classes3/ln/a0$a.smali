.class public final Lln/a0$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lln/a0;->d(Lln/o;Ljava/lang/String;Lln/h;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.squareup.workflow1.Workflows__WorkerWorkflowKt$runWorker$2"
    f = "WorkerWorkflow.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "OutputT",
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lln/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/o<",
            "TOutputT;>;"
        }
    .end annotation
.end field

.field public final synthetic v:Lln/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/h<",
            "Lln/r<",
            "-",
            "Lln/o<",
            "+TOutputT;>;",
            "Ljava/lang/Integer;",
            "+TOutputT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lln/o;Lln/h;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "+TOutputT;>;",
            "Lln/h<",
            "-",
            "Lln/r<",
            "-",
            "Lln/o<",
            "+TOutputT;>;",
            "Ljava/lang/Integer;",
            "+TOutputT;>;>;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lln/a0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lln/a0$a;->u:Lln/o;

    iput-object p2, p0, Lln/a0$a;->v:Lln/h;

    iput-object p3, p0, Lln/a0$a;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance p1, Lln/a0$a;

    iget-object v0, p0, Lln/a0$a;->u:Lln/o;

    iget-object v1, p0, Lln/a0$a;->v:Lln/h;

    iget-object v2, p0, Lln/a0$a;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lln/a0$a;-><init>(Lln/o;Lln/h;Ljava/lang/String;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lln/a0$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lln/a0$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lln/a0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lln/a0$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

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

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lln/a0$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lln/a0$a;->u:Lln/o;

    invoke-static {p1}, Lln/a0;->a(Lln/o;)Ldv/h;

    move-result-object p1

    iget-object v1, p0, Lln/a0$a;->v:Lln/h;

    new-instance v3, Lln/a0$a$a;

    iget-object v4, p0, Lln/a0$a;->u:Lln/o;

    iget-object v5, p0, Lln/a0$a;->w:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Lln/a0$a$a;-><init>(Lln/o;Ljava/lang/String;)V

    iput v2, p0, Lln/a0$a;->t:I

    invoke-static {p1, v1, v3, p0}, Lln/w;->i(Ldv/h;Lln/h;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
