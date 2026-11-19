package yd;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    @NonNull
    public static c a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new h(new m(context));
    }
}
