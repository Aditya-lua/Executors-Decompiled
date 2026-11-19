.class public final synthetic Lcom/appsflyer/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/logger/LogTag;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/i;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iput-object p2, p0, Lcom/appsflyer/i;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/appsflyer/i;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/i;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v1, p0, Lcom/appsflyer/i;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/appsflyer/i;->c:Z

    check-cast p1, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    invoke-static {v0, v1, v2, p1}, Lcom/appsflyer/AFLogger;->h(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
