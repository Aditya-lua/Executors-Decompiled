package p365q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: q.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C10410x0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    public static final Object f37510c = new Object();

    /* JADX INFO: renamed from: d */
    public static ArrayList<WeakReference<C10410x0>> f37511d;

    /* JADX INFO: renamed from: a */
    public final Resources f37512a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f37513b;

    public C10410x0(@NonNull Context context) {
        super(context);
        if (!C10372f1.m39837c()) {
            this.f37512a = new C10414z0(this, context.getResources());
            this.f37513b = null;
            return;
        }
        C10372f1 c10372f1 = new C10372f1(this, context.getResources());
        this.f37512a = c10372f1;
        Resources.Theme themeNewTheme = c10372f1.newTheme();
        this.f37513b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m40067a(@NonNull Context context) {
        return ((context instanceof C10410x0) || (context.getResources() instanceof C10414z0) || (context.getResources() instanceof C10372f1) || !C10372f1.m39837c()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static Context m40068b(@NonNull Context context) {
        if (!m40067a(context)) {
            return context;
        }
        synchronized (f37510c) {
            try {
                ArrayList<WeakReference<C10410x0>> arrayList = f37511d;
                if (arrayList == null) {
                    f37511d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<C10410x0> weakReference = f37511d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f37511d.remove(size);
                        }
                    }
                    for (int size2 = f37511d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C10410x0> weakReference2 = f37511d.get(size2);
                        C10410x0 c10410x0 = weakReference2 != null ? weakReference2.get() : null;
                        if (c10410x0 != null && c10410x0.getBaseContext() == context) {
                            return c10410x0;
                        }
                    }
                }
                C10410x0 c10410x1 = new C10410x0(context);
                f37511d.add(new WeakReference<>(c10410x1));
                return c10410x1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f37512a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f37512a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f37513b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f37513b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
