.class public final Ld6/b$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld6/b;->a(Ly5/d;)Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcv/v<",
        "-",
        "Lc6/b;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1"
    f = "ContraintControllers.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcv/v;",
        "Lc6/b;",
        "",
        "<anonymous>",
        "(Lcv/v;)V"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ld6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld6/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld6/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/b<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Ld6/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld6/b$a;->v:Ld6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ld6/b;Ld6/b$a$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Ld6/b$a;->q(Ld6/b;Ld6/b$a$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Ld6/b;Ld6/b$a$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Ld6/b;->c(Ld6/b;)Le6/h;

    move-result-object p0

    invoke-virtual {p0, p1}, Le6/h;->g(Lc6/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Ld6/b$a;

    iget-object v1, p0, Ld6/b$a;->v:Ld6/b;

    invoke-direct {v0, v1, p2}, Ld6/b$a;-><init>(Ld6/b;Leu/b;)V

    iput-object p1, v0, Ld6/b$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcv/v;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ld6/b$a;->p(Lcv/v;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld6/b$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ld6/b$a;->u:Ljava/lang/Object;

    check-cast p1, Lcv/v;

    new-instance v1, Ld6/b$a$a;

    iget-object v3, p0, Ld6/b$a;->v:Ld6/b;

    invoke-direct {v1, v3, p1}, Ld6/b$a$a;-><init>(Ld6/b;Lcv/v;)V

    iget-object v3, p0, Ld6/b$a;->v:Ld6/b;

    invoke-static {v3}, Ld6/b;->c(Ld6/b;)Le6/h;

    move-result-object v3

    invoke-virtual {v3, v1}, Le6/h;->c(Lc6/a;)V

    iget-object v3, p0, Ld6/b$a;->v:Ld6/b;

    new-instance v4, Ld6/a;

    invoke-direct {v4, v3, v1}, Ld6/a;-><init>(Ld6/b;Ld6/b$a$a;)V

    iput v2, p0, Ld6/b$a;->t:I

    invoke-static {p1, v4, p0}, Lcv/t;->a(Lcv/v;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final p(Lcv/v;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcv/v<",
            "-",
            "Lc6/b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ld6/b$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ld6/b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ld6/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
