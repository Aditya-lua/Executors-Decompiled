.class public final synthetic Lcom/appsflyer/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFc1aSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1aSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/w;->a:Lcom/appsflyer/internal/AFc1aSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/w;->a:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1aSDK;->c(Lcom/appsflyer/internal/AFc1aSDK;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object v0

    return-object v0
.end method
