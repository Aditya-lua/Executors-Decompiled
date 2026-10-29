package nb;

import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25973a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w5 f25977f;

    public t5(w5 w5Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f25973a = i10;
        this.b = str;
        this.f25974c = obj;
        this.f25975d = obj2;
        this.f25976e = obj3;
        Objects.requireNonNull(w5Var);
        this.f25977f = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5 w5Var = this.f25977f;
        k6 k6VarX = w5Var.f25625a.x();
        if (!k6VarX.k()) {
            Log.println(6, w5Var.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (w5Var.D() == 0) {
            g7 g7Var = w5Var.f25625a;
            if (g7Var.w().B()) {
                g7Var.c();
                w5Var.E('C');
            } else {
                g7Var.c();
                w5Var.E('c');
            }
        }
        if (w5Var.F() < 0) {
            w5Var.f25625a.w().A();
            w5Var.G(133005L);
        }
        int i10 = this.f25973a;
        char cD = w5Var.D();
        long jF = w5Var.F();
        String str = this.b;
        Object obj = this.f25974c;
        Object obj2 = this.f25975d;
        Object obj3 = this.f25976e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strA = w5.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cD).length() + String.valueOf(jF).length() + 1 + strA.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cD);
        sb2.append(jF);
        sb2.append(":");
        sb2.append(strA);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, Barcode.FORMAT_UPC_E);
        }
        i6 i6Var = k6VarX.f25670e;
        if (i6Var != null) {
            i6Var.a(string, 1L);
        }
    }
}
