.class public final Lhs/g1$c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhs/g1$c$b;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
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
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "R",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Ldv/i;


# direct methods
.method public constructor <init>(Ldv/i;)V
    .locals 0

    iput-object p1, p0, Lhs/g1$c$b$a;->a:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 5
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lhs/g1$c$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhs/g1$c$b$a$a;

    iget v1, v0, Lhs/g1$c$b$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhs/g1$c$b$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhs/g1$c$b$a$a;

    invoke-direct {v0, p0, p2}, Lhs/g1$c$b$a$a;-><init>(Lhs/g1$c$b$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lhs/g1$c$b$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lhs/g1$c$b$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lhs/g1$c$b$a$a;->z:Ljava/lang/Object;

    check-cast p1, Ldv/i;

    iget-object p1, v0, Lhs/g1$c$b$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lhs/g1$c$b$a$a;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lhs/g1$c$b$a;->a:Ldv/i;

    move-object v2, p1

    check-cast v2, Les/s6$b;

    invoke-virtual {v2}, Les/s6$b;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lhs/g1$c$b$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lhs/g1$c$b$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lhs/g1$c$b$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lhs/g1$c$b$a$a;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lhs/g1$c$b$a$a;->A:I

    iput v3, v0, Lhs/g1$c$b$a$a;->u:I

    invoke-interface {p2, v2, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
