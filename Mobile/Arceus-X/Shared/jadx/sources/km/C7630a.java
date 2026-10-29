package km;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: km.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m31665d2 = {"Lkm/a;", "", "", "logTag", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "jsonData", "", "h", "(Landroid/content/Context;Ljava/lang/String;)V", "uri", "g", "appUri", "webUri", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "jsonObject", "f", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "", "i", "(Landroid/content/Context;Ljava/lang/String;)Z", "Landroid/content/Intent;", "intent", "Landroid/content/pm/ResolveInfo;", "b", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/pm/ResolveInfo;", "packageName", "c", "(Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7630a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Set<String> f29144c = C7702q0.m31911g("http", "https");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String logTag;

    /* JADX INFO: renamed from: km.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lkm/a$a;", "", "<init>", "()V", "", "uri", "", "a", "(Ljava/lang/String;)Z", "APP_URI_KEY", "Ljava/lang/String;", "WEB_URI_KEY", "CHROME_NAVIGATION_URI_PREFIX", "", "WEB_SCHEMES", "Ljava/util/Set;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: km.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m31523a(@NotNull String uri) {
            String lowerCase;
            Intrinsics.checkNotNullParameter(uri, "uri");
            Set set = C7630a.f29144c;
            String scheme = Uri.parse(uri).getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            return CollectionsKt.m31699W(set, lowerCase);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C7630a(@NotNull String logTag) {
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        this.logTag = logTag;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m31515d(@NotNull String str) {
        return INSTANCE.m31523a(str);
    }

    /* JADX INFO: renamed from: b */
    public final ResolveInfo m31516b(Context context, Intent intent) {
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
                if (!m31517c(packageName)) {
                    return (ResolveInfo) next;
                }
            }
        }
        next = null;
        return (ResolveInfo) next;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31517c(String packageName) {
        return C7797x.m32309T(packageName, "com.roblox.", false, 2, null) || C7797x.m32309T(packageName, "com.tencent.roblox", false, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m31518e(@NotNull Context context, @NotNull String appUri, @NotNull String webUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appUri, "appUri");
        Intrinsics.checkNotNullParameter(webUri, "webUri");
        if (m31522i(context, appUri) || m31522i(context, webUri)) {
            return;
        }
        C6124q.m27066k(this.logTag, "Could not resolve navigation URI");
    }

    /* JADX INFO: renamed from: f */
    public final void m31519f(Context context, JSONObject jsonObject) {
        String strOptString = jsonObject.optString("app_uri");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jsonObject.optString("web_uri");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        m31518e(context, strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: g */
    public final void m31520g(@NotNull Context context, @NotNull String uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        m31518e(context, "googlechrome://navigate?url=" + uri, uri);
    }

    /* JADX INFO: renamed from: h */
    public final void m31521h(@NotNull Context context, @NotNull String jsonData) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(new JSONObject(jsonData));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) != null) {
            C6124q.m27066k(this.logTag, "Exception parsing external launch data");
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        JSONObject jSONObject = (JSONObject) objM30460b;
        if (jSONObject == null) {
            return;
        }
        m31519f(context, jSONObject);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m31522i(Context context, String uri) {
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse(uri)).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        ResolveInfo resolveInfoM31516b = m31516b(context, intentAddFlags);
        if (resolveInfoM31516b == null) {
            return false;
        }
        ActivityInfo activityInfo = resolveInfoM31516b.activityInfo;
        intentAddFlags.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        try {
            context.startActivity(intentAddFlags);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
