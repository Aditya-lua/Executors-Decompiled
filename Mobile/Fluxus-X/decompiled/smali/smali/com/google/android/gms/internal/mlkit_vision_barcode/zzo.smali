.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public zza:D

.field public zzb:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzab;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzab;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp9/a;-><init>()V

    return-void
.end method

.method public constructor <init>(DD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lp9/a;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zza:D

    iput-wide p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zzb:D

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x2

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zza:D

    invoke-static {p1, v0, v1, v2}, Lp9/c;->i(Landroid/os/Parcel;ID)V

    const/4 v0, 0x3

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzo;->zzb:D

    invoke-static {p1, v0, v1, v2}, Lp9/c;->i(Landroid/os/Parcel;ID)V

    invoke-static {p1, p2}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
