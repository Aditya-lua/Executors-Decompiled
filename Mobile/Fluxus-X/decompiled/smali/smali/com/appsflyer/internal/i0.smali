.class public final synthetic Lcom/appsflyer/internal/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFe1wSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFe1wSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/i0;->a:Lcom/appsflyer/internal/AFe1wSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/i0;->a:Lcom/appsflyer/internal/AFe1wSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFe1wSDK;->a(Lcom/appsflyer/internal/AFe1wSDK;)V

    return-void
.end method
