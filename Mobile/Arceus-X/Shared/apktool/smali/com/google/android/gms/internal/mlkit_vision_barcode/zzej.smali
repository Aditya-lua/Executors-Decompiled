.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;
.super Lcom/google/android/gms/internal/mlkit_vision_barcode/zzel;
.source "SourceFile"


# direct methods
.method public static zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzem;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzem;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeh;Ljava/util/concurrent/Executor;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzei;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzei;-><init>(Ljava/util/concurrent/Future;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeh;)V

    invoke-interface {p0, v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;->zzl(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;
    .locals 0

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzew;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-object p1
.end method
