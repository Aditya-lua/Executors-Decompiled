package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2559l {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: q */
    public static final AbstractC2615q0 f9089q;

    /* JADX INFO: renamed from: a */
    public final int f9091a;

    static {
        C2604p0 c2604p0 = new C2604p0();
        for (EnumC2559l enumC2559l : values()) {
            c2604p0.m11638a(Integer.valueOf(enumC2559l.f9091a), enumC2559l);
        }
        f9089q = c2604p0.m11639b();
    }

    EnumC2559l(int i10) {
        this.f9091a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2559l m11533a(int i10) {
        AbstractC2615q0 abstractC2615q0 = f9089q;
        Integer numValueOf = Integer.valueOf(i10);
        return !abstractC2615q0.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (EnumC2559l) abstractC2615q0.get(numValueOf);
    }
}
