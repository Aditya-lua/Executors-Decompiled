.class public final synthetic Lcom/withpersona/sdk2/inquiry/network/core/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/d;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/network/core/d;->b:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/d;->a:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/network/core/d;->b:Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->c(Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
