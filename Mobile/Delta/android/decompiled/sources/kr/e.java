package kr;

import android.app.Application;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import ft.i;
import ku.p0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ft.d<RealFontDownloader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<OkHttpClient> f22712a;
    public final i<Application> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f22713c;

    public e(i<OkHttpClient> iVar, i<Application> iVar2, i<p0> iVar3) {
        this.f22712a = iVar;
        this.b = iVar2;
        this.f22713c = iVar3;
    }

    public static e a(i<OkHttpClient> iVar, i<Application> iVar2, i<p0> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static RealFontDownloader c(OkHttpClient okHttpClient, Application application, p0 p0Var) {
        return new RealFontDownloader(okHttpClient, application, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RealFontDownloader get() {
        return c(this.f22712a.get(), this.b.get(), this.f22713c.get());
    }
}
