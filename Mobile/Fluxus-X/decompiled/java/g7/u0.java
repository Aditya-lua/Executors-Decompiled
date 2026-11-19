package g7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17543a = false;
    public final Set<b> b = new w1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, t7.i> f17544c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator<x2.c<String, Float>> f17545d = new a();

    public class a implements Comparator<x2.c<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(x2.c<String, Float> cVar, x2.c<String, Float> cVar2) {
            float fFloatValue = cVar.b.floatValue();
            float fFloatValue2 = cVar2.b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f17543a) {
            t7.i iVar = this.f17544c.get(str);
            if (iVar == null) {
                iVar = new t7.i();
                this.f17544c.put(str, iVar);
            }
            iVar.a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f10);
                }
            }
        }
    }

    public void b(boolean z10) {
        this.f17543a = z10;
    }
}
