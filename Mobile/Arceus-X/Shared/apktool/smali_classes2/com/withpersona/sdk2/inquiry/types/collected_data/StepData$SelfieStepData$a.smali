.class public final Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;
    .locals 6

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v2, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    check-cast v2, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    if-nez v4, :cond_1

    move-object v4, v3

    goto :goto_1

    :cond_1
    sget-object v4, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    :goto_1
    check-cast v4, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v3, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v3

    :goto_2
    check-cast v3, Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;

    invoke-direct {v0, v1, v2, v4, v3}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;Lcom/withpersona/sdk2/inquiry/types/collected_data/SelfieCapture;)V

    return-object v0
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData$a;->b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$SelfieStepData;

    move-result-object p1

    return-object p1
.end method
