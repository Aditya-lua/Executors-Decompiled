.class final Lcom/google/android/gms/internal/mlkit_common/zzan;
.super Lcom/google/android/gms/internal/mlkit_common/zzaj;
.source "SourceFile"


# instance fields
.field private final transient zza:Lcom/google/android/gms/internal/mlkit_common/zzai;

.field private final transient zzb:[Ljava/lang/Object;

.field private final transient zzc:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzai;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzaj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zza:Lcom/google/android/gms/internal/mlkit_common/zzai;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzb:[Ljava/lang/Object;

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzc:I

    return-void
.end method

.method public static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_common/zzan;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzc:I

    return p0
.end method

.method public static bridge synthetic zzi(Lcom/google/android/gms/internal/mlkit_common/zzan;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzb:[Ljava/lang/Object;

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

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zza:Lcom/google/android/gms/internal/mlkit_common/zzai;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzai;->get(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_common/zzaj;->zzf()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzj(I)Lcom/google/android/gms/internal/mlkit_common/zzat;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzan;->zzc:I

    return v0
.end method

.method public final zza([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_common/zzaj;->zzf()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzab;->zza([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final zzd()Lcom/google/android/gms/internal/mlkit_common/zzas;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_common/zzaj;->zzf()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzaf;->zzj(I)Lcom/google/android/gms/internal/mlkit_common/zzat;

    move-result-object v0

    return-object v0
.end method

.method public final zzg()Lcom/google/android/gms/internal/mlkit_common/zzaf;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzam;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_common/zzam;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzan;)V

    return-object v0
.end method
