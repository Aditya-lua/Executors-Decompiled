.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final NUM_RETRIES:I = 0x3

.field public static final SUBSYSTEM:Ljava/lang/String; = "com.withpersona.sdk2.inquiry.network"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueRetriableRequestWithRetry$lambda$2(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry$lambda$3(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z

    move-result p0

    return p0
.end method

.method public static final enqueueRetriableRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/f;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/f;-><init>()V

    invoke-static {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueWithRetryWhen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final enqueueRetriableRequestWithRetry$lambda$2(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result p0

    return p0
.end method

.method public static final enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/g;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/g;-><init>()V

    invoke-static {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueWithRetryWhen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final enqueueVerificationRequestWithRetry$lambda$3(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getCode()I

    move-result p0

    if-eqz p0, :cond_0

    const/16 v0, 0x199

    if-eq p0, v0, :cond_0

    const/16 v0, 0x19d

    if-eq p0, v0, :cond_0

    const/16 v0, 0x1a6

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final enqueueWithRetryWhen(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;

    invoke-direct {v0, p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;-><init>(Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->I$0:I

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v5, v0

    move-object v0, p1

    move-object p1, v2

    move-object v2, v5

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    const/4 p2, 0x0

    const/4 v2, 0x0

    move-object v5, p1

    move-object p1, p0

    move p0, v2

    move-object v2, v0

    :goto_1
    move-object v0, p2

    move-object p2, v5

    const/4 v4, 0x3

    if-ge p0, v4, :cond_6

    iput-object p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$0:Ljava/lang/Object;

    iput-object p2, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$1:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->L$2:Ljava/lang/Object;

    iput p0, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->I$0:I

    iput v3, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt$enqueueWithRetryWhen$1;->label:I

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v0

    move-object v0, p2

    move-object p2, v5

    :goto_2
    check-cast p2, Ljv/x;

    invoke-virtual {p2}, Ljv/x;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {p2}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_4
    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p2

    invoke-interface {v0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_5

    move-object v0, p2

    goto :goto_3

    :cond_5
    add-int/2addr p0, v3

    move-object v5, v0

    goto :goto_1

    :cond_6
    :goto_3
    new-instance p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v0, :cond_7

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;)V

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final onFailure(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static final onSuccess(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static final toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;
    .locals 8
    .param p0    # Ljv/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv/x<",
            "*>;)",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Ljv/x;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljv/x;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v1

    :goto_1
    invoke-virtual {p0}, Ljv/x;->b()I

    move-result v2

    const/16 v3, 0x1ad

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$RateLimitExceededError;

    const-string v2, "Quota exceeded"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$RateLimitExceededError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_c

    :cond_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->getCLIENT_ERRORS()Lkotlin/ranges/IntRange;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/ranges/a;->d()I

    move-result v6

    invoke-virtual {v5}, Lkotlin/ranges/a;->e()I

    move-result v5

    const/4 v7, 0x1

    if-gt v2, v5, :cond_1d

    if-gt v6, v2, :cond_1d

    :try_start_0
    invoke-virtual {p0}, Ljv/x;->e()Lokhttp3/ResponseBody;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lokhttp3/ResponseBody;->source()Lxu/g;

    move-result-object v3

    if-eqz v3, :cond_4

    new-instance v5, Lum/w$b;

    invoke-direct {v5}, Lum/w$b;-><init>()V

    sget-object v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Companion;->getAdapter()Lum/h$e;

    move-result-object v6

    invoke-virtual {v5, v6}, Lum/w$b;->c(Lum/h$e;)Lum/w$b;

    move-result-object v5

    sget-object v6, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$Companion;

    invoke-virtual {v5, v6}, Lum/w$b;->a(Ljava/lang/Object;)Lum/w$b;

    move-result-object v5

    invoke-virtual {v5}, Lum/w$b;->d()Lum/w;

    move-result-object v5

    const-class v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;

    invoke-virtual {v5, v6}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v5

    invoke-interface {v3}, Lxu/g;->k()Lxu/e;

    move-result-object v3

    invoke-virtual {v3}, Lxu/e;->b()Lxu/e;

    move-result-object v3

    invoke-virtual {v5, v3}, Lum/h;->fromJson(Lxu/g;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v3

    instance-of v5, v3, Lum/j;

    if-nez v5, :cond_4

    instance-of v5, v3, Ljava/io/IOException;

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    throw v3

    :cond_4
    :goto_2
    move-object v3, v1

    :goto_3
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;->getDescription()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;->getTitle()Ljava/lang/String;

    move-result-object v6

    :cond_5
    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    move-object v0, v6

    :cond_7
    :goto_4
    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InactiveTemplateError;

    if-eqz v6, :cond_9

    goto/16 :goto_b

    :cond_a
    :goto_5
    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_6

    :cond_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InvalidConfigError;

    if-eqz v6, :cond_c

    goto/16 :goto_b

    :cond_d
    :goto_6
    if-eqz v3, :cond_10

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_10

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_7

    :cond_e
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnauthenticatedError;

    if-eqz v6, :cond_f

    goto/16 :goto_b

    :cond_10
    :goto_7
    if-eqz v3, :cond_13

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_8

    :cond_11
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InconsistentTransitionError;

    if-eqz v6, :cond_12

    goto :goto_b

    :cond_13
    :goto_8
    if-eqz v3, :cond_16

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_16

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_14

    goto :goto_9

    :cond_14
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$TransitionFromTerminalStateError;

    if-eqz v6, :cond_15

    goto :goto_b

    :cond_16
    :goto_9
    if-eqz v3, :cond_19

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_19

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_17

    goto :goto_a

    :cond_17
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_18
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    instance-of v6, v6, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$FieldNotFoundError;

    if-eqz v6, :cond_18

    goto :goto_b

    :cond_19
    :goto_a
    const/16 v5, 0x191

    if-eq v2, v5, :cond_1b

    const/16 v5, 0x194

    if-eq v2, v5, :cond_1b

    const/16 v5, 0x199

    if-ne v2, v5, :cond_1a

    goto :goto_b

    :cond_1a
    move v4, v7

    :cond_1b
    :goto_b
    if-eqz v3, :cond_1c

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse;->getErrors()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    :cond_1c
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    if-eqz v2, :cond_1f

    move-object v2, v1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    invoke-virtual {p0}, Ljv/x;->e()Lokhttp3/ResponseBody;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;->setErrorBody(Lokhttp3/ResponseBody;)V

    goto :goto_c

    :cond_1d
    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/core/HttpStatusCode;->getSERVER_ERRORS()Lkotlin/ranges/IntRange;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/ranges/a;->d()I

    move-result v5

    invoke-virtual {v3}, Lkotlin/ranges/a;->e()I

    move-result v3

    if-gt v2, v3, :cond_1e

    if-gt v5, v2, :cond_1e

    goto :goto_c

    :cond_1e
    move v4, v7

    :cond_1f
    :goto_c
    new-instance v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {p0}, Ljv/x;->b()I

    move-result p0

    invoke-direct {v2, p0, v0, v4, v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;)V

    return-object v2
.end method

.method public static final toSocketTimeoutErrorInfo(Ljava/net/SocketTimeoutException;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;
    .locals 7
    .param p0    # Ljava/net/SocketTimeoutException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
