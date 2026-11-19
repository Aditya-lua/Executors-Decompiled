package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import hn.h;
import hn.w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mo.k;
import mv.a0;
import mv.b0;
import mv.d0;
import mv.e0;
import mv.f0;
import mv.h0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Unit;
import p001kotlin.collections.q0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import sw.y;

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
    public static final h0 interceptor$lambda$10(w wVar, a0.a aVar) {
        String str = BuildConfig.FLAVOR;
        try {
            return aVar.a(aVar.h());
        } catch (ConnectException e10) {
            h0.a aVarF = new h0.a().q(aVar.h()).o(e0.HTTP_2).f(0);
            String localizedMessage = e10.getLocalizedMessage();
            if (localizedMessage != null) {
                str = localizedMessage;
            }
            return aVarF.l(str).b(i0.INSTANCE.c(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e10.getLocalizedMessage())), b0.INSTANCE.a("application/json"))).c();
        } catch (SocketTimeoutException e11) {
            h0.a aVarF2 = new h0.a().q(aVar.h()).o(e0.HTTP_2).f(0);
            String localizedMessage2 = e11.getLocalizedMessage();
            if (localizedMessage2 != null) {
                str = localizedMessage2;
            }
            return aVarF2.l(str).b(i0.INSTANCE.c(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e11.getLocalizedMessage())), b0.INSTANCE.a("application/json"))).c();
        } catch (UnknownHostException e12) {
            h0.a aVarF3 = new h0.a().q(aVar.h()).o(e0.HTTP_2).f(0);
            String localizedMessage3 = e12.getLocalizedMessage();
            if (localizedMessage3 != null) {
                str = localizedMessage3;
            }
            return aVarF3.l(str).b(i0.INSTANCE.c(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e12.getLocalizedMessage())), b0.INSTANCE.a("application/json"))).c();
        } catch (IOException e13) {
            h0.a aVarF4 = new h0.a().q(aVar.h()).o(e0.HTTP_2).f(0);
            String localizedMessage4 = e13.getLocalizedMessage();
            if (localizedMessage4 != null) {
                str = localizedMessage4;
            }
            return aVarF4.l(str).b(i0.INSTANCE.c(wVar.c(ErrorResponse.class).toJson(ErrorResponse.Companion.create(e13.getLocalizedMessage())), b0.INSTANCE.a("application/json"))).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit okhttpClient$lambda$0(NetworkCoreModule networkCoreModule, String str) {
        networkCoreModule.certificateFingerprint = str;
        return Unit.f21506a;
    }

    @NotNull
    public static final Set<h.e> provideMoshiJsonAdapterFactory() {
        return Companion.provideMoshiJsonAdapterFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 responseInterceptor$lambda$9(NetworkStateManager networkStateManager, NetworkCoreModule networkCoreModule, a0.a aVar) {
        h0 h0VarA = aVar.a(aVar.h());
        String strA = h0VarA.getHeaders().a(NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID);
        if (strA != null) {
            networkStateManager.setOrganizationId(strA);
        }
        String strA2 = h0VarA.getHeaders().a(NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID);
        if (strA2 != null) {
            networkCoreModule.environmentId = strA2;
        }
        return h0VarA;
    }

    @NotNull
    public final a0 interceptor(@NotNull final w wVar) {
        return new a0() { // from class: com.withpersona.sdk2.inquiry.network.core.e
            @Override // mv.a0
            public final h0 intercept(a0.a aVar) {
                return NetworkCoreModule.interceptor$lambda$10(wVar, aVar);
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
            bVar.b(it.next());
        }
        Iterator<T> it2 = set2.iterator();
        while (it2.hasNext()) {
            JsonAdapterBinding jsonAdapterBinding = (JsonAdapterBinding) it2.next();
            bVar.c(jsonAdapterBinding.getClazz(), jsonAdapterBinding.getJsonAdapter());
        }
        Iterator<T> it3 = set3.iterator();
        while (it3.hasNext()) {
            bVar.a((h.e) it3.next());
        }
        return bVar.d();
    }

    @NotNull
    public final d0 okhttpClient(@NotNull Set<a0> set, @NotNull final Map<String, String> map, @NotNull final Context context, @NotNull final k kVar, @NotNull final mo.b bVar, @NotNull final bq.e.a aVar, @NotNull final NetworkStateManager networkStateManager) {
        d0.a aVarB = new d0.a().k(new b(new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkCoreModule.okhttpClient$lambda$0(this.f10949a, (String) obj);
            }
        })).b(new a0() { // from class: com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule$okhttpClient$$inlined$-addNetworkInterceptor$1
            @Override // mv.a0
            @NotNull
            public final h0 intercept(@NotNull a0.a aVar2) {
                f0.a aVarJ = aVar2.h().j();
                if (!aVar2.h().getHeaders().d().contains("Accept")) {
                    aVarJ = aVarJ.m("Accept", "application/json");
                }
                f0.a aVarM = aVarJ.m("Persona-Version", "2025-11-18").m("Persona-Device-Manufacturer", bVar.c()).m("Persona-Device-Model", bVar.b()).m("Persona-Device-OS", "Android").m("Persona-Device-OS-Version", bVar.d()).m("VTDGJLGG", String.valueOf(bVar.a()));
                String str = this.styleVariant;
                if (str == null) {
                    str = (context.getResources().getConfiguration().uiMode & 48) == 32 ? "dark" : "light";
                }
                f0.a aVarM2 = aVarM.m("Persona-Style-Variant", str);
                String string = this.locale;
                if (string == null) {
                    string = Locale.getDefault().toString();
                }
                f0.a aVarM3 = aVarM2.m("Persona-Device-Locale", string);
                if (!this.redactAppIdentifyingInformation) {
                    aVarM3.m("Persona-App-Bundle", context.getPackageName());
                    aVarM3.m("Persona-Device-Vendor-Id", kVar.b());
                }
                String organizationId = networkStateManager.getOrganizationId();
                if (organizationId != null) {
                    aVarM3.m(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ORGANIZATION_ID, organizationId);
                }
                String str2 = this.environmentId;
                if (str2 != null) {
                    aVarM3.m(NetworkCoreModule.NetworkConstants.HEADER_KEY_PERSONA_ENVIRONMENT_ID, str2);
                }
                for (Map.Entry entry : map.entrySet()) {
                    aVarM3.m((String) entry.getKey(), (String) entry.getValue());
                }
                String str3 = this.certificateFingerprint;
                if (str3 != null) {
                    aVarM3.m("BMRWJMTB", str3);
                }
                return aVar2.a(a.a(a.f10944a, aVarM3.b(), aVar.create(NetworkUtilsKt.SUBSYSTEM), 0L, 2, (Object) null));
            }
        });
        TimeUnit timeUnit = TimeUnit.MINUTES;
        d0.a aVarF = aVarB.T(1L, timeUnit).W(1L, timeUnit).f(1L, timeUnit);
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            aVarF.a((a0) it.next());
        }
        return aVarF.c();
    }

    @NotNull
    public final a0 responseInterceptor(@NotNull final NetworkStateManager networkStateManager) {
        return new a0() { // from class: com.withpersona.sdk2.inquiry.network.core.d
            @Override // mv.a0
            public final h0 intercept(a0.a aVar) {
                return NetworkCoreModule.responseInterceptor$lambda$9(networkStateManager, this, aVar);
            }
        };
    }

    @NotNull
    public final y retrofit(@NotNull String str, @NotNull d0 d0Var, @NotNull w wVar) {
        return new y.b().g(d0Var).c(str).b(uw.a.f(wVar)).e();
    }

    @NotNull
    public final String useServerStyles() {
        return String.valueOf(this.useServerStyle);
    }

    public /* synthetic */ NetworkCoreModule(boolean z10, String str, String str2, String str3, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : str, str2, str3, z11);
    }
}
