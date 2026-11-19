.class public abstract Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;
.super Lcom/appsflyer/sdk_base/util/BaseInitProvider;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H$J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;",
        "Lcom/appsflyer/sdk_base/util/BaseInitProvider;",
        "<init>",
        "()V",
        "getFeature",
        "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
        "onCreate",
        "",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/appsflyer/sdk_base/util/BaseInitProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getFeature()Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public onCreate()Z
    .locals 5

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget-object v2, Lcom/appsflyer/sdk_base/util/BaseInitProvider;->Companion:Lcom/appsflyer/sdk_base/util/BaseInitProvider$Companion;

    invoke-virtual {v2, v0}, Lcom/appsflyer/sdk_base/util/BaseInitProvider$Companion;->isMainProcess(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;->getFeature()Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    move-result-object v0

    const-string v2, "Init_Provider"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Registering optional feature: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    invoke-virtual {v2, v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->addOptionalFeature(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return v1
.end method
