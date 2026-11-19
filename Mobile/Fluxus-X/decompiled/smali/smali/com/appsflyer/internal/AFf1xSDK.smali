.class final Lcom/appsflyer/internal/AFf1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final AFLogger:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final d:Lcom/appsflyer/internal/AFd1fSDK;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final registerClient:J

.field final unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field final v:Ljava/lang/Throwable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JLcom/appsflyer/internal/AFd1fSDK;Lcom/appsflyer/internal/AFh1aSDK;Lcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/appsflyer/internal/AFd1fSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/appsflyer/internal/AFh1aSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/appsflyer/internal/AFh1dSDK;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lcom/appsflyer/internal/AFd1fSDK<",
            "*>;",
            "Lcom/appsflyer/internal/AFh1aSDK;",
            "Lcom/appsflyer/internal/AFh1dSDK;",
            "Ljava/lang/String;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    iput-wide p2, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    iput-object p4, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    iput-object p5, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    iput-object p6, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    iput-object p7, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    iput-object p8, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/appsflyer/internal/AFf1xSDK;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/appsflyer/internal/AFf1xSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    iget-wide v5, p1, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFLogger:Ljava/lang/String;

    iget-wide v1, p0, Lcom/appsflyer/internal/AFf1xSDK;->registerClient:J

    iget-object v3, p0, Lcom/appsflyer/internal/AFf1xSDK;->d:Lcom/appsflyer/internal/AFd1fSDK;

    iget-object v4, p0, Lcom/appsflyer/internal/AFf1xSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1aSDK;

    iget-object v5, p0, Lcom/appsflyer/internal/AFf1xSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    iget-object v6, p0, Lcom/appsflyer/internal/AFf1xSDK;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/appsflyer/internal/AFf1xSDK;->v:Ljava/lang/Throwable;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SaveMetadataParams(cdnToken="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", updateStartTime="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", config="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signatureStatus="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cdnCacheStatus="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
