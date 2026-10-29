.class final enum Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFe1wSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AFa1ySDK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0082\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "AFKeystoreWrapper",
        "registerClient",
        "d"
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
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

.field private static final synthetic AFLogger:[Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

.field public static final enum d:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    const-string v1, "Admitted"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    new-instance v1, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    const-string v2, "Duplicate"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    new-instance v2, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    const-string v3, "Skipped"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    filled-new-array {v0, v1, v2}, [Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->AFLogger:[Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;->AFLogger:[Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFe1wSDK$AFa1ySDK;

    return-object v0
.end method
