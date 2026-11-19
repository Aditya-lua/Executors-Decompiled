.class public final Lnp/i$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnp/i;->h(Ljava/lang/String;)Lav/d2;
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
    c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportErrors$1"
    f = "ErrorReportingManager.kt"
    l = {
        0x2f,
        0x30,
        0x31,
        0x33
    }
    m = "invokeSuspend"
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

.field public final synthetic u:Lnp/i;

.field public final synthetic v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnp/i;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/i;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lnp/i$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnp/i$c;->u:Lnp/i;

    iput-object p2, p0, Lnp/i$c;->v:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
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

    new-instance p1, Lnp/i$c;

    iget-object v0, p0, Lnp/i$c;->u:Lnp/i;

    iget-object v1, p0, Lnp/i$c;->v:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lnp/i$c;-><init>(Lnp/i;Ljava/lang/String;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lnp/i$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnp/i$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnp/i$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnp/i$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnp/i$c;->t:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move p1, v5

    iget-object v5, p0, Lnp/i$c;->u:Lnp/i;

    iget-object v6, p0, Lnp/i$c;->v:Ljava/lang/String;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Nfc:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    iput p1, p0, Lnp/i$c;->t:I

    const-string v7, "com.withpersona.sdk2.inquiry.nfc"

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lnp/i;->g(Lnp/i;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lbq/a;Leu/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    iget-object v5, v10, Lnp/i$c;->u:Lnp/i;

    iget-object v6, v10, Lnp/i$c;->v:Ljava/lang/String;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Network:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    iput v4, v10, Lnp/i$c;->t:I

    const-string v7, "com.withpersona.sdk2.inquiry.network"

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lnp/i;->g(Lnp/i;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lbq/a;Leu/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iget-object v5, v10, Lnp/i$c;->u:Lnp/i;

    iget-object v6, v10, Lnp/i$c;->v:Ljava/lang/String;

    sget-object v8, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    iput v3, v10, Lnp/i$c;->t:I

    const-string v7, "com.withpersona.sdk2.inquiry.integrity"

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lnp/i;->g(Lnp/i;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Lbq/a;Leu/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iget-object p1, v10, Lnp/i$c;->u:Lnp/i;

    invoke-static {p1}, Lnp/i;->b(Lnp/i;)Lbq/b;

    move-result-object p1

    iput v2, v10, Lnp/i$c;->t:I

    invoke-virtual {p1, p0}, Lbq/b;->f(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
