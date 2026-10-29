.class final Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;
.super Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private currencyCode:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private displayPrice:Ljava/lang/String;

.field private nativeProductId:Ljava/lang/String;

.field private price:F

.field private productId:Ljava/lang/String;

.field private robloxPurchaseInfo:Ljava/lang/String;

.field private robuxAmount:I

.field private set$0:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;
    .locals 12

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->productId:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->nativeProductId:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->description:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->displayPrice:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->currencyCode:Ljava/lang/String;

    if-eqz v9, :cond_1

    iget-object v10, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->robloxPurchaseInfo:Ljava/lang/String;

    if-nez v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;

    iget v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->robuxAmount:I

    iget v8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->price:F

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/b;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->productId:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " productId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->nativeProductId:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, " nativeProductId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_4

    const-string v1, " robuxAmount"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->description:Ljava/lang/String;

    if-nez v1, :cond_5

    const-string v1, " description"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->displayPrice:Ljava/lang/String;

    if-nez v1, :cond_6

    const-string v1, " displayPrice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_7

    const-string v1, " price"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->currencyCode:Ljava/lang/String;

    if-nez v1, :cond_8

    const-string v1, " currencyCode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->robloxPurchaseInfo:Ljava/lang/String;

    if-nez v1, :cond_9

    const-string v1, " robloxPurchaseInfo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public setCurrencyCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->currencyCode:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null currencyCode"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDescription(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->description:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null description"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDisplayPrice(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->displayPrice:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null displayPrice"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setNativeProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->nativeProductId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null nativeProductId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPrice(F)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->price:F

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    return-object p0
.end method

.method public setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->productId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null productId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRobloxPurchaseInfo(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->robloxPurchaseInfo:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null robloxPurchaseInfo"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRobuxAmount(I)Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->robuxAmount:I

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;->set$0:B

    return-object p0
.end method
