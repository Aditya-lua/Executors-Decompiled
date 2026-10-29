package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1819a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f1820a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1820a = new b(clipData, i10);
            } else {
                this.f1820a = new C0028d(clipData, i10);
            }
        }

        public d a() {
            return this.f1820a.build();
        }

        public a b(Bundle bundle) {
            this.f1820a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f1820a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f1820a.a(uri);
            return this;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f1821a;

        public b(ClipData clipData, int i10) {
            this.f1821a = androidx.core.view.e.a(clipData, i10);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1821a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1821a.setFlags(i10);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new e(this.f1821a.build()));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1821a.setExtras(bundle);
        }
    }

    public interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0028d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f1822a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f1824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f1825e;

        public C0028d(ClipData clipData, int i10) {
            this.f1822a = clipData;
            this.b = i10;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1824d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1823c = i10;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1825e = bundle;
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f1826a;

        public e(ContentInfo contentInfo) {
            this.f1826a = androidx.core.view.c.a(x2.g.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return this.f1826a;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1826a.getClip();
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1826a.getFlags();
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.f1826a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1826a + "}";
        }
    }

    public interface f {
        ContentInfo a();

        ClipData b();

        int c();

        int getSource();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f1827a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f1829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f1830e;

        public g(C0028d c0028d) {
            this.f1827a = (ClipData) x2.g.g(c0028d.f1822a);
            this.b = x2.g.c(c0028d.b, 0, 5, Payload.SOURCE);
            this.f1828c = x2.g.f(c0028d.f1823c, 1);
            this.f1829d = c0028d.f1824d;
            this.f1830e = c0028d.f1825e;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1827a;
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1828c;
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f1827a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f1828c));
            if (this.f1829d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1829d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f1830e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public d(f fVar) {
        this.f1819a = fVar;
    }

    public static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    public static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f1819a.b();
    }

    public int c() {
        return this.f1819a.c();
    }

    public int d() {
        return this.f1819a.getSource();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.f1819a.a();
        Objects.requireNonNull(contentInfoA);
        androidx.core.view.c.a(contentInfoA);
        return contentInfoA;
    }

    public String toString() {
        return this.f1819a.toString();
    }
}
