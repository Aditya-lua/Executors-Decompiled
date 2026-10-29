package vg;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p151gk.C6124q;
import p151gk.C6133z;
import th.C11659h;

/* JADX INFO: renamed from: vg.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lvg/g;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;Landroid/content/Context;)V", "Lvg/h;", "c", "(Landroid/content/Context;)Lvg/h;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12177g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12177g f42857a = new C12177g();

    /* JADX INFO: renamed from: a */
    public static final void m45075a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesM27107c = C6133z.m27106e(context).m27107c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesM27107c, "get(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesM27107c.edit();
        editorEdit.putString("upload_url", C11659h.m43403a().mo43479K4());
        editorEdit.putString("upload_token", C11659h.m43403a().mo43746w2());
        editorEdit.putInt("anr_maximum_timeout", C11659h.m43403a().mo43720s4());
        editorEdit.putInt("crash_upload_percentage", C11659h.m43403a().mo43589a4());
        editorEdit.putInt("anr_upload_percentage", C11659h.m43403a().mo43508P());
        editorEdit.apply();
        C6124q.m27057b("rbx.backtrace", "Persisted Backtrace init values to cache");
    }

    /* JADX INFO: renamed from: b */
    public static final void m45076b(@NotNull JSONObject json, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesM27107c = C6133z.m27106e(context).m27107c("backtrace_init_cache");
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesM27107c, "get(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesM27107c.edit();
        editorEdit.putString("upload_url", json.optString("JavaCrashUploadToBacktraceUrl", C11659h.m43403a().mo43479K4()));
        editorEdit.putString("upload_token", json.optString("JavaCrashUploadToBacktraceToken", C11659h.m43403a().mo43746w2()));
        editorEdit.putInt("anr_maximum_timeout", json.optInt("JavaANRMaximumTimeout", C11659h.m43403a().mo43720s4()));
        editorEdit.putInt("crash_upload_percentage", json.optInt("JavaCrashUploadToBacktracePercentage", C11659h.m43403a().mo43589a4()));
        editorEdit.putInt("anr_upload_percentage", json.optInt("JavaANRUploadToBacktracePercentage", C11659h.m43403a().mo43508P()));
        editorEdit.apply();
        C6124q.m27057b("rbx.backtrace", "Persisted Backtrace init values from fetch JSON");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final BacktraceInitValues m45077c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesM27107c = C6133z.m27106e(context).m27107c("backtrace_init_cache");
        String string = sharedPreferencesM27107c.getString("upload_url", C11659h.m43403a().mo43479K4());
        Intrinsics.checkNotNull(string);
        String string2 = sharedPreferencesM27107c.getString("upload_token", C11659h.m43403a().mo43746w2());
        Intrinsics.checkNotNull(string2);
        BacktraceInitValues backtraceInitValues = new BacktraceInitValues(string, string2, sharedPreferencesM27107c.getInt("anr_maximum_timeout", C11659h.m43403a().mo43720s4()), sharedPreferencesM27107c.getInt("crash_upload_percentage", C11659h.m43403a().mo43589a4()), sharedPreferencesM27107c.getInt("anr_upload_percentage", C11659h.m43403a().mo43508P()));
        Intrinsics.checkNotNull(sharedPreferencesM27107c);
        SharedPreferences.Editor editorEdit = sharedPreferencesM27107c.edit();
        editorEdit.clear();
        editorEdit.commit();
        C6124q.m27057b("rbx.backtrace", "Read and burned Backtrace init values from cache");
        return backtraceInitValues;
    }
}
