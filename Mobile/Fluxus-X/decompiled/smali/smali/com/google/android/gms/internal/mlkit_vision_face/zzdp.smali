.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

.field private final zzb:Ljava/lang/Integer;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzjv;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;Lcom/google/android/gms/internal/mlkit_vision_face/zzdo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;->zzd(Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;)Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;->zzg(Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zzb:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;->zzf(Lcom/google/android/gms/internal/mlkit_vision_face/zzdk;)Lcom/google/android/gms/internal/mlkit_vision_face/zzjv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzjv;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zza:Lcom/google/android/gms/internal/mlkit_vision_face/zzdn;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_face/zzjv;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zzjv;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_face/zzcu;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzdp;->zzb:Ljava/lang/Integer;

    return-object v0
.end method
