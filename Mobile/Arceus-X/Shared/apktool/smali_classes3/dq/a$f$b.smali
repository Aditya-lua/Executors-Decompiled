.class public final Ldq/a$f$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldq/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljv/x<",
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
        "Ljv/x;",
        "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;",
        "<anonymous>",
        "(Lku/p0;)Ljv/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.pose.SelfiePoseManager$loadNextPoseAsyncInternal$job$1$response$1"
    f = "SelfiePoseManager.kt"
    l = {
        0x8b
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
            "Ldq/a$f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldq/a$f$b;->u:Ldq/a;

    iput p2, p0, Ldq/a$f$b;->v:I

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

    new-instance p1, Ldq/a$f$b;

    iget-object v0, p0, Ldq/a$f$b;->u:Ldq/a;

    iget v1, p0, Ldq/a$f$b;->v:I

    invoke-direct {p1, v0, v1, p2}, Ldq/a$f$b;-><init>(Ldq/a;ILnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ldq/a$f$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljv/x<",
            "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ldq/a$f$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ldq/a$f$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldq/a$f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldq/a$f$b;->t:I

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

    iget-object p1, p0, Ldq/a$f$b;->u:Ldq/a;

    invoke-static {p1}, Ldq/a;->d(Ldq/a;)Lcq/a;

    move-result-object p1

    iget-object v1, p0, Ldq/a$f$b;->u:Ldq/a;

    invoke-static {v1}, Ldq/a;->e(Ldq/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;

    iget-object v5, p0, Ldq/a$f$b;->u:Ldq/a;

    invoke-static {v5}, Ldq/a;->b(Ldq/a;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;

    iget v7, p0, Ldq/a$f$b;->v:I

    iget-object v8, p0, Ldq/a$f$b;->u:Ldq/a;

    invoke-static {v8}, Ldq/a;->f(Ldq/a;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;-><init>(ILjava/lang/String;)V

    const-string v7, "inquiry"

    invoke-direct {v4, v7, v5, v6}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;)V

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;)V

    iput v2, p0, Ldq/a$f$b;->t:I

    invoke-interface {p1, v1, v3, p0}, Lcq/a;->a(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
