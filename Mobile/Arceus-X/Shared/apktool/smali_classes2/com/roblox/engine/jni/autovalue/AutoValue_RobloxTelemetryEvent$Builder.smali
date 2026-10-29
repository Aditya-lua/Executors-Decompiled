.class final Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;
.super Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

.field private data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

.field private eventType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public autoBuild()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
    .locals 5

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->eventType:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;-><init>(Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;Lcom/roblox/engine/jni/autovalue/e;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->eventType:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " eventType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    if-nez v1, :cond_3

    const-string v1, " data"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    if-nez v1, :cond_4

    const-string v1, " config"

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

.method public setConfig(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null config"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setData(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null data"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEventType(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;->eventType:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
