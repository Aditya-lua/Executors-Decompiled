.class public final synthetic Lcom/appsflyer/internal/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1aSDK;

.field public final synthetic b:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/u0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/u0;->b:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/u0;->a:Lcom/appsflyer/internal/AFi1aSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/u0;->b:Lcom/appsflyer/sdk_base/referrer/ReferrerProp;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFi1aSDK;->d(Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-void
.end method
