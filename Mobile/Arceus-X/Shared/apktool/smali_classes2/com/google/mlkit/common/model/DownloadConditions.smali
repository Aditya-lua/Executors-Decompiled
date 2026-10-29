.class public Lcom/google/mlkit/common/model/DownloadConditions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/mlkit/common/model/DownloadConditions$Builder;
    }
.end annotation


# instance fields
.field private final zza:Z

.field private final zzb:Z


# direct methods
.method public synthetic constructor <init>(ZZLcom/google/mlkit/common/model/zzb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zza:Z

    iput-boolean p2, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zzb:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/mlkit/common/model/DownloadConditions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/mlkit/common/model/DownloadConditions;

    iget-boolean v1, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zza:Z

    iget-boolean v3, p1, Lcom/google/mlkit/common/model/DownloadConditions;->zza:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zzb:Z

    iget-boolean p1, p1, Lcom/google/mlkit/common/model/DownloadConditions;->zzb:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zza:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zzb:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isChargingRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zza:Z

    return v0
.end method

.method public isWifiRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/common/model/DownloadConditions;->zzb:Z

    return v0
.end method
