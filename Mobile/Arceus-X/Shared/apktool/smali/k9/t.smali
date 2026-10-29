.class public final Lk9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# static fields
.field public static final b:Lk9/t;


# instance fields
.field public final a:Landroid/os/Parcelable$Creator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk9/t;

    new-instance v1, Lk9/u;

    invoke-direct {v1}, Lk9/u;-><init>()V

    invoke-direct {v0, v1}, Lk9/t;-><init>(Landroid/os/Parcelable$Creator;)V

    sput-object v0, Lk9/t;->b:Lk9/t;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable$Creator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/t;->a:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public static a()Lk9/t;
    .locals 1

    sget-object v0, Lk9/t;->b:Lk9/t;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    const v2, -0xc2a5d3a

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lk9/u;->a(Landroid/os/Parcel;)Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, -0x4

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-static {}, Lcom/google/android/gms/common/api/ApiMetadata;->v3()Lcom/google/android/gms/common/api/ApiMetadata;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lcom/google/android/gms/common/api/ApiMetadata;

    return-object p1
.end method
