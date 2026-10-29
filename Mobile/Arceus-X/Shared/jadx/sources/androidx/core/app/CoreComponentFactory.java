package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RestrictTo;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes.dex
  classes4.dex
 */
/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* JADX INFO: loaded from: classes4.dex */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CompatWrapped {
        Object getWrapper();
    }

    /* JADX INFO: renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface InterfaceC0533a {
        /* JADX INFO: renamed from: a */
        Object m2649a();
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m2648a(T t8) {
        T t10;
        return (!(t8 instanceof InterfaceC0533a) || (t10 = (T) ((InterfaceC0533a) t8).m2649a()) == null) ? t8 : t10;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m2648a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m2648a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m2648a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m2648a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m2648a(super.instantiateService(classLoader, str, intent));
    }
}
