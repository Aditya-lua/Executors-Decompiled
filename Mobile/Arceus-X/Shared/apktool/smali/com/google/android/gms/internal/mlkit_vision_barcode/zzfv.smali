.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

.field private final zzb:Ljava/lang/Integer;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzb:Ljava/lang/Integer;

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfq;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqd;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqd;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzft;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqd;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzqd;

    return-object v0
.end method

.method public final zzc()Ljava/lang/Integer;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfv;->zzb:Ljava/lang/Integer;

    return-object v0
.end method
