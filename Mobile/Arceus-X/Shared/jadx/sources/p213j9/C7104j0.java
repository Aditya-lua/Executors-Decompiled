package p213j9;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: j9.j0 */
/* JADX INFO: loaded from: classes.dex */
public class C7104j0 {

    /* JADX INFO: renamed from: e */
    public static final C7104j0 f27725e = new C7104j0(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a */
    public final boolean f27726a;

    /* JADX INFO: renamed from: b */
    public final String f27727b;

    /* JADX INFO: renamed from: c */
    public final Throwable f27728c;

    /* JADX INFO: renamed from: d */
    public final int f27729d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7104j0(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.f27726a = z10;
        this.f27729d = i10;
        this.f27727b = str;
        this.f27728c = th2;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static C7104j0 m29906b() {
        return f27725e;
    }

    /* JADX INFO: renamed from: c */
    public static C7104j0 m29907c(@NonNull String str) {
        return new C7104j0(false, 1, 5, str, null, -1L);
    }

    /* JADX INFO: renamed from: d */
    public static C7104j0 m29908d(@NonNull String str, @NonNull Throwable th2) {
        return new C7104j0(false, 1, 5, str, th2, -1L);
    }

    /* JADX INFO: renamed from: f */
    public static C7104j0 m29909f(int i10, long j10) {
        return new C7104j0(true, i10, 1, null, null, j10);
    }

    /* JADX INFO: renamed from: g */
    public static C7104j0 m29910g(int i10, int i11, @NonNull String str, Throwable th2) {
        return new C7104j0(false, i10, i11, str, th2, -1L);
    }

    /* JADX INFO: renamed from: a */
    public String mo29905a() {
        return this.f27727b;
    }

    /* JADX INFO: renamed from: e */
    public final void m29911e() {
        if (this.f27726a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.f27728c;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", mo29905a(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", mo29905a());
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR false, (1 int), (5 int), (null java.lang.String), (null java.lang.Throwable), (-1 long) A[MD:(boolean, int, int, java.lang.String, java.lang.Throwable, long):void (m)] (LINE:2) call: j9.j0.<init>(boolean, int, int, java.lang.String, java.lang.Throwable, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C7104j0(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
