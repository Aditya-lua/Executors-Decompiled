.class public final Lvo/o$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvo/o$c;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
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

.field public final synthetic b:Lvo/o;


# direct methods
.method public constructor <init>(Ldv/i;Lvo/o;)V
    .locals 0

    iput-object p1, p0, Lvo/o$c$a;->a:Ldv/i;

    iput-object p2, p0, Lvo/o$c$a;->b:Lvo/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lvo/o$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvo/o$c$a$a;

    iget v1, v0, Lvo/o$c$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvo/o$c$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvo/o$c$a$a;

    invoke-direct {v0, p0, p2}, Lvo/o$c$a$a;-><init>(Lvo/o$c$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lvo/o$c$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lvo/o$c$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvo/o$c$a$a;->A:Ljava/lang/Object;

    check-cast p1, Lzt/n;

    iget-object p1, v0, Lvo/o$c$a$a;->z:Ljava/lang/Object;

    check-cast p1, Ldv/i;

    iget-object p1, v0, Lvo/o$c$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lvo/o$c$a$a;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lvo/o$c$a;->a:Ldv/i;

    move-object v2, p1

    check-cast v2, Lzt/n;

    invoke-virtual {v2}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_5

    check-cast v2, Lsn/w0;

    instance-of v4, v2, Lsn/w0$b;

    if-eqz v4, :cond_4

    check-cast v2, Lsn/w0$b;

    invoke-virtual {v2}, Lsn/w0$b;->e()Lsn/j0;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v5, p0, Lvo/o$c$a;->b:Lvo/o;

    invoke-static {v5}, Lvo/o;->e(Lvo/o;)Ldp/a;

    move-result-object v6

    invoke-static {v6, v4}, Ldp/b;->b(Ldp/a;Lsn/j0;)Ldp/a;

    move-result-object v4

    invoke-static {v5, v4}, Lvo/o;->f(Lvo/o;Ldp/a;)V

    iget-object v4, p0, Lvo/o$c$a;->b:Lvo/o;

    invoke-static {v4}, Lvo/o;->e(Lvo/o;)Ldp/a;

    move-result-object v4

    invoke-static {v4}, Ldp/b;->a(Ldp/a;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lvo/o$c$a;->b:Lvo/o;

    invoke-static {v4, v2}, Lvo/o;->d(Lvo/o;Lsn/w0$b;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v2

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lvo/o$c$a;->b:Lvo/o;

    invoke-static {v4, v2}, Lvo/o;->d(Lvo/o;Lsn/w0$b;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_1

    :cond_5
    invoke-static {v4}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_6

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lvo/o$c$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lvo/o$c$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvo/o$c$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvo/o$c$a$a;->z:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvo/o$c$a$a;->A:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lvo/o$c$a$a;->B:I

    iput v3, v0, Lvo/o$c$a$a;->u:I

    invoke-interface {p2, v2, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
