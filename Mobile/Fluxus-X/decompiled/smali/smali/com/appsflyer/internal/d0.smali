.class public final synthetic Lcom/appsflyer/internal/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFd1jSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFd1jSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/d0;->a:Lcom/appsflyer/internal/AFd1jSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/d0;->a:Lcom/appsflyer/internal/AFd1jSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFd1jSDK;->b(Lcom/appsflyer/internal/AFd1jSDK;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
