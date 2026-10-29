package be;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: be.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1363t0 extends RuntimeException {
    public C1363t0(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    /* JADX INFO: renamed from: c */
    public static Object m7219c(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new C1363t0(e11);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getCause()Ljava/lang/Throwable; */
    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    /* JADX INFO: renamed from: b */
    public final Exception m7221b(Class cls) {
        int iIndexOf;
        String string;
        Class[] clsArr = {cls};
        int i10 = 0;
        for (int i11 = 0; i11 <= 0; i11++) {
            Class cls2 = clsArr[i11];
            if (RuntimeException.class.isAssignableFrom(cls2)) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i12 = 0; i12 < 2; i12++) {
                    Object obj = objArr[i12];
                    if (obj == null) {
                        string = "null";
                    } else {
                        try {
                            string = obj.toString();
                        } catch (Exception e10) {
                            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str), (Throwable) e10);
                            string = "<" + str + " threw " + e10.getClass().getName() + ">";
                        }
                    }
                    objArr[i12] = string;
                }
                StringBuilder sb2 = new StringBuilder(118);
                int i13 = 0;
                while (i10 < 2 && (iIndexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i13)) != -1) {
                    sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i13, iIndexOf);
                    sb2.append(objArr[i10]);
                    i13 = iIndexOf + 2;
                    i10++;
                }
                sb2.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i13, 86);
                if (i10 < 2) {
                    sb2.append(" [");
                    sb2.append(objArr[i10]);
                    for (int i14 = i10 + 1; i14 < 2; i14++) {
                        sb2.append(", ");
                        sb2.append(objArr[i14]);
                    }
                    sb2.append(']');
                }
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }
}
