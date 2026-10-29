package p305n9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: n9.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8947k {

    /* JADX INFO: renamed from: n9.k$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List f32617a;

        /* JADX INFO: renamed from: b */
        public final Object f32618b;

        public /* synthetic */ a(Object obj, byte[] bArr) {
            C8953m.m36047l(obj);
            this.f32618b = obj;
            this.f32617a = new ArrayList();
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public a m36029a(@NonNull String str, Object obj) {
            C8953m.m36047l(str);
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(length + 1 + strValueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(strValueOf);
            this.f32617a.add(sb2.toString());
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f32618b.getClass().getSimpleName());
            sb2.append('{');
            List list = this.f32617a;
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

    /* JADX INFO: renamed from: a */
    public static boolean m36025a(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
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
            if (!m36026b(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m36026b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m36027c(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static a m36028d(@NonNull Object obj) {
        return new a(obj, null);
    }
}
