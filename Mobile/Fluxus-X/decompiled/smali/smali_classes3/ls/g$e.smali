.class public final Lls/g$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lls/g;->p(Lls/h;)V
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
    c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$updateState$1"
    f = "WorkflowContextAdapter.kt"
    l = {
        0xa3
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public final synthetic y:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic z:Lls/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TState;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lls/g;Lls/h;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/g<",
            "TState;>;TState;",
            "Leu/b<",
            "-",
            "Lls/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lls/g$e;->y:Lls/g;

    iput-object p2, p0, Lls/g$e;->z:Lls/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance p1, Lls/g$e;

    iget-object v0, p0, Lls/g$e;->y:Lls/g;

    iget-object v1, p0, Lls/g$e;->z:Lls/h;

    invoke-direct {p1, v0, v1, p2}, Lls/g$e;-><init>(Lls/g;Lls/h;Leu/b;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lls/g$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lls/g$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lls/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lls/g$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lls/g$e;->x:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lls/g$e;->v:Ljava/lang/Object;

    check-cast v0, Lls/h;

    iget-object v1, p0, Lls/g$e;->u:Ljava/lang/Object;

    check-cast v1, Lls/g;

    iget-object v2, p0, Lls/g$e;->t:Ljava/lang/Object;

    check-cast v2, Lkv/a;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lls/g$e;->y:Lls/g;

    invoke-static {p1}, Lls/g;->c(Lls/g;)Lkv/a;

    move-result-object p1

    iget-object v1, p0, Lls/g$e;->y:Lls/g;

    iget-object v4, p0, Lls/g$e;->z:Lls/h;

    iput-object p1, p0, Lls/g$e;->t:Ljava/lang/Object;

    iput-object v1, p0, Lls/g$e;->u:Ljava/lang/Object;

    iput-object v4, p0, Lls/g$e;->v:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, p0, Lls/g$e;->w:I

    iput v2, p0, Lls/g$e;->x:I

    invoke-interface {p1, v3, p0}, Lkv/a;->d(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v2, p1

    move-object v0, v4

    :goto_0
    :try_start_0
    invoke-static {v1, v0}, Lls/g;->f(Lls/g;Lls/h;)V

    invoke-static {v1}, Lls/g;->d(Lls/g;)Landroidx/lifecycle/l0;

    move-result-object p1

    const-string v4, "WorkflowContextAdapter.state"

    invoke-virtual {p1, v4, v0}, Landroidx/lifecycle/l0;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lls/g;->h()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, v3}, Lkv/a;->f(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v2, v3}, Lkv/a;->f(Ljava/lang/Object;)V

    throw p1
.end method
