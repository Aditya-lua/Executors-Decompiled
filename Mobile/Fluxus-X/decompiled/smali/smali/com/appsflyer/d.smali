.class public final synthetic Lcom/appsflyer/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/appsflyer/sdk_base/logger/LogTag;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Throwable;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/d;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iput-object p2, p0, Lcom/appsflyer/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/appsflyer/d;->c:Ljava/lang/Throwable;

    iput-boolean p4, p0, Lcom/appsflyer/d;->d:Z

    iput-boolean p5, p0, Lcom/appsflyer/d;->e:Z

    iput-boolean p6, p0, Lcom/appsflyer/d;->f:Z

    iput-boolean p7, p0, Lcom/appsflyer/d;->g:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/appsflyer/d;->a:Lcom/appsflyer/sdk_base/logger/LogTag;

    iget-object v1, p0, Lcom/appsflyer/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/appsflyer/d;->c:Ljava/lang/Throwable;

    iget-boolean v3, p0, Lcom/appsflyer/d;->d:Z

    iget-boolean v4, p0, Lcom/appsflyer/d;->e:Z

    iget-boolean v5, p0, Lcom/appsflyer/d;->f:Z

    iget-boolean v6, p0, Lcom/appsflyer/d;->g:Z

    move-object v7, p1

    check-cast v7, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    invoke-static/range {v0 .. v7}, Lcom/appsflyer/AFLogger;->g(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZLcom/appsflyer/sdk_base/logger/AFLoggerBase;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
