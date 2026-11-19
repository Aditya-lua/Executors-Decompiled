package rd;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30666a;
    public final Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f30667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f30668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30669e;

    public /* synthetic */ o(Integer num, Integer num2, Integer num3, Date date, String str, n nVar) {
        this.f30666a = num;
        this.b = num2;
        this.f30667c = num3;
        this.f30668d = date;
        this.f30669e = str;
    }

    @Override // rd.e
    public final Integer a() {
        return this.b;
    }

    @Override // rd.e
    public final Integer b() {
        return this.f30667c;
    }

    @Override // rd.e
    public final String d() {
        return this.f30669e;
    }

    @Override // rd.e
    public final Date e() {
        return this.f30668d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            Integer num = this.f30666a;
            if (num != null ? num.equals(eVar.f()) : eVar.f() == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(eVar.a()) : eVar.a() == null) {
                    Integer num3 = this.f30667c;
                    if (num3 != null ? num3.equals(eVar.b()) : eVar.b() == null) {
                        Date date = this.f30668d;
                        if (date != null ? date.equals(eVar.e()) : eVar.e() == null) {
                            String str = this.f30669e;
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

    @Override // rd.e
    public final Integer f() {
        return this.f30666a;
    }

    public final int hashCode() {
        Integer num = this.f30666a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i10 = iHashCode ^ 1000003;
        Integer num3 = this.f30667c;
        int iHashCode3 = ((((i10 * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f30668d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f30669e;
        return iHashCode4 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AgeSignalsResult{userStatus=" + this.f30666a + ", ageLower=" + this.b + ", ageUpper=" + this.f30667c + ", mostRecentApprovalDate=" + String.valueOf(this.f30668d) + ", installId=" + this.f30669e + "}";
    }
}
