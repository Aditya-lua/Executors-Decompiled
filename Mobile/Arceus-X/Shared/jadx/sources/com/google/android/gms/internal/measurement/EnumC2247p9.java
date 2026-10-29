package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2247p9 implements InterfaceC2159kb {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f8575a;

    EnumC2247p9(int i10) {
        this.f8575a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f8575a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2159kb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f8575a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
