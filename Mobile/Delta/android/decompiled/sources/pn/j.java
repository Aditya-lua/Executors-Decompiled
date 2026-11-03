package pn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on.y;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f28795a = new ArrayList();

    public static j b() {
        return new j();
    }

    public static j g(List<i> list) {
        j jVar = new j();
        jVar.f28795a.addAll(list);
        return jVar;
    }

    public static j h(i iVar) {
        j jVar = new j();
        jVar.a(iVar);
        return jVar;
    }

    public void a(i iVar) {
        this.f28795a.add(iVar);
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f28795a.size(); i10++) {
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(this.f28795a.get(i10).a());
        }
        return sb2.toString();
    }

    public List<i> d() {
        return this.f28795a;
    }

    public List<y> e() {
        ArrayList arrayList = new ArrayList();
        Iterator<i> it = this.f28795a.iterator();
        while (it.hasNext()) {
            y yVarB = it.next().b();
            if (yVarB != null) {
                arrayList.add(yVarB);
            }
        }
        return arrayList;
    }

    public boolean f() {
        return this.f28795a.isEmpty();
    }
}
