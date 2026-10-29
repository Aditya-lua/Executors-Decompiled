.class public Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT_OPTIONS:Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field final zza:Ljava/util/concurrent/atomic/AtomicReference;

.field private final zzb:Ljava/util/concurrent/Executor;

.field private final zzc:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions$Builder;

    invoke-direct {v0}, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions$Builder;->build()Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->DEFAULT_OPTIONS:Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzb:Ljava/util/concurrent/Executor;

    const-string p1, "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile"

    iput-object p1, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;

    iget-object v0, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzb:Ljava/util/concurrent/Executor;

    iget-object p1, p1, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzb:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getConfigLabel()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final getExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzb:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final getIsThickClient()Z
    .locals 2

    iget-object v0, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zza:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "com.google.mlkit.dynamite.text.latin"

    invoke-static {v0, v1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerOptionsUtils;->isThickClient(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final getLanguageHint()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "en"

    return-object v0
.end method

.method public final getLoggingEventId()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->getIsThickClient()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x5efd

    return v0

    :cond_0
    const/16 v0, 0x5ef2

    return v0
.end method

.method public final getLoggingLanguageOption()I
    .locals 1
    .annotation build Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface$LanguageOption;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public final getLoggingLibraryName()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->getIsThickClient()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "play-services-mlkit-text-recognition"

    return-object v0

    :cond_0
    const-string v0, "text-recognition"

    return-object v0
.end method

.method public final getLoggingLibraryNameForOptionalModule()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "optional-module-text-latin"

    return-object v0
.end method

.method public final getModuleId()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->getIsThickClient()Z

    move-result v1

    if-eq v0, v1, :cond_0

    const-string v0, "com.google.android.gms.vision.ocr"

    return-object v0

    :cond_0
    const-string v0, "com.google.mlkit.dynamite.text.latin"

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/text/latin/TextRecognizerOptions;->zzb:Ljava/util/concurrent/Executor;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
