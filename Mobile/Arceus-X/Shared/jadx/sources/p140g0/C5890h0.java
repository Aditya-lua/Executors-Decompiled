package p140g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p296n0.InterfaceC8780k1;
import p296n0.InterfaceC8790m1;

/* JADX INFO: renamed from: g0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5890h0 {

    /* JADX INFO: renamed from: g0.h0$a */
    public static final class a implements InterfaceC8780k1 {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC8790m1> f22518a;

        public a(List<InterfaceC8790m1> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f22518a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // p296n0.InterfaceC8780k1
        /* JADX INFO: renamed from: a */
        public List<InterfaceC8790m1> mo26488a() {
            return this.f22518a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8780k1 m26486a(InterfaceC8790m1... interfaceC8790m1Arr) {
        return new a(Arrays.asList(interfaceC8790m1Arr));
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC8780k1 m26487b() {
        return m26486a(new InterfaceC8790m1.a());
    }
}
