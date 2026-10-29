package kl;

import backtraceio.library.services.BacktraceMetrics;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityProvider;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityStatus;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import java.util.Locale;
import jt.h;
import jt.i;
import jt.l;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lkl/f;", "Lkl/a;", "<init>", "()V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "provider", "", "b", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V", "", "result", "errorClass", "", "durationMs", "a", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;J)V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;", "status", "j", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;)Ljava/lang/String;", "h", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "e", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "launchConfig", "c", "f", "resultConfig", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements kl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f22321a = new f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final h launchConfig = i.b(new Function0() { // from class: kl.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.g();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final h resultConfig = i.b(new Function0() { // from class: kl.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.i();
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22323a;

        static {
            int[] iArr = new int[ExternalIdentityProvider.values().length];
            try {
                iArr[ExternalIdentityProvider.GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalIdentityProvider.APPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22323a = iArr;
        }
    }

    public static final TelemetryConfig g() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("externalIdentityLaunch", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs));
        aVar.b(2026, 9, 29);
        aVar.a("Native external identity provider UI was launched");
        return aVar.d();
    }

    public static final TelemetryConfig i() {
        sm.c cVar = sm.c.f31236a;
        sm.c.a aVar = new sm.c.a("externalIdentityResult", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs));
        aVar.b(2026, 9, 29);
        aVar.a("Native external identity provider interaction completed");
        return aVar.d();
    }

    @Override // kl.a
    public void a(@NotNull ExternalIdentityProvider provider, @NotNull String result, @Nullable String errorClass, long durationMs) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(result, "result");
        TelemetryConfig telemetryConfigF = f();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.d("externalIdentity");
        bVar.c("provider", f22321a.h(provider));
        bVar.c("result", result);
        if (errorClass != null && errorClass.length() != 0) {
            bVar.c("errorClass", errorClass);
        }
        bVar.g("durationMs", durationMs);
        sm.c.h(telemetryConfigF, bVar.l());
    }

    @Override // kl.a
    public void b(@NotNull ExternalIdentityProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        TelemetryConfig telemetryConfigE = e();
        sm.c cVar = sm.c.f31236a;
        sm.c.b bVar = new sm.c.b();
        bVar.d("externalIdentity");
        bVar.c("provider", f22321a.h(provider));
        sm.c.h(telemetryConfigE, bVar.l());
    }

    public final TelemetryConfig e() {
        return (TelemetryConfig) launchConfig.getValue();
    }

    public final TelemetryConfig f() {
        return (TelemetryConfig) resultConfig.getValue();
    }

    public final String h(ExternalIdentityProvider provider) {
        int i10 = a.f22323a[provider.ordinal()];
        if (i10 == 1) {
            return "google";
        }
        if (i10 == 2) {
            return "apple";
        }
        throw new l();
    }

    @NotNull
    public final String j(@NotNull ExternalIdentityStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        String lowerCase = status.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
