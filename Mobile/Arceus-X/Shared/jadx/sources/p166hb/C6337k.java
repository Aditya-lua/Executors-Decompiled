package p166hb;

import android.location.Location;
import lb.InterfaceC8102e;
import p268l9.C8048k;

/* JADX INFO: renamed from: hb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6337k implements C8048k.b<InterfaceC8102e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Location f24075a;

    public C6337k(BinderC6338l binderC6338l, Location location) {
        this.f24075a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p268l9.C8048k.b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo27641a(InterfaceC8102e interfaceC8102e) {
        interfaceC8102e.onLocationChanged(this.f24075a);
    }

    @Override // p268l9.C8048k.b
    /* JADX INFO: renamed from: b */
    public final void mo27642b() {
    }
}
