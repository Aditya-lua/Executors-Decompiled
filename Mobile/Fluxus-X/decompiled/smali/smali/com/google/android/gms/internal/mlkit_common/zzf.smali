.class public final Lcom/google/android/gms/internal/mlkit_common/zzf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_common/zzac;

.field private zzb:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzac;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzac;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzac;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zze;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/mlkit_common/zzac;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_common/zzac;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzac;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_common/zzk;)Lcom/google/android/gms/internal/mlkit_common/zzf;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    const-string v1, "Must call internal() or external() before appending rules."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzt;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzac;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzac;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzac;

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_common/zzf;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "A SourcePolicy can only set internal() or external() once."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzt;->zze(ZLjava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final zzc()Lcom/google/android/gms/internal/mlkit_common/zzf;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "A SourcePolicy can only set internal() or external() once."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzt;->zze(ZLjava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_common/zzh;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    const-string v1, "Must call internal() or external() when building a SourcePolicy."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzt;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzh;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zzb:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzf;->zza:Lcom/google/android/gms/internal/mlkit_common/zzac;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzac;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/google/android/gms/internal/mlkit_common/zzh;-><init>(ZZLcom/google/android/gms/internal/mlkit_common/zzaf;Lcom/google/android/gms/internal/mlkit_common/zzg;)V

    return-object v0
.end method
