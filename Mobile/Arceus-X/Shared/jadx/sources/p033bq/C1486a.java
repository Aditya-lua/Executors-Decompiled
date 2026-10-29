package p033bq;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: bq.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486a implements InterfaceC5830d<DirectFileUploader> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C0967l0> f5766a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<UploadService> f5767b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC7906p0> f5768c;

    public C1486a(InterfaceC5835i<C0967l0> interfaceC5835i, InterfaceC5835i<UploadService> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        this.f5766a = interfaceC5835i;
        this.f5767b = interfaceC5835i2;
        this.f5768c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C1486a m7610a(InterfaceC5835i<C0967l0> interfaceC5835i, InterfaceC5835i<UploadService> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        return new C1486a(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static DirectFileUploader m7611c(C0967l0 c0967l0, UploadService uploadService, InterfaceC7906p0 interfaceC7906p0) {
        return new DirectFileUploader(c0967l0, uploadService, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DirectFileUploader get() {
        return m7611c(this.f5766a.get(), this.f5767b.get(), this.f5768c.get());
    }
}
