package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1626a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f1627a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1627a = new b(clipData, i10);
            } else {
                this.f1627a = new C0036d(clipData, i10);
            }
        }

        public d a() {
            return this.f1627a.build();
        }

        public a b(Bundle bundle) {
            this.f1627a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f1627a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f1627a.a(uri);
            return this;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f1628a;

        public b(ClipData clipData, int i10) {
            this.f1628a = androidx.core.view.e.a(clipData, i10);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1628a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1628a.setFlags(i10);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new e(this.f1628a.build()));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1628a.setExtras(bundle);
        }
    }

    public interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0036d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f1629a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f1631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f1632e;

        public C0036d(ClipData clipData, int i10) {
            this.f1629a = clipData;
            this.b = i10;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1631d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1630c = i10;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1632e = bundle;
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f1633a;

        public e(ContentInfo contentInfo) {
            this.f1633a = androidx.core.view.c.a(x2.g.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public int a() {
            return this.f1633a.getSource();
        }

        @Override // androidx.core.view.d.f
        public ContentInfo b() {
            return this.f1633a;
        }

        @Override // androidx.core.view.d.f
        public ClipData c() {
            return this.f1633a.getClip();
        }

        @Override // androidx.core.view.d.f
        public int d() {
            return this.f1633a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1633a + "}";
        }
    }

    public interface f {
        int a();

        ContentInfo b();

        ClipData c();

        int d();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f1634a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f1636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f1637e;

        public g(C0036d c0036d) {
            this.f1634a = (ClipData) x2.g.g(c0036d.f1629a);
            this.b = x2.g.c(c0036d.b, 0, 5, Payload.SOURCE);
            this.f1635c = x2.g.f(c0036d.f1630c, 1);
            this.f1636d = c0036d.f1631d;
            this.f1637e = c0036d.f1632e;
        }

        @Override // androidx.core.view.d.f
        public int a() {
            return this.b;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo b() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public ClipData c() {
            return this.f1634a;
        }

        @Override // androidx.core.view.d.f
        public int d() {
            return this.f1635c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f1634a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f1635c));
            Uri uri = this.f1636d;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + this.f1636d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f1637e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public d(f fVar) {
        this.f1626a = fVar;
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
        return this.f1626a.c();
    }

    public int c() {
        return this.f1626a.d();
    }

    public int d() {
        return this.f1626a.a();
    }

    public ContentInfo f() {
        ContentInfo contentInfoB = this.f1626a.b();
        Objects.requireNonNull(contentInfoB);
        androidx.core.view.c.a(contentInfoB);
        return contentInfoB;
    }

    public String toString() {
        return this.f1626a.toString();
    }
}
