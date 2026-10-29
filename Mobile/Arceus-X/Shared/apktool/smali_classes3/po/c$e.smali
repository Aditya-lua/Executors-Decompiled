.class public final Lpo/c$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpo/c;->run()Lnu/h;
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
        "Lpo/c$b;",
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
        "Lpo/c$b;",
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
    c = "com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker$run$1"
    f = "SubmitVerificationWorker.kt"
    l = {
        0x4f,
        0x51,
        0x55,
        0x6b,
        0x7d,
        0x7f,
        0x86
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Lpo/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lpo/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpo/c;",
            "Lnt/b<",
            "-",
            "Lpo/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpo/c$e;->B:Lpo/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lpo/c$e;

    iget-object v1, p0, Lpo/c$e;->B:Lpo/c;

    invoke-direct {v0, v1, p2}, Lpo/c$e;-><init>(Lpo/c;Lnt/b;)V

    iput-object p1, v0, Lpo/c$e;->A:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lpo/c$e;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lpo/c$e;->A:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lpo/c$e;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lpo/c$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;

    :pswitch_1
    iget-object v0, p0, Lpo/c$e;->v:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, p0, Lpo/c$e;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v0, p0, Lpo/c$e;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v3, p0, Lpo/c$e;->t:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object v2, p0, Lpo/c$e;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :cond_0
    move-object v3, v2

    goto/16 :goto_2

    :pswitch_4
    iget-object v0, p0, Lpo/c$e;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, p0, Lpo/c$e;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    iget-object v2, p0, Lpo/c$e;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {p1}, Lpo/c;->n(Lpo/c;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v7, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->SUBMITTING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1, v6, v5, v3, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    sget-object p1, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    iget-object v2, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {v2}, Lpo/c;->k(Lpo/c;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "data[id]"

    invoke-virtual {p1, v6, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v2

    const-string v6, "data[type]"

    const-string v7, "inquiry"

    invoke-virtual {p1, v6, v7}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v6

    iget-object v7, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {v7}, Lpo/c;->h(Lpo/c;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "meta[from_component]"

    invoke-virtual {p1, v8, v7}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v7

    iget-object v8, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {v8}, Lpo/c;->i(Lpo/c;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "meta[from_step]"

    invoke-virtual {p1, v9, v8}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object p1

    filled-new-array {v2, v6, v7, p1}, [Lokhttp3/MultipartBody$Part;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object p1, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {p1}, Lpo/c;->j(Lpo/c;)Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v6, p0, Lpo/c$e;->B:Lpo/c;

    invoke-static {v6}, Lpo/c;->e(Lpo/c;)Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v7

    iput-object v0, p0, Lpo/c$e;->A:Ljava/lang/Object;

    iput-object v2, p0, Lpo/c$e;->t:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, p0, Lpo/c$e;->z:I

    invoke-static {v6, p1, v2, v7, p0}, Lpo/c;->d(Lpo/c;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_3

    new-instance p1, Lpo/c$b$a;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v7, "Error adding data to form."

    invoke-direct {v4, v7}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v4}, Lpo/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lpo/c$e;->t:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    iput v5, p0, Lpo/c$e;->x:I

    iput v3, p0, Lpo/c$e;->z:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_5

    :cond_2
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    :cond_4
    new-instance p1, Lpo/c$e$a;

    iget-object v3, p0, Lpo/c$e;->B:Lpo/c;

    invoke-direct {p1, v3, v2, v4}, Lpo/c$e$a;-><init>(Lpo/c;Ljava/util/List;Lnt/b;)V

    iput-object v0, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lpo/c$e;->t:Ljava/lang/Object;

    const/4 v3, 0x3

    iput v3, p0, Lpo/c$e;->z:I

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_5

    :goto_2
    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object p1, p0, Lpo/c$e;->B:Lpo/c;

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v6, :cond_7

    move-object v6, v2

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v6

    invoke-static {p1}, Lpo/c;->f(Lpo/c;)Lmq/a;

    move-result-object v7

    invoke-interface {v7}, Lmq/a;->b()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-static {p1}, Lpo/c;->j(Lpo/c;)Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;->g()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    invoke-interface {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    new-instance v9, Ljava/io/File;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    goto :goto_3

    :cond_6
    sget-object p1, Lpo/c$b$c;->a:Lpo/c$b$c;

    iput-object v0, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lpo/c$e;->t:Ljava/lang/Object;

    iput-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lpo/c$e;->v:Ljava/lang/Object;

    iput v5, p0, Lpo/c$e;->x:I

    iput v5, p0, Lpo/c$e;->y:I

    const/4 v6, 0x4

    iput v6, p0, Lpo/c$e;->z:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_5

    :cond_7
    :goto_4
    instance-of p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz p1, :cond_b

    move-object p1, v2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v6

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    if-eqz v6, :cond_a

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v6

    const-string v7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.core.ErrorResponse.Error.UnknownError"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;->getErrorBody()Lokhttp3/ResponseBody;

    move-result-object v6

    if-eqz v6, :cond_8

    :try_start_0
    invoke-virtual {v6}, Lokhttp3/ResponseBody;->source()Lxu/g;

    move-result-object v6

    new-instance v7, Lum/w$b;

    invoke-direct {v7}, Lum/w$b;-><init>()V

    sget-object v8, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$Companion;->getAdapter()Lum/h$e;

    move-result-object v8

    invoke-virtual {v7, v8}, Lum/w$b;->c(Lum/h$e;)Lum/w$b;

    move-result-object v7

    invoke-virtual {v7}, Lum/w$b;->d()Lum/w;

    move-result-object v7

    const-class v8, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;

    invoke-virtual {v7, v8}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v7

    invoke-virtual {v7, v6}, Lum/h;->fromJson(Lxu/g;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v6

    :catch_0
    :cond_8
    if-eqz v4, :cond_9

    new-instance v6, Lpo/c$b$b;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    invoke-direct {v6, v7}, Lpo/c$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lpo/c$e;->t:Ljava/lang/Object;

    iput-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpo/c$e;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpo/c$e;->w:Ljava/lang/Object;

    iput v5, p0, Lpo/c$e;->x:I

    iput v5, p0, Lpo/c$e;->y:I

    const/4 p1, 0x5

    iput p1, p0, Lpo/c$e;->z:I

    invoke-interface {v0, v6, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_9
    new-instance v6, Lpo/c$b$b;

    new-instance v7, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;

    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$UnknownError;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v6, v7}, Lpo/c$b$b;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lpo/c$e;->t:Ljava/lang/Object;

    iput-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpo/c$e;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpo/c$e;->w:Ljava/lang/Object;

    iput v5, p0, Lpo/c$e;->x:I

    iput v5, p0, Lpo/c$e;->y:I

    const/4 p1, 0x6

    iput p1, p0, Lpo/c$e;->z:I

    invoke-interface {v0, v6, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_5

    :cond_a
    new-instance v4, Lpo/c$b$a;

    invoke-direct {v4, p1}, Lpo/c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lpo/c$e;->A:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lpo/c$e;->t:Ljava/lang/Object;

    iput-object v2, p0, Lpo/c$e;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lpo/c$e;->v:Ljava/lang/Object;

    iput v5, p0, Lpo/c$e;->x:I

    iput v5, p0, Lpo/c$e;->y:I

    const/4 p1, 0x7

    iput p1, p0, Lpo/c$e;->z:I

    invoke-interface {v0, v4, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_5
    return-object v1

    :cond_b
    :goto_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
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
            "Lpo/c$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lpo/c$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lpo/c$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lpo/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
