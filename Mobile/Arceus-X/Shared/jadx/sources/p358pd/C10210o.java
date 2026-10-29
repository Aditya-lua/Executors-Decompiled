package p358pd;

import java.util.Date;

/* JADX INFO: renamed from: pd.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10210o extends AbstractC10200e {

    /* JADX INFO: renamed from: a */
    public final Integer f36816a;

    /* JADX INFO: renamed from: b */
    public final Integer f36817b;

    /* JADX INFO: renamed from: c */
    public final Integer f36818c;

    /* JADX INFO: renamed from: d */
    public final Date f36819d;

    /* JADX INFO: renamed from: e */
    public final String f36820e;

    public /* synthetic */ C10210o(Integer num, Integer num2, Integer num3, Date date, String str, C10209n c10209n) {
        this.f36816a = num;
        this.f36817b = num2;
        this.f36818c = num3;
        this.f36819d = date;
        this.f36820e = str;
    }

    @Override // p358pd.AbstractC10200e
    /* JADX INFO: renamed from: a */
    public final Integer mo39279a() {
        return this.f36817b;
    }

    @Override // p358pd.AbstractC10200e
    /* JADX INFO: renamed from: b */
    public final Integer mo39280b() {
        return this.f36818c;
    }

    @Override // p358pd.AbstractC10200e
    /* JADX INFO: renamed from: d */
    public final String mo39281d() {
        return this.f36820e;
    }

    @Override // p358pd.AbstractC10200e
    /* JADX INFO: renamed from: e */
    public final Date mo39282e() {
        return this.f36819d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10200e) {
            AbstractC10200e abstractC10200e = (AbstractC10200e) obj;
            Integer num = this.f36816a;
            if (num != null ? num.equals(abstractC10200e.mo39283f()) : abstractC10200e.mo39283f() == null) {
                Integer num2 = this.f36817b;
                if (num2 != null ? num2.equals(abstractC10200e.mo39279a()) : abstractC10200e.mo39279a() == null) {
                    Integer num3 = this.f36818c;
                    if (num3 != null ? num3.equals(abstractC10200e.mo39280b()) : abstractC10200e.mo39280b() == null) {
                        Date date = this.f36819d;
                        if (date != null ? date.equals(abstractC10200e.mo39282e()) : abstractC10200e.mo39282e() == null) {
                            String str = this.f36820e;
                            if (str != null ? str.equals(abstractC10200e.mo39281d()) : abstractC10200e.mo39281d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p358pd.AbstractC10200e
    /* JADX INFO: renamed from: f */
    public final Integer mo39283f() {
        return this.f36816a;
    }

    public final int hashCode() {
        Integer num = this.f36816a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f36817b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i10 = iHashCode ^ 1000003;
        Integer num3 = this.f36818c;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f36819d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f36820e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgeSignalsResult{userStatus=" + this.f36816a + ", ageLower=" + this.f36817b + ", ageUpper=" + this.f36818c + ", mostRecentApprovalDate=" + String.valueOf(this.f36819d) + ", installId=" + this.f36820e + "}";
    }
}
