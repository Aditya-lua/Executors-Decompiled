.class public abstract Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    }
.end annotation


# static fields
.field public static final EPHEMERAL_COUNTER_BACKEND:Ljava/lang/String; = "EphemeralCounter"

.field public static final EVENT_INGEST_BACKEND:Ljava/lang/String; = "EventIngest"

.field public static final POINTS_BACKEND:Ljava/lang/String; = "Points"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    .locals 2

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;->setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract backEnds()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract eventName()Ljava/lang/String;
.end method

.method public abstract throttlingHundredthPercentage()I
.end method
