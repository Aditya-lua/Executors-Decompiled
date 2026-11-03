package hv;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    @TargetApi(24)
    @IgnoreJRERequirement
    public static final class a extends u {
        @Override // hv.u
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // hv.u
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    public static class b extends u {
        @Override // hv.u
        public String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // hv.u
        public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return l.a(method, cls, obj, objArr);
        }

        @Override // hv.u
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
