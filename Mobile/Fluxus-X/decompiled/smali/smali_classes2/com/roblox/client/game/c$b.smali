.class public final enum Lcom/roblox/client/game/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/game/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/game/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/client/game/c$b;

.field public static final enum b:Lcom/roblox/client/game/c$b;

.field public static final enum c:Lcom/roblox/client/game/c$b;

.field public static final synthetic d:[Lcom/roblox/client/game/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/game/c$b;

    const-string v1, "GAME_STATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/game/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/game/c$b;->a:Lcom/roblox/client/game/c$b;

    new-instance v0, Lcom/roblox/client/game/c$b;

    const-string v1, "GAME_STATE_STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/game/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/game/c$b;->b:Lcom/roblox/client/game/c$b;

    new-instance v0, Lcom/roblox/client/game/c$b;

    const-string v1, "GAME_STATE_ENDED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/game/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/game/c$b;->c:Lcom/roblox/client/game/c$b;

    invoke-static {}, Lcom/roblox/client/game/c$b;->a()[Lcom/roblox/client/game/c$b;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/game/c$b;->d:[Lcom/roblox/client/game/c$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[Lcom/roblox/client/game/c$b;
    .locals 3

    sget-object v0, Lcom/roblox/client/game/c$b;->a:Lcom/roblox/client/game/c$b;

    sget-object v1, Lcom/roblox/client/game/c$b;->b:Lcom/roblox/client/game/c$b;

    sget-object v2, Lcom/roblox/client/game/c$b;->c:Lcom/roblox/client/game/c$b;

    filled-new-array {v0, v1, v2}, [Lcom/roblox/client/game/c$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/game/c$b;
    .locals 1

    const-class v0, Lcom/roblox/client/game/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/game/c$b;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/game/c$b;
    .locals 1

    sget-object v0, Lcom/roblox/client/game/c$b;->d:[Lcom/roblox/client/game/c$b;

    invoke-virtual {v0}, [Lcom/roblox/client/game/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/game/c$b;

    return-object v0
.end method
