package nb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26925a;
    public Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzdd f26927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f26929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26930g;

    public x8(Context context, zzdd zzddVar, Long l10) {
        this.f26928e = true;
        n9.m.l(context);
        Context applicationContext = context.getApplicationContext();
        n9.m.l(applicationContext);
        this.f26925a = applicationContext;
        this.f26929f = l10;
        if (zzddVar != null) {
            this.f26927d = zzddVar;
            this.f26928e = zzddVar.f7047h;
            this.f26926c = zzddVar.f7046g;
            this.f26930g = zzddVar.f7049j;
            Bundle bundle = zzddVar.f7048i;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
