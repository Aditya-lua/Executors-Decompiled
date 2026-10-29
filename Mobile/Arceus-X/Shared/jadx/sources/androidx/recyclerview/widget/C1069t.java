package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes.dex */
public class C1069t {

    /* JADX INFO: renamed from: a */
    public final b f4329a;

    /* JADX INFO: renamed from: b */
    public a f4330b = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.t$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f4331a = 0;

        /* JADX INFO: renamed from: b */
        public int f4332b;

        /* JADX INFO: renamed from: c */
        public int f4333c;

        /* JADX INFO: renamed from: d */
        public int f4334d;

        /* JADX INFO: renamed from: e */
        public int f4335e;

        /* JADX INFO: renamed from: a */
        public void m6064a(int i10) {
            this.f4331a = i10 | this.f4331a;
        }

        /* JADX INFO: renamed from: b */
        public boolean m6065b() {
            int i10 = this.f4331a;
            if ((i10 & 7) != 0 && (i10 & m6066c(this.f4334d, this.f4332b)) == 0) {
                return false;
            }
            int i11 = this.f4331a;
            if ((i11 & 112) != 0 && (i11 & (m6066c(this.f4334d, this.f4333c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f4331a;
            if ((i12 & 1792) != 0 && (i12 & (m6066c(this.f4335e, this.f4332b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f4331a;
            return (i13 & 28672) == 0 || (i13 & (m6066c(this.f4335e, this.f4333c) << 12)) != 0;
        }

        /* JADX INFO: renamed from: c */
        public int m6066c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* JADX INFO: renamed from: d */
        public void m6067d() {
            this.f4331a = 0;
        }

        /* JADX INFO: renamed from: e */
        public void m6068e(int i10, int i11, int i12, int i13) {
            this.f4332b = i10;
            this.f4333c = i11;
            this.f4334d = i12;
            this.f4335e = i13;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.t$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo5642a(int i10);

        /* JADX INFO: renamed from: b */
        int mo5643b(View view);

        /* JADX INFO: renamed from: c */
        int mo5644c();

        /* JADX INFO: renamed from: d */
        int mo5645d();

        /* JADX INFO: renamed from: e */
        int mo5646e(View view);
    }

    public C1069t(b bVar) {
        this.f4329a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public View m6062a(int i10, int i11, int i12, int i13) {
        int iMo5644c = this.f4329a.mo5644c();
        int iMo5645d = this.f4329a.mo5645d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewMo5642a = this.f4329a.mo5642a(i10);
            this.f4330b.m6068e(iMo5644c, iMo5645d, this.f4329a.mo5643b(viewMo5642a), this.f4329a.mo5646e(viewMo5642a));
            if (i12 != 0) {
                this.f4330b.m6067d();
                this.f4330b.m6064a(i12);
                if (this.f4330b.m6065b()) {
                    return viewMo5642a;
                }
            }
            if (i13 != 0) {
                this.f4330b.m6067d();
                this.f4330b.m6064a(i13);
                if (this.f4330b.m6065b()) {
                    view = viewMo5642a;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public boolean m6063b(View view, int i10) {
        this.f4330b.m6068e(this.f4329a.mo5644c(), this.f4329a.mo5645d(), this.f4329a.mo5643b(view), this.f4329a.mo5646e(view));
        if (i10 == 0) {
            return false;
        }
        this.f4330b.m6067d();
        this.f4330b.m6064a(i10);
        return this.f4330b.m6065b();
    }
}
