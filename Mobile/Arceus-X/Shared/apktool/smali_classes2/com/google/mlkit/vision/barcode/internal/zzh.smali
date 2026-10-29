.class public final Lcom/google/mlkit/vision/barcode/internal/zzh;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/barcode/BarcodeScanner;


# static fields
.field public static final synthetic zzc:I

.field private static final zzd:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;


# instance fields
.field final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

.field private final zze:Z

.field private final zzf:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

.field private zzg:I

.field private zzh:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;

    invoke-direct {v0}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;->build()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzd:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    return-void
.end method

.method public constructor <init>(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;Lcom/google/mlkit/vision/barcode/internal/zzl;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V
    .locals 3
    .param p1    # Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/vision/barcode/internal/zzl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzb()Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p5, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p5}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p5

    invoke-static {v1, p5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    move-result-object p5

    new-instance v1, Lcom/google/mlkit/vision/barcode/internal/zze;

    invoke-direct {v1, v0}, Lcom/google/mlkit/vision/barcode/internal/zze;-><init>(Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;)V

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeu;->zza()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p5, v1, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo(Lcom/google/mlkit/vision/barcode/internal/zze;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;->zza()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;->zza()F

    move-result v0

    invoke-virtual {p5, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzk(F)V

    :cond_1
    invoke-virtual {p5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm()V

    :goto_0
    invoke-direct {p0, p2, p3}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(Lcom/google/mlkit/common/sdkinternal/MLTask;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzf:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    invoke-static {}, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzf()Z

    move-result p2

    iput-boolean p2, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zze:Z

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrp;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrp;-><init>()V

    invoke-static {p1}, Lcom/google/mlkit/vision/barcode/internal/zzb;->zzc(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrp;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvz;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrp;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrp;->zzj()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrr;

    move-result-object p1

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;-><init>()V

    if-eqz p2, :cond_2

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzra;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzra;

    goto :goto_1

    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzra;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzra;

    :goto_1
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzra;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrr;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    const/4 p1, 0x1

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    invoke-virtual {p4, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)V

    iput-object p5, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    return-void
.end method

.method public static bridge synthetic zze()Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;
    .locals 1

    sget-object v0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzd:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    return-object v0
.end method

.method private final zzf(Lcom/google/android/gms/tasks/Task;II)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/zzf;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/mlkit/vision/barcode/internal/zzf;-><init>(Lcom/google/mlkit/vision/barcode/internal/zzh;II)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->o(Lsb/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzh:Z

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn(Z)V

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getDetectorType()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 3

    iget-boolean v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zze:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->EMPTY_FEATURES:[Lcom/google/android/gms/common/Feature;

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    const/4 v1, 0x0

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->FEATURE_BARCODE:Lcom/google/android/gms/common/Feature;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final process(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/mlkit/vision/common/InputImage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/mlkit/vision/common/InputImage;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;>;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->processBase(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzf(Lcom/google/android/gms/tasks/Task;II)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final process(Lod/a;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .param p1    # Lod/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/google/mlkit/vision/barcode/common/Barcode;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->processBase(Lod/a;)Lcom/google/android/gms/tasks/Task;

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic zzd(IILjava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 9

    iget-object v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    if-nez v0, :cond_0

    invoke-static {p3}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzg:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzg:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/mlkit/vision/barcode/common/Barcode;

    invoke-virtual {v4}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getFormat()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/mlkit/vision/barcode/common/Barcode;

    invoke-virtual {v5}, Lcom/google/mlkit/vision/barcode/common/Barcode;->getCornerPoints()[Landroid/graphics/Point;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    iget v7, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzg:I

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v8, 0x0

    invoke-static {v5, p1, p2, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzg(Ljava/lang/Iterable;IIF)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

    move-result-object v5

    invoke-virtual {v6, v7, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzh:Z

    :cond_5
    iget-object p1, p0, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzf:Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;->zzd()Z

    move-result p1

    if-eq v1, p1, :cond_6

    move-object p3, v0

    :cond_6
    invoke-static {p3}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
