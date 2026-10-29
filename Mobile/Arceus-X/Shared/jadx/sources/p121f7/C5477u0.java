package p121f7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p431s7.C11193i;
import p504w1.C12278b;
import p533x2.C12633c;

/* JADX INFO: renamed from: f7.u0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5477u0 {

    /* JADX INFO: renamed from: a */
    public boolean f21214a = false;

    /* JADX INFO: renamed from: b */
    public final Set<b> f21215b = new C12278b();

    /* JADX INFO: renamed from: c */
    public final Map<String, C11193i> f21216c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Comparator<C12633c<String, Float>> f21217d = new a();

    /* JADX INFO: renamed from: f7.u0$a */
    public class a implements Comparator<C12633c<String, Float>> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C12633c<String, Float> c12633c, C12633c<String, Float> c12633c2) {
            float fFloatValue = c12633c.f44956b.floatValue();
            float fFloatValue2 = c12633c2.f44956b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: f7.u0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m25125a(float f10);
    }

    /* JADX INFO: renamed from: a */
    public void m25122a(String str, float f10) {
        if (this.f21214a) {
            C11193i c11193i = this.f21216c.get(str);
            if (c11193i == null) {
                c11193i = new C11193i();
                this.f21216c.put(str, c11193i);
            }
            c11193i.m42182a(f10);
            if (str.equals("__container")) {
                Iterator<b> it = this.f21215b.iterator();
                while (it.hasNext()) {
                    it.next().m25125a(f10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25123b(boolean z10) {
        this.f21214a = z10;
    }
}
