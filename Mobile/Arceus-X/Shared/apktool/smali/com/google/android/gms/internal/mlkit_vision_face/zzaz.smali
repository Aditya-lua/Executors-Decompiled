.class abstract Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field zzb:I

.field zzc:I

.field zzd:I

.field final synthetic zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;Lcom/google/android/gms/internal/mlkit_vision_face/zzav;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zza(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zze()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzd:I

    return-void
.end method

.method private final zzb()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zza(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;)I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzd:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zza(I)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzf(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb()V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzd:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "no calls to next() since the last call to remove()"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzab;->zzd(ZLjava/lang/Object;)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzb:I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zze:Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzd:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbd;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    const/4 v1, -0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzc:I

    iput v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzaz;->zzd:I

    return-void
.end method

.method public abstract zza(I)Ljava/lang/Object;
.end method
