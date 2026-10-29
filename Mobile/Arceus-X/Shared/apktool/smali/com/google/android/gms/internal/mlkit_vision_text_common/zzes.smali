.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

.field private final zzb:Ljava/lang/Boolean;

.field private final zzc:Ljava/lang/Boolean;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzer;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzb:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzg(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzc:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzc:Ljava/lang/Boolean;

    iget-object v4, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzc:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzc:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    const/4 v3, 0x0

    filled-new-array {v0, v3, v1, v3, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcx;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;->zzc:Ljava/lang/Boolean;

    return-object v0
.end method
