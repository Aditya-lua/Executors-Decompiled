.class public final synthetic Lcom/appsflyer/internal/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFa1tSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFa1tSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/j;->a:Lcom/appsflyer/internal/AFa1tSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/j;->a:Lcom/appsflyer/internal/AFa1tSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFa1tSDK;->a(Lcom/appsflyer/internal/AFa1tSDK;)V

    return-void
.end method
