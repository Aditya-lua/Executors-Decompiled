.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->k(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1"
    f = "DirectFileUploader.kt"
    l = {
        0xae
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->w:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->x:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->y:Ljava/lang/String;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->z:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->w:Ljava/lang/String;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->x:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->y:Ljava/lang/String;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->z:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->v:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->u:Ljava/lang/Object;

    check-cast v0, Lokhttp3/RequestBody;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->t:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v6, Ljava/io/File;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->w:Ljava/lang/String;

    invoke-direct {v6, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object p1, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    sget-object v1, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v3, "image/jpeg"

    invoke-virtual {v1, v3}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v1

    invoke-virtual {p1, v6, v1}, Lokhttp3/RequestBody$Companion;->create(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    move-result-object v7

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->x:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->y:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/io/File;Lokhttp3/RequestBody;Lnt/b;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->u:Ljava/lang/Object;

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->v:I

    invoke-static {v3, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->x:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->z:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    instance-of v2, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;

    if-eqz v2, :cond_3

    invoke-static {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->d(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_4

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    new-instance v0, Lcq/b$c;

    invoke-direct {v0}, Lcq/b$c;-><init>()V

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->k(Ljt/n;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->k(Ljt/n;)V

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->z:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v1, :cond_6

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    invoke-direct {v1, p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->k(Ljt/n;)V

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
