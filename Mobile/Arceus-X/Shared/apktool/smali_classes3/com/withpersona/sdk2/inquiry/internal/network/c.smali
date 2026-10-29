.class public final Lcom/withpersona/sdk2/inquiry/internal/network/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
        "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;",
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Network:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    if-eqz v0, :cond_2

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Permissions:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$CameraErrorInfo;

    if-eqz v0, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Camera:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;

    if-eqz v0, :cond_4

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_4
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    if-eqz v0, :cond_5

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_5
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;

    if-eqz v0, :cond_6

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_6
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    if-eqz v0, :cond_7

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_7
    instance-of p0, p0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;

    if-eqz p0, :cond_8

    sget-object p0, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;->Other:Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    return-object p0

    :cond_8
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method
