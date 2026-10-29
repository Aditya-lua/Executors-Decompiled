package p015ak;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ak.n2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lak/n2;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Ljava/lang/String;", "a", "()Ljava/lang/String;", "", "b", "(Landroid/content/Context;)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0319n2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0319n2 f822a = new C0319n2();

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m1321a() {
        String str = Build.MODEL;
        if (str == null) {
            str = "Android";
        }
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "0";
        }
        return "Mozilla/5.0 (Linux; Android " + str2 + "; " + str + "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/120.0.6099.230 Mobile Safari/537.36";
    }

    /* JADX INFO: renamed from: b */
    public static final void m1322b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("webview_user_agent", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("cached_ua", defaultUserAgent);
        editorEdit.apply();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m1323c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences("webview_user_agent", 0).getString("cached_ua", null);
        return string == null ? m1321a() : string;
    }
}
