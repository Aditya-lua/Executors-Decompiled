.class public final Lyu/d$c;
.super Lpt/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyu/d;->f(Lxu/l;Lxu/h0;Z)Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Liu/h<",
        "-",
        "Lxu/h0;",
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
        "Liu/h;",
        "Lxu/h0;",
        "",
        "<anonymous>",
        "(Liu/h;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "okio.internal.-FileSystem$commonListRecursively$1"
    f = "FileSystem.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lxu/l;

.field public final synthetic B:Z

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lxu/h0;


# direct methods
.method public constructor <init>(Lxu/h0;Lxu/l;ZLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/h0;",
            "Lxu/l;",
            "Z",
            "Lnt/b<",
            "-",
            "Lyu/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyu/d$c;->z:Lxu/h0;

    iput-object p2, p0, Lyu/d$c;->A:Lxu/l;

    iput-boolean p3, p0, Lyu/d$c;->B:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/k;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lyu/d$c;

    iget-object v1, p0, Lyu/d$c;->z:Lxu/h0;

    iget-object v2, p0, Lyu/d$c;->A:Lxu/l;

    iget-boolean v3, p0, Lyu/d$c;->B:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lyu/d$c;-><init>(Lxu/h0;Lxu/l;ZLnt/b;)V

    iput-object p1, v0, Lyu/d$c;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liu/h;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lyu/d$c;->q(Liu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lyu/d$c;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Liu/h;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lyu/d$c;->x:I

    const/4 v8, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v2, p0, Lyu/d$c;->w:Ljava/lang/Object;

    check-cast v2, Lxu/h0;

    iget-object v2, p0, Lyu/d$c;->v:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, p0, Lyu/d$c;->u:Ljava/lang/Object;

    check-cast v3, Lkotlin/collections/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/collections/i;

    invoke-direct {p1}, Lkotlin/collections/i;-><init>()V

    iget-object v2, p0, Lyu/d$c;->z:Lxu/h0;

    invoke-virtual {p1, v2}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    iget-object v2, p0, Lyu/d$c;->A:Lxu/l;

    iget-object v3, p0, Lyu/d$c;->z:Lxu/h0;

    invoke-virtual {v2, v3}, Lxu/l;->list(Lxu/h0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v3, p1

    :goto_0
    move-object p1, v2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lxu/h0;

    iget-object v2, p0, Lyu/d$c;->A:Lxu/l;

    iget-boolean v5, p0, Lyu/d$c;->B:Z

    iput-object v1, p0, Lyu/d$c;->y:Ljava/lang/Object;

    iput-object v3, p0, Lyu/d$c;->u:Ljava/lang/Object;

    iput-object p1, p0, Lyu/d$c;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lyu/d$c;->w:Ljava/lang/Object;

    iput v8, p0, Lyu/d$c;->x:I

    const/4 v6, 0x0

    move-object v7, p0

    invoke-static/range {v1 .. v7}, Lyu/d;->a(Liu/h;Lxu/l;Lkotlin/collections/i;Lxu/h0;ZZLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Liu/h;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu/h<",
            "-",
            "Lxu/h0;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lyu/d$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lyu/d$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lyu/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
