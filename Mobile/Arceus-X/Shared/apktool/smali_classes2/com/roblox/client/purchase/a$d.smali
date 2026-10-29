.class public final enum Lcom/roblox/client/purchase/a$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/purchase/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/roblox/client/purchase/a$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roblox/client/purchase/a$d;

.field public static final enum b:Lcom/roblox/client/purchase/a$d;

.field public static final enum c:Lcom/roblox/client/purchase/a$d;

.field public static final enum d:Lcom/roblox/client/purchase/a$d;

.field public static final enum e:Lcom/roblox/client/purchase/a$d;

.field public static final enum f:Lcom/roblox/client/purchase/a$d;

.field public static final enum g:Lcom/roblox/client/purchase/a$d;

.field public static final enum h:Lcom/roblox/client/purchase/a$d;

.field public static final enum i:Lcom/roblox/client/purchase/a$d;

.field public static final enum j:Lcom/roblox/client/purchase/a$d;

.field public static final enum k:Lcom/roblox/client/purchase/a$d;

.field public static final synthetic l:[Lcom/roblox/client/purchase/a$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_AgeValidation"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->a:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_DesktopPurchase"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->b:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_FraudCheck"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->c:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_ExceedPurchaseLimit"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->d:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_ParentalControl"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->e:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_MobileAppPurchase"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->f:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_UserUnder13ExceedPurchaseLimit"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->g:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_ProviderEligibility"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->h:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_ProductEligibility"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->i:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_SmartReroute"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->j:Lcom/roblox/client/purchase/a$d;

    new-instance v0, Lcom/roblox/client/purchase/a$d;

    const-string v1, "ValidationFailure_Unknown"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/roblox/client/purchase/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/roblox/client/purchase/a$d;->k:Lcom/roblox/client/purchase/a$d;

    invoke-static {}, Lcom/roblox/client/purchase/a$d;->a()[Lcom/roblox/client/purchase/a$d;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/purchase/a$d;->l:[Lcom/roblox/client/purchase/a$d;

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

.method public static synthetic a()[Lcom/roblox/client/purchase/a$d;
    .locals 11

    sget-object v0, Lcom/roblox/client/purchase/a$d;->a:Lcom/roblox/client/purchase/a$d;

    sget-object v1, Lcom/roblox/client/purchase/a$d;->b:Lcom/roblox/client/purchase/a$d;

    sget-object v2, Lcom/roblox/client/purchase/a$d;->c:Lcom/roblox/client/purchase/a$d;

    sget-object v3, Lcom/roblox/client/purchase/a$d;->d:Lcom/roblox/client/purchase/a$d;

    sget-object v4, Lcom/roblox/client/purchase/a$d;->e:Lcom/roblox/client/purchase/a$d;

    sget-object v5, Lcom/roblox/client/purchase/a$d;->f:Lcom/roblox/client/purchase/a$d;

    sget-object v6, Lcom/roblox/client/purchase/a$d;->g:Lcom/roblox/client/purchase/a$d;

    sget-object v7, Lcom/roblox/client/purchase/a$d;->h:Lcom/roblox/client/purchase/a$d;

    sget-object v8, Lcom/roblox/client/purchase/a$d;->i:Lcom/roblox/client/purchase/a$d;

    sget-object v9, Lcom/roblox/client/purchase/a$d;->j:Lcom/roblox/client/purchase/a$d;

    sget-object v10, Lcom/roblox/client/purchase/a$d;->k:Lcom/roblox/client/purchase/a$d;

    filled-new-array/range {v0 .. v10}, [Lcom/roblox/client/purchase/a$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roblox/client/purchase/a$d;
    .locals 1

    const-class v0, Lcom/roblox/client/purchase/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/roblox/client/purchase/a$d;

    return-object p0
.end method

.method public static values()[Lcom/roblox/client/purchase/a$d;
    .locals 1

    sget-object v0, Lcom/roblox/client/purchase/a$d;->l:[Lcom/roblox/client/purchase/a$d;

    invoke-virtual {v0}, [Lcom/roblox/client/purchase/a$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roblox/client/purchase/a$d;

    return-object v0
.end method
