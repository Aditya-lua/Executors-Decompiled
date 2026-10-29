package p121f7;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;
import p431s7.C11189e;

/* JADX INFO: renamed from: f7.j0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5455j0 {

    /* JADX INFO: renamed from: a */
    public final HashSet<EnumC5453i0> f21128a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public boolean m25058a(EnumC5453i0 enumC5453i0, boolean z10) {
        if (!z10) {
            return this.f21128a.remove(enumC5453i0);
        }
        if (Build.VERSION.SDK_INT >= enumC5453i0.f21124a) {
            return this.f21128a.add(enumC5453i0);
        }
        C11189e.m42153c(String.format("%s is not supported pre SDK %d", enumC5453i0.name(), Integer.valueOf(enumC5453i0.f21124a)));
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean m25059b(EnumC5453i0 enumC5453i0) {
        return this.f21128a.contains(enumC5453i0);
    }
}
