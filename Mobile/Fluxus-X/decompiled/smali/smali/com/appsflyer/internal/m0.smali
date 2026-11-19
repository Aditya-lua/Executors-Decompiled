.class public final synthetic Lcom/appsflyer/internal/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFf1kSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFf1kSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/m0;->a:Lcom/appsflyer/internal/AFf1kSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/m0;->a:Lcom/appsflyer/internal/AFf1kSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFf1kSDK;->b(Lcom/appsflyer/internal/AFf1kSDK;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
