.class public final Lqo/e1$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqo/e1;->l0(Lno/u2$b;Lno/u2$f;)V
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
    c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$handleState$screen$14"
    f = "DocumentStepStateManager.kt"
    l = {}
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

.field public final synthetic u:Lqo/e1;

.field public final synthetic v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lqo/e1;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqo/e1;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lqo/e1$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqo/e1$e;->u:Lqo/e1;

    iput-object p2, p0, Lqo/e1$e;->v:Ljava/lang/String;

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

    new-instance v0, Lqo/e1$e;

    iget-object v1, p0, Lqo/e1$e;->u:Lqo/e1;

    iget-object v2, p0, Lqo/e1$e;->v:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lqo/e1$e;-><init>(Lqo/e1;Ljava/lang/String;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lqo/e1$e;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lqo/e1$e;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lqo/e1$e;->u:Lqo/e1;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p1

    instance-of v0, p1, Lno/u2$f$c;

    if-eqz v0, :cond_0

    check-cast p1, Lno/u2$f$c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    iget-object v0, p0, Lqo/e1$e;->u:Lqo/e1;

    invoke-virtual {v0}, Lls/d;->d()Lls/g;

    move-result-object v0

    new-instance v5, Lno/u2$f$f$d;

    iget-object v1, p0, Lqo/e1$e;->v:Ljava/lang/String;

    invoke-direct {v5, v1}, Lno/u2$f$f$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lno/u2$f$c;->l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lno/u2$f$c;->q()Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lno/u2$f$b;

    iget-object v3, p0, Lqo/e1$e;->v:Ljava/lang/String;

    const/16 v10, 0x74

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v11}, Lno/u2$f$b;-><init>(Ljava/util/List;Ljava/lang/String;Lno/u2$f$a;Lno/u2$f$f;Lno/e;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lls/g;->p(Lls/h;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lqo/e1$e;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lqo/e1$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lqo/e1$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
