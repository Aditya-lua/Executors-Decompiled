package com.google.android.gms.internal.measurement;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.measurement.AbstractC2086gb;
import com.google.android.gms.internal.measurement.C2010cb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.gb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2086gb<MessageType extends AbstractC2086gb<MessageType, BuilderType>, BuilderType extends C2010cb<MessageType, BuilderType>> extends AbstractC2283r9<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C2197md zzc = C2197md.m10389a();

    /* JADX INFO: renamed from: A */
    public static InterfaceC2249pb m10052A() {
        return C2394xc.m10982b();
    }

    /* JADX INFO: renamed from: B */
    public static InterfaceC2249pb m10053B(InterfaceC2249pb interfaceC2249pb) {
        int size = interfaceC2249pb.size();
        return interfaceC2249pb.mo9891v(size + size);
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m10055D(AbstractC2086gb abstractC2086gb, boolean z10) {
        byte bByteValue = ((Byte) abstractC2086gb.mo9579E(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo10656a = C2376wc.m10951a().m10952b(abstractC2086gb.getClass()).mo10656a(abstractC2086gb);
        if (z10) {
            abstractC2086gb.mo9579E(2, true != zMo10656a ? null : abstractC2086gb, null);
        }
        return zMo10656a;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC2086gb m10056s(Class cls) {
        Map map = zzd;
        AbstractC2086gb abstractC2086gb = (AbstractC2086gb) map.get(cls);
        if (abstractC2086gb == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2086gb = (AbstractC2086gb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2086gb != null) {
            return abstractC2086gb;
        }
        AbstractC2086gb abstractC2086gb2 = (AbstractC2086gb) ((AbstractC2086gb) C2305sd.m10733h(cls)).mo9579E(6, null, null);
        if (abstractC2086gb2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC2086gb2);
        return abstractC2086gb2;
    }

    /* JADX INFO: renamed from: t */
    public static void m10057t(Class cls, AbstractC2086gb abstractC2086gb) {
        abstractC2086gb.m10070l();
        zzd.put(cls, abstractC2086gb);
    }

    /* JADX INFO: renamed from: v */
    public static Object m10058v(InterfaceC2232oc interfaceC2232oc, String str, Object[] objArr) {
        return new C2412yc(interfaceC2232oc, str, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static Object m10059w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC2213nb m10060x() {
        return C2105hb.m10188b();
    }

    /* JADX INFO: renamed from: y */
    public static InterfaceC2231ob m10061y() {
        return C2011cc.m9885b();
    }

    /* JADX INFO: renamed from: z */
    public static InterfaceC2231ob m10062z(InterfaceC2231ob interfaceC2231ob) {
        int size = interfaceC2231ob.size();
        return interfaceC2231ob.mo9891v(size + size);
    }

    /* JADX INFO: renamed from: E */
    public abstract Object mo9579E(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2232oc
    /* JADX INFO: renamed from: a */
    public final int mo10063a() {
        if (m10069k()) {
            int iM10068j = m10068j(null);
            if (iM10068j >= 0) {
                return iM10068j;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iM10068j).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iM10068j);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iM10068j2 = m10068j(null);
        if (iM10068j2 >= 0) {
            this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | iM10068j2;
            return iM10068j2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iM10068j2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iM10068j2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2232oc
    /* JADX INFO: renamed from: c */
    public final void mo10064c(AbstractC2194ma abstractC2194ma) {
        C2376wc.m10951a().m10952b(getClass()).mo10660e(this, C2212na.m10432M(abstractC2194ma));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2232oc
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2214nc mo10065e() {
        return (C2010cb) mo9579E(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2376wc.m10951a().m10952b(getClass()).mo10661f(this, (AbstractC2086gb) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2250pc
    /* JADX INFO: renamed from: f */
    public final boolean mo9875f() {
        return m10055D(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2283r9
    /* JADX INFO: renamed from: g */
    public final int mo10066g(InterfaceC2430zc interfaceC2430zc) {
        if (m10069k()) {
            int iZze = interfaceC2430zc.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZze2 = interfaceC2430zc.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | iZze2;
            return iZze2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZze2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2250pc
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2232oc mo10067h() {
        return (AbstractC2086gb) mo9579E(6, null, null);
    }

    public final int hashCode() {
        if (m10069k()) {
            return m10072n();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM10072n = m10072n();
        this.zza = iM10072n;
        return iM10072n;
    }

    /* JADX INFO: renamed from: j */
    public final int m10068j(InterfaceC2430zc interfaceC2430zc) {
        return C2376wc.m10951a().m10952b(getClass()).zze(this);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10069k() {
        return (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m10070l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2086gb m10071m() {
        return (AbstractC2086gb) mo9579E(4, null, null);
    }

    /* JADX INFO: renamed from: n */
    public final int m10072n() {
        return C2376wc.m10951a().m10952b(getClass()).zzc(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m10073o() {
        C2376wc.m10951a().m10952b(getClass()).mo10658c(this);
        m10070l();
    }

    /* JADX INFO: renamed from: p */
    public final C2010cb m10074p() {
        return (C2010cb) mo9579E(5, null, null);
    }

    /* JADX INFO: renamed from: q */
    public final C2010cb m10075q() {
        C2010cb c2010cb = (C2010cb) mo9579E(5, null, null);
        c2010cb.m9883v(this);
        return c2010cb;
    }

    /* JADX INFO: renamed from: r */
    public final void m10076r(int i10) {
        this.zzb = (this.zzb & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return C2268qc.m10580a(this, super.toString());
    }
}
