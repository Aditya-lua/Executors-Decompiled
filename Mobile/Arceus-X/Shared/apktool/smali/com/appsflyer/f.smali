.class public final synthetic Lcom/appsflyer/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/logger/LogTag;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/f;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iput-object p2, p0, Lcom/appsflyer/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/f;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v1, p0, Lcom/appsflyer/f;->b:Ljava/lang/String;

    check-cast p1, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    invoke-static {v0, v1, p1}, Lcom/appsflyer/AFLogger;->k(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
