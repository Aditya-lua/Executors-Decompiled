package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ge */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9101ge implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f32993c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9117he f32994d;

    public RunnableC9101ge(C9117he c9117he, String str, String str2, Bundle bundle) {
        this.f32991a = str;
        this.f32992b = str2;
        this.f32993c = bundle;
        Objects.requireNonNull(c9117he);
        this.f32994d = c9117he;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9197me c9197me = this.f32994d.f33019a;
        C9341ve c9341veM36521N0 = c9197me.m36521N0();
        long jMo44175a = c9197me.mo36325e().mo44175a();
        String str = this.f32991a;
        c9197me.m36546i((zzbg) C8953m.m36047l(c9341veM36521N0.m36949R(str, this.f32992b, this.f32993c, "auto", jMo44175a, false, true)), str);
    }
}
