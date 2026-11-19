package ob;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ia implements Application.ActivityLifecycleCallbacks, ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va f27470a;

    public ia(va vaVar) {
        Objects.requireNonNull(vaVar);
        this.f27470a = vaVar;
    }

    @Override // ob.ga
    public final void a(com.google.android.gms.internal.measurement.j2 j2Var) {
        l7 l7Var = this.f27470a.f27641a;
        l7Var.I().x(j2Var);
        qd qdVarZ = l7Var.z();
        l7 l7Var2 = qdVarZ.f27641a;
        l7Var2.b().t(new id(qdVarZ, l7Var2.e().b()));
    }

    @Override // ob.ga
    public final void b(com.google.android.gms.internal.measurement.j2 j2Var) {
        this.f27470a.f27641a.I().z(j2Var);
    }

    @Override // ob.ga
    public final void c(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) {
        this.f27470a.f27641a.I().y(j2Var, bundle);
    }

    @Override // ob.ga
    public final void d(com.google.android.gms.internal.measurement.j2 j2Var) {
        l7 l7Var = this.f27470a.f27641a;
        qd qdVarZ = l7Var.z();
        l7 l7Var2 = qdVarZ.f27641a;
        l7Var2.b().t(new hd(qdVarZ, l7Var2.e().b()));
        l7Var.I().w(j2Var);
    }

    @Override // ob.ga
    public final void e(com.google.android.gms.internal.measurement.j2 j2Var, Bundle bundle) throws Throwable {
        ia iaVar;
        l7 l7Var;
        Uri uri;
        try {
            try {
                va vaVar = this.f27470a;
                l7 l7Var2 = vaVar.f27641a;
                l7Var2.a().w().a("onActivityCreated");
                Intent intent = j2Var.f6558h;
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
                        l7Var2.C();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter(Payload.RFR);
                        iaVar = this;
                        try {
                            l7Var2.b().t(new ha(iaVar, bundle == null, uri, str, queryParameter));
                        } catch (RuntimeException e10) {
                            e = e10;
                            iaVar.f27470a.f27641a.a().o().b("Throwable caught in onActivityCreated", e);
                        }
                        l7Var = iaVar.f27470a.f27641a;
                    }
                    l7Var.I().v(j2Var, bundle);
                }
                l7Var = vaVar.f27641a;
            } catch (Throwable th2) {
                th = th2;
                iaVar.f27470a.f27641a.I().v(j2Var, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            iaVar = this;
        } catch (Throwable th3) {
            th = th3;
            iaVar = this;
            iaVar.f27470a.f27641a.I().v(j2Var, bundle);
            throw th;
        }
        l7Var.I().v(j2Var, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        e(com.google.android.gms.internal.measurement.j2.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.j2.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(com.google.android.gms.internal.measurement.j2.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.j2.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(com.google.android.gms.internal.measurement.j2.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
