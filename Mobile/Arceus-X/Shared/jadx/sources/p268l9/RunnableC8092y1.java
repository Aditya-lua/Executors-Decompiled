package p268l9;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: l9.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8092y1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8042i f30127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f30128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8095z1 f30129c;

    public RunnableC8092y1(C8095z1 c8095z1, C8042i c8042i, String str) {
        this.f30127a = c8042i;
        this.f30128b = str;
        Objects.requireNonNull(c8095z1);
        this.f30129c = c8095z1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        C8095z1 c8095z1 = this.f30129c;
        if (c8095z1.m33314k() > 0) {
            C8042i c8042i = this.f30127a;
            if (c8095z1.m33315l() != null) {
                bundle = c8095z1.m33315l().getBundle(this.f30128b);
            } else {
                bundle = null;
            }
            c8042i.mo33180f(bundle);
        }
        if (c8095z1.m33314k() >= 2) {
            this.f30127a.mo33105j();
        }
        if (c8095z1.m33314k() >= 3) {
            this.f30127a.mo33104h();
        }
        if (c8095z1.m33314k() >= 4) {
            this.f30127a.mo33106k();
        }
        if (c8095z1.m33314k() >= 5) {
            this.f30127a.m33181g();
        }
    }
}
