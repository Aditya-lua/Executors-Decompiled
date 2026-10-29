package p306nb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: renamed from: nb.da */
/* JADX INFO: loaded from: classes.dex */
public final class C9047da implements Application.ActivityLifecycleCallbacks, InterfaceC9013ba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9257qa f32848a;

    public C9047da(C9257qa c9257qa) {
        Objects.requireNonNull(c9257qa);
        this.f32848a = c9257qa;
    }

    @Override // p306nb.InterfaceC9013ba
    /* JADX INFO: renamed from: a */
    public final void mo36134a(zzdf zzdfVar) {
        C9094g7 c9094g7 = this.f32848a.f33067a;
        c9094g7.m36314I().m36387x(zzdfVar);
        C9180ld c9180ldM36341z = c9094g7.m36341z();
        C9094g7 c9094g8 = c9180ldM36341z.f33067a;
        c9094g8.mo36322b().m36263t(new RunnableC9050dd(c9180ldM36341z, c9094g8.mo36325e().mo44176b()));
    }

    @Override // p306nb.InterfaceC9013ba
    /* JADX INFO: renamed from: b */
    public final void mo36135b(zzdf zzdfVar) {
        this.f32848a.f33067a.m36314I().m36389z(zzdfVar);
    }

    @Override // p306nb.InterfaceC9013ba
    /* JADX INFO: renamed from: c */
    public final void mo36136c(zzdf zzdfVar, Bundle bundle) {
        this.f32848a.f33067a.m36314I().m36388y(zzdfVar, bundle);
    }

    @Override // p306nb.InterfaceC9013ba
    /* JADX INFO: renamed from: d */
    public final void mo36137d(zzdf zzdfVar) {
        C9094g7 c9094g7 = this.f32848a.f33067a;
        C9180ld c9180ldM36341z = c9094g7.m36341z();
        C9094g7 c9094g8 = c9180ldM36341z.f33067a;
        c9094g8.mo36322b().m36263t(new RunnableC9033cd(c9180ldM36341z, c9094g8.mo36325e().mo44176b()));
        c9094g7.m36314I().m36386w(zzdfVar);
    }

    @Override // p306nb.InterfaceC9013ba
    /* JADX INFO: renamed from: e */
    public final void mo36138e(zzdf zzdfVar, Bundle bundle) throws Throwable {
        C9047da c9047da;
        C9094g7 c9094g7;
        Uri uri;
        try {
            try {
                C9257qa c9257qa = this.f32848a;
                C9094g7 c9094g8 = c9257qa.f33067a;
                c9094g8.mo36321a().m37011w().m36911a("onActivityCreated");
                Intent intent = zzdfVar.f8894h;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        uri = null;
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        c9094g8.m36308C();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Payload.RFR);
                        c9047da = this;
                        try {
                            c9094g8.mo36322b().m36263t(new RunnableC9030ca(c9047da, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e10) {
                            e = e10;
                            c9047da.f32848a.f33067a.mo36321a().m37003o().m36912b("Throwable caught in onActivityCreated", e);
                        }
                        c9094g7 = c9047da.f32848a.f33067a;
                    }
                    c9094g7.m36314I().m36385v(zzdfVar, bundle);
                }
                c9094g7 = c9257qa.f33067a;
            } catch (Throwable th2) {
                th = th2;
                c9047da.f32848a.f33067a.m36314I().m36385v(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            c9047da = this;
        } catch (Throwable th3) {
            th = th3;
            c9047da = this;
            c9047da.f32848a.f33067a.m36314I().m36385v(zzdfVar, bundle);
            throw th;
        }
        c9094g7.m36314I().m36385v(zzdfVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        mo36138e(zzdf.m11161a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        mo36135b(zzdf.m11161a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        mo36134a(zzdf.m11161a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        mo36137d(zzdf.m11161a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo36136c(zzdf.m11161a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
