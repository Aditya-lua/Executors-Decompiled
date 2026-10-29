package p349p2;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.google.shortcuts.TrampolineActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p544xe.C12816n;
import p544xe.C12818p;
import pe.C10235p;
import pe.InterfaceC10242w;
import ve.C12159a;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: loaded from: classes.dex */
public class C10153a {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m39091a(@NonNull Context context, @NonNull Intent intent, C10235p c10235p) {
        String uri = intent.toUri(1);
        if (c10235p == null) {
            return uri;
        }
        try {
            String strEncodeToString = Base64.encodeToString(((InterfaceC10242w) c10235p.m39368p(InterfaceC10242w.class)).mo22723b(uri.getBytes(Charset.forName("UTF-8"))), 0);
            Intent intent2 = new Intent(context, (Class<?>) TrampolineActivity.class);
            intent2.setPackage(context.getPackageName());
            intent2.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent2.putExtra("shortcutUrl", uri);
            intent2.putExtra("shortcutTag", strEncodeToString);
            return intent2.toUri(1);
        } catch (GeneralSecurityException e10) {
            Log.e("ShortcutUtils", "failed to generate tag for shortcut.", e10);
            return uri;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m39092b(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) TrampolineActivity.class);
        intent.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
        intent.putExtra("id", str);
        return intent.toUri(1);
    }

    /* JADX INFO: renamed from: c */
    public static C10235p m39093c(@NonNull Context context) {
        try {
            C12818p.m47738c();
            return new C12159a.b().m45003n(context, "core-google-shortcuts.TINK_KEYSET", "core-google-shortcuts.PREF_FILE_NAME").m45001l(C12816n.m47721c()).m45002m(String.format("android-keystore://%s", "core-google-shortcuts.MASTER_KEY")).m44996f().m44989e();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("ShortcutUtils", "could not get or create keyset handle.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m39094d(@NonNull String str) {
        return str.startsWith("actions.intent.");
    }
}
