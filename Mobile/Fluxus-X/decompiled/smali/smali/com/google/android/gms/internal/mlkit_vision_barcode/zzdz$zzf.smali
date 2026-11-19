.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz<",
            "TV;>;"
        }
    .end annotation
.end field

.field final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;

    move-result-object v2

    invoke-virtual {v2, v1, p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zza;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz$zzf;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzk(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;Z)V

    :cond_1
    :goto_0
    return-void
.end method
