package p092e3;

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
import p207j3.C7027b;

/* JADX INFO: renamed from: e3.t */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0014\u001a\u0004\u0018\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR*\u0010!\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R.\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R.\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010%¨\u0006+"}, m31665d2 = {"Le3/t;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "", "shouldFallbackToPreU", "Le3/s;", "b", "(Ljava/lang/Object;Z)Le3/s;", "c", "(Z)Le3/s;", "f", "()Le3/s;", "g", "", "", "classNames", "e", "(Ljava/util/List;Landroid/content/Context;)Le3/s;", "a", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "value", "Z", "getTestMode", "()Z", "setTestMode", "(Z)V", "testMode", "Le3/s;", "getTestPostUProvider", "setTestPostUProvider", "(Le3/s;)V", "testPostUProvider", "d", "getTestPreUProvider", "setTestPreUProvider", "testPreUProvider", "credentials_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4787t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean testMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC4785s testPostUProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public InterfaceC4785s testPreUProvider;

    public C4787t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC4785s m23227d(C4787t c4787t, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c4787t.m23229b(obj, z10);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m23228a(Context context) throws PackageManager.NameNotFoundException {
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
        return CollectionsKt.m31687M0(arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final InterfaceC4785s m23229b(@NotNull Object request, boolean shouldFallbackToPreU) {
        Intrinsics.checkNotNullParameter(request, "request");
        if ((request instanceof C4769k) || Intrinsics.m31980c(request, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return m23232f();
        }
        if (request instanceof C4770k0) {
            for (AbstractC4783r abstractC4783r : ((C4770k0) request).m23188a()) {
                if ((abstractC4783r instanceof C4782q0) || (abstractC4783r instanceof C4776n0)) {
                    return m23232f();
                }
            }
        } else {
            if ((request instanceof AbstractC4794w0) || ((request instanceof C4765i) && ((C4765i) request).getIsConditional())) {
                return m23232f();
            }
            if (request instanceof C4757e) {
                return m23232f();
            }
        }
        return m23230c(shouldFallbackToPreU);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final InterfaceC4785s m23230c(boolean shouldFallbackToPreU) {
        if (C7027b.m29708b(this.context) || C7027b.m29707a(this.context)) {
            return m23232f();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            InterfaceC4785s interfaceC4785sM23233g = m23233g();
            return (interfaceC4785sM23233g == null && shouldFallbackToPreU) ? m23232f() : interfaceC4785sM23233g;
        }
        if (i10 <= 33) {
            return m23232f();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC4785s m23231e(List<String> classNames, Context context) {
        Iterator<String> it = classNames.iterator();
        InterfaceC4785s interfaceC4785s = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                Intrinsics.m31981d(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC4785s interfaceC4785s2 = (InterfaceC4785s) objNewInstance;
                if (!interfaceC4785s2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC4785s != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC4785s = interfaceC4785s2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC4785s;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC4785s m23232f() throws PackageManager.NameNotFoundException {
        if (!this.testMode) {
            List<String> listM23228a = m23228a(this.context);
            if (listM23228a.isEmpty()) {
                return null;
            }
            return m23231e(listM23228a, this.context);
        }
        InterfaceC4785s interfaceC4785s = this.testPreUProvider;
        if (interfaceC4785s == null) {
            return null;
        }
        Intrinsics.checkNotNull(interfaceC4785s);
        if (interfaceC4785s.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC4785s m23233g() {
        if (!this.testMode) {
            C4756d0 c4756d0 = new C4756d0(this.context);
            if (c4756d0.isAvailableOnDevice()) {
                return c4756d0;
            }
            return null;
        }
        InterfaceC4785s interfaceC4785s = this.testPostUProvider;
        if (interfaceC4785s == null) {
            return null;
        }
        Intrinsics.checkNotNull(interfaceC4785s);
        if (interfaceC4785s.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }
}
