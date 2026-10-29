.class public final Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final customFields:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;",
            ">;"
        }
    .end annotation
.end field

.field final eventContext:Ljava/lang/String;

.field final legacyOverrideTargetForEventIngest:Ljava/lang/String;

.field final standardizedFields:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Ljava/util/HashSet;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;",
            ">;",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->customFields:Ljava/util/HashMap;

    iput-object p2, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->standardizedFields:Ljava/util/HashSet;

    iput-object p3, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->eventContext:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->legacyOverrideTargetForEventIngest:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCustomFields()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->customFields:Ljava/util/HashMap;

    return-object v0
.end method

.method public getEventContext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->eventContext:Ljava/lang/String;

    return-object v0
.end method

.method public getLegacyOverrideTargetForEventIngest()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->legacyOverrideTargetForEventIngest:Ljava/lang/String;

    return-object v0
.end method

.method public getStandardizedFields()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->standardizedFields:Ljava/util/HashSet;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TelemetryData{customFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->customFields:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",standardizedFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->standardizedFields:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",eventContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->eventContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",legacyOverrideTargetForEventIngest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;->legacyOverrideTargetForEventIngest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
