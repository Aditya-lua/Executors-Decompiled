package vg;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lvg/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;Landroid/content/Context;)V", "Lvg/h;", "c", "(Landroid/content/Context;)Lvg/h;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f33100a = new g();

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesC = gk.y.e(context).c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesC, "get(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putString("upload_url", th.h.a().F4());
        editorEdit.putString("upload_token", th.h.a().r2());
        editorEdit.putInt("anr_maximum_timeout", th.h.a().n4());
        editorEdit.putInt("crash_upload_percentage", th.h.a().V3());
        editorEdit.putInt("anr_upload_percentage", th.h.a().M());
        editorEdit.apply();
        gk.p.b("rbx.backtrace", "Persisted Backtrace init values to cache");
    }

    public static final void b(@NotNull JSONObject json, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesC = gk.y.e(context).c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesC, "get(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.putString("upload_url", json.optString("JavaCrashUploadToBacktraceUrl", th.h.a().F4()));
        editorEdit.putString("upload_token", json.optString("JavaCrashUploadToBacktraceToken", th.h.a().r2()));
        editorEdit.putInt("anr_maximum_timeout", json.optInt("JavaANRMaximumTimeout", th.h.a().n4()));
        editorEdit.putInt("crash_upload_percentage", json.optInt("JavaCrashUploadToBacktracePercentage", th.h.a().V3()));
        editorEdit.putInt("anr_upload_percentage", json.optInt("JavaANRUploadToBacktracePercentage", th.h.a().M()));
        editorEdit.apply();
        gk.p.b("rbx.backtrace", "Persisted Backtrace init values from fetch JSON");
    }

    @NotNull
    public static final BacktraceInitValues c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesC = gk.y.e(context).c("backtrace_init_cache");
        String string = sharedPreferencesC.getString("upload_url", th.h.a().F4());
        Intrinsics.checkNotNull(string);
        String string2 = sharedPreferencesC.getString("upload_token", th.h.a().r2());
        Intrinsics.checkNotNull(string2);
        BacktraceInitValues backtraceInitValues = new BacktraceInitValues(string, string2, sharedPreferencesC.getInt("anr_maximum_timeout", th.h.a().n4()), sharedPreferencesC.getInt("crash_upload_percentage", th.h.a().V3()), sharedPreferencesC.getInt("anr_upload_percentage", th.h.a().M()));
        Intrinsics.checkNotNull(sharedPreferencesC);
        SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
        editorEdit.clear();
        editorEdit.commit();
        gk.p.b("rbx.backtrace", "Read and burned Backtrace init values from cache");
        return backtraceInitValues;
    }
}
