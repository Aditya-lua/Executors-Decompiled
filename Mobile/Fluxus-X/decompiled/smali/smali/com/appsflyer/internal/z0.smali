.class public final synthetic Lcom/appsflyer/internal/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1aSDK;

.field public final synthetic b:Lcom/appsflyer/internal/AFi1gSDK;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/z0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/z0;->b:Lcom/appsflyer/internal/AFi1gSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/z0;->c:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/z0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/z0;->b:Lcom/appsflyer/internal/AFi1gSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/z0;->c:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFi1aSDK;->b(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFi1gSDK;Ljava/lang/Runnable;)V

    return-void
.end method
