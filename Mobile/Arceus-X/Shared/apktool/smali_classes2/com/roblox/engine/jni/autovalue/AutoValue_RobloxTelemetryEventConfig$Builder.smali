.class final Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;
.super Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private backEnds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private eventName:Ljava/lang/String;

.field private set$0:B

.field private throttlingHundredthPercentage:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public autoBuild()Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig;
    .locals 5

    iget-byte v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->set$0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->eventName:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->backEnds:Ljava/util/List;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig;

    iget v3, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->throttlingHundredthPercentage:I

    const/4 v4, 0x0

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig;-><init>(Ljava/lang/String;Ljava/util/List;ILcom/roblox/engine/jni/autovalue/f;)V

    return-object v1

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->eventName:Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, " eventName"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->backEnds:Ljava/util/List;

    if-nez v2, :cond_3

    const-string v2, " backEnds"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v2, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->set$0:B

    and-int/2addr v1, v2

    if-nez v1, :cond_4

    const-string v1, " throttlingHundredthPercentage"

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

.method public setBackEnds(Ljava/util/List;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->backEnds:Ljava/util/List;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null backEnds"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEventName(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->eventName:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setThrottlingHundredthPercentage(I)Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEventConfig$Builder;
    .locals 0

    iput p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->throttlingHundredthPercentage:I

    iget-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->set$0:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/roblox/engine/jni/autovalue/AutoValue_RobloxTelemetryEventConfig$Builder;->set$0:B

    return-object p0
.end method
