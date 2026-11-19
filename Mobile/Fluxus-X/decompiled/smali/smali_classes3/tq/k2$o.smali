.class public final Ltq/k2$o;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltq/k2;->e2(Lmq/q5$b;Lmq/y0$k;)Lmq/q5$d$b;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1"
    f = "SelfieStepStateManager.kt"
    l = {
        0x175
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ltq/k2;


# direct methods
.method public constructor <init>(Ltq/k2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltq/k2;",
            "Leu/b<",
            "-",
            "Ltq/k2$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltq/k2$o;->u:Ltq/k2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Ltq/k2$o;

    iget-object v1, p0, Ltq/k2$o;->u:Ltq/k2;

    invoke-direct {v0, v1, p1}, Ltq/k2$o;-><init>(Ltq/k2;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Ltq/k2$o;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ltq/k2$o;->t:I

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

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 p1, 0x3

    sget-object v1, Lzu/b;->e:Lzu/b;

    invoke-static {p1, v1}, Lkotlin/time/b;->p(ILzu/b;)J

    move-result-wide v3

    iput v2, p0, Ltq/k2$o;->t:I

    invoke-static {v3, v4, p0}, Lav/z0;->c(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Ltq/k2$o;->u:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p1

    instance-of v0, p1, Lmq/y0$k;

    if-eqz v0, :cond_3

    check-cast p1, Lmq/y0$k;

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    if-nez v0, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Ltq/k2$o;->u:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lmq/y0$k;->z(Lmq/y0$k;Lmq/y0;Lsn/v$b;Ljava/lang/String;ILjava/lang/Object;)Lmq/y0$k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltq/k2$o;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ltq/k2$o;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltq/k2$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
