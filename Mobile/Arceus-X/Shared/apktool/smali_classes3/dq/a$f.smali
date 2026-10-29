.class public final Ldq/a$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq/a;->l(ILnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Ljt/n<",
        "+",
        "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Ljt/n;",
        "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;",
        "<anonymous>",
        "(Lku/p0;)Ljt/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1"
    f = "SelfiePoseManager.kt"
    l = {
        0x8a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ldq/a;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(Ldq/a;ILnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq/a;",
            "I",
            "Lnt/b<",
            "-",
            "Ldq/a$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq/a$f;->u:Ldq/a;

    iput p2, p0, Ldq/a$f;->v:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Ldq/a$f;

    iget-object v0, p0, Ldq/a$f;->u:Ldq/a;

    iget v1, p0, Ldq/a$f;->v:I

    invoke-direct {p1, v0, v1, p2}, Ldq/a$f;-><init>(Ldq/a;ILnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ldq/a$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ldq/a$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ldq/a$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldq/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldq/a$f;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ldq/a$f;->u:Ldq/a;

    invoke-static {p1}, Ldq/a;->c(Ldq/a;)Lku/l0;

    move-result-object p1

    new-instance v1, Ldq/a$f$b;

    iget-object v3, p0, Ldq/a$f;->u:Ldq/a;

    iget v4, p0, Ldq/a$f;->v:I

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Ldq/a$f$b;-><init>(Ldq/a;ILnt/b;)V

    iput v2, p0, Ldq/a$f;->t:I

    invoke-static {p1, v1, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljv/x;

    invoke-virtual {p1}, Ljv/x;->g()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;

    if-nez p1, :cond_3

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Response body is null."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_6

    :cond_3
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_c

    check-cast v0, Ljava/lang/Iterable;

    iget v1, p0, Ldq/a$f;->v:I

    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_4

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;->a()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v1, :cond_5

    iget-object v0, p0, Ldq/a$f;->u:Ldq/a;

    invoke-static {v0}, Ldq/a;->a(Ldq/a;)Lnu/c0;

    move-result-object v0

    iget-object v1, p0, Ldq/a$f;->u:Ldq/a;

    invoke-static {v1}, Ldq/a;->a(Ldq/a;)Lnu/c0;

    move-result-object v1

    invoke-interface {v1}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Lkotlin/collections/k0;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ldq/a$f$a;

    invoke-direct {v4}, Ldq/a$f$a;-><init>()V

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->F0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    add-int/lit8 v6, v5, 0x1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;->a()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v8}, Lpt/b;->d(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;->a()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;->b()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;

    move-result-object v10

    if-eqz v10, :cond_a

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/selfie/i;->c(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;)Lkn/a;

    move-result-object v10

    if-nez v10, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;->a()Ljava/lang/Boolean;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;->b()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lkotlin/collections/p;->m(Ljava/util/List;)I

    move-result v11

    if-ne v5, v11, :cond_8

    move v5, v2

    goto :goto_3

    :cond_8
    move v5, v4

    :goto_3
    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse$SelfiePoseState;->c()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    new-instance v11, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-direct {v11, v9, v10, v5, v7}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;-><init>(ILkn/a;ZLjava/lang/String;)V

    invoke-interface {v1, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_4
    move v5, v6

    goto :goto_2

    :cond_b
    invoke-interface {v0, v1}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_c
    :goto_5
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/IllegalArgumentException;

    iget v0, p0, Ldq/a$f;->v:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested pose at index "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " however response did not include requested index."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_6

    :cond_d
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_6
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    return-object p1
.end method
