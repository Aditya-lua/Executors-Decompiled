.class public final Ldv/z$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/z;->c(Lav/p0;Lkotlin/coroutines/CoroutineContext;Ldv/h;Ldv/b0;Ldv/m0;Ljava/lang/Object;)Lav/d2;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1"
    f = "Share.kt"
    l = {
        0xd2,
        0xd6,
        0xd7,
        0xdd
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ldv/m0;

.field public final synthetic v:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic x:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldv/m0;Ldv/h;Ldv/b0;Ljava/lang/Object;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/m0;",
            "Ldv/h<",
            "+TT;>;",
            "Ldv/b0<",
            "TT;>;TT;",
            "Leu/b<",
            "-",
            "Ldv/z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv/z$a;->u:Ldv/m0;

    iput-object p2, p0, Ldv/z$a;->v:Ldv/h;

    iput-object p3, p0, Ldv/z$a;->w:Ldv/b0;

    iput-object p4, p0, Ldv/z$a;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance v0, Ldv/z$a;

    iget-object v1, p0, Ldv/z$a;->u:Ldv/m0;

    iget-object v2, p0, Ldv/z$a;->v:Ldv/h;

    iget-object v3, p0, Ldv/z$a;->w:Ldv/b0;

    iget-object v4, p0, Ldv/z$a;->x:Ljava/lang/Object;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ldv/z$a;-><init>(Ldv/m0;Ldv/h;Ldv/b0;Ljava/lang/Object;Leu/b;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldv/z$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ldv/z$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldv/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ldv/z$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldv/z$a;->t:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ldv/z$a;->u:Ldv/m0;

    sget-object v1, Ldv/m0;->a:Ldv/m0$a;

    invoke-virtual {v1}, Ldv/m0$a;->a()Ldv/m0;

    move-result-object v6

    if-ne p1, v6, :cond_4

    iget-object p1, p0, Ldv/z$a;->v:Ldv/h;

    iget-object v1, p0, Ldv/z$a;->w:Ldv/b0;

    iput v5, p0, Ldv/z$a;->t:I

    invoke-interface {p1, v1, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_4
    iget-object p1, p0, Ldv/z$a;->u:Ldv/m0;

    invoke-virtual {v1}, Ldv/m0$a;->b()Ldv/m0;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_6

    iget-object p1, p0, Ldv/z$a;->w:Ldv/b0;

    invoke-interface {p1}, Ldv/b0;->f()Ldv/p0;

    move-result-object p1

    new-instance v1, Ldv/z$a$a;

    invoke-direct {v1, v5}, Ldv/z$a$a;-><init>(Leu/b;)V

    iput v4, p0, Ldv/z$a;->t:I

    invoke-static {p1, v1, p0}, Ldv/j;->u(Ldv/h;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Ldv/z$a;->v:Ldv/h;

    iget-object v1, p0, Ldv/z$a;->w:Ldv/b0;

    iput v3, p0, Ldv/z$a;->t:I

    invoke-interface {p1, v1, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_6
    iget-object p1, p0, Ldv/z$a;->u:Ldv/m0;

    iget-object v1, p0, Ldv/z$a;->w:Ldv/b0;

    invoke-interface {v1}, Ldv/b0;->f()Ldv/p0;

    move-result-object v1

    invoke-interface {p1, v1}, Ldv/m0;->a(Ldv/p0;)Ldv/h;

    move-result-object p1

    invoke-static {p1}, Ldv/j;->m(Ldv/h;)Ldv/h;

    move-result-object p1

    new-instance v1, Ldv/z$a$b;

    iget-object v3, p0, Ldv/z$a;->v:Ldv/h;

    iget-object v4, p0, Ldv/z$a;->w:Ldv/b0;

    iget-object v6, p0, Ldv/z$a;->x:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, Ldv/z$a$b;-><init>(Ldv/h;Ldv/b0;Ljava/lang/Object;Leu/b;)V

    iput v2, p0, Ldv/z$a;->t:I

    invoke-static {p1, v1, p0}, Ldv/j;->j(Ldv/h;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
