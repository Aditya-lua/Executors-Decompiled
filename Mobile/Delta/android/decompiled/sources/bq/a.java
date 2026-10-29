package bq;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import ft.d;
import ft.i;
import ku.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d<DirectFileUploader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<l0> f4305a;
    public final i<UploadService> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f4306c;

    public a(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        this.f4305a = iVar;
        this.b = iVar2;
        this.f4306c = iVar3;
    }

    public static a a(i<l0> iVar, i<UploadService> iVar2, i<p0> iVar3) {
        return new a(iVar, iVar2, iVar3);
    }

    public static DirectFileUploader c(l0 l0Var, UploadService uploadService, p0 p0Var) {
        return new DirectFileUploader(l0Var, uploadService, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DirectFileUploader get() {
        return c(this.f4305a.get(), this.b.get(), this.f4306c.get());
    }
}
