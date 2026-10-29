package p306nb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.x8 */
/* JADX INFO: loaded from: classes.dex */
public final class C9367x8 {

    /* JADX INFO: renamed from: a */
    public final Context f33649a;

    /* JADX INFO: renamed from: b */
    public Boolean f33650b;

    /* JADX INFO: renamed from: c */
    public long f33651c;

    /* JADX INFO: renamed from: d */
    public zzdd f33652d;

    /* JADX INFO: renamed from: e */
    public boolean f33653e;

    /* JADX INFO: renamed from: f */
    public final Long f33654f;

    /* JADX INFO: renamed from: g */
    public String f33655g;

    public C9367x8(Context context, zzdd zzddVar, Long l10) {
        this.f33653e = true;
        C8953m.m36047l(context);
        Context applicationContext = context.getApplicationContext();
        C8953m.m36047l(applicationContext);
        this.f33649a = applicationContext;
        this.f33654f = l10;
        if (zzddVar != null) {
            this.f33652d = zzddVar;
            this.f33653e = zzddVar.f8889h;
            this.f33651c = zzddVar.f8888g;
            this.f33655g = zzddVar.f8891j;
            Bundle bundle = zzddVar.f8890i;
            if (bundle != null) {
                this.f33650b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
