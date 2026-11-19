.class public final Lcom/withpersona/sdk2/inquiry/internal/t$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/t;->d(Lcom/withpersona/sdk2/inquiry/internal/j;)V
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
    c = "com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager$start$1"
    f = "SilentNetworkAuthenticationManager.kt"
    l = {
        0x1e
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

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/t;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/internal/t$b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/t;Lcom/withpersona/sdk2/inquiry/internal/t$b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/t;",
            "Lcom/withpersona/sdk2/inquiry/internal/t$b;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/t$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->u:Lcom/withpersona/sdk2/inquiry/internal/t;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->v:Lcom/withpersona/sdk2/inquiry/internal/t$b;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/t$c;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->u:Lcom/withpersona/sdk2/inquiry/internal/t;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->v:Lcom/withpersona/sdk2/inquiry/internal/t$b;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/t$c;-><init>(Lcom/withpersona/sdk2/inquiry/internal/t;Lcom/withpersona/sdk2/inquiry/internal/t$b;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/t$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/t$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/t$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/t$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->u:Lcom/withpersona/sdk2/inquiry/internal/t;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/t;->a(Lcom/withpersona/sdk2/inquiry/internal/t;)Lnp/m0;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->v:Lcom/withpersona/sdk2/inquiry/internal/t$b;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/internal/t$b;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->v:Lcom/withpersona/sdk2/inquiry/internal/t$b;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/internal/t$b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->v:Lcom/withpersona/sdk2/inquiry/internal/t$b;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/internal/t$b;->c()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_2
    const/16 v4, 0xa

    :goto_0
    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/t$c;->t:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lnp/m0;->c(Ljava/lang/String;Ljava/lang/String;ILeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
