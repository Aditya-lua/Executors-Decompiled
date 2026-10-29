.class public Lcom/google/mlkit/common/model/LocalModel$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/common/model/LocalModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Ljava/lang/String;

.field private zzc:Landroid/net/Uri;

.field private zzd:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/google/mlkit/common/model/LocalModel;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-eqz v2, :cond_3

    :cond_0
    if-nez v0, :cond_1

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-eqz v2, :cond_3

    :cond_1
    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :cond_3
    :goto_0
    const-string v0, "Set one of filePath, assetFilePath and URI."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    new-instance v2, Lcom/google/mlkit/common/model/LocalModel;

    iget-object v3, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    iget-boolean v6, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/google/mlkit/common/model/LocalModel;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZLcom/google/mlkit/common/model/zzc;)V

    return-object v2
.end method

.method public setAbsoluteFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "Model Source file path can not be empty"

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    return-object p0
.end method

.method public setAbsoluteManifestFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "Manifest file path can not be empty"

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    if-eqz v0, :cond_1

    :cond_0
    move v1, v2

    :cond_1
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    iput-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    return-object p0
.end method

.method public setAssetFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "Model Source file path can not be empty"

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    return-object p0
.end method

.method public setAssetManifestFilePath(Ljava/lang/String;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "Manifest file path can not be empty"

    invoke-static {p1, v0}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    if-eqz v0, :cond_1

    :cond_0
    move v1, v2

    :cond_1
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    iput-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzd:Z

    return-object p0
.end method

.method public setUri(Landroid/net/Uri;)Lcom/google/mlkit/common/model/LocalModel$Builder;
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zza:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzb:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "A local model source is from absolute file path, asset file path or URI, you can only set one of them."

    invoke-static {v1, v0}, Ln9/m;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel$Builder;->zzc:Landroid/net/Uri;

    return-object p0
.end method
