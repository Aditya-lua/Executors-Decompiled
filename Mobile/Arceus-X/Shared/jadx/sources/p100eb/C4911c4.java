package p100eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.c4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4911c4 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final String f19635a;

    public C4911c4(String str) {
        this.f19635a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int length;
        int length2;
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (AbstractC4923e4.m23579c((byte) 96) != abstractC4923e4.zza()) {
            length = abstractC4923e4.zza();
            length2 = AbstractC4923e4.m23579c((byte) 96);
        } else {
            String str = this.f19635a;
            String str2 = ((C4911c4) abstractC4923e4).f19635a;
            if (str.length() == str2.length()) {
                return str.compareTo(str2);
            }
            length = str2.length();
            length2 = str.length();
        }
        return length2 - length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4911c4.class == obj.getClass()) {
            return this.f19635a.equals(((C4911c4) obj).f19635a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4923e4.m23579c((byte) 96)), this.f19635a});
    }

    public final String toString() {
        return "\"" + this.f19635a + "\"";
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c((byte) 96);
    }
}
