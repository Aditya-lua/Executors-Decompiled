.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

.field public final synthetic zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

.field public final synthetic zzc:Lcom/google/mlkit/vision/barcode/internal/zzk;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/mlkit/vision/barcode/internal/zzk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zzc:Lcom/google/mlkit/vision/barcode/internal/zzk;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwk;->zzc:Lcom/google/mlkit/vision/barcode/internal/zzk;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/mlkit/vision/barcode/internal/zzk;)V

    return-void
.end method
