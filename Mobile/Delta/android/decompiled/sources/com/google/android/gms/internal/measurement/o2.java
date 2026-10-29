package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f6692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f6693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v3 f6694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(v3 v3Var, Context context, Bundle bundle) {
        super(v3Var, true);
        this.f6692e = context;
        this.f6693f = bundle;
        Objects.requireNonNull(v3Var);
        this.f6694g = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        try {
            Context context = this.f6692e;
            n9.m.l(context);
            String strA = nb.y6.a(context);
            n9.m.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = nb.y6.a(context);
            }
            Boolean boolC = nb.y6.c("google_analytics_force_disable_updates", resources, strA);
            v3 v3Var = this.f6694g;
            v3Var.n(v3Var.t(context, boolC == null || !boolC.booleanValue()));
            if (v3Var.m() == null) {
                Log.w(v3Var.k(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iC = DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
            ((u1) n9.m.l(v3Var.m())).initialize(y9.b.u2(context), new zzdd(133005L, Math.max(iA, iC), Boolean.TRUE.equals(boolC) || iC < iA, this.f6693f, nb.y6.a(context)), this.f6552a);
        } catch (Exception e10) {
            this.f6694g.j(e10, true, false);
        }
    }
}
