package f4;

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
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class v extends e.p implements k2.b.d {
    public boolean A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f15590z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f15588x = y.b(new a());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final androidx.p000lifecycle.u f15589y = new androidx.p000lifecycle.u(this);
    public boolean B = true;

    public class a extends a0<v> implements l2.e, l2.f, k2.o, k2.p, androidx.p000lifecycle.c1, e.r0, g.h, e5.i, o0, androidx.core.view.o {
        public a() {
            super(v.this);
        }

        @Override // e5.i
        @NonNull
        public e5.f A() {
            return v.this.A();
        }

        @Override // e.r0
        @NonNull
        public e.p0 P() {
            return v.this.P();
        }

        @Override // androidx.core.view.o
        public void Q(@NonNull androidx.core.view.r rVar) {
            v.this.Q(rVar);
        }

        @Override // androidx.p000lifecycle.s
        @NonNull
        public androidx.p000lifecycle.l a() {
            return v.this.f15589y;
        }

        @Override // f4.o0
        public void b(@NonNull k0 k0Var, @NonNull q qVar) {
            v.this.q1(qVar);
        }

        @Override // l2.f
        public void c0(@NonNull x2.a<Integer> aVar) {
            v.this.c0(aVar);
        }

        @Override // f4.a0, f4.x
        public View d(int i10) {
            return v.this.findViewById(i10);
        }

        @Override // k2.o
        public void d0(@NonNull x2.a<k2.h> aVar) {
            v.this.d0(aVar);
        }

        @Override // f4.a0, f4.x
        public boolean e() {
            Window window = v.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // l2.e
        public void f0(@NonNull x2.a<Configuration> aVar) {
            v.this.f0(aVar);
        }

        @Override // k2.p
        public void h0(@NonNull x2.a<k2.s> aVar) {
            v.this.h0(aVar);
        }

        @Override // l2.f
        public void j(@NonNull x2.a<Integer> aVar) {
            v.this.j(aVar);
        }

        @Override // f4.a0
        public void k(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
            v.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.o
        public void l0(@NonNull androidx.core.view.r rVar) {
            v.this.l0(rVar);
        }

        @Override // f4.a0
        @NonNull
        public LayoutInflater m() {
            return v.this.getLayoutInflater().cloneInContext(v.this);
        }

        @Override // f4.a0
        public void o() {
            p();
        }

        public void p() {
            v.this.Y0();
        }

        @Override // l2.e
        public void p0(@NonNull x2.a<Configuration> aVar) {
            v.this.p0(aVar);
        }

        @Override // g.h
        @NonNull
        /* JADX INFO: renamed from: q */
        public g.g getActivityResultRegistry() {
            return v.this.getActivityResultRegistry();
        }

        @Override // f4.a0
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public v l() {
            return v.this;
        }

        @Override // androidx.p000lifecycle.c1
        @NonNull
        public androidx.p000lifecycle.b1 w() {
            return v.this.w();
        }

        @Override // k2.o
        public void y(@NonNull x2.a<k2.h> aVar) {
            v.this.y(aVar);
        }

        @Override // k2.p
        public void z(@NonNull x2.a<k2.s> aVar) {
            v.this.z(aVar);
        }
    }

    public v() {
        n1();
    }

    public static /* synthetic */ Bundle i1(v vVar) {
        vVar.o1();
        vVar.f15589y.j(androidx.lifecycle.l.a.ON_STOP);
        return new Bundle();
    }

    private void n1() {
        A().c("android:support:lifecycle", new e5.f.b() { // from class: f4.r
            @Override // e5.f.b
            public final Bundle a() {
                return v.i1(this.f15547a);
            }
        });
        f0(new x2.a() { // from class: f4.s
            @Override // x2.a
            public final void accept(Object obj) {
                this.f15554a.f15588x.m();
            }
        });
        O0(new x2.a() { // from class: f4.t
            @Override // x2.a
            public final void accept(Object obj) {
                this.f15558a.f15588x.m();
            }
        });
        N0(new f.b() { // from class: f4.u
            @Override // f.b
            public final void a(Context context) {
                this.f15585a.f15588x.a(null);
            }
        });
    }

    public static boolean p1(k0 k0Var, androidx.lifecycle.l.b bVar) {
        boolean zP1 = false;
        for (q qVar : k0Var.z0()) {
            if (qVar != null) {
                if (qVar.F() != null) {
                    zP1 |= p1(qVar.u(), bVar);
                }
                x0 x0Var = qVar.W;
                if (x0Var != null && x0Var.a().getState().b(androidx.lifecycle.l.b.STARTED)) {
                    qVar.W.g(bVar);
                    zP1 = true;
                }
                if (qVar.V.getState().b(androidx.lifecycle.l.b.STARTED)) {
                    qVar.V.o(bVar);
                    zP1 = true;
                }
            }
        }
        return zP1;
    }

    @Override // k2.b.d
    @Deprecated
    public final void O(int i10) {
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
            printWriter.print(this.f15590z);
            printWriter.print(" mResumed=");
            printWriter.print(this.A);
            printWriter.print(" mStopped=");
            printWriter.print(this.B);
            if (getApplication() != null) {
                n4.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f15588x.l().b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final View k1(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f15588x.n(view, str, context, attributeSet);
    }

    @NonNull
    public k0 l1() {
        return this.f15588x.l();
    }

    @NonNull
    @Deprecated
    public n4.a m1() {
        return n4.a.b(this);
    }

    public void o1() {
        while (p1(l1(), androidx.lifecycle.l.b.CREATED)) {
        }
    }

    @Override // e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f15588x.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15589y.j(androidx.lifecycle.l.a.ON_CREATE);
        this.f15588x.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewK1 = k1(view, str, context, attributeSet);
        return viewK1 == null ? super.onCreateView(view, str, context, attributeSet) : viewK1;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f15588x.f();
        this.f15589y.j(androidx.lifecycle.l.a.ON_DESTROY);
    }

    @Override // e.p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f15588x.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.A = false;
        this.f15588x.g();
        this.f15589y.j(androidx.lifecycle.l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        r1();
    }

    @Override // e.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f15588x.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f15588x.m();
        super.onResume();
        this.A = true;
        this.f15588x.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f15588x.m();
        super.onStart();
        this.B = false;
        if (!this.f15590z) {
            this.f15590z = true;
            this.f15588x.c();
        }
        this.f15588x.k();
        this.f15589y.j(androidx.lifecycle.l.a.ON_START);
        this.f15588x.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f15588x.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.B = true;
        o1();
        this.f15588x.j();
        this.f15589y.j(androidx.lifecycle.l.a.ON_STOP);
    }

    @Deprecated
    public void q1(@NonNull q qVar) {
    }

    public void r1() {
        this.f15589y.j(androidx.lifecycle.l.a.ON_RESUME);
        this.f15588x.h();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewK1 = k1(null, str, context, attributeSet);
        return viewK1 == null ? super.onCreateView(str, context, attributeSet) : viewK1;
    }
}
