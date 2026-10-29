.class public abstract Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
    }
.end annotation


# static fields
.field public static final EPHEMERAL_COUNTER_EVENT_TYPE:Ljava/lang/String; = "EphemeralCounter"

.field public static final EPHEMERAL_STAT_EVENT_TYPE:Ljava/lang/String; = "EphemeralStat"

.field public static final ROBLOX_TELEMETRY_EVENT_TYPE:Ljava/lang/String; = "RobloxTelemetry"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent$Builder;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEvent$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract config()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
.end method

.method public abstract data()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;
.end method

.method public abstract eventType()Ljava/lang/String;
.end method
