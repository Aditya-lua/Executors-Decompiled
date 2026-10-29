.class final Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;
.super Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData$Builder;
    }
.end annotation


# instance fields
.field private final customStringFields:Ljava/util/List;
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

.field private final eventContext:Ljava/lang/String;

.field private final standardizedFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->eventContext:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->customStringFields:Ljava/util/List;

    .line 5
    iput-object p3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->standardizedFields:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/roblox/engine/jni/autovalue/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public customStringFields()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->customStringFields:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->eventContext:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->eventContext()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->customStringFields:Ljava/util/List;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->customStringFields()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->standardizedFields:Ljava/util/List;

    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventData;->standardizedFields()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public eventContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->eventContext:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->eventContext:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->customStringFields:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->standardizedFields:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public standardizedFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->standardizedFields:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RobloxTelemetryEventData{eventContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->eventContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", customStringFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->customStringFields:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", standardizedFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventData;->standardizedFields:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
