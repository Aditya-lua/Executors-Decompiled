.class public final Lpq/a$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq/a;->k(Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1"
    f = "DirectFileUploader.kt"
    l = {
        0xae
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
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lpq/a;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lpq/a$e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpq/a;Ljava/lang/String;Lpq/a$e;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpq/a;",
            "Ljava/lang/String;",
            "Lpq/a$e;",
            "Leu/b<",
            "-",
            "Lpq/a$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpq/a$i;->w:Ljava/lang/String;

    iput-object p2, p0, Lpq/a$i;->x:Lpq/a;

    iput-object p3, p0, Lpq/a$i;->y:Ljava/lang/String;

    iput-object p4, p0, Lpq/a$i;->z:Lpq/a$e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lpq/a$i;

    iget-object v1, p0, Lpq/a$i;->w:Ljava/lang/String;

    iget-object v2, p0, Lpq/a$i;->x:Lpq/a;

    iget-object v3, p0, Lpq/a$i;->y:Ljava/lang/String;

    iget-object v4, p0, Lpq/a$i;->z:Lpq/a$e;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lpq/a$i;-><init>(Ljava/lang/String;Lpq/a;Ljava/lang/String;Lpq/a$e;Leu/b;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lpq/a$i;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lpq/a$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lpq/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lpq/a$i;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lpq/a$i;->v:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lpq/a$i;->u:Ljava/lang/Object;

    check-cast v0, Lmv/g0;

    iget-object v0, p0, Lpq/a$i;->t:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v6, Ljava/io/File;

    iget-object p1, p0, Lpq/a$i;->w:Ljava/lang/String;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object p1, Lmv/g0;->a:Lmv/g0$a;

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    const-string v3, "image/jpeg"

    invoke-virtual {v1, v3}, Lmv/b0$a;->b(Ljava/lang/String;)Lmv/b0;

    move-result-object v1

    invoke-virtual {p1, v6, v1}, Lmv/g0$a;->b(Ljava/io/File;Lmv/b0;)Lmv/g0;

    move-result-object v7

    new-instance v3, Lpq/a$i$a;

    iget-object v4, p0, Lpq/a$i;->x:Lpq/a;

    iget-object v5, p0, Lpq/a$i;->y:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lpq/a$i$a;-><init>(Lpq/a;Ljava/lang/String;Ljava/io/File;Lmv/g0;Leu/b;)V

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpq/a$i;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpq/a$i;->u:Ljava/lang/Object;

    iput v2, p0, Lpq/a$i;->v:I

    invoke-static {v3, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v0, p0, Lpq/a$i;->x:Lpq/a;

    iget-object v1, p0, Lpq/a$i;->z:Lpq/a$e;

    instance-of v2, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;

    if-eqz v2, :cond_3

    invoke-static {v0, v2}, Lpq/a;->d(Lpq/a;Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lpq/a$d;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    sget-object v0, Lzt/n;->b:Lzt/n$a;

    new-instance v0, Lqq/c$c;

    invoke-direct {v0}, Lqq/c$c;-><init>()V

    invoke-static {v0}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpq/a$e;->k(Lzt/n;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpq/a$e;->k(Lzt/n;)V

    :cond_5
    :goto_2
    iget-object v0, p0, Lpq/a$i;->z:Lpq/a$e;

    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v1, :cond_6

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    sget-object v1, Lzt/n;->b:Lzt/n$a;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    invoke-direct {v1, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpq/a$e;->k(Lzt/n;)V

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
