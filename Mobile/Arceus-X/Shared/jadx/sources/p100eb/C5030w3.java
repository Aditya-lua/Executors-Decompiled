package p100eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.w3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5030w3 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final boolean f19836a;

    public C5030w3(boolean z10) {
        this.f19836a = z10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (AbstractC4923e4.m23579c((byte) -32) != abstractC4923e4.zza()) {
            return AbstractC4923e4.m23579c((byte) -32) - abstractC4923e4.zza();
        }
        return (true != this.f19836a ? 20 : 21) - (true != ((C5030w3) abstractC4923e4).f19836a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5030w3.class == obj.getClass() && this.f19836a == ((C5030w3) obj).f19836a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4923e4.m23579c((byte) -32)), Boolean.valueOf(this.f19836a)});
    }

    public final String toString() {
        return Boolean.toString(this.f19836a);
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c((byte) -32);
    }
}
