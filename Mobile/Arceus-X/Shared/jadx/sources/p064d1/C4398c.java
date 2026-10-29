package p064d1;

import android.annotation.SuppressLint;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0955f0;
import androidx.p616lifecycle.InterfaceC0978r;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p140g0.AbstractC5952w2;
import p140g0.C5888g2;
import p140g0.C5927q1;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5909m;
import p140g0.InterfaceC5937t;
import p204j0.ResolvedFeatureGroup;
import p296n0.InterfaceC8799o0;
import p424s0.C11145f;

/* JADX INFO: renamed from: d1.c */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class C4398c implements InterfaceC0978r, InterfaceC5905l {

    /* JADX INFO: renamed from: b */
    public final InterfaceC0980s f18263b;

    /* JADX INFO: renamed from: c */
    public final C11145f f18264c;

    /* JADX INFO: renamed from: a */
    public final Object f18262a = new Object();

    /* JADX INFO: renamed from: d */
    public volatile boolean f18265d = false;

    /* JADX INFO: renamed from: e */
    public boolean f18266e = false;

    /* JADX INFO: renamed from: f */
    public boolean f18267f = false;

    /* JADX INFO: renamed from: g */
    public C5888g2 f18268g = null;

    public C4398c(InterfaceC0980s interfaceC0980s, C11145f c11145f) {
        this.f18263b = interfaceC0980s;
        this.f18264c = c11145f;
        if (interfaceC0980s.mo4656a().getState().m4945b(AbstractC0966l.b.STARTED)) {
            c11145f.m41994w();
        } else {
            c11145f.m41973H();
        }
        interfaceC0980s.mo4656a().mo4935a(this);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m22071m(ResolvedFeatureGroup resolvedFeatureGroup, C5888g2 c5888g2) {
        HashSet hashSet = new HashSet();
        if (resolvedFeatureGroup != null) {
            hashSet.addAll(resolvedFeatureGroup.m29677a());
        }
        c5888g2.m26467d().accept(hashSet);
    }

    /* JADX INFO: renamed from: A */
    public void m22072A() {
        synchronized (this.f18262a) {
            try {
                if (this.f18266e) {
                    this.f18266e = false;
                    if (this.f18263b.mo4656a().getState().m4945b(AbstractC0966l.b.STARTED)) {
                        onStart(this.f18263b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: c */
    public InterfaceC5909m mo22073c() {
        return this.f18264c.mo22073c();
    }

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: d */
    public InterfaceC5937t mo22074d() {
        return this.f18264c.mo22074d();
    }

    /* JADX INFO: renamed from: n */
    public void m22075n(final C5888g2 c5888g2) {
        synchronized (this.f18262a) {
            try {
                if (this.f18268g == null) {
                    this.f18268g = c5888g2;
                } else if (c5888g2.getIsLegacy()) {
                    if (!this.f18268g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f18268g.m26474k());
                    arrayList.addAll(c5888g2.m26474k());
                    this.f18268g = new C5927q1(arrayList, c5888g2.getViewPort(), c5888g2.m26466c());
                } else {
                    if (this.f18268g.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f18268g = c5888g2;
                    C11145f c11145f = this.f18264c;
                    c11145f.m41981f0(c11145f.m41977O());
                }
                this.f18264c.m41987m0(c5888g2.getViewPort());
                this.f18264c.m41984i0(c5888g2.m26466c());
                this.f18264c.m41986l0(c5888g2.getSessionType());
                this.f18264c.m41985k0(c5888g2.m26469f());
                final ResolvedFeatureGroup resolvedFeatureGroupM29676b = ResolvedFeatureGroup.m29676b(c5888g2, (InterfaceC8799o0) mo22074d());
                c5888g2.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: d1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4398c.m22071m(resolvedFeatureGroupM29676b, c5888g2);
                    }
                });
                this.f18264c.m41988n(c5888g2.m26474k(), resolvedFeatureGroupM29676b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC0955f0(AbstractC0966l.a.ON_DESTROY)
    public void onDestroy(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18262a) {
            C11145f c11145f = this.f18264c;
            c11145f.m41981f0(c11145f.m41977O());
        }
    }

    @InterfaceC0955f0(AbstractC0966l.a.ON_PAUSE)
    public void onPause(InterfaceC0980s interfaceC0980s) {
        this.f18264c.m41982h(false);
    }

    @InterfaceC0955f0(AbstractC0966l.a.ON_RESUME)
    public void onResume(InterfaceC0980s interfaceC0980s) {
        this.f18264c.m41982h(true);
    }

    @InterfaceC0955f0(AbstractC0966l.a.ON_START)
    public void onStart(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18262a) {
            try {
                if (!this.f18266e && !this.f18267f) {
                    this.f18264c.m41994w();
                    this.f18265d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @InterfaceC0955f0(AbstractC0966l.a.ON_STOP)
    public void onStop(InterfaceC0980s interfaceC0980s) {
        synchronized (this.f18262a) {
            try {
                if (!this.f18266e && !this.f18267f) {
                    this.f18264c.m41973H();
                    this.f18265d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public C11145f m22076s() {
        return this.f18264c;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC0980s m22077t() {
        InterfaceC0980s interfaceC0980s;
        synchronized (this.f18262a) {
            interfaceC0980s = this.f18263b;
        }
        return interfaceC0980s;
    }

    /* JADX INFO: renamed from: u */
    public List<AbstractC5952w2> m22078u() {
        List<AbstractC5952w2> listUnmodifiableList;
        synchronized (this.f18262a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f18264c.m41977O());
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: v */
    public boolean m22079v(AbstractC5952w2 abstractC5952w2) {
        boolean zContains;
        synchronized (this.f18262a) {
            zContains = this.f18264c.m41977O().contains(abstractC5952w2);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: w */
    public boolean m22080w() {
        boolean zMo26476m;
        synchronized (this.f18262a) {
            C5888g2 c5888g2 = this.f18268g;
            zMo26476m = c5888g2 == null ? false : c5888g2.getIsLegacy();
        }
        return zMo26476m;
    }

    /* JADX INFO: renamed from: x */
    public void m22081x() {
        synchronized (this.f18262a) {
            try {
                if (this.f18266e) {
                    return;
                }
                onStop(this.f18263b);
                this.f18266e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m22082y(C5888g2 c5888g2) {
        synchronized (this.f18262a) {
            try {
                C5888g2 c5888g3 = this.f18268g;
                if (c5888g3 != null && c5888g3.getIsLegacy() == c5888g2.getIsLegacy()) {
                    C5927q1 c5927q1 = null;
                    if (this.f18268g.getIsLegacy() || c5888g2.getIsLegacy()) {
                        if (this.f18268g.getIsLegacy() && c5888g2.getIsLegacy()) {
                            ArrayList arrayList = new ArrayList(this.f18268g.m26474k());
                            arrayList.removeAll(c5888g2.m26474k());
                            if (!arrayList.isEmpty()) {
                                c5927q1 = new C5927q1(arrayList, this.f18268g.getViewPort(), this.f18268g.m26466c());
                            }
                            this.f18268g = c5927q1;
                        }
                    } else if (this.f18268g != c5888g2) {
                        return;
                    } else {
                        this.f18268g = null;
                    }
                    ArrayList arrayList2 = new ArrayList(c5888g2.m26474k());
                    arrayList2.retainAll(this.f18264c.m41977O());
                    this.f18264c.m41981f0(arrayList2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m22083z() {
        synchronized (this.f18262a) {
            C11145f c11145f = this.f18264c;
            c11145f.m41981f0(c11145f.m41977O());
            this.f18268g = null;
        }
    }
}
