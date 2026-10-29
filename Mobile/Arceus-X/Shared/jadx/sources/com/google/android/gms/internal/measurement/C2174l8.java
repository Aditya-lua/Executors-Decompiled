package com.google.android.gms.internal.measurement;

import android.content.Context;
import p169he.InterfaceC6389s;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2174l8 extends AbstractC2084g9 {

    /* JADX INFO: renamed from: a */
    public final Context f8393a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6389s f8394b;

    public C2174l8(Context context, InterfaceC6389s interfaceC6389s) {
        this.f8393a = context;
        this.f8394b = interfaceC6389s;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2084g9
    /* JADX INFO: renamed from: a */
    public final Context mo10047a() {
        return this.f8393a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2084g9
    /* JADX INFO: renamed from: b */
    public final InterfaceC6389s mo10048b() {
        return this.f8394b;
    }

    public final boolean equals(Object obj) {
        InterfaceC6389s interfaceC6389s;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2084g9) {
            AbstractC2084g9 abstractC2084g9 = (AbstractC2084g9) obj;
            if (this.f8393a.equals(abstractC2084g9.mo10047a()) && ((interfaceC6389s = this.f8394b) != null ? interfaceC6389s.equals(abstractC2084g9.mo10048b()) : abstractC2084g9.mo10048b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8393a.hashCode() ^ 1000003;
        InterfaceC6389s interfaceC6389s = this.f8394b;
        return (iHashCode * 1000003) ^ (interfaceC6389s == null ? 0 : interfaceC6389s.hashCode());
    }

    public final String toString() {
        String string = this.f8393a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f8394b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
