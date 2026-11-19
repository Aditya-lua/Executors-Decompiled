.class public final Lvp/e0$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp/e0;->M(Lcom/withpersona/sdk2/inquiry/internal/j$a;)Lvp/s0;
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
    c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$renderComplete$1"
    f = "InquiryStateManager.kt"
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

.field public final synthetic u:Lvp/e0;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/internal/j$a;


# direct methods
.method public constructor <init>(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvp/e0;",
            "Lcom/withpersona/sdk2/inquiry/internal/j$a;",
            "Leu/b<",
            "-",
            "Lvp/e0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvp/e0$e;->u:Lvp/e0;

    iput-object p2, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

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

    new-instance v0, Lvp/e0$e;

    iget-object v1, p0, Lvp/e0$e;->u:Lvp/e0;

    iget-object v2, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-direct {v0, v1, v2, p1}, Lvp/e0$e;-><init>(Lvp/e0;Lcom/withpersona/sdk2/inquiry/internal/j$a;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lvp/e0$e;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lvp/e0$e;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvp/e0$e;->u:Lvp/e0;

    iget-object v0, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/j$a;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/j$a;->A()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/j$a;->t()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/j$a;->s()Ljava/util/Map;

    move-result-object v4

    iget-object v0, p0, Lvp/e0$e;->v:Lcom/withpersona/sdk2/inquiry/internal/j$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/j$a;->f()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/l$b;

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/internal/l$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lvp/e0;->z0(Lcom/withpersona/sdk2/inquiry/internal/l;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
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

    invoke-virtual {p0, p1}, Lvp/e0$e;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lvp/e0$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lvp/e0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
