.class public final Lcom/appsflyer/internal/AFh1nSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# instance fields
.field public final AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;Lcom/appsflyer/internal/AFe1zSDK;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p0, v0, p1, v1}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    iput-object p3, p0, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/internal/AFh1pSDK;->force:[B

    iput-object p4, p0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    invoke-interface {p1, p5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/AFh1nSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFe1zSDK;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0
.end method
