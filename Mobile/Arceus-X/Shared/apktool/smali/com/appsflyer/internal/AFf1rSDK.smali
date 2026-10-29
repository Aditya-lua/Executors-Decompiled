.class public final Lcom/appsflyer/internal/AFf1rSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sput-object v0, Lcom/appsflyer/internal/AFf1rSDK;->AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;

    new-array v0, v4, [Lcom/appsflyer/internal/AFe1zSDK;

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    aput-object v1, v0, v2

    sget-object v1, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    aput-object v1, v0, v3

    sput-object v0, Lcom/appsflyer/internal/AFf1rSDK;->unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;

    return-void
.end method

.method public static final synthetic AFLogger()[Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFf1rSDK;->AFKeystoreWrapper:[Lcom/appsflyer/internal/AFe1zSDK;

    return-object v0
.end method

.method public static final synthetic d()[Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFf1rSDK;->unregisterClient:[Lcom/appsflyer/internal/AFe1zSDK;

    return-object v0
.end method
