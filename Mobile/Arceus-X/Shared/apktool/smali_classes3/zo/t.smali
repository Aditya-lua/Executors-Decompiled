.class public final Lzo/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Ljava/lang/String;",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;",
        "inquiry-internal_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$CameraErrorInfo;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->d:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->e:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v0, :cond_7

    check-cast p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getResponseError()Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$RateLimitExceededError;

    if-eqz v1, :cond_2

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->g:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_2
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnauthenticatedError;

    if-eqz v1, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->f:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_3
    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$FieldNotFoundError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InactiveTemplateError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InconsistentTransitionError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$TransitionFromTerminalStateError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InvalidConfigError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$UnknownError;

    if-nez v1, :cond_5

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error$InvalidFieldValueError;

    if-nez v1, :cond_5

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->getCode()I

    move-result p0

    const/16 v0, 0x191

    if-ne p0, v0, :cond_6

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->f:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_6
    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->a:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_7
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    if-eqz v0, :cond_8

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->b:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_8
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    if-eqz v0, :cond_9

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->c:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_9
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    if-eqz v0, :cond_a

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->i:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_a
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;

    if-eqz v0, :cond_b

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->j:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_b
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;

    if-eqz v0, :cond_c

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->k:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_c
    instance-of p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    if-eqz p0, :cond_d

    sget-object p0, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->h:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    return-object p0

    :cond_d
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Ljava/lang/String;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$CameraErrorInfo;

    if-eqz v0, :cond_0

    const-string p0, "Unable to find a suitable camera."

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;

    if-eqz v0, :cond_1

    const-string p0, "The SDK is misconfigured."

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v0, :cond_2

    const-string p0, "There was a problem reaching the server."

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    if-eqz v0, :cond_3

    const-string p0, "There was an issue with camera permissions."

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    if-eqz v0, :cond_4

    const-string p0, "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1"

    return-object p0

    :cond_4
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    if-eqz v0, :cond_5

    const-string p0, "The device has no available disk space."

    return-object p0

    :cond_5
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;

    if-eqz v0, :cond_6

    const-string p0, "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project."

    return-object p0

    :cond_6
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;

    if-eqz v0, :cond_7

    const-string p0, "Invalid one time link code."

    return-object p0

    :cond_7
    instance-of p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    if-eqz p0, :cond_8

    const-string p0, "An otherwise unexpected error occurred."

    return-object p0

    :cond_8
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
