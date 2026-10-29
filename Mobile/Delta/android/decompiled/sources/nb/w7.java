package nb;

import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26069a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8 f26070c;

    public w7(i8 i8Var, zzbg zzbgVar, String str) {
        this.f26069a = zzbgVar;
        this.b = str;
        Objects.requireNonNull(i8Var);
        this.f26070c = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i8 i8Var = this.f26070c;
        i8Var.z2().E();
        i8Var.z2().i(this.f26069a, this.b);
    }
}
