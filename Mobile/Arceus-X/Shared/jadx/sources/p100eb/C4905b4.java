package p100eb;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: eb.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4905b4 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final int f19631a;

    /* JADX INFO: renamed from: b */
    public final C4962l1 f19632b;

    public C4905b4(C4962l1 c4962l1) throws C5018u3 {
        c4962l1.getClass();
        this.f19632b = c4962l1;
        AbstractC4909c2 abstractC4909c2Mo23575d = c4962l1.m23592c().mo23575d();
        int i10 = 0;
        while (abstractC4909c2Mo23575d.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC4909c2Mo23575d.next();
            int iMo23557a = ((AbstractC4923e4) entry.getKey()).mo23557a();
            i10 = i10 < iMo23557a ? iMo23557a : i10;
            int iMo23557a2 = ((AbstractC4923e4) entry.getValue()).mo23557a();
            if (i10 < iMo23557a2) {
                i10 = iMo23557a2;
            }
        }
        int i11 = i10 + 1;
        this.f19631a = i11;
        if (i11 > 8) {
            throw new C5018u3("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p100eb.AbstractC4923e4
    /* JADX INFO: renamed from: a */
    public final int mo23557a() {
        return this.f19631a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int iCompareTo;
        int size;
        int size2;
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (AbstractC4923e4.m23579c((byte) -96) != abstractC4923e4.zza()) {
            size2 = abstractC4923e4.zza();
            size = AbstractC4923e4.m23579c((byte) -96);
        } else {
            C4905b4 c4905b4 = (C4905b4) abstractC4923e4;
            if (this.f19632b.size() == c4905b4.f19632b.size()) {
                AbstractC4909c2 abstractC4909c2Mo23575d = this.f19632b.m23592c().mo23575d();
                AbstractC4909c2 abstractC4909c2Mo23575d2 = c4905b4.f19632b.m23592c().mo23575d();
                do {
                    if (!abstractC4909c2Mo23575d.hasNext() && !abstractC4909c2Mo23575d2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) abstractC4909c2Mo23575d.next();
                    Map.Entry entry2 = (Map.Entry) abstractC4909c2Mo23575d2.next();
                    int iCompareTo2 = ((AbstractC4923e4) entry.getKey()).compareTo((AbstractC4923e4) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((AbstractC4923e4) entry.getValue()).compareTo((AbstractC4923e4) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = this.f19632b.size();
            size2 = c4905b4.f19632b.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4905b4.class == obj.getClass()) {
            return this.f19632b.equals(((C4905b4) obj).f19632b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4923e4.m23579c((byte) -96)), this.f19632b});
    }

    /* JADX INFO: renamed from: q */
    public final C4962l1 m23558q() {
        return this.f19632b;
    }

    public final String toString() {
        if (this.f19632b.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC4909c2 abstractC4909c2Mo23575d = this.f19632b.m23592c().mo23575d();
        while (abstractC4909c2Mo23575d.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC4909c2Mo23575d.next();
            linkedHashMap.put(((AbstractC4923e4) entry.getKey()).toString().replace("\n", "\n  "), ((AbstractC4923e4) entry.getValue()).toString().replace("\n", "\n  "));
        }
        C4919e0 c4919e0M23567a = C4919e0.m23567a(",\n  ");
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            C4913d0.m23563a(sb2, linkedHashMap.entrySet().iterator(), c4919e0M23567a, " : ");
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c((byte) -96);
    }
}
