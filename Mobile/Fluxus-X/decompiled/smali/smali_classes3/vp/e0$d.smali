.class public final Lvp/e0$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp/e0;->G(Lcom/withpersona/sdk2/inquiry/internal/j;)V
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
    c = "com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager$handleState$5"
    f = "InquiryStateManager.kt"
    l = {
        0xd3
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

.field public final synthetic u:Lvp/e0;


# direct methods
.method public constructor <init>(Lvp/e0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvp/e0;",
            "Leu/b<",
            "-",
            "Lvp/e0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvp/e0$d;->u:Lvp/e0;

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

    new-instance v0, Lvp/e0$d;

    iget-object v1, p0, Lvp/e0$d;->u:Lvp/e0;

    invoke-direct {v0, v1, p1}, Lvp/e0$d;-><init>(Lvp/e0;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lvp/e0$d;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lvp/e0$d;->t:I

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

    iget-object p1, p0, Lvp/e0$d;->u:Lvp/e0;

    invoke-static {p1}, Lvp/e0;->C(Lvp/e0;)Ldr/e;

    move-result-object p1

    invoke-interface {p1}, Ldr/e;->c()Ldv/h;

    move-result-object p1

    new-instance v1, Lvp/e0$d$a;

    iget-object v3, p0, Lvp/e0$d;->u:Lvp/e0;

    invoke-direct {v1, v3}, Lvp/e0$d$a;-><init>(Lvp/e0;)V

    iput v2, p0, Lvp/e0$d;->t:I

    invoke-interface {p1, v1, p0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
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

    invoke-virtual {p0, p1}, Lvp/e0$d;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lvp/e0$d;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lvp/e0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
