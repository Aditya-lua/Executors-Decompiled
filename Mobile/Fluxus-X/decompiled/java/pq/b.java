package pq;

import androidx.p000lifecycle.l0;
import av.p0;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import wt.d;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f29312a;
    public final i<UploadService> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f29313c;

    public b(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        this.f29312a = iVar;
        this.b = iVar2;
        this.f29313c = iVar3;
    }

    public static b a(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static a c(l0 l0Var, UploadService uploadService, p0 p0Var) {
        return new a(l0Var, uploadService, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f29312a.get(), this.b.get(), this.f29313c.get());
    }
}
