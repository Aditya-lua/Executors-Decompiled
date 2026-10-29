package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;
import p533x2.C12637g;

/* JADX INFO: renamed from: androidx.core.view.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0591d {

    /* JADX INFO: renamed from: a */
    public final f f2361a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final c f2362a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2362a = new b(clipData, i10);
            } else {
                this.f2362a = new d(clipData, i10);
            }
        }

        /* JADX INFO: renamed from: a */
        public C0591d m2832a() {
            return this.f2362a.build();
        }

        /* JADX INFO: renamed from: b */
        public a m2833b(Bundle bundle) {
            this.f2362a.setExtras(bundle);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m2834c(int i10) {
            this.f2362a.mo2837b(i10);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m2835d(Uri uri) {
            this.f2362a.mo2836a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    public static final class b implements c {

        /* JADX INFO: renamed from: a */
        public final ContentInfo.Builder f2363a;

        public b(ClipData clipData, int i10) {
            this.f2363a = C0594e.m2880a(clipData, i10);
        }

        @Override // androidx.core.view.C0591d.c
        /* JADX INFO: renamed from: a */
        public void mo2836a(Uri uri) {
            this.f2363a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0591d.c
        /* JADX INFO: renamed from: b */
        public void mo2837b(int i10) {
            this.f2363a.setFlags(i10);
        }

        @Override // androidx.core.view.C0591d.c
        public C0591d build() {
            return new C0591d(new e(this.f2363a.build()));
        }

        @Override // androidx.core.view.C0591d.c
        public void setExtras(Bundle bundle) {
            this.f2363a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2836a(Uri uri);

        /* JADX INFO: renamed from: b */
        void mo2837b(int i10);

        C0591d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d */
    public static final class d implements c {

        /* JADX INFO: renamed from: a */
        public ClipData f2364a;

        /* JADX INFO: renamed from: b */
        public int f2365b;

        /* JADX INFO: renamed from: c */
        public int f2366c;

        /* JADX INFO: renamed from: d */
        public Uri f2367d;

        /* JADX INFO: renamed from: e */
        public Bundle f2368e;

        public d(ClipData clipData, int i10) {
            this.f2364a = clipData;
            this.f2365b = i10;
        }

        @Override // androidx.core.view.C0591d.c
        /* JADX INFO: renamed from: a */
        public void mo2836a(Uri uri) {
            this.f2367d = uri;
        }

        @Override // androidx.core.view.C0591d.c
        /* JADX INFO: renamed from: b */
        public void mo2837b(int i10) {
            this.f2366c = i10;
        }

        @Override // androidx.core.view.C0591d.c
        public C0591d build() {
            return new C0591d(new g(this));
        }

        @Override // androidx.core.view.C0591d.c
        public void setExtras(Bundle bundle) {
            this.f2368e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    public static final class e implements f {

        /* JADX INFO: renamed from: a */
        public final ContentInfo f2369a;

        public e(ContentInfo contentInfo) {
            this.f2369a = C0588c.m2818a(C12637g.m47075g(contentInfo));
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: a */
        public ContentInfo mo2838a() {
            return this.f2369a;
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: b */
        public ClipData mo2839b() {
            return this.f2369a.getClip();
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: c */
        public int mo2840c() {
            return this.f2369a.getFlags();
        }

        @Override // androidx.core.view.C0591d.f
        public int getSource() {
            return this.f2369a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2369a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        ContentInfo mo2838a();

        /* JADX INFO: renamed from: b */
        ClipData mo2839b();

        /* JADX INFO: renamed from: c */
        int mo2840c();

        int getSource();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    public static final class g implements f {

        /* JADX INFO: renamed from: a */
        public final ClipData f2370a;

        /* JADX INFO: renamed from: b */
        public final int f2371b;

        /* JADX INFO: renamed from: c */
        public final int f2372c;

        /* JADX INFO: renamed from: d */
        public final Uri f2373d;

        /* JADX INFO: renamed from: e */
        public final Bundle f2374e;

        public g(d dVar) {
            this.f2370a = (ClipData) C12637g.m47075g(dVar.f2364a);
            this.f2371b = C12637g.m47071c(dVar.f2365b, 0, 5, Payload.SOURCE);
            this.f2372c = C12637g.m47074f(dVar.f2366c, 1);
            this.f2373d = dVar.f2367d;
            this.f2374e = dVar.f2368e;
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: a */
        public ContentInfo mo2838a() {
            return null;
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: b */
        public ClipData mo2839b() {
            return this.f2370a;
        }

        @Override // androidx.core.view.C0591d.f
        /* JADX INFO: renamed from: c */
        public int mo2840c() {
            return this.f2372c;
        }

        @Override // androidx.core.view.C0591d.f
        public int getSource() {
            return this.f2371b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f2370a.getDescription());
            sb2.append(", source=");
            sb2.append(C0591d.m2826e(this.f2371b));
            sb2.append(", flags=");
            sb2.append(C0591d.m2825a(this.f2372c));
            if (this.f2373d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2373d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f2374e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C0591d(f fVar) {
        this.f2361a = fVar;
    }

    /* JADX INFO: renamed from: a */
    public static String m2825a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    /* JADX INFO: renamed from: e */
    public static String m2826e(int i10) {
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

    /* JADX INFO: renamed from: g */
    public static C0591d m2827g(ContentInfo contentInfo) {
        return new C0591d(new e(contentInfo));
    }

    /* JADX INFO: renamed from: b */
    public ClipData m2828b() {
        return this.f2361a.mo2839b();
    }

    /* JADX INFO: renamed from: c */
    public int m2829c() {
        return this.f2361a.mo2840c();
    }

    /* JADX INFO: renamed from: d */
    public int m2830d() {
        return this.f2361a.getSource();
    }

    /* JADX INFO: renamed from: f */
    public ContentInfo m2831f() {
        ContentInfo contentInfoMo2838a = this.f2361a.mo2838a();
        Objects.requireNonNull(contentInfoMo2838a);
        C0588c.m2818a(contentInfoMo2838a);
        return contentInfoMo2838a;
    }

    public String toString() {
        return this.f2361a.toString();
    }
}
