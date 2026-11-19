.class public final Lcom/google/mlkit/vision/text/internal/zzo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/mlkit/vision/text/internal/zzp;

.field private final zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;


# direct methods
.method public constructor <init>(Lcom/google/mlkit/vision/text/internal/zzp;Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;)V
    .locals 0
    .param p1    # Lcom/google/mlkit/vision/text/internal/zzp;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/zzo;->zza:Lcom/google/mlkit/vision/text/internal/zzp;

    iput-object p2, p0, Lcom/google/mlkit/vision/text/internal/zzo;->zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)Lcom/google/mlkit/vision/text/TextRecognizer;
    .locals 4
    .param p1    # Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzo;->zza:Lcom/google/mlkit/vision/text/internal/zzp;

    new-instance v1, Lcom/google/mlkit/vision/text/internal/zzn;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;

    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzo;->zzb:Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-interface {p1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;->getExecutorToUse(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzun;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3, p1}, Lcom/google/mlkit/vision/text/internal/zzn;-><init>(Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)V

    return-object v1
.end method
