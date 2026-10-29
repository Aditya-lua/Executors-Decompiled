.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzh;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_face/zzh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public zza:I

.field public zzb:I

.field public zzc:I

.field public zzd:Z

.field public zze:Z

.field public zzf:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public constructor <init>(IIIZZF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzc:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzd:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zze:Z

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzf:F

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zza:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzb:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzc:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzd:Z

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zze:Z

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x7

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzh;->zzf:F

    invoke-static {p1, v0, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
