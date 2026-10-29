package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ge implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25565a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f25566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ he f25567d;

    public ge(he heVar, String str, String str2, Bundle bundle) {
        this.f25565a = str;
        this.b = str2;
        this.f25566c = bundle;
        Objects.requireNonNull(heVar);
        this.f25567d = heVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.f25567d.f25586a;
        ve veVarN0 = meVar.N0();
        long jA = meVar.e().a();
        String str = this.f25565a;
        meVar.i((zzbg) n9.m.l(veVarN0.R(str, this.b, this.f25566c, "auto", jA, false, true)), str);
    }
}
