.class public Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:I

.field private zzb:Z

.field private zzc:Ljava/util/concurrent/Executor;

.field private zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zza:I

    return-void
.end method


# virtual methods
.method public build()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    iget v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zza:I

    iget-boolean v2, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzb:Z

    iget-object v3, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzc:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;-><init>(IZLjava/util/concurrent/Executor;Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;Lcom/google/mlkit/vision/barcode/zza;)V

    return-object v0
.end method

.method public enableAllPotentialBarcodes()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzb:Z

    return-object p0
.end method

.method public varargs setBarcodeFormats(I[I)Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$BarcodeFormat;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation

        .annotation build Lcom/google/mlkit/vision/barcode/common/Barcode$BarcodeFormat;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput p1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zza:I

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_0

    aget v0, p2, p1

    iget v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zza:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zza:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setExecutor(Ljava/util/concurrent/Executor;)Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzc:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public setZoomSuggestionOptions(Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
    .locals 0
    .param p1    # Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    return-object p0
.end method
