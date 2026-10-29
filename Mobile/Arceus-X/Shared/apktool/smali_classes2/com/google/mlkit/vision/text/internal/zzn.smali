.class public final Lcom/google/mlkit/vision/text/internal/zzn;
.super Lcom/google/mlkit/vision/common/internal/MobileVisionBase;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/text/TextRecognizer;


# instance fields
.field private final zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;


# direct methods
.method public constructor <init>(Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)V
    .locals 1
    .param p1    # Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;-><init>(Lcom/google/mlkit/common/sdkinternal/MLTask;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lcom/google/mlkit/vision/text/internal/zzn;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    invoke-interface {p4}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    invoke-interface {p4}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result p4

    invoke-static {p4}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzg(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    return-void
.end method


# virtual methods
.method public final getDetectorType()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final getOptionalFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzn;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-static {v0}, Lcom/google/mlkit/vision/text/internal/TextOptionalModuleUtils;->zza(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)[Lcom/google/android/gms/common/Feature;

    move-result-object v0

    return-object v0
.end method

.method public final process(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;
    .locals 0
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
            "Lcom/google/mlkit/vision/text/Text;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->processBase(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/tasks/Task;

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
            "Lcom/google/mlkit/vision/text/Text;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/google/mlkit/vision/common/internal/MobileVisionBase;->processBase(Lod/a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
