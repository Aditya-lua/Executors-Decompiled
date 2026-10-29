.class public final enum Lcom/roblox/client/purchase/a$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/purchase/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/purchase/a$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/client/purchase/a$e;

.field public static final enum b:Lcom/roblox/client/purchase/a$e;

.field public static final enum c:Lcom/roblox/client/purchase/a$e;

.field public static final enum d:Lcom/roblox/client/purchase/a$e;

.field public static final enum e:Lcom/roblox/client/purchase/a$e;

.field public static final enum f:Lcom/roblox/client/purchase/a$e;

.field public static final enum g:Lcom/roblox/client/purchase/a$e;

.field public static final synthetic h:[Lcom/roblox/client/purchase/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "RETRY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->c:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "LIMIT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "LIMIT_UNDER_13"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->e:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "ERROR_CHECKING_BALANCE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->f:Lcom/roblox/client/purchase/a$e;

    new-instance v0, Lcom/roblox/client/purchase/a$e;

    const-string v1, "UNKNOWN_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    invoke-static {}, Lcom/roblox/client/purchase/a$e;->a()[Lcom/roblox/client/purchase/a$e;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/a$e;->h:[Lcom/roblox/client/purchase/a$e;

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

.method public static synthetic a()[Lcom/roblox/client/purchase/a$e;
    .locals 7

    sget-object v0, Lcom/roblox/client/purchase/a$e;->a:Lcom/roblox/client/purchase/a$e;

    sget-object v1, Lcom/roblox/client/purchase/a$e;->b:Lcom/roblox/client/purchase/a$e;

    sget-object v2, Lcom/roblox/client/purchase/a$e;->c:Lcom/roblox/client/purchase/a$e;

    sget-object v3, Lcom/roblox/client/purchase/a$e;->d:Lcom/roblox/client/purchase/a$e;

    sget-object v4, Lcom/roblox/client/purchase/a$e;->e:Lcom/roblox/client/purchase/a$e;

    sget-object v5, Lcom/roblox/client/purchase/a$e;->f:Lcom/roblox/client/purchase/a$e;

    sget-object v6, Lcom/roblox/client/purchase/a$e;->g:Lcom/roblox/client/purchase/a$e;

    filled-new-array/range {v0 .. v6}, [Lcom/roblox/client/purchase/a$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/purchase/a$e;
    .locals 1

    const-class v0, Lcom/roblox/client/purchase/a$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/purchase/a$e;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/purchase/a$e;
    .locals 1

    sget-object v0, Lcom/roblox/client/purchase/a$e;->h:[Lcom/roblox/client/purchase/a$e;

    invoke-virtual {v0}, [Lcom/roblox/client/purchase/a$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/purchase/a$e;

    return-object v0
.end method
