package ob;

import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27988a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b6 f27992f;

    public y5(b6 b6Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f27988a = i10;
        this.b = str;
        this.f27989c = obj;
        this.f27990d = obj2;
        this.f27991e = obj3;
        Objects.requireNonNull(b6Var);
        this.f27992f = b6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6 b6Var = this.f27992f;
        p6 p6VarX = b6Var.f27641a.x();
        if (!p6VarX.k()) {
            Log.println(6, b6Var.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (b6Var.D() == 0) {
            l7 l7Var = b6Var.f27641a;
            if (l7Var.w().B()) {
                l7Var.c();
                b6Var.E('C');
            } else {
                l7Var.c();
                b6Var.E('c');
            }
        }
        if (b6Var.F() < 0) {
            b6Var.f27641a.w().A();
            b6Var.G(133005L);
        }
        int i10 = this.f27988a;
        char cD = b6Var.D();
        long jF = b6Var.F();
        String str = this.b;
        Object obj = this.f27989c;
        Object obj2 = this.f27990d;
        Object obj3 = this.f27991e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strA = b6.A(true, str, obj, obj2, obj3);
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
        n6 n6Var = p6VarX.f27685e;
        if (n6Var != null) {
            n6Var.a(string, 1L);
        }
    }
}
