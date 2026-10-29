.class public final Lvr/f$d$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr/f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1$1$2"
    f = "WorkflowContextAdapter.kt"
    l = {
        0x66
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lvr/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic v:Lvr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lvr/h<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Lvr/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvr/h;Lvr/f;Ljava/lang/Class;Lvr/f$b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "+TT;>;",
            "Lvr/f<",
            "TState;>;",
            "Ljava/lang/Class<",
            "Lvr/h<",
            "TT;>;>;",
            "Lvr/f$b<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lvr/f$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr/f$d$a;->u:Lvr/h;

    iput-object p2, p0, Lvr/f$d$a;->v:Lvr/f;

    iput-object p3, p0, Lvr/f$d$a;->w:Ljava/lang/Class;

    iput-object p4, p0, Lvr/f$d$a;->x:Lvr/f$b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lvr/f$d$a;

    iget-object v1, p0, Lvr/f$d$a;->u:Lvr/h;

    iget-object v2, p0, Lvr/f$d$a;->v:Lvr/f;

    iget-object v3, p0, Lvr/f$d$a;->w:Ljava/lang/Class;

    iget-object v4, p0, Lvr/f$d$a;->x:Lvr/f$b;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvr/f$d$a;-><init>(Lvr/h;Lvr/f;Ljava/lang/Class;Lvr/f$b;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lvr/f$d$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
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

    .line 2
    invoke-virtual {p0, p1, p2}, Lvr/f$d$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lvr/f$d$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lvr/f$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lvr/f$d$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lvr/f$d$a;->u:Lvr/h;

    invoke-interface {p1}, Lvr/h;->run()Lnu/h;

    move-result-object p1

    new-instance v1, Lvr/f$d$a$a;

    iget-object v3, p0, Lvr/f$d$a;->v:Lvr/f;

    iget-object v4, p0, Lvr/f$d$a;->x:Lvr/f$b;

    invoke-direct {v1, v3, v4}, Lvr/f$d$a$a;-><init>(Lvr/f;Lvr/f$b;)V

    iput v2, p0, Lvr/f$d$a;->t:I

    invoke-interface {p1, v1, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_0
    :cond_2
    :goto_0
    iget-object p1, p0, Lvr/f$d$a;->v:Lvr/f;

    invoke-static {p1}, Lvr/f;->e(Lvr/f;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lvr/f$d$a;->w:Ljava/lang/Class;

    iget-object v1, p0, Lvr/f$d$a;->v:Lvr/f;

    invoke-static {v1}, Lvr/f;->e(Lvr/f;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lvr/f$d$a;->w:Ljava/lang/Class;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, Lvr/f$d$a;->x:Lvr/f$b;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
