.class public final Lcom/appsflyer/internal/AFj1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFj1hSDK$AFa1tSDK;
    }
.end annotation


# instance fields
.field private final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
            "Lcom/appsflyer/internal/AFj1gSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    return-void
.end method

.method private static AFLogger(Ljava/lang/String;)Z
    .locals 0

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    .locals 3
    .param p1    # Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/internal/AFj1gSDK;

    if-nez v0, :cond_0

    sget-object v0, Lcom/appsflyer/internal/AFj1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1gSDK;

    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFj1hSDK$AFa1tSDK;->AFLogger:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 p1, 0x2

    if-eq v0, p1, :cond_2

    const/4 p1, 0x3

    if-ne v0, p1, :cond_1

    return v1

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_2
    return v2

    :cond_3
    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->getRegisteredFeatures()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    sget-object v2, Lcom/appsflyer/internal/AFj1gSDK;->registerClient:Lcom/appsflyer/internal/AFj1gSDK;

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_4
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->getClassName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1hSDK;->AFLogger(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    if-eqz v0, :cond_5

    sget-object v2, Lcom/appsflyer/internal/AFj1gSDK;->AFLogger:Lcom/appsflyer/internal/AFj1gSDK;

    goto :goto_0

    :cond_5
    sget-object v2, Lcom/appsflyer/internal/AFj1gSDK;->registerClient:Lcom/appsflyer/internal/AFj1gSDK;

    :goto_0
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method
