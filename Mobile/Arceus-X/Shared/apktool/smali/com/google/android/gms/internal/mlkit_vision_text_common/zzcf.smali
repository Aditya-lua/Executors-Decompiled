.class final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;
.super Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)I

    move-result v0

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzx;->zza(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzi(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)[Ljava/lang/Object;

    move-result-object v0

    add-int/2addr p1, p1

    aget-object v0, v0, p1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzi(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)[Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v1, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcf;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcg;)I

    move-result v0

    return v0
.end method
