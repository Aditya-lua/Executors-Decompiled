package p250kl;

import androidx.core.app.NotificationCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityProvider;
import com.roblox.protocols.externalidentityplatforminterface.generated.ExternalIdentityStatus;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.InterfaceC7341h;
import sm.C11416c;

/* JADX INFO: renamed from: kl.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, m31665d2 = {"Lkl/f;", "Lkl/a;", "<init>", "()V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;", "provider", "", "b", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)V", "", "result", "errorClass", "", "durationMs", "a", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;J)V", "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;", NotificationCompat.CATEGORY_STATUS, "j", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;)Ljava/lang/String;", "h", "(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;)Ljava/lang/String;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "Ljt/h;", "e", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "launchConfig", "c", "f", "resultConfig", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7629f implements InterfaceC7624a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C7629f f29139a = new C7629f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h launchConfig = C7342i.m30456b(new Function0() { // from class: kl.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C7629f.m31508g();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7341h resultConfig = C7342i.m30456b(new Function0() { // from class: kl.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C7629f.m31509i();
        }
    });

    /* JADX INFO: renamed from: kl.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29142a;

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
            f29142a = iArr;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final TelemetryConfig m31508g() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("externalIdentityLaunch", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs));
        aVar.mo42755b(2026, 9, 29);
        aVar.mo42754a("Native external identity provider UI was launched");
        return aVar.m42774d();
    }

    /* JADX INFO: renamed from: i */
    public static final TelemetryConfig m31509i() {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("externalIdentityResult", C7700p0.m31904c(TelemetryBackend.EVENT_INGEST));
        aVar.mo42756c(Integer.valueOf(BacktraceMetrics.defaultTimeBetweenRetriesMs));
        aVar.mo42755b(2026, 9, 29);
        aVar.mo42754a("Native external identity provider interaction completed");
        return aVar.m42774d();
    }

    @Override // p250kl.InterfaceC7624a
    /* JADX INFO: renamed from: a */
    public void mo31504a(@NotNull ExternalIdentityProvider provider, @NotNull String result, @Nullable String errorClass, long durationMs) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(result, "result");
        TelemetryConfig telemetryConfigM31511f = m31511f();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42760d("externalIdentity");
        bVar.mo42759c("provider", f29139a.m31512h(provider));
        bVar.mo42759c("result", result);
        if (errorClass != null && errorClass.length() != 0) {
            bVar.mo42759c("errorClass", errorClass);
        }
        bVar.mo42763g("durationMs", durationMs);
        C11416c.m42772h(telemetryConfigM31511f, bVar.m42785l());
    }

    @Override // p250kl.InterfaceC7624a
    /* JADX INFO: renamed from: b */
    public void mo31505b(@NotNull ExternalIdentityProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        TelemetryConfig telemetryConfigM31510e = m31510e();
        C11416c c11416c = C11416c.f40393a;
        C11416c.b bVar = new C11416c.b();
        bVar.mo42760d("externalIdentity");
        bVar.mo42759c("provider", f29139a.m31512h(provider));
        C11416c.m42772h(telemetryConfigM31510e, bVar.m42785l());
    }

    /* JADX INFO: renamed from: e */
    public final TelemetryConfig m31510e() {
        return (TelemetryConfig) launchConfig.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final TelemetryConfig m31511f() {
        return (TelemetryConfig) resultConfig.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final String m31512h(ExternalIdentityProvider provider) {
        int i10 = a.f29142a[provider.ordinal()];
        if (i10 == 1) {
            return "google";
        }
        if (i10 == 2) {
            return "apple";
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final String m31513j(@NotNull ExternalIdentityStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        String lowerCase = status.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
