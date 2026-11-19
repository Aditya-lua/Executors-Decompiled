.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;
.super Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbx;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbx;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;->zza:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzac;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzac;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbx;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzal;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzal;->zzk(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzal;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final zza()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzab;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzad;

    return-object v0
.end method
