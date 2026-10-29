package p601zd;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: renamed from: zd.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C13780i implements InterfaceC13783l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC13792u f48367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Set f48368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicBoolean f48369c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C13786o f48370d;

    public C13780i(C13786o c13786o, AbstractC13792u abstractC13792u, Set set, AtomicBoolean atomicBoolean) {
        this.f48370d = c13786o;
        this.f48367a = abstractC13792u;
        this.f48368b = set;
        this.f48369c = atomicBoolean;
    }

    @Override // p601zd.InterfaceC13783l
    /* JADX INFO: renamed from: a */
    public final void mo50232a(ZipFile zipFile, Set set) {
        this.f48370d.m50238f(this.f48367a, set, new C13779h(this));
    }
}
