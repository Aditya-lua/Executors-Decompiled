package mf;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c<?>> f24752a;

    public s(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f24752a = list;
    }
}
