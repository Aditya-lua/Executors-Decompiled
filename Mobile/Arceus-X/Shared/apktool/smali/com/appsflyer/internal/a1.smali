.class public final synthetic Lcom/appsflyer/internal/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1bSDK;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1bSDK;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/a1;->a:Lcom/appsflyer/internal/AFi1bSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/a1;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/a1;->a:Lcom/appsflyer/internal/AFi1bSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/a1;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFi1bSDK;->a(Lcom/appsflyer/internal/AFi1bSDK;Landroid/content/Context;)V

    return-void
.end method
