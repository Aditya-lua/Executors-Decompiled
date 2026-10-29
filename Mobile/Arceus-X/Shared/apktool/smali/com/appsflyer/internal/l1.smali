.class public final synthetic Lcom/appsflyer/internal/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFj1vSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1vSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/l1;->a:Lcom/appsflyer/internal/AFj1vSDK;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/l1;->a:Lcom/appsflyer/internal/AFj1vSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1vSDK;->b(Lcom/appsflyer/internal/AFj1vSDK;)V

    return-void
.end method
