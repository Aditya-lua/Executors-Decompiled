.class public final synthetic Lcom/appsflyer/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1mSDK;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFa1tSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFa1tSDK;

    return-void
.end method


# virtual methods
.method public final onRemoteConfigUpdateFinished(Lcom/appsflyer/internal/AFf1pSDK;)V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/m;->a:Lcom/appsflyer/internal/AFa1tSDK;

    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFa1tSDK;->h(Lcom/appsflyer/internal/AFa1tSDK;Lcom/appsflyer/internal/AFf1pSDK;)V

    return-void
.end method
