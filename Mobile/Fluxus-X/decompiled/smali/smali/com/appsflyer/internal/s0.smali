.class public final synthetic Lcom/appsflyer/internal/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFg1tSDK;

.field public final synthetic b:Lcom/appsflyer/internal/AFh1pSDK;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/s0;->a:Lcom/appsflyer/internal/AFg1tSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/s0;->b:Lcom/appsflyer/internal/AFh1pSDK;

    iput-object p3, p0, Lcom/appsflyer/internal/s0;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/internal/s0;->a:Lcom/appsflyer/internal/AFg1tSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/s0;->b:Lcom/appsflyer/internal/AFh1pSDK;

    iget-object v2, p0, Lcom/appsflyer/internal/s0;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFg1tSDK;->a(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    return-void
.end method
