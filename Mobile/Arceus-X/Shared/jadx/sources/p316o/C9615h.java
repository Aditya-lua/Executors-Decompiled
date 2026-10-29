package p316o;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0584a1;
import androidx.core.view.C0645y0;
import androidx.core.view.InterfaceC0647z0;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.h */
/* JADX INFO: loaded from: classes.dex */
public class C9615h {

    /* JADX INFO: renamed from: c */
    public Interpolator f34893c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0647z0 f34894d;

    /* JADX INFO: renamed from: e */
    public boolean f34895e;

    /* JADX INFO: renamed from: b */
    public long f34892b = -1;

    /* JADX INFO: renamed from: f */
    public final C0584a1 f34896f = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0645y0> f34891a = new ArrayList<>();

    /* JADX INFO: renamed from: o.h$a */
    public class a extends C0584a1 {

        /* JADX INFO: renamed from: a */
        public boolean f34897a = false;

        /* JADX INFO: renamed from: b */
        public int f34898b = 0;

        public a() {
        }

        @Override // androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: b */
        public void mo2028b(View view) {
            int i10 = this.f34898b + 1;
            this.f34898b = i10;
            if (i10 == C9615h.this.f34891a.size()) {
                InterfaceC0647z0 interfaceC0647z0 = C9615h.this.f34894d;
                if (interfaceC0647z0 != null) {
                    interfaceC0647z0.mo2028b(null);
                }
                m37949d();
            }
        }

        @Override // androidx.core.view.C0584a1, androidx.core.view.InterfaceC0647z0
        /* JADX INFO: renamed from: c */
        public void mo2029c(View view) {
            if (this.f34897a) {
                return;
            }
            this.f34897a = true;
            InterfaceC0647z0 interfaceC0647z0 = C9615h.this.f34894d;
            if (interfaceC0647z0 != null) {
                interfaceC0647z0.mo2029c(null);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m37949d() {
            this.f34898b = 0;
            this.f34897a = false;
            C9615h.this.m37942b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37941a() {
        if (this.f34895e) {
            ArrayList<C0645y0> arrayList = this.f34891a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                C0645y0 c0645y0 = arrayList.get(i10);
                i10++;
                c0645y0.m3226c();
            }
            this.f34895e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37942b() {
        this.f34895e = false;
    }

    /* JADX INFO: renamed from: c */
    public C9615h m37943c(C0645y0 c0645y0) {
        if (!this.f34895e) {
            this.f34891a.add(c0645y0);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C9615h m37944d(C0645y0 c0645y0, C0645y0 c0645y1) {
        this.f34891a.add(c0645y0);
        c0645y1.m3232i(c0645y0.m3227d());
        this.f34891a.add(c0645y1);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C9615h m37945e(long j10) {
        if (!this.f34895e) {
            this.f34892b = j10;
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C9615h m37946f(Interpolator interpolator) {
        if (!this.f34895e) {
            this.f34893c = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C9615h m37947g(InterfaceC0647z0 interfaceC0647z0) {
        if (!this.f34895e) {
            this.f34894d = interfaceC0647z0;
        }
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m37948h() {
        if (this.f34895e) {
            return;
        }
        ArrayList<C0645y0> arrayList = this.f34891a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            C0645y0 c0645y0 = arrayList.get(i10);
            i10++;
            C0645y0 c0645y1 = c0645y0;
            long j10 = this.f34892b;
            if (j10 >= 0) {
                c0645y1.m3228e(j10);
            }
            Interpolator interpolator = this.f34893c;
            if (interpolator != null) {
                c0645y1.m3229f(interpolator);
            }
            if (this.f34894d != null) {
                c0645y1.m3230g(this.f34896f);
            }
            c0645y1.m3234k();
        }
        this.f34895e = true;
    }
}
