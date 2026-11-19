.class public final Lcom/google/mlkit/vision/barcode/internal/zzg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/mlkit/vision/barcode/internal/zzi;

.field private final zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

.field private final zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;


# direct methods
.method public constructor <init>(Lcom/google/mlkit/vision/barcode/internal/zzi;Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zza:Lcom/google/mlkit/vision/barcode/internal/zzi;

    iput-object p2, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    iput-object p3, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/mlkit/vision/barcode/internal/zzh;
    .locals 1

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/zzh;->zze()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/mlkit/vision/barcode/internal/zzg;->zzb(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/internal/zzh;

    move-result-object v0

    return-object v0
.end method

.method public final zzb(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/internal/zzh;
    .locals 7
    .param p1    # Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zza:Lcom/google/mlkit/vision/barcode/internal/zzi;

    new-instance v1, Lcom/google/mlkit/vision/barcode/internal/zzh;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/mlkit/vision/barcode/internal/zzl;

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;->getExecutorToUse(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxa;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    move-result-object v5

    iget-object v6, p0, Lcom/google/mlkit/vision/barcode/internal/zzg;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/mlkit/vision/barcode/internal/zzh;-><init>(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;Lcom/google/mlkit/vision/barcode/internal/zzl;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    return-object v1
.end method
