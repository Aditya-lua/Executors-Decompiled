.class public final Lnu/z$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/z;->c(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lnu/h;Lnu/b0;Lnu/m0;Ljava/lang/Object;)Lku/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
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


# instance fields
.field public t:I

.field public final synthetic u:Lnu/m0;

.field public final synthetic v:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
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
.method public constructor <init>(Lnu/m0;Lnu/h;Lnu/b0;Ljava/lang/Object;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/m0;",
            "Lnu/h<",
            "+TT;>;",
            "Lnu/b0<",
            "TT;>;TT;",
            "Lnt/b<",
            "-",
            "Lnu/z$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/z$a;->u:Lnu/m0;

    iput-object p2, p0, Lnu/z$a;->v:Lnu/h;

    iput-object p3, p0, Lnu/z$a;->w:Lnu/b0;

    iput-object p4, p0, Lnu/z$a;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lnu/z$a;

    iget-object v1, p0, Lnu/z$a;->u:Lnu/m0;

    iget-object v2, p0, Lnu/z$a;->v:Lnu/h;

    iget-object v3, p0, Lnu/z$a;->w:Lnu/b0;

    iget-object v4, p0, Lnu/z$a;->x:Ljava/lang/Object;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnu/z$a;-><init>(Lnu/m0;Lnu/h;Lnu/b0;Ljava/lang/Object;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lnu/z$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lnu/z$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lnu/z$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnu/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/z$a;->t:I

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
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/z$a;->u:Lnu/m0;

    sget-object v1, Lnu/m0;->a:Lnu/m0$a;

    invoke-virtual {v1}, Lnu/m0$a;->a()Lnu/m0;

    move-result-object v6

    if-ne p1, v6, :cond_4

    iget-object p1, p0, Lnu/z$a;->v:Lnu/h;

    iget-object v1, p0, Lnu/z$a;->w:Lnu/b0;

    iput v5, p0, Lnu/z$a;->t:I

    invoke-interface {p1, v1, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lnu/z$a;->u:Lnu/m0;

    invoke-virtual {v1}, Lnu/m0$a;->b()Lnu/m0;

    move-result-object v1

    const/4 v5, 0x0

    if-ne p1, v1, :cond_6

    iget-object p1, p0, Lnu/z$a;->w:Lnu/b0;

    invoke-interface {p1}, Lnu/b0;->g()Lnu/p0;

    move-result-object p1

    new-instance v1, Lnu/z$a$a;

    invoke-direct {v1, v5}, Lnu/z$a$a;-><init>(Lnt/b;)V

    iput v4, p0, Lnu/z$a;->t:I

    invoke-static {p1, v1, p0}, Lnu/j;->t(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lnu/z$a;->v:Lnu/h;

    iget-object v1, p0, Lnu/z$a;->w:Lnu/b0;

    iput v3, p0, Lnu/z$a;->t:I

    invoke-interface {p1, v1, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lnu/z$a;->u:Lnu/m0;

    iget-object v1, p0, Lnu/z$a;->w:Lnu/b0;

    invoke-interface {v1}, Lnu/b0;->g()Lnu/p0;

    move-result-object v1

    invoke-interface {p1, v1}, Lnu/m0;->a(Lnu/p0;)Lnu/h;

    move-result-object p1

    invoke-static {p1}, Lnu/j;->m(Lnu/h;)Lnu/h;

    move-result-object p1

    new-instance v1, Lnu/z$a$b;

    iget-object v3, p0, Lnu/z$a;->v:Lnu/h;

    iget-object v4, p0, Lnu/z$a;->w:Lnu/b0;

    iget-object v6, p0, Lnu/z$a;->x:Ljava/lang/Object;

    invoke-direct {v1, v3, v4, v6, v5}, Lnu/z$a$b;-><init>(Lnu/h;Lnu/b0;Ljava/lang/Object;Lnt/b;)V

    iput v2, p0, Lnu/z$a;->t:I

    invoke-static {p1, v1, p0}, Lnu/j;->j(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
