.class public final synthetic Lcom/appsflyer/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;


# direct methods
.method public synthetic constructor <init>([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/e;->a:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/e;->a:[Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->m([Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V

    return-void
.end method
