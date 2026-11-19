package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public enum l {
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


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q0 f7141q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7143a;

    static {
        p0 p0Var = new p0();
        for (l lVar : values()) {
            p0Var.a(Integer.valueOf(lVar.f7143a), lVar);
        }
        f7141q = p0Var.b();
    }

    l(int i10) {
        this.f7143a = i10;
    }

    public static l a(int i10) {
        q0 q0Var = f7141q;
        Integer numValueOf = Integer.valueOf(i10);
        return !q0Var.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (l) q0Var.get(numValueOf);
    }
}
