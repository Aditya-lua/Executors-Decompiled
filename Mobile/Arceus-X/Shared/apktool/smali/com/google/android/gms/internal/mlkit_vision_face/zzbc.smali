.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzbc;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbc;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbc;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbc;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzl()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_face/zzax;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzax;-><init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbc;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->size()I

    move-result v0

    return v0
.end method
