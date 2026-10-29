package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    public static final class a implements n0.k1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<n0.m1> f17445a;

        public a(List<n0.m1> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f17445a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // n0.k1
        public List<n0.m1> a() {
            return this.f17445a;
        }
    }

    public static n0.k1 a(n0.m1... m1VarArr) {
        return new a(Arrays.asList(m1VarArr));
    }

    public static n0.k1 b() {
        return a(new n0.m1.a());
    }
}
