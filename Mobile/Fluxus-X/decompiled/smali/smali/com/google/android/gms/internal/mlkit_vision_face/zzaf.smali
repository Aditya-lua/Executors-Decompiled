.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;
.super Lcom/google/android/gms/internal/mlkit_vision_face/zzbv;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzah;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbv;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzah;->zza:Ljava/util/Map;

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

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzag;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzag;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzah;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbv;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzah;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzap;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzap;->zzm(Lcom/google/android/gms/internal/mlkit_vision_face/zzap;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final zza()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaf;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzah;

    return-object v0
.end method
