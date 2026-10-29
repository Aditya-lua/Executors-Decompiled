.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;
.super Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
.source "SourceFile"


# instance fields
.field final transient zza:I

.field final transient zzb:I

.field final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zza:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzb:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzb:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzx;->zza(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zza:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzb:I

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzf(II)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbf;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zza:I

    add-int/2addr v0, v1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzb:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zzc()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbf;->zzc()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zza:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final zze()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbf;->zze()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final zzf(II)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzb:I

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzx;->zzc(III)V

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zza:I

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    add-int/2addr p1, v0

    add-int/2addr p2, v0

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzf(II)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object p1

    return-object p1
.end method
