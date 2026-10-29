package p261l2;

import android.content.ContentProvider;
import android.content.Context;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7974a {
    /* JADX INFO: renamed from: a */
    public static Context m33002a(ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
