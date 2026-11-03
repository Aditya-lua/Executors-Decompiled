package h7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f19081a = new ArrayList();

    public void a(u uVar) {
        this.f19081a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f19081a.size() - 1; size >= 0; size--) {
            s7.m.b(path, this.f19081a.get(size));
        }
    }
}
