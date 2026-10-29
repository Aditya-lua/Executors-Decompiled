package com.withpersona.sdk2.camera;

import androidx.camera.view.PreviewView;
import p132fn.C5709t;
import p132fn.InterfaceC5707s;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3406f implements C3405e.a {

    /* JADX INFO: renamed from: a */
    public final C5709t f12952a;

    public C3406f(C5709t c5709t) {
        this.f12952a = c5709t;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3405e.a> m16231b(C5709t c5709t) {
        return C5831e.m26182a(new C3406f(c5709t));
    }

    @Override // com.withpersona.sdk2.camera.C3405e.a
    /* JADX INFO: renamed from: a */
    public C3405e mo16229a(C3402b c3402b, PreviewView previewView, InterfaceC5707s interfaceC5707s, boolean z10) {
        return this.f12952a.m25882b(c3402b, previewView, interfaceC5707s, z10);
    }
}
