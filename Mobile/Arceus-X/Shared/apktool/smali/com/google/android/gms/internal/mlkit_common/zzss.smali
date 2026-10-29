.class public final Lcom/google/android/gms/internal/mlkit_common/zzss;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;


# direct methods
.method public static declared-synchronized zza(Lcom/google/android/gms/internal/mlkit_common/zzsb;)Lcom/google/android/gms/internal/mlkit_common/zzsh;
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzss;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzsr;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzsr;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzsq;)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza:Lcom/google/android/gms/internal/mlkit_common/zzsr;

    invoke-virtual {v1, p0}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;
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

.method public static declared-synchronized zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsh;
    .locals 1

    const-class p0, Lcom/google/android/gms/internal/mlkit_common/zzss;

    monitor-enter p0

    :try_start_0
    const-string v0, "common"

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsb;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsa;->zzd()Lcom/google/android/gms/internal/mlkit_common/zzsb;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_common/zzss;->zza(Lcom/google/android/gms/internal/mlkit_common/zzsb;)Lcom/google/android/gms/internal/mlkit_common/zzsh;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
