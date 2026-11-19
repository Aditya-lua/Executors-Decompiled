.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/zzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwo;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/vision/barcode/internal/zzl;

.field public final synthetic zzb:J

.field public final synthetic zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

.field public final synthetic zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

.field public final synthetic zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

.field public final synthetic zzf:Lcom/google/mlkit/vision/common/InputImage;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/vision/barcode/internal/zzl;JLcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;Lcom/google/mlkit/vision/common/InputImage;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zza:Lcom/google/mlkit/vision/barcode/internal/zzl;

    iput-wide p2, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzb:J

    iput-object p4, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    iput-object p5, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    iput-object p6, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    iput-object p7, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzf:Lcom/google/mlkit/vision/common/InputImage;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;
    .locals 7

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zza:Lcom/google/mlkit/vision/barcode/internal/zzl;

    iget-wide v1, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzb:J

    iget-object v3, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;

    iget-object v4, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    iget-object v5, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;

    iget-object v6, p0, Lcom/google/mlkit/vision/barcode/internal/zzj;->zzf:Lcom/google/mlkit/vision/common/InputImage;

    invoke-virtual/range {v0 .. v6}, Lcom/google/mlkit/vision/barcode/internal/zzl;->zzc(JLcom/google/android/gms/internal/mlkit_vision_barcode/zzrb;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcp;Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;

    move-result-object v0

    return-object v0
.end method
