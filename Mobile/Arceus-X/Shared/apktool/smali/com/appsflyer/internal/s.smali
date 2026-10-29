.class public final synthetic Lcom/appsflyer/internal/s;
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

    iput-object p1, p0, Lcom/appsflyer/internal/s;->a:Lcom/appsflyer/internal/AFc1aSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/s;->a:Lcom/appsflyer/internal/AFc1aSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1aSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v0

    return-object v0
.end method
