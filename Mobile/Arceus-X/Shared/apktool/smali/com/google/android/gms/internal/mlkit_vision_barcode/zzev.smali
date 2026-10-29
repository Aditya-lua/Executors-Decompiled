.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    move-result-object v0

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzn(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final synthetic zzd(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzo(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Z

    return-void
.end method

.method public final zzf()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->isDone()Z

    move-result v0

    return v0
.end method
