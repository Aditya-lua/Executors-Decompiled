package of;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c<?>> f28115a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f28115a = list;
    }
}
