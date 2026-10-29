.class public Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;
.super Lcom/google/mlkit/common/sdkinternal/MLTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/mlkit/common/sdkinternal/MLTask<",
        "Lcom/google/mlkit/vision/text/Text;",
        "Lcom/google/mlkit/vision/common/InputImage;",
        ">;"
    }
.end annotation


# static fields
.field private static final taskQueue:Lcom/google/mlkit/common/sdkinternal/TaskQueue;

.field static zza:Z = true

.field private static final zzb:Lcom/google/mlkit/vision/common/internal/ImageUtils;


# instance fields
.field private final zzc:Lcom/google/mlkit/vision/text/internal/zzm;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

.field private final zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getInstance()Lcom/google/mlkit/vision/common/internal/ImageUtils;

    move-result-object v0

    sput-object v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzb:Lcom/google/mlkit/vision/common/internal/ImageUtils;

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/TaskQueue;

    invoke-direct {v0}, Lcom/google/mlkit/common/sdkinternal/TaskQueue;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->taskQueue:Lcom/google/mlkit/common/sdkinternal/TaskQueue;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/mlkit/vision/text/internal/zzm;Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/vision/text/internal/zzm;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    invoke-interface {p3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->taskQueue:Lcom/google/mlkit/common/sdkinternal/TaskQueue;

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/mlkit/common/sdkinternal/TaskQueue;

    invoke-direct {v0}, Lcom/google/mlkit/common/sdkinternal/TaskQueue;-><init>()V

    :goto_1
    invoke-direct {p0, v0}, Lcom/google/mlkit/common/sdkinternal/MLTask;-><init>(Lcom/google/mlkit/common/sdkinternal/TaskQueue;)V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    iput-object p2, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzc:Lcom/google/mlkit/vision/text/internal/zzm;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getInstance()Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    iput-object p3, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    return-void
.end method

.method private final zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLcom/google/mlkit/vision/common/InputImage;)V
    .locals 12

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v2, v0, p2

    new-instance v0, Lcom/google/mlkit/vision/text/internal/zzq;

    move-object v1, p0

    move-object v4, p1

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/vision/text/internal/zzq;-><init>(Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;JLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;Lcom/google/mlkit/vision/common/InputImage;)V

    iget-object v4, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzf:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    invoke-virtual {v4, v0, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    sget-boolean v4, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zza:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzb(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-direct {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v5}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result v5

    invoke-static {v5}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeq;->zzd()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;

    move-result-object v5

    new-instance v8, Lcom/google/mlkit/vision/text/internal/zzr;

    invoke-direct {v8, p0}, Lcom/google/mlkit/vision/text/internal/zzr;-><init>(Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;)V

    sget-object v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;->zzbi:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    move-wide v6, v2

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;

    iget-object v3, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzua;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/Object;JLcom/google/mlkit/vision/text/internal/zzr;)V

    move-object v4, v2

    move-wide v2, v6

    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long v2, v10, v2

    iget-object v5, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingEventId()I

    move-result v6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza()I

    move-result v7

    move-wide v8, v2

    invoke-virtual/range {v5 .. v11}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzue;->zzc(IIJJ)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized load()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzc:Lcom/google/mlkit/vision/text/internal/zzm;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/internal/zzm;->zzb()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized release()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    sput-boolean v0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zza:Z

    iget-object v0, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzc:Lcom/google/mlkit/vision/text/internal/zzm;

    invoke-interface {v0}, Lcom/google/mlkit/vision/text/internal/zzm;->zzc()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final bridge synthetic run(Lcom/google/mlkit/common/sdkinternal/MLTaskInput;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/google/mlkit/common/sdkinternal/MLTaskInput;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    check-cast p1, Lcom/google/mlkit/vision/common/InputImage;

    invoke-virtual {p0, p1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zze(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/mlkit/vision/text/Text;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzc(JLcom/google/android/gms/internal/mlkit_vision_text_common/zzou;Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzc(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    sget-boolean p1, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zza:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zze(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zza(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzb(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoh;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoj;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    sget-object p1, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzb:Lcom/google/mlkit/vision/common/internal/ImageUtils;

    invoke-virtual {p1, p4}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getMobileVisionImageFormat(Lcom/google/mlkit/vision/common/InputImage;)I

    move-result p2

    invoke-virtual {p1, p4}, Lcom/google/mlkit/vision/common/internal/ImageUtils;->getMobileVisionImageSize(Lcom/google/mlkit/vision/common/InputImage;)I

    move-result p1

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;-><init>()V

    const/4 p4, -0x1

    if-eq p2, p4, :cond_4

    const/16 p4, 0x23

    if-eq p2, p4, :cond_3

    const p4, 0x32315659

    if-eq p2, p4, :cond_2

    const/16 p4, 0x10

    if-eq p2, p4, :cond_1

    const/16 p4, 0x11

    if-eq p2, p4, :cond_0

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    goto :goto_0

    :cond_2
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzd:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    goto :goto_0

    :cond_3
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    goto :goto_0

    :cond_4
    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;->zzg:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;

    :goto_0
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzob;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zzb(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzoa;->zzd()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzod;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-direct {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;-><init>()V

    iget-object p2, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {p2}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getLoggingLanguageOption()I

    move-result p2

    invoke-static {p2}, Lcom/google/mlkit/vision/text/internal/LoggingUtils;->zza(I)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsb;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsa;->zzc()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsd;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrx;->zzf()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    iget-object p3, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {p3}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result p3

    if-eqz p3, :cond_5

    sget-object p3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    goto :goto_1

    :cond_5
    sget-object p3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    :goto_1
    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzrz;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-static {p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;ILcom/google/android/gms/internal/mlkit_vision_text_common/zznw;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;-><init>()V

    iget-object v1, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf:Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;

    invoke-interface {v1}, Lcom/google/mlkit/vision/text/TextRecognizerOptionsInterface;->getIsThickClient()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzc:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;

    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzot;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;

    invoke-direct {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;-><init>()V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;->zza(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzes;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zznw;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzep;->zze()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeu;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;->zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzeu;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuf;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzow;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized zze(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/mlkit/vision/text/Text;
    .locals 5
    .param p1    # Lcom/google/mlkit/vision/common/InputImage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzc:Lcom/google/mlkit/vision/text/internal/zzm;

    invoke-interface {v2, p1}, Lcom/google/mlkit/vision/text/internal/zzm;->zza(Lcom/google/mlkit/vision/common/InputImage;)Lcom/google/mlkit/vision/text/Text;

    move-result-object v2

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    invoke-direct {p0, v3, v0, v1, p1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLcom/google/mlkit/vision/common/InputImage;)V

    const/4 v3, 0x0

    sput-boolean v3, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zza:Z
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Lcom/google/mlkit/common/MlKitException;->getErrorCode()I

    move-result v3

    const/16 v4, 0xe

    if-ne v3, v4, :cond_0

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzk:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;->zzab:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;

    :goto_0
    invoke-direct {p0, v3, v0, v1, p1}, Lcom/google/mlkit/vision/text/internal/TextRecognizerTaskWithResource;->zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzou;JLcom/google/mlkit/vision/common/InputImage;)V

    throw v2

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
