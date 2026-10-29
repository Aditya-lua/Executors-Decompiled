.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

.field private final zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

.field private final zze:Ljava/lang/Boolean;

.field private final zzf:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;Lcom/google/android/gms/internal/mlkit_vision_face/zzkc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzi(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzj(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzh(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzl(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zze:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;->zzm(Lcom/google/android/gms/internal/mlkit_vision_face/zzjx;)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzf:Ljava/lang/Float;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zze:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zze:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzf:Ljava/lang/Float;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzf:Ljava/lang/Float;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zze:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzf:Ljava/lang/Float;

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzb:Lcom/google/android/gms/internal/mlkit_vision_face/zzjy;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzjz;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_vision_face/zzka;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzka;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzkb;

    return-object v0
.end method

.method public final zze()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zze:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final zzf()Ljava/lang/Float;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzkd;->zzf:Ljava/lang/Float;

    return-object v0
.end method
