.class public final Ld5/c$a$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld5/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ly4/g0;",
        "Leu/b<",
        "-TR;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1"
    f = "DBUtil.android.kt"
    l = {
        0x38,
        0x39,
        0x3b,
        0x3c
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"
    }
    d2 = {
        "R",
        "Ly4/g0;",
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


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Ly4/u;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(ZZLy4/u;Leu/b;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-boolean p1, p0, Ld5/c$a$a$a;->w:Z

    iput-boolean p2, p0, Ld5/c$a$a$a;->x:Z

    iput-object p3, p0, Ld5/c$a$a$a;->y:Ly4/u;

    iput-object p5, p0, Ld5/c$a$a$a;->z:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance v0, Ld5/c$a$a$a;

    iget-boolean v1, p0, Ld5/c$a$a$a;->w:Z

    iget-boolean v2, p0, Ld5/c$a$a$a;->x:Z

    iget-object v3, p0, Ld5/c$a$a$a;->y:Ly4/u;

    iget-object v5, p0, Ld5/c$a$a$a;->z:Lkotlin/jvm/functions/Function1;

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ld5/c$a$a$a;-><init>(ZZLy4/u;Leu/b;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, v0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly4/g0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ld5/c$a$a$a;->m(Ly4/g0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld5/c$a$a$a;->u:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    check-cast v1, Ly4/g0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v1, p0, Ld5/c$a$a$a;->t:Ljava/lang/Object;

    check-cast v1, Ly4/g0$a;

    iget-object v4, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    check-cast v4, Ly4/g0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Ld5/c$a$a$a;->t:Ljava/lang/Object;

    check-cast v1, Ly4/g0$a;

    iget-object v5, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    check-cast v5, Ly4/g0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    check-cast p1, Ly4/g0;

    iget-boolean v1, p0, Ld5/c$a$a$a;->w:Z

    if-eqz v1, :cond_e

    iget-boolean v1, p0, Ld5/c$a$a$a;->x:Z

    if-eqz v1, :cond_5

    sget-object v6, Ly4/g0$a;->a:Ly4/g0$a;

    goto :goto_0

    :cond_5
    sget-object v6, Ly4/g0$a;->b:Ly4/g0$a;

    :goto_0
    if-nez v1, :cond_9

    iput-object p1, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    iput-object v6, p0, Ld5/c$a$a$a;->t:Ljava/lang/Object;

    iput v5, p0, Ld5/c$a$a$a;->u:I

    invoke-interface {p1, p0}, Ly4/g0;->b(Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    goto :goto_5

    :cond_6
    move-object v5, p1

    move-object p1, v1

    move-object v1, v6

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_8

    iget-object p1, p0, Ld5/c$a$a$a;->y:Ly4/u;

    invoke-virtual {p1}, Ly4/u;->t()Landroidx/room/c;

    move-result-object p1

    iput-object v5, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    iput-object v1, p0, Ld5/c$a$a$a;->t:Ljava/lang/Object;

    iput v4, p0, Ld5/c$a$a$a;->u:I

    invoke-virtual {p1, p0}, Landroidx/room/c;->A(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    move-object v4, v5

    :goto_2
    move-object v6, v1

    move-object v1, v4

    goto :goto_3

    :cond_8
    move-object v6, v1

    move-object v1, v5

    goto :goto_3

    :cond_9
    move-object v1, p1

    :goto_3
    new-instance p1, Ld5/c$a$a$a$a;

    iget-object v4, p0, Ld5/c$a$a$a;->z:Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    invoke-direct {p1, v5, v4}, Ld5/c$a$a$a$a;-><init>(Leu/b;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    iput-object v5, p0, Ld5/c$a$a$a;->t:Ljava/lang/Object;

    iput v3, p0, Ld5/c$a$a$a;->u:I

    invoke-interface {v1, v6, p1, p0}, Ly4/g0;->c(Ly4/g0$a;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_5

    :cond_a
    :goto_4
    iget-boolean v3, p0, Ld5/c$a$a$a;->x:Z

    if-nez v3, :cond_d

    iput-object p1, p0, Ld5/c$a$a$a;->v:Ljava/lang/Object;

    iput v2, p0, Ld5/c$a$a$a;->u:I

    invoke-interface {v1, p0}, Ly4/g0;->b(Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    :goto_5
    return-object v0

    :cond_b
    move-object v0, p1

    move-object p1, v1

    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Ld5/c$a$a$a;->y:Ly4/u;

    invoke-virtual {p1}, Ly4/u;->t()Landroidx/room/c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/room/c;->u()V

    :cond_c
    return-object v0

    :cond_d
    return-object p1

    :cond_e
    const-string v0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, La5/q;

    invoke-interface {p1}, La5/q;->d()Lg5/b;

    move-result-object p1

    iget-object v0, p0, Ld5/c$a$a$a;->z:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ly4/g0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/g0;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ld5/c$a$a$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ld5/c$a$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ld5/c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
