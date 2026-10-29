.class public final synthetic Lcom/appsflyer/internal/t;
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

    iput-object p1, p0, Lcom/appsflyer/internal/t;->a:Lcom/appsflyer/internal/AFc1aSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/t;->a:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->enableTCFDataCollection()Lcom/appsflyer/internal/AFa1qSDK;

    move-result-object v0

    return-object v0
.end method
