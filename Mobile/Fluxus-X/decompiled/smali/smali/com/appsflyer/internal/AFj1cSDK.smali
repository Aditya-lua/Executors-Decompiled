.class public interface abstract Lcom/appsflyer/internal/AFj1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract AFLogger()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract registerClient(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .param p1    # Lcom/appsflyer/share/platform_extension/PluginInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract unregisterClient()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
