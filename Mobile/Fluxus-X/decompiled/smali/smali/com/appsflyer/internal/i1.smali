.class public final synthetic Lcom/appsflyer/internal/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFj1sSDK;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/i1;->a:Lcom/appsflyer/internal/AFj1sSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/i1;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/appsflyer/internal/i1;->c:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/appsflyer/internal/i1;->a:Lcom/appsflyer/internal/AFj1sSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/i1;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/appsflyer/internal/i1;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/appsflyer/internal/AFj1sSDK;->c(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method
