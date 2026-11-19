package gb;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements ea.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f17653a;

    public o0(i iVar) {
        this.f17653a = iVar;
    }

    @Override // ea.a
    public final Task<ea.b<fa.b>> a(final boolean z10) {
        return this.f17653a.b(new h() { // from class: gb.j0
            @Override // gb.h
            public final /* synthetic */ Task a(l9.g gVar) {
                m9.u.a aVarC = m9.u.c();
                final boolean z11 = z10;
                return gVar.z(aVarC.b(new m9.q() { // from class: gb.n0
                    @Override // m9.q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((ha.c) obj).g((tb.k) obj2, z11);
                    }
                }).e(6693).a());
            }
        });
    }

    @Override // ea.a
    public final Task<Void> b(@NonNull final String str) {
        return this.f17653a.b(new h() { // from class: gb.k0
            @Override // gb.h
            public final /* synthetic */ Task a(l9.g gVar) {
                m9.u.a aVarC = m9.u.c();
                final String str2 = str;
                return gVar.D(aVarC.b(new m9.q() { // from class: gb.m0
                    @Override // m9.q
                    public final /* synthetic */ void accept(Object obj, Object obj2) {
                        ((ha.c) obj).h((tb.k) obj2, str2);
                    }
                }).e(6695).a());
            }
        });
    }
}
