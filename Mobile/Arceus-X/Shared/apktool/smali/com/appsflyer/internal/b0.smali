.class public final synthetic Lcom/appsflyer/internal/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFc1tSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1tSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/b0;->a:Lcom/appsflyer/internal/AFc1tSDK;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/b0;->a:Lcom/appsflyer/internal/AFc1tSDK;

    check-cast p1, Lx8/c;

    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFc1tSDK;->a(Lcom/appsflyer/internal/AFc1tSDK;Lx8/c;)V

    return-void
.end method
