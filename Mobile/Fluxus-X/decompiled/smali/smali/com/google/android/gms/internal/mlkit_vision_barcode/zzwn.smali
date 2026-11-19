.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

.field public final synthetic zzc:Ljava/lang/Object;

.field public final synthetic zzd:J

.field public final synthetic zze:Lcom/google/mlkit/vision/barcode/internal/zzk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Ljava/lang/Object;JLcom/google/mlkit/vision/barcode/internal/zzk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzc:Ljava/lang/Object;

    iput-wide p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzd:J

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zze:Lcom/google/mlkit/vision/barcode/internal/zzk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzc:Ljava/lang/Object;

    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zzd:J

    iget-object v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwn;->zze:Lcom/google/mlkit/vision/barcode/internal/zzk;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Ljava/lang/Object;JLcom/google/mlkit/vision/barcode/internal/zzk;)V

    return-void
.end method
