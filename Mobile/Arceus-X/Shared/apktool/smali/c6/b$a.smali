.class public final Lc6/b$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc6/b;->b(Lx5/d;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmu/v<",
        "-",
        "Lb6/b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lmu/v;",
        "Lb6/b;",
        "",
        "<anonymous>",
        "(Lmu/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1"
    f = "ContraintControllers.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lc6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc6/b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc6/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/b<",
            "TT;>;",
            "Lnt/b<",
            "-",
            "Lc6/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc6/b$a;->v:Lc6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lc6/b;Lc6/b$a$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lc6/b$a;->s(Lc6/b;Lc6/b$a$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lc6/b;Lc6/b$a$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lc6/b;->c(Lc6/b;)Ld6/h;

    move-result-object p0

    invoke-virtual {p0, p1}, Ld6/h;->g(Lb6/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lc6/b$a;

    iget-object v1, p0, Lc6/b$a;->v:Lc6/b;

    invoke-direct {v0, v1, p2}, Lc6/b$a;-><init>(Lc6/b;Lnt/b;)V

    iput-object p1, v0, Lc6/b$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/v;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lc6/b$a;->r(Lmu/v;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lc6/b$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lc6/b$a;->u:Ljava/lang/Object;

    check-cast p1, Lmu/v;

    new-instance v1, Lc6/b$a$a;

    iget-object v3, p0, Lc6/b$a;->v:Lc6/b;

    invoke-direct {v1, v3, p1}, Lc6/b$a$a;-><init>(Lc6/b;Lmu/v;)V

    iget-object v3, p0, Lc6/b$a;->v:Lc6/b;

    invoke-static {v3}, Lc6/b;->c(Lc6/b;)Ld6/h;

    move-result-object v3

    invoke-virtual {v3, v1}, Ld6/h;->c(Lb6/a;)V

    iget-object v3, p0, Lc6/b$a;->v:Lc6/b;

    new-instance v4, Lc6/a;

    invoke-direct {v4, v3, v1}, Lc6/a;-><init>(Lc6/b;Lc6/b$a$a;)V

    iput v2, p0, Lc6/b$a;->t:I

    invoke-static {p1, v4, p0}, Lmu/t;->a(Lmu/v;Lkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final r(Lmu/v;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmu/v<",
            "-",
            "Lb6/b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lc6/b$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lc6/b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lc6/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
