package p371q5;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p504w1.C12277a;

/* JADX INFO: renamed from: q5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10433a {

    /* JADX INFO: renamed from: a */
    public final C12277a<String, Method> f37605a;

    /* JADX INFO: renamed from: b */
    public final C12277a<String, Method> f37606b;

    /* JADX INFO: renamed from: c */
    public final C12277a<String, Class> f37607c;

    public AbstractC10433a(C12277a<String, Method> c12277a, C12277a<String, Method> c12277a2, C12277a<String, Class> c12277a3) {
        this.f37605a = c12277a;
        this.f37606b = c12277a2;
        this.f37607c = c12277a3;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo40146A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m40147B(byte[] bArr, int i10) {
        mo40182w(i10);
        mo40146A(bArr);
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo40148C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m40149D(CharSequence charSequence, int i10) {
        mo40182w(i10);
        mo40148C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo40150E(int i10);

    /* JADX INFO: renamed from: F */
    public void m40151F(int i10, int i11) {
        mo40182w(i11);
        mo40150E(i10);
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo40152G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m40153H(Parcelable parcelable, int i10) {
        mo40182w(i10);
        mo40152G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo40154I(String str);

    /* JADX INFO: renamed from: J */
    public void m40155J(String str, int i10) {
        mo40182w(i10);
        mo40154I(str);
    }

    /* JADX INFO: renamed from: K */
    public <T extends InterfaceC10435c> void m40156K(T t8, AbstractC10433a abstractC10433a) {
        try {
            m40164e(t8.getClass()).invoke(null, t8, abstractC10433a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m40157L(InterfaceC10435c interfaceC10435c) {
        if (interfaceC10435c == null) {
            mo40154I(null);
            return;
        }
        m40159N(interfaceC10435c);
        AbstractC10433a abstractC10433aMo40161b = mo40161b();
        m40156K(interfaceC10435c, abstractC10433aMo40161b);
        abstractC10433aMo40161b.mo40160a();
    }

    /* JADX INFO: renamed from: M */
    public void m40158M(InterfaceC10435c interfaceC10435c, int i10) {
        mo40182w(i10);
        m40157L(interfaceC10435c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: q5.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final void m40159N(InterfaceC10435c interfaceC10435c) {
        try {
            mo40154I(m40162c(interfaceC10435c.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC10435c.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo40160a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC10433a mo40161b();

    /* JADX INFO: renamed from: c */
    public final Class m40162c(Class<? extends InterfaceC10435c> cls) throws ClassNotFoundException {
        Class cls2 = this.f37607c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f37607c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    public final Method m40163d(String str) throws NoSuchMethodException {
        Method method = this.f37605a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC10433a.class.getClassLoader()).getDeclaredMethod("read", AbstractC10433a.class);
        this.f37605a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public final Method m40164e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = this.f37606b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM40162c = m40162c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM40162c.getDeclaredMethod("write", cls, AbstractC10433a.class);
        this.f37606b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public boolean m40165f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo40166g();

    /* JADX INFO: renamed from: h */
    public boolean m40167h(boolean z10, int i10) {
        return !mo40172m(i10) ? z10 : mo40166g();
    }

    /* JADX INFO: renamed from: i */
    public abstract byte[] mo40168i();

    /* JADX INFO: renamed from: j */
    public byte[] m40169j(byte[] bArr, int i10) {
        return !mo40172m(i10) ? bArr : mo40168i();
    }

    /* JADX INFO: renamed from: k */
    public abstract CharSequence mo40170k();

    /* JADX INFO: renamed from: l */
    public CharSequence m40171l(CharSequence charSequence, int i10) {
        return !mo40172m(i10) ? charSequence : mo40170k();
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo40172m(int i10);

    /* JADX INFO: renamed from: n */
    public <T extends InterfaceC10435c> T m40173n(String str, AbstractC10433a abstractC10433a) {
        try {
            return (T) m40163d(str).invoke(null, abstractC10433a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo40174o();

    /* JADX INFO: renamed from: p */
    public int m40175p(int i10, int i11) {
        return !mo40172m(i11) ? i10 : mo40174o();
    }

    /* JADX INFO: renamed from: q */
    public abstract <T extends Parcelable> T mo40176q();

    /* JADX INFO: renamed from: r */
    public <T extends Parcelable> T m40177r(T t8, int i10) {
        return !mo40172m(i10) ? t8 : (T) mo40176q();
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo40178s();

    /* JADX INFO: renamed from: t */
    public String m40179t(String str, int i10) {
        return !mo40172m(i10) ? str : mo40178s();
    }

    /* JADX INFO: renamed from: u */
    public <T extends InterfaceC10435c> T m40180u() {
        String strMo40178s = mo40178s();
        if (strMo40178s == null) {
            return null;
        }
        return (T) m40173n(strMo40178s, mo40161b());
    }

    /* JADX INFO: renamed from: v */
    public <T extends InterfaceC10435c> T m40181v(T t8, int i10) {
        return !mo40172m(i10) ? t8 : (T) m40180u();
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo40182w(int i10);

    /* JADX INFO: renamed from: x */
    public void m40183x(boolean z10, boolean z11) {
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo40184y(boolean z10);

    /* JADX INFO: renamed from: z */
    public void m40185z(boolean z10, int i10) {
        mo40182w(i10);
        mo40184y(z10);
    }
}
