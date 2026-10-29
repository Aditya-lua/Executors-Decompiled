package p2;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.google.shortcuts.TrampolineActivity;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import oe.p;
import oe.w;
import we.n;

/* JADX INFO: loaded from: classes.dex */
public class a {
    @NonNull
    public static String a(@NonNull Context context, @NonNull Intent intent, p pVar) {
        String uri = intent.toUri(1);
        if (pVar == null) {
            return uri;
        }
        try {
            String strEncodeToString = Base64.encodeToString(((w) pVar.p(w.class)).b(uri.getBytes(Charset.forName("UTF-8"))), 0);
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
    public static String b(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) TrampolineActivity.class);
        intent.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
        intent.putExtra("id", str);
        return intent.toUri(1);
    }

    public static p c(@NonNull Context context) {
        try {
            we.p.c();
            return new ue.a.b().n(context, "core-google-shortcuts.TINK_KEYSET", "core-google-shortcuts.PREF_FILE_NAME").l(n.c()).m(String.format("android-keystore://%s", "core-google-shortcuts.MASTER_KEY")).f().e();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("ShortcutUtils", "could not get or create keyset handle.", e10);
            return null;
        }
    }

    public static boolean d(@NonNull String str) {
        return str.startsWith("actions.intent.");
    }
}
