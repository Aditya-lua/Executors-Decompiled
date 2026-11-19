.class public final synthetic Lcom/appsflyer/internal/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFb1gSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFb1gSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/o;->a:Lcom/appsflyer/internal/AFb1gSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/o;->a:Lcom/appsflyer/internal/AFb1gSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFb1gSDK;->b(Lcom/appsflyer/internal/AFb1gSDK;)V

    return-void
.end method
