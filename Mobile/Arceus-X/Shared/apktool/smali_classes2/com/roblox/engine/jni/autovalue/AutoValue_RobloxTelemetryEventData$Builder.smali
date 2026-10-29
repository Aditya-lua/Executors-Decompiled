.class final Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;
.super Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private customStringFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private eventContext:Ljava/lang/String;

.field private standardizedFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public autoBuild()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;
    .locals 5

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->eventContext:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->customStringFields:Ljava/util/List;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->standardizedFields:Ljava/util/List;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/roblox/engine/jni/autovalue/g;)V

    return-object v3

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->eventContext:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, " eventContext"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->customStringFields:Ljava/util/List;

    if-nez v1, :cond_3

    const-string v1, " customStringFields"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->standardizedFields:Ljava/util/List;

    if-nez v1, :cond_4

    const-string v1, " standardizedFields"

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

.method public setCustomStringFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->customStringFields:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null customStringFields"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEventContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->eventContext:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStandardizedFields(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;->standardizedFields:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null standardizedFields"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
