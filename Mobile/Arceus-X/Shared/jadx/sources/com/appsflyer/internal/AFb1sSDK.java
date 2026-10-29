package com.appsflyer.internal;

import android.os.Process;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, m31665d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1pSDK;", NotificationCompat.CATEGORY_EVENT, "", "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1pSDK;[B)V", "", "afInfoLog", "()V", "registerClient", "Lcom/appsflyer/internal/AFh1pSDK;", "d", "[B", "AFLogger"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final byte[] AFLogger;

    /* JADX INFO: renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFh1pSDK d;

    public AFb1sSDK(@NotNull AFh1pSDK aFh1pSDK, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        this.d = aFh1pSDK;
        this.AFLogger = bArr;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFa1bSDK.getInstance;
            Object declaredConstructor = map.get(314282800);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 57264), (Process.myTid() >> 22) + 87, AndroidCharacter.getMirror('0') - 11)).getDeclaredConstructor(null);
                map.put(314282800, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.d, this.AFLogger};
            Object method = map.get(-1617041952);
            if (method == null) {
                method = ((Class) AFa1bSDK.AFLogger((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 57264), 86 - Process.getGidForName(""), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 37)).getMethod("AFLogger", AFh1pSDK.class, byte[].class);
                map.put(-1617041952, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
