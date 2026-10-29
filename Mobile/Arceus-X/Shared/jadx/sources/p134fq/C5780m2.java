package p134fq;

import android.content.Context;
import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3875e;
import com.withpersona.sdk2.inquiry.selfie.C3953e;
import com.withpersona.sdk2.inquiry.selfie.C3955g;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import hn.C6434c;
import p059cq.C4197b;
import p083dq.C4658a;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p391qq.C10700c;
import p475uq.C11930a;
import tr.C11742b;

/* JADX INFO: renamed from: fq.m2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5780m2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f22143a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C4197b.a> f22144b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C11742b.a> f22145c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<C3953e.b> f22146d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5835i<C3875e.a> f22147e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5835i<C3405e.a> f22148f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5835i<C6434c.a> f22149g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5835i<InterfaceC8169a> f22150h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5835i<C11930a> f22151i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5835i<DirectFileUploader> f22152j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5835i<InterfaceC7906p0> f22153k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5835i<C4658a.b> f22154l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC5835i<C3955g> f22155m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5835i<C6159e> f22156n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC5835i<C10700c> f22157o;

    public C5780m2(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4197b.a> interfaceC5835i2, InterfaceC5835i<C11742b.a> interfaceC5835i3, InterfaceC5835i<C3953e.b> interfaceC5835i4, InterfaceC5835i<C3875e.a> interfaceC5835i5, InterfaceC5835i<C3405e.a> interfaceC5835i6, InterfaceC5835i<C6434c.a> interfaceC5835i7, InterfaceC5835i<InterfaceC8169a> interfaceC5835i8, InterfaceC5835i<C11930a> interfaceC5835i9, InterfaceC5835i<DirectFileUploader> interfaceC5835i10, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i11, InterfaceC5835i<C4658a.b> interfaceC5835i12, InterfaceC5835i<C3955g> interfaceC5835i13, InterfaceC5835i<C6159e> interfaceC5835i14, InterfaceC5835i<C10700c> interfaceC5835i15) {
        this.f22143a = interfaceC5835i;
        this.f22144b = interfaceC5835i2;
        this.f22145c = interfaceC5835i3;
        this.f22146d = interfaceC5835i4;
        this.f22147e = interfaceC5835i5;
        this.f22148f = interfaceC5835i6;
        this.f22149g = interfaceC5835i7;
        this.f22150h = interfaceC5835i8;
        this.f22151i = interfaceC5835i9;
        this.f22152j = interfaceC5835i10;
        this.f22153k = interfaceC5835i11;
        this.f22154l = interfaceC5835i12;
        this.f22155m = interfaceC5835i13;
        this.f22156n = interfaceC5835i14;
        this.f22157o = interfaceC5835i15;
    }

    /* JADX INFO: renamed from: a */
    public static C5780m2 m26155a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C4197b.a> interfaceC5835i2, InterfaceC5835i<C11742b.a> interfaceC5835i3, InterfaceC5835i<C3953e.b> interfaceC5835i4, InterfaceC5835i<C3875e.a> interfaceC5835i5, InterfaceC5835i<C3405e.a> interfaceC5835i6, InterfaceC5835i<C6434c.a> interfaceC5835i7, InterfaceC5835i<InterfaceC8169a> interfaceC5835i8, InterfaceC5835i<C11930a> interfaceC5835i9, InterfaceC5835i<DirectFileUploader> interfaceC5835i10, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i11, InterfaceC5835i<C4658a.b> interfaceC5835i12, InterfaceC5835i<C3955g> interfaceC5835i13, InterfaceC5835i<C6159e> interfaceC5835i14, InterfaceC5835i<C10700c> interfaceC5835i15) {
        return new C5780m2(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8, interfaceC5835i9, interfaceC5835i10, interfaceC5835i11, interfaceC5835i12, interfaceC5835i13, interfaceC5835i14, interfaceC5835i15);
    }

    /* JADX INFO: renamed from: c */
    public static C5772k2 m26156c(SelfieWorkflow.Input input, C0967l0 c0967l0, Context context, C4197b.a aVar, C11742b.a aVar2, C3953e.b bVar, C3875e.a aVar3, C3405e.a aVar4, C6434c.a aVar5, InterfaceC8169a interfaceC8169a, C11930a c11930a, DirectFileUploader directFileUploader, InterfaceC7906p0 interfaceC7906p0, C4658a.b bVar2, C3955g c3955g, C6159e c6159e, C10700c c10700c) {
        return new C5772k2(input, c0967l0, context, aVar, aVar2, bVar, aVar3, aVar4, aVar5, interfaceC8169a, c11930a, directFileUploader, interfaceC7906p0, bVar2, c3955g, c6159e, c10700c);
    }

    /* JADX INFO: renamed from: b */
    public C5772k2 m26157b(SelfieWorkflow.Input input, C0967l0 c0967l0) {
        return m26156c(input, c0967l0, this.f22143a.get(), this.f22144b.get(), this.f22145c.get(), this.f22146d.get(), this.f22147e.get(), this.f22148f.get(), this.f22149g.get(), this.f22150h.get(), this.f22151i.get(), this.f22152j.get(), this.f22153k.get(), this.f22154l.get(), this.f22155m.get(), this.f22156n.get(), this.f22157o.get());
    }
}
