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
public final class s2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f6815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f6816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3 f6817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(z3 z3Var, Context context, Bundle bundle) {
        super(z3Var, true);
        this.f6815e = context;
        this.f6816f = bundle;
        Objects.requireNonNull(z3Var);
        this.f6817g = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        try {
            Context context = this.f6815e;
            o9.s.l(context);
            String strA = ob.d7.a(context);
            o9.s.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = ob.d7.a(context);
            }
            Boolean boolC = ob.d7.c("google_analytics_force_disable_updates", resources, strA);
            z3 z3Var = this.f6817g;
            z3Var.n(z3Var.t(context, boolC == null || !boolC.booleanValue()));
            if (z3Var.m() == null) {
                Log.w(z3Var.k(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            int iC = DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
            ((u1) o9.s.l(z3Var.m())).initialize(z9.b.u2(context), new h2(133005L, Math.max(iA, iC), Boolean.TRUE.equals(boolC) || iC < iA, this.f6816f, ob.d7.a(context)), this.f6717a);
        } catch (Exception e10) {
            this.f6817g.j(e10, true, false);
        }
    }
}
