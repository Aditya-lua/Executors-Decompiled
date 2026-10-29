.class public final Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final boolVal:Ljava/lang/Boolean;

.field final doubleVal:Ljava/lang/Double;

.field final intVal:Ljava/lang/Long;

.field final stringVal:Ljava/lang/String;

.field final valueType:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->valueType:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    iput-object p2, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->boolVal:Ljava/lang/Boolean;

    iput-object p3, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->intVal:Ljava/lang/Long;

    iput-object p4, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->doubleVal:Ljava/lang/Double;

    iput-object p5, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->stringVal:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBoolVal()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->boolVal:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getDoubleVal()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->doubleVal:Ljava/lang/Double;

    return-object v0
.end method

.method public getIntVal()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->intVal:Ljava/lang/Long;

    return-object v0
.end method

.method public getStringVal()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->stringVal:Ljava/lang/String;

    return-object v0
.end method

.method public getValueType()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->valueType:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TelemetryFieldValue{valueType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->valueType:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",boolVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->boolVal:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",intVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->intVal:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",doubleVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->doubleVal:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",stringVal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;->stringVal:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
