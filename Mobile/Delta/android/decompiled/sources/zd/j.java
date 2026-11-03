package zd;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f38081a;
    public final /* synthetic */ u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f38082c;

    public j(o oVar, Set set, u uVar) {
        this.f38082c = oVar;
        this.f38081a = set;
        this.b = uVar;
    }

    @Override // zd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f38081a.addAll(o.a(this.f38082c, set, this.b, zipFile));
    }
}
