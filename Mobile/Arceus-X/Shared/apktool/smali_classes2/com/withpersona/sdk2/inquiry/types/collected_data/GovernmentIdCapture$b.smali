.class public final Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;",
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
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;
    .locals 7

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;->valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;->valueOf(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-eq v5, v3, :cond_0

    sget-object v6, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$Frame;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v6, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;

    invoke-direct {p1, v0, v1, v2, v4}, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$c;Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$a;Ljava/util/List;)V

    return-object p1
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$b;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture$b;->b(I)[Lcom/withpersona/sdk2/inquiry/types/collected_data/GovernmentIdCapture;

    move-result-object p1

    return-object p1
.end method
