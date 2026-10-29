package p291mb;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import p305n9.C8953m;
import p306nb.C9094g7;
import p306nb.C9257qa;

/* JADX INFO: renamed from: mb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8481a extends AbstractC8483c {

    /* JADX INFO: renamed from: a */
    public final C9094g7 f31188a;

    /* JADX INFO: renamed from: b */
    public final C9257qa f31189b;

    public C8481a(@NonNull C9094g7 c9094g7) {
        super(null);
        C8953m.m36047l(c9094g7);
        this.f31188a = c9094g7;
        this.f31189b = c9094g7.m36307B();
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: a */
    public final void mo26958a(String str, String str2, Bundle bundle) {
        this.f31189b.m36704p(str, str2, bundle);
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: b */
    public final void mo26959b(Bundle bundle) {
        this.f31189b.m36674M(bundle);
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: c */
    public final void mo26960c(String str) {
        C9094g7 c9094g7 = this.f31188a;
        c9094g7.m36318M().m37070j(str, c9094g7.mo36325e().mo44176b());
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: d */
    public final String mo26961d() {
        return this.f31189b.m36679R();
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: e */
    public final String mo26962e() {
        return this.f31189b.m36665D();
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: f */
    public final long mo26963f() {
        return this.f31188a.m36308C().m36970p0();
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: g */
    public final String mo26964g() {
        return this.f31189b.m36680S();
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: h */
    public final void mo26965h(String str) {
        C9094g7 c9094g7 = this.f31188a;
        c9094g7.m36318M().m37069i(str, c9094g7.mo36325e().mo44176b());
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: i */
    public final int mo26966i(String str) {
        this.f31189b.m36673L(str);
        return 25;
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: j */
    public final Map mo26967j(String str, String str2, boolean z10) {
        return this.f31189b.m36664C(str, str2, z10);
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: k */
    public final void mo26968k(String str, String str2, Bundle bundle) {
        this.f31188a.m36307B().m36676O(str, str2, bundle);
    }

    @Override // p306nb.InterfaceC9273ra
    /* JADX INFO: renamed from: l */
    public final List mo26969l(String str, String str2) {
        return this.f31189b.m36677P(str, str2);
    }

    @Override // p306nb.InterfaceC9273ra
    public final String zzh() {
        return this.f31189b.m36678Q();
    }
}
