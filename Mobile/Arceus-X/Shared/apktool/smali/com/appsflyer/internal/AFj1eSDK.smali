.class public final Lcom/appsflyer/internal/AFj1eSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1cSDK;


# instance fields
.field private final AFKeystoreWrapper:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/appsflyer/internal/g1;

    invoke-direct {v0}, Lcom/appsflyer/internal/g1;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    return-void
.end method

.method private static final AFKeystoreWrapper()Lcom/appsflyer/share/platform_extension/PluginInfo;
    .locals 6

    new-instance v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    sget-object v1, Lcom/appsflyer/share/platform_extension/Plugin;->NATIVE:Lcom/appsflyer/share/platform_extension/Plugin;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "7.0.1"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/share/platform_extension/PluginInfo;-><init>(Lcom/appsflyer/share/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic a()Lcom/appsflyer/share/platform_extension/PluginInfo;
    .locals 1

    invoke-static {}, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper()Lcom/appsflyer/share/platform_extension/PluginInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final AFLogger()Ljava/util/Map;
    .locals 3
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

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getPlugin()Lcom/appsflyer/share/platform_extension/Plugin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/Plugin;->getPluginName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "platform"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v1}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/share/platform_extension/PluginInfo;

    :cond_1
    invoke-virtual {v1}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getVersion()Ljava/lang/String;

    move-result-object v1

    const-string v2, "version"

    invoke-static {v2, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    filled-new-array {v0, v1}, [Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/k0;->n([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v1}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/share/platform_extension/PluginInfo;

    :cond_2
    invoke-virtual {v1}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getAdditionalParams()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v1}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/share/platform_extension/PluginInfo;

    :cond_3
    invoke-virtual {v1}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getAdditionalParams()Ljava/util/Map;

    move-result-object v1

    const-string v2, "extras"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v0
.end method

.method public final registerClient(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .locals 1
    .param p1    # Lcom/appsflyer/share/platform_extension/PluginInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    return-void
.end method

.method public final unregisterClient()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getPlugin()Lcom/appsflyer/share/platform_extension/Plugin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/Plugin;->getPluginName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
