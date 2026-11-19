.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;
.super Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzb:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zza:[Ljava/lang/Object;

    array-length v3, v2

    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    shr-int/lit8 v5, v3, 0x1

    add-int/2addr v3, v5

    add-int/lit8 v3, v3, 0x1

    if-ge v3, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    add-int v3, v0, v0

    :cond_0
    if-gez v3, :cond_1

    const v3, 0x7fffffff

    :cond_1
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zza:[Ljava/lang/Object;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzc:Z

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzc:Z

    if-eqz v0, :cond_3

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zza:[Ljava/lang/Object;

    iput-boolean v4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzc:Z

    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzb:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzb:I

    aput-object p1, v0, v1

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzc:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zza:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbd;->zzb:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzg([Ljava/lang/Object;I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v0

    return-object v0
.end method
