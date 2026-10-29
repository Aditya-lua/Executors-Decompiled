package nb;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class da implements Application.ActivityLifecycleCallbacks, ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f25454a;

    public da(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f25454a = qaVar;
    }

    @Override // nb.ba
    public final void a(zzdf zzdfVar) {
        g7 g7Var = this.f25454a.f25625a;
        g7Var.I().x(zzdfVar);
        ld ldVarZ = g7Var.z();
        g7 g7Var2 = ldVarZ.f25625a;
        g7Var2.b().t(new dd(ldVarZ, g7Var2.e().b()));
    }

    @Override // nb.ba
    public final void b(zzdf zzdfVar) {
        this.f25454a.f25625a.I().z(zzdfVar);
    }

    @Override // nb.ba
    public final void c(zzdf zzdfVar, Bundle bundle) {
        this.f25454a.f25625a.I().y(zzdfVar, bundle);
    }

    @Override // nb.ba
    public final void d(zzdf zzdfVar) {
        g7 g7Var = this.f25454a.f25625a;
        ld ldVarZ = g7Var.z();
        g7 g7Var2 = ldVarZ.f25625a;
        g7Var2.b().t(new cd(ldVarZ, g7Var2.e().b()));
        g7Var.I().w(zzdfVar);
    }

    @Override // nb.ba
    public final void e(zzdf zzdfVar, Bundle bundle) throws Throwable {
        da daVar;
        g7 g7Var;
        Uri uri;
        try {
            try {
                qa qaVar = this.f25454a;
                g7 g7Var2 = qaVar.f25625a;
                g7Var2.a().w().a("onActivityCreated");
                Intent intent = zzdfVar.f6978h;
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
                        g7Var2.C();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Payload.RFR);
                        daVar = this;
                        try {
                            g7Var2.b().t(new ca(daVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e10) {
                            e = e10;
                            daVar.f25454a.f25625a.a().o().b("Throwable caught in onActivityCreated", e);
                        }
                        g7Var = daVar.f25454a.f25625a;
                    }
                    g7Var.I().v(zzdfVar, bundle);
                }
                g7Var = qaVar.f25625a;
            } catch (Throwable th2) {
                th = th2;
                daVar.f25454a.f25625a.I().v(zzdfVar, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            daVar = this;
        } catch (Throwable th3) {
            th = th3;
            daVar = this;
            daVar.f25454a.f25625a.I().v(zzdfVar, bundle);
            throw th;
        }
        g7Var.I().v(zzdfVar, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(zzdf.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(zzdf.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(zzdf.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
