.class public abstract Lcom/roblox/engine/jni/autovalue/PreparePaymentParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/PreparePaymentParams$a;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_PreparePaymentParams$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract currencyCode()Ljava/lang/String;
.end method

.method public abstract isInApp()Z
.end method

.method public abstract paymentMethod()Ljava/lang/String;
.end method

.method public abstract paymentSessionId()Ljava/lang/String;
.end method

.method public abstract productId()Ljava/lang/String;
.end method
