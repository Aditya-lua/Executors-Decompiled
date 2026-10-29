package kr;

import android.app.Application;
import com.withpersona.sdk2.inquiry.steps.p056ui.styling.remoteFonts.RealFontDownloader;
import okhttp3.OkHttpClient;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: kr.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7818e implements InterfaceC5830d<RealFontDownloader> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<OkHttpClient> f29626a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Application> f29627b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC7906p0> f29628c;

    public C7818e(InterfaceC5835i<OkHttpClient> interfaceC5835i, InterfaceC5835i<Application> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        this.f29626a = interfaceC5835i;
        this.f29627b = interfaceC5835i2;
        this.f29628c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C7818e m32429a(InterfaceC5835i<OkHttpClient> interfaceC5835i, InterfaceC5835i<Application> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        return new C7818e(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static RealFontDownloader m32430c(OkHttpClient okHttpClient, Application application, InterfaceC7906p0 interfaceC7906p0) {
        return new RealFontDownloader(okHttpClient, application, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RealFontDownloader get() {
        return m32430c(this.f29626a.get(), this.f29627b.get(), this.f29628c.get());
    }
}
