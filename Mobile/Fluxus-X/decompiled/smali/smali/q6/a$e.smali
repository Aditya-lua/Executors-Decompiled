.class public final Lq6/a$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq6/a;->h(Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;
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
        "Lq6/a$b;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "coil3.intercept.EngineInterceptor$execute$executeResult$1"
    f = "EngineInterceptor.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "Lq6/a$b;",
        "<anonymous>",
        "(Lav/p0;)Lq6/a$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:Ll6/j;

.field public t:I

.field public final synthetic u:Lq6/a;

.field public final synthetic v:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lp6/i;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Ll6/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic x:Ly6/g;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Ly6/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq6/a;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Ly6/g;Ljava/lang/Object;Lkotlin/jvm/internal/c0;Ll6/j;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/a;",
            "Lkotlin/jvm/internal/c0<",
            "Lp6/i;",
            ">;",
            "Lkotlin/jvm/internal/c0<",
            "Ll6/h;",
            ">;",
            "Ly6/g;",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/internal/c0<",
            "Ly6/p;",
            ">;",
            "Ll6/j;",
            "Leu/b<",
            "-",
            "Lq6/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lq6/a$e;->u:Lq6/a;

    iput-object p2, p0, Lq6/a$e;->v:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lq6/a$e;->w:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lq6/a$e;->x:Ly6/g;

    iput-object p5, p0, Lq6/a$e;->y:Ljava/lang/Object;

    iput-object p6, p0, Lq6/a$e;->z:Lkotlin/jvm/internal/c0;

    iput-object p7, p0, Lq6/a$e;->A:Ll6/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 9
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

    new-instance v0, Lq6/a$e;

    iget-object v1, p0, Lq6/a$e;->u:Lq6/a;

    iget-object v2, p0, Lq6/a$e;->v:Lkotlin/jvm/internal/c0;

    iget-object v3, p0, Lq6/a$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v4, p0, Lq6/a$e;->x:Ly6/g;

    iget-object v5, p0, Lq6/a$e;->y:Ljava/lang/Object;

    iget-object v6, p0, Lq6/a$e;->z:Lkotlin/jvm/internal/c0;

    iget-object v7, p0, Lq6/a$e;->A:Ll6/j;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lq6/a$e;-><init>(Lq6/a;Lkotlin/jvm/internal/c0;Lkotlin/jvm/internal/c0;Ly6/g;Ljava/lang/Object;Lkotlin/jvm/internal/c0;Ll6/j;Leu/b;)V

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
            "Lq6/a$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lq6/a$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lq6/a$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lq6/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lq6/a$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lq6/a$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lq6/a$e;->u:Lq6/a;

    iget-object p1, p0, Lq6/a$e;->v:Lkotlin/jvm/internal/c0;

    iget-object p1, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Lp6/o;

    iget-object v3, p0, Lq6/a$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v3, v3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v3, Ll6/h;

    iget-object v4, p0, Lq6/a$e;->x:Ly6/g;

    iget-object v5, p0, Lq6/a$e;->y:Ljava/lang/Object;

    iget-object v6, p0, Lq6/a$e;->z:Lkotlin/jvm/internal/c0;

    iget-object v6, v6, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v6, Ly6/p;

    iget-object v7, p0, Lq6/a$e;->A:Ll6/j;

    iput v2, p0, Lq6/a$e;->t:I

    move-object v8, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lq6/a;->b(Lq6/a;Lp6/o;Ll6/h;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
