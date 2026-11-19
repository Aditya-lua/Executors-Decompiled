.class public final enum Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

.field public static final enum POLO:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

.field public static final enum PRINTTEST:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;


# direct methods
.method private static synthetic $values()[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;
    .locals 2

    sget-object v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->POLO:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    sget-object v1, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->PRINTTEST:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    filled-new-array {v0, v1}, [Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    const-string v1, "POLO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->POLO:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    new-instance v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    const-string v1, "PRINTTEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->PRINTTEST:Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    invoke-static {}, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->$values()[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->$VALUES:[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;
    .locals 1

    const-class v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    return-object p0
.end method

.method public static values()[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->$VALUES:[Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    invoke-virtual {v0}, [Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/protocols/examplev2platforminterface/generated/ExampleNotificationType;

    return-object v0
.end method
