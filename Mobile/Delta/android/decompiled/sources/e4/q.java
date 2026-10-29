package e4;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import e.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class q extends e.p implements k2.b.d {
    public boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15155z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f15153x = s.b(new a());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final androidx.p000lifecycle.u f15154y = new androidx.p000lifecycle.u(this);
    public boolean B = true;

    public class a extends t<q> implements l2.e, l2.f, k2.o, k2.p, c1, r0, g.g, d5.i, e0, androidx.core.view.o {
        public a() {
            super(q.this);
        }

        @Override // d5.i
        @NonNull
        public d5.f A() {
            return q.this.A();
        }

        @Override // e.r0
        @NonNull
        public e.p0 Q() {
            return q.this.Q();
        }

        @Override // androidx.core.view.o
        public void R(@NonNull androidx.core.view.r rVar) {
            q.this.R(rVar);
        }

        @Override // androidx.p000lifecycle.s
        @NonNull
        public androidx.p000lifecycle.l a() {
            return q.this.f15154y;
        }

        @Override // e4.e0
        public void b(@NonNull FragmentManager fragmentManager, @NonNull androidx.fragment.app.c cVar) {
            q.this.q1(cVar);
        }

        @Override // e4.t, e4.r
        public View d(int i10) {
            return q.this.findViewById(i10);
        }

        @Override // l2.f
        public void d0(@NonNull x2.a<Integer> aVar) {
            q.this.d0(aVar);
        }

        @Override // e4.t, e4.r
        public boolean e() {
            Window window = q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // k2.o
        public void e0(@NonNull x2.a<k2.h> aVar) {
            q.this.e0(aVar);
        }

        @Override // l2.e
        public void g0(@NonNull x2.a<Configuration> aVar) {
            q.this.g0(aVar);
        }

        @Override // k2.p
        public void h0(@NonNull x2.a<k2.s> aVar) {
            q.this.h0(aVar);
        }

        @Override // l2.f
        public void j(@NonNull x2.a<Integer> aVar) {
            q.this.j(aVar);
        }

        @Override // e4.t
        public void k(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
            q.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.o
        public void l0(@NonNull androidx.core.view.r rVar) {
            q.this.l0(rVar);
        }

        @Override // e4.t
        @NonNull
        public LayoutInflater m() {
            return q.this.getLayoutInflater().cloneInContext(q.this);
        }

        @Override // e4.t
        public void o() {
            p();
        }

        public void p() {
            q.this.Y0();
        }

        @Override // l2.e
        public void p0(@NonNull x2.a<Configuration> aVar) {
            q.this.p0(aVar);
        }

        @Override // g.g
        @NonNull
        /* JADX INFO: renamed from: q */
        public g.f getActivityResultRegistry() {
            return q.this.getActivityResultRegistry();
        }

        @Override // e4.t
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public q l() {
            return q.this;
        }

        @Override // androidx.p000lifecycle.c1
        @NonNull
        public b1 w() {
            return q.this.w();
        }

        @Override // k2.o
        public void y(@NonNull x2.a<k2.h> aVar) {
            q.this.y(aVar);
        }

        @Override // k2.p
        public void z(@NonNull x2.a<k2.s> aVar) {
            q.this.z(aVar);
        }
    }

    public q() {
        n1();
    }

    public static /* synthetic */ Bundle i1(q qVar) {
        qVar.o1();
        qVar.f15154y.j(androidx.lifecycle.l.a.ON_STOP);
        return new Bundle();
    }

    private void n1() {
        A().c("android:support:lifecycle", new d5.f.b() { // from class: e4.m
            @Override // d5.f.b
            public final Bundle a() {
                return q.i1(this.f15146a);
            }
        });
        g0(new x2.a() { // from class: e4.n
            @Override // x2.a
            public final void accept(Object obj) {
                this.f15148a.f15153x.m();
            }
        });
        O0(new x2.a() { // from class: e4.o
            @Override // x2.a
            public final void accept(Object obj) {
                this.f15150a.f15153x.m();
            }
        });
        N0(new f.b() { // from class: e4.p
            @Override // f.b
            public final void a(Context context) {
                this.f15152a.f15153x.a(null);
            }
        });
    }

    public static boolean p1(FragmentManager fragmentManager, androidx.lifecycle.l.b bVar) {
        boolean zP1 = false;
        for (androidx.fragment.app.c cVar : fragmentManager.z0()) {
            if (cVar != null) {
                if (cVar.G() != null) {
                    zP1 |= p1(cVar.v(), bVar);
                }
                k0 k0Var = cVar.W;
                if (k0Var != null && k0Var.a().getState().b(androidx.lifecycle.l.b.STARTED)) {
                    cVar.W.g(bVar);
                    zP1 = true;
                }
                if (cVar.V.getState().b(androidx.lifecycle.l.b.STARTED)) {
                    cVar.V.o(bVar);
                    zP1 = true;
                }
            }
        }
        return zP1;
    }

    @Override // k2.b.d
    @Deprecated
    public final void P(int i10) {
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (r0(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f15155z);
            printWriter.print(" mResumed=");
            printWriter.print(this.A);
            printWriter.print(" mStopped=");
            printWriter.print(this.B);
            if (getApplication() != null) {
                m4.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f15153x.l().b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final View k1(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f15153x.n(view, str, context, attributeSet);
    }

    @NonNull
    public FragmentManager l1() {
        return this.f15153x.l();
    }

    @NonNull
    @Deprecated
    public m4.a m1() {
        return m4.a.b(this);
    }

    public void o1() {
        while (p1(l1(), androidx.lifecycle.l.b.CREATED)) {
        }
    }

    @Override // e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f15153x.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15154y.j(androidx.lifecycle.l.a.ON_CREATE);
        this.f15153x.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewK1 = k1(view, str, context, attributeSet);
        return viewK1 == null ? super.onCreateView(view, str, context, attributeSet) : viewK1;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f15153x.f();
        this.f15154y.j(androidx.lifecycle.l.a.ON_DESTROY);
    }

    @Override // e.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f15153x.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.A = false;
        this.f15153x.g();
        this.f15154y.j(androidx.lifecycle.l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        r1();
    }

    @Override // e.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f15153x.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f15153x.m();
        super.onResume();
        this.A = true;
        this.f15153x.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f15153x.m();
        super.onStart();
        this.B = false;
        if (!this.f15155z) {
            this.f15155z = true;
            this.f15153x.c();
        }
        this.f15153x.k();
        this.f15154y.j(androidx.lifecycle.l.a.ON_START);
        this.f15153x.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f15153x.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.B = true;
        o1();
        this.f15153x.j();
        this.f15154y.j(androidx.lifecycle.l.a.ON_STOP);
    }

    @Deprecated
    public void q1(@NonNull androidx.fragment.app.c cVar) {
    }

    public void r1() {
        this.f15154y.j(androidx.lifecycle.l.a.ON_RESUME);
        this.f15153x.h();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewK1 = k1(null, str, context, attributeSet);
        return viewK1 == null ? super.onCreateView(str, context, attributeSet) : viewK1;
    }
}
