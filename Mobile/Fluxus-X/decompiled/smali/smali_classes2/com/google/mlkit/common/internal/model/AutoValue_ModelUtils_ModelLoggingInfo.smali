.class final Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;
.super Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;
.source "SourceFile"


# instance fields
.field private final zza:J

.field private final zzb:Ljava/lang/String;

.field private final zzc:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;-><init>()V

    iput-wide p1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zza:J

    iput-object p3, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzb:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzc:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;

    iget-wide v3, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zza:J

    invoke-virtual {p1}, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;->getSize()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzb:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;->getHash()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzc:Z

    invoke-virtual {p1}, Lcom/google/mlkit/common/internal/model/ModelUtils$ModelLoggingInfo;->isManifestModel()Z

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public getHash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    iget-wide v0, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zza:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zza:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v0, v0

    iget-object v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzb:Ljava/lang/String;

    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int/2addr v0, v2

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    const/4 v1, 0x1

    iget-boolean v3, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzc:Z

    if-eq v1, v3, :cond_0

    const/16 v1, 0x4d5

    goto :goto_0

    :cond_0
    const/16 v1, 0x4cf

    :goto_0
    mul-int/2addr v0, v2

    xor-int/2addr v0, v1

    return v0
.end method

.method public isManifestModel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzc:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ModelLoggingInfo{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zza:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", hash="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzb:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manifestModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/google/mlkit/common/internal/model/AutoValue_ModelUtils_ModelLoggingInfo;->zzc:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
