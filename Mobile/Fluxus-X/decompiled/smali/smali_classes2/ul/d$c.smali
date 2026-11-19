.class public final Lul/d$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lpu/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul/d;->g(Ljava/lang/String;)Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lpu/n<",
        "Ldv/i<",
        "-",
        "Lul/a;",
        ">;",
        "Lul/a;",
        "Leu/b<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.protocols.calling.ActiveCalls$follow$2"
    f = "ActiveCalls.kt"
    l = {
        0x7f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ldv/i;",
        "Lul/a;",
        "call",
        "",
        "<anonymous>",
        "(Ldv/i;Lul/a;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Leu/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lul/d$c;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Lul/a;

    check-cast p3, Leu/b;

    invoke-virtual {p0, p1, p2, p3}, Lul/d$c;->m(Ldv/i;Lul/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lul/d$c;->u:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    iget-object v1, p0, Lul/d$c;->v:Ljava/lang/Object;

    check-cast v1, Lul/a;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, Lul/d$c;->t:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lul/a;->m()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lul/d$c;->u:Ljava/lang/Object;

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lul/d$c;->v:Ljava/lang/Object;

    iput v4, p0, Lul/d$c;->t:I

    invoke-interface {v0, v1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    invoke-static {v4}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    invoke-static {p1}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ldv/i;Lul/a;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lul/a;",
            ">;",
            "Lul/a;",
            "Leu/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lul/d$c;

    invoke-direct {v0, p3}, Lul/d$c;-><init>(Leu/b;)V

    iput-object p1, v0, Lul/d$c;->u:Ljava/lang/Object;

    iput-object p2, v0, Lul/d$c;->v:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lul/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
