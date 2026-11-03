package v2;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.k;
import g0.o0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f33292a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f33294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f33295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f33296f;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this(uri, i10, i11, z10, null, i12);
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f33296f;
        }

        public String c() {
            if (i()) {
                return this.f33292a.getAuthority();
            }
            return null;
        }

        public int d() {
            return this.b;
        }

        public Uri e() {
            return this.f33292a;
        }

        public String f() {
            return this.f33295e;
        }

        public int g() {
            return this.f33293c;
        }

        public boolean h() {
            return this.f33294d;
        }

        public boolean i() {
            return Objects.equals(this.f33292a.getScheme(), "systemfont");
        }

        public b(Uri uri, int i10, int i11, boolean z10, String str, int i12) {
            this.f33292a = (Uri) x2.g.g(uri);
            this.b = i10;
            this.f33293c = i11;
            this.f33294d = z10;
            this.f33295e = str;
            this.f33296f = i12;
        }

        public b(String str, String str2) {
            this.f33292a = new Uri.Builder().scheme("systemfont").authority(str).build();
            this.b = 0;
            this.f33293c = 400;
            this.f33294d = false;
            this.f33295e = str2;
            this.f33296f = 0;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return k.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, o0.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i10, boolean z10, int i11, Handler handler, c cVar) {
        v2.a aVar = new v2.a(cVar, h.b(handler));
        if (!z10) {
            return f.d(context, list, i10, null, aVar);
        }
        if (list.size() <= 1) {
            return f.e(context, list.get(0), aVar, i10, i11);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33291a;
        public final List<b[]> b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f33291a = i10;
            this.b = Collections.singletonList(bVarArr);
        }

        public static a a(int i10, List<b[]> list) {
            return new a(i10, list);
        }

        public static a b(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] c() {
            return this.b.get(0);
        }

        public List<b[]> d() {
            return this.b;
        }

        public int e() {
            return this.f33291a;
        }

        public boolean f() {
            return this.b.size() > 1;
        }

        public a(int i10, List<b[]> list) {
            this.f33291a = i10;
            this.b = list;
        }
    }
}
