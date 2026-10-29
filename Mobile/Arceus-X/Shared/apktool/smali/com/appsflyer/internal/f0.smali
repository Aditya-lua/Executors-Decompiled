.class public final synthetic Lcom/appsflyer/internal/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/referrer/Referrer;

.field public final synthetic b:Lcom/appsflyer/internal/AFe1fSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/f0;->a:Lcom/appsflyer/sdk_base/referrer/Referrer;

    iput-object p2, p0, Lcom/appsflyer/internal/f0;->b:Lcom/appsflyer/internal/AFe1fSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/f0;->a:Lcom/appsflyer/sdk_base/referrer/Referrer;

    iget-object v1, p0, Lcom/appsflyer/internal/f0;->b:Lcom/appsflyer/internal/AFe1fSDK;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFe1fSDK;->a(Lcom/appsflyer/sdk_base/referrer/Referrer;Lcom/appsflyer/internal/AFe1fSDK;)V

    return-void
.end method
