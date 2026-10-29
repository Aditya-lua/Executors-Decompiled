package p162h7;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p431s7.C11197m;

/* JADX INFO: renamed from: h7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C6295b {

    /* JADX INFO: renamed from: a */
    public final List<C6314u> f23897a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m27585a(C6314u c6314u) {
        this.f23897a.add(c6314u);
    }

    /* JADX INFO: renamed from: b */
    public void m27586b(Path path) {
        for (int size = this.f23897a.size() - 1; size >= 0; size--) {
            C11197m.m42213b(path, this.f23897a.get(size));
        }
    }
}
