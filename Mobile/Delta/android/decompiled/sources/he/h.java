package he;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f19403a;
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f19404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f19406e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f19407a;
            public Object b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f19408c;

            public a() {
            }
        }

        public static boolean d(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof k) {
                return !((k) obj).c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public final a a() {
            a aVar = new a();
            this.f19404c.f19408c = aVar;
            this.f19404c = aVar;
            return aVar;
        }

        public final b b(Object obj) {
            a().b = obj;
            return this;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        public String toString() {
            String str;
            boolean z10 = this.f19405d;
            boolean z11 = this.f19406e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f19403a);
            sb2.append('{');
            String str2 = "";
            for (a aVar = this.b.f19408c; aVar != null; aVar = aVar.f19408c) {
                Object obj = aVar.b;
                if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = aVar.f19407a;
                        if (str != null) {
                            sb2.append(str);
                            sb2.append('=');
                        }
                        if (obj == null && obj.getClass().isArray()) {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        } else {
                            sb2.append(obj);
                        }
                        str2 = ", ";
                    }
                } else if (!z11 || !d(obj)) {
                    sb2.append(str2);
                    str = aVar.f19407a;
                    if (str != null) {
                        sb2.append(str);
                        sb2.append('=');
                    }
                    if (obj == null) {
                        sb2.append(obj);
                    } else {
                        sb2.append(obj);
                    }
                    str2 = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public b(String str) {
            a aVar = new a();
            this.b = aVar;
            this.f19404c = aVar;
            this.f19405d = false;
            this.f19406e = false;
            this.f19403a = (String) n.l(str);
        }
    }

    public static <T> T a(T t8, T t10) {
        if (t8 != null) {
            return t8;
        }
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
