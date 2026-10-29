.class public abstract Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
    }
.end annotation


# static fields
.field public static final STANDARDIZED_FIELD_KEY_ADD_OS_INFO:Ljava/lang/String; = "addOSInfo"

.field public static final STANDARDIZED_FIELD_KEY_ADD_PLACE_ID:Ljava/lang/String; = "addPlaceId"

.field public static final STANDARDIZED_FIELD_KEY_ADD_PLACE_INSTANCE_ID:Ljava/lang/String; = "addPlaceInstanceId"

.field public static final STANDARDIZED_FIELD_KEY_ADD_PLACE_SESSION_ID:Ljava/lang/String; = "addSessionId"

.field public static final STANDARDIZED_FIELD_KEY_ADD_PLAY_SESSION_ID:Ljava/lang/String; = "addPlaySessionId"

.field public static final STANDARDIZED_FIELD_KEY_ADD_universe_ID:Ljava/lang/String; = "addUniverseId"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
    .locals 2

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->setEventContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;->setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract customStringFields()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract eventContext()Ljava/lang/String;
.end method

.method public abstract standardizedFields()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
