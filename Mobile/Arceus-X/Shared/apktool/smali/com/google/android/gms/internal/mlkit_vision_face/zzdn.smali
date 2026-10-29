.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

.field private final zzb:Ljava/lang/Boolean;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

.field private final zze:Ljava/lang/Integer;

.field private final zzf:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;Lcom/google/android/gms/internal/mlkit_vision_face/zzdm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;)Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;->zzi(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzb:Ljava/lang/Boolean;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkh;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;)Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;->zzj(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zze:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;->zzk(Lcom/google/android/gms/internal/mlkit_vision_face/zzdl;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzf:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzb:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzb:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zze:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zze:Ljava/lang/Integer;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzf:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzf:Ljava/lang/Integer;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzb:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zze:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzf:Ljava/lang/Integer;

    const/4 v2, 0x0

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzks;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzks;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzb:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final zzd()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zze:Ljava/lang/Integer;

    return-object v0
.end method

.method public final zze()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;->zzf:Ljava/lang/Integer;

    return-object v0
.end method
