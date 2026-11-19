.class public abstract Lcom/google/android/gms/internal/mlkit_vision_face/zzbq;
.super Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field private transient zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-eq p1, p0, :cond_3

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_1

    return v2

    :cond_1
    return v0

    :catch_0
    :cond_2
    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcj;->zza(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbq;->zzd()Lcom/google/android/gms/internal/mlkit_vision_face/zzcl;

    move-result-object v0

    return-object v0
.end method

.method public abstract zzd()Lcom/google/android/gms/internal/mlkit_vision_face/zzcl;
.end method

.method public final zzf()Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbq;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbq;->zzg()Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbq;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    :cond_0
    return-object v0
.end method

.method public zzg()Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;->zzg([Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object v0

    return-object v0
.end method
