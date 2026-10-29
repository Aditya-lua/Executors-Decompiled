package p093e4;

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
import androidx.core.view.InterfaceC0624o;
import androidx.core.view.InterfaceC0630r;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0984u;
import androidx.p616lifecycle.InterfaceC0947c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p068d5.C4442f;
import p068d5.InterfaceC4445i;
import p088e.ActivityC4722p;
import p088e.C4723p0;
import p088e.InterfaceC4727r0;
import p113f.InterfaceC5221b;
import p139g.AbstractC5857f;
import p139g.InterfaceC5858g;
import p235k2.C7410b;
import p235k2.C7416h;
import p235k2.C7427s;
import p235k2.InterfaceC7423o;
import p235k2.InterfaceC7424p;
import p261l2.InterfaceC7978e;
import p261l2.InterfaceC7979f;
import p285m4.AbstractC8422a;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: e4.q */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC4831q extends ActivityC4722p implements C7410b.d {

    /* JADX INFO: renamed from: A */
    public boolean f19502A;

    /* JADX INFO: renamed from: z */
    public boolean f19506z;

    /* JADX INFO: renamed from: x */
    public final C4834s f19504x = C4834s.m23372b(new a());

    /* JADX INFO: renamed from: y */
    public final C0984u f19505y = new C0984u(this);

    /* JADX INFO: renamed from: B */
    public boolean f19503B = true;

    /* JADX INFO: renamed from: e4.q$a */
    public class a extends AbstractC4835t<ActivityC4831q> implements InterfaceC7978e, InterfaceC7979f, InterfaceC7423o, InterfaceC7424p, InterfaceC0947c1, InterfaceC4727r0, InterfaceC5858g, InterfaceC4445i, InterfaceC4808e0, InterfaceC0624o {
        public a() {
            super(ActivityC4831q.this);
        }

        @Override // p068d5.InterfaceC4445i
        @NonNull
        /* JADX INFO: renamed from: A */
        public C4442f mo4583A() {
            return ActivityC4831q.this.mo4583A();
        }

        @Override // p088e.InterfaceC4727r0
        @NonNull
        /* JADX INFO: renamed from: Q */
        public C4723p0 mo23043Q() {
            return ActivityC4831q.this.mo23043Q();
        }

        @Override // androidx.core.view.InterfaceC0624o
        /* JADX INFO: renamed from: R */
        public void mo1908R(@NonNull InterfaceC0630r interfaceC0630r) {
            ActivityC4831q.this.mo1908R(interfaceC0630r);
        }

        @Override // androidx.p616lifecycle.InterfaceC0980s
        @NonNull
        /* JADX INFO: renamed from: a */
        public AbstractC0966l mo4656a() {
            return ActivityC4831q.this.f19505y;
        }

        @Override // p093e4.InterfaceC4808e0
        /* JADX INFO: renamed from: b */
        public void mo4485b(@NonNull FragmentManager fragmentManager, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
            ActivityC4831q.this.m23363q1(componentCallbacksC0929c);
        }

        @Override // p093e4.AbstractC4835t, p093e4.AbstractC4833r
        /* JADX INFO: renamed from: d */
        public View mo4728d(int i10) {
            return ActivityC4831q.this.findViewById(i10);
        }

        @Override // p261l2.InterfaceC7979f
        /* JADX INFO: renamed from: d0 */
        public void mo23050d0(@NonNull InterfaceC12631a<Integer> interfaceC12631a) {
            ActivityC4831q.this.mo23050d0(interfaceC12631a);
        }

        @Override // p093e4.AbstractC4835t, p093e4.AbstractC4833r
        /* JADX INFO: renamed from: e */
        public boolean mo4729e() {
            Window window = ActivityC4831q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p235k2.InterfaceC7423o
        /* JADX INFO: renamed from: e0 */
        public void mo23051e0(@NonNull InterfaceC12631a<C7416h> interfaceC12631a) {
            ActivityC4831q.this.mo23051e0(interfaceC12631a);
        }

        @Override // p261l2.InterfaceC7978e
        /* JADX INFO: renamed from: g0 */
        public void mo23054g0(@NonNull InterfaceC12631a<Configuration> interfaceC12631a) {
            ActivityC4831q.this.mo23054g0(interfaceC12631a);
        }

        @Override // p235k2.InterfaceC7424p
        /* JADX INFO: renamed from: h0 */
        public void mo23055h0(@NonNull InterfaceC12631a<C7427s> interfaceC12631a) {
            ActivityC4831q.this.mo23055h0(interfaceC12631a);
        }

        @Override // p261l2.InterfaceC7979f
        /* JADX INFO: renamed from: j */
        public void mo23056j(@NonNull InterfaceC12631a<Integer> interfaceC12631a) {
            ActivityC4831q.this.mo23056j(interfaceC12631a);
        }

        @Override // p093e4.AbstractC4835t
        /* JADX INFO: renamed from: k */
        public void mo23365k(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
            ActivityC4831q.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.InterfaceC0624o
        /* JADX INFO: renamed from: l0 */
        public void mo1923l0(@NonNull InterfaceC0630r interfaceC0630r) {
            ActivityC4831q.this.mo1923l0(interfaceC0630r);
        }

        @Override // p093e4.AbstractC4835t
        @NonNull
        /* JADX INFO: renamed from: m */
        public LayoutInflater mo23367m() {
            return ActivityC4831q.this.getLayoutInflater().cloneInContext(ActivityC4831q.this);
        }

        @Override // p093e4.AbstractC4835t
        /* JADX INFO: renamed from: o */
        public void mo23368o() {
            m23369p();
        }

        /* JADX INFO: renamed from: p */
        public void m23369p() {
            ActivityC4831q.this.m23049Y0();
        }

        @Override // p261l2.InterfaceC7978e
        /* JADX INFO: renamed from: p0 */
        public void mo23057p0(@NonNull InterfaceC12631a<Configuration> interfaceC12631a) {
            ActivityC4831q.this.mo23057p0(interfaceC12631a);
        }

        @Override // p139g.InterfaceC5858g
        @NonNull
        /* JADX INFO: renamed from: q */
        public AbstractC5857f getActivityResultRegistry() {
            return ActivityC4831q.this.getActivityResultRegistry();
        }

        /* JADX DEBUG: Method merged with bridge method: l()Ljava/lang/Object; */
        @Override // p093e4.AbstractC4835t
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public ActivityC4831q mo23366l() {
            return ActivityC4831q.this;
        }

        @Override // androidx.p616lifecycle.InterfaceC0947c1
        @NonNull
        /* JADX INFO: renamed from: w */
        public C0944b1 mo4712w() {
            return ActivityC4831q.this.mo4712w();
        }

        @Override // p235k2.InterfaceC7423o
        /* JADX INFO: renamed from: y */
        public void mo23059y(@NonNull InterfaceC12631a<C7416h> interfaceC12631a) {
            ActivityC4831q.this.mo23059y(interfaceC12631a);
        }

        @Override // p235k2.InterfaceC7424p
        /* JADX INFO: renamed from: z */
        public void mo23060z(@NonNull InterfaceC12631a<C7427s> interfaceC12631a) {
            ActivityC4831q.this.mo23060z(interfaceC12631a);
        }
    }

    public ActivityC4831q() {
        m23356n1();
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ Bundle m23354i1(ActivityC4831q activityC4831q) {
        activityC4831q.m23362o1();
        activityC4831q.f19505y.m4986j(AbstractC0966l.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: n1 */
    private void m23356n1() {
        mo4583A().m22354c("android:support:lifecycle", new C4442f.b() { // from class: e4.m
            @Override // p068d5.C4442f.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo4974a() {
                return ActivityC4831q.m23354i1(this.f19492a);
            }
        });
        mo23054g0(new InterfaceC12631a() { // from class: e4.n
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                this.f19495a.f19504x.m23384m();
            }
        });
        m23041O0(new InterfaceC12631a() { // from class: e4.o
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                this.f19498a.f19504x.m23384m();
            }
        });
        m23040N0(new InterfaceC5221b() { // from class: e4.p
            @Override // p113f.InterfaceC5221b
            /* JADX INFO: renamed from: a */
            public final void mo23005a(Context context) {
                this.f19501a.f19504x.m23373a(null);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public static boolean m23357p1(FragmentManager fragmentManager, AbstractC0966l.b bVar) {
        boolean zM23357p1 = false;
        for (ComponentCallbacksC0929c componentCallbacksC0929c : fragmentManager.m4477z0()) {
            if (componentCallbacksC0929c != null) {
                if (componentCallbacksC0929c.m4601G() != null) {
                    zM23357p1 |= m23357p1(componentCallbacksC0929c.m4709v(), bVar);
                }
                C4820k0 c4820k0 = componentCallbacksC0929c.f3430W;
                if (c4820k0 != null && c4820k0.mo4656a().getState().m4945b(AbstractC0966l.b.STARTED)) {
                    componentCallbacksC0929c.f3430W.m23346g(bVar);
                    zM23357p1 = true;
                }
                if (componentCallbacksC0929c.f3429V.getState().m4945b(AbstractC0966l.b.STARTED)) {
                    componentCallbacksC0929c.f3429V.m4991o(bVar);
                    zM23357p1 = true;
                }
            }
        }
        return zM23357p1;
    }

    @Override // p235k2.C7410b.d
    @Deprecated
    /* JADX INFO: renamed from: P */
    public final void mo23358P(int i10) {
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (m30728r0(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f19506z);
            printWriter.print(" mResumed=");
            printWriter.print(this.f19502A);
            printWriter.print(" mStopped=");
            printWriter.print(this.f19503B);
            if (getApplication() != null) {
                AbstractC8422a.m34114b(this).mo34115a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f19504x.m23383l().m4417b0(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final View m23359k1(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f19504x.m23385n(view, str, context, attributeSet);
    }

    @NonNull
    /* JADX INFO: renamed from: l1 */
    public FragmentManager m23360l1() {
        return this.f19504x.m23383l();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: m1 */
    public AbstractC8422a m23361m1() {
        return AbstractC8422a.m34114b(this);
    }

    /* JADX INFO: renamed from: o1 */
    public void m23362o1() {
        while (m23357p1(m23360l1(), AbstractC0966l.b.CREATED)) {
        }
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f19504x.m23384m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19505y.m4986j(AbstractC0966l.a.ON_CREATE);
        this.f19504x.m23376e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewM23359k1 = m23359k1(view, str, context, attributeSet);
        return viewM23359k1 == null ? super.onCreateView(view, str, context, attributeSet) : viewM23359k1;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f19504x.m23377f();
        this.f19505y.m4986j(AbstractC0966l.a.ON_DESTROY);
    }

    @Override // p088e.ActivityC4722p, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f19504x.m23375d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f19502A = false;
        this.f19504x.m23378g();
        this.f19505y.m4986j(AbstractC0966l.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m23364r1();
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f19504x.m23384m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f19504x.m23384m();
        super.onResume();
        this.f19502A = true;
        this.f19504x.m23382k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f19504x.m23384m();
        super.onStart();
        this.f19503B = false;
        if (!this.f19506z) {
            this.f19506z = true;
            this.f19504x.m23374c();
        }
        this.f19504x.m23382k();
        this.f19505y.m4986j(AbstractC0966l.a.ON_START);
        this.f19504x.m23380i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f19504x.m23384m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f19503B = true;
        m23362o1();
        this.f19504x.m23381j();
        this.f19505y.m4986j(AbstractC0966l.a.ON_STOP);
    }

    @Deprecated
    /* JADX INFO: renamed from: q1 */
    public void m23363q1(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
    }

    /* JADX INFO: renamed from: r1 */
    public void m23364r1() {
        this.f19505y.m4986j(AbstractC0966l.a.ON_RESUME);
        this.f19504x.m23379h();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewM23359k1 = m23359k1(null, str, context, attributeSet);
        return viewM23359k1 == null ? super.onCreateView(str, context, attributeSet) : viewM23359k1;
    }
}
