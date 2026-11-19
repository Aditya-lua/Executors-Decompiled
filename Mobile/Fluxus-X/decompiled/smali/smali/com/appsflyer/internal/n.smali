.class public final synthetic Lcom/appsflyer/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/n;->a:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/n;->a:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1tSDK;->e(Lcom/appsflyer/internal/AFc1bSDK;)V

    return-void
.end method
