.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzl()Ljava/util/Map;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;Ljava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzj(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzw;->zza(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzl()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzas;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzas;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzl()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzr()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)I

    move-result v4

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzi(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzs(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)[I

    move-result-object v6

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzt(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)[Ljava/lang/Object;

    move-result-object v7

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzu(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)[Ljava/lang/Object;

    move-result-object v8

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbb;->zzb(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v1, p1, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzq(II)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;)I

    move-result v1

    add-int/2addr v1, v0

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzm(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->zzo()V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzau;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzba;->size()I

    move-result v0

    return v0
.end method
