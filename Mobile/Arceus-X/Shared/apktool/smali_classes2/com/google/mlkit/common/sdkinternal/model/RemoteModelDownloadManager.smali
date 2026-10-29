.class public Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ln9/g;

.field private static final zzb:Ljava/util/Map;


# instance fields
.field private final zzc:Landroid/util/LongSparseArray;

.field private final zzd:Landroid/util/LongSparseArray;

.field private final zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

.field private final zzf:Landroid/app/DownloadManager;

.field private final zzg:Lcom/google/mlkit/common/model/RemoteModel;

.field private final zzh:Lcom/google/mlkit/common/sdkinternal/ModelType;

.field private final zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

.field private final zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

.field private final zzk:Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

.field private final zzl:Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

.field private final zzm:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

.field private zzn:Lcom/google/mlkit/common/model/DownloadConditions;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln9/g;

    const-string v1, "ModelDownloadManager"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ln9/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;Lcom/google/android/gms/internal/mlkit_common/zzsh;)V
    .locals 1
    .param p1    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/model/RemoteModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/google/android/gms/internal/mlkit_common/zzsh;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzc:Landroid/util/LongSparseArray;

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzd:Landroid/util/LongSparseArray;

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-virtual {p2}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v0

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzh:Lcom/google/mlkit/common/sdkinternal/ModelType;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "download"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/DownloadManager;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    iput-object p6, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    if-nez p2, :cond_0

    sget-object p2, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string p6, "ModelDownloadManager"

    const-string v0, "Download manager service is not available in the service."

    invoke-virtual {p2, p6, v0}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iput-object p3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk:Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-static {p1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iput-object p5, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzl:Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzm:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    return-void
.end method

.method public static declared-synchronized getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;)Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;
    .locals 10
    .param p0    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/mlkit/common/model/RemoteModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzb:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "common"

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-static {v2}, Lcom/google/android/gms/internal/mlkit_common/zzss;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsh;

    move-result-object v9

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v9}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;Lcom/google/android/gms/internal/mlkit_common/zzsh;)V

    invoke-interface {v0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    move-object v5, p1

    :goto_0
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic zza(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;)Landroid/util/LongSparseArray;
    .locals 0

    iget-object p0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzc:Landroid/util/LongSparseArray;

    return-object p0
.end method

.method public static bridge synthetic zzb(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;)Landroid/util/LongSparseArray;
    .locals 0

    iget-object p0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzd:Landroid/util/LongSparseArray;

    return-object p0
.end method

.method public static bridge synthetic zzc()Ln9/g;
    .locals 1

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    return-object v0
.end method

.method public static bridge synthetic zzd(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;Ljava/lang/Long;)Lcom/google/mlkit/common/MlKitException;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzl(Ljava/lang/Long;)Lcom/google/mlkit/common/MlKitException;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic zze(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;)Lcom/google/mlkit/common/model/RemoteModel;
    .locals 0

    iget-object p0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    return-object p0
.end method

.method public static bridge synthetic zzf(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;)Lcom/google/mlkit/common/sdkinternal/MlKitContext;
    .locals 0

    iget-object p0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    return-object p0
.end method

.method public static bridge synthetic zzh(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;)Lcom/google/android/gms/internal/mlkit_common/zzsh;
    .locals 0

    iget-object p0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    return-object p0
.end method

.method private final zzj(J)Lcom/google/android/gms/tasks/Task;
    .locals 7

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzm(J)Lcom/google/mlkit/common/sdkinternal/model/zzc;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.DOWNLOAD_COMPLETE"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getInstance()Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/mlkit/common/sdkinternal/MLTaskExecutor;->getHandler()Landroid/os/Handler;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ll2/b;->n(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk(J)Lsb/k;

    move-result-object p1

    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private final declared-synchronized zzk(J)Lsb/k;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzd:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsb/k;

    if-nez v0, :cond_0

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzd:Landroid/util/LongSparseArray;

    invoke-virtual {v1, p1, p2, v0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private final zzl(Ljava/lang/Long;)Lcom/google/mlkit/common/MlKitException;
    .locals 5

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/app/DownloadManager$Query;

    invoke-direct {v1}, Landroid/app/DownloadManager$Query;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const/4 p1, 0x1

    new-array p1, p1, [J

    const/4 v4, 0x0

    aput-wide v2, p1, v4

    invoke-virtual {v1, p1}, Landroid/app/DownloadManager$Query;->setFilterById([J)Landroid/app/DownloadManager$Query;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;

    move-result-object v1

    :cond_1
    :goto_0
    const/16 p1, 0xd

    const-string v0, "Model downloading failed"

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v0, "reason"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/16 v1, 0x3ee

    if-ne v0, v1, :cond_2

    const-string v0, "Model downloading failed due to insufficient space on the device."

    const/16 p1, 0x65

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Model downloading failed due to error code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " from Android DownloadManager"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
    :goto_1
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    invoke-direct {v1, v0, p1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method

.method private final declared-synchronized zzm(J)Lcom/google/mlkit/common/sdkinternal/model/zzc;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzc:Landroid/util/LongSparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/common/sdkinternal/model/zzc;

    if-nez v0, :cond_0

    new-instance v1, Lcom/google/mlkit/common/sdkinternal/model/zzc;

    invoke-direct {p0, p1, p2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk(J)Lsb/k;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v6, 0x0

    move-object v2, p0

    move-wide v3, p1

    :try_start_1
    invoke-direct/range {v1 .. v6}, Lcom/google/mlkit/common/sdkinternal/model/zzc;-><init>(Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;JLsb/k;Lcom/google/mlkit/common/sdkinternal/model/zzb;)V

    iget-object p1, v2, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzc:Landroid/util/LongSparseArray;

    invoke-virtual {p1, v3, v4, v1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p0

    goto :goto_0

    :cond_0
    move-object v2, p0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private final declared-synchronized zzn(Landroid/app/DownloadManager$Request;Lcom/google/mlkit/common/sdkinternal/ModelInfo;)Ljava/lang/Long;
    .locals 9
    .param p1    # Landroid/app/DownloadManager$Request;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/sdkinternal/ModelInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    invoke-virtual {v0, p1}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    move-result-wide v0

    sget-object p1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Schedule a new downloading task: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ModelDownloadManager"

    invoke-virtual {p1, v3, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-virtual {p1, v0, v1, p2}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->setDownloadingModelInfo(JLcom/google/mlkit/common/sdkinternal/ModelInfo;)V

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v3

    sget-object v5, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {p2}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v7

    sget-object v8, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzf:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v8}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private final declared-synchronized zzo(Lcom/google/mlkit/common/sdkinternal/ModelInfo;Lcom/google/mlkit/common/model/DownloadConditions;)Ljava/lang/Long;
    .locals 11
    .param p1    # Lcom/google/mlkit/common/sdkinternal/ModelInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/model/DownloadConditions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "DownloadConditions can not be null"

    invoke-static {p2, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getDownloadingModelHash(Lcom/google/mlkit/common/model/RemoteModel;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelHash()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v0, 0x8

    if-eq p2, v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x10

    if-eq p1, p2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v1

    sget-object v3, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {v2}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzg:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    :cond_1
    sget-object p1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string p2, "ModelDownloadManager"

    const-string v0, "New model is already in downloading, do nothing."

    invoke-virtual {p1, p2, v0}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_2
    :try_start_1
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v1, "ModelDownloadManager"

    const-string v2, "Need to download a new model."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    new-instance v1, Landroid/app/DownloadManager$Request;

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelUri()Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk:Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelNameForPersist()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;->modelExistsLocally(Ljava/lang/String;Lcom/google/mlkit/common/sdkinternal/ModelType;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "ModelDownloadManager"

    const-string v3, "Model update is enabled and have a previous downloaded model, use download condition"

    invoke-virtual {v0, v2, v3}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v6, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v5

    sget-object v7, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {p1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v9

    sget-object v10, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzk:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    :cond_3
    invoke-virtual {p2}, Lcom/google/mlkit/common/model/DownloadConditions;->isChargingRequired()Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/app/DownloadManager$Request;->setRequiresCharging(Z)Landroid/app/DownloadManager$Request;

    invoke-virtual {p2}, Lcom/google/mlkit/common/model/DownloadConditions;->isWifiRequired()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x2

    invoke-virtual {v1, p2}, Landroid/app/DownloadManager$Request;->setAllowedNetworkTypes(I)Landroid/app/DownloadManager$Request;

    :cond_4
    invoke-direct {p0, v1, p1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzn(Landroid/app/DownloadManager$Request;Lcom/google/mlkit/common/sdkinternal/ModelInfo;)Ljava/lang/Long;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public ensureModelDownloaded()Lcom/google/android/gms/tasks/Task;
    .locals 13
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v1

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    sget-object v3, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    sget-object v5, Lcom/google/mlkit/common/sdkinternal/ModelType;->UNKNOWN:Lcom/google/mlkit/common/sdkinternal/ModelType;

    sget-object v6, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg()Lcom/google/mlkit/common/sdkinternal/ModelInfo;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v2, v0

    move-object v0, v1

    :goto_0
    const/16 v3, 0xd

    :try_start_1
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->modelExistsLocally()Z

    move-result v6

    if-nez v6, :cond_6

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :cond_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x10

    if-ne v6, v7, :cond_1

    invoke-direct {p0, v5}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzl(Ljava/lang/Long;)Lcom/google/mlkit/common/MlKitException;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, 0x4

    if-eq v6, v7, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_3

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelHash()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v6, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v7

    iget-object v8, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    sget-object v9, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {v8}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v11

    sget-object v12, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzg:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v10, 0x0

    invoke-virtual/range {v6 .. v12}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj(J)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_3
    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzn:Lcom/google/mlkit/common/model/DownloadConditions;

    invoke-direct {p0, v0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzo(Lcom/google/mlkit/common/sdkinternal/ModelInfo;Lcom/google/mlkit/common/model/DownloadConditions;)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_5

    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to schedule the download task"

    invoke-direct {v0, v1, v3, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj(J)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_2
    if-eqz v0, :cond_8

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzn:Lcom/google/mlkit/common/model/DownloadConditions;

    invoke-direct {p0, v0, v2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzo(Lcom/google/mlkit/common/sdkinternal/ModelInfo;Lcom/google/mlkit/common/model/DownloadConditions;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj(J)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_7
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v2, "ModelDownloadManager"

    const-string v4, "Didn\'t schedule download for the updated model"

    invoke-virtual {v0, v2, v4}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    invoke-static {v1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_1
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :goto_3
    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v2, "Failed to ensure the model is downloaded."

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    invoke-static {v1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized getDownloadedFile()Landroid/os/ParcelFileDescriptor;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Landroid/app/DownloadManager;->openDownloadedFile(J)Landroid/os/ParcelFileDescriptor;

    move-result-object v2
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    :try_start_2
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v1, "ModelDownloadManager"

    const-string v3, "Downloaded file is not found"

    invoke-virtual {v0, v1, v3}, Ln9/g;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v2

    :cond_0
    monitor-exit p0

    return-object v2

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public declared-synchronized getDownloadingId()Ljava/lang/Long;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getDownloadingModelId(Lcom/google/mlkit/common/model/RemoteModel;)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized getDownloadingModelHash()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getDownloadingModelHash(Lcom/google/mlkit/common/model/RemoteModel;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized getDownloadingModelStatusCode()Ljava/lang/Integer;
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v3, Landroid/app/DownloadManager$Query;

    invoke-direct {v3}, Landroid/app/DownloadManager$Query;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    const/4 v1, 0x1

    new-array v6, v1, [J

    const/4 v7, 0x0

    aput-wide v4, v6, v7

    invoke-virtual {v3, v6}, Landroid/app/DownloadManager$Query;->setFilterById([J)Landroid/app/DownloadManager$Query;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "status"

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_2

    if-eqz v0, :cond_4

    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_2
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x4

    if-eq v4, v5, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v1, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v4, 0x8

    if-eq v1, v4, :cond_3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/16 v4, 0x10

    if-eq v1, v4, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    :try_start_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-object v2

    :goto_2
    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_4
    :goto_4
    monitor-exit p0

    return-object v2

    :goto_5
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    throw v0
.end method

.method public getFailureReason(Ljava/lang/Long;)I
    .locals 5
    .param p1    # Ljava/lang/Long;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Landroid/app/DownloadManager$Query;

    invoke-direct {v2}, Landroid/app/DownloadManager$Query;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const/4 p1, 0x1

    new-array p1, p1, [J

    aput-wide v3, p1, v1

    invoke-virtual {v2, p1}, Landroid/app/DownloadManager$Query;->setFilterById([J)Landroid/app/DownloadManager$Query;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/DownloadManager;->query(Landroid/app/DownloadManager$Query;)Landroid/database/Cursor;

    move-result-object v2

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "reason"

    invoke-interface {v2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    invoke-interface {v2, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public isModelDownloadedAndValid()Z
    .locals 8

    const-string v0, "ModelDownloadManager"

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->modelExistsLocally()Z

    move-result v2
    :try_end_0
    .catch Lcom/google/mlkit/common/MlKitException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :catch_0
    sget-object v2, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v3, "Failed to check if the model exist locally."

    invoke-virtual {v2, v0, v3}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelHash()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v2

    sget-object v5, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v6, "Download Status code: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v0, v6}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    return v4

    :cond_2
    const/16 v0, 0x8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    return v4

    :cond_4
    :goto_1
    sget-object v1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v2, "No new model is downloading."

    invoke-virtual {v1, v0, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    return v4
.end method

.method public modelExistsLocally()Z
    .locals 3

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk:Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-virtual {v0}, Lcom/google/mlkit/common/model/RemoteModel;->getUniqueModelNameForPersist()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzh:Lcom/google/mlkit/common/sdkinternal/ModelType;

    invoke-virtual {v1, v0, v2}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;->modelExistsLocally(Ljava/lang/String;Lcom/google/mlkit/common/sdkinternal/ModelType;)Z

    move-result v0

    return v0
.end method

.method public declared-synchronized removeOrCancelDownload()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v1

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v2, "Cancel or remove existing downloading task: "

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ModelDownloadManager"

    invoke-virtual {v0, v3, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzf:Landroid/app/DownloadManager;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x1

    new-array v3, v3, [J

    const/4 v4, 0x0

    aput-wide v1, v3, v4

    invoke-virtual {v0, v3}, Landroid/app/DownloadManager;->remove([J)I

    move-result v0

    if-gtz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzk:Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v1}, Lcom/google/mlkit/common/model/RemoteModel;->getUniqueModelNameForPersist()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;->deleteTempFilesInPrivateFolder(Ljava/lang/String;Lcom/google/mlkit/common/sdkinternal/ModelType;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->clearDownloadingModelInfo(Lcom/google/mlkit/common/model/RemoteModel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public setDownloadConditions(Lcom/google/mlkit/common/model/DownloadConditions;)V
    .locals 1
    .param p1    # Lcom/google/mlkit/common/model/DownloadConditions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "DownloadConditions can not be null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzn:Lcom/google/mlkit/common/model/DownloadConditions;

    return-void
.end method

.method public declared-synchronized updateLatestModelHashAndType(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1, p1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->setLatestModelHash(Lcom/google/mlkit/common/model/RemoteModel;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized zzg()Lcom/google/mlkit/common/sdkinternal/ModelInfo;
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->modelExistsLocally()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v2

    sget-object v4, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    invoke-virtual {v3}, Lcom/google/mlkit/common/model/RemoteModel;->getModelType()Lcom/google/mlkit/common/sdkinternal/ModelType;

    move-result-object v6

    sget-object v7, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzj:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzl:Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    if-eqz v1, :cond_7

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-interface {v1, v2}, Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;->retrieveRemoteModelInfo(Lcom/google/mlkit/common/model/RemoteModel;)Lcom/google/mlkit/common/sdkinternal/ModelInfo;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_1

    monitor-exit p0

    return-object v2

    :cond_1
    :try_start_1
    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelHash()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getIncompatibleModelHash(Lcom/google/mlkit/common/model/RemoteModel;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/google/mlkit/common/sdkinternal/CommonUtils;->getAppVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getPreviousAppVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v4, "ModelDownloadManager"

    const-string v6, "The model is incompatible with TFLite and the app is not upgraded, do not download"

    invoke-virtual {v3, v4, v6}, Ln9/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    move v7, v5

    :cond_2
    if-nez v0, :cond_3

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzj:Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v3, v4}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->clearLatestModelHash(Lcom/google/mlkit/common/model/RemoteModel;)V

    :cond_3
    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zze:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/ModelInfo;->getModelHash()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getLatestModelHash(Lcom/google/mlkit/common/model/RemoteModel;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    xor-int/lit8 v4, v3, 0x1

    if-eqz v7, :cond_5

    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    monitor-exit p0

    return-object v1

    :cond_5
    move v5, v4

    :goto_1
    if-eqz v0, :cond_6

    xor-int v0, v5, v7

    if-eqz v0, :cond_6

    monitor-exit p0

    return-object v2

    :cond_6
    :try_start_2
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    invoke-virtual {v0}, Lcom/google/mlkit/common/model/RemoteModel;->getModelName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The model "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is incompatible with TFLite runtime"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x64

    invoke-direct {v1, v0, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_7
    new-instance v0, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase."

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw v0

    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final zzi(Ljava/lang/String;)Ljava/io/File;
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zza:Ln9/g;

    const-string v1, "Model downloaded successfully"

    const-string v2, "ModelDownloadManager"

    invoke-virtual {v0, v2, v1}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v4

    iget-object v5, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    sget-object v6, Lcom/google/android/gms/internal/mlkit_common/zzmu;->zza:Lcom/google/android/gms/internal/mlkit_common/zzmu;

    iget-object v8, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzh:Lcom/google/mlkit/common/sdkinternal/ModelType;

    sget-object v9, Lcom/google/android/gms/internal/mlkit_common/zzna;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzna;

    const/4 v7, 0x1

    invoke-virtual/range {v3 .. v9}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zzf(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/android/gms/internal/mlkit_common/zzmu;ZLcom/google/mlkit/common/sdkinternal/ModelType;Lcom/google/android/gms/internal/mlkit_common/zzna;)V

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadedFile()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v3, "moving downloaded model from external storage to private folder."

    invoke-virtual {v0, v2, v3}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzm:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzg:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->moveModelToPrivateFolder(Landroid/os/ParcelFileDescriptor;Ljava/lang/String;Lcom/google/mlkit/common/model/RemoteModel;)Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    throw p1
.end method
