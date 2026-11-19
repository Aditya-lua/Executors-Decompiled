package o9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static t b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f27038c = new u(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f27039a;

    @NonNull
    public static synchronized t b() {
        try {
            if (b == null) {
                b = new t();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b;
    }

    public u a() {
        return this.f27039a;
    }

    public final synchronized void c(u uVar) {
        try {
            if (uVar == null) {
                this.f27039a = f27038c;
                return;
            }
            u uVar2 = this.f27039a;
            if (uVar2 == null || uVar2.E3() < uVar.E3()) {
                this.f27039a = uVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
