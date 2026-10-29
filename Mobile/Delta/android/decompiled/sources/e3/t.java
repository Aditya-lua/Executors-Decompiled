package e3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R.\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010%¨\u0006+"}, d2 = {"Le3/t;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "", "shouldFallbackToPreU", "Le3/s;", "b", "(Ljava/lang/Object;Z)Le3/s;", "c", "(Z)Le3/s;", "f", "()Le3/s;", "g", "", "", "classNames", "e", "(Ljava/util/List;Landroid/content/Context;)Le3/s;", "a", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "value", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "Le3/s;", "getTestPostUProvider", "setTestPostUProvider", "(Le3/s;)V", "testPostUProvider", "d", "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "credentials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean testMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public s testPostUProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public s testPreUProvider;

    public t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ s d(t tVar, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return tVar.b(obj, z10);
    }

    public final List<String> a(Context context) throws PackageManager.NameNotFoundException {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            Intrinsics.checkNotNull(serviceInfoArr);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        return CollectionsKt.M0(arrayList);
    }

    @Nullable
    public final s b(@NotNull Object request, boolean shouldFallbackToPreU) {
        Intrinsics.checkNotNullParameter(request, "request");
        if ((request instanceof k) || Intrinsics.c(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return f();
        }
        if (request instanceof k0) {
            for (r rVar : ((k0) request).a()) {
                if ((rVar instanceof q0) || (rVar instanceof n0)) {
                    return f();
                }
            }
        } else {
            if ((request instanceof w0) || ((request instanceof i) && ((i) request).getIsConditional())) {
                return f();
            }
            if (request instanceof e) {
                return f();
            }
        }
        return c(shouldFallbackToPreU);
    }

    @Nullable
    public final s c(boolean shouldFallbackToPreU) {
        if (j3.b.b(this.context) || j3.b.a(this.context)) {
            return f();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            s sVarG = g();
            return (sVarG == null && shouldFallbackToPreU) ? f() : sVarG;
        }
        if (i10 <= 33) {
            return f();
        }
        return null;
    }

    public final s e(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        s sVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.d(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                s sVar2 = (s) objNewInstance;
                if (!sVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (sVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    sVar = sVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return sVar;
    }

    public final s f() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> listA = a(this.context);
            if (listA.isEmpty()) {
                return null;
            }
            return e(listA, this.context);
        }
        s sVar = this.testPreUProvider;
        if (sVar == null) {
            return null;
        }
        Intrinsics.checkNotNull(sVar);
        if (sVar.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final s g() {
        if (!this.testMode) {
            d0 d0Var = new d0(this.context);
            if (d0Var.isAvailableOnDevice()) {
                return d0Var;
            }
            return null;
        }
        s sVar = this.testPostUProvider;
        if (sVar == null) {
            return null;
        }
        Intrinsics.checkNotNull(sVar);
        if (sVar.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }
}
