package p100eb;

import java.util.Arrays;

/* JADX INFO: renamed from: eb.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C5036x3 extends AbstractC4923e4 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4970m3 f19839a;

    public C5036x3(AbstractC4970m3 abstractC4970m3) {
        this.f19839a = abstractC4970m3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC4923e4 abstractC4923e4 = (AbstractC4923e4) obj;
        if (AbstractC4923e4.m23579c((byte) 64) != abstractC4923e4.zza()) {
            return AbstractC4923e4.m23579c((byte) 64) - abstractC4923e4.zza();
        }
        C5036x3 c5036x3 = (C5036x3) abstractC4923e4;
        AbstractC4970m3 abstractC4970m3 = this.f19839a;
        int iMo23600d = abstractC4970m3.mo23600d();
        AbstractC4970m3 abstractC4970m4 = c5036x3.f19839a;
        if (iMo23600d != abstractC4970m4.mo23600d()) {
            return abstractC4970m3.mo23600d() - abstractC4970m4.mo23600d();
        }
        return C4904b3.m23556a().compare(abstractC4970m3.m23675p(), c5036x3.f19839a.m23675p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5036x3.class == obj.getClass()) {
            return this.f19839a.equals(((C5036x3) obj).f19839a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC4923e4.m23579c((byte) 64)), this.f19839a});
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC4970m3 m23718q() {
        return this.f19839a;
    }

    public final String toString() {
        AbstractC5017u2 abstractC5017u2Mo23702c = AbstractC5017u2.m23707d().mo23702c();
        byte[] bArrM23675p = this.f19839a.m23675p();
        return "h'" + abstractC5017u2Mo23702c.m23708e(bArrM23675p, 0, bArrM23675p.length) + "'";
    }

    @Override // p100eb.AbstractC4923e4
    public final int zza() {
        return AbstractC4923e4.m23579c((byte) 64);
    }
}
