package od;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27335a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f27336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f27337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27338e;

    public /* synthetic */ o(Integer num, Integer num2, Integer num3, Date date, String str, n nVar) {
        this.f27335a = num;
        this.b = num2;
        this.f27336c = num3;
        this.f27337d = date;
        this.f27338e = str;
    }

    @Override // od.e
    public final Integer a() {
        return this.b;
    }

    @Override // od.e
    public final Integer b() {
        return this.f27336c;
    }

    @Override // od.e
    public final String d() {
        return this.f27338e;
    }

    @Override // od.e
    public final Date e() {
        return this.f27337d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            Integer num = this.f27335a;
            if (num != null ? num.equals(eVar.f()) : eVar.f() == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(eVar.a()) : eVar.a() == null) {
                    Integer num3 = this.f27336c;
                    if (num3 != null ? num3.equals(eVar.b()) : eVar.b() == null) {
                        Date date = this.f27337d;
                        if (date != null ? date.equals(eVar.e()) : eVar.e() == null) {
                            String str = this.f27338e;
                            if (str != null ? str.equals(eVar.d()) : eVar.d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // od.e
    public final Integer f() {
        return this.f27335a;
    }

    public final int hashCode() {
        Integer num = this.f27335a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i10 = iHashCode ^ 1000003;
        Integer num3 = this.f27336c;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f27337d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f27338e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgeSignalsResult{userStatus=" + this.f27335a + ", ageLower=" + this.b + ", ageUpper=" + this.f27336c + ", mostRecentApprovalDate=" + String.valueOf(this.f27337d) + ", installId=" + this.f27338e + "}";
    }
}
