.class public final synthetic Lcom/appsflyer/internal/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFj1sSDK;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/j1;->a:Lcom/appsflyer/internal/AFj1sSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/j1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/j1;->a:Lcom/appsflyer/internal/AFj1sSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/j1;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFj1sSDK;->a(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
