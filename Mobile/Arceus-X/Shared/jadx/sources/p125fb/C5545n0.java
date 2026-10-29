package p125fb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import ga.C6060c;
import p073da.C4498b;
import p073da.InterfaceC4497a;
import p099ea.C4892a;
import p242k9.AbstractC7495e;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import sb.C11264k;

/* JADX INFO: renamed from: fb.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5545n0 implements InterfaceC4497a {

    /* JADX INFO: renamed from: a */
    public final C5524h f21330a;

    public C5545n0(C5524h c5524h) {
        this.f21330a = c5524h;
    }

    @Override // p073da.InterfaceC4497a
    /* JADX INFO: renamed from: a */
    public final Task<C4498b<C4892a>> mo22455a(final boolean z10) {
        return this.f21330a.m25188b(new InterfaceC5520g() { // from class: fb.i0
            @Override // p125fb.InterfaceC5520g
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Task mo25178a(AbstractC7495e abstractC7495e) {
                AbstractC8078u.a aVarM33280c = AbstractC8078u.m33280c();
                final boolean z11 = z10;
                return abstractC7495e.m31151z(aVarM33280c.m33286b(new InterfaceC8066q() { // from class: fb.m0
                    @Override // p268l9.InterfaceC8066q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((C6060c) obj).m26902g((C11264k) obj2, z11);
                    }
                }).m33289e(6693).m33285a());
            }
        });
    }

    @Override // p073da.InterfaceC4497a
    /* JADX INFO: renamed from: b */
    public final Task<Void> mo22456b(@NonNull final String str) {
        return this.f21330a.m25188b(new InterfaceC5520g() { // from class: fb.j0
            @Override // p125fb.InterfaceC5520g
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Task mo25178a(AbstractC7495e abstractC7495e) {
                AbstractC8078u.a aVarM33280c = AbstractC8078u.m33280c();
                final String str2 = str;
                return abstractC7495e.m31136D(aVarM33280c.m33286b(new InterfaceC8066q() { // from class: fb.l0
                    @Override // p268l9.InterfaceC8066q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((C6060c) obj).m26903h((C11264k) obj2, str2);
                    }
                }).m33289e(6695).m33285a());
            }
        });
    }
}
