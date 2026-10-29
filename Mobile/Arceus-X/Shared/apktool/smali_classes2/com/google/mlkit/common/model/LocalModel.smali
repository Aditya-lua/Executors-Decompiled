.class public Lcom/google/mlkit/common/model/LocalModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/model/LocalModel$Builder;
    }
.end annotation


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Landroid/net/Uri;

.field private final zzd:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;ZLcom/google/mlkit/common/model/zzc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    iput-boolean p4, p0, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, p0, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lcom/google/mlkit/common/model/LocalModel;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lcom/google/mlkit/common/model/LocalModel;

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    iget-object v3, p1, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    invoke-static {v2, v3}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    iget-boolean p1, p1, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    if-ne v2, p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public getAbsoluteFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public getAssetFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    iget-boolean v3, p0, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isManifestFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/mlkit_common/zzr;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzq;

    move-result-object v0

    const-string v1, "absoluteFilePath"

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zza:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzq;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzq;

    const-string v1, "assetFilePath"

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzb:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzq;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzq;

    const-string v1, "uri"

    iget-object v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzc:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzq;->zza(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_common/zzq;

    const-string v1, "isManifestFile"

    iget-boolean v2, p0, Lcom/google/mlkit/common/model/LocalModel;->zzd:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzq;->zzb(Ljava/lang/String;Z)Lcom/google/android/gms/internal/mlkit_common/zzq;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_common/zzq;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
