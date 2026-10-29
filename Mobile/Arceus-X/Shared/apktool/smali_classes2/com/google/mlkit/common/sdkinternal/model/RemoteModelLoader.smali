.class public Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ln9/g;

.field private static final zzb:Ljava/util/Map;


# instance fields
.field private final zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

.field private final zzd:Lcom/google/mlkit/common/model/RemoteModel;

.field private final zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

.field private final zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

.field private final zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;

.field private final zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

.field private zzi:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln9/g;

    const-string v1, "RemoteModelLoader"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ln9/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zza:Ln9/g;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzb:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;)V
    .locals 6
    .param p1    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/model/RemoteModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    new-instance v4, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-direct {v4, p1}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;)V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzi:Z

    new-instance p1, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-direct {p1, v1}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    const-class p2, Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    invoke-virtual {v1, p2}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    invoke-static {v1, v2, p1, v0, p2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;)Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;

    iput-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iput-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzd:Lcom/google/mlkit/common/model/RemoteModel;

    const-string p1, "common"

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzss;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsh;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    return-void
.end method

.method public static declared-synchronized getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;)Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;
    .locals 10
    .param p0    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/google/mlkit/common/model/RemoteModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/mlkit/common/model/RemoteModel;->getUniqueModelNameForPersist()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzb:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v4, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;)V

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;
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

.method private final zza(Ljava/lang/String;)Ljava/nio/MappedByteBuffer;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;

    invoke-interface {v0, p1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoaderHelper;->loadModelAtPath(Ljava/lang/String;)Ljava/nio/MappedByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method private final zzb(Ljava/io/File;)Ljava/nio/MappedByteBuffer;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zza(Ljava/lang/String;)Ljava/nio/MappedByteBuffer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v1, p1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzc(Ljava/io/File;)V

    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v1, "Failed to load newly downloaded model."

    const/16 v2, 0xe

    invoke-direct {p1, v1, v2, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public getRemoteModel()Lcom/google/mlkit/common/model/RemoteModel;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzd:Lcom/google/mlkit/common/model/RemoteModel;

    return-object v0
.end method

.method public declared-synchronized load()Ljava/nio/MappedByteBuffer;
    .locals 10

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zza:Ln9/g;

    const-string v1, "RemoteModelLoader"

    const-string v2, "Try to load newly downloaded model file."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    iget-boolean v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzi:Z

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelHash()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v6, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v6}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_2

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    :cond_1
    :goto_0
    move-object v6, v5

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    const-string v7, "Download Status code: "

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "RemoteModelLoader"

    invoke-virtual {v0, v8, v7}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_4

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v3, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-direct {p0, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzb(Ljava/io/File;)Ljava/nio/MappedByteBuffer;

    move-result-object v6

    invoke-virtual {v3}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "Moved the downloaded model to private folder successfully: "

    const-string v9, "RemoteModelLoader"

    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v9, v7}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v7, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v7, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->updateLatestModelHashAndType(Ljava/lang/String;)V

    if-eqz v2, :cond_6

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v1, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzd(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "RemoteModelLoader"

    const-string v2, "All old models are deleted."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v1, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zza(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzb(Ljava/io/File;)Ljava/nio/MappedByteBuffer;

    move-result-object v6

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzd:Lcom/google/mlkit/common/model/RemoteModel;

    iget-object v6, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v7

    invoke-virtual {v6, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getFailureReason(Ljava/lang/Long;)I

    move-result v3

    invoke-virtual {v1, v7, v2, v4, v3}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zze(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;ZI)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    goto :goto_0

    :cond_5
    :goto_1
    const-string v1, "RemoteModelLoader"

    const-string v2, "No new model is downloading."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zze:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    goto/16 :goto_0

    :cond_6
    :goto_2
    if-nez v6, :cond_8

    const-string v1, "RemoteModelLoader"

    const-string v2, "Loading existing model file."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzb()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const-string v1, "RemoteModelLoader"

    const-string v2, "No existing model file"

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :cond_7
    :try_start_1
    invoke-direct {p0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zza(Ljava/lang/String;)Ljava/nio/MappedByteBuffer;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_2
    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzc(Ljava/io/File;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzd:Lcom/google/mlkit/common/model/RemoteModel;

    invoke-static {v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->clearLatestModelHash(Lcom/google/mlkit/common/model/RemoteModel;)V

    new-instance v1, Lcom/google/mlkit/common/MlKitException;

    const-string v2, "Failed to load an already downloaded model."

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3, v0}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    throw v1

    :cond_8
    iput-boolean v4, p0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelLoader;->zzi:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v5, v6

    :goto_3
    monitor-exit p0

    return-object v5

    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
