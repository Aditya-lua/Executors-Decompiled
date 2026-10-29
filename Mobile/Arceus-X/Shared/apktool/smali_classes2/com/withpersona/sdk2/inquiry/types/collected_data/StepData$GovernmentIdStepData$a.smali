.class public final Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;",
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
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;
    .locals 5

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-eq v3, v1, :cond_0

    sget-object v4, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v4, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;

    invoke-direct {v1, v0, v2, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedGovernmentIdDetails;)V

    return-object v1
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData$a;->b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/StepData$GovernmentIdStepData;

    move-result-object p1

    return-object p1
.end method
