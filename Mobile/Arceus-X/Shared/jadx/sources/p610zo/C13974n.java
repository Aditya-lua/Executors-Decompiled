package p610zo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7906p0;
import p537x6.C12748i;

/* JADX INFO: renamed from: zo.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lzo/n;", "", "Landroid/app/Activity;", "activity", "", "locale", "Lku/p0;", "lifecycleCoroutineScope", "<init>", "(Landroid/app/Activity;Ljava/lang/String;Lku/p0;)V", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "Landroid/app/Application;", "a", "()Landroid/app/Application;", "context", "Lk6/s;", "c", "(Landroid/content/Context;)Lk6/s;", "d", "()Lku/p0;", "Lku/p0;", "kotlin.jvm.PlatformType", "Landroid/app/Application;", "application", "Landroid/content/Context;", "localeOverrideContext", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13974n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 lifecycleCoroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Application application;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Context localeOverrideContext;

    public C13974n(@NotNull Activity activity, @Nullable String str, @NotNull InterfaceC7906p0 lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        this.lifecycleCoroutineScope = lifecycleCoroutineScope;
        Application application = activity.getApplication();
        this.application = application;
        Context contextCreateConfigurationContext = null;
        if (str != null) {
            String str2 = !StringsKt.m32182p0(str) ? str : null;
            if (str2 != null) {
                Configuration configuration = new Configuration(application.getResources().getConfiguration());
                configuration.setLocale(Locale.forLanguageTag(C7797x.m32303N(str2, "_", "-", false, 4, null)));
                contextCreateConfigurationContext = application.createConfigurationContext(configuration);
            }
        }
        this.localeOverrideContext = contextCreateConfigurationContext;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Application m50502a() {
        Application application = this.application;
        Intrinsics.checkNotNullExpressionValue(application, "application");
        return application;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Context m50503b() {
        Context context = this.localeOverrideContext;
        if (context != null) {
            return context;
        }
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC7479s m50504c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C12748i.m47574b(new InterfaceC7479s.a(context), true).m31078i(null).m31076d();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC7906p0 getLifecycleCoroutineScope() {
        return this.lifecycleCoroutineScope;
    }
}
