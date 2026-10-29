package yd;

import java.util.Set;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f35842a;
    public final /* synthetic */ u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f35843c;

    public j(o oVar, Set set, u uVar) {
        this.f35843c = oVar;
        this.f35842a = set;
        this.b = uVar;
    }

    @Override // yd.l
    public final void a(ZipFile zipFile, Set set) {
        this.f35842a.addAll(o.a(this.f35843c, set, this.b, zipFile));
    }
}
