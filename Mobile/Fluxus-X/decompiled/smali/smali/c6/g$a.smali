.class public final Lc6/g$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc6/g;->a(Ly5/d;)Ldv/h;
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
    c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1"
    f = "WorkConstraintsTracker.kt"
    l = {
        0xbf
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

.field public final synthetic v:Ly5/d;

.field public final synthetic w:Lc6/g;


# direct methods
.method public constructor <init>(Ly5/d;Lc6/g;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/d;",
            "Lc6/g;",
            "Leu/b<",
            "-",
            "Lc6/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc6/g$a;->v:Ly5/d;

    iput-object p2, p0, Lc6/g$a;->w:Lc6/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lc6/g$a;->s(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lav/d2;Lcv/v;Lc6/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lc6/g$a;->r(Lav/d2;Lcv/v;Lc6/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lav/d2;Lcv/v;Lc6/b;)Lkotlin/Unit;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lav/d2$a;->a(Lav/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {p1, p2}, Lcv/y;->v(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final s(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
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

    new-instance v0, Lc6/g$a;

    iget-object v1, p0, Lc6/g$a;->v:Ly5/d;

    iget-object v2, p0, Lc6/g$a;->w:Lc6/g;

    invoke-direct {v0, v1, v2, p2}, Lc6/g$a;-><init>(Ly5/d;Lc6/g;Leu/b;)V

    iput-object p1, v0, Lc6/g$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcv/v;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lc6/g$a;->q(Lcv/v;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lc6/g$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lc6/g$a;->u:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lcv/v;

    iget-object p1, p0, Lc6/g$a;->v:Ly5/d;

    invoke-virtual {p1}, Ly5/d;->d()Landroid/net/NetworkRequest;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lc6/g$a;->v:Ly5/d;

    invoke-virtual {p1}, Ly5/d;->f()Ly5/x;

    move-result-object p1

    invoke-static {p1}, Lh6/u;->a(Ly5/x;)Landroid/net/NetworkRequest;

    move-result-object p1

    :cond_2
    const/4 v1, 0x0

    if-nez p1, :cond_3

    invoke-interface {v3}, Lcv/v;->a()Lcv/y;

    move-result-object p1

    invoke-static {p1, v1, v2, v1}, Lcv/y$a;->a(Lcv/y;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    new-instance v6, Lc6/g$a$a;

    iget-object v4, p0, Lc6/g$a;->w:Lc6/g;

    invoke-direct {v6, v4, v3, v1}, Lc6/g$a$a;-><init>(Lc6/g;Lcv/v;Leu/b;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    move-result-object v1

    new-instance v4, Lc6/e;

    invoke-direct {v4, v1, v3}, Lc6/e;-><init>(Lav/d2;Lcv/v;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-lt v1, v5, :cond_4

    sget-object v1, Lc6/k;->a:Lc6/k;

    iget-object v5, p0, Lc6/g$a;->w:Lc6/g;

    invoke-static {v5}, Lc6/g;->c(Lc6/g;)Landroid/net/ConnectivityManager;

    move-result-object v5

    invoke-virtual {v1, v5, p1, v4}, Lc6/k;->b(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object v1, Lc6/d;->b:Lc6/d$a;

    iget-object v5, p0, Lc6/g$a;->w:Lc6/g;

    invoke-static {v5}, Lc6/g;->c(Lc6/g;)Landroid/net/ConnectivityManager;

    move-result-object v5

    invoke-virtual {v1, v5, p1, v4}, Lc6/d$a;->b(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;

    move-result-object p1

    :goto_0
    new-instance v1, Lc6/f;

    invoke-direct {v1, p1}, Lc6/f;-><init>(Lkotlin/jvm/functions/Function0;)V

    iput v2, p0, Lc6/g$a;->t:I

    invoke-static {v3, v1, p0}, Lcv/t;->a(Lcv/v;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lcv/v;Leu/b;)Ljava/lang/Object;
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

    invoke-virtual {p0, p1, p2}, Lc6/g$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lc6/g$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lc6/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
