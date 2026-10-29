package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
    public static final Parcelable U_(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent V_(AFj1sSDK aFj1sSDK, String str, long j10) {
        return aFj1sSDK.AFKeystoreWrapper.putExtra(str, j10);
    }

    public final boolean AFLogger(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFLogger(new Function0() { // from class: com.appsflyer.internal.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AFj1sSDK.registerClient(this.f5500a, str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T S_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFLogger(new Function0() { // from class: com.appsflyer.internal.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.U_(this.f5490a, str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent T_(@NotNull final String str, final long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFLogger(new Function0() { // from class: com.appsflyer.internal.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.V_(this.f5493a, str, j10);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    @Nullable
    public final String registerClient(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFLogger(new Function0() { // from class: com.appsflyer.internal.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.AFKeystoreWrapper(this.f5497a, str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerClient(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.hasExtra(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T AFLogger(Function0<? extends T> function0, String str, T t8, boolean z10) {
        Object objB;
        Object objAFLogger;
        synchronized (this.AFKeystoreWrapper) {
            try {
                jt.n.Companion companion = jt.n.INSTANCE;
                objB = jt.n.b(function0.invoke());
            } catch (Throwable th2) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                objB = jt.n.b(jt.o.a(th2));
            }
            hu.c cVarB = kotlin.jvm.internal.d0.b(ConcurrentModificationException.class);
            Object objB2 = kotlin.jvm.internal.d0.b(ArrayIndexOutOfBoundsException.class);
            hu.c[] cVarArr = {cVarB, objB2};
            Throwable thE = jt.n.e(objB);
            if (thE == null) {
                objB2 = t8;
            } else {
                try {
                    try {
                        if (kotlin.collections.m.G(cVarArr, kotlin.jvm.internal.d0.b(thE.getClass()))) {
                            if (z10) {
                                objB2 = t8;
                                objAFLogger = AFLogger(function0, str, objB2, false);
                            } else {
                                objB2 = t8;
                                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thE, false, false, false, false, 72, null);
                                objAFLogger = objB2;
                            }
                            objB = jt.n.b(objAFLogger);
                        } else {
                            throw thE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        jt.n.Companion companion3 = jt.n.INSTANCE;
                        objB = jt.n.b(jt.o.a(th));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objB2 = t8;
                }
            }
            Throwable thE2 = jt.n.e(objB);
            if (thE2 != null) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thE2, false, false, false, false, 72, null);
                objB = (T) objB2;
            }
        }
        return (T) objB;
    }
}
