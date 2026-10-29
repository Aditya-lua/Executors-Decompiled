.class public final enum Lcom/appsflyer/internal/AFh1dSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFh1dSDK;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

.field public static final enum d:Lcom/appsflyer/internal/AFh1dSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFh1dSDK;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/internal/AFh1dSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/appsflyer/internal/AFh1dSDK;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1dSDK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/internal/AFh1dSDK;->d:Lcom/appsflyer/internal/AFh1dSDK;

    new-instance v1, Lcom/appsflyer/internal/AFh1dSDK;

    const-string v2, "FAILURE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFh1dSDK;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/internal/AFh1dSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    new-instance v2, Lcom/appsflyer/internal/AFh1dSDK;

    const-string v3, "NA"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/appsflyer/internal/AFh1dSDK;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/appsflyer/internal/AFh1dSDK;->registerClient:Lcom/appsflyer/internal/AFh1dSDK;

    new-instance v3, Lcom/appsflyer/internal/AFh1dSDK;

    const-string v4, "INTERNAL_ERROR"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/appsflyer/internal/AFh1dSDK;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/appsflyer/internal/AFh1dSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    filled-new-array {v0, v1, v2, v3}, [Lcom/appsflyer/internal/AFh1dSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFh1dSDK;->unregisterClient:[Lcom/appsflyer/internal/AFh1dSDK;

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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFh1dSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFh1dSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFh1dSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFh1dSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFh1dSDK;->unregisterClient:[Lcom/appsflyer/internal/AFh1dSDK;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFh1dSDK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFh1dSDK;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
