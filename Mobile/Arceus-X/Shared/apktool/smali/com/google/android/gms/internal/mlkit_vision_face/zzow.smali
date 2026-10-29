.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzow;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_face/zzow;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:Landroid/graphics/Rect;

.field private final zzc:F

.field private final zzd:F

.field private final zze:F

.field private final zzf:F

.field private final zzg:F

.field private final zzh:F

.field private final zzi:F

.field private final zzj:Ljava/util/List;

.field private final zzk:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzox;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzox;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/Rect;FFFFFFFLjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzb:Landroid/graphics/Rect;

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzc:F

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzd:F

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zze:F

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzf:F

    iput p7, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzg:F

    iput p8, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzh:F

    iput p9, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzi:F

    iput-object p10, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzj:Ljava/util/List;

    iput-object p11, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzk:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lo9/b;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zza:I

    invoke-static {p1, v1, v2}, Lo9/b;->n(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzb:Landroid/graphics/Rect;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lo9/b;->t(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 p2, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzc:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 p2, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzd:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 p2, 0x5

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zze:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 p2, 0x6

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzf:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/4 p2, 0x7

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzg:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 p2, 0x8

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzh:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 p2, 0x9

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzi:F

    invoke-static {p1, p2, v1}, Lo9/b;->k(Landroid/os/Parcel;IF)V

    const/16 p2, 0xa

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzj:Ljava/util/List;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    const/16 p2, 0xb

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzk:Ljava/util/List;

    invoke-static {p1, p2, v1, v3}, Lo9/b;->z(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lo9/b;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzf:F

    return v0
.end method

.method public final zzb()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzd:F

    return v0
.end method

.method public final zzc()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzg:F

    return v0
.end method

.method public final zzd()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzc:F

    return v0
.end method

.method public final zze()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzh:F

    return v0
.end method

.method public final zzf()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zze:F

    return v0
.end method

.method public final zzg()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zza:I

    return v0
.end method

.method public final zzh()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzb:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final zzi()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzk:Ljava/util/List;

    return-object v0
.end method

.method public final zzj()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzow;->zzj:Ljava/util/List;

    return-object v0
.end method
