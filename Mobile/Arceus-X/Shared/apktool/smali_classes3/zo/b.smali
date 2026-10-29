.class public final Lzo/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzo/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;",
        "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;",
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzo/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->c:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    return-object p0

    :cond_2
    sget-object p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsCollectionRequirement;

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzo/b$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;->a:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;->b:Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;

    return-object p0
.end method
