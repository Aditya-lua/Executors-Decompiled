.class public final synthetic Lcom/appsflyer/internal/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1aSDK;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

.field public final synthetic d:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/w0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/w0;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/appsflyer/internal/w0;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iput-object p4, p0, Lcom/appsflyer/internal/w0;->d:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/w0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/w0;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/appsflyer/internal/w0;->c:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    iget-object v3, p0, Lcom/appsflyer/internal/w0;->d:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {v0, v1, v2, v3}, Lcom/appsflyer/internal/AFi1aSDK;->g(Lcom/appsflyer/internal/AFi1aSDK;Landroid/content/Context;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method
