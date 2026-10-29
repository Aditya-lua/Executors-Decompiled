package v7;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.s7;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f32801a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f32802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.b f32803d;

    public j0(com.android.billingclient.api.b bVar, l lVar, String str, boolean z10) {
        this.f32801a = lVar;
        this.b = str;
        this.f32802c = z10;
        Objects.requireNonNull(bVar);
        this.f32803d = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        com.android.billingclient.api.b bVar = this.f32803d;
        if (!bVar.j0(l1.b())) {
            s7 s7Var = s7.SERVICE_CONNECTION_NOT_READY;
            com.android.billingclient.api.d dVar = com.android.billingclient.api.h.f5173j;
            bVar.q0(s7Var, 9, dVar);
            this.f32801a.a(dVar, com.google.android.gms.internal.play_billing.n0.k());
            return null;
        }
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.m0.m("BillingClient", "Please provide a valid product type.");
            s7 s7Var2 = s7.EMPTY_PRODUCT_TYPE;
            com.android.billingclient.api.d dVar2 = com.android.billingclient.api.h.f5168e;
            bVar.q0(s7Var2, 9, dVar2);
            this.f32801a.a(dVar2, com.google.android.gms.internal.play_billing.n0.k());
            return null;
        }
        x1 x1VarO0 = bVar.o0(str, this.f32802c, 9);
        if (x1VarO0.b() != null) {
            this.f32801a.a(x1VarO0.a(), x1VarO0.b());
            return null;
        }
        this.f32801a.a(x1VarO0.a(), com.google.android.gms.internal.play_billing.n0.k());
        return null;
    }
}
