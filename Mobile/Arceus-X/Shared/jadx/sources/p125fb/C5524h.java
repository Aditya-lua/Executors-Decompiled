package p125fb;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import p242k9.AbstractC7495e;

/* JADX INFO: renamed from: fb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5524h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5541m f21299a;

    public C5524h(InterfaceC5541m interfaceC5541m) {
        this.f21299a = interfaceC5541m;
    }

    /* JADX INFO: renamed from: a */
    public static C5524h m25187a(Application application) {
        return new C5524h(C5547o.m25217a(application));
    }

    /* JADX INFO: renamed from: b */
    public final Task m25188b(final InterfaceC5520g interfaceC5520g) {
        Objects.requireNonNull(interfaceC5520g);
        return this.f21299a.mo25159a(new InterfaceC5538l() { // from class: fb.f
            @Override // p125fb.InterfaceC5538l
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Task mo25173a(AbstractC7495e abstractC7495e) {
                return interfaceC5520g.mo25178a(abstractC7495e);
            }
        });
    }
}
