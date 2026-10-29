package p487v8;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import p305n9.C8953m;
import va.C12115c;

/* JADX INFO: renamed from: v8.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12107h {

    /* JADX INFO: renamed from: a */
    public static WeakReference f42724a;

    @NonNull
    /* JADX INFO: renamed from: b */
    public static synchronized AbstractC12107h m44946b(@NonNull Context context) {
        C8953m.m36047l(context);
        WeakReference weakReference = f42724a;
        AbstractC12107h abstractC12107h = weakReference == null ? null : (AbstractC12107h) weakReference.get();
        if (abstractC12107h != null) {
            return abstractC12107h;
        }
        C12115c c12115c = new C12115c(context.getApplicationContext());
        f42724a = new WeakReference(c12115c);
        return c12115c;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract Task<Void> mo44947a(@NonNull InterfaceC12100a interfaceC12100a);
}
