.class public final enum Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum ANSWERED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum CANCELED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum CANCELED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum CONNECTED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum CONNECTING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum DECLINED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum DECLINED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum DIALING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum DIALING_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum ENDED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum FAILED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum INITIALIZING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum INVITED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum MISSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum MISSED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum RINGING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

.field public static final enum SUPPRESSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;
    .locals 18

    sget-object v1, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->INITIALIZING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v2, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DIALING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v3, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->RINGING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v4, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CONNECTING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v5, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CONNECTED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v6, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->INVITED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v7, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->ENDED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v8, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->MISSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v9, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CANCELED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v10, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DECLINED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v11, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->SUPPRESSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v12, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->FAILED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v13, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DIALING_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v14, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->ANSWERED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v15, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->MISSED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v16, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DECLINED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    sget-object v17, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CANCELED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    filled-new-array/range {v1 .. v17}, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "INITIALIZING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->INITIALIZING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "DIALING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DIALING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "RINGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->RINGING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "CONNECTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CONNECTING:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "CONNECTED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CONNECTED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "INVITED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->INVITED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "ENDED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->ENDED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "MISSED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->MISSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "CANCELED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CANCELED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "DECLINED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DECLINED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "SUPPRESSED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->SUPPRESSED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "FAILED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->FAILED:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "DIALING_ELSEWHERE"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DIALING_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "ANSWERED_ELSEWHERE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->ANSWERED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "MISSED_ELSEWHERE"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->MISSED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "DECLINED_ELSEWHERE"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->DECLINED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    new-instance v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    const-string v1, "CANCELED_ELSEWHERE"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->CANCELED_ELSEWHERE:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    invoke-static {}, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->$values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->$VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;
    .locals 1

    const-class v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->$VALUES:[Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    invoke-virtual {v0}, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    return-object v0
.end method
