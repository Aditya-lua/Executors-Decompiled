package f7;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<i0> f16408a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean a(i0 i0Var, boolean z10) {
        if (!z10) {
            return this.f16408a.remove(i0Var);
        }
        if (Build.VERSION.SDK_INT >= i0Var.f16405a) {
            return this.f16408a.add(i0Var);
        }
        s7.e.c(String.format("%s is not supported pre SDK %d", i0Var.name(), Integer.valueOf(i0Var.f16405a)));
        return false;
    }

    public boolean b(i0 i0Var) {
        return this.f16408a.contains(i0Var);
    }
}
