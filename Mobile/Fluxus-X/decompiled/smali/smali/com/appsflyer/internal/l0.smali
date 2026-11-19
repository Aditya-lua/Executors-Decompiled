.class public final synthetic Lcom/appsflyer/internal/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFe1ySDK;

.field public final synthetic b:Lcom/appsflyer/internal/AFd1cSDK;

.field public final synthetic c:Lcom/appsflyer/internal/AFe1wSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/l0;->a:Lcom/appsflyer/internal/AFe1ySDK;

    iput-object p2, p0, Lcom/appsflyer/internal/l0;->b:Lcom/appsflyer/internal/AFd1cSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/l0;->c:Lcom/appsflyer/internal/AFe1wSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/l0;->a:Lcom/appsflyer/internal/AFe1ySDK;

    iget-object v1, p0, Lcom/appsflyer/internal/l0;->b:Lcom/appsflyer/internal/AFd1cSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/l0;->c:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFe1wSDK;->b(Lcom/appsflyer/internal/AFe1ySDK;Lcom/appsflyer/internal/AFd1cSDK;Lcom/appsflyer/internal/AFe1wSDK;)V

    return-void
.end method
