.class public abstract Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
.end method

.method public final b()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$a;->a()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    move-result-object v0

    return-object v0
.end method

.method public abstract c(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$a;
.end method

.method public abstract d(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$a;
.end method

.method public abstract e(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$a;
.end method
