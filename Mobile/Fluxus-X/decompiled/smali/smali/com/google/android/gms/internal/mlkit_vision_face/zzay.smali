.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzay;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzl()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzc(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzj(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzx;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzl()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzaw;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzaw;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzl()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzq()Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzd(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)I

    move-result v5

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzk(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)Ljava/lang/Object;

    move-result-object v6

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzr(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)[I

    move-result-object v7

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzs(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)[Ljava/lang/Object;

    move-result-object v8

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzt(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)[Ljava/lang/Object;

    move-result-object v9

    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbe;->zzb(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0, p1, v5}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzp(II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)I

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzn()V

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzay;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->size()I

    move-result v0

    return v0
.end method
