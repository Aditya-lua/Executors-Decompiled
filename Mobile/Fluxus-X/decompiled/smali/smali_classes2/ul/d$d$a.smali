.class public final Lul/d$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul/d$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldv/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ldv/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/i<",
            "Lul/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldv/i;)V
    .locals 0

    iput-object p1, p0, Lul/d$d$a;->a:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lul/d$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lul/d$d$a$a;

    iget v1, v0, Lul/d$d$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lul/d$d$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lul/d$d$a$a;

    invoke-direct {v0, p0, p2}, Lul/d$d$a$a;-><init>(Lul/d$d$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lul/d$d$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lul/d$d$a$a;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lul/d$d$a$a;->E:I

    iget-object v2, v0, Lul/d$d$a$a;->D:Ljava/lang/Object;

    check-cast v2, Lul/a;

    iget-object v2, v0, Lul/d$d$a$a;->C:Ljava/lang/Object;

    check-cast v2, Lul/a;

    iget-object v2, v0, Lul/d$d$a$a;->B:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v5, v0, Lul/d$d$a$a;->A:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    iget-object v6, v0, Lul/d$d$a$a;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    iget-object v7, v0, Lul/d$d$a$a;->y:Ljava/lang/Object;

    check-cast v7, Ldv/i;

    iget-object v8, v0, Lul/d$d$a$a;->x:Ljava/lang/Object;

    check-cast v8, Leu/b;

    iget-object v9, v0, Lul/d$d$a$a;->w:Ljava/lang/Object;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object p2, v6

    move-object v6, v2

    move-object v2, v8

    move-object v8, v7

    move-object v7, p2

    move p2, p1

    move-object p1, v9

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lul/d$d$a;->a:Ldv/i;

    move-object v2, p1

    check-cast v2, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-virtual {v2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, p2

    move p2, v3

    move-object v7, v5

    move-object v5, v2

    move-object v2, v0

    :cond_3
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lul/a;

    invoke-virtual {v9}, Lul/a;->d()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lul/a;

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Lul/a;->m()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {v10}, Lul/a;->j()I

    move-result v11

    invoke-virtual {v9}, Lul/a;->j()I

    move-result v12

    if-ne v11, v12, :cond_4

    move v11, v4

    goto :goto_2

    :cond_4
    move v11, v3

    :goto_2
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    if-nez v11, :cond_3

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lul/d$d$a$a;->w:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lul/d$d$a$a;->x:Ljava/lang/Object;

    iput-object v8, v0, Lul/d$d$a$a;->y:Ljava/lang/Object;

    iput-object v7, v0, Lul/d$d$a$a;->z:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lul/d$d$a$a;->A:Ljava/lang/Object;

    iput-object v6, v0, Lul/d$d$a$a;->B:Ljava/lang/Object;

    invoke-static {v9}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v0, Lul/d$d$a$a;->C:Ljava/lang/Object;

    invoke-static {v10}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lul/d$d$a$a;->D:Ljava/lang/Object;

    iput p2, v0, Lul/d$d$a$a;->E:I

    iput v11, v0, Lul/d$d$a$a;->F:I

    iput v4, v0, Lul/d$d$a$a;->u:I

    invoke-interface {v8, v9, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_3

    return-object v1

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
