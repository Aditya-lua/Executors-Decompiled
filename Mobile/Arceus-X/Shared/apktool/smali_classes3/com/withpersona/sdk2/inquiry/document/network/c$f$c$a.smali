.class public final Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/c$f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;",
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
        "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;",
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
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$result$1$1"
    f = "DocumentFileUploadWorker.kt"
    l = {
        0x51
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/document/network/c;

.field public final synthetic v:Lbo/d;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lbo/d;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/network/c;",
            "Lbo/d;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->v:Lbo/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->v:Lbo/d;

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lbo/d;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/c;->i(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lbo/c;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/document/network/c;->k(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    const-string v4, "data[type]"

    const-string v5, "document-file"

    invoke-virtual {v3, v4, v5}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v4

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/document/network/c;->f(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "data[attributes][document-id]"

    invoke-virtual {v3, v6, v5}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->i()Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->j()Ljava/lang/String;

    move-result-object v6

    const-string v7, "data[attributes][capture-method]"

    invoke-virtual {v3, v7, v6}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->v:Lbo/d;

    const-string v9, "data[attributes][originals][]"

    invoke-virtual {v3, v9, v7, v8}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v7

    new-instance v8, Ljava/io/File;

    iget-object v9, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->u:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v9}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "getName(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "data[attributes][name]"

    invoke-virtual {v3, v9, v8}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v3

    filled-new-array {v4, v5, v6, v7, v3}, [Lokhttp3/MultipartBody$Part;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lbo/c;->a(Ljava/lang/String;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

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
            "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
