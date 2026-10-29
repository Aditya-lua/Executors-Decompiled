package fm;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u000e\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006 "}, d2 = {"Lfm/a;", "", "Lj/b;", "activity", "<init>", "(Lj/b;)V", "", "browserStartUrl", "Lkotlin/Function0;", "", "onTabHidden", "Lkotlin/Function1;", "onLaunchError", "onSessionlessLaunch", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "c", "()V", "Landroid/net/Uri;", "uri", "Lw/f;", "session", "d", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lw/f;)V", "a", "Lj/b;", "Lw/e;", "Lw/e;", "serviceConnection", "", "Z", "isServiceBound", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j.b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public w.e serviceConnection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isServiceBound;

    /* JADX INFO: renamed from: fm.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"fm/a$a", "Lw/e;", "Landroid/content/ComponentName;", "componentName", "Lw/c;", "client", "", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Lw/c;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0311a extends w.e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Uri f16812h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f16813i;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f16814o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f16815p;

        /* JADX INFO: renamed from: fm.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"fm/a$a$a", "Lw/b;", "", "navigationEvent", "Landroid/os/Bundle;", "extras", "", "onNavigationEvent", "(ILandroid/os/Bundle;)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0312a extends w.b {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f16816o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ a f16817p;

            public C0312a(Function0<Unit> function0, a aVar) {
                this.f16816o = function0;
                this.f16817p = aVar;
            }

            @Override // w.b
            public void onNavigationEvent(int navigationEvent, Bundle extras) {
                if (navigationEvent == 6) {
                    this.f16816o.invoke();
                    this.f16817p.c();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0311a(Uri uri, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function2) {
            this.f16812h = uri;
            this.f16813i = function1;
            this.f16814o = function0;
            this.f16815p = function2;
        }

        @Override // w.e
        public void onCustomTabsServiceConnected(ComponentName componentName, w.c client) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(client, "client");
            w.f fVarF = client.f(new C0312a(this.f16815p, a.this));
            if (fVarF != null) {
                a.this.d(this.f16812h, this.f16813i, this.f16814o, fVarF);
            } else {
                a.this.c();
                a.e(a.this, this.f16812h, this.f16813i, this.f16814o, null, 8, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
        }
    }

    public a(@NotNull j.b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    public static /* synthetic */ void e(a aVar, Uri uri, Function1 function1, Function0 function0, w.f fVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fVar = null;
        }
        aVar.d(uri, function1, function0, fVar);
    }

    public final void b(@Nullable String browserStartUrl, @NotNull Function0<Unit> onTabHidden, @NotNull Function1<? super String, Unit> onLaunchError, @NotNull Function0<Unit> onSessionlessLaunch) {
        Intrinsics.checkNotNullParameter(onTabHidden, "onTabHidden");
        Intrinsics.checkNotNullParameter(onLaunchError, "onLaunchError");
        Intrinsics.checkNotNullParameter(onSessionlessLaunch, "onSessionlessLaunch");
        if (browserStartUrl == null || StringsKt.p0(browserStartUrl)) {
            String simpleName = IllegalArgumentException.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            onLaunchError.invoke(simpleName);
            return;
        }
        Uri uri = Uri.parse(browserStartUrl);
        String strC = w.c.c(this.activity, null);
        if (strC == null) {
            e(this, uri, onLaunchError, onSessionlessLaunch, null, 8, null);
            return;
        }
        C0311a c0311a = new C0311a(uri, onLaunchError, onSessionlessLaunch, onTabHidden);
        this.serviceConnection = c0311a;
        boolean zA = w.c.a(this.activity, strC, c0311a);
        this.isServiceBound = zA;
        if (zA) {
            return;
        }
        this.serviceConnection = null;
        e(this, uri, onLaunchError, onSessionlessLaunch, null, 8, null);
    }

    public final void c() {
        w.e eVar = this.serviceConnection;
        if (eVar == null) {
            return;
        }
        this.serviceConnection = null;
        if (this.isServiceBound) {
            this.isServiceBound = false;
            this.activity.unbindService(eVar);
        }
    }

    public final void d(Uri uri, Function1<? super String, Unit> onLaunchError, Function0<Unit> onSessionlessLaunch, w.f session) {
        try {
            new w.d.e(session).a().b(this.activity, uri);
            if (session == null) {
                onSessionlessLaunch.invoke();
            }
        } catch (ActivityNotFoundException e10) {
            c();
            String simpleName = e10.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            onLaunchError.invoke(simpleName);
        }
    }
}
