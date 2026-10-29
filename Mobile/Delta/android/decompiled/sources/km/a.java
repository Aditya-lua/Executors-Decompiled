package km;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import gk.p;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkm/a;", "", "", "logTag", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "jsonData", "", "h", "(Landroid/content/Context;Ljava/lang/String;)V", "uri", "g", "appUri", "webUri", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "jsonObject", "f", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "", "i", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/content/Intent;", "intent", "Landroid/content/pm/ResolveInfo;", "b", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/pm/ResolveInfo;", "packageName", "c", "(Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Set<String> f22324c = q0.g("http", "https");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String logTag;

    /* JADX INFO: renamed from: km.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkm/a$a;", "", "<init>", "()V", "", "uri", "", "a", "(Ljava/lang/String;)Z", "APP_URI_KEY", "Ljava/lang/String;", "WEB_URI_KEY", "CHROME_NAVIGATION_URI_PREFIX", "", "WEB_SCHEMES", "Ljava/util/Set;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull String uri) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(uri, "uri");
            Set set = a.f22324c;
            String scheme = Uri.parse(uri).getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            return CollectionsKt.W(set, lowerCase);
        }

        public Companion() {
        }
    }

    public a(@NotNull String logTag) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        this.logTag = logTag;
    }

    public static final boolean d(@NotNull String str) {
        return INSTANCE.a(str);
    }

    public final ResolveInfo b(Context context, Intent intent) {
        Object next;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            next = it.next();
            ActivityInfo activityInfo = ((ResolveInfo) next).activityInfo;
            if (activityInfo.exported) {
                String packageName = activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                if (!c(packageName)) {
                    return (ResolveInfo) next;
                }
            }
        }
        next = null;
        return (ResolveInfo) next;
    }

    public final boolean c(String packageName) {
        return x.T(packageName, "com.roblox.", false, 2, null) || x.T(packageName, "com.tencent.roblox", false, 2, null);
    }

    public final void e(@NotNull Context context, @NotNull String appUri, @NotNull String webUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUri, "appUri");
        Intrinsics.checkNotNullParameter(webUri, "webUri");
        if (i(context, appUri) || i(context, webUri)) {
            return;
        }
        p.k(this.logTag, "Could not resolve navigation URI");
    }

    public final void f(Context context, JSONObject jsonObject) {
        String strOptString = jsonObject.optString("app_uri");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jsonObject.optString("web_uri");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        e(context, strOptString, strOptString2);
    }

    public final void g(@NotNull Context context, @NotNull String uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        e(context, "googlechrome://navigate?url=" + uri, uri);
    }

    public final void h(@NotNull Context context, @NotNull String jsonData) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(new JSONObject(jsonData));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        if (n.e(objB) != null) {
            p.k(this.logTag, "Exception parsing external launch data");
        }
        if (n.g(objB)) {
            objB = null;
        }
        JSONObject jSONObject = (JSONObject) objB;
        if (jSONObject == null) {
            return;
        }
        f(context, jSONObject);
    }

    public final boolean i(Context context, String uri) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse(uri)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        ResolveInfo resolveInfoB = b(context, intentAddFlags);
        if (resolveInfoB == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfoB.activityInfo;
        intentAddFlags.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        try {
            context.startActivity(intentAddFlags);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
