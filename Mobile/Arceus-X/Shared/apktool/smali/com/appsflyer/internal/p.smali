.class public final synthetic Lcom/appsflyer/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFb1gSDK;

.field public final synthetic b:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/p;->a:Lcom/appsflyer/internal/AFb1gSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/p;->b:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/p;->a:Lcom/appsflyer/internal/AFb1gSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/p;->b:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFb1gSDK;->c(Lcom/appsflyer/internal/AFb1gSDK;Landroid/content/Intent;)V

    return-void
.end method
