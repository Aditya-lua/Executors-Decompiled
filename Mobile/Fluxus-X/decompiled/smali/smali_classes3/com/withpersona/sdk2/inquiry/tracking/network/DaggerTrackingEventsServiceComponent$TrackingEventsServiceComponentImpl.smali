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
.field appSetIdHelperProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/k;",
            ">;"
        }
    .end annotation
.end field

.field deviceInfoProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/b;",
            ">;"
        }
    .end annotation
.end field

.field factoryProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/e$a;",
            ">;"
        }
    .end annotation
.end field

.field interceptorProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmv/a0;",
            ">;"
        }
    .end annotation
.end field

.field keyInflectionProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field loggerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lbq/b;",
            ">;"
        }
    .end annotation
.end field

.field mapOfStringAndStringProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field moshiProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lhn/w;",
            ">;"
        }
    .end annotation
.end field

.field networkStateManagerProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
            ">;"
        }
    .end annotation
.end field

.field okhttpClientProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmv/d0;",
            ">;"
        }
    .end annotation
.end field

.field provideContextProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field provideTrackingEventsServiceApiProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceInfoProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/r;",
            ">;"
        }
    .end annotation
.end field

.field realDeviceVendorIDProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmo/z;",
            ">;"
        }
    .end annotation
.end field

.field responseInterceptorProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lmv/a0;",
            ">;"
        }
    .end annotation
.end field

.field retrofitProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lsw/y;",
            ">;"
        }
    .end annotation
.end field

.field serverEndpointProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field setOfInterceptorProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lmv/a0;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterBindingOfProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field setOfJsonAdapterFactoryProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;>;"
        }
    .end annotation
.end field

.field setOfObjectProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field subsystemLoggerProvider:Lbq/f;

.field private final trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

.field trackingEventsServiceProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
            ">;"
        }
    .end annotation
.end field

.field useServerStylesProvider:Lwt/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwt/i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceComponentImpl:Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;

    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)V

    return-void
.end method

.method private initialize(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)V
    .locals 8

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ServerEndpointFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Lwt/i;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;

    move-result-object v0

    invoke-static {v0}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Lwt/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ResponseInterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Lwt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Lwt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Lwt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterFactoryProvider:Lwt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfObjectProvider:Lwt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfJsonAdapterBindingOfProvider:Lwt/i;

    invoke-static {p1, v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_MoshiFactory;

    move-result-object v0

    invoke-static {v0}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Lwt/i;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_InterceptorFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Lwt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_KeyInflectionFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_UseServerStylesFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Lwt/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/g;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Lwt/i;

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideContextFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lwt/i;

    invoke-static {v0}, Lmo/a0;->a(Lwt/i;)Lmo/a0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceVendorIDProvider:Lwt/i;

    invoke-static {p3, v0}, Lmo/f;->b(Lmo/e;Lwt/i;)Lmo/f;

    move-result-object v0

    invoke-static {v0}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Lwt/i;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lwt/i;

    invoke-static {v0}, Lmo/s;->a(Lwt/i;)Lmo/s;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->realDeviceInfoProvider:Lwt/i;

    invoke-static {p3, v0}, Lmo/h;->a(Lmo/e;Lwt/i;)Lmo/h;

    move-result-object p3

    invoke-static {p3}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Lwt/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lwt/i;

    invoke-static {p3}, Lbq/d;->a(Lwt/i;)Lbq/d;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->loggerProvider:Lwt/i;

    invoke-static {p3}, Lbq/f;->a(Lwt/i;)Lbq/f;

    move-result-object p3

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->subsystemLoggerProvider:Lbq/f;

    invoke-static {p3}, Lbq/g;->a(Lbq/f;)Lwt/i;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->factoryProvider:Lwt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->setOfInterceptorProvider:Lwt/i;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->mapOfStringAndStringProvider:Lwt/i;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideContextProvider:Lwt/i;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->appSetIdHelperProvider:Lwt/i;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->deviceInfoProvider:Lwt/i;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->networkStateManagerProvider:Lwt/i;

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_OkhttpClientFactory;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->okhttpClientProvider:Lwt/i;

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->serverEndpointProvider:Lwt/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->moshiProvider:Lwt/i;

    invoke-static {v0, p3, p1, v1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;->create(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lwt/i;Lwt/i;Lwt/i;)Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_RetrofitFactory;

    move-result-object p1

    invoke-static {p1}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->retrofitProvider:Lwt/i;

    invoke-static {p2, p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;->create(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lwt/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory;

    move-result-object p1

    invoke-static {p1}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->provideTrackingEventsServiceApiProvider:Lwt/i;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;->create(Lwt/i;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService_Factory;

    move-result-object p1

    invoke-static {p1}, Lwt/c;->c(Lwt/i;)Lwt/i;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Lwt/i;

    return-void
.end method


# virtual methods
.method public mapOfStringAndStringBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lmo/e;",
            ")",
            "Lwt/g<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x3

    invoke-static {p1}, Lwt/g;->b(I)Lwt/g$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_UserAgentFactory;

    move-result-object p2

    const-string p3, "User-Agent"

    invoke-virtual {p1, p3, p2}, Lwt/g$b;->c(Ljava/lang/Object;Lwt/i;)Lwt/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->keyInflectionProvider:Lwt/i;

    const-string p3, "Key-Inflection"

    invoke-virtual {p1, p3, p2}, Lwt/g$b;->c(Ljava/lang/Object;Lwt/i;)Lwt/g$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->useServerStylesProvider:Lwt/i;

    const-string p3, "Persona-Use-Mobile-Server-Styles"

    invoke-virtual {p1, p3, p2}, Lwt/g$b;->c(Ljava/lang/Object;Lwt/i;)Lwt/g$b;

    invoke-virtual {p1}, Lwt/g$b;->b()Lwt/g;

    move-result-object p1

    return-object p1
.end method

.method public setOfInterceptorBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lmo/e;",
            ")",
            "Lwt/j<",
            "Lmv/a0;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x2

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lwt/j;->a(II)Lwt/j$b;

    move-result-object p1

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->responseInterceptorProvider:Lwt/i;

    invoke-virtual {p1, p2}, Lwt/j$b;->b(Lwt/i;)Lwt/j$b;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->interceptorProvider:Lwt/i;

    invoke-virtual {p1, p2}, Lwt/j$b;->b(Lwt/i;)Lwt/j$b;

    invoke-virtual {p1}, Lwt/j$b;->c()Lwt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterBindingOfBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lmo/e;",
            ")",
            "Lwt/j<",
            "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding<",
            "*>;>;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lwt/j;->a(II)Lwt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwt/j$b;->a(Lwt/i;)Lwt/j$b;

    invoke-virtual {p1}, Lwt/j$b;->c()Lwt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfJsonAdapterFactoryBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lmo/e;",
            ")",
            "Lwt/j<",
            "Lhn/h$e;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lwt/j;->a(II)Lwt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwt/j$b;->a(Lwt/i;)Lwt/j$b;

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;->create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwt/j$b;->a(Lwt/i;)Lwt/j$b;

    invoke-virtual {p1}, Lwt/j$b;->c()Lwt/j;

    move-result-object p1

    return-object p1
.end method

.method public setOfObjectBuilder(Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;Lmo/e;)Lwt/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/network/core/NetworkCoreModule;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;",
            "Lmo/e;",
            ")",
            "Lwt/j<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lwt/j;->a(II)Lwt/j$b;

    move-result-object p1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;->create()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwt/j$b;->a(Lwt/i;)Lwt/j$b;

    invoke-virtual {p1}, Lwt/j$b;->c()Lwt/j;

    move-result-object p1

    return-object p1
.end method

.method public trackingEventsService()Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/DaggerTrackingEventsServiceComponent$TrackingEventsServiceComponentImpl;->trackingEventsServiceProvider:Lwt/i;

    invoke-interface {v0}, Lyt/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    return-object v0
.end method
