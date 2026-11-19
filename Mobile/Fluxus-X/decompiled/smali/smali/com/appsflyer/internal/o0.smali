.class public final synthetic Lcom/appsflyer/internal/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/appsflyer/internal/AFc1bSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/o0;->a:Lcom/appsflyer/internal/AFc1bSDK;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/internal/o0;->a:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-static {v0}, Lcom/appsflyer/internal/AFf1uSDK;->a(Lcom/appsflyer/internal/AFc1bSDK;)Lcom/appsflyer/share/AppsFlyerConversionListener;

    move-result-object v0

    return-object v0
.end method
