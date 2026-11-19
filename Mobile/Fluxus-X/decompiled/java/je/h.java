package je;

import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20718a;
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f20719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f20720d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f20721e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f20722a;
            public Object b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f20723c;

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
            this.f20719c.f20723c = aVar;
            this.f20719c = aVar;
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
            boolean z10 = this.f20720d;
            boolean z11 = this.f20721e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f20718a);
            sb2.append('{');
            String str2 = BuildConfig.FLAVOR;
            for (a aVar = this.b.f20723c; aVar != null; aVar = aVar.f20723c) {
                Object obj = aVar.b;
                if (obj == null) {
                    if (!z10) {
                        sb2.append(str2);
                        str = aVar.f20722a;
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
                    str = aVar.f20722a;
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
            this.f20719c = aVar;
            this.f20720d = false;
            this.f20721e = false;
            this.f20718a = (String) n.l(str);
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
