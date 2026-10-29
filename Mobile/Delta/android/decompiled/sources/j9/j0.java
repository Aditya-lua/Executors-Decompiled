package j9;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f21199e = new j0(true, 3, 1, null, null, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21200a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f21201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21202d;

    public j0(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.f21200a = z10;
        this.f21202d = i10;
        this.b = str;
        this.f21201c = th2;
    }

    @Deprecated
    public static j0 b() {
        return f21199e;
    }

    public static j0 c(@NonNull String str) {
        return new j0(false, 1, 5, str, null, -1L);
    }

    public static j0 d(@NonNull String str, @NonNull Throwable th2) {
        return new j0(false, 1, 5, str, th2, -1L);
    }

    public static j0 f(int i10, long j10) {
        return new j0(true, i10, 1, null, null, j10);
    }

    public static j0 g(int i10, int i11, @NonNull String str, Throwable th2) {
        return new j0(false, i10, i11, str, th2, -1L);
    }

    public String a() {
        return this.b;
    }

    public final void e() {
        if (this.f21200a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th2 = this.f21201c;
        if (th2 != null) {
            Log.d("GoogleCertificatesRslt", a(), th2);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }

    public /* synthetic */ j0(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
