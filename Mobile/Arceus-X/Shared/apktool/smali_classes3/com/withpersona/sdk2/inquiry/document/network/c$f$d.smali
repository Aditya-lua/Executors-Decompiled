.class public final Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1$resultFlow$1"
    f = "DocumentFileUploadWorker.kt"
    l = {
        0x6a,
        0x6e,
        0x7a,
        0x93,
        0x95,
        0x9c,
        0xa2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lku/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/w0<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic B:Lcom/withpersona/sdk2/inquiry/document/network/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lku/w0;Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/w0<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;",
            ">;>;",
            "Lcom/withpersona/sdk2/inquiry/document/network/c;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->A:Lku/w0;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->B:Lcom/withpersona/sdk2/inquiry/document/network/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->A:Lku/w0;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->B:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-direct {v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;-><init>(Lku/w0;Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;

    :pswitch_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->A:Lku/w0;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {p1, p0}, Lku/w0;->B(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_0
    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->B:Lcom/withpersona/sdk2/inquiry/document/network/c;

    instance-of v5, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v5, :cond_3

    move-object v5, v2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;->a()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;->a()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;->a()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;

    goto :goto_1

    :cond_1
    move-object v6, v3

    :goto_1
    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    new-instance v7, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v8

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileUploadResponse;->a()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;

    move-result-object v11

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;->b()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    invoke-direct {v12, p1, v10, v9, v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v7, v8, v12}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 p1, 0x2

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, v7, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_3

    :cond_2
    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    new-instance v7, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, v7}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 v5, 0x3

    iput v5, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_3

    :cond_3
    :goto_2
    instance-of p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz p1, :cond_8

    move-object p1, v2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v5

    instance-of v5, v5, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    if-eqz v5, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;->getErrorBody()Lokhttp3/ResponseBody;

    move-result-object v5

    if-eqz v5, :cond_4

    :try_start_0
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->source()Lxu/g;

    move-result-object v5

    new-instance v6, Lum/w$b;

    invoke-direct {v6}, Lum/w$b;-><init>()V

    sget-object v7, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;->getAdapter()Lum/h$e;

    move-result-object v7

    invoke-virtual {v6, v7}, Lum/w$b;->c(Lum/h$e;)Lum/w$b;

    move-result-object v6

    invoke-virtual {v6}, Lum/w$b;->d()Lum/w;

    move-result-object v6

    const-class v7, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;

    invoke-virtual {v6, v7}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v6

    invoke-virtual {v6, v5}, Lum/h;->fromJson(Lxu/g;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    :catch_0
    :cond_4
    if-eqz v3, :cond_5

    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 p1, 0x4

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, v5, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto/16 :goto_3

    :cond_5
    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 p1, 0x5

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, v5, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v5

    if-eqz v5, :cond_7

    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 p1, 0x6

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, v5, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_7
    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;

    invoke-direct {v5, p1}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->z:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->u:Ljava/lang/Object;

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->w:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->x:I

    const/4 p1, 0x7

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->y:I

    invoke-interface {v0, v5, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
