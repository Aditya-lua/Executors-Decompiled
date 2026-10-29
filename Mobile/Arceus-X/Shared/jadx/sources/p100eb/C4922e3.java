package p100eb;

import java.util.Comparator;

/* JADX INFO: renamed from: eb.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4922e3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC4970m3 abstractC4970m3 = (AbstractC4970m3) obj;
        AbstractC4970m3 abstractC4970m4 = (AbstractC4970m3) obj2;
        C4916d3 c4916d3 = new C4916d3(abstractC4970m3);
        C4916d3 c4916d4 = new C4916d3(abstractC4970m4);
        while (c4916d3.hasNext() && c4916d4.hasNext()) {
            int iCompareTo = Integer.valueOf(c4916d3.zza() & 255).compareTo(Integer.valueOf(c4916d4.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC4970m3.mo23600d()).compareTo(Integer.valueOf(abstractC4970m4.mo23600d()));
    }
}
