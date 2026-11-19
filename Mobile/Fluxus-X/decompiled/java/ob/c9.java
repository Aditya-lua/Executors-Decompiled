package ob;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27161a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f27162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.h2 f27163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f27165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27166g;

    public c9(Context context, com.google.android.gms.internal.measurement.h2 h2Var, Long l10) {
        this.f27164e = true;
        o9.s.l(context);
        Context applicationContext = context.getApplicationContext();
        o9.s.l(applicationContext);
        this.f27161a = applicationContext;
        this.f27165f = l10;
        if (h2Var != null) {
            this.f27163d = h2Var;
            this.f27164e = h2Var.f6530h;
            this.f27162c = h2Var.f6529g;
            this.f27166g = h2Var.f6532j;
            Bundle bundle = h2Var.f6531i;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
