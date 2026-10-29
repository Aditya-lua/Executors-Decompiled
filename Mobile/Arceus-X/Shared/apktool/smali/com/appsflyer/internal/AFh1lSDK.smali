.class public final Lcom/appsflyer/internal/AFh1lSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# instance fields
.field public final AFLoggerLogLevel:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final afDebugLog:Lcom/appsflyer/share/AFAdRevenueData;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/share/AFAdRevenueData;Ljava/util/Map;)V
    .locals 3
    .param p1    # Lcom/appsflyer/share/AFAdRevenueData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/share/AFAdRevenueData;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "adrevenue_generic"

    invoke-direct {p0, v2, v0, v1}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1lSDK;->afDebugLog:Lcom/appsflyer/share/AFAdRevenueData;

    iput-object p2, p0, Lcom/appsflyer/internal/AFh1lSDK;->AFLoggerLogLevel:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->valueOf:Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0
.end method
