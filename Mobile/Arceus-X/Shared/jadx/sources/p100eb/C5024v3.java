package p100eb;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: eb.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5024v3 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4920e1 f19833a;

    /* JADX INFO: renamed from: b */
    public final int f19834b;

    public C5024v3(AbstractC4920e1 abstractC4920e1) throws C5018u3 {
        abstractC4920e1.getClass();
        this.f19833a = abstractC4920e1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            AbstractC4920e1 abstractC4920e2 = this.f19833a;
            if (i10 >= abstractC4920e2.size()) {
                break;
            }
            int iMo23557a = ((AbstractC4923e4) abstractC4920e2.get(i10)).mo23557a();
            if (i11 < iMo23557a) {
                i11 = iMo23557a;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f19834b = i12;
        if (i12 > 8) {
            throw new C5018u3("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p100eb.AbstractC4923e4
    /* JADX INFO: renamed from: a */
    public final int mo23557a() {
        return this.f19834b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (AbstractC4923e4.m23579c((byte) -128) != abstractC4923e4.zza()) {
            return AbstractC4923e4.m23579c((byte) -128) - abstractC4923e4.zza();
        }
        C5024v3 c5024v3 = (C5024v3) abstractC4923e4;
        AbstractC4920e1 abstractC4920e1 = this.f19833a;
        int size = abstractC4920e1.size();
        AbstractC4920e1 abstractC4920e2 = c5024v3.f19833a;
        if (size != abstractC4920e2.size()) {
            return abstractC4920e1.size() - abstractC4920e2.size();
        }
        int i10 = 0;
        while (true) {
            AbstractC4920e1 abstractC4920e3 = this.f19833a;
            if (i10 >= abstractC4920e3.size()) {
                return 0;
            }
            int iCompareTo = ((AbstractC4923e4) abstractC4920e3.get(i10)).compareTo((AbstractC4923e4) c5024v3.f19833a.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5024v3.class == obj.getClass()) {
            return this.f19833a.equals(((C5024v3) obj).f19833a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4923e4.m23579c((byte) -128)), this.f19833a});
    }

    public final String toString() {
        if (this.f19833a.isEmpty()) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC4920e1 abstractC4920e1 = this.f19833a;
        int size = abstractC4920e1.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((AbstractC4923e4) abstractC4920e1.get(i10)).toString().replace("\n", "\n  "));
        }
        C4919e0 c4919e0M23567a = C4919e0.m23567a(",\n  ");
        StringBuilder sb2 = new StringBuilder("[\n  ");
        c4919e0M23567a.m23570c(sb2, arrayList.iterator());
        sb2.append("\n]");
        return sb2.toString();
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c((byte) -128);
    }
}
