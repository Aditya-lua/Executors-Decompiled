.class public abstract Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams;
.end method

.method public abstract setCheckoutSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setOrderId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setPackageName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setPaymentProviderType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method

.method public abstract setToken(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/ProcessPaymentParams$Builder;
.end method
