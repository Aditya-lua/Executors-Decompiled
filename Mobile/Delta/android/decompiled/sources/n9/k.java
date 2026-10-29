package n9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f25284a;
        public final Object b;

        public /* synthetic */ a(Object obj, byte[] bArr) {
            m.l(obj);
            this.b = obj;
            this.f25284a = new ArrayList();
        }

        @NonNull
        public a a(@NonNull String str, Object obj) {
            m.l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.f25284a.add(sb2.toString());
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f25284a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) list.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            if (!b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int c(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    public static a d(@NonNull Object obj) {
        return new a(obj, null);
    }
}
