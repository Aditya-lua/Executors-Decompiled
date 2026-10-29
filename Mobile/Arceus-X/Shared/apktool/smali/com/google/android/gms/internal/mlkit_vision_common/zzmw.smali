.class public final Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized zza()Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;
    .locals 2

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static final zzb()Z
    .locals 1

    const-string v0, "mlkit-dev-profiling"

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmv;->zza(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
