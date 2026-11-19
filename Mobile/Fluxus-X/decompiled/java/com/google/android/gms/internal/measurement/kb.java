package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.kb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class kb<MessageType extends kb<MessageType, BuilderType>, BuilderType extends gb<MessageType, BuilderType>> extends v9<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected qd zzc = qd.a();

    public static tb B(tb tbVar) {
        int size = tbVar.size();
        return tbVar.y(size + size);
    }

    public static final boolean D(kb kbVar, boolean z10) {
        byte bByteValue = ((Byte) kbVar.E(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = ad.a().b(kbVar.getClass()).a(kbVar);
        if (z10) {
            kbVar.E(2, true != zA ? null : kbVar, null);
        }
        return zA;
    }

    public static kb s(Class cls) {
        Map map = zzd;
        kb kbVar = (kb) map.get(cls);
        if (kbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                kbVar = (kb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (kbVar != null) {
            return kbVar;
        }
        kb kbVar2 = (kb) ((kb) wd.h(cls)).E(6, null, null);
        if (kbVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, kbVar2);
        return kbVar2;
    }

    public static void t(Class cls, kb kbVar) {
        kbVar.l();
        zzd.put(cls, kbVar);
    }

    public static Object u(sc scVar, String str, Object[] objArr) {
        return new cd(scVar, str, objArr);
    }

    public static Object v(Method method, Object obj, Object... objArr) {
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

    public static rb w() {
        return lb.b();
    }

    public static sb x() {
        return gc.b();
    }

    public static sb y(sb sbVar) {
        int size = sbVar.size();
        return sbVar.y(size + size);
    }

    public static tb z() {
        return bd.b();
    }

    public abstract Object E(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.sc
    public final int a() {
        if (k()) {
            int iJ = j(null);
            if (iJ >= 0) {
                return iJ;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iJ).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iJ);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iJ2 = j(null);
        if (iJ2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iJ2;
            return iJ2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iJ2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iJ2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final void c(qa qaVar) {
        ad.a().b(getClass()).e(this, ra.M(qaVar));
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final /* synthetic */ rc e() {
        return (gb) E(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ad.a().b(getClass()).f(this, (kb) obj);
    }

    @Override // com.google.android.gms.internal.measurement.tc
    public final boolean f() {
        return D(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.v9
    public final int g(dd ddVar) {
        if (k()) {
            int iZze = ddVar.zze(this);
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
        int iZze2 = ddVar.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
            return iZze2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZze2);
        throw new IllegalStateException(sb3.toString());
    }

    public final int hashCode() {
        if (k()) {
            return n();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iN = n();
        this.zza = iN;
        return iN;
    }

    @Override // com.google.android.gms.internal.measurement.tc
    public final /* synthetic */ sc i() {
        return (kb) E(6, null, null);
    }

    public final int j(dd ddVar) {
        return ad.a().b(getClass()).zze(this);
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final kb m() {
        return (kb) E(4, null, null);
    }

    public final int n() {
        return ad.a().b(getClass()).zzc(this);
    }

    public final void o() {
        ad.a().b(getClass()).c(this);
        l();
    }

    public final gb p() {
        return (gb) E(5, null, null);
    }

    public final gb q() {
        gb gbVar = (gb) E(5, null, null);
        gbVar.x(this);
        return gbVar;
    }

    public final void r(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return uc.a(this, super.toString());
    }
}
