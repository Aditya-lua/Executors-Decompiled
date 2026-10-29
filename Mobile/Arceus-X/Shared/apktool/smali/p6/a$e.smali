.class public final Lp6/a$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/a;->h(Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;
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
        "Lp6/a$b;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Lp6/a$b;",
        "<anonymous>",
        "(Lku/p0;)Lp6/a$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "coil3.intercept.EngineInterceptor$execute$executeResult$1"
    f = "EngineInterceptor.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lk6/j;

.field public t:I

.field public final synthetic u:Lp6/a;

.field public final synthetic v:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lo6/i;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lk6/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic x:Lx6/g;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lx6/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp6/a;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Lx6/g;Ljava/lang/Object;Lkotlin/jvm/internal/c0;Lk6/j;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/a;",
            "Lkotlin/jvm/internal/c0<",
            "Lo6/i;",
            ">;",
            "Lkotlin/jvm/internal/c0<",
            "Lk6/h;",
            ">;",
            "Lx6/g;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/internal/c0<",
            "Lx6/p;",
            ">;",
            "Lk6/j;",
            "Lnt/b<",
            "-",
            "Lp6/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp6/a$e;->u:Lp6/a;

    iput-object p2, p0, Lp6/a$e;->v:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lp6/a$e;->w:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lp6/a$e;->x:Lx6/g;

    iput-object p5, p0, Lp6/a$e;->y:Ljava/lang/Object;

    iput-object p6, p0, Lp6/a$e;->z:Lkotlin/jvm/internal/c0;

    iput-object p7, p0, Lp6/a$e;->A:Lk6/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 9
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

    new-instance v0, Lp6/a$e;

    iget-object v1, p0, Lp6/a$e;->u:Lp6/a;

    iget-object v2, p0, Lp6/a$e;->v:Lkotlin/jvm/internal/c0;

    iget-object v3, p0, Lp6/a$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v4, p0, Lp6/a$e;->x:Lx6/g;

    iget-object v5, p0, Lp6/a$e;->y:Ljava/lang/Object;

    iget-object v6, p0, Lp6/a$e;->z:Lkotlin/jvm/internal/c0;

    iget-object v7, p0, Lp6/a$e;->A:Lk6/j;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lp6/a$e;-><init>(Lp6/a;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Lx6/g;Ljava/lang/Object;Lkotlin/jvm/internal/c0;Lk6/j;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lp6/a$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lp6/a$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lp6/a$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lp6/a$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lp6/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lp6/a$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lp6/a$e;->u:Lp6/a;

    iget-object p1, p0, Lp6/a$e;->v:Lkotlin/jvm/internal/c0;

    iget-object p1, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Lo6/o;

    iget-object v3, p0, Lp6/a$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v3, v3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v3, Lk6/h;

    iget-object v4, p0, Lp6/a$e;->x:Lx6/g;

    iget-object v5, p0, Lp6/a$e;->y:Ljava/lang/Object;

    iget-object v6, p0, Lp6/a$e;->z:Lkotlin/jvm/internal/c0;

    iget-object v6, v6, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v6, Lx6/p;

    iget-object v7, p0, Lp6/a$e;->A:Lk6/j;

    iput v2, p0, Lp6/a$e;->t:I

    move-object v8, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lp6/a;->b(Lp6/a;Lo6/o;Lk6/h;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
