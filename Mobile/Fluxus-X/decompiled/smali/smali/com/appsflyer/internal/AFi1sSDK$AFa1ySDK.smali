.class public final Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/internal/AFi1sSDK;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic registerClient:Lcom/appsflyer/internal/AFi1sSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFi1sSDK;)V
    .locals 0

    iput-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFi1sSDK;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 1

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFi1sSDK;

    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFi1sSDK;->M_(Lcom/appsflyer/internal/AFi1sSDK;Landroid/net/Network;)V

    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFi1sSDK;

    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFi1sSDK;->M_(Lcom/appsflyer/internal/AFi1sSDK;Landroid/net/Network;)V

    iget-object p1, p0, Lcom/appsflyer/internal/AFi1sSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFi1sSDK;

    const-string v0, "NetworkLost"

    invoke-static {p1, v0}, Lcom/appsflyer/internal/AFi1sSDK;->d(Lcom/appsflyer/internal/AFi1sSDK;Ljava/lang/String;)V

    return-void
.end method
