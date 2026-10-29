package yd;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f35839a;
    public final /* synthetic */ Set b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f35840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f35841d;

    public i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f35841d = oVar;
        this.f35839a = uVar;
        this.b = set;
        this.f35840c = atomicBoolean;
    }

    @Override // yd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f35841d.f(this.f35839a, set, new h(this));
    }
}
