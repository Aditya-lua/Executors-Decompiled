package p306nb;

import com.google.android.gms.internal.measurement.InterfaceC2091gg;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: nb.r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9269r6 implements InterfaceC2091gg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9365x6 f33430a;

    public C9269r6(C9365x6 c9365x6) {
        Objects.requireNonNull(c9365x6);
        this.f33430a = c9365x6;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2091gg
    /* JADX INFO: renamed from: a */
    public final void mo10153a(int i10, String str, List list, boolean z10, boolean z11) {
        C9316u5 c9316u5M37010v;
        int i11 = i10 - 1;
        if (i11 == 0) {
            c9316u5M37010v = this.f33430a.f33067a.mo36321a().m37010v();
        } else if (i11 != 1) {
            if (i11 == 3) {
                c9316u5M37010v = this.f33430a.f33067a.mo36321a().m37011w();
            } else if (i11 != 4) {
                c9316u5M37010v = this.f33430a.f33067a.mo36321a().m37009u();
            } else if (z10) {
                c9316u5M37010v = this.f33430a.f33067a.mo36321a().m37007s();
            } else {
                c9316u5M37010v = !z11 ? this.f33430a.f33067a.mo36321a().m37008t() : this.f33430a.f33067a.mo36321a().m37006r();
            }
        } else if (z10) {
            c9316u5M37010v = this.f33430a.f33067a.mo36321a().m37004p();
        } else {
            c9316u5M37010v = !z11 ? this.f33430a.f33067a.mo36321a().m37005q() : this.f33430a.f33067a.mo36321a().m37003o();
        }
        int size = list.size();
        if (size == 1) {
            c9316u5M37010v.m36912b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c9316u5M37010v.m36913c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c9316u5M37010v.m36911a(str);
        } else {
            c9316u5M37010v.m36914d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
