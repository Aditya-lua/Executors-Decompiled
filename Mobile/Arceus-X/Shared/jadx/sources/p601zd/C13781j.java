package p601zd;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: zd.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C13781j implements InterfaceC13783l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f48371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC13792u f48372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13786o f48373c;

    public C13781j(C13786o c13786o, Set set, AbstractC13792u abstractC13792u) {
        this.f48373c = c13786o;
        this.f48371a = set;
        this.f48372b = abstractC13792u;
    }

    @Override // p601zd.InterfaceC13783l
    /* JADX INFO: renamed from: a */
    public final void mo50232a(ZipFile zipFile, Set set) {
        this.f48371a.addAll(C13786o.m50233a(this.f48373c, set, this.f48372b, zipFile));
    }
}
