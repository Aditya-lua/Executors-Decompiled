.class public interface abstract Lcom/appsflyer/internal/AFc1vSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract AFKeystoreWrapper()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFc1sSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract AFLogger(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract d()V
.end method

.method public abstract registerClient(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;
    .param p1    # Lcom/appsflyer/internal/AFc1sSDK;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract unregisterClient()V
.end method
