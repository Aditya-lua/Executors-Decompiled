.class public final Lcom/appsflyer/internal/AFg1ySDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final AFKeystoreWrapper:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field final AFLogger:I

.field final d:I

.field final registerClient:I

.field final unregisterClient:I


# direct methods
.method public constructor <init>(IIIILjava/lang/String;)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    iput p2, p0, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    iput p3, p0, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    iput p4, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    iput-object p5, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/appsflyer/internal/AFg1ySDK;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/appsflyer/internal/AFg1ySDK;

    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    iget v3, p1, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    iget v3, p1, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    iget v3, p1, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    iget v3, p1, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    iget-object p1, p1, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget v0, p0, Lcom/appsflyer/internal/AFg1ySDK;->unregisterClient:I

    iget v1, p0, Lcom/appsflyer/internal/AFg1ySDK;->d:I

    iget v2, p0, Lcom/appsflyer/internal/AFg1ySDK;->registerClient:I

    iget v3, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFLogger:I

    iget-object v4, p0, Lcom/appsflyer/internal/AFg1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CmpTcfData(policyVersion="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", gdprApplies="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cmpSdkId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", cmpSdkVersion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", tcString="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
