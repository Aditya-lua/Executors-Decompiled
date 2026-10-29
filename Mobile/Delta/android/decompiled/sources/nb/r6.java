package nb;

import com.google.android.gms.internal.measurement.gg;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x6 f25925a;

    public r6(x6 x6Var) {
        Objects.requireNonNull(x6Var);
        this.f25925a = x6Var;
    }

    @Override // com.google.android.gms.internal.measurement.gg
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        u5 u5VarV;
        int i11 = i10 - 1;
        if (i11 == 0) {
            u5VarV = this.f25925a.f25625a.a().v();
        } else if (i11 != 1) {
            if (i11 == 3) {
                u5VarV = this.f25925a.f25625a.a().w();
            } else if (i11 != 4) {
                u5VarV = this.f25925a.f25625a.a().u();
            } else if (z10) {
                u5VarV = this.f25925a.f25625a.a().s();
            } else {
                u5VarV = !z11 ? this.f25925a.f25625a.a().t() : this.f25925a.f25625a.a().r();
            }
        } else if (z10) {
            u5VarV = this.f25925a.f25625a.a().p();
        } else {
            u5VarV = !z11 ? this.f25925a.f25625a.a().q() : this.f25925a.f25625a.a().o();
        }
        int size = list.size();
        if (size == 1) {
            u5VarV.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u5VarV.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u5VarV.a(str);
        } else {
            u5VarV.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
