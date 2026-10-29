package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;
import p305n9.C8953m;
import p306nb.C9381y6;
import p571y9.BinderC13134b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2222o2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f8519e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Bundle f8520f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2349v3 f8521g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2222o2(C2349v3 c2349v3, Context context, Bundle bundle) {
        super(c2349v3, true);
        this.f8519e = context;
        this.f8520f = bundle;
        Objects.requireNonNull(c2349v3);
        this.f8521g = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        try {
            Context context = this.f8519e;
            C8953m.m36047l(context);
            String strM37080a = C9381y6.m37080a(context);
            C8953m.m36047l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strM37080a)) {
                strM37080a = C9381y6.m37080a(context);
            }
            Boolean boolM37082c = C9381y6.m37082c("google_analytics_force_disable_updates", resources, strM37080a);
            C2349v3 c2349v3 = this.f8521g;
            c2349v3.m10815n(c2349v3.m10820t(context, boolM37082c == null || !boolM37082c.booleanValue()));
            if (c2349v3.m10814m() == null) {
                Log.w(c2349v3.m10812k(), "Failed to connect to measurement client.");
                return;
            }
            int iM9233a = DynamiteModule.m9233a(context, ModuleDescriptor.MODULE_ID);
            int iM9234c = DynamiteModule.m9234c(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC2329u1) C8953m.m36047l(c2349v3.m10814m())).initialize(BinderC13134b.m48743u2(context), new zzdd(133005L, Math.max(iM9233a, iM9234c), Boolean.TRUE.equals(boolM37082c) || iM9234c < iM9233a, this.f8520f, C9381y6.m37080a(context)), this.f8335a);
        } catch (Exception e10) {
            this.f8521g.m10811j(e10, true, false);
        }
    }
}
