.class public final synthetic Lcom/appsflyer/sdk_base/util/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/util/c;->a:Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/c;->a:Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;

    invoke-static {v0}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->a(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
