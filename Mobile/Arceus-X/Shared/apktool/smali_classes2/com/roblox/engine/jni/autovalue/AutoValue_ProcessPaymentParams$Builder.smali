.class final Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;
.super Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private checkoutSessionId:Ljava/lang/String;

.field private isInApp:Z

.field private orderId:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private paymentProviderType:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private set$0:B

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;
    .locals 11

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->set$0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->paymentProviderType:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->productId:Ljava/lang/String;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->packageName:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->orderId:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v8, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->token:Ljava/lang/String;

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->checkoutSessionId:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->isInApp:Z

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/d;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->paymentProviderType:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, " paymentProviderType"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->productId:Ljava/lang/String;

    if-nez v2, :cond_3

    const-string v2, " productId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->packageName:Ljava/lang/String;

    if-nez v2, :cond_4

    const-string v2, " packageName"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->orderId:Ljava/lang/String;

    if-nez v2, :cond_5

    const-string v2, " orderId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->token:Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v2, " token"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->set$0:B

    and-int/2addr v1, v2

    if-nez v1, :cond_7

    const-string v1, " isInApp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
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

.method public setCheckoutSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->checkoutSessionId:Ljava/lang/String;

    return-object p0
.end method

.method public setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->isInApp:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->set$0:B

    return-object p0
.end method

.method public setOrderId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->orderId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null orderId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPackageName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->packageName:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null packageName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPaymentProviderType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->paymentProviderType:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null paymentProviderType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->productId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null productId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setToken(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;->token:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null token"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
