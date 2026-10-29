.class public final Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;",
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
.method public final a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;
    .locals 4

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    new-array v1, v0, [Ljava/lang/Float;

    const/4 v2, 0x0

    :goto_0
    if-eq v2, v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    invoke-direct {p1, v1}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;-><init>([Ljava/lang/Float;)V

    return-object p1
.end method

.method public final b(I)[Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;
    .locals 0

    new-array p1, p1, [Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo$a;->a(Landroid/os/Parcel;)Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo$a;->b(I)[Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object p1

    return-object p1
.end method
