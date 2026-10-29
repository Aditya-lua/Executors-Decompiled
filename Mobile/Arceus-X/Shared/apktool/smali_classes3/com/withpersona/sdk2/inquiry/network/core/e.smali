.class public final synthetic Lcom/withpersona/sdk2/inquiry/network/core/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# instance fields
.field public final synthetic a:Lum/w;


# direct methods
.method public synthetic constructor <init>(Lum/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/network/core/e;->a:Lum/w;

    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/network/core/e;->a:Lum/w;

    invoke-static {v0, p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;->b(Lum/w;Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
