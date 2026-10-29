package p481v1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: renamed from: v1.a */
/* JADX INFO: loaded from: classes.dex */
public class C11993a implements InterfaceC11995c {
    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: a */
    public float mo44748a(InterfaceC11994b interfaceC11994b) {
        return m44763p(interfaceC11994b).m44767d();
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: b */
    public float mo44749b(InterfaceC11994b interfaceC11994b) {
        return mo44748a(interfaceC11994b) * 2.0f;
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: c */
    public void mo44750c(InterfaceC11994b interfaceC11994b, ColorStateList colorStateList) {
        m44763p(interfaceC11994b).m44769f(colorStateList);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: d */
    public float mo44751d(InterfaceC11994b interfaceC11994b) {
        return interfaceC11994b.mo2436f().getElevation();
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: e */
    public void mo44752e(InterfaceC11994b interfaceC11994b, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        interfaceC11994b.mo2432b(new C11996d(colorStateList, f10));
        View viewMo2436f = interfaceC11994b.mo2436f();
        viewMo2436f.setClipToOutline(true);
        viewMo2436f.setElevation(f11);
        mo44753f(interfaceC11994b, f12);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: f */
    public void mo44753f(InterfaceC11994b interfaceC11994b, float f10) {
        m44763p(interfaceC11994b).m44770g(f10, interfaceC11994b.mo2433c(), interfaceC11994b.mo2435e());
        mo44759l(interfaceC11994b);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: g */
    public ColorStateList mo44754g(InterfaceC11994b interfaceC11994b) {
        return m44763p(interfaceC11994b).m44765b();
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: h */
    public float mo44755h(InterfaceC11994b interfaceC11994b) {
        return mo44748a(interfaceC11994b) * 2.0f;
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: i */
    public float mo44756i(InterfaceC11994b interfaceC11994b) {
        return m44763p(interfaceC11994b).m44766c();
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: j */
    public void mo44757j(InterfaceC11994b interfaceC11994b) {
        mo44753f(interfaceC11994b, mo44756i(interfaceC11994b));
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: k */
    public void mo44758k(InterfaceC11994b interfaceC11994b, float f10) {
        interfaceC11994b.mo2436f().setElevation(f10);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: l */
    public void mo44759l(InterfaceC11994b interfaceC11994b) {
        if (!interfaceC11994b.mo2433c()) {
            interfaceC11994b.mo2431a(0, 0, 0, 0);
            return;
        }
        float fMo44756i = mo44756i(interfaceC11994b);
        float fMo44748a = mo44748a(interfaceC11994b);
        int iCeil = (int) Math.ceil(C11997e.m44773a(fMo44756i, fMo44748a, interfaceC11994b.mo2435e()));
        int iCeil2 = (int) Math.ceil(C11997e.m44774b(fMo44756i, fMo44748a, interfaceC11994b.mo2435e()));
        interfaceC11994b.mo2431a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: m */
    public void mo44760m(InterfaceC11994b interfaceC11994b) {
        mo44753f(interfaceC11994b, mo44756i(interfaceC11994b));
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: n */
    public void mo44761n(InterfaceC11994b interfaceC11994b, float f10) {
        m44763p(interfaceC11994b).m44771h(f10);
    }

    @Override // p481v1.InterfaceC11995c
    /* JADX INFO: renamed from: o */
    public void mo44762o() {
    }

    /* JADX INFO: renamed from: p */
    public final C11996d m44763p(InterfaceC11994b interfaceC11994b) {
        return (C11996d) interfaceC11994b.mo2434d();
    }
}
