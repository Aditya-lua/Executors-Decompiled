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
import kotlin.Unit;
import kotlin.collections.C7702q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lv.C8267a;
import np.C9542e;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p231jv.C7397y;
import p471um.AbstractC11873h;
import p471um.C11888w;
import p582yn.InterfaceC13236b;
import p582yn.InterfaceC13248k;

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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
            return C7702q0.m31911g(ErrorResponse.Companion.getAdapter(), InternalErrorInfo.Companion.createAdapter());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NetworkCoreModule(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        this.useServerStyle = z10;
        this.environmentId = str;
        this.locale = str2;
        this.styleVariant = str3;
        this.redactAppIdentifyingInformation = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Response interceptor$lambda$10(C11888w c11888w, Interceptor.Chain chain) {
        try {
            return chain.proceed(chain.request());
        } catch (ConnectException e10) {
            Response.Builder builderCode = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage = e10.getLocalizedMessage();
            return builderCode.message(localizedMessage != null ? localizedMessage : "").body(ResponseBody.INSTANCE.create(c11888w.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e10.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (SocketTimeoutException e11) {
            Response.Builder builderCode2 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage2 = e11.getLocalizedMessage();
            return builderCode2.message(localizedMessage2 != null ? localizedMessage2 : "").body(ResponseBody.INSTANCE.create(c11888w.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e11.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (UnknownHostException e12) {
            Response.Builder builderCode3 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage3 = e12.getLocalizedMessage();
            return builderCode3.message(localizedMessage3 != null ? localizedMessage3 : "").body(ResponseBody.INSTANCE.create(c11888w.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e12.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        } catch (IOException e13) {
            Response.Builder builderCode4 = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(0);
            String localizedMessage4 = e13.getLocalizedMessage();
            return builderCode4.message(localizedMessage4 != null ? localizedMessage4 : "").body(ResponseBody.INSTANCE.create(c11888w.m44436c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e13.getLocalizedMessage())), MediaType.INSTANCE.get("application/json"))).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit okhttpClient$lambda$0(NetworkCoreModule networkCoreModule, String str) {
        networkCoreModule.certificateFingerprint = str;
        return Unit.f29331a;
    }

    @NotNull
    public static final Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
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
    public final Interceptor interceptor(@NotNull final C11888w c11888w) {
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.e
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return NetworkCoreModule.interceptor$lambda$10(c11888w, chain);
            }
        };
    }

    @NotNull
    public final String keyInflection() {
        return "camel";
    }

    @NotNull
    public final C11888w moshi(@NotNull Set<Object> set, @NotNull Set<JsonAdapterBinding<?>> set2, @NotNull Set<AbstractC11873h.e> set3) {
        C11888w.b bVar = new C11888w.b();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            bVar.m44442a(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.m44443b(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            bVar.m44444c((AbstractC11873h.e) it3.next());
        }
        return bVar.m44445d();
    }

    @NotNull
    public final OkHttpClient okhttpClient(@NotNull Set<Interceptor> set, @NotNull final Map<String, String> map, @NotNull final Context context, @NotNull final InterfaceC13248k interfaceC13248k, @NotNull final InterfaceC13236b interfaceC13236b, @NotNull final C9542e.a aVar, @NotNull final NetworkStateManager networkStateManager) {
        OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().eventListener(new C3785b(new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkCoreModule.okhttpClient$lambda$0(this.f15668a, (String) obj);
            }
        })).addNetworkInterceptor(new Interceptor() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.network.core.a.a(com.withpersona.sdk2.inquiry.network.core.a, okhttp3.Request, np.e, long, int, java.lang.Object):okhttp3.Request */
            @Override // okhttp3.Interceptor
            @NotNull
            public final Response intercept(@NotNull Interceptor.Chain chain) {
                Request.Builder builderNewBuilder = chain.request().newBuilder();
                if (!chain.request().headers().names().contains("Accept")) {
                    builderNewBuilder = builderNewBuilder.header("Accept", "application/json");
                }
                Request.Builder builderHeader = builderNewBuilder.header("Persona-Version", "2025-11-18").header("Persona-Device-Manufacturer", interfaceC13236b.mo48955c()).header("Persona-Device-Model", interfaceC13236b.mo48954b()).header("Persona-Device-OS", "Android").header("Persona-Device-OS-Version", interfaceC13236b.mo48956d()).header("VTDGJLGG", String.valueOf(interfaceC13236b.mo48953a()));
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
                    builderHeader3.header("Persona-Device-Vendor-Id", interfaceC13248k.mo49001b());
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
                return chain.proceed(C3784a.m18937a(C3784a.f15662a, builderHeader3.build(), aVar.create(NetworkUtilsKt.SUBSYSTEM), 0L, 2, (Object) null));
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
    public final C7397y retrofit(@NotNull String str, @NotNull OkHttpClient okHttpClient, @NotNull C11888w c11888w) {
        return new C7397y.b().m30676g(okHttpClient).m30672c(str).m30671b(C8267a.m33655f(c11888w)).m30674e();
    }

    @NotNull
    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 boolean)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
      (r9v0 java.lang.String)
      (r10v0 java.lang.String)
      (r11v0 boolean)
     A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:7) call: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ NetworkCoreModule(boolean z10, String str, String str2, String str3, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : str, str2, str3, z11);
    }
}
