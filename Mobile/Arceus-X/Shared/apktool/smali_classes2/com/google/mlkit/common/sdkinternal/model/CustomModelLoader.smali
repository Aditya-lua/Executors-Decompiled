.class public Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;
    }
.end annotation


# static fields
.field private static final zza:Ln9/g;

.field private static final zzb:Ljava/util/Map;


# instance fields
.field private final zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

.field private final zzd:Lcom/google/mlkit/common/model/LocalModel;

.field private final zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

.field private final zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

.field private final zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

.field private final zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

.field private zzi:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln9/g;

    const-string v1, "CustomModelLoader"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ln9/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzb:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/LocalModel;Lcom/google/mlkit/common/model/CustomRemoteModel;)V
    .locals 6
    .param p1    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    new-instance v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    new-instance v4, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-direct {v4, p1}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    new-instance v5, Lcom/google/mlkit/common/internal/model/zza;

    invoke-virtual {p3}, Lcom/google/mlkit/common/model/RemoteModel;->getUniqueModelNameForPersist()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, p1, v1}, Lcom/google/mlkit/common/internal/model/zza;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Ljava/lang/String;)V

    const/4 v3, 0x0

    move-object v1, p1

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelValidator;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileMover;)V

    iput-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    new-instance p1, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;

    invoke-direct {p1, v1}, Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)V

    const-class p3, Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    invoke-virtual {v1, p3}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;

    invoke-static {v1, v2, p1, v0, p3}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/RemoteModel;Lcom/google/mlkit/common/sdkinternal/model/ModelFileHelper;Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;Lcom/google/mlkit/common/sdkinternal/model/ModelInfoRetrieverInterop;)Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzi:Z

    goto :goto_0

    :cond_0
    move-object v1, p1

    move-object v2, p3

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    :goto_0
    iput-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzd:Lcom/google/mlkit/common/model/LocalModel;

    iput-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

    const-string p1, "common"

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzss;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_common/zzsh;

    move-result-object p1

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    return-void
.end method

.method public static declared-synchronized getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/LocalModel;Lcom/google/mlkit/common/model/CustomRemoteModel;)Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;
    .locals 4
    .param p0    # Lcom/google/mlkit/common/sdkinternal/MlKitContext;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;

    monitor-enter v0

    if-nez p2, :cond_0

    :try_start_0
    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/common/model/LocalModel;

    invoke-virtual {v1}, Lcom/google/mlkit/common/model/LocalModel;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/mlkit/common/model/RemoteModel;->getUniqueModelNameForPersist()Ljava/lang/String;

    move-result-object v1

    :goto_0
    sget-object v2, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzb:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;

    invoke-direct {v3, p0, p1, p2}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;-><init>(Lcom/google/mlkit/common/sdkinternal/MlKitContext;Lcom/google/mlkit/common/model/LocalModel;Lcom/google/mlkit/common/model/CustomRemoteModel;)V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private final zza()Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzb()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    const-string v1, "CustomModelLoader"

    const-string v2, "No existing model file"

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/io/File;

    array-length v2, v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    return-object v1
.end method

.method private final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->removeOrCancelDownload()V

    return-void
.end method

.method private static final zzc(Ljava/io/File;)Lcom/google/mlkit/common/model/LocalModel;
    .locals 3

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/mlkit/common/model/LocalModel$Builder;

    invoke-direct {v0}, Lcom/google/mlkit/common/model/LocalModel$Builder;-><init>()V

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    const-string v2, "manifest.json"

    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/mlkit/common/model/LocalModel$Builder;->setAbsoluteManifestFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;

    invoke-virtual {v0}, Lcom/google/mlkit/common/model/LocalModel$Builder;->build()Lcom/google/mlkit/common/model/LocalModel;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/mlkit/common/model/LocalModel$Builder;

    invoke-direct {v0}, Lcom/google/mlkit/common/model/LocalModel$Builder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/mlkit/common/model/LocalModel$Builder;->setAbsoluteFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;

    invoke-virtual {v0}, Lcom/google/mlkit/common/model/LocalModel$Builder;->build()Lcom/google/mlkit/common/model/LocalModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public declared-synchronized createLocalModelByLatestExistingModel()Lcom/google/mlkit/common/model/LocalModel;
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    const-string v1, "CustomModelLoader"

    const-string v2, "Try to get the latest existing model file."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza()Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-static {v0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzc(Ljava/io/File;)Lcom/google/mlkit/common/model/LocalModel;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized createLocalModelByNewlyDownloadedModel()Lcom/google/mlkit/common/model/LocalModel;
    .locals 7

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    const-string v1, "CustomModelLoader"

    const-string v2, "Try to get newly downloaded model file."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingId()Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelHash()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v4}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getDownloadingModelStatusCode()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzb()V

    :cond_1
    :goto_0
    move-object v1, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_2
    const-string v5, "Download Status code: "

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "CustomModelLoader"

    invoke-virtual {v0, v6, v5}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_4

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v1, v2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->zzi(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Moved the downloaded model to private folder successfully: "

    const-string v6, "CustomModelLoader"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v6, v4}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v0, v2}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->updateLatestModelHashAndType(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x10

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzh:Lcom/google/android/gms/internal/mlkit_common/zzsh;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_common/zzsk;->zzg()Lcom/google/android/gms/internal/mlkit_common/zzry;

    move-result-object v4

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/mlkit/common/model/RemoteModel;

    iget-object v5, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzf:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;

    invoke-virtual {v5, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelDownloadManager;->getFailureReason(Ljava/lang/Long;)I

    move-result v1

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v2, v5, v1}, Lcom/google/android/gms/internal/mlkit_common/zzsh;->zze(Lcom/google/android/gms/internal/mlkit_common/zzry;Lcom/google/mlkit/common/model/RemoteModel;ZI)V

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzb()V

    goto :goto_0

    :cond_5
    :goto_1
    const-string v1, "CustomModelLoader"

    const-string v2, "No new model is downloading."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzb()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_2
    if-nez v1, :cond_6

    monitor-exit p0

    return-object v3

    :cond_6
    :try_start_1
    invoke-static {v1}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzc(Ljava/io/File;)Lcom/google/mlkit/common/model/LocalModel;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public deleteLatestExistingModel()V
    .locals 2

    invoke-direct {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v1, v0}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzc(Ljava/io/File;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzc:Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

    invoke-static {v0}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->getInstance(Lcom/google/mlkit/common/sdkinternal/MlKitContext;)Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    move-result-object v0

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/mlkit/common/model/RemoteModel;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;->clearLatestModelHash(Lcom/google/mlkit/common/model/RemoteModel;)V

    :cond_0
    return-void
.end method

.method public deleteOldModels(Lcom/google/mlkit/common/model/LocalModel;)V
    .locals 3
    .param p1    # Lcom/google/mlkit/common/model/LocalModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/google/mlkit/common/model/LocalModel;->getAbsoluteFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zzd(Ljava/io/File;)Z

    move-result v0

    const-string v1, "CustomModelLoader"

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    const-string v2, "All old models are deleted."

    invoke-virtual {v0, v1, v2}, Ln9/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzg:Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/common/sdkinternal/model/RemoteModelFileManager;->zza(Ljava/io/File;)Ljava/io/File;

    return-void

    :cond_0
    sget-object p1, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zza:Ln9/g;

    const-string v0, "Failed to delete old models"

    invoke-virtual {p1, v1, v0}, Ln9/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized load(Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;)V
    .locals 2
    .param p1    # Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzd:Lcom/google/mlkit/common/model/LocalModel;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->createLocalModelByNewlyDownloadedModel()Lcom/google/mlkit/common/model/LocalModel;

    move-result-object v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->createLocalModelByLatestExistingModel()Lcom/google/mlkit/common/model/LocalModel;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_6

    :cond_2
    invoke-interface {p1, v0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;->tryLoad(Lcom/google/mlkit/common/model/LocalModel;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->deleteLatestExistingModel()V

    invoke-virtual {p0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->createLocalModelByLatestExistingModel()Lcom/google/mlkit/common/model/LocalModel;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    invoke-interface {p1}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;->logLoad()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_1
    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zze:Lcom/google/mlkit/common/model/CustomRemoteModel;

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzi:Z

    if-eqz v1, :cond_5

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/common/model/LocalModel;

    invoke-virtual {p0, v0}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->deleteOldModels(Lcom/google/mlkit/common/model/LocalModel;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader;->zzi:Z

    :cond_5
    invoke-interface {p1}, Lcom/google/mlkit/common/sdkinternal/model/CustomModelLoader$CustomModelLoaderHelper;->logLoad()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_6
    :try_start_2
    new-instance p1, Lcom/google/mlkit/common/MlKitException;

    const-string v0, "Model is not available."

    const/16 v1, 0xe

    invoke-direct {p1, v0, v1}, Lcom/google/mlkit/common/MlKitException;-><init>(Ljava/lang/String;I)V

    throw p1

    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
