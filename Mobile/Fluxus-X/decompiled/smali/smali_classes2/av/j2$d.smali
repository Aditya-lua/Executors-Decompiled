.class public final Lav/j2$d;
.super Lgu/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lav/j2;->getChildren()Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lyu/h<",
        "-",
        "Lav/d2;",
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
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    l = {
        0x3eb,
        0x3ed
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lyu/h;",
        "Lav/d2;",
        "",
        "<anonymous>",
        "(Lyu/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lav/j2;


# direct methods
.method public constructor <init>(Lav/j2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/j2;",
            "Leu/b<",
            "-",
            "Lav/j2$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lav/j2$d;->y:Lav/j2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/k;-><init>(ILeu/b;)V

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

    new-instance v0, Lav/j2$d;

    iget-object v1, p0, Lav/j2$d;->y:Lav/j2;

    invoke-direct {v0, v1, p2}, Lav/j2$d;-><init>(Lav/j2;Leu/b;)V

    iput-object p1, v0, Lav/j2$d;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyu/h;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lav/j2$d;->m(Lyu/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lav/j2$d;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lav/j2$d;->v:Ljava/lang/Object;

    check-cast v1, Lgv/p;

    iget-object v3, p0, Lav/j2$d;->u:Ljava/lang/Object;

    check-cast v3, Lgv/o;

    iget-object v4, p0, Lav/j2$d;->x:Ljava/lang/Object;

    check-cast v4, Lyu/h;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lav/j2$d;->x:Ljava/lang/Object;

    check-cast p1, Lyu/h;

    iget-object v1, p0, Lav/j2$d;->y:Lav/j2;

    invoke-virtual {v1}, Lav/j2;->l0()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lav/v;

    if-eqz v4, :cond_3

    check-cast v1, Lav/v;

    iget-object v1, v1, Lav/v;->e:Lav/w;

    iput v3, p0, Lav/j2$d;->w:I

    invoke-virtual {p1, v1, p0}, Lyu/h;->a(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    instance-of v3, v1, Lav/y1;

    if-eqz v3, :cond_5

    check-cast v1, Lav/y1;

    invoke-interface {v1}, Lav/y1;->d()Lav/o2;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lgv/p;->l()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgv/p;

    move-object v4, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, p1

    :goto_0
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    instance-of p1, v1, Lav/v;

    if-eqz p1, :cond_4

    move-object p1, v1

    check-cast p1, Lav/v;

    iget-object p1, p1, Lav/v;->e:Lav/w;

    iput-object v4, p0, Lav/j2$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lav/j2$d;->u:Ljava/lang/Object;

    iput-object v1, p0, Lav/j2$d;->v:Ljava/lang/Object;

    iput v2, p0, Lav/j2$d;->w:I

    invoke-virtual {v4, p1, p0}, Lyu/h;->a(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    invoke-virtual {v1}, Lgv/p;->m()Lgv/p;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Lyu/h;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyu/h<",
            "-",
            "Lav/d2;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lav/j2$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lav/j2$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lav/j2$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
