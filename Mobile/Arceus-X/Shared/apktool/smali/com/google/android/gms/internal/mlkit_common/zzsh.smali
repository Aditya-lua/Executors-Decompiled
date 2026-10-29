.class public final Lcom/google/android/gms/internal/mlkit_common/zzsh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/mlkit_common/zzaf;

.field private static final zzb:Lcom/google/android/gms/internal/mlkit_common/zzai;


# instance fields
.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/mlkit_common/zzrz;

.field private final zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

.field private final zzg:Lcom/google/android/gms/tasks/Task;

.field private final zzh:Lcom/google/android/gms/tasks/Task;

.field private final zzi:Ljava/lang/String;

.field private final zzj:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzai;->zzc(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzai;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzai;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_common/zzrz;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzc:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzd:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zze:Lcom/google/android/gms/internal/mlkit_common/zzrz;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsv;->zza()Lcom/google/android/gms/internal/mlkit_common/zzsv;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzi:Ljava/lang/String;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzse;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_common/zzse;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzsh;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object p3

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzsf;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/mlkit_common/zzsf;-><init>(Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;)V

    invoke-virtual {p3, v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->scheduleCallable(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzh:Lcom/google/android/gms/tasks/Task;

    sget-object p2, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzai;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_common/zzai;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/mlkit_common/zzai;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzj:I

    return-void
.end method

.method private static declared-synchronized zzh()Lcom/google/android/gms/internal/mlkit_common/zzaf;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/android/gms/internal/mlkit_common/zzsh;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzaf;
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

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzac;

    invoke-direct {v2}, Lcom/google/android/gms/internal/mlkit_common/zzac;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1}, Lu2/j;->f()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v1, v3}, Lu2/j;->c(I)Ljava/util/Locale;

    move-result-object v4

    invoke-static {v4}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->languageTagFromLocale(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/mlkit_common/zzac;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzac;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_common/zzac;->zzc()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zza:Lcom/google/android/gms/internal/mlkit_common/zzaf;
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

.method private final zzi(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_common/zzqt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_common/zzqt;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzh()Lcom/google/android/gms/internal/mlkit_common/zzaf;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzh(Lcom/google/android/gms/internal/mlkit_common/zzaf;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzg(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzh:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getMlSdkInstanceId()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzi(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    const/16 p1, 0xa

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzd(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    iget p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzj:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_common/zzqt;->zzk(Ljava/lang/Integer;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    return-object v0
.end method

.method private final zzj()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzg:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzi:Ljava/lang/String;

    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/String;
    .locals 2

    invoke-static {}, Ln9/j;->a()Ln9/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzi:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ln9/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;Ljava/lang/String;)V
    .locals 0

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zza(Lcom/google/android/gms/internal/mlkit_common/zzmv;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zzd()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzi(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zzc(Lcom/google/android/gms/internal/mlkit_common/zzqt;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zze:Lcom/google/android/gms/internal/mlkit_common/zzrz;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/mlkit_common/zzrz;->zza(Lcom/google/android/gms/internal/mlkit_common/zzry;)V

    return-void
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzsj;Lcom/google/mlkit/common/model/RemoteModel;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmv;->zzaW:Lcom/google/android/gms/internal/mlkit_common/zzmv;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zza(Lcom/google/android/gms/internal/mlkit_common/zzmv;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_common/zzsj;->zze()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzj()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzi(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzqt;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zzc(Lcom/google/android/gms/internal/mlkit_common/zzqt;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-static {p3, v0, p2}, Lcom/google/android/gms/internal/mlkit_common/zzst;->zza(Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_common/zzsj;)Lcom/google/android/gms/internal/mlkit_common/zznc;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/mlkit_common/zzry;->zzb(Lcom/google/android/gms/internal/mlkit_common/zznc;)Lcom/google/android/gms/internal/mlkit_common/zzry;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zze:Lcom/google/android/gms/internal/mlkit_common/zzrz;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/mlkit_common/zzrz;->zza(Lcom/google/android/gms/internal/mlkit_common/zzry;)V

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;)V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzj()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_common/zzsd;

    invoke-direct {v2, p0, p1, p2, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsd;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzsh;Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzmv;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;ZI)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsj;->zzh()Lcom/google/android/gms/internal/mlkit_common/zzsi;

    move-result-object p3

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzf(Z)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {p2}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzd(Lcom/google/mlkit/common/sdkinternal/ModelType;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzna;

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zza(Lcom/google/android/gms/internal/mlkit_common/zzna;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    sget-object v0, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zzo:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzmu;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzc(I)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzh()Lcom/google/android/gms/internal/mlkit_common/zzsj;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzg(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzsj;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsj;->zzh()Lcom/google/android/gms/internal/mlkit_common/zzsi;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzf(Z)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {v0, p5}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzd(Lcom/google/mlkit/common/sdkinternal/ModelType;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzb(Lcom/google/android/gms/internal/mlkit_common/zzmu;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {v0, p6}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zza(Lcom/google/android/gms/internal/mlkit_common/zzna;)Lcom/google/android/gms/internal/mlkit_common/zzsi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzsi;->zzh()Lcom/google/android/gms/internal/mlkit_common/zzsj;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzg(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzsj;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzsj;)V
    .locals 2

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->workerThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/mlkit_common/zzsg;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/google/android/gms/internal/mlkit_common/zzsg;-><init>(Lcom/google/android/gms/internal/mlkit_common/zzsh;Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/android/gms/internal/mlkit_common/zzsj;Lcom/google/mlkit/common/model/RemoteModel;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
