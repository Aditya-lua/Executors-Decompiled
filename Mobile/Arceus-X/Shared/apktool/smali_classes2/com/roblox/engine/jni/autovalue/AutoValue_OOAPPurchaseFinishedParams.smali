.class final Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;
.super Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;
    }
.end annotation


# instance fields
.field private final currencyCode:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final displayPrice:Ljava/lang/String;

.field private final nativeProductId:Ljava/lang/String;

.field private final price:F

.field private final productId:Ljava/lang/String;

.field private final robloxPurchaseInfo:Ljava/lang/String;

.field private final robuxAmount:I


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->productId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->nativeProductId:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robuxAmount:I

    .line 6
    iput-object p4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->description:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->displayPrice:Ljava/lang/String;

    .line 8
    iput p6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->price:F

    .line 9
    iput-object p7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->currencyCode:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robloxPurchaseInfo:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/b;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public currencyCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->currencyCode:Ljava/lang/String;

    return-object v0
.end method

.method public description()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->description:Ljava/lang/String;

    return-object v0
.end method

.method public displayPrice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->displayPrice:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->productId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->productId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->nativeProductId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->nativeProductId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robuxAmount:I

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->robuxAmount()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->description:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->description()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->displayPrice:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->displayPrice()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->price:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->price()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->currencyCode:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->currencyCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robloxPurchaseInfo:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;->robloxPurchaseInfo()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->productId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->nativeProductId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robuxAmount:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->description:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->displayPrice:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->price:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->currencyCode:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robloxPurchaseInfo:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public nativeProductId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->nativeProductId:Ljava/lang/String;

    return-object v0
.end method

.method public price()F
    .locals 1

    iget v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->price:F

    return v0
.end method

.method public productId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public robloxPurchaseInfo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robloxPurchaseInfo:Ljava/lang/String;

    return-object v0
.end method

.method public robuxAmount()I
    .locals 1

    iget v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robuxAmount:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OOAPPurchaseFinishedParams{productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nativeProductId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->nativeProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", robuxAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robuxAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", displayPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->displayPrice:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->price:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", currencyCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->currencyCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", robloxPurchaseInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;->robloxPurchaseInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
