package com.roblox.universalapp.applifecyclenativeadapter;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;

/* JADX INFO: loaded from: classes2.dex */
public class JNIAppLifecycleNativeAdapter implements p {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9776a;

        static {
            int[] iArr = new int[l.a.values().length];
            f9776a = iArr;
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9776a[l.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9776a[l.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static native void setActive();

    public static native void setHidden();

    public static native void setInactive();

    @Override // androidx.p000lifecycle.p
    public void g(@NonNull s sVar, @NonNull l.a aVar) {
        int i10 = a.f9776a[aVar.ordinal()];
        if (i10 == 1) {
            setActive();
        } else if (i10 == 2) {
            setInactive();
        } else {
            if (i10 != 3) {
                return;
            }
            setHidden();
        }
    }
}
