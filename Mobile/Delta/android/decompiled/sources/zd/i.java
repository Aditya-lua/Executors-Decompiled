package zd;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f38078a;
    public final /* synthetic */ Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f38079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f38080d;

    public i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f38080d = oVar;
        this.f38078a = uVar;
        this.b = set;
        this.f38079c = atomicBoolean;
    }

    @Override // zd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f38080d.f(this.f38078a, set, new h(this));
    }
}
