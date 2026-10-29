package p231jv;

import android.annotation.TargetApi;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: jv.u */
/* JADX INFO: loaded from: classes2.dex */
public class C7393u {

    /* JADX INFO: renamed from: jv.u$a */
    @TargetApi(24)
    @IgnoreJRERequirement
    public static final class a extends C7393u {
        @Override // p231jv.C7393u
        /* JADX INFO: renamed from: b */
        public Object mo30622b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return C7384l.m30585a(method, cls, obj, objArr);
        }

        @Override // p231jv.C7393u
        /* JADX INFO: renamed from: c */
        public boolean mo30623c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: renamed from: jv.u$b */
    @IgnoreJRERequirement
    public static class b extends C7393u {
        @Override // p231jv.C7393u
        /* JADX INFO: renamed from: a */
        public String mo30621a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.mo30621a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // p231jv.C7393u
        /* JADX INFO: renamed from: b */
        public Object mo30622b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return C7384l.m30585a(method, cls, obj, objArr);
        }

        @Override // p231jv.C7393u
        /* JADX INFO: renamed from: c */
        public boolean mo30623c(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: renamed from: a */
    public String mo30621a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* JADX INFO: renamed from: b */
    public Object mo30622b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: c */
    public boolean mo30623c(Method method) {
        return false;
    }
}
