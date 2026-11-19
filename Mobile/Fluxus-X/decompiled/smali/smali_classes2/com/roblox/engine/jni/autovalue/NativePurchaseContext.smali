.class public abstract Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$a;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_NativePurchaseContext$a;-><init>()V

    return-object v0
.end method

.method public static create(Ljava/lang/String;Ljava/lang/String;Z)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;
    .locals 1

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;->builder()Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;->c(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;->d(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;->b(Z)Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/NativePurchaseContext$a;->a()Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract isInApp()Z
.end method

.method public abstract paymentSessionId()Ljava/lang/String;
.end method

.method public abstract purchaseType()Ljava/lang/String;
.end method
