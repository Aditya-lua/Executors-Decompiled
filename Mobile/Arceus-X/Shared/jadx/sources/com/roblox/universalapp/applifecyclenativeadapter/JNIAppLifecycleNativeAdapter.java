package com.roblox.universalapp.applifecyclenativeadapter;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;

/* JADX INFO: loaded from: classes2.dex */
public class JNIAppLifecycleNativeAdapter implements InterfaceC0974p {

    /* JADX INFO: renamed from: com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter$a */
    public static /* synthetic */ class C3348a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12734a;

        static {
            int[] iArr = new int[AbstractC0966l.a.values().length];
            f12734a = iArr;
            try {
                iArr[AbstractC0966l.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12734a[AbstractC0966l.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12734a[AbstractC0966l.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static native void setActive();

    public static native void setHidden();

    public static native void setInactive();

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NonNull InterfaceC0980s interfaceC0980s, @NonNull AbstractC0966l.a aVar) {
        int i10 = C3348a.f12734a[aVar.ordinal()];
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
