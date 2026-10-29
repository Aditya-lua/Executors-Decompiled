package fb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements da.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16558a;

    public n0(h hVar) {
        this.f16558a = hVar;
    }

    @Override // da.a
    public final Task<da.b<ea.a>> a(final boolean z10) {
        return this.f16558a.b(new g() { // from class: fb.i0
            @Override // fb.g
            public final /* synthetic */ Task a(k9.e eVar) {
                l9.u.a aVarC = l9.u.c();
                final boolean z11 = z10;
                return eVar.z(aVarC.b(new l9.q() { // from class: fb.m0
                    @Override // l9.q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((ga.c) obj).g((sb.k) obj2, z11);
                    }
                }).e(6693).a());
            }
        });
    }

    @Override // da.a
    public final Task<Void> b(@NonNull final String str) {
        return this.f16558a.b(new g() { // from class: fb.j0
            @Override // fb.g
            public final /* synthetic */ Task a(k9.e eVar) {
                l9.u.a aVarC = l9.u.c();
                final String str2 = str;
                return eVar.D(aVarC.b(new l9.q() { // from class: fb.l0
                    @Override // l9.q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((ga.c) obj).h((sb.k) obj2, str2);
                    }
                }).e(6695).a());
            }
        });
    }
}
