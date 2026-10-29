.class public final enum Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum EPHEMERAL_COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum EPHEMERAL_STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum POINTS:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum TELETUNE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

.field public static final enum UNSPECIFIED:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;
    .locals 8

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->UNSPECIFIED:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->POINTS:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v3, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->TELETUNE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v4, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EPHEMERAL_COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v5, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EPHEMERAL_STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v6, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    sget-object v7, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    filled-new-array/range {v0 .. v7}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->UNSPECIFIED:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "EVENT_INGEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EVENT_INGEST:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "POINTS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->POINTS:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "TELETUNE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->TELETUNE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "EPHEMERAL_COUNTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EPHEMERAL_COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "EPHEMERAL_STAT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->EPHEMERAL_STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "COUNTER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    const-string v1, "STAT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->STAT:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->$values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;
    .locals 1

    const-class v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-virtual {v0}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    return-object v0
.end method
