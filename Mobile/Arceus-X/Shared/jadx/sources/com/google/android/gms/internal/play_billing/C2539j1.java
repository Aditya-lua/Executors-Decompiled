package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2539j1 {

    /* JADX INFO: renamed from: b */
    public static final C2539j1 f9050b = new C2539j1(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a */
    public final Throwable f9051a;

    /* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j1$a */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public C2539j1(Throwable th2) {
        th2.getClass();
        this.f9051a = th2;
    }
}
