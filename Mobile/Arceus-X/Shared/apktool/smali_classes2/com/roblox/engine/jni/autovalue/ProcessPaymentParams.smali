.class public abstract Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_ProcessPaymentParams$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract checkoutSessionId()Ljava/lang/String;
.end method

.method public abstract isInApp()Z
.end method

.method public abstract orderId()Ljava/lang/String;
.end method

.method public abstract packageName()Ljava/lang/String;
.end method

.method public abstract paymentProviderType()Ljava/lang/String;
.end method

.method public abstract productId()Ljava/lang/String;
.end method

.method public abstract token()Ljava/lang/String;
.end method
