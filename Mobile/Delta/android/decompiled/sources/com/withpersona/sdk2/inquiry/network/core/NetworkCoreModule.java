package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jv.y;
import kotlin.Unit;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.w;
import yn.k;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkCoreModule {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private String certificateFingerprint;

    @Nullable
    private String environmentId;

    @Nullable
    private final String locale;
    private final boolean redactAppIdentifyingInformation;

    @Nullable
    private final String styleVariant;
    private final boolean useServerStyle;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<h.e> provideMoshiJsonAdapterFactory() {
            return q0.g(ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter());
        }

        private Companion() {
        }
    }

    public static final class NetworkConstants {

        @NotNull
        public static final String HEADER_KEY_PERSONA_ENVIRONMENT_ID = "Persona-Environment-Id";

        @NotNull
        public static final String HEADER_KEY_PERSONA_ORGANIZATION_ID = "Persona-Organization-Id";

        @NotNull
        public static final NetworkConstants INSTANCE = new NetworkConstants();

        private NetworkConstants() {
        }
    }

    public NetworkCoreModule(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.useServerStyle = z10;
        this.environmentId = str;
        this.locale = str2;
        this.styleVariant = str3;
        this.redactAppIdentifyingInformation = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response interceptor$lambda$10(w wVar, Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e10) {
            Response.Builder builderCode = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage = e10.getLocalizedMessage();
            return builderCode.message(localizedMessage != null ? localizedMessage : "").body(ResponseBody.INSTANCE.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e10.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (SocketTimeoutException e11) {
            Response.Builder builderCode2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage2 = e11.getLocalizedMessage();
            return builderCode2.message(localizedMessage2 != null ? localizedMessage2 : "").body(ResponseBody.INSTANCE.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e11.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (UnknownHostException e12) {
            Response.Builder builderCode3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage3 = e12.getLocalizedMessage();
            return builderCode3.message(localizedMessage3 != null ? localizedMessage3 : "").body(ResponseBody.INSTANCE.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e12.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (IOException e13) {
            Response.Builder builderCode4 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage4 = e13.getLocalizedMessage();
            return builderCode4.message(localizedMessage4 != null ? localizedMessage4 : "").body(ResponseBody.INSTANCE.create(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e13.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit okhttpClient$lambda$0(NetworkCoreModule networkCoreModule, String str) {
        networkCoreModule.certificateFingerprint = str;
        return Unit.f22483a;
    }

    @NotNull
    public static final Set<h.e> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response responseInterceptor$lambda$9(NetworkStateManager networkStateManager, NetworkCoreModule networkCoreModule, Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        String str = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (str != null) {
            networkStateManager.setOrganizationId(str);
        }
        String str2 = responseProceed.headers().get(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (str2 != null) {
            networkCoreModule.environmentId = str2;
        }
        return responseProceed;
    }

    @NotNull
    public final Interceptor interceptor(@NotNull final w wVar) {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.interceptor$lambda$10(wVar, chain);
            }
        };
    }

    @NotNull
    public final String keyInflection() {
        return "camel";
    }

    @NotNull
    public final w moshi(@NotNull Set<Object> set, @NotNull Set<JsonAdapterBinding<?>> set2, @NotNull Set<h.e> set3) {
        w.b bVar = new w.b();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            bVar.a(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.b(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            bVar.c((h.e) it3.next());
        }
        return bVar.d();
    }

    @NotNull
    public final OkHttpClient okhttpClient(@NotNull Set<Interceptor> set, @NotNull final Map<String, String> map, @NotNull final Context context, @NotNull final k kVar, @NotNull final yn.b bVar, @NotNull final np.e.a aVar, @NotNull final NetworkStateManager networkStateManager) {
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().eventListener(new b(new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkCoreModule.okhttpClient$lambda$0(this.f12172a, (String) obj);
            }
        })).addNetworkInterceptor(new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                if (!chain.request().headers().names().contains("Accept")) {
                    builderNewBuilder = builderNewBuilder.header("Accept", "application/json");
                }
                Request.Builder builderHeader = builderNewBuilder.header("Persona-Version", "2025-11-18").header("Persona-Device-Manufacturer", bVar.c()).header("Persona-Device-Model", bVar.b()).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", bVar.d()).header("VTDGJLGG", String.valueOf(bVar.a()));
                String str = this.styleVariant;
                if (str == null) {
                    str = (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light";
                }
                Request.Builder builderHeader2 = builderHeader.header("Persona-Style-Variant", str);
                String string = this.locale;
                if (string == null) {
                    string = Locale.getDefault().toString();
                }
                Request.Builder builderHeader3 = builderHeader2.header("Persona-Device-Locale", string);
                if (!this.redactAppIdentifyingInformation) {
                    builderHeader3.header("Persona-App-Bundle", context.getPackageName());
                    builderHeader3.header("Persona-Device-Vendor-Id", kVar.b());
                }
                String organizationId = networkStateManager.getOrganizationId();
                if (organizationId != null) {
                    builderHeader3.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, organizationId);
                }
                String str2 = this.environmentId;
                if (str2 != null) {
                    builderHeader3.header(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    builderHeader3.header((String) entry.getKey(), (String) entry.getValue());
                }
                String str3 = this.certificateFingerprint;
                if (str3 != null) {
                    builderHeader3.header("BMRWJMTB", str3);
                }
                return chain.proceed(a.a(a.f12167a, builderHeader3.build(), aVar.create(NetworkUtilsKt.SUBSYSTEM), 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        OkHttpClient.Builder builderConnectTimeout = builderAddNetworkInterceptor.readTimeout(1L, timeUnit).writeTimeout(1L, timeUnit).connectTimeout(1L, timeUnit);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderConnectTimeout.addInterceptor((Interceptor) it.next());
        }
        return builderConnectTimeout.build();
    }

    @NotNull
    public final Interceptor responseInterceptor(@NotNull final NetworkStateManager networkStateManager) {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.d
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.responseInterceptor$lambda$9(networkStateManager, this, chain);
            }
        };
    }

    @NotNull
    public final y retrofit(@NotNull String str, @NotNull OkHttpClient okHttpClient, @NotNull w wVar) {
        return new y.b().g(okHttpClient).c(str).b(lv.a.f(wVar)).e();
    }

    @NotNull
    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public /* synthetic */ NetworkCoreModule(boolean z10, String str, String str2, String str3, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : str, str2, str3, z11);
    }
}
