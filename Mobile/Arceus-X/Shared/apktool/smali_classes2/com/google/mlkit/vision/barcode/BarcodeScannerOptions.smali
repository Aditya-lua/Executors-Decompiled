.class public Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;
    }
.end annotation


# instance fields
.field private final zza:I

.field private final zzb:Z

.field private final zzc:Ljava/util/concurrent/Executor;

.field private final zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;


# direct methods
.method public synthetic constructor <init>(IZLjava/util/concurrent/Executor;Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;Lcom/google/mlkit/vision/barcode/zza;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza:I

    iput-boolean p2, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb:Z

    iput-object p3, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    iget v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza:I

    iget v3, p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza:I

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb:Z

    iget-boolean v3, p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc:Ljava/util/concurrent/Executor;

    iget-object v3, p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc:Ljava/util/concurrent/Executor;

    invoke-static {v1, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    iget-object p1, p1, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zza:I

    return v0
.end method

.method public final zzb()Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    return-object v0
.end method

.method public final zzc()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzc:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final zzd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb:Z

    return v0
.end method
