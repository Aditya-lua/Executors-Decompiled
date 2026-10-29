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
import p203j.ActivityC6992b;
import p502w.AbstractServiceConnectionC12269e;
import p502w.C12266b;
import p502w.C12267c;
import p502w.C12268d;
import p502w.C12270f;

/* JADX INFO: renamed from: fm.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u000e\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011JE\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u0006 "}, m31665d2 = {"Lfm/a;", "", "Lj/b;", "activity", "<init>", "(Lj/b;)V", "", "browserStartUrl", "Lkotlin/Function0;", "", "onTabHidden", "Lkotlin/Function1;", "onLaunchError", "onSessionlessLaunch", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "c", "()V", "Landroid/net/Uri;", "uri", "Lw/f;", "session", "d", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lw/f;)V", "a", "Lj/b;", "Lw/e;", "Lw/e;", "serviceConnection", "", "Z", "isServiceBound", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5664a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ActivityC6992b activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public AbstractServiceConnectionC12269e serviceConnection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isServiceBound;

    /* JADX INFO: renamed from: fm.a$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"fm/a$a", "Lw/e;", "Landroid/content/ComponentName;", "componentName", "Lw/c;", "client", "", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Lw/c;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractServiceConnectionC12269e {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Uri f21730h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<String, Unit> f21731i;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ Function0<Unit> f21732o;

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ Function0<Unit> f21733p;

        /* JADX INFO: renamed from: fm.a$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"fm/a$a$a", "Lw/b;", "", "navigationEvent", "Landroid/os/Bundle;", "extras", "", "onNavigationEvent", "(ILandroid/os/Bundle;)V", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14168a extends C12266b {

            /* JADX INFO: renamed from: o */
            public final /* synthetic */ Function0<Unit> f21734o;

            /* JADX INFO: renamed from: p */
            public final /* synthetic */ C5664a f21735p;

            public C14168a(Function0<Unit> function0, C5664a c5664a) {
                this.f21734o = function0;
                this.f21735p = c5664a;
            }

            @Override // p502w.C12266b
            public void onNavigationEvent(int navigationEvent, Bundle extras) {
                if (navigationEvent == 6) {
                    this.f21734o.invoke();
                    this.f21735p.m25716c();
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Uri uri, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function2) {
            this.f21730h = uri;
            this.f21731i = function1;
            this.f21732o = function0;
            this.f21733p = function2;
        }

        @Override // p502w.AbstractServiceConnectionC12269e
        public void onCustomTabsServiceConnected(ComponentName componentName, C12267c client) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(client, "client");
            C12270f c12270fM45523f = client.m45523f(new C14168a(this.f21733p, C5664a.this));
            if (c12270fM45523f != null) {
                C5664a.this.m25717d(this.f21730h, this.f21731i, this.f21732o, c12270fM45523f);
            } else {
                C5664a.this.m25716c();
                C5664a.m25714e(C5664a.this, this.f21730h, this.f21731i, this.f21732o, null, 8, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
        }
    }

    public C5664a(@NotNull ActivityC6992b activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m25714e(C5664a c5664a, Uri uri, Function1 function1, Function0 function0, C12270f c12270f, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            c12270f = null;
        }
        c5664a.m25717d(uri, function1, function0, c12270f);
    }

    /* JADX INFO: renamed from: b */
    public final void m25715b(@Nullable String browserStartUrl, @NotNull Function0<Unit> onTabHidden, @NotNull Function1<? super String, Unit> onLaunchError, @NotNull Function0<Unit> onSessionlessLaunch) {
        Intrinsics.checkNotNullParameter(onTabHidden, "onTabHidden");
        Intrinsics.checkNotNullParameter(onLaunchError, "onLaunchError");
        Intrinsics.checkNotNullParameter(onSessionlessLaunch, "onSessionlessLaunch");
        if (browserStartUrl == null || StringsKt.m32182p0(browserStartUrl)) {
            String simpleName = IllegalArgumentException.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            onLaunchError.invoke(simpleName);
            return;
        }
        Uri uri = Uri.parse(browserStartUrl);
        String strM45518c = C12267c.m45518c(this.activity, null);
        if (strM45518c == null) {
            m25714e(this, uri, onLaunchError, onSessionlessLaunch, null, 8, null);
            return;
        }
        a aVar = new a(uri, onLaunchError, onSessionlessLaunch, onTabHidden);
        this.serviceConnection = aVar;
        boolean zM45517a = C12267c.m45517a(this.activity, strM45518c, aVar);
        this.isServiceBound = zM45517a;
        if (zM45517a) {
            return;
        }
        this.serviceConnection = null;
        m25714e(this, uri, onLaunchError, onSessionlessLaunch, null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m25716c() {
        AbstractServiceConnectionC12269e abstractServiceConnectionC12269e = this.serviceConnection;
        if (abstractServiceConnectionC12269e == null) {
            return;
        }
        this.serviceConnection = null;
        if (this.isServiceBound) {
            this.isServiceBound = false;
            this.activity.unbindService(abstractServiceConnectionC12269e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25717d(Uri uri, Function1<? super String, Unit> onLaunchError, Function0<Unit> onSessionlessLaunch, C12270f session) {
        try {
            new C12268d.e(session).m45532a().m45527b(this.activity, uri);
            if (session == null) {
                onSessionlessLaunch.invoke();
            }
        } catch (ActivityNotFoundException e10) {
            m25716c();
            String simpleName = e10.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            onLaunchError.invoke(simpleName);
        }
    }
}
