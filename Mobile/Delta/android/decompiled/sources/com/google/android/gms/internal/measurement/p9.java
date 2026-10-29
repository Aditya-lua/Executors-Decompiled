package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum p9 implements kb {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6740a;

    p9(int i10) {
        this.f6740a = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6740a);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f6740a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
