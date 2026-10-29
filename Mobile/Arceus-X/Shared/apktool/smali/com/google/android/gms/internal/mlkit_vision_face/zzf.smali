.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzf;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_face/zzf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:F

.field public final zzd:F

.field public final zze:F

.field public final zzf:F

.field public final zzg:F

.field public final zzh:F

.field public final zzi:F

.field public final zzj:[Lcom/google/android/gms/internal/mlkit_vision_face/zzn;

.field public final zzk:F

.field public final zzl:F

.field public final zzm:F

.field public final zzn:[Lcom/google/android/gms/internal/mlkit_vision_face/zzd;

.field public final zzo:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIFFFFFFF[Lcom/google/android/gms/internal/mlkit_vision_face/zzn;FFF[Lcom/google/android/gms/internal/mlkit_vision_face/zzd;F)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzc:F

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzd:F

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zze:F

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzf:F

    iput p7, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzg:F

    iput p8, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzh:F

    iput p9, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzi:F

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzj:[Lcom/google/android/gms/internal/mlkit_vision_face/zzn;

    iput p11, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzk:F

    iput p12, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzl:F

    iput p13, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzm:F

    iput-object p14, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzn:[Lcom/google/android/gms/internal/mlkit_vision_face/zzd;

    iput p15, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzo:F

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zza:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzb:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    const/4 v1, 0x3

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzc:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzd:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zze:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzf:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 v1, 0x7

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzg:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 v1, 0x8

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzh:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzj:[Lcom/google/android/gms/internal/mlkit_vision_face/zzn;

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lo9/b;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/16 v1, 0xa

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzk:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 v1, 0xb

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzl:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 v1, 0xc

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzm:F

    invoke-static {p1, v1, v2}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzn:[Lcom/google/android/gms/internal/mlkit_vision_face/zzd;

    invoke-static {p1, v1, v2, p2, v3}, Lo9/b;->y(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/16 p2, 0xe

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzi:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 p2, 0xf

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzf;->zzo:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method
