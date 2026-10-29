package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import hu.InterfaceC6567c;
import java.util.ConcurrentModificationException;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK {

    @NotNull
    private final Intent AFKeystoreWrapper;

    public AFj1sSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFKeystoreWrapper = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getStringExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U_ */
    public static final Parcelable m8938U_(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V_ */
    public static final Intent m8939V_(AFj1sSDK aFj1sSDK, String str, long j10) {
        return aFj1sSDK.AFKeystoreWrapper.putExtra(str, j10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean AFLogger(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFLogger(new Function0() { // from class: com.appsflyer.internal.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AFj1sSDK.registerClient(this.f7139a, str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: S_ */
    public final <T extends Parcelable> T m8944S_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFLogger(new Function0() { // from class: com.appsflyer.internal.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.m8938U_(this.f7124a, str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    /* JADX INFO: renamed from: T_ */
    public final Intent m8945T_(@NotNull final String str, final long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFLogger(new Function0() { // from class: com.appsflyer.internal.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.m8939V_(this.f7128a, str, j10);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Nullable
    public final String registerClient(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFLogger(new Function0() { // from class: com.appsflyer.internal.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.AFKeystoreWrapper(this.f7134a, str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerClient(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.hasExtra(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: com.appsflyer.internal.AFj1sSDK */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: hu.c[] */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T AFLogger(Function0<? extends T> function0, String str, T t8, boolean z10) {
        Object objM30460b;
        Object objAFLogger;
        synchronized (this.AFKeystoreWrapper) {
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(function0.invoke());
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            InterfaceC6567c interfaceC6567cM32002b = C7731d0.m32002b(ConcurrentModificationException.class);
            Object objM32002b = C7731d0.m32002b(ArrayIndexOutOfBoundsException.class);
            InterfaceC6567c[] interfaceC6567cArr = {interfaceC6567cM32002b, objM32002b};
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e == null) {
                objM32002b = t8;
            } else {
                try {
                    try {
                        if (C7693m.m31838G(interfaceC6567cArr, C7731d0.m32002b(thM30463e.getClass()))) {
                            if (z10) {
                                objM32002b = t8;
                                objAFLogger = AFLogger(function0, str, objM32002b, false);
                            } else {
                                objM32002b = t8;
                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thM30463e, false, false, false, false, 72, null);
                                objAFLogger = objM32002b;
                            }
                            objM30460b = C7347n.m30460b(objAFLogger);
                        } else {
                            throw thM30463e;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        C7347n.Companion companion3 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objM32002b = t8;
                }
            }
            Throwable thM30463e2 = C7347n.m30463e(objM30460b);
            if (thM30463e2 != null) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thM30463e2, false, false, false, false, 72, null);
                objM30460b = (T) objM32002b;
            }
        }
        return (T) objM30460b;
    }
}
