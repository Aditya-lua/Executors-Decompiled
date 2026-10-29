package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager_Factory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import java.util.Map;
import java.util.Set;
import np.C9539b;
import np.C9541d;
import np.C9542e;
import np.C9543f;
import np.C9544g;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p136ft.C5829c;
import p136ft.C5833g;
import p136ft.C5834h;
import p136ft.C5836j;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p582yn.C13235a0;
import p582yn.C13242e;
import p582yn.C13243f;
import p582yn.C13245h;
import p582yn.C13255r;
import p582yn.C13256s;
import p582yn.C13263z;
import p582yn.InterfaceC13236b;
import p582yn.InterfaceC13248k;

/* JADX INFO: loaded from: classes3.dex */
public final class DaggerTrackingEventsServiceComponent {

    public static final class Builder {
        private C13242e deviceModule;
        private NetworkCoreModule networkCoreModule;
        private TrackingEventsServiceModule trackingEventsServiceModule;

        public TrackingEventsServiceComponent build() {
            C5834h.m26190a(this.networkCoreModule, NetworkCoreModule.class);
            C5834h.m26190a(this.trackingEventsServiceModule, TrackingEventsServiceModule.class);
            if (this.deviceModule == null) {
                this.deviceModule = new C13242e();
            }
            return new TrackingEventsServiceComponentImpl(this.networkCoreModule, this.trackingEventsServiceModule, this.deviceModule);
        }

        public Builder deviceModule(C13242e c13242e) {
            this.deviceModule = (C13242e) C5834h.m26191b(c13242e);
            return this;
        }

        public Builder networkCoreModule(NetworkCoreModule networkCoreModule) {
            this.networkCoreModule = (NetworkCoreModule) C5834h.m26191b(networkCoreModule);
            return this;
        }

        public Builder trackingEventsServiceModule(TrackingEventsServiceModule trackingEventsServiceModule) {
            this.trackingEventsServiceModule = (TrackingEventsServiceModule) C5834h.m26191b(trackingEventsServiceModule);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Builder() {
        }
    }

    public static final class TrackingEventsServiceComponentImpl implements TrackingEventsServiceComponent {
        InterfaceC5835i<InterfaceC13248k> appSetIdHelperProvider;
        InterfaceC5835i<InterfaceC13236b> deviceInfoProvider;
        InterfaceC5835i<C9542e.a> factoryProvider;
        InterfaceC5835i<Interceptor> interceptorProvider;
        InterfaceC5835i<String> keyInflectionProvider;
        InterfaceC5835i<C9539b> loggerProvider;
        InterfaceC5835i<Map<String, String>> mapOfStringAndStringProvider;
        InterfaceC5835i<C11888w> moshiProvider;
        InterfaceC5835i<NetworkStateManager> networkStateManagerProvider;
        InterfaceC5835i<OkHttpClient> okhttpClientProvider;
        InterfaceC5835i<Context> provideContextProvider;
        InterfaceC5835i<TrackingEventsServiceApi> provideTrackingEventsServiceApiProvider;
        InterfaceC5835i<C13255r> realDeviceInfoProvider;
        InterfaceC5835i<C13263z> realDeviceVendorIDProvider;
        InterfaceC5835i<Interceptor> responseInterceptorProvider;
        InterfaceC5835i<C7397y> retrofitProvider;
        InterfaceC5835i<String> serverEndpointProvider;
        InterfaceC5835i<Set<Interceptor>> setOfInterceptorProvider;
        InterfaceC5835i<Set<JsonAdapterBinding<?>>> setOfJsonAdapterBindingOfProvider;
        InterfaceC5835i<Set<AbstractC11873h.e>> setOfJsonAdapterFactoryProvider;
        InterfaceC5835i<Set<Object>> setOfObjectProvider;
        C9543f subsystemLoggerProvider;
        private final TrackingEventsServiceComponentImpl trackingEventsServiceComponentImpl = this;
        InterfaceC5835i<TrackingEventsService> trackingEventsServiceProvider;
        InterfaceC5835i<String> useServerStylesProvider;

        public TrackingEventsServiceComponentImpl(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            initialize(networkCoreModule, trackingEventsServiceModule, c13242e);
        }

        private void initialize(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            this.serverEndpointProvider = TrackingEventsServiceModule_ServerEndpointFactory.create(trackingEventsServiceModule);
            InterfaceC5835i<NetworkStateManager> interfaceC5835iM26179c = C5829c.m26179c(NetworkStateManager_Factory.create());
            this.networkStateManagerProvider = interfaceC5835iM26179c;
            this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, interfaceC5835iM26179c);
            this.setOfObjectProvider = setOfObjectBuilder(networkCoreModule, trackingEventsServiceModule, c13242e);
            this.setOfJsonAdapterBindingOfProvider = setOfJsonAdapterBindingOfBuilder(networkCoreModule, trackingEventsServiceModule, c13242e);
            C5836j<AbstractC11873h.e> ofJsonAdapterFactoryBuilder = setOfJsonAdapterFactoryBuilder(networkCoreModule, trackingEventsServiceModule, c13242e);
            this.setOfJsonAdapterFactoryProvider = ofJsonAdapterFactoryBuilder;
            InterfaceC5835i<C11888w> interfaceC5835iM26179c2 = C5829c.m26179c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.setOfObjectProvider, this.setOfJsonAdapterBindingOfProvider, ofJsonAdapterFactoryBuilder));
            this.moshiProvider = interfaceC5835iM26179c2;
            this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, interfaceC5835iM26179c2);
            this.setOfInterceptorProvider = setOfInterceptorBuilder(networkCoreModule, trackingEventsServiceModule, c13242e);
            this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.mapOfStringAndStringProvider = mapOfStringAndStringBuilder(networkCoreModule, trackingEventsServiceModule, c13242e);
            TrackingEventsServiceModule_ProvideContextFactory trackingEventsServiceModule_ProvideContextFactoryCreate = TrackingEventsServiceModule_ProvideContextFactory.create(trackingEventsServiceModule);
            this.provideContextProvider = trackingEventsServiceModule_ProvideContextFactoryCreate;
            C13235a0 c13235a0M48950a = C13235a0.m48950a(trackingEventsServiceModule_ProvideContextFactoryCreate);
            this.realDeviceVendorIDProvider = c13235a0M48950a;
            this.appSetIdHelperProvider = C5829c.m26179c(C13243f.m48986b(c13242e, c13235a0M48950a));
            C13256s c13256sM49011a = C13256s.m49011a(this.provideContextProvider);
            this.realDeviceInfoProvider = c13256sM49011a;
            this.deviceInfoProvider = C5829c.m26179c(C13245h.m48991a(c13242e, c13256sM49011a));
            C9541d c9541dM37663a = C9541d.m37663a(this.provideContextProvider);
            this.loggerProvider = c9541dM37663a;
            C9543f c9543fM37668a = C9543f.m37668a(c9541dM37663a);
            this.subsystemLoggerProvider = c9543fM37668a;
            InterfaceC5835i<C9542e.a> interfaceC5835iM37671a = C9544g.m37671a(c9543fM37668a);
            this.factoryProvider = interfaceC5835iM37671a;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.setOfInterceptorProvider, this.mapOfStringAndStringProvider, this.provideContextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, interfaceC5835iM37671a, this.networkStateManagerProvider);
            this.okhttpClientProvider = networkCoreModule_OkhttpClientFactoryCreate;
            InterfaceC5835i<C7397y> interfaceC5835iM26179c3 = C5829c.m26179c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.serverEndpointProvider, networkCoreModule_OkhttpClientFactoryCreate, this.moshiProvider));
            this.retrofitProvider = interfaceC5835iM26179c3;
            InterfaceC5835i<TrackingEventsServiceApi> interfaceC5835iM26179c4 = C5829c.m26179c(C4116xcdd31602.create(trackingEventsServiceModule, interfaceC5835iM26179c3));
            this.provideTrackingEventsServiceApiProvider = interfaceC5835iM26179c4;
            this.trackingEventsServiceProvider = C5829c.m26179c(TrackingEventsService_Factory.create(interfaceC5835iM26179c4));
        }

        public C5833g<String, String> mapOfStringAndStringBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            C5833g.b bVarM26186b = C5833g.m26186b(3);
            bVarM26186b.m26189c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            bVarM26186b.m26189c("Key-Inflection", this.keyInflectionProvider);
            bVarM26186b.m26189c("Persona-Use-Mobile-Server-Styles", this.useServerStylesProvider);
            return bVarM26186b.m26188b();
        }

        public C5836j<Interceptor> setOfInterceptorBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            C5836j.b bVarM26195a = C5836j.m26195a(2, 0);
            bVarM26195a.m26198b(this.responseInterceptorProvider);
            bVarM26195a.m26198b(this.interceptorProvider);
            return bVarM26195a.m26199c();
        }

        public C5836j<JsonAdapterBinding<?>> setOfJsonAdapterBindingOfBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 1);
            bVarM26195a.m26197a(C4115x6e2655ed.create());
            return bVarM26195a.m26199c();
        }

        public C5836j<AbstractC11873h.e> setOfJsonAdapterFactoryBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 2);
            bVarM26195a.m26197a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarM26195a.m26197a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            return bVarM26195a.m26199c();
        }

        public C5836j<Object> setOfObjectBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, C13242e c13242e) {
            C5836j.b bVarM26195a = C5836j.m26195a(0, 1);
            bVarM26195a.m26197a(TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory.create());
            return bVarM26195a.m26199c();
        }

        @Override // com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceComponent
        public TrackingEventsService trackingEventsService() {
            return this.trackingEventsServiceProvider.get();
        }
    }

    private DaggerTrackingEventsServiceComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
