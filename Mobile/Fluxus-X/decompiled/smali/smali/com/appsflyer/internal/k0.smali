.class public final synthetic Lcom/appsflyer/internal/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFe1wSDK;

.field public final synthetic b:Lcom/appsflyer/internal/AFe1ySDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/k0;->a:Lcom/appsflyer/internal/AFe1wSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/k0;->b:Lcom/appsflyer/internal/AFe1ySDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/k0;->a:Lcom/appsflyer/internal/AFe1wSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/k0;->b:Lcom/appsflyer/internal/AFe1ySDK;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFe1wSDK;->d(Lcom/appsflyer/internal/AFe1wSDK;Lcom/appsflyer/internal/AFe1ySDK;)V

    return-void
.end method
