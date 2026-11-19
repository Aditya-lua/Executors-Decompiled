.class public final Lqq/c$f$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lsw/x<",
        "+",
        "Ljava/lang/Object;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1$2"
    f = "SubmitVerificationWorker.kt"
    l = {
        0x146,
        0x14b
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lsw/x;",
        "",
        "<anonymous>",
        "()Lsw/x;"
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

.field public final synthetic u:Lqq/c;

.field public final synthetic v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmv/c0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqq/c;Ljava/util/List;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqq/c;",
            "Ljava/util/List<",
            "Lmv/c0$c;",
            ">;",
            "Leu/b<",
            "-",
            "Lqq/c$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqq/c$f$a;->u:Lqq/c;

    iput-object p2, p0, Lqq/c$f$a;->v:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqq/c$f$a;

    iget-object v1, p0, Lqq/c$f$a;->u:Lqq/c;

    iget-object v2, p0, Lqq/c$f$a;->v:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lqq/c$f$a;-><init>(Lqq/c;Ljava/util/List;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lqq/c$f$a;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lqq/c$f$a;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {p1}, Lqq/c;->h(Lqq/c;)Lso/a;

    move-result-object p1

    invoke-interface {p1}, Lso/a;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {p1}, Lqq/c;->h(Lqq/c;)Lso/a;

    move-result-object p1

    iget-object v1, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {v1}, Lqq/c;->r(Lqq/c;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lqq/c$f$a;->v:Ljava/util/List;

    iput v3, p0, Lqq/c$f$a;->t:I

    invoke-interface {p1, v1, v2, p0}, Lso/a;->a(Ljava/lang/String;Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lsw/x;

    return-object p1

    :cond_4
    iget-object p1, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {p1}, Lqq/c;->q(Lqq/c;)Lqq/a;

    move-result-object p1

    iget-object v1, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {v1}, Lqq/c;->r(Lqq/c;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lqq/c$f$a;->u:Lqq/c;

    invoke-static {v3}, Lqq/c;->m(Lqq/c;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lqq/c$f$a;->v:Ljava/util/List;

    iput v2, p0, Lqq/c$f$a;->t:I

    invoke-interface {p1, v1, v3, v4, p0}, Lqq/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lsw/x;

    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lsw/x<",
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lqq/c$f$a;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lqq/c$f$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lqq/c$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
