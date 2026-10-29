package nb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26104a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzdd f26106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f26108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26109g;

    public x8(Context context, zzdd zzddVar, Long l10) {
        this.f26107e = true;
        n9.m.l(context);
        Context applicationContext = context.getApplicationContext();
        n9.m.l(applicationContext);
        this.f26104a = applicationContext;
        this.f26108f = l10;
        if (zzddVar != null) {
            this.f26106d = zzddVar;
            this.f26107e = zzddVar.f6973h;
            this.f26105c = zzddVar.f6972g;
            this.f26109g = zzddVar.f6975j;
            Bundle bundle = zzddVar.f6974i;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
