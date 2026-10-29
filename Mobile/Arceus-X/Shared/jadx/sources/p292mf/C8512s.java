package p292mf;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: mf.s */
/* JADX INFO: loaded from: classes2.dex */
public class C8512s extends C8513t {

    /* JADX INFO: renamed from: a */
    public final List<C8492c<?>> f31262a;

    public C8512s(List<C8492c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f31262a = list;
    }
}
