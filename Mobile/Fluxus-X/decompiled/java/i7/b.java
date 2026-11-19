package i7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f19151a = new ArrayList();

    public void a(u uVar) {
        this.f19151a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f19151a.size() - 1; size >= 0; size--) {
            t7.m.b(path, this.f19151a.get(size));
        }
    }
}
