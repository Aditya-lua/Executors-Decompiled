.class public final Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;",
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
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;
    .locals 5

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-eq v2, v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    invoke-direct {p1, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams$a;->b(I)[Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    move-result-object p1

    return-object p1
.end method
