.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

.field private final zzb:Ljava/lang/Boolean;

.field private final zzc:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zzb:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    const/4 v1, 0x0

    filled-new-array {v0, v1, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    return-object v0
.end method
