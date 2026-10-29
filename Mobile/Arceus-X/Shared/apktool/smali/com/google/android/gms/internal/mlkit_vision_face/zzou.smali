.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzou;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_face/zzou;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:Z

.field private final zzf:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzov;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzov;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIIZF)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzd:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zze:Z

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzf:F

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zza:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzb:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzc:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzd:I

    invoke-static {p1, v0, v1}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zze:Z

    invoke-static {p1, v0, v1}, Lo9/b;->c(Landroid/os/Parcel;IZ)V

    const/4 v0, 0x6

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzou;->zzf:F

    invoke-static {p1, v0, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    invoke-static {p1, p2}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
