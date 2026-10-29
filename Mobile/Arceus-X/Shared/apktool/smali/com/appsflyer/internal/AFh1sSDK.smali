.class public interface abstract Lcom/appsflyer/internal/AFh1sSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract AFLogger()V
.end method

.method public abstract D_(Landroid/content/Intent;Lcom/appsflyer/internal/AFa1qSDK;)V
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/internal/AFa1qSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract d()V
.end method

.method public abstract d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract registerClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract registerClient()Z
.end method

.method public abstract unregisterClient(Lcom/appsflyer/internal/AFf1uSDK;Lkotlin/jvm/functions/Function0;)V
    .param p1    # Lcom/appsflyer/internal/AFf1uSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFf1uSDK;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .param p1    # Lcom/appsflyer/internal/AFh1pSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract unregisterClient()Z
.end method
