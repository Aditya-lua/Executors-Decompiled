.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;
.super Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;
.source "SourceFile"


# instance fields
.field final transient zza:I

.field final transient zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzb:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzb:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzab;->zza(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zza:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzb:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;->zzf(II)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zza:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzb:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zzc()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zza:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zze()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbi;->zze()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(II)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzb:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzab;->zzc(III)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzbm;->zza:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;->zzf(II)Lcom/google/android/gms/internal/mlkit_vision_face/zzbn;

    move-result-object p1

    return-object p1
.end method
