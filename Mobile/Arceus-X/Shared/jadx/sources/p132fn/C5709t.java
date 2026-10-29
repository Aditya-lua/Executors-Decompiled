package p132fn;

import android.content.Context;
import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.camera.C3405e;
import p136ft.InterfaceC5835i;
import p276ln.InterfaceC8169a;
import p391qq.C10700c;

/* JADX INFO: renamed from: fn.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C5709t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f21940a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC8169a> f21941b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10700c> f21942c;

    public C5709t(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC8169a> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        this.f21940a = interfaceC5835i;
        this.f21941b = interfaceC5835i2;
        this.f21942c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C5709t m25880a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC8169a> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        return new C5709t(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3405e m25881c(Context context, InterfaceC8169a interfaceC8169a, C10700c c10700c, C3402b c3402b, PreviewView previewView, InterfaceC5707s interfaceC5707s, boolean z10) {
        return new C3405e(context, interfaceC8169a, c10700c, c3402b, previewView, interfaceC5707s, z10);
    }

    /* JADX INFO: renamed from: b */
    public C3405e m25882b(C3402b c3402b, PreviewView previewView, InterfaceC5707s interfaceC5707s, boolean z10) {
        return m25881c(this.f21940a.get(), this.f21941b.get(), this.f21942c.get(), c3402b, previewView, interfaceC5707s, z10);
    }
}
