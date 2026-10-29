package com.google.android.gms.internal.play_billing;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.play_billing.AbstractC2652t4;
import com.google.android.gms.internal.play_billing.C2608p4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2652t4<MessageType extends AbstractC2652t4<MessageType, BuilderType>, BuilderType extends C2608p4<MessageType, BuilderType>> extends AbstractC2464c3<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2665u6 zzc = C2665u6.m11776c();

    /* JADX INFO: renamed from: i */
    public static void m11738i(Class cls, AbstractC2652t4 abstractC2652t4) {
        abstractC2652t4.m11751h();
        zzb.put(cls, abstractC2652t4);
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2652t4 m11740n(AbstractC2652t4 abstractC2652t4, byte[] bArr, int i10, int i11, C2498f4 c2498f4) throws C2499f5 {
        if (i11 == 0) {
            return abstractC2652t4;
        }
        AbstractC2652t4 abstractC2652t4M11758u = abstractC2652t4.m11758u();
        try {
            InterfaceC2522h6 interfaceC2522h6M11378b = C2489e6.m11377a().m11378b(abstractC2652t4M11758u.getClass());
            interfaceC2522h6M11378b.mo11218f(abstractC2652t4M11758u, bArr, 0, i11, new C2497f3(c2498f4));
            interfaceC2522h6M11378b.mo11214b(abstractC2652t4M11758u);
            return abstractC2652t4M11758u;
        } catch (C2499f5 e10) {
            throw e10;
        } catch (C2643s6 e11) {
            throw e11.m11723a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2499f5) {
                throw ((C2499f5) e12.getCause());
            }
            throw new C2499f5(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m11741o(AbstractC2652t4 abstractC2652t4, boolean z10) {
        byte bByteValue = ((Byte) abstractC2652t4.mo11269p(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo11213a = C2489e6.m11377a().m11378b(abstractC2652t4.getClass()).mo11213a(abstractC2652t4);
        if (z10) {
            abstractC2652t4.mo11269p(2, true != zMo11213a ? null : abstractC2652t4, null);
        }
        return zMo11213a;
    }

    /* JADX INFO: renamed from: t */
    public static AbstractC2652t4 m11742t(Class cls) {
        Map map = zzb;
        AbstractC2652t4 abstractC2652t4 = (AbstractC2652t4) map.get(cls);
        if (abstractC2652t4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2652t4 = (AbstractC2652t4) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2652t4 != null) {
            return abstractC2652t4;
        }
        AbstractC2652t4 abstractC2652t5 = (AbstractC2652t4) ((AbstractC2652t4) C2446a7.m11245i(cls)).mo11269p(6, null, null);
        if (abstractC2652t5 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC2652t5);
        return abstractC2652t5;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC2652t4 m11743v(AbstractC2652t4 abstractC2652t4, byte[] bArr) throws C2499f5 {
        int length = bArr.length;
        C2498f4 c2498f4 = C2498f4.f8968b;
        int i10 = C2486e3.f8956a;
        AbstractC2652t4 abstractC2652t4M11740n = m11740n(abstractC2652t4, bArr, 0, length, C2498f4.f8968b);
        if (abstractC2652t4M11740n == null || m11741o(abstractC2652t4M11740n, true)) {
            return abstractC2652t4M11740n;
        }
        throw new C2643s6(abstractC2652t4M11740n).m11723a();
    }

    /* JADX INFO: renamed from: w */
    public static InterfaceC2696x4 m11744w() {
        return C2663u4.m11768d();
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC2707y4 m11745x() {
        return C2500f6.m11403c();
    }

    /* JADX INFO: renamed from: y */
    public static Object m11746y(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: z */
    public static Object m11747z(InterfaceC2697x5 interfaceC2697x5, String str, Object[] objArr) {
        return new C2511g6(interfaceC2697x5, str, objArr);
    }

    /* JADX INFO: renamed from: A */
    public final void m11748A() {
        C2489e6.m11377a().m11378b(getClass()).mo11214b(this);
        m11751h();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2697x5
    /* JADX INFO: renamed from: a */
    public final void mo11749a(AbstractC2443a4 abstractC2443a4) {
        C2489e6.m11377a().m11378b(getClass()).mo11217e(this, C2454b4.m11276M(abstractC2443a4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2464c3
    /* JADX INFO: renamed from: c */
    public final int mo11332c(InterfaceC2522h6 interfaceC2522h6) {
        if (m11753l()) {
            int iZza = interfaceC2522h6.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = interfaceC2522h6.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2489e6.m11377a().m11378b(getClass()).mo11216d(this, (AbstractC2652t4) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2708y5
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2697x5 mo11750f() {
        return (AbstractC2652t4) mo11269p(6, null, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m11751h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m11753l()) {
            return m11755q();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM11755q = m11755q();
        this.zza = iM11755q;
        return iM11755q;
    }

    /* JADX INFO: renamed from: j */
    public final void m11752j(int i10) {
        this.zzd = (this.zzd & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m11753l() {
        return (this.zzd & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final int m11754m(InterfaceC2522h6 interfaceC2522h6) {
        return C2489e6.m11377a().m11378b(getClass()).zza(this);
    }

    /* JADX INFO: renamed from: p */
    public abstract Object mo11269p(int i10, Object obj, Object obj2);

    /* JADX INFO: renamed from: q */
    public final int m11755q() {
        return C2489e6.m11377a().m11378b(getClass()).zzb(this);
    }

    /* JADX INFO: renamed from: r */
    public final C2608p4 m11756r() {
        return (C2608p4) mo11269p(5, null, null);
    }

    /* JADX INFO: renamed from: s */
    public final C2608p4 m11757s() {
        C2608p4 c2608p4 = (C2608p4) mo11269p(5, null, null);
        c2608p4.m11644h(this);
        return c2608p4;
    }

    public final String toString() {
        return C2719z5.m11859a(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC2652t4 m11758u() {
        return (AbstractC2652t4) mo11269p(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2697x5
    public final int zzn() {
        if (m11753l()) {
            int iM11754m = m11754m(null);
            if (iM11754m >= 0) {
                return iM11754m;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iM11754m);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iM11754m2 = m11754m(null);
        if (iM11754m2 >= 0) {
            this.zzd = (this.zzd & EditorInfoCompat.IME_FLAG_FORCE_ASCII) | iM11754m2;
            return iM11754m2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM11754m2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2708y5
    public final boolean zzo() {
        return m11741o(this, true);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2697x5
    public final /* synthetic */ InterfaceC2686w5 zzw() {
        return (C2608p4) mo11269p(5, null, null);
    }
}
