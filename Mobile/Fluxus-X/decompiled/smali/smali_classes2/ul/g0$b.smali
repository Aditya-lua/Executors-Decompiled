.class public final Lul/g0$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lul/g0;->K1(Landroid/content/Intent;)V
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
    c = "com.roblox.protocols.calling.CallingRingActivity$show$1"
    f = "CallingRingActivity.kt"
    l = {
        0x45
    }
    m = "invokeSuspend"
    v = 0x1
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
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lul/g0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lul/g0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lul/g0;",
            "Leu/b<",
            "-",
            "Lul/g0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lul/g0$b;->u:Ljava/lang/String;

    iput-object p2, p0, Lul/g0$b;->v:Lul/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static final synthetic m(Lul/g0;Lul/a;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lul/g0$b;->p(Lul/g0;Lul/a;Leu/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lul/g0;Lul/a;Leu/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lul/g0;->G1(Lul/g0;Lul/a;)V

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

    new-instance p1, Lul/g0$b;

    iget-object v0, p0, Lul/g0$b;->u:Ljava/lang/String;

    iget-object v1, p0, Lul/g0$b;->v:Lul/g0;

    invoke-direct {p1, v0, v1, p2}, Lul/g0$b;-><init>(Ljava/lang/String;Lul/g0;Leu/b;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lul/g0$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lul/g0$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lul/g0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lul/g0$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lul/g0$b;->t:I

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

    sget-object p1, Lul/d;->a:Lul/d;

    iget-object v1, p0, Lul/g0$b;->u:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lul/d;->g(Ljava/lang/String;)Ldv/h;

    move-result-object p1

    new-instance v1, Lul/g0$b$a;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Lul/g0$b$a;-><init>(Leu/b;)V

    invoke-static {p1, v1}, Ldv/j;->O(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    iget-object v1, p0, Lul/g0$b;->v:Lul/g0;

    new-instance v3, Lul/g0$b$b;

    invoke-direct {v3, v1}, Lul/g0$b$b;-><init>(Lul/g0;)V

    iput v2, p0, Lul/g0$b;->t:I

    invoke-interface {p1, v3, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lul/g0$b;->v:Lul/g0;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
