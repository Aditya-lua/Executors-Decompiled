.class public abstract Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/OOAPPurchaseFinishedParams$Builder;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_OOAPPurchaseFinishedParams$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract currencyCode()Ljava/lang/String;
.end method

.method public abstract description()Ljava/lang/String;
.end method

.method public abstract displayPrice()Ljava/lang/String;
.end method

.method public abstract nativeProductId()Ljava/lang/String;
.end method

.method public abstract price()F
.end method

.method public abstract productId()Ljava/lang/String;
.end method

.method public abstract robloxPurchaseInfo()Ljava/lang/String;
.end method

.method public abstract robuxAmount()I
.end method
