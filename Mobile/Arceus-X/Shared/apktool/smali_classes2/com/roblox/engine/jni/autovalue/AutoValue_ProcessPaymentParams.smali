.class final Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;
.super Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;
    }
.end annotation


# instance fields
.field private final checkoutSessionId:Ljava/lang/String;

.field private final isInApp:Z

.field private final orderId:Ljava/lang/String;

.field private final packageName:Ljava/lang/String;

.field private final paymentProviderType:Ljava/lang/String;

.field private final productId:Ljava/lang/String;

.field private final token:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->checkoutSessionId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->paymentProviderType:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->productId:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->packageName:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->orderId:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->token:Ljava/lang/String;

    .line 9
    iput-boolean p7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->isInApp:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public checkoutSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->checkoutSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->checkoutSessionId:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->checkoutSessionId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->checkoutSessionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->paymentProviderType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->paymentProviderType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->productId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->productId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->packageName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->packageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->orderId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->orderId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->token:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->token()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->isInApp:Z

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;->isInApp()Z

    move-result p1

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->checkoutSessionId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->paymentProviderType:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->productId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->packageName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->orderId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->token:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->isInApp:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public isInApp()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->isInApp:Z

    return v0
.end method

.method public orderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public packageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public paymentProviderType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->paymentProviderType:Ljava/lang/String;

    return-object v0
.end method

.method public productId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ProcessPaymentParams{checkoutSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->checkoutSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentProviderType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->paymentProviderType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", orderId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->orderId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isInApp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->isInApp:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public token()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;->token:Ljava/lang/String;

    return-object v0
.end method
