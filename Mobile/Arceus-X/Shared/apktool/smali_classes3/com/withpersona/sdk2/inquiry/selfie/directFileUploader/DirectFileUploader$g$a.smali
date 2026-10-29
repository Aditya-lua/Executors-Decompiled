.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
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
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
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
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1$1"
    f = "DirectFileUploader.kt"
    l = {
        0xb0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/io/File;

.field public final synthetic x:Lokhttp3/RequestBody;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/io/File;Lokhttp3/RequestBody;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lokhttp3/RequestBody;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->w:Ljava/io/File;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->x:Lokhttp3/RequestBody;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->w:Ljava/io/File;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->x:Lokhttp3/RequestBody;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/io/File;Lokhttp3/RequestBody;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->b(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->v:Ljava/lang/String;

    sget-object v3, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->w:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->x:Lokhttp3/RequestBody;

    const-string v6, "file"

    invoke-virtual {v3, v6, v4, v5}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v3

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;->upload(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lnt/b;)Ljava/lang/Object;

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
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
