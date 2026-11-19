package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2839a;
    public a b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2840a = 0;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2843e;

        public void a(int i10) {
            this.f2840a = i10 | this.f2840a;
        }

        public boolean b() {
            int i10 = this.f2840a;
            if ((i10 & 7) != 0 && (i10 & c(this.f2842d, this.b)) == 0) {
                return false;
            }
            int i11 = this.f2840a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f2842d, this.f2841c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f2840a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f2843e, this.b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f2840a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f2843e, this.f2841c) << 12)) != 0;
        }

        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        public void d() {
            this.f2840a = 0;
        }

        public void e(int i10, int i11, int i12, int i13) {
            this.b = i10;
            this.f2841c = i11;
            this.f2842d = i12;
            this.f2843e = i13;
        }
    }

    public interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    public t(b bVar) {
        this.f2839a = bVar;
    }

    public View a(int i10, int i11, int i12, int i13) {
        int iC = this.f2839a.c();
        int iD = this.f2839a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f2839a.a(i10);
            this.b.e(iC, iD, this.f2839a.b(viewA), this.f2839a.e(viewA));
            if (i12 != 0) {
                this.b.d();
                this.b.a(i12);
                if (this.b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.b.d();
                this.b.a(i13);
                if (this.b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean b(View view, int i10) {
        this.b.e(this.f2839a.c(), this.f2839a.d(), this.f2839a.b(view), this.f2839a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.b.d();
        this.b.a(i10);
        return this.b.b();
    }
}
