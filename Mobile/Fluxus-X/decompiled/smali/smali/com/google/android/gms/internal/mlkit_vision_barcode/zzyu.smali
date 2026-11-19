.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;
.super Lp9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIIJ)V
    .locals 0

    invoke-direct {p0}, Lp9/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzd:I

    iput-wide p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zze:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zza:I

    invoke-static {p1}, Lp9/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzb:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzc:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zzd:I

    invoke-static {p1, p2, v1}, Lp9/c;->n(Landroid/os/Parcel;II)V

    const/4 p2, 0x5

    iget-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzyu;->zze:J

    invoke-static {p1, p2, v1, v2}, Lp9/c;->r(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, Lp9/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
