package k9;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f21280e = new o0(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21281a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f21282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21283d;

    public o0(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.f21281a = z10;
        this.f21283d = i10;
        this.b = str;
        this.f21282c = th2;
    }

    @Deprecated
    public static o0 b() {
        return f21280e;
    }

    public static o0 c(@NonNull String str) {
        return new o0(false, 1, 5, str, null, -1L);
    }

    public static o0 d(@NonNull String str, @NonNull Throwable th2) {
        return new o0(false, 1, 5, str, th2, -1L);
    }

    public static o0 f(int i10, long j10) {
        return new o0(true, i10, 1, null, null, j10);
    }

    public static o0 g(int i10, int i11, @NonNull String str, Throwable th2) {
        return new o0(false, i10, i11, str, th2, -1L);
    }

    public String a() {
        return this.b;
    }

    public final void e() {
        if (this.f21281a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.f21282c;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", a(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    public /* synthetic */ o0(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
