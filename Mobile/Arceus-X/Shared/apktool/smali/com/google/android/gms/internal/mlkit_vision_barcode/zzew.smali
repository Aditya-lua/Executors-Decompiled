.class final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzef;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# instance fields
.field private volatile zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzef;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzev;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;->run()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    return-void
.end method

.method public final zzf()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "task=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzf()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzm()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdz;->zzp()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;->zze()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzer;

    return-void
.end method
