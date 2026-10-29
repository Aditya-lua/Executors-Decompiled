package p169he;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: he.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6378h {

    /* JADX INFO: renamed from: he.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f24257a;

        /* JADX INFO: renamed from: b */
        public final a f24258b;

        /* JADX INFO: renamed from: c */
        public a f24259c;

        /* JADX INFO: renamed from: d */
        public boolean f24260d;

        /* JADX INFO: renamed from: e */
        public boolean f24261e;

        /* JADX INFO: renamed from: he.h$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public String f24262a;

            /* JADX INFO: renamed from: b */
            public Object f24263b;

            /* JADX INFO: renamed from: c */
            public a f24264c;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public a() {
            }
        }

        /* JADX INFO: renamed from: d */
        public static boolean m27905d(Object obj) {
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() == 0;
            }
            if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            }
            if (obj instanceof Map) {
                return ((Map) obj).isEmpty();
            }
            if (obj instanceof AbstractC6381k) {
                return !((AbstractC6381k) obj).mo27884c();
            }
            return obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* JADX INFO: renamed from: a */
        public final a m27906a() {
            a aVar = new a();
            this.f24259c.f24264c = aVar;
            this.f24259c = aVar;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        public final b m27907b(Object obj) {
            m27906a().f24263b = obj;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m27908c(Object obj) {
            return m27907b(obj);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0033  */
        /* JADX WARN: Code duplicated, block: B:18:0x0059  */
        public String toString() {
            String str;
            boolean z10 = this.f24260d;
            boolean z11 = this.f24261e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f24257a);
            sb2.append('{');
            String str2 = "";
            for (a aVar = this.f24258b.f24264c; aVar != null; aVar = aVar.f24264c) {
                Object obj = aVar.f24263b;
                if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = aVar.f24262a;
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
                } else if (!z11 || !m27905d(obj)) {
                    sb2.append(str2);
                    str = aVar.f24262a;
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(String str) {
            a aVar = new a();
            this.f24258b = aVar;
            this.f24259c = aVar;
            this.f24260d = false;
            this.f24261e = false;
            this.f24257a = (String) C6384n.m27928l(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m27903a(T t8, T t10) {
        if (t8 != null) {
            return t8;
        }
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* JADX INFO: renamed from: b */
    public static b m27904b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
