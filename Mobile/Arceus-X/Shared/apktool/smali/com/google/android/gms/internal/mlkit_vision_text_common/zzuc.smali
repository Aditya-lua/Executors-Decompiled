.class public final Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;


# instance fields
.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzts;

.field private final zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

.field private final zzg:Lcom/google/android/gms/tasks/Task;

.field private final zzh:Lcom/google/android/gms/tasks/Task;

.field private final zzi:Ljava/lang/String;

.field private final zzj:I

.field private final zzk:Ljava/util/Map;

.field private final zzl:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzts;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzc:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzd:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzts;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuo;->zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuo;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzty;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzty;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztz;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztz;-><init>(Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzh:Lcom/google/android/gms/tasks/Task;

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzb:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbm;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzj:I

    return-void
.end method

.method public static zza(Ljava/util/List;D)J
    .locals 4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr p1, v2

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private static declared-synchronized zzi()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Lu2/f;->a(Landroid/content/res/Configuration;)Lu2/j;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lu2/j;->f()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lu2/j;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->languageTagFromLocale(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbh;->zzb()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private final zzj()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzi:Ljava/lang/String;

    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final zzk(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;JJ)Z
    .locals 2

    iget-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    const/4 p5, 0x1

    if-nez p4, :cond_0

    return p5

    :cond_0
    iget-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk:Ljava/util/Map;

    invoke-interface {p4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sub-long/2addr p2, v0

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x1e

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    cmp-long p1, p2, v0

    if-lez p1, :cond_1

    return p5

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzi:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;->zzb(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;->zzd()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzi()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbk;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzg(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-virtual {p2}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getMlSdkInstanceId()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    iget p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzj:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;->zzk(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;->zzc(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsr;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zze:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzts;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzts;->zza(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;)V

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzj()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V

    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztw;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztw;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;)V
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;JJ)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzub;->zza()Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzj()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic zzg(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Lcom/google/mlkit/vision/text/internal/zzr;)V
    .locals 11

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbp;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcc;->zzo()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbp;->zzc(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    invoke-direct {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v6, v6, 0x1

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    add-long/2addr v7, v9

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    int-to-long v5, v5

    div-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zza(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza(Ljava/util/List;D)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zzc(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    const-wide v5, 0x4052c00000000000L    # 75.0

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza(Ljava/util/List;D)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zzf(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    const-wide/high16 v5, 0x4049000000000000L    # 50.0

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza(Ljava/util/List;D)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zzd(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    const-wide/high16 v5, 0x4039000000000000L    # 25.0

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza(Ljava/util/List;D)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    const-wide/16 v5, 0x0

    invoke-static {v3, v5, v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zza(Ljava/util/List;D)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zze(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zznu;->zzg()Lcom/google/android/gms/internal/mlkit_vision_text_common/zznw;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p2, v2, v3, v4}, Lcom/google/mlkit/vision/text/internal/zzr;->zza(Ljava/lang/Object;ILcom/google/android/gms/internal/mlkit_vision_text_common/zznw;)Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzj()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, p1, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zze(Lcom/google/android/gms/internal/mlkit_vision_text_common/zztr;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Ljava/lang/Object;JLcom/google/mlkit/vision/text/internal/zzr;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzao;->zzp()Lcom/google/android/gms/internal/mlkit_vision_text_common/zzao;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzl:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzbp;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-interface {v0, p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzcc;->zzm(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    const-wide/16 v5, 0x1e

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;JJ)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, v1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;->zzk:Ljava/util/Map;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztx;

    invoke-direct {p2, p0, v2, p5}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zztx;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzuc;Lcom/google/android/gms/internal/mlkit_vision_text_common/zzov;Lcom/google/mlkit/vision/text/internal/zzr;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
