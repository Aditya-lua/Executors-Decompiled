.class public final Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

.field private static final zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzr;


# instance fields
.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;

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

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzr;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzr;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzr;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzk:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzl:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzc:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzd:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zze:Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;->zza()Lcom/google/android/gms/internal/mlkit_vision_common/zzmw;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmg;-><init>(Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmh;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmh;-><init>(Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzh:Lcom/google/android/gms/tasks/Task;

    sget-object p2, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzr;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_common/zzr;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_vision_common/zzr;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzj:I

    return-void
.end method

.method private static declared-synchronized zzd()Lcom/google/android/gms/internal/mlkit_vision_common/zzp;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzp;
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

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_common/zzm;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzm;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lu2/j;->f()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lu2/j;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->languageTagFromLocale(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/mlkit_vision_common/zzm;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_common/zzm;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzm;->zzc()Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzp;
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


# virtual methods
.method public final synthetic zza()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzi:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;Lcom/google/android/gms/internal/mlkit_vision_common/zziv;Ljava/lang/String;)V
    .locals 2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;->zza(Lcom/google/android/gms/internal/mlkit_vision_common/zziv;)Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;->zzc()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzd()Lcom/google/android/gms/internal/mlkit_vision_common/zzp;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzh(Lcom/google/android/gms/internal/mlkit_vision_common/zzp;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzg(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-virtual {p2}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getMlSdkInstanceId()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    const/16 p2, 0xa

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    iget p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzj:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_common/zzky;->zzk(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzky;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;->zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzky;)Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zze:Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;->zza(Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;)V

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;Lcom/google/android/gms/internal/mlkit_vision_common/zziv;)V
    .locals 9

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzk:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzk:Ljava/util/Map;

    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, v0, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1e

    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_1

    return-void

    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzk:Ljava/util/Map;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zza:I

    iget v1, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zzb:I

    iget v2, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zzc:I

    iget v3, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zzd:I

    iget v4, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zze:I

    iget-wide v5, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zzf:J

    iget p1, p1, Lcom/google/android/gms/internal/mlkit_vision_common/zzmt;->zzg:I

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-direct {v7}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;-><init>()V

    const/4 v8, -0x1

    if-eq v0, v8, :cond_6

    const/16 v8, 0x23

    if-eq v0, v8, :cond_5

    const v8, 0x32315659

    if-eq v0, v8, :cond_4

    const/16 v8, 0x10

    if-eq v0, v8, :cond_3

    const/16 v8, 0x11

    if-eq v0, v8, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    goto :goto_1

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zze:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    goto :goto_1

    :cond_6
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzii;->zzg:Lcom/google/android/gms/internal/mlkit_vision_common/zzii;

    :goto_1
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzd(Lcom/google/android/gms/internal/mlkit_vision_common/zzii;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    const/4 v0, 0x1

    if-eq v1, v0, :cond_a

    const/4 v0, 0x2

    if-eq v1, v0, :cond_9

    const/4 v0, 0x3

    if-eq v1, v0, :cond_8

    const/4 v0, 0x4

    if-eq v1, v0, :cond_7

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzio;->zzf:Lcom/google/android/gms/internal/mlkit_vision_common/zzio;

    goto :goto_2

    :cond_7
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzio;->zze:Lcom/google/android/gms/internal/mlkit_vision_common/zzio;

    goto :goto_2

    :cond_8
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzio;->zzd:Lcom/google/android/gms/internal/mlkit_vision_common/zzio;

    goto :goto_2

    :cond_9
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzio;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzio;

    goto :goto_2

    :cond_a
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzio;->zzb:Lcom/google/android/gms/internal/mlkit_vision_common/zzio;

    :goto_2
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzf(Lcom/google/android/gms/internal/mlkit_vision_common/zzio;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzc(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zze(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzg(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v7, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzh(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_vision_common/zzin;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_common/zzin;->zzj()Lcom/google/android/gms/internal/mlkit_vision_common/zziq;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zziw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zziw;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zziw;->zzd(Lcom/google/android/gms/internal/mlkit_vision_common/zziq;)Lcom/google/android/gms/internal/mlkit_vision_common/zziw;

    invoke-static {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmk;->zze(Lcom/google/android/gms/internal/mlkit_vision_common/zziw;)Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_b
    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;->zzi:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;

    invoke-direct {v2, p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmi;-><init>(Lcom/google/android/gms/internal/mlkit_vision_common/zzmj;Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;Lcom/google/android/gms/internal/mlkit_vision_common/zziv;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
