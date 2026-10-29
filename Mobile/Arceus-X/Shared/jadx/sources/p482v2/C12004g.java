package p482v2;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0558k;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p140g0.C5918o0;
import p533x2.C12637g;

/* JADX INFO: renamed from: v2.g */
/* JADX INFO: loaded from: classes.dex */
public class C12004g {

    /* JADX INFO: renamed from: v2.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Uri f42520a;

        /* JADX INFO: renamed from: b */
        public final int f42521b;

        /* JADX INFO: renamed from: c */
        public final int f42522c;

        /* JADX INFO: renamed from: d */
        public final boolean f42523d;

        /* JADX INFO: renamed from: e */
        public final String f42524e;

        /* JADX INFO: renamed from: f */
        public final int f42525f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        /* JADX INFO: renamed from: a */
        public static b m44816a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        /* JADX INFO: renamed from: b */
        public int m44817b() {
            return this.f42525f;
        }

        /* JADX INFO: renamed from: c */
        public String m44818c() {
            if (m44824i()) {
                return this.f42520a.getAuthority();
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public int m44819d() {
            return this.f42521b;
        }

        /* JADX INFO: renamed from: e */
        public Uri m44820e() {
            return this.f42520a;
        }

        /* JADX INFO: renamed from: f */
        public String m44821f() {
            return this.f42524e;
        }

        /* JADX INFO: renamed from: g */
        public int m44822g() {
            return this.f42522c;
        }

        /* JADX INFO: renamed from: h */
        public boolean m44823h() {
            return this.f42523d;
        }

        /* JADX INFO: renamed from: i */
        public boolean m44824i() {
            return Objects.equals(this.f42520a.getScheme(), "systemfont");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f42520a = (Uri) C12637g.m47075g(uri);
            this.f42521b = i10;
            this.f42522c = i11;
            this.f42523d = z10;
            this.f42524e = str;
            this.f42525f = i12;
        }

        public b(String str, String str2) {
            this.f42520a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.f42521b = 0;
            this.f42522c = 400;
            this.f42523d = false;
            this.f42524e = str2;
            this.f42525f = 0;
        }
    }

    /* JADX INFO: renamed from: v2.g$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public void mo2745a(int i10) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo2746b(Typeface typeface) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m44807a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return C0558k.m2736b(context, cancellationSignal, bVarArr, 0);
    }

    /* JADX INFO: renamed from: b */
    public static a m44808b(Context context, CancellationSignal cancellationSignal, C12002e c12002e) {
        return C12001d.m44783e(context, C5918o0.m26551a(new Object[]{c12002e}), cancellationSignal);
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m44809c(Context context, List<C12002e> list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C11998a c11998a = new C11998a(cVar, C12005h.m44826b(handler));
        if (!z10) {
            return C12003f.m44800d(context, list, i10, null, c11998a);
        }
        if (list.size() <= 1) {
            return C12003f.m44801e(context, list.get(0), c11998a, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    /* JADX INFO: renamed from: v2.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f42518a;

        /* JADX INFO: renamed from: b */
        public final List<b[]> f42519b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f42518a = i10;
            this.f42519b = Collections.singletonList(bVarArr);
        }

        /* JADX INFO: renamed from: a */
        public static a m44810a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        /* JADX INFO: renamed from: b */
        public static a m44811b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        /* JADX INFO: renamed from: c */
        public b[] m44812c() {
            return this.f42519b.get(0);
        }

        /* JADX INFO: renamed from: d */
        public List<b[]> m44813d() {
            return this.f42519b;
        }

        /* JADX INFO: renamed from: e */
        public int m44814e() {
            return this.f42518a;
        }

        /* JADX INFO: renamed from: f */
        public boolean m44815f() {
            return this.f42519b.size() > 1;
        }

        public a(int i10, List<b[]> list) {
            this.f42518a = i10;
            this.f42519b = list;
        }
    }
}
