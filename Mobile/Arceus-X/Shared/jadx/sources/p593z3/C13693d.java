package p593z3;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z3.d */
/* JADX INFO: loaded from: classes.dex */
public class C13693d {

    /* JADX INFO: renamed from: z3.d$a */
    public static class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m50016a() {
            return b.m50017a();
        }
    }

    /* JADX INFO: renamed from: z3.d$b */
    public static class b {
        @NonNull
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static Set<int[]> m50017a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Set<int[]> m50015a() {
        return Build.VERSION.SDK_INT >= 34 ? a.m50016a() : b.m50017a();
    }
}
