.class final Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrackingEventsServiceComponentImpl"
.end annotation


# instance fields
.field appSetIdHelperProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/k;",
            ">;"
        }
    .end annotation
.end field

.field deviceInfoProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/b;",
            ">;"
        }
    .end annotation
.end field

.field factoryProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnp/e$a;",
            ">;"
        }
    .end annotation
.end field

.field interceptorProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field keyInflectionProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field loggerProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lnp/b;",
            ">;"
        }
    .end annotation
.end field

.field mapOfStringAndStringProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field moshiProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lum/w;",
            ">;"
        }
    .end annotation
.end field

.field networkStateManagerProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field okhttpClientProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field

.field provideContextProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field provideTrackingEventsServiceApiProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceInfoProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/r;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceVendorIDProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/z;",
            ">;"
        }
    .end annotation
.end field

.field responseInterceptorProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field retrofitProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljv/y;",
            ">;"
        }
    .end annotation
.end field

.field serverEndpointProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field setOfInterceptorProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lokhttp3/Interceptor;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterBindingOfProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterFactoryProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfObjectProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field subsystemLoggerProvider:Lnp/f;

.field private final trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

.field trackingEventsServiceProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
            ">;"
        }
    .end annotation
.end field

.field useServerStylesProvider:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)V

    return-void
.end method

.method private initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)V
    .locals 8

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Lft/i;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;

    move-result-object v0

    invoke-static {v0}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Lft/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Lft/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Lft/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Lft/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryProvider:Lft/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Lft/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Lft/i;

    invoke-static {p1, v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;

    move-result-object v0

    invoke-static {v0}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Lft/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Lft/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Lft/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/g;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Lft/i;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lft/i;

    invoke-static {v0}, Lyn/a0;->a(Lft/i;)Lyn/a0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceVendorIDProvider:Lft/i;

    invoke-static {p3, v0}, Lyn/f;->b(Lyn/e;Lft/i;)Lyn/f;

    move-result-object v0

    invoke-static {v0}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Lft/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lft/i;

    invoke-static {v0}, Lyn/s;->a(Lft/i;)Lyn/s;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceInfoProvider:Lft/i;

    invoke-static {p3, v0}, Lyn/h;->a(Lyn/e;Lft/i;)Lyn/h;

    move-result-object p3

    invoke-static {p3}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Lft/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lft/i;

    invoke-static {p3}, Lnp/d;->a(Lft/i;)Lnp/d;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->loggerProvider:Lft/i;

    invoke-static {p3}, Lnp/f;->a(Lft/i;)Lnp/f;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->subsystemLoggerProvider:Lnp/f;

    invoke-static {p3}, Lnp/g;->a(Lnp/f;)Lft/i;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->factoryProvider:Lft/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Lft/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Lft/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lft/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Lft/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Lft/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Lft/i;

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->okhttpClientProvider:Lft/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Lft/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Lft/i;

    invoke-static {v0, p3, p1, v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;

    move-result-object p1

    invoke-static {p1}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->retrofitProvider:Lft/i;

    invoke-static {p2, p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lft/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;

    move-result-object p1

    invoke-static {p1}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideTrackingEventsServiceApiProvider:Lft/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->create(Lft/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;

    move-result-object p1

    invoke-static {p1}, Lft/c;->c(Lft/i;)Lft/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Lft/i;

    return-void
.end method


# virtual methods
.method public mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lyn/e;",
            ")",
            "Lft/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x3

    invoke-static {p1}, Lft/g;->b(I)Lft/g$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;

    move-result-object p2

    const-string p3, "User-Agent"

    invoke-virtual {p1, p3, p2}, Lft/g$b;->c(Ljava/lang/Object;Lft/i;)Lft/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Lft/i;

    const-string p3, "Key-Inflection"

    invoke-virtual {p1, p3, p2}, Lft/g$b;->c(Ljava/lang/Object;Lft/i;)Lft/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Lft/i;

    const-string p3, "Persona-Use-Mobile-Server-Styles"

    invoke-virtual {p1, p3, p2}, Lft/g$b;->c(Ljava/lang/Object;Lft/i;)Lft/g$b;

    invoke-virtual {p1}, Lft/g$b;->b()Lft/g;

    move-result-object p1

    return-object p1
.end method

.method public setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lyn/e;",
            ")",
            "Lft/j<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lft/j;->a(II)Lft/j$b;

    move-result-object p1

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Lft/i;

    invoke-virtual {p1, p2}, Lft/j$b;->b(Lft/i;)Lft/j$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Lft/i;

    invoke-virtual {p1, p2}, Lft/j$b;->b(Lft/i;)Lft/j$b;

    invoke-virtual {p1}, Lft/j$b;->c()Lft/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lyn/e;",
            ")",
            "Lft/j<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lft/j;->a(II)Lft/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lft/j$b;->a(Lft/i;)Lft/j$b;

    invoke-virtual {p1}, Lft/j$b;->c()Lft/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lyn/e;",
            ")",
            "Lft/j<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lft/j;->a(II)Lft/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lft/j$b;->a(Lft/i;)Lft/j$b;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lft/j$b;->a(Lft/i;)Lft/j$b;

    invoke-virtual {p1}, Lft/j$b;->c()Lft/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lyn/e;)Lft/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lyn/e;",
            ")",
            "Lft/j<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lft/j;->a(II)Lft/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lft/j$b;->a(Lft/i;)Lft/j$b;

    invoke-virtual {p1}, Lft/j$b;->c()Lft/j;

    move-result-object p1

    return-object p1
.end method

.method public trackingEventsService()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    return-object v0
.end method
