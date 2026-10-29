.class final Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;
.super Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;
    }
.end annotation


# instance fields
.field private final config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

.field private final data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

.field private final eventType:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->eventType:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;Lcom/roblox/engine/jni/autovalue/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;-><init>(Ljava/lang/String;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;)V

    return-void
.end method


# virtual methods
.method public config()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    return-object v0
.end method

.method public data()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->eventType:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->eventType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->data()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;->config()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public eventType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->eventType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->eventType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RobloxTelemetryEvent{eventType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->eventType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->data:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", config="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent;->config:Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
