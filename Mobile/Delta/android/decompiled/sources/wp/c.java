package wp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0010\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0015\u0010\fR\"\u0010\u0018\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lwp/c;", "", "<init>", "()V", "", "g", "", "a", "Z", "d", "()Z", "e", "(Z)V", "isSandboxModeEnabled", "Lwp/c$b;", "value", "b", "Lwp/c$b;", "()Lwp/c$b;", "debugForcedStatus", "c", "f", "simulateGovIdNfc", "setSimulateJpMyNumberNfc", "simulateJpMyNumberNfc", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isSandboxModeEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public b debugForcedStatus = b.Passed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean simulateGovIdNfc = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean simulateJpMyNumberNfc = true;

    /* JADX INFO: renamed from: wp.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwp/c$a;", "", "<init>", "()V", "Lwp/c$b;", "", "a", "(Lwp/c$b;)Ljava/lang/String;", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: wp.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0632a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34475a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Failed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.Passed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f34475a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            int i10 = C0632a.f34475a[bVar.ordinal()];
            if (i10 == 1) {
                return "failed";
            }
            if (i10 == 2) {
                return "passed";
            }
            throw new jt.l();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lwp/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        Failed,
        Passed;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f34478d = qt.b.a(a());
    }

    /* JADX INFO: renamed from: wp.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0633c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34479a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Passed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f34479a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDebugForcedStatus() {
        return this.debugForcedStatus;
    }

    public final boolean b() {
        return this.isSandboxModeEnabled && this.simulateGovIdNfc;
    }

    public final boolean c() {
        return this.isSandboxModeEnabled && this.simulateJpMyNumberNfc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSandboxModeEnabled() {
        return this.isSandboxModeEnabled;
    }

    public final void e(boolean z10) {
        this.isSandboxModeEnabled = z10;
    }

    public final void f(boolean z10) {
        this.simulateGovIdNfc = z10;
    }

    public final void g() {
        b bVar;
        int i10 = C0633c.f34479a[this.debugForcedStatus.ordinal()];
        if (i10 == 1) {
            bVar = b.Passed;
        } else {
            if (i10 != 2) {
                throw new jt.l();
            }
            bVar = b.Failed;
        }
        this.debugForcedStatus = bVar;
    }
}
