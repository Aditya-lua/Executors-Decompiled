package ir;

import android.app.Application;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import dt.i;
import iu.p0;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements dt.d<RealFontDownloader> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<OkHttpClient> f21316a;
    public final i<Application> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f21317c;

    public e(i<OkHttpClient> iVar, i<Application> iVar2, i<p0> iVar3) {
        this.f21316a = iVar;
        this.b = iVar2;
        this.f21317c = iVar3;
    }

    public static e a(i<OkHttpClient> iVar, i<Application> iVar2, i<p0> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static RealFontDownloader c(OkHttpClient okHttpClient, Application application, p0 p0Var) {
        return new RealFontDownloader(okHttpClient, application, p0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RealFontDownloader get() {
        return c(this.f21316a.get(), this.b.get(), this.f21317c.get());
    }
}
