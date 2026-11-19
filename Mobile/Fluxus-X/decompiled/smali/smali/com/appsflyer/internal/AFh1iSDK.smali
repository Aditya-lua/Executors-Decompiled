.class public final enum Lcom/appsflyer/internal/AFh1iSDK;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFh1iSDK;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lcom/appsflyer/internal/AFh1iSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFh1iSDK;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/internal/AFh1iSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/appsflyer/internal/AFh1iSDK;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/appsflyer/internal/AFh1iSDK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/appsflyer/internal/AFh1iSDK;->registerClient:Lcom/appsflyer/internal/AFh1iSDK;

    new-instance v1, Lcom/appsflyer/internal/AFh1iSDK;

    const-string v2, "CUSTOM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/appsflyer/internal/AFh1iSDK;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/appsflyer/internal/AFh1iSDK;->d:Lcom/appsflyer/internal/AFh1iSDK;

    filled-new-array {v0, v1}, [Lcom/appsflyer/internal/AFh1iSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFh1iSDK;->unregisterClient:[Lcom/appsflyer/internal/AFh1iSDK;

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

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFh1iSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFh1iSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFh1iSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFh1iSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFh1iSDK;->unregisterClient:[Lcom/appsflyer/internal/AFh1iSDK;

    invoke-virtual {v0}, [Lcom/appsflyer/internal/AFh1iSDK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFh1iSDK;

    return-object v0
.end method
