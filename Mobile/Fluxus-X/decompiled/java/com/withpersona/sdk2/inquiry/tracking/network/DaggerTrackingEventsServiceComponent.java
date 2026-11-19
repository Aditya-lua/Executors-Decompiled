package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import bq.d;
import bq.f;
import bq.g;
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
import hn.w;
import java.util.Map;
import java.util.Set;
import mo.b;
import mo.e;
import mo.k;
import mo.r;
import mo.s;
import mo.z;
import mv.a0;
import mv.d0;
import sw.y;
import wt.c;
import wt.h;
import wt.i;
import wt.j;

/* JADX INFO: loaded from: classes3.dex */
public final class DaggerTrackingEventsServiceComponent {

    public static final class Builder {
        private e deviceModule;
        private NetworkCoreModule networkCoreModule;
        private TrackingEventsServiceModule trackingEventsServiceModule;

        public TrackingEventsServiceComponent build() {
            h.a(this.networkCoreModule, NetworkCoreModule.class);
            h.a(this.trackingEventsServiceModule, TrackingEventsServiceModule.class);
            if (this.deviceModule == null) {
                this.deviceModule = new e();
            }
            return new TrackingEventsServiceComponentImpl(this.networkCoreModule, this.trackingEventsServiceModule, this.deviceModule);
        }

        public Builder deviceModule(e eVar) {
            this.deviceModule = (e) h.b(eVar);
            return this;
        }

        public Builder networkCoreModule(NetworkCoreModule networkCoreModule) {
            this.networkCoreModule = (NetworkCoreModule) h.b(networkCoreModule);
            return this;
        }

        public Builder trackingEventsServiceModule(TrackingEventsServiceModule trackingEventsServiceModule) {
            this.trackingEventsServiceModule = (TrackingEventsServiceModule) h.b(trackingEventsServiceModule);
            return this;
        }

        private Builder() {
        }
    }

    public static final class TrackingEventsServiceComponentImpl implements TrackingEventsServiceComponent {
        i<k> appSetIdHelperProvider;
        i<b> deviceInfoProvider;
        i<bq.e.a> factoryProvider;
        i<a0> interceptorProvider;
        i<String> keyInflectionProvider;
        i<bq.b> loggerProvider;
        i<Map<String, String>> mapOfStringAndStringProvider;
        i<w> moshiProvider;
        i<NetworkStateManager> networkStateManagerProvider;
        i<d0> okhttpClientProvider;
        i<Context> provideContextProvider;
        i<TrackingEventsServiceApi> provideTrackingEventsServiceApiProvider;
        i<r> realDeviceInfoProvider;
        i<z> realDeviceVendorIDProvider;
        i<a0> responseInterceptorProvider;
        i<y> retrofitProvider;
        i<String> serverEndpointProvider;
        i<Set<a0>> setOfInterceptorProvider;
        i<Set<JsonAdapterBinding<?>>> setOfJsonAdapterBindingOfProvider;
        i<Set<hn.h.e>> setOfJsonAdapterFactoryProvider;
        i<Set<Object>> setOfObjectProvider;
        f subsystemLoggerProvider;
        private final TrackingEventsServiceComponentImpl trackingEventsServiceComponentImpl = this;
        i<TrackingEventsService> trackingEventsServiceProvider;
        i<String> useServerStylesProvider;

        public TrackingEventsServiceComponentImpl(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            initialize(networkCoreModule, trackingEventsServiceModule, eVar);
        }

        private void initialize(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            this.serverEndpointProvider = TrackingEventsServiceModule_ServerEndpointFactory.create(trackingEventsServiceModule);
            i<NetworkStateManager> iVarC = c.c(NetworkStateManager_Factory.create());
            this.networkStateManagerProvider = iVarC;
            this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, iVarC);
            this.setOfObjectProvider = setOfObjectBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.setOfJsonAdapterBindingOfProvider = setOfJsonAdapterBindingOfBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            j<hn.h.e> ofJsonAdapterFactoryBuilder = setOfJsonAdapterFactoryBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.setOfJsonAdapterFactoryProvider = ofJsonAdapterFactoryBuilder;
            i<w> iVarC2 = c.c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.setOfObjectProvider, this.setOfJsonAdapterBindingOfProvider, ofJsonAdapterFactoryBuilder));
            this.moshiProvider = iVarC2;
            this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, iVarC2);
            this.setOfInterceptorProvider = setOfInterceptorBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.mapOfStringAndStringProvider = mapOfStringAndStringBuilder(networkCoreModule, trackingEventsServiceModule, eVar);
            TrackingEventsServiceModule_ProvideContextFactory trackingEventsServiceModule_ProvideContextFactoryCreate = TrackingEventsServiceModule_ProvideContextFactory.create(trackingEventsServiceModule);
            this.provideContextProvider = trackingEventsServiceModule_ProvideContextFactoryCreate;
            mo.a0 a0VarA = mo.a0.a(trackingEventsServiceModule_ProvideContextFactoryCreate);
            this.realDeviceVendorIDProvider = a0VarA;
            this.appSetIdHelperProvider = c.c(mo.f.b(eVar, a0VarA));
            s sVarA = s.a(this.provideContextProvider);
            this.realDeviceInfoProvider = sVarA;
            this.deviceInfoProvider = c.c(mo.h.a(eVar, sVarA));
            d dVarA = d.a(this.provideContextProvider);
            this.loggerProvider = dVarA;
            f fVarA = f.a(dVarA);
            this.subsystemLoggerProvider = fVarA;
            i<bq.e.a> iVarA = g.a(fVarA);
            this.factoryProvider = iVarA;
            NetworkCoreModule_OkhttpClientFactory networkCoreModule_OkhttpClientFactoryCreate = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.setOfInterceptorProvider, this.mapOfStringAndStringProvider, this.provideContextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, iVarA, this.networkStateManagerProvider);
            this.okhttpClientProvider = networkCoreModule_OkhttpClientFactoryCreate;
            i<y> iVarC3 = c.c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.serverEndpointProvider, networkCoreModule_OkhttpClientFactoryCreate, this.moshiProvider));
            this.retrofitProvider = iVarC3;
            i<TrackingEventsServiceApi> iVarC4 = c.c(TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory.create(trackingEventsServiceModule, iVarC3));
            this.provideTrackingEventsServiceApiProvider = iVarC4;
            this.trackingEventsServiceProvider = c.c(TrackingEventsService_Factory.create(iVarC4));
        }

        public wt.g<String, String> mapOfStringAndStringBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            wt.g.b bVarB = wt.g.b(3);
            bVarB.c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            bVarB.c("Key-Inflection", this.keyInflectionProvider);
            bVarB.c("Persona-Use-Mobile-Server-Styles", this.useServerStylesProvider);
            return bVarB.b();
        }

        public j<a0> setOfInterceptorBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            j.b bVarA = j.a(2, 0);
            bVarA.b(this.responseInterceptorProvider);
            bVarA.b(this.interceptorProvider);
            return bVarA.c();
        }

        public j<JsonAdapterBinding<?>> setOfJsonAdapterBindingOfBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            j.b bVarA = j.a(0, 1);
            bVarA.a(TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory.create());
            return bVarA.c();
        }

        public j<hn.h.e> setOfJsonAdapterFactoryBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            j.b bVarA = j.a(0, 2);
            bVarA.a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            bVarA.a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            return bVarA.c();
        }

        public j<Object> setOfObjectBuilder(NetworkCoreModule networkCoreModule, TrackingEventsServiceModule trackingEventsServiceModule, e eVar) {
            j.b bVarA = j.a(0, 1);
            bVarA.a(TrackingEventsServiceModule_ProvideMoshiJsonAdapterFactory.create());
            return bVarA.c();
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
