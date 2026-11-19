package be;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f3973a;
    public final /* synthetic */ u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f3974c;

    public j(o oVar, Set set, u uVar) {
        this.f3974c = oVar;
        this.f3973a = set;
        this.b = uVar;
    }

    @Override // be.l
    public final void a(ZipFile zipFile, Set set) {
        this.f3973a.addAll(o.a(this.f3974c, set, this.b, zipFile));
    }
}
