package ob;

import com.google.android.gms.internal.measurement.kg;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w6 implements kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c7 f27947a;

    public w6(c7 c7Var) {
        Objects.requireNonNull(c7Var);
        this.f27947a = c7Var;
    }

    @Override // com.google.android.gms.internal.measurement.kg
    public final void a(int i10, String str, List list, boolean z10, boolean z11) {
        z5 z5VarV;
        int i11 = i10 - 1;
        if (i11 == 0) {
            z5VarV = this.f27947a.f27641a.a().v();
        } else if (i11 != 1) {
            if (i11 == 3) {
                z5VarV = this.f27947a.f27641a.a().w();
            } else if (i11 != 4) {
                z5VarV = this.f27947a.f27641a.a().u();
            } else if (z10) {
                z5VarV = this.f27947a.f27641a.a().s();
            } else {
                z5VarV = !z11 ? this.f27947a.f27641a.a().t() : this.f27947a.f27641a.a().r();
            }
        } else if (z10) {
            z5VarV = this.f27947a.f27641a.a().p();
        } else {
            z5VarV = !z11 ? this.f27947a.f27641a.a().q() : this.f27947a.f27641a.a().o();
        }
        int size = list.size();
        if (size == 1) {
            z5VarV.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            z5VarV.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            z5VarV.a(str);
        } else {
            z5VarV.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
