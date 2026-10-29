.class final Lcom/google/mlkit/vision/text/internal/zzd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/vision/text/internal/zzm;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

.field private zzc:Z

.field private zzd:Z

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

.field private zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    iput-object p3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    return-void
.end method

.method private static zzd(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;
    .locals 11

    instance-of v0, p0, Lcom/google/mlkit/vision/text/internal/zzc;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/google/mlkit/vision/text/internal/zzc;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/internal/zzc;->zza()Z

    move-result v0

    if-eqz v0, :cond_0

    move v10, v2

    goto :goto_0

    :cond_0
    move v10, v1

    :goto_0
    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    invoke-interface {p0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getConfigLabel()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryNameForOptionalModule()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/16 v2, 0x9

    goto :goto_1

    :pswitch_1
    const/16 v2, 0x8

    goto :goto_1

    :pswitch_2
    const/4 v2, 0x7

    goto :goto_1

    :pswitch_3
    const/4 v2, 0x6

    goto :goto_1

    :pswitch_4
    const/4 v2, 0x5

    goto :goto_1

    :pswitch_5
    const/4 v2, 0x4

    goto :goto_1

    :pswitch_6
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_7
    const/4 v2, 0x2

    :goto_1
    add-int/lit8 v8, v2, -0x1

    invoke-interface {p0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLanguageHint()Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x1

    move-object v6, p1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Z)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final zza(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/mlkit/vision/text/Text;
    .locals 10

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/vision/text/internal/zzd;->zzb()V

    :cond_0
    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    iget-boolean v1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzc:Z

    const/16 v2, 0xd

    if-nez v1, :cond_1

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zze()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzc:Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to init text recognizer "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_1
    :goto_0
    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getFormat()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getWidth()I

    move-result v5

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getHeight()I

    move-result v6

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getRotationDegrees()I

    move-result v1

    invoke-static {v1}, Lcom/google/mlkit/vision/common/internal/CommonConvertUtils;->convertToMVRotation(I)I

    move-result v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;-><init>(IIIIJ)V

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getInstance()Lcom/google/mlkit/vision/common/internal/ImageUtils;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getImageDataWrapper(Lcom/google/mlkit/vision/common/InputImage;)Ly9/a;

    move-result-object v1

    :try_start_1
    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zzd(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuq;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvf;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/vision/text/Text;

    invoke-virtual {p1}, Lcom/google/mlkit/vision/common/InputImage;->getCoordinatesMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/google/mlkit/vision/text/Text;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvf;Landroid/graphics/Matrix;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    :catch_1
    move-exception v0

    move-object p1, v0

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v3, "Failed to run text recognizer "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1
.end method

.method public final zzb()V
    .locals 7

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0xd

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    instance-of v3, v2, Lcom/google/mlkit/vision/text/internal/zzb;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v2, Lcom/google/mlkit/vision/text/internal/zzb;

    invoke-interface {v2}, Lcom/google/mlkit/vision/text/internal/zzb;->zza()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_2

    :catch_1
    move-exception v2

    goto/16 :goto_3

    :cond_1
    move-object v2, v4

    :goto_0
    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v5}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v5
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "DecoupledTextDelegate"

    if-eqz v5, :cond_2

    :try_start_1
    const-string v3, "Start loading thick OCR module."

    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->c:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v5}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getModuleId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v4, "com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzux;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;

    move-result-object v3

    iget-object v4, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    invoke-static {v4}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v4

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-static {v5, v2}, Lcom/google/mlkit/vision/text/internal/zzd;->zzd(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;->zze(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    move-result-object v2

    goto :goto_1

    :cond_2
    if-eqz v3, :cond_3

    const-string v3, "Start loading custom OCR module."

    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    sget-object v5, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    iget-object v6, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v6}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getModuleId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v5, "com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator"

    invoke-virtual {v3, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzut;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuu;

    move-result-object v3

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    invoke-static {v5}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v5

    iget-object v6, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-static {v6, v2}, Lcom/google/mlkit/vision/text/internal/zzd;->zzd(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    move-result-object v2

    invoke-interface {v3, v5, v4, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuu;->zzd(Ly9/a;Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    move-result-object v2

    goto :goto_1

    :cond_3
    const-string v3, "Start loading thin OCR module."

    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v5}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getModuleId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v3

    const-string v4, "com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"

    invoke-virtual {v3, v4}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzux;->zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;

    move-result-object v3

    iget-object v4, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v4}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result v4

    if-ne v4, v1, :cond_4

    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    invoke-static {v2}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;->zzd(Ly9/a;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    move-result-object v2

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    invoke-static {v4}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v4

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-static {v5, v2}, Lcom/google/mlkit/vision/text/internal/zzd;->zzd(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuy;->zze(Ly9/a;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvh;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v3

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-static {v2, v3, v4}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_2
    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v3

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzC:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-static {v2, v3, v4}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v2}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/mlkit/common/MlKitException;

    const-string v4, "Failed to create text recognizer "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v3

    :goto_3
    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iget-object v4, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v4}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v4

    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzB:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-static {v3, v4, v5}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;ZLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)V

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v3

    if-nez v3, :cond_6

    iget-boolean v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzd:Z

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zza:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-static {v2}, Lcom/google/mlkit/vision/text/internal/TextOptionalModuleUtils;->zza(Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)[Lcom/google/android/gms/common/Feature;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/mlkit/common/sdkinternal/OptionalModuleUtils;->requestDownload(Landroid/content/Context;[Lcom/google/android/gms/common/Feature;)V

    iput-boolean v1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzd:Z

    :goto_4
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Waiting for the text optional module to be downloaded. Please wait."

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_6
    iget-object v1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    new-instance v3, Lcom/google/mlkit/common/MlKitException;

    invoke-interface {v1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v1, v4}, [Ljava/lang/Object;

    move-result-object v1

    const-string v4, "Failed to load text module %s. %s"

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v0, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v3
.end method

.method public final zzc()V
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;->zzf()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzb:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLibraryName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to release text recognizer "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DecoupledTextDelegate"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuv;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/vision/text/internal/zzd;->zzc:Z

    return-void
.end method
