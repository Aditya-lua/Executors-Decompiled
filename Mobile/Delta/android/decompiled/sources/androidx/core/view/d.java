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
    public final f f1664a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f1665a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1665a = new b(clipData, i10);
            } else {
                this.f1665a = new C0024d(clipData, i10);
            }
        }

        public d a() {
            return this.f1665a.build();
        }

        public a b(Bundle bundle) {
            this.f1665a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f1665a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f1665a.a(uri);
            return this;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f1666a;

        public b(ClipData clipData, int i10) {
            this.f1666a = androidx.core.view.e.a(clipData, i10);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1666a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1666a.setFlags(i10);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new e(this.f1666a.build()));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1666a.setExtras(bundle);
        }
    }

    public interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    public static final class C0024d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f1667a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f1669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f1670e;

        public C0024d(ClipData clipData, int i10) {
            this.f1667a = clipData;
            this.b = i10;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1669d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f1668c = i10;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1670e = bundle;
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f1671a;

        public e(ContentInfo contentInfo) {
            this.f1671a = androidx.core.view.c.a(x2.g.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return this.f1671a;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1671a.getClip();
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1671a.getFlags();
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.f1671a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1671a + "}";
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
        public final ClipData f1672a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f1674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f1675e;

        public g(C0024d c0024d) {
            this.f1672a = (ClipData) x2.g.g(c0024d.f1667a);
            this.b = x2.g.c(c0024d.b, 0, 5, Payload.SOURCE);
            this.f1673c = x2.g.f(c0024d.f1668c, 1);
            this.f1674d = c0024d.f1669d;
            this.f1675e = c0024d.f1670e;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public ClipData b() {
            return this.f1672a;
        }

        @Override // androidx.core.view.d.f
        public int c() {
            return this.f1673c;
        }

        @Override // androidx.core.view.d.f
        public int getSource() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f1672a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f1673c));
            if (this.f1674d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1674d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f1675e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public d(f fVar) {
        this.f1664a = fVar;
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
        return this.f1664a.b();
    }

    public int c() {
        return this.f1664a.c();
    }

    public int d() {
        return this.f1664a.getSource();
    }

    public ContentInfo f() {
        ContentInfo contentInfoA = this.f1664a.a();
        Objects.requireNonNull(contentInfoA);
        androidx.core.view.c.a(contentInfoA);
        return contentInfoA;
    }

    public String toString() {
        return this.f1664a.toString();
    }
}
