.class public final Lsl/w$b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl/w$b$c;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
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
        "Lnu/i;"
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
.field public final synthetic a:Lnu/i;

.field public final synthetic b:Lku/p0;

.field public final synthetic c:Lsl/w;


# direct methods
.method public constructor <init>(Lnu/i;Lku/p0;Lsl/w;)V
    .locals 0

    iput-object p1, p0, Lsl/w$b$c$a;->a:Lnu/i;

    iput-object p2, p0, Lsl/w$b$c$a;->b:Lku/p0;

    iput-object p3, p0, Lsl/w$b$c$a;->c:Lsl/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lsl/w$b$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsl/w$b$c$a$a;

    iget v1, v0, Lsl/w$b$c$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsl/w$b$c$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsl/w$b$c$a$a;

    invoke-direct {v0, p0, p2}, Lsl/w$b$c$a$a;-><init>(Lsl/w$b$c$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lsl/w$b$c$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lsl/w$b$c$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lsl/w$b$c$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object p1, v0, Lsl/w$b$c$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lsl/w$b$c$a$a;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lsl/w$b$c$a;->a:Lnu/i;

    move-object v2, p1

    check-cast v2, Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Syncing "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " achievements to remote"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "rbx.achievement.replicator"

    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsl/a;

    iget-object v6, p0, Lsl/w$b$c$a;->b:Lku/p0;

    new-instance v9, Lsl/w$b$a;

    iget-object v7, p0, Lsl/w$b$c$a;->c:Lsl/w;

    const/4 v8, 0x0

    invoke-direct {v9, v7, v5, v8}, Lsl/w$b$a;-><init>(Lsl/w;Lsl/a;Lnt/b;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v11}, Lku/i;->b(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/w0;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsl/w$b$c$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsl/w$b$c$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lsl/w$b$c$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lsl/w$b$c$a$a;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lsl/w$b$c$a$a;->A:I

    iput v3, v0, Lsl/w$b$c$a$a;->u:I

    invoke-interface {p2, v4, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
