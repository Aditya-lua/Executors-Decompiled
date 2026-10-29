.class public final synthetic Lcom/appsflyer/internal/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFi1wSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFi1wSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/f1;->a:Lcom/appsflyer/internal/AFi1wSDK;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/f1;->a:Lcom/appsflyer/internal/AFi1wSDK;

    check-cast p1, Landroid/net/Network;

    invoke-static {v0, p1}, Lcom/appsflyer/internal/AFi1wSDK;->a(Lcom/appsflyer/internal/AFi1wSDK;Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object p1

    return-object p1
.end method
