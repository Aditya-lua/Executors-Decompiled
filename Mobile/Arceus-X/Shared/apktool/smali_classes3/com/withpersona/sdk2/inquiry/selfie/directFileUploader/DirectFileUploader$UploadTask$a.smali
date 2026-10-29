.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
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
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljt/n;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;-><init>(Ljava/lang/String;Ljava/lang/String;Ljt/n;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final b(I)[Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask$a;->b(I)[Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    move-result-object p1

    return-object p1
.end method
