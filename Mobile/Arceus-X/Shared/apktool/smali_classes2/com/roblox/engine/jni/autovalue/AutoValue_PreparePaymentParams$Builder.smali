.class final Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;
.super Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private currencyCode:Ljava/lang/String;

.field private isInApp:Z

.field private paymentMethod:Ljava/lang/String;

.field private paymentSessionId:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private set$0:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;
    .locals 9

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->set$0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->productId:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->paymentMethod:Ljava/lang/String;

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->currencyCode:Ljava/lang/String;

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->paymentSessionId:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->isInApp:Z

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/c;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->productId:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, " productId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->paymentMethod:Ljava/lang/String;

    if-nez v2, :cond_3

    const-string v2, " paymentMethod"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->set$0:B

    and-int/2addr v1, v2

    if-nez v1, :cond_4

    const-string v1, " isInApp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
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

.method public setCurrencyCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->currencyCode:Ljava/lang/String;

    return-object p0
.end method

.method public setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->isInApp:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->set$0:B

    return-object p0
.end method

.method public setPaymentMethod(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->paymentMethod:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null paymentMethod"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setPaymentSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->paymentSessionId:Ljava/lang/String;

    return-object p0
.end method

.method public setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$Builder;->productId:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null productId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
