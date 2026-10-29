.class public final Lcom/google/android/gms/internal/mlkit_common/zznh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/lang/String;

.field private final zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

.field private final zzg:Ljava/lang/Long;

.field private final zzh:Ljava/lang/Boolean;

.field private final zzi:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zznd;Lcom/google/android/gms/internal/mlkit_common/zzng;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zznd;->zzi(Lcom/google/android/gms/internal/mlkit_common/zznd;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zza:Ljava/lang/String;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzb:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zznd;->zzf(Lcom/google/android/gms/internal/mlkit_common/zznd;)Lcom/google/android/gms/internal/mlkit_common/zznf;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzd:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zznd;->zzh(Lcom/google/android/gms/internal/mlkit_common/zznd;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zze:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zznd;->zze(Lcom/google/android/gms/internal/mlkit_common/zznd;)Lcom/google/android/gms/internal/mlkit_common/zzne;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzg:Ljava/lang/Long;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzh:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzi:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_common/zznh;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zznh;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zza:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/mlkit_common/zznh;->zza:Ljava/lang/String;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

    iget-object v4, p1, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

    invoke-static {v3, v4}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zze:Ljava/lang/String;

    iget-object v4, p1, Lcom/google/android/gms/internal/mlkit_common/zznh;->zze:Ljava/lang/String;

    invoke-static {v3, v4}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    invoke-static {v3, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zza:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

    iget-object v4, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zze:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_common/zzne;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x6
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzne;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_common/zznf;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zzc:Lcom/google/android/gms/internal/mlkit_common/zznf;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbc;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zznh;->zza:Ljava/lang/String;

    return-object v0
.end method
