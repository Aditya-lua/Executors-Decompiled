.class public final enum Lcom/appsflyer/internal/AFd1dSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFd1dSDK;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0008\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u0008"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFd1dSDK;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "AFKeystoreWrapper",
        "Ljava/lang/String;",
        "unregisterClient",
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
.field private static final synthetic AFLogger:[Lcom/appsflyer/internal/AFd1dSDK;

.field public static final enum d:Lcom/appsflyer/internal/AFd1dSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFd1dSDK;

.field public static final enum unregisterClient:Lcom/appsflyer/internal/AFd1dSDK;


# instance fields
.field public final AFKeystoreWrapper:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/appsflyer/internal/AFd1dSDK;

    const/4 v1, 0x0

    const-string v2, "api"

    const-string v3, "API"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/internal/AFd1dSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/internal/AFd1dSDK;->registerClient:Lcom/appsflyer/internal/AFd1dSDK;

    new-instance v1, Lcom/appsflyer/internal/AFd1dSDK;

    const/4 v2, 0x1

    const-string v3, "rc"

    const-string v4, "RC"

    invoke-direct {v1, v4, v2, v3}, Lcom/appsflyer/internal/AFd1dSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/appsflyer/internal/AFd1dSDK;->d:Lcom/appsflyer/internal/AFd1dSDK;

    new-instance v2, Lcom/appsflyer/internal/AFd1dSDK;

    const/4 v3, 0x2

    const-string v4, ""

    const-string v5, "DEFAULT"

    invoke-direct {v2, v5, v3, v4}, Lcom/appsflyer/internal/AFd1dSDK;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/appsflyer/internal/AFd1dSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1dSDK;

    filled-new-array {v0, v1, v2}, [Lcom/appsflyer/internal/AFd1dSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFd1dSDK;->AFLogger:[Lcom/appsflyer/internal/AFd1dSDK;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFd1dSDK;->AFKeystoreWrapper:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1dSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFd1dSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1dSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFd1dSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFd1dSDK;->AFLogger:[Lcom/appsflyer/internal/AFd1dSDK;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFd1dSDK;

    return-object v0
.end method
