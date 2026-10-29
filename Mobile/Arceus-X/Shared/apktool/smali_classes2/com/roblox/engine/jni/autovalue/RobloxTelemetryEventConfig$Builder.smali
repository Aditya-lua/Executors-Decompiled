.class public abstract Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
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
.method public abstract autoBuild()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
.end method

.method public final build()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->autoBuild()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;

    move-result-object v0

    return-object v0
.end method

.method public abstract setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;"
        }
    .end annotation
.end method

.method public abstract setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
.end method

.method public abstract setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
.end method
