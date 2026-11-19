.class public final Lls/g$d$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lls/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2"
    f = "WorkflowContextAdapter.kt"
    l = {
        0x66
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lls/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic v:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lls/j<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Lls/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lls/j;Lls/g;Ljava/lang/Class;Lls/g$b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "+TT;>;",
            "Lls/g<",
            "TState;>;",
            "Ljava/lang/Class<",
            "Lls/j<",
            "TT;>;>;",
            "Lls/g$b<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Lls/g$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lls/g$d$a;->u:Lls/j;

    iput-object p2, p0, Lls/g$d$a;->v:Lls/g;

    iput-object p3, p0, Lls/g$d$a;->w:Ljava/lang/Class;

    iput-object p4, p0, Lls/g$d$a;->x:Lls/g$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lls/g$d$a;

    iget-object v1, p0, Lls/g$d$a;->u:Lls/j;

    iget-object v2, p0, Lls/g$d$a;->v:Lls/g;

    iget-object v3, p0, Lls/g$d$a;->w:Ljava/lang/Class;

    iget-object v4, p0, Lls/g$d$a;->x:Lls/g$b;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lls/g$d$a;-><init>(Lls/j;Lls/g;Ljava/lang/Class;Lls/g$b;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
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

    .line 1
    invoke-virtual {p0, p1, p2}, Lls/g$d$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lls/g$d$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lls/g$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lls/g$d$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lls/g$d$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lls/g$d$a;->u:Lls/j;

    invoke-interface {p1}, Lls/j;->run()Ldv/h;

    move-result-object p1

    new-instance v1, Lls/g$d$a$a;

    iget-object v3, p0, Lls/g$d$a;->v:Lls/g;

    iget-object v4, p0, Lls/g$d$a;->x:Lls/g$b;

    invoke-direct {v1, v3, v4}, Lls/g$d$a$a;-><init>(Lls/g;Lls/g$b;)V

    iput v2, p0, Lls/g$d$a;->t:I

    invoke-interface {p1, v1, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_0
    :cond_2
    :goto_0
    iget-object p1, p0, Lls/g$d$a;->v:Lls/g;

    invoke-static {p1}, Lls/g;->e(Lls/g;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lls/g$d$a;->w:Ljava/lang/Class;

    iget-object v1, p0, Lls/g$d$a;->v:Lls/g;

    invoke-static {v1}, Lls/g;->e(Lls/g;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lls/g$d$a;->w:Ljava/lang/Class;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lls/g$d$a;->x:Lls/g$b;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
