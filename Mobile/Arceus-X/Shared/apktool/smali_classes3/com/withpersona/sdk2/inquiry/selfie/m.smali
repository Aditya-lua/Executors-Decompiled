.class public final Lcom/withpersona/sdk2/inquiry/selfie/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;",
        "selfie_release"
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/m$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    return-object p0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;

    return-object p0

    :cond_2
    sget-object p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;

    return-object p0
.end method
