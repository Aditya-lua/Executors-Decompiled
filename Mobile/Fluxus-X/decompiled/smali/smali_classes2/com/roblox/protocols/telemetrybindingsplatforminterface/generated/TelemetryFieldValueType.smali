.class public final enum Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

.field public static final enum BOOL_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

.field public static final enum DOUBLE_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

.field public static final enum INT_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

.field public static final enum STRING_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;
    .locals 4

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->BOOL_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    sget-object v1, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->INT_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    sget-object v2, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->DOUBLE_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    sget-object v3, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->STRING_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    const-string v1, "BOOL_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->BOOL_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    const-string v1, "INT_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->INT_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    const-string v1, "DOUBLE_TYPE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->DOUBLE_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    new-instance v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    const-string v1, "STRING_TYPE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->STRING_TYPE:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    invoke-static {}, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->$values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;
    .locals 1

    const-class v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->$VALUES:[Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    invoke-virtual {v0}, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValueType;

    return-object v0
.end method
