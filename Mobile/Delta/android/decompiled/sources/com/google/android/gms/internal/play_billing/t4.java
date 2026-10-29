package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.p4;
import com.google.android.gms.internal.play_billing.t4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t4<MessageType extends t4<MessageType, BuilderType>, BuilderType extends p4<MessageType, BuilderType>> extends c3<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected u6 zzc = u6.c();

    public static void i(Class cls, t4 t4Var) {
        t4Var.h();
        zzb.put(cls, t4Var);
    }

    public static t4 n(t4 t4Var, byte[] bArr, int i10, int i11, f4 f4Var) throws f5 {
        if (i11 == 0) {
            return t4Var;
        }
        t4 t4VarU = t4Var.u();
        try {
            h6 h6VarB = e6.a().b(t4VarU.getClass());
            h6VarB.f(t4VarU, bArr, 0, i11, new f3(f4Var));
            h6VarB.b(t4VarU);
            return t4VarU;
        } catch (f5 e10) {
            throw e10;
        } catch (s6 e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof f5) {
                throw ((f5) e12.getCause());
            }
            throw new f5(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static final boolean o(t4 t4Var, boolean z10) {
        byte bByteValue = ((Byte) t4Var.p(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = e6.a().b(t4Var.getClass()).a(t4Var);
        if (z10) {
            t4Var.p(2, true != zA ? null : t4Var, null);
        }
        return zA;
    }

    public static t4 t(Class cls) {
        Map map = zzb;
        t4 t4Var = (t4) map.get(cls);
        if (t4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t4Var = (t4) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t4Var != null) {
            return t4Var;
        }
        t4 t4Var2 = (t4) ((t4) a7.i(cls)).p(6, null, null);
        if (t4Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, t4Var2);
        return t4Var2;
    }

    public static t4 v(t4 t4Var, byte[] bArr) throws f5 {
        int length = bArr.length;
        f4 f4Var = f4.b;
        int i10 = e3.f7032a;
        t4 t4VarN = n(t4Var, bArr, 0, length, f4.b);
        if (t4VarN == null || o(t4VarN, true)) {
            return t4VarN;
        }
        throw new s6(t4VarN).a();
    }

    public static x4 w() {
        return u4.d();
    }

    public static y4 x() {
        return f6.c();
    }

    public static Object y(Method method, Object obj, Object... objArr) {
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

    public static Object z(x5 x5Var, String str, Object[] objArr) {
        return new g6(x5Var, str, objArr);
    }

    public final void A() {
        e6.a().b(getClass()).b(this);
        h();
    }

    @Override // com.google.android.gms.internal.play_billing.x5
    public final void a(a4 a4Var) {
        e6.a().b(getClass()).e(this, b4.M(a4Var));
    }

    @Override // com.google.android.gms.internal.play_billing.c3
    public final int c(h6 h6Var) {
        if (l()) {
            int iZza = h6Var.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = h6Var.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
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
        return e6.a().b(getClass()).d(this, (t4) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.y5
    public final /* synthetic */ x5 f() {
        return (t4) p(6, null, null);
    }

    public final void h() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (l()) {
            return q();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iQ = q();
        this.zza = iQ;
        return iQ;
    }

    public final void j(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean l() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int m(h6 h6Var) {
        return e6.a().b(getClass()).zza(this);
    }

    public abstract Object p(int i10, Object obj, Object obj2);

    public final int q() {
        return e6.a().b(getClass()).zzb(this);
    }

    public final p4 r() {
        return (p4) p(5, null, null);
    }

    public final p4 s() {
        p4 p4Var = (p4) p(5, null, null);
        p4Var.h(this);
        return p4Var;
    }

    public final String toString() {
        return z5.a(this, super.toString());
    }

    public final t4 u() {
        return (t4) p(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.x5
    public final int zzn() {
        if (l()) {
            int iM = m(null);
            if (iM >= 0) {
                return iM;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iM);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iM2 = m(null);
        if (iM2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iM2;
            return iM2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM2);
    }

    @Override // com.google.android.gms.internal.play_billing.y5
    public final boolean zzo() {
        return o(this, true);
    }

    @Override // com.google.android.gms.internal.play_billing.x5
    public final /* synthetic */ w5 zzw() {
        return (p4) p(5, null, null);
    }
}
