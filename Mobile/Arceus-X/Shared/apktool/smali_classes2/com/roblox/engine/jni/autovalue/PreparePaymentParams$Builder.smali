.class public abstract Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;
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
.method public abstract build()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;
.end method

.method public abstract setCurrencyCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.end method

.method public abstract setIsInApp(Z)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.end method

.method public abstract setPaymentMethod(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.end method

.method public abstract setPaymentSessionId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.end method

.method public abstract setProductId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$Builder;
.end method
