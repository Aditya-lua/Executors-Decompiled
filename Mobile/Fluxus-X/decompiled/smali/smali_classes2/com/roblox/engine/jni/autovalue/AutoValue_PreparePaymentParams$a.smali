.class public final Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;
.super Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;
    .locals 9

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->f:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->a:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v6, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->d:Ljava/lang/String;

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;

    iget-object v4, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->b:Ljava/lang/String;

    iget-object v5, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->c:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->e:Z

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/roblox/engine/jni/autovalue/d;)V

    return-object v2

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->a:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, " productId"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->d:Ljava/lang/String;

    if-nez v2, :cond_3

    const-string v2, " paymentMethod"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->f:B

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

.method public b(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->e:Z

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->f:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->f:B

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null paymentMethod"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;->a:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null productId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
