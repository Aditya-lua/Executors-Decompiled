package n0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f24975a = new a();
    public static final List<Integer> b = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    public class a implements z1 {
        @Override // n0.z1
        public boolean a(int i10) {
            return false;
        }

        @Override // n0.z1
        public a2 b(int i10) {
            return null;
        }
    }

    boolean a(int i10);

    a2 b(int i10);
}
