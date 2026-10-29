package p285m4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0980s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p300n4.C8882b;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8422a {

    /* JADX INFO: renamed from: m4.a$a */
    public interface a<D> {
        /* JADX INFO: renamed from: a */
        void mo22452a(@NonNull C8882b<D> c8882b, D d10);

        @NonNull
        /* JADX INFO: renamed from: b */
        C8882b<D> mo22453b(int i10, Bundle bundle);

        /* JADX INFO: renamed from: c */
        void mo22454c(@NonNull C8882b<D> c8882b);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC0980s & InterfaceC0947c1> AbstractC8422a m34114b(@NonNull T t8) {
        return new C8423b(t8, t8.mo4712w());
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public abstract void mo34115a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract <D> C8882b<D> mo34116c(int i10, Bundle bundle, @NonNull a<D> aVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo34117d();
}
