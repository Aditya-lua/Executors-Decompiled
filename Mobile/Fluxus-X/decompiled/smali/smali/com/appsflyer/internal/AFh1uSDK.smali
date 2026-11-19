.class public final enum Lcom/appsflyer/internal/AFh1uSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFh1uSDK;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1uSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFh1uSDK;

.field private static final synthetic registerClient:[Lcom/appsflyer/internal/AFh1uSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/appsflyer/internal/AFh1uSDK;

    const-string v1, "logSession"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1uSDK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->AFLogger:Lcom/appsflyer/internal/AFh1uSDK;

    new-instance v1, Lcom/appsflyer/internal/AFh1uSDK;

    const-string v2, "logEvent"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFh1uSDK;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/internal/AFh1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1uSDK;

    filled-new-array {v0, v1}, [Lcom/appsflyer/internal/AFh1uSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFh1uSDK;->registerClient:[Lcom/appsflyer/internal/AFh1uSDK;

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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFh1uSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFh1uSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFh1uSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFh1uSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFh1uSDK;->registerClient:[Lcom/appsflyer/internal/AFh1uSDK;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFh1uSDK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFh1uSDK;

    return-object v0
.end method
