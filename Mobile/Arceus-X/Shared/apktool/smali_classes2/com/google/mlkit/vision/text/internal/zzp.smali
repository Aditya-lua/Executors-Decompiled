.class public final Lcom/google/mlkit/vision/text/internal/zzp;
.super Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/mlkit/common/sdkinternal/MlKitContext;


# direct methods
.method public constructor <init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/LazyInstanceMap;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/zzp;->zza:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    return-void
.end method


# virtual methods
.method public final bridge synthetic create(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {p1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzun;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/mlkit/vision/text/internal/zzp;->zza:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    new-instance v2, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lj9/d;->f()Lj9/d;

    move-result-object v3

    invoke-virtual {v3, v1}, Lj9/d;->a(Landroid/content/Context;)I

    move-result v3

    const v4, 0xc337960

    if-ge v3, v4, :cond_1

    invoke-interface {p1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/google/mlkit/vision/text/internal/zze;

    invoke-direct {v3, v1}, Lcom/google/mlkit/vision/text/internal/zze;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Lcom/google/mlkit/vision/text/internal/zzd;

    invoke-direct {v3, v1, p1, v0}, Lcom/google/mlkit/vision/text/internal/zzd;-><init>(Landroid/content/Context;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;)V

    :goto_1
    invoke-direct {v2, v0, v3, p1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/mlkit/vision/text/internal/zzm;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)V

    return-object v2
.end method
