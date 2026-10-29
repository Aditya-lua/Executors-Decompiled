package o;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.a1;
import androidx.core.view.y0;
import androidx.core.view.z0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f26975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f26976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26977e;
    public long b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a1 f26978f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<y0> f26974a = new ArrayList<>();

    public class a extends a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26979a = false;
        public int b = 0;

        public a() {
        }

        @Override // androidx.core.view.z0
        public void b(View view) {
            int i10 = this.b + 1;
            this.b = i10;
            if (i10 == h.this.f26974a.size()) {
                z0 z0Var = h.this.f26976d;
                if (z0Var != null) {
                    z0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.a1, androidx.core.view.z0
        public void c(View view) {
            if (this.f26979a) {
                return;
            }
            this.f26979a = true;
            z0 z0Var = h.this.f26976d;
            if (z0Var != null) {
                z0Var.c(null);
            }
        }

        public void d() {
            this.b = 0;
            this.f26979a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f26977e) {
            ArrayList<y0> arrayList = this.f26974a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                y0 y0Var = arrayList.get(i10);
                i10++;
                y0Var.c();
            }
            this.f26977e = false;
        }
    }

    public void b() {
        this.f26977e = false;
    }

    public h c(y0 y0Var) {
        if (!this.f26977e) {
            this.f26974a.add(y0Var);
        }
        return this;
    }

    public h d(y0 y0Var, y0 y0Var2) {
        this.f26974a.add(y0Var);
        y0Var2.i(y0Var.d());
        this.f26974a.add(y0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f26977e) {
            this.b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f26977e) {
            this.f26975c = interpolator;
        }
        return this;
    }

    public h g(z0 z0Var) {
        if (!this.f26977e) {
            this.f26976d = z0Var;
        }
        return this;
    }

    public void h() {
        if (this.f26977e) {
            return;
        }
        ArrayList<y0> arrayList = this.f26974a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            y0 y0Var = arrayList.get(i10);
            i10++;
            y0 y0Var2 = y0Var;
            long j10 = this.b;
            if (j10 >= 0) {
                y0Var2.e(j10);
            }
            Interpolator interpolator = this.f26975c;
            if (interpolator != null) {
                y0Var2.f(interpolator);
            }
            if (this.f26976d != null) {
                y0Var2.g(this.f26978f);
            }
            y0Var2.k();
        }
        this.f26977e = true;
    }
}
