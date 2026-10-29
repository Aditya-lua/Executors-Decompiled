package sh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import dalvik.system.BaseDexClassLoader;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.C11295a1;
import sm.C11416c;
import th.C11659h;

/* JADX INFO: renamed from: sh.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\u0003J/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lsh/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "libName", Payload.SOURCE, "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "c", "reason", "detail", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Landroid/content/Context;)Ljava/lang/String;", "Lsh/b$a;", "failure", "b", "(Lsh/b$a;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingFailure", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11377b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C11377b f40236a = new C11377b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<ResolveFailure> pendingFailure = new AtomicReference<>(null);

    /* JADX INFO: renamed from: sh.b$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, m31665d2 = {"Lsh/b$a;", "", "", Payload.SOURCE, "libName", "reason", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class ResolveFailure {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String libName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String reason;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String detail;

        public ResolveFailure(@NotNull String source, @NotNull String libName, @NotNull String reason, @NotNull String detail) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(libName, "libName");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.source = source;
            this.libName = libName;
            this.reason = reason;
            this.detail = detail;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLibName() {
            return this.libName;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResolveFailure)) {
                return false;
            }
            ResolveFailure resolveFailure = (ResolveFailure) other;
            return Intrinsics.m31980c(this.source, resolveFailure.source) && Intrinsics.m31980c(this.libName, resolveFailure.libName) && Intrinsics.m31980c(this.reason, resolveFailure.reason) && Intrinsics.m31980c(this.detail, resolveFailure.detail);
        }

        public int hashCode() {
            return (((((this.source.hashCode() * 31) + this.libName.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.detail.hashCode();
        }

        @NotNull
        public String toString() {
            return "ResolveFailure(source=" + this.source + ", libName=" + this.libName + ", reason=" + this.reason + ", detail=" + this.detail + ")";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m42667c() {
        ResolveFailure andSet = pendingFailure.getAndSet(null);
        if (andSet != null) {
            f40236a.m42671b(andSet);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m42668e(@NotNull Context context, @NotNull String libName, @Nullable String source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(libName, "libName");
        boolean z10 = source != null && C11659h.m43403a().mo43564X0();
        ClassLoader classLoader = context.getClassLoader();
        if (!(classLoader instanceof BaseDexClassLoader)) {
            if (z10) {
                C11377b c11377b = f40236a;
                String name = classLoader.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c11377b.m42672d(source, libName, "classloader_not_bdcl", name);
            }
            return null;
        }
        try {
            String strFindLibrary = ((BaseDexClassLoader) classLoader).findLibrary(libName);
            if (strFindLibrary != null || !z10) {
                return strFindLibrary;
            }
            C11377b c11377b2 = f40236a;
            c11377b2.m42672d(source, libName, "findlibrary_null", c11377b2.m42670a(context));
            return strFindLibrary;
        } catch (Throwable th2) {
            if (z10) {
                f40236a.m42672d(source, libName, "findlibrary_threw", th2.getClass().getName() + ": " + th2.getMessage());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m42669f(Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return m42668e(context, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m42670a(Context context) {
        String strM31858a0;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String strM31858a1 = C7693m.m31858a0(SUPPORTED_ABIS, ",", null, null, 0, null, null, 62, null);
        String str = applicationInfo.nativeLibraryDir;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || (strM31858a0 = C7693m.m31858a0(strArr, ",", null, null, 0, null, null, 62, null)) == null) {
            strM31858a0 = "none";
        }
        return "abis=" + strM31858a1 + ";nativeLibDir=" + str + ";splitSourceDirs=" + strM31858a0;
    }

    /* JADX INFO: renamed from: b */
    public final void m42671b(ResolveFailure failure) {
        C11416c c11416c = C11416c.f40393a;
        C11416c.a aVar = new C11416c.a("native_lib_resolve_path_failed", C7702q0.m31911g(TelemetryBackend.POINTS, TelemetryBackend.EVENT_INGEST));
        aVar.mo42755b(2026, 9, 23);
        aVar.mo42754a("On-demand native library resolve-path failures (e.g. robloxwebrtc); reason distinguishes the null cause");
        aVar.mo42756c(Integer.valueOf(C11659h.m43403a().mo43517Q1()));
        TelemetryConfig telemetryConfigM42774d = aVar.m42774d();
        C11416c.b bVar = new C11416c.b();
        bVar.mo42759c(Payload.SOURCE, failure.getSource());
        bVar.mo42759c("lib_name", failure.getLibName());
        bVar.mo42759c("reason", failure.getReason());
        bVar.mo42759c("detail", failure.getDetail());
        String strM42426W = C11295a1.m42426W();
        if (StringsKt.m32182p0(strM42426W)) {
            strM42426W = "production";
        }
        Intrinsics.checkNotNullExpressionValue(strM42426W, "ifBlank(...)");
        bVar.mo42759c("channel", strM42426W);
        bVar.mo42764h(TelemetryStandardizedField.ADD_OS_INFO);
        C11416c.m42772h(telemetryConfigM42774d, bVar.m42785l());
    }

    /* JADX INFO: renamed from: d */
    public final void m42672d(String source, String libName, String reason, String detail) {
        Log.w("OnDemandNativeLib", "resolvePath(" + libName + ") failed [" + source + "]: " + reason + " - " + detail);
        pendingFailure.set(new ResolveFailure(source, libName, reason, detail));
    }
}
