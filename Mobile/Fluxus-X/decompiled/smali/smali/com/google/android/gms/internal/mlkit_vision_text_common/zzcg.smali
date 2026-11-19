.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;
.super Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbn;
.source "SourceFile"


# instance fields
.field private final transient zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

.field private final transient zzb:[Ljava/lang/Object;

.field private final transient zzc:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbn;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzb:[Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzc:I

    return-void
.end method

.method public static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzc:I

    return p0
.end method

.method public static bridge synthetic zzi(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzb:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbn;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcp;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzc:I

    return v0
.end method

.method public final zza([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbn;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbf;->zza([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzco;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbn;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcp;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)V

    return-object v0
.end method
