.class public final Ll6/w$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll6/w;->a(Ly6/g;Leu/b;)Ljava/lang/Object;
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
        "Ly6/k;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "coil3.RealImageLoader$execute$2"
    f = "RealImageLoader.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "Ly6/k;",
        "<anonymous>",
        "(Lav/p0;)Ly6/k;"
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

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ll6/w;

.field public final synthetic x:Ly6/g;


# direct methods
.method public constructor <init>(Ll6/w;Ly6/g;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll6/w;",
            "Ly6/g;",
            "Leu/b<",
            "-",
            "Ll6/w$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ll6/w$c;->w:Ll6/w;

    iput-object p2, p0, Ll6/w$c;->x:Ly6/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
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

    new-instance v0, Ll6/w$c;

    iget-object v1, p0, Ll6/w$c;->w:Ll6/w;

    iget-object v2, p0, Ll6/w$c;->x:Ly6/g;

    invoke-direct {v0, v1, v2, p2}, Ll6/w$c;-><init>(Ll6/w;Ly6/g;Leu/b;)V

    iput-object p1, v0, Ll6/w$c;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Ly6/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ll6/w$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ll6/w$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ll6/w$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ll6/w$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ll6/w$c;->v:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lav/p0;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Ll6/w$c;->u:I

    const/4 v7, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v7, :cond_0

    iget-object v0, p0, Ll6/w$c;->t:Ljava/lang/Object;

    check-cast v0, Lav/w0;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ll6/w$c;->w:Ll6/w;

    invoke-virtual {p1}, Ll6/w;->h()Ll6/w$a;

    move-result-object p1

    invoke-virtual {p1}, Ll6/w$a;->g()Lzt/h;

    move-result-object p1

    invoke-interface {p1}, Lzt/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Ll6/w$c$a;

    iget-object p1, p0, Ll6/w$c;->w:Ll6/w;

    iget-object v3, p0, Ll6/w$c;->x:Ly6/g;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v3, v5}, Ll6/w$c$a;-><init>(Ll6/w;Ly6/g;Leu/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object p1

    iget-object v2, p0, Ll6/w$c;->x:Ly6/g;

    invoke-static {v2, p1}, Ll6/a0;->c(Ly6/g;Lav/w0;)Ly6/d;

    move-result-object v2

    invoke-interface {v2}, Ly6/d;->b()Lav/w0;

    move-result-object v2

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll6/w$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll6/w$c;->t:Ljava/lang/Object;

    iput v7, p0, Ll6/w$c;->u:I

    invoke-interface {v2, p0}, Lav/w0;->y(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
