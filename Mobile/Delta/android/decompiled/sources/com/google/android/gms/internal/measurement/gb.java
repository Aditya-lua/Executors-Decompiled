package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.cb;
import com.google.android.gms.internal.measurement.gb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb<MessageType extends gb<MessageType, BuilderType>, BuilderType extends cb<MessageType, BuilderType>> extends r9<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected md zzc = md.a();

    public static pb A() {
        return xc.b();
    }

    public static pb B(pb pbVar) {
        int size = pbVar.size();
        return pbVar.v(size + size);
    }

    public static final boolean D(gb gbVar, boolean z10) {
        byte bByteValue = ((Byte) gbVar.E(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = wc.a().b(gbVar.getClass()).a(gbVar);
        if (z10) {
            gbVar.E(2, true != zA ? null : gbVar, null);
        }
        return zA;
    }

    public static gb t(Class cls) {
        Map map = zzd;
        gb gbVar = (gb) map.get(cls);
        if (gbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gbVar = (gb) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (gbVar != null) {
            return gbVar;
        }
        gb gbVar2 = (gb) ((gb) sd.h(cls)).E(6, null, null);
        if (gbVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, gbVar2);
        return gbVar2;
    }

    public static void u(Class cls, gb gbVar) {
        gbVar.l();
        zzd.put(cls, gbVar);
    }

    public static Object v(oc ocVar, String str, Object[] objArr) {
        return new yc(ocVar, str, objArr);
    }

    public static Object w(Method method, Object obj, Object... objArr) {
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

    public static nb x() {
        return hb.b();
    }

    public static ob y() {
        return cc.b();
    }

    public static ob z(ob obVar) {
        int size = obVar.size();
        return obVar.v(size + size);
    }

    public abstract Object E(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.oc
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

    @Override // com.google.android.gms.internal.measurement.oc
    public final void c(ma maVar) {
        wc.a().b(getClass()).e(this, na.M(maVar));
    }

    @Override // com.google.android.gms.internal.measurement.oc
    public final /* synthetic */ nc e() {
        return (cb) E(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return wc.a().b(getClass()).f(this, (gb) obj);
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final boolean f() {
        return D(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.r9
    public final int g(zc zcVar) {
        if (k()) {
            int iZze = zcVar.zze(this);
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
        int iZze2 = zcVar.zze(this);
        if (iZze2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
            return iZze2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZze2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final /* synthetic */ oc h() {
        return (gb) E(6, null, null);
    }

    public final int hashCode() {
        if (k()) {
            return o();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iO = o();
        this.zza = iO;
        return iO;
    }

    public final int j(zc zcVar) {
        return wc.a().b(getClass()).zze(this);
    }

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final gb n() {
        return (gb) E(4, null, null);
    }

    public final int o() {
        return wc.a().b(getClass()).zzc(this);
    }

    public final void p() {
        wc.a().b(getClass()).c(this);
        l();
    }

    public final cb q() {
        return (cb) E(5, null, null);
    }

    public final cb r() {
        cb cbVar = (cb) E(5, null, null);
        cbVar.v(this);
        return cbVar;
    }

    public final void s(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return qc.a(this, super.toString());
    }
}
