.class public final Lgp/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;",
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;
    .locals 3
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getGpsCollectionRequirement()Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lzo/b;->a(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    sget-object v1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->c:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    :cond_1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getGpsPrecisionRequirement()Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lzo/b;->b(Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    move-result-object v2

    if-nez v2, :cond_3

    :cond_2
    sget-object v2, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    :cond_3
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;->getPlayIntegrityProjectId()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;-><init>(Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;Z)V

    return-object v0
.end method
