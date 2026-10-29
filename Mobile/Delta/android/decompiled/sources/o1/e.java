package o1;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import n0.a2;
import n0.k3;
import n0.z1;

/* JADX INFO: loaded from: classes.dex */
public class e implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f26991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3 f26992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, a2> f26993e = new HashMap();

    public e(z1 z1Var, k3 k3Var) {
        this.f26991c = z1Var;
        this.f26992d = k3Var;
    }

    public static a2.c d(a2.c cVar, Size size) {
        return a2.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private a2 f(int i10) {
        a2 a2VarC;
        if (this.f26993e.containsKey(Integer.valueOf(i10))) {
            return this.f26993e.get(Integer.valueOf(i10));
        }
        if (this.f26991c.a(i10)) {
            a2 a2VarB = this.f26991c.b(i10);
            Objects.requireNonNull(a2VarB);
            a2VarC = a2VarB;
            Size sizeE = e(i10);
            if (sizeE != null) {
                a2VarC = c(a2VarC, sizeE);
            }
        } else {
            a2VarC = null;
        }
        this.f26993e.put(Integer.valueOf(i10), a2VarC);
        return a2VarC;
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f26991c.a(i10) && f(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return f(i10);
    }

    public final a2 c(a2 a2Var, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<a2.c> it = a2Var.b().iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a2.b.h(a2Var.a(), a2Var.e(), a2Var.f(), arrayList);
    }

    public final Size e(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f26992d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.g(i10);
            }
        }
        return null;
    }
}
