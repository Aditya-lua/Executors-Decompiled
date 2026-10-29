.class final enum Lcom/appsflyer/internal/AFj1gSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFj1gSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFj1gSDK;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "AFKeystoreWrapper",
        "registerClient",
        "AFLogger"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1gSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFj1gSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFj1gSDK;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/internal/AFj1gSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/appsflyer/internal/AFj1gSDK;

    const-string v1, "UNDETERMINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFj1gSDK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/internal/AFj1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1gSDK;

    new-instance v1, Lcom/appsflyer/internal/AFj1gSDK;

    const-string v2, "NOT_PRESENT"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFj1gSDK;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/internal/AFj1gSDK;->registerClient:Lcom/appsflyer/internal/AFj1gSDK;

    new-instance v2, Lcom/appsflyer/internal/AFj1gSDK;

    const-string v3, "PRESENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/appsflyer/internal/AFj1gSDK;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/appsflyer/internal/AFj1gSDK;->AFLogger:Lcom/appsflyer/internal/AFj1gSDK;

    filled-new-array {v0, v1, v2}, [Lcom/appsflyer/internal/AFj1gSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFj1gSDK;->unregisterClient:[Lcom/appsflyer/internal/AFj1gSDK;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFj1gSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFj1gSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFj1gSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFj1gSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFj1gSDK;->unregisterClient:[Lcom/appsflyer/internal/AFj1gSDK;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFj1gSDK;

    return-object v0
.end method
