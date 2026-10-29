package w9;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final c b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f34141a = null;

    @NonNull
    public static b a(@NonNull Context context) {
        return b.b(context);
    }

    @NonNull
    public final synchronized b b(@NonNull Context context) {
        try {
            if (this.f34141a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f34141a = new b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34141a;
    }
}
