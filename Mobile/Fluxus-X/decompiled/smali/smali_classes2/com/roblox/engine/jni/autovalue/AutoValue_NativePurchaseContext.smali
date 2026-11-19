.class final Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;
.super Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$a;
    }
.end annotation


# instance fields
.field private final isInApp:Z

.field private final paymentSessionId:Ljava/lang/String;

.field private final purchaseType:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->paymentSessionId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->purchaseType:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->isInApp:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->paymentSessionId:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->paymentSessionId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->paymentSessionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->purchaseType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->purchaseType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->isInApp:Z

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->isInApp()Z

    move-result p1

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->paymentSessionId:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->purchaseType:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->isInApp:Z

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

    iget-boolean v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->isInApp:Z

    return v0
.end method

.method public paymentSessionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->paymentSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public purchaseType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->purchaseType:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NativePurchaseContext{paymentSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->paymentSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", purchaseType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->purchaseType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isInApp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext;->isInApp:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
