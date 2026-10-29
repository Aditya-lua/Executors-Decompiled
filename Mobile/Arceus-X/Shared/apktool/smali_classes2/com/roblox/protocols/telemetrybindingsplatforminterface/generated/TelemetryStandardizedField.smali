.class public final enum Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_ARCHITECTURE_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_CPU_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_CURRENT_CONTEXT_NAME:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_DATACENTER_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_MEMORY_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_PLACE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_PLACE_INSTANCE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_PLAY_SESSION_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_SESSION_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

.field public static final enum ADD_UNIVERSE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;
    .locals 11

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_DATACENTER_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_UNIVERSE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v3, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_INSTANCE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v4, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLAY_SESSION_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v5, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_CURRENT_CONTEXT_NAME:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v6, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v7, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_ARCHITECTURE_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v8, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_CPU_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v9, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_MEMORY_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    sget-object v10, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_SESSION_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    filled-new-array/range {v0 .. v10}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_DATACENTER_ID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_DATACENTER_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_PLACE_ID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_UNIVERSE_ID"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_UNIVERSE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_PLACE_INSTANCE_ID"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLACE_INSTANCE_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_PLAY_SESSION_ID"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_PLAY_SESSION_ID:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_CURRENT_CONTEXT_NAME"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_CURRENT_CONTEXT_NAME:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_OS_INFO"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_OS_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_ARCHITECTURE_INFO"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_ARCHITECTURE_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_CPU_INFO"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_CPU_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_MEMORY_INFO"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_MEMORY_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    const-string v1, "ADD_SESSION_INFO"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->ADD_SESSION_INFO:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-static {}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->$values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;
    .locals 1

    const-class v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    invoke-virtual {v0}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;

    return-object v0
.end method
