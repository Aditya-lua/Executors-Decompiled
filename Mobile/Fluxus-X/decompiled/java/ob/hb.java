package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f27412a;
    public final /* synthetic */ gb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb f27413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ob f27415e;

    public hb(ob obVar, Bundle bundle, gb gbVar, gb gbVar2, long j10) {
        this.f27412a = bundle;
        this.b = gbVar;
        this.f27413c = gbVar2;
        this.f27414d = j10;
        Objects.requireNonNull(obVar);
        this.f27415e = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27415e.A(this.f27412a, this.b, this.f27413c, this.f27414d);
    }
}
