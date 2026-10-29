.class public final Lho/b$c$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lho/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnt/b<",
        "-",
        "Ljv/x<",
        "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ljv/x;",
        "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;",
        "<anonymous>",
        "()Ljv/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker$run$1$1"
    f = "FeatureFlagWorker.kt"
    l = {
        0x17
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lho/b;


# direct methods
.method public constructor <init>(Lho/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lho/b;",
            "Lnt/b<",
            "-",
            "Lho/b$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lho/b$c$a;->u:Lho/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lho/b$c$a;

    iget-object v1, p0, Lho/b$c$a;->u:Lho/b;

    invoke-direct {v0, v1, p1}, Lho/b$c$a;-><init>(Lho/b;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lho/b$c$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lho/b$c$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lho/b$c$a;->u:Lho/b;

    invoke-static {p1}, Lho/b;->e(Lho/b;)Lho/a;

    move-result-object p1

    iget-object v1, p0, Lho/b$c$a;->u:Lho/b;

    invoke-static {v1}, Lho/b;->f(Lho/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lho/b$c$a;->u:Lho/b;

    invoke-static {v3}, Lho/b;->d(Lho/b;)Lgo/e;

    move-result-object v3

    invoke-virtual {v3}, Lgo/e;->c()Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagArguments;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-interface {v3, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    iput v2, p0, Lho/b$c$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lho/a;->a(Ljava/lang/String;[Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lho/b$c$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lho/b$c$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lho/b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
