package j9;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z10);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return l.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return l.class;
    }
}
