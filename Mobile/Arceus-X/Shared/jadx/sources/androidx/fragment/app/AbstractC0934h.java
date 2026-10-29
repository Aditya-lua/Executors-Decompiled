package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p118f4.C5348c;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0934h {

    /* JADX INFO: renamed from: a */
    public final C0931e f3521a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f3522b;

    /* JADX INFO: renamed from: d */
    public int f3524d;

    /* JADX INFO: renamed from: e */
    public int f3525e;

    /* JADX INFO: renamed from: f */
    public int f3526f;

    /* JADX INFO: renamed from: g */
    public int f3527g;

    /* JADX INFO: renamed from: h */
    public int f3528h;

    /* JADX INFO: renamed from: i */
    public boolean f3529i;

    /* JADX INFO: renamed from: k */
    public String f3531k;

    /* JADX INFO: renamed from: l */
    public int f3532l;

    /* JADX INFO: renamed from: m */
    public CharSequence f3533m;

    /* JADX INFO: renamed from: n */
    public int f3534n;

    /* JADX INFO: renamed from: o */
    public CharSequence f3535o;

    /* JADX INFO: renamed from: p */
    public ArrayList<String> f3536p;

    /* JADX INFO: renamed from: q */
    public ArrayList<String> f3537q;

    /* JADX INFO: renamed from: s */
    public ArrayList<Runnable> f3539s;

    /* JADX INFO: renamed from: c */
    public ArrayList<a> f3523c = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public boolean f3530j = true;

    /* JADX INFO: renamed from: r */
    public boolean f3538r = false;

    /* JADX INFO: renamed from: androidx.fragment.app.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f3540a;

        /* JADX INFO: renamed from: b */
        public ComponentCallbacksC0929c f3541b;

        /* JADX INFO: renamed from: c */
        public boolean f3542c;

        /* JADX INFO: renamed from: d */
        public int f3543d;

        /* JADX INFO: renamed from: e */
        public int f3544e;

        /* JADX INFO: renamed from: f */
        public int f3545f;

        /* JADX INFO: renamed from: g */
        public int f3546g;

        /* JADX INFO: renamed from: h */
        public AbstractC0966l.b f3547h;

        /* JADX INFO: renamed from: i */
        public AbstractC0966l.b f3548i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10, ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f3540a = i10;
            this.f3541b = componentCallbacksC0929c;
            this.f3542c = false;
            AbstractC0966l.b bVar = AbstractC0966l.b.RESUMED;
            this.f3547h = bVar;
            this.f3548i = bVar;
        }

        public a(int i10, ComponentCallbacksC0929c componentCallbacksC0929c, boolean z10) {
            this.f3540a = i10;
            this.f3541b = componentCallbacksC0929c;
            this.f3542c = z10;
            AbstractC0966l.b bVar = AbstractC0966l.b.RESUMED;
            this.f3547h = bVar;
            this.f3548i = bVar;
        }
    }

    public AbstractC0934h(@NonNull C0931e c0931e, ClassLoader classLoader) {
        this.f3521a = c0931e;
        this.f3522b = classLoader;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public AbstractC0934h m4775b(int i10, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c, String str) {
        mo4512l(i10, componentCallbacksC0929c, str, 1);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final AbstractC0934h m4776c(@NonNull ViewGroup viewGroup, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c, String str) {
        componentCallbacksC0929c.f3417J = viewGroup;
        componentCallbacksC0929c.f3455r = true;
        return m4775b(viewGroup.getId(), componentCallbacksC0929c, str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public AbstractC0934h m4777d(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c, String str) {
        mo4512l(0, componentCallbacksC0929c, str, 1);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m4778e(a aVar) {
        this.f3523c.add(aVar);
        aVar.f3543d = this.f3524d;
        aVar.f3544e = this.f3525e;
        aVar.f3545f = this.f3526f;
        aVar.f3546g = this.f3527g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public AbstractC0934h m4779f(String str) {
        if (!this.f3530j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f3529i = true;
        this.f3531k = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo4508g();

    /* JADX INFO: renamed from: h */
    public abstract int mo4509h();

    /* JADX INFO: renamed from: i */
    public abstract void mo4510i();

    /* JADX INFO: renamed from: j */
    public abstract void mo4511j();

    @NonNull
    /* JADX INFO: renamed from: k */
    public AbstractC0934h m4780k() {
        if (this.f3529i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3530j = false;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void mo4512l(int i10, ComponentCallbacksC0929c componentCallbacksC0929c, String str, int i11) {
        String str2 = componentCallbacksC0929c.f3427T;
        if (str2 != null) {
            C5348c.m24676f(componentCallbacksC0929c, str2);
        }
        Class<?> cls = componentCallbacksC0929c.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC0929c.f3409B;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC0929c + ": was " + componentCallbacksC0929c.f3409B + " now " + str);
            }
            componentCallbacksC0929c.f3409B = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC0929c + " with tag " + str + " to container view with no id");
            }
            int i12 = componentCallbacksC0929c.f3463z;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC0929c + ": was " + componentCallbacksC0929c.f3463z + " now " + i10);
            }
            componentCallbacksC0929c.f3463z = i10;
            componentCallbacksC0929c.f3408A = i10;
        }
        m4778e(new a(i11, componentCallbacksC0929c));
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public AbstractC0934h mo4513m(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        m4778e(new a(3, componentCallbacksC0929c));
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public AbstractC0934h m4781n(int i10, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        return m4782o(i10, componentCallbacksC0929c, null);
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public AbstractC0934h m4782o(int i10, @NonNull ComponentCallbacksC0929c componentCallbacksC0929c, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo4512l(i10, componentCallbacksC0929c, str, 2);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public AbstractC0934h m4783p(boolean z10, @NonNull Runnable runnable) {
        if (!z10) {
            m4780k();
        }
        if (this.f3539s == null) {
            this.f3539s = new ArrayList<>();
        }
        this.f3539s.add(runnable);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public AbstractC0934h m4784q(int i10, int i11) {
        return m4785r(i10, i11, 0, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC0934h m4785r(int i10, int i11, int i12, int i13) {
        this.f3524d = i10;
        this.f3525e = i11;
        this.f3526f = i12;
        this.f3527g = i13;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public AbstractC0934h m4786s(boolean z10) {
        this.f3538r = z10;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public AbstractC0934h mo4514t(@NonNull ComponentCallbacksC0929c componentCallbacksC0929c) {
        m4778e(new a(5, componentCallbacksC0929c));
        return this;
    }
}
