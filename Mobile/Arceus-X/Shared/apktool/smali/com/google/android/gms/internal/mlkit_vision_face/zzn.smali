.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzn;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_face/zzn;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:I

.field public final zzb:F

.field public final zzc:F

.field public final zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IFFI)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzb:F

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzc:F

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzd:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zza:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzb:F

    invoke-static {p1, v0, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzc:F

    invoke-static {p1, v0, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzn;->zzd:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
