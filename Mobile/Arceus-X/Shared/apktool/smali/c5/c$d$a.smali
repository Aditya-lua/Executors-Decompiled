.class public final Lc5/c$d$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc5/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lx4/g0;",
        "Lnt/b<",
        "-TR;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"
    }
    d2 = {
        "R",
        "Lx4/g0;",
        "transactor",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1"
    f = "DBUtil.android.kt"
    l = {
        0x38,
        0x39,
        0x3b,
        0x3c,
        0xac
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Lx4/u;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(ZZLx4/u;Lnt/b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-boolean p1, p0, Lc5/c$d$a;->w:Z

    iput-boolean p2, p0, Lc5/c$d$a;->x:Z

    iput-object p3, p0, Lc5/c$d$a;->y:Lx4/u;

    iput-object p5, p0, Lc5/c$d$a;->z:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lc5/c$d$a;

    iget-boolean v1, p0, Lc5/c$d$a;->w:Z

    iget-boolean v2, p0, Lc5/c$d$a;->x:Z

    iget-object v3, p0, Lc5/c$d$a;->y:Lx4/u;

    iget-object v5, p0, Lc5/c$d$a;->z:Lkotlin/jvm/functions/Function1;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lc5/c$d$a;-><init>(ZZLx4/u;Lnt/b;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v0, Lc5/c$d$a;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx4/g0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lc5/c$d$a;->q(Lx4/g0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lc5/c$d$a;->u:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v1, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    check-cast v1, Lx4/g0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-object v1, p0, Lc5/c$d$a;->t:Ljava/lang/Object;

    check-cast v1, Lx4/g0$a;

    iget-object v2, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    check-cast v2, Lx4/g0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lc5/c$d$a;->t:Ljava/lang/Object;

    check-cast v1, Lx4/g0$a;

    iget-object v2, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    check-cast v2, Lx4/g0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    check-cast p1, Lx4/g0;

    iget-boolean v1, p0, Lc5/c$d$a;->w:Z

    if-eqz v1, :cond_e

    iget-boolean v1, p0, Lc5/c$d$a;->x:Z

    if-eqz v1, :cond_6

    sget-object v2, Lx4/g0$a;->a:Lx4/g0$a;

    goto :goto_0

    :cond_6
    sget-object v2, Lx4/g0$a;->b:Lx4/g0$a;

    :goto_0
    if-nez v1, :cond_9

    iput-object p1, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    iput-object v2, p0, Lc5/c$d$a;->t:Ljava/lang/Object;

    iput v6, p0, Lc5/c$d$a;->u:I

    invoke-interface {p1, p0}, Lx4/g0;->b(Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object v7, v2

    move-object v2, p1

    move-object p1, v1

    move-object v1, v7

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Lc5/c$d$a;->y:Lx4/u;

    invoke-virtual {p1}, Lx4/u;->t()Landroidx/room/c;

    move-result-object p1

    iput-object v2, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    iput-object v1, p0, Lc5/c$d$a;->t:Ljava/lang/Object;

    iput v5, p0, Lc5/c$d$a;->u:I

    invoke-virtual {p1, p0}, Landroidx/room/c;->A(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_6

    :cond_8
    :goto_2
    move-object v7, v2

    move-object v2, v1

    move-object v1, v7

    goto :goto_3

    :cond_9
    move-object v1, p1

    :goto_3
    new-instance p1, Lc5/c$d$a$a;

    iget-object v5, p0, Lc5/c$d$a;->z:Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-direct {p1, v6, v5}, Lc5/c$d$a$a;-><init>(Lnt/b;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    iput-object v6, p0, Lc5/c$d$a;->t:Ljava/lang/Object;

    iput v4, p0, Lc5/c$d$a;->u:I

    invoke-interface {v1, v2, p1, p0}, Lx4/g0;->c(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_6

    :cond_a
    :goto_4
    iget-boolean v2, p0, Lc5/c$d$a;->x:Z

    if-nez v2, :cond_d

    iput-object p1, p0, Lc5/c$d$a;->v:Ljava/lang/Object;

    iput v3, p0, Lc5/c$d$a;->u:I

    invoke-interface {v1, p0}, Lx4/g0;->b(Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    goto :goto_6

    :cond_b
    move-object v0, p1

    move-object p1, v1

    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Lc5/c$d$a;->y:Lx4/u;

    invoke-virtual {p1}, Lx4/u;->t()Landroidx/room/c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/room/c;->u()V

    :cond_c
    return-object v0

    :cond_d
    return-object p1

    :cond_e
    iget-object p1, p0, Lc5/c$d$a;->z:Lkotlin/jvm/functions/Function1;

    iput v2, p0, Lc5/c$d$a;->u:I

    const/4 v1, 0x6

    invoke-static {v1}, Lkotlin/jvm/internal/l;->c(I)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x7

    invoke-static {v1}, Lkotlin/jvm/internal/l;->c(I)V

    if-ne p1, v0, :cond_f

    :goto_6
    return-object v0

    :cond_f
    return-object p1
.end method

.method public final q(Lx4/g0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/g0;",
            "Lnt/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lc5/c$d$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lc5/c$d$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lc5/c$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
