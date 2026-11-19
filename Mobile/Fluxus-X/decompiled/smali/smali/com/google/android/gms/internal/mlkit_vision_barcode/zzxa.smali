.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;


# direct methods
.method public static declared-synchronized zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwy;)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwz;

    invoke-virtual {v1, p0}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;->zza(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
