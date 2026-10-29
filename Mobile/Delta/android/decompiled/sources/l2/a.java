package l2;

import android.content.ContentProvider;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Context a(ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
