package be;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f3970a;
    public final /* synthetic */ Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f3971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f3972d;

    public i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f3972d = oVar;
        this.f3970a = uVar;
        this.b = set;
        this.f3971c = atomicBoolean;
    }

    @Override // be.l
    public final void a(ZipFile zipFile, Set set) {
        this.f3972d.f(this.f3970a, set, new h(this));
    }
}
