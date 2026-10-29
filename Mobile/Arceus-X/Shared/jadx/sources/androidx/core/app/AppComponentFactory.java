package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(28)
public class AppComponentFactory extends android.app.AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader cl2, String className, Intent intent) {
        return (Activity) CoreComponentFactory.checkCompatWrapper(instantiateActivityCompat(cl2, className, intent));
    }

    public final Application instantiateApplication(ClassLoader cl2, String className) {
        return (Application) CoreComponentFactory.checkCompatWrapper(instantiateApplicationCompat(cl2, className));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader cl2, String className, Intent intent) {
        return (BroadcastReceiver) CoreComponentFactory.checkCompatWrapper(instantiateReceiverCompat(cl2, className, intent));
    }

    public final ContentProvider instantiateProvider(ClassLoader cl2, String className) {
        return (ContentProvider) CoreComponentFactory.checkCompatWrapper(instantiateProviderCompat(cl2, className));
    }

    public final Service instantiateService(ClassLoader cl2, String className, Intent intent) {
        return (Service) CoreComponentFactory.checkCompatWrapper(instantiateServiceCompat(cl2, className, intent));
    }

    @NonNull
    public Application instantiateApplicationCompat(@NonNull ClassLoader cl2, @NonNull String className) {
        try {
            return (Application) cl2.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public Activity instantiateActivityCompat(@NonNull ClassLoader cl2, @NonNull String className, @Nullable Intent intent) {
        try {
            return (Activity) cl2.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public BroadcastReceiver instantiateReceiverCompat(@NonNull ClassLoader cl2, @NonNull String className, @Nullable Intent intent) {
        try {
            return (BroadcastReceiver) cl2.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public Service instantiateServiceCompat(@NonNull ClassLoader cl2, @NonNull String className, @Nullable Intent intent) {
        try {
            return (Service) cl2.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }

    @NonNull
    public ContentProvider instantiateProviderCompat(@NonNull ClassLoader cl2, @NonNull String className) {
        try {
            return (ContentProvider) cl2.loadClass(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException("Couldn't call constructor", e10);
        }
    }
}
