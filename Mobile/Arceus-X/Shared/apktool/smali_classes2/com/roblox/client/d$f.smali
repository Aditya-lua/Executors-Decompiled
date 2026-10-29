.class public final enum Lcom/roblox/client/d$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/d$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/client/d$f;

.field public static final enum b:Lcom/roblox/client/d$f;

.field public static final enum c:Lcom/roblox/client/d$f;

.field public static final enum d:Lcom/roblox/client/d$f;

.field public static final enum e:Lcom/roblox/client/d$f;

.field public static final synthetic f:[Lcom/roblox/client/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/d$f;

    const-string v1, "UnKnown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/d$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/d$f;->a:Lcom/roblox/client/d$f;

    new-instance v0, Lcom/roblox/client/d$f;

    const-string v1, "Recommended"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/d$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/d$f;->b:Lcom/roblox/client/d$f;

    new-instance v0, Lcom/roblox/client/d$f;

    const-string v1, "Required"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/d$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    new-instance v0, Lcom/roblox/client/d$f;

    const-string v1, "NotRequired"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/d$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/d$f;->d:Lcom/roblox/client/d$f;

    new-instance v0, Lcom/roblox/client/d$f;

    const-string v1, "NewAppRequired"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/d$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/d$f;->e:Lcom/roblox/client/d$f;

    invoke-static {}, Lcom/roblox/client/d$f;->a()[Lcom/roblox/client/d$f;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/d$f;->f:[Lcom/roblox/client/d$f;

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

.method public static synthetic a()[Lcom/roblox/client/d$f;
    .locals 5

    sget-object v0, Lcom/roblox/client/d$f;->a:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->b:Lcom/roblox/client/d$f;

    sget-object v2, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    sget-object v3, Lcom/roblox/client/d$f;->d:Lcom/roblox/client/d$f;

    sget-object v4, Lcom/roblox/client/d$f;->e:Lcom/roblox/client/d$f;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/roblox/client/d$f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/d$f;
    .locals 1

    const-class v0, Lcom/roblox/client/d$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/d$f;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/d$f;
    .locals 1

    sget-object v0, Lcom/roblox/client/d$f;->f:[Lcom/roblox/client/d$f;

    invoke-virtual {v0}, [Lcom/roblox/client/d$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/d$f;

    return-object v0
.end method
