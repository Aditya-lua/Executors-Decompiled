.class public final Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final backends:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
            ">;"
        }
    .end annotation
.end field

.field final description:Ljava/lang/String;

.field final eventName:Ljava/lang/String;

.field final lastUpdated:Ljava/lang/String;

.field final links:Ljava/lang/String;

.field final throttlingPercentage:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/HashSet;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->eventName:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->backends:Ljava/util/HashSet;

    iput-object p3, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->throttlingPercentage:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->lastUpdated:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->description:Ljava/lang/String;

    iput-object p6, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->links:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBackends()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->backends:Ljava/util/HashSet;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public getLastUpdated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->lastUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public getLinks()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->links:Ljava/lang/String;

    return-object v0
.end method

.method public getThrottlingPercentage()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->throttlingPercentage:Ljava/lang/Integer;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TelemetryConfig{eventName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->eventName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",backends="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->backends:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",throttlingPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->throttlingPercentage:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",lastUpdated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->lastUpdated:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",links="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;->links:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
